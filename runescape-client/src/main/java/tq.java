import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tq")
public abstract class tq extends tc implements aaj {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	@Override
	public Object ay(int var1) throws EOFException {
		td var2 = this.ak(var1, (byte)-9);
		return null != var2 && td.le(var2, (byte)32) ? var2.aw() : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ltd;"
	)
	protected abstract td ae(int var1) throws EOFException;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;"
	)
	@Override
	public Object az(int var1, int var2) throws EOFException {
		td var3 = this.ak(var1, (byte)-1);
		return null != var3 && td.le(var3, (byte)-77) ? var3.aw() : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Laaq;"
	)
	public aaq av(xi var1) throws EOFException {
		int var3 = xi.tx(var1, 1615959243);
		td var4 = this.ak(var3, (byte)-90);
		aaq var5 = new aaq(var3);
		Class var6 = var4.ak_fld.aw_fld;
		if (var6 == Integer.class) {
			var5.ag_fld = var1.co();
		} else if (Long.class == var6) {
			var5.ag_fld = xi.ob(var1, -1469718697);
		} else if (String.class == var6) {
			var5.ag_fld = var1.cl();
		} else {
			if (!xd.class.isAssignableFrom(var6)) {
				throw new IllegalStateException();
			}

			try {
				xd var7 = (xd)(xd)var6.newInstance();
				var7.ak(var1, 621095146);
				var5.ag_fld = var7;
			} catch (InstantiationException var8) {
			} catch (IllegalAccessException var9) {
			}
		}

		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltd;"
	)
	protected abstract td ak(int var1, byte var2) throws EOFException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ah() {
		return this.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIIII[I)V"
	)
	public static void az(zv var0, String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			zv.es(var0, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = zv.uv(var0, var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); var11++) {
				var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
				var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
			}

			zv.xy(var0, var1, var2 - var0.an(var1) / 2, var3, var8, var9, var10);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aw() {
		return this.ak_fld;
	}

	protected tq(ju var1, xh var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	@Override
	public Object as(int var1) throws EOFException {
		td var2 = this.ak(var1, (byte)-104);
		return null != var2 && td.le(var2, (byte)-41) ? var2.aw() : null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Laaq;"
	)
	public aaq al(xi var1) throws EOFException {
		int var2 = xi.tx(var1, 1693883716);
		td var3 = this.ak(var2, (byte)-6);
		aaq var4 = new aaq(var2);
		Class var5 = var3.ak_fld.aw_fld;
		if (var5 == Integer.class) {
			var4.ag_fld = var1.co();
		} else if (Long.class == var5) {
			var4.ag_fld = xi.ob(var1, -886322298);
		} else if (String.class == var5) {
			var4.ag_fld = var1.cl();
		} else {
			if (!xd.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				xd var6 = (xd)(xd)var5.newInstance();
				var6.ak(var1, 621095146);
				var4.ag_fld = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Ltq;I)I"
	)
	public static int pc(tq var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Laaq;"
	)
	public aaq af(xi var1) throws EOFException {
		int var2 = xi.tx(var1, 1879302353);
		td var3 = this.ak(var2, (byte)-54);
		aaq var4 = new aaq(var2);
		Class var5 = var3.ak_fld.aw_fld;
		if (var5 == Integer.class) {
			var4.ag_fld = var1.co();
		} else if (Long.class == var5) {
			var4.ag_fld = xi.ob(var1, -531840553);
		} else if (String.class == var5) {
			var4.ag_fld = var1.cl();
		} else {
			if (!xd.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				xd var6 = (xd)(xd)var5.newInstance();
				var6.ak(var1, 621095146);
				var4.ag_fld = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	@Override
	public Object ar(int var1) throws EOFException {
		td var2 = this.ak(var1, (byte)-46);
		return null != var2 && td.le(var2, (byte)34) ? var2.aw() : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		return this.ak_fld;
	}
}
