import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zb")
public class zb {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 3447935651466802269L
	)
	long av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/io/File;"
	)
	File ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/io/RandomAccessFile;"
	)
	RandomAccessFile az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 4011219091275892421L
	)
	long ag_fld;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BII)I"
	)
	public final int ac(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.az_fld.read(var1, var2, var3);
		if (var4 > 0) {
			this.av_fld += -6961563635045105675L * var4;
		}

		return var4;
	}

	@ObfuscatedName("acl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acl() throws Throwable, IOException {
		if (null != this.az_fld) {
			this.av();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxr;)V"
	)
	public static void ah(xr var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld = var0.ak_fld.az_fld[0].en_fld;
			var0.az_fld = 1;
			var0.ag_fld = null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	public final void az(byte[] var1, int var2, int var3) throws IOException, EOFException {
		if (var3 + this.av_fld > this.ag_fld) {
			this.az_fld.seek(this.ag_fld);
			this.az_fld.write(1);
			throw new EOFException();
		} else {
			this.az_fld.write(var1, var2, var3);
			this.av_fld += -6961563635045105675L * var3;
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Lzb;[BIII)I"
	)
	public static int oe(zb var0, byte[] var1, int var2, int var3) throws IOException {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var5 = var0.az_fld.read(var1, var2, var3);
			if (var5 > 0) {
				var0.av_fld += -6961563635045105675L * var5;
			}

			return var5;
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lzb;J)V"
	)
	public static void hk(zb var0, long var1) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld.seek(var1);
		var0.av_fld = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public final void av() throws IOException {
		this.ae(false);
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Lzb;Z)V"
	)
	public static void wt(zb var0, boolean var1) throws IOException {
		if (var0.az_fld != null) {
			if (var1) {
				try {
					var0.az_fld.getFD().sync();
				} catch (SyncFailedException var3) {
				}
			}

			var0.az_fld.close();
			var0.az_fld = null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public final void ae(boolean var1) throws IOException {
		if (this.az_fld != null) {
			if (var1) {
				try {
					this.az_fld.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}

			this.az_fld.close();
			this.az_fld = null;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)J"
	)
	public final long ah() throws IOException {
		return this.az_fld.length();
	}

	@ObfuscatedName("finalize")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("finalize")
	@Override
	protected void finalize() throws Throwable, IOException {
		if (null != this.az_fld) {
			this.av();
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lzb;[BII)V"
	)
	public static void ks(zb var0, byte[] var1, int var2, int var3) throws IOException, EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var3 + var0.av_fld > var0.ag_fld) {
			var0.az_fld.seek(var0.ag_fld);
			var0.az_fld.write(1);
			throw new EOFException();
		} else {
			var0.az_fld.write(var1, var2, var3);
			var0.av_fld += -6961563635045105675L * var3;
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long fy() throws IOException {
		return this.ah();
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void hf(byte[] var1, int var2, int var3) throws EOFException, IOException {
		this.az(var1, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public final void an(byte[] var1, int var2, int var3) throws IOException, EOFException {
		if (var3 + this.av_fld > this.ag_fld) {
			this.az_fld.seek(this.ag_fld);
			this.az_fld.write(1);
			throw new EOFException();
		} else {
			this.az_fld.write(var1, var2, var3);
			this.av_fld += -6961563635045105675L * var3;
		}
	}

	@ObfuscatedName("acb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acb() throws Throwable, IOException {
		if (null != this.az_fld) {
			this.av();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public final long ap() throws IOException {
		return this.az_fld.length();
	}

	@ObfuscatedName("acu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acu() throws Throwable, IOException {
		if (null != this.az_fld) {
			this.av();
		}
	}

	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "(Lzb;)Ljava/io/File;"
	)
	public static File ty(zb var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/File;"
	)
	final File as() {
		return this.ak_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	final void af(long var1) throws IOException {
		this.az_fld.seek(var1);
		this.av_fld = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	final void al(long var1) throws IOException {
		this.az_fld.seek(var1);
		this.av_fld = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public final void ax(byte[] var1, int var2, int var3) throws IOException, EOFException {
		if (var3 + this.av_fld > this.ag_fld) {
			this.az_fld.seek(this.ag_fld);
			this.az_fld.write(1);
			throw new EOFException();
		} else {
			this.az_fld.write(var1, var2, var3);
			this.av_fld += -6961563635045105675L * var3;
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void fw(byte[] var1, int var2, int var3) throws EOFException, IOException {
		while (var3 > 0) {
			int var4 = this.az_fld.read(var1, var2, var3);
			if (var4 == -1) {
				throw new EOFException();
			}

			this.av_fld = this.av_fld * 3447935651466802269L + var4;
			var2 += var4;
			var3 -= var4;
		}
	}

	@ObfuscatedName("acx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acx() throws Throwable, IOException {
		if (null != this.az_fld) {
			this.av();
		}
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(Lzb;)V"
	)
	public static void qf(zb var0) throws Throwable, IOException {
		if (null != var0.az_fld) {
			var0.av();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public final void ao(boolean var1) throws IOException {
		if (this.az_fld != null) {
			if (var1) {
				try {
					this.az_fld.getFD().sync();
				} catch (SyncFailedException var3) {
				}
			}

			this.az_fld.close();
			this.az_fld = null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ai() throws IOException {
		this.ae(false);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lzb;I)Ljava/io/File;"
	)
	public static File hs(zb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld;
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(Lzb;J)V"
	)
	public static void pq(zb var0, long var1) throws IOException {
		var0.az_fld.seek(var1);
		var0.av_fld = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public final void ad(boolean var1) throws IOException {
		if (this.az_fld != null) {
			if (var1) {
				try {
					this.az_fld.getFD().sync();
				} catch (SyncFailedException var3) {
				}
			}

			this.az_fld.close();
			this.az_fld = null;
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lsc;"
	)
	public static sc dt(lu var0) {
		return var0.hk_fld != null ? var0.hk_fld.az_fld : null;
	}

	public zb(File var1, String var2, long var3) throws IOException, FileNotFoundException {
		if (var3 == -1L) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.az_fld = new RandomAccessFile(var1, var2);
		this.ak_fld = var1;
		this.ag_fld = var3;
		this.av_fld = 0L;
		int var5 = this.az_fld.read();
		if (-1 != var5 && !var2.equals("r")) {
			this.az_fld.seek(0L);
			this.az_fld.write(var5);
		}

		this.az_fld.seek(0L);
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void wx(boolean var1) throws IOException {
		this.ae(var1);
	}

	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void sb(long var1) throws IOException {
		hk(this, var1);
	}

	@ObfuscatedName("acq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acq() throws Throwable, IOException {
		if (null != this.az_fld) {
			this.av();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public final long at() throws IOException {
		return this.az_fld.length();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public final long ab() throws IOException {
		return this.az_fld.length();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/File;"
	)
	final File ar() {
		return this.ak_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BII)I"
	)
	public final int aj(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.az_fld.read(var1, var2, var3);
		if (var4 > 0) {
			this.av_fld += -6961563635045105675L * var4;
		}

		return var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	final void ag(long var1) throws IOException {
		this.az_fld.seek(var1);
		this.av_fld = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIII)I"
	)
	public final int aw(byte[] var1, int var2, int var3, int var4) throws IOException {
		int var5 = this.az_fld.read(var1, var2, var3);
		if (var5 > 0) {
			this.av_fld += -6961563635045105675L * var5;
		}

		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/io/File;"
	)
	final File ak(int var1) {
		return this.ak_fld;
	}
}
