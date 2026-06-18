import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wd")
public class wd extends tq implements tr {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1602779971
	)
	int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	ir ag_fld = new ir(64);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Ltk;"
	)
	tk au(int var1) throws EOFException {
		byte[] var3 = this.az_fld.bb(this.av_fld, var1, 584982574);
		tk var4 = new tk(var1);
		if (null != var3) {
			td.ih(var4, new xi(var3), (byte)-106);
		}

		return var4;
	}

	public wd(ju var1, int var2, xh var3, ub var4) {
		super(var1, var3, var4 != null ? var4.ce(var2, 1528927455) : 0);
		this.az_fld = var4;
		this.av_fld = var2;
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
	@Override
	public Iterator iterator() {
		return new wb(this);
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lwd;)Ljava/util/Iterator;"
	)
	public static Iterator gu(wd var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return new wb(var0);
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Lwd;)V"
	)
	public static void jd(wd var0) {
		synchronized (var0.ag_fld) {
			var0.ag_fld.aw();
		}
	}

	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "(Lwd;I)V"
	)
	public static void vk(wd var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (var0.ag_fld) {
			var0.ag_fld.aw();
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cc() {
		return new wb(this);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltd;"
	)
	@Override
	protected td ak(int var1, byte var2) throws EOFException {
		synchronized (this.ag_fld) {
			tk var3 = (tk)(tk)this.ag_fld.ak(var1);
			if (var3 == null) {
				var3 = this.au(var1);
				this.ag_fld.av(var3, var1);
			}

			return var3;
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean ei(da var0) {
		return var0.cg_fld.az_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ltk;"
	)
	tk an(int var1) throws EOFException {
		byte[] var2 = this.az_fld.bb(this.av_fld, var1, 584982574);
		tk var3 = new tk(var1);
		if (null != var2) {
			td.ih(var3, new xi(var2), (byte)81);
		}

		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ltd;"
	)
	@Override
	protected td ae(int var1) throws EOFException {
		synchronized (this.ag_fld) {
			tk var2 = (tk)(tk)this.ag_fld.ak(var1);
			if (var2 == null) {
				var2 = this.au(var1);
				this.ag_fld.av(var2, var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ax(int var1) {
		synchronized (this.ag_fld) {
			this.ag_fld.aw();
		}
	}

	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "(Lsc;C)Z"
	)
	public static boolean wv(sc var0, char var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ar(var1) && (var0.ay_fld[var1] == 1 || var0.ay_fld[var1] == 3);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cd() {
		return new wb(this);
	}
}
