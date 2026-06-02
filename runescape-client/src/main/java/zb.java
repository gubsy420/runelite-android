import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zb")
public class zb {
	@ObfuscatedGetter(
		longValue = 3447935651466802269L
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "J"
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
	@ObfuscatedGetter(
		longValue = 4011219091275892421L
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	final void ag(long var1) throws IOException {
		this.az_fld.seek(var1);
		this.av_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void av() throws IOException {
		this.ae(false);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
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
		descriptor = "()J"
	)
	public final long ah() throws IOException {
		return this.az_fld.length();
	}

	@ObfuscatedName("finalize")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void finalize() throws Throwable, IOException {
		if (null != this.az_fld) {
			this.av();
		}
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

	@ObfuscatedName("acq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acq() throws Throwable, IOException {
		if (null != this.az_fld) {
			this.av();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/File;"
	)
	final File ak() {
		return this.ak_fld;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void ez(byte[] var1, int var2, int var3) throws EOFException, IOException {
		this.az(var1, var2, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public final long ab() throws IOException {
		return this.az_fld.length();
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/File;"
	)
	final File ay() {
		return this.ak_fld;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lzb;[BII)V"
	)
	public static void cb(zb var0, byte[] var1, int var2, int var3) throws IOException, EOFException {
		if (var3 + var0.av_fld > var0.ag_fld) {
			var0.az_fld.seek(var0.ag_fld);
			var0.az_fld.write(1);
			throw new EOFException();
		} else {
			var0.az_fld.write(var1, var2, var3);
			var0.av_fld += -6961563635045105675L * var3;
		}
	}

	@ObfuscatedName("zd")
	@ObfuscatedSignature(
		descriptor = "(Lzb;[BII)V"
	)
	public static void zd(zb var0, byte[] var1, int var2, int var3) throws IOException, EOFException {
		if (var3 + var0.av_fld > var0.ag_fld) {
			var0.az_fld.seek(var0.ag_fld);
			var0.az_fld.write(1);
			throw new EOFException();
		} else {
			var0.az_fld.write(var1, var2, var3);
			var0.av_fld += -6961563635045105675L * var3;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	final void al(long var1) throws IOException {
		this.az_fld.seek(var1);
		this.av_fld = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	final void au(long var1) throws IOException {
		this.az_fld.seek(var1);
		this.av_fld = var1;
	}

	@ObfuscatedName("acc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acc() throws Throwable, IOException {
		if (null != this.az_fld) {
			this.av();
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

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void sn(byte[] var1, int var2, int var3) throws EOFException, IOException {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ai() throws IOException {
		this.ae(false);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public final void am(boolean var1) throws IOException {
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

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Lzb;J)V"
	)
	public static void jl(zb var0, long var1) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

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

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long ln() throws IOException {
		return this.ah();
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

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void tl(boolean var1) throws IOException {
		this.ae(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public final long at() throws IOException {
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

	@ObfuscatedName("xa")
	@ObfuscatedSignature(
		descriptor = "(Lzb;)V"
	)
	public static void xa(zb var0) throws Throwable, IOException {
		if (null != var0.az_fld) {
			var0.av();
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void iv(long var1) throws IOException {
		this.ag(var1);
	}

	@ObfuscatedName("yy")
	@ObfuscatedSignature(
		descriptor = "(Lku;)I"
	)
	public static int yy(ku var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aa_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lzb;[BII)V"
	)
	public static void cd(zb var0, byte[] var1, int var2, int var3) throws IOException, EOFException {
		if (var3 + var0.av_fld > var0.ag_fld) {
			var0.az_fld.seek(var0.ag_fld);
			var0.az_fld.write(1);
			throw new EOFException();
		} else {
			var0.az_fld.write(var1, var2, var3);
			var0.av_fld += -6961563635045105675L * var3;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)Lac;"
	)
	public static ac bi(wj var0) {
		return var0.ak_fld;
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

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lzb;[BII)I"
	)
	public static int fd(zb var0, byte[] var1, int var2, int var3) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		int var5 = var0.az_fld.read(var1, var2, var3);
		if (var5 > 0) {
			var0.av_fld += -6961563635045105675L * var5;
		}

		return var5;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	final void af(long var1) throws IOException {
		this.az_fld.seek(var1);
		this.av_fld = var1;
	}
}
