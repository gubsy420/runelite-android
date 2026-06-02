package net.runelite.awt.impl;

import android.graphics.Typeface;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Process-wide registry mapping AWT {@link java.awt.Font#getFamily() font family names}
 * to Android {@link Typeface} handles. Populated when shadow {@code Font.createFont(int,
 * InputStream)} is called — RuneLite loads runescape.ttf / runescape_bold.ttf this way,
 * then references the loaded fonts later via {@code new Font(family, style, size)}.
 *
 * Without this, the shadow {@code Font.createFont} drained the stream and returned a
 * default Font, so every "runescape" lookup later in the rendering path fell back to
 * Android's {@code Typeface.DEFAULT} (i.e. Roboto) — meaning none of the in-game UI
 * fonts looked right.
 *
 * Family name is parsed from the TTF/OTF 'name' table (Windows Unicode BMP record,
 * nameID=1). If parsing fails we fall back to a synthetic "rl-font-N" name; that
 * still works for lookup as long as the caller holds onto {@code font.getFamily()}.
 */
public final class AwtFontRegistry
{
	private static final String TAG = "AwtFontRegistry";

	private static final ConcurrentHashMap<String, Typeface> FAMILIES = new ConcurrentHashMap<>();
	private static final AtomicInteger SYNTHETIC_COUNTER = new AtomicInteger();

	private AwtFontRegistry() {}

	/** Read {@code in} fully, write to a temp file, load as Typeface, and register
	 *  under whatever family name the TTF declares (or a synthetic fallback).
	 *  Returns the registered family name; null on failure. */
	public static String register(InputStream in)
	{
		if (in == null) {
			Log.w(TAG, "font: register called with null stream — getResourceAsStream missed in classpath?");
			return null;
		}
		byte[] bytes;
		try
		{
			bytes = readAll(in);
		}
		catch (IOException ex)
		{
			Log.w(TAG, "font: failed to read stream", ex);
			return null;
		}
		if (bytes.length < 12) {
			Log.w(TAG, "font: stream produced only " + bytes.length + " bytes — not a valid TTF");
			return null;
		}
		Log.i(TAG, "font: read " + bytes.length + " bytes from stream");

		String family = parseFamilyName(bytes);
		String subfamily = parseSubfamilyName(bytes);
		if (family == null) family = "rl-font-" + SYNTHETIC_COUNTER.incrementAndGet();
		// Compose a unique key per file: RuneLite ships runescape.ttf + runescape_bold.ttf
		// both with Family="RuneScape" and only differing in Subfamily ("Regular"/"Bold").
		// Without this, the bold TTF gets silently dropped because the family name was
		// already taken — meaning runescapeBoldFont renders in the regular face. Strip
		// the subfamily when it's the trivial "Regular"/"Plain" so the primary face
		// stays at the bare family name (what desktop OpenJDK reports).
		if (subfamily != null && !subfamily.isEmpty()
			&& !subfamily.equalsIgnoreCase("Regular")
			&& !subfamily.equalsIgnoreCase("Plain")
			&& !subfamily.equalsIgnoreCase("Book")
			&& !subfamily.equalsIgnoreCase("Normal"))
		{
			// Avoid double-suffix when Family already ends in the same word ("RuneScape Small").
			if (!family.toLowerCase().endsWith(" " + subfamily.toLowerCase()))
			{
				family = family + " " + subfamily;
			}
		}

		// Re-registering the same family is a no-op — RuneLite's FontManager runs
		// createFont in a static block, so each process start hits this path once
		// per font. Reuse the existing Typeface rather than rewriting the temp file.
		if (FAMILIES.containsKey(family)) return family;

		Typeface tf = loadTypeface(bytes, family);
		if (tf == null) return null;
		FAMILIES.put(family, tf);
		Log.i(TAG, "font: registered \"" + family + "\" (" + bytes.length + " bytes)");
		return family;
	}

	private static final java.util.Set<String> WARNED = java.util.Collections.synchronizedSet(new java.util.HashSet<>());

	/** Lookup; returns null when {@code family} isn't a registered TTF. Tries an
	 *  exact match first, then case-insensitive, then a startswith probe (e.g. RL
	 *  may pass "RuneScape" while the TTF registered itself as "RuneScape Plain").
	 *  Falls back to the primary "RuneScape" registration when nothing else matches
	 *  so generic AWT/Swing fonts (Dialog, Helvetica, SansSerif, …) still render in
	 *  the OSRS face on Android instead of Roboto. Logs the miss once per family
	 *  so it's easy to spot in logcat. */
	public static Typeface lookup(String family)
	{
		if (family == null) return null;
		Typeface t = FAMILIES.get(family);
		if (t != null) return t;
		// case-insensitive
		for (java.util.Map.Entry<String, Typeface> e : FAMILIES.entrySet())
		{
			if (e.getKey().equalsIgnoreCase(family)) return e.getValue();
		}
		// substring / prefix
		String fl = family.toLowerCase();
		for (java.util.Map.Entry<String, Typeface> e : FAMILIES.entrySet())
		{
			String kl = e.getKey().toLowerCase();
			if (kl.startsWith(fl) || fl.startsWith(kl)) return e.getValue();
		}
		if (WARNED.add(family))
		{
			Log.w(TAG, "font: lookup miss for \"" + family + "\" (registered=" + FAMILIES.keySet() + "), falling back to primary");
		}
		// Last-resort: hand back whichever primary RS face is registered (prefer
		// the unstyled "RuneScape" if available; otherwise any registered TTF).
		// This trades strict fidelity for "the screen looks like OSRS" on Android.
		Typeface primary = FAMILIES.get("RuneScape");
		if (primary != null) return primary;
		java.util.Iterator<Typeface> it = FAMILIES.values().iterator();
		return it.hasNext() ? it.next() : null;
	}

	private static byte[] readAll(InputStream in) throws IOException
	{
		ByteArrayOutputStream out = new ByteArrayOutputStream(64 * 1024);
		byte[] buf = new byte[8192];
		int n;
		while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
		return out.toByteArray();
	}

	private static Typeface loadTypeface(byte[] bytes, String family)
	{
		File f = null;
		try
		{
			f = File.createTempFile("rl-font-", ".ttf");
			f.deleteOnExit();
			try (FileOutputStream os = new FileOutputStream(f))
			{
				os.write(bytes);
			}
			return Typeface.createFromFile(f);
		}
		catch (Throwable t)
		{
			Log.w(TAG, "font: typeface load failed for \"" + family + "\"", t);
			if (f != null) try { f.delete(); } catch (Throwable ignored) {}
			return null;
		}
	}

	// ---------------------------------------------------------------------------
	// TTF/OTF 'name' table parser — extracts the family name. Spec:
	//   https://learn.microsoft.com/en-us/typography/opentype/spec/name
	// ---------------------------------------------------------------------------

	private static String parseFamilyName(byte[] bytes)    { return parseName(bytes, 1); }
	private static String parseSubfamilyName(byte[] bytes) { return parseName(bytes, 2); }

	private static String parseName(byte[] bytes, int wantNameId)
	{
		ByteBuffer bb = ByteBuffer.wrap(bytes).order(ByteOrder.BIG_ENDIAN);
		// Offset Table: sfntVersion(u32), numTables(u16), searchRange(u16),
		// entrySelector(u16), rangeShift(u16).
		try
		{
			bb.position(0);
			bb.getInt(); // sfntVersion
			int numTables = bb.getShort() & 0xFFFF;
			bb.position(bb.position() + 6); // skip 3 × u16

			int nameOffset = -1;
			for (int i = 0; i < numTables; i++)
			{
				int tag = bb.getInt();
				bb.getInt(); // checksum
				int offset = bb.getInt();
				bb.getInt(); // length
				if (tag == 0x6E616D65 /* 'name' */)
				{
					nameOffset = offset;
					break;
				}
			}
			if (nameOffset < 0) return null;

			// 'name' table header: format(u16), count(u16), stringOffset(u16)
			bb.position(nameOffset);
			bb.getShort(); // format
			int count = bb.getShort() & 0xFFFF;
			int stringOffset = bb.getShort() & 0xFFFF;
			int storageBase = nameOffset + stringOffset;

			// Pass 1: Windows + Unicode BMP record (platformID=3 encodingID=1) — the
			// canonical Windows-side name. Pass 2: Macintosh Roman fallback.
			for (int pass = 0; pass < 2; pass++)
			{
				int wantPlatform = (pass == 0) ? 3 : 1;
				int wantEncoding = (pass == 0) ? 1 : 0;
				for (int i = 0; i < count; i++)
				{
					int recOff = nameOffset + 6 + i * 12;
					bb.position(recOff);
					int platformID = bb.getShort() & 0xFFFF;
					int encodingID = bb.getShort() & 0xFFFF;
					bb.getShort(); // languageID
					int nameID = bb.getShort() & 0xFFFF;
					int length = bb.getShort() & 0xFFFF;
					int sOff = bb.getShort() & 0xFFFF;
					if (nameID != wantNameId) continue;
					if (platformID != wantPlatform || encodingID != wantEncoding) continue;
					int start = storageBase + sOff;
					if (start + length > bytes.length) continue;
					String name = (pass == 0)
						? new String(bytes, start, length, java.nio.charset.StandardCharsets.UTF_16BE)
						: new String(bytes, start, length, java.nio.charset.StandardCharsets.ISO_8859_1);
					if (!name.isEmpty()) return name;
				}
			}
		}
		catch (Throwable t)
		{
			Log.w(TAG, "font: name-table parse failed", t);
		}
		return null;
	}
}
