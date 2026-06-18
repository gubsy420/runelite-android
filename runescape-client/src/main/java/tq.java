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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	@Override
	public Object ar(int var1) throws EOFException {
		td var2 = this.ak(var1, (byte)-9);
		return null != var2 && td.wf(var2, (byte)32) ? var2.aw() : null;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)Z"
	)
	public static boolean ge(yz var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ltd;"
	)
	protected abstract td ae(int var1) throws EOFException;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag() {
		return this.ak_fld;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Ltq;)I"
	)
	public static int hj(tq var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak_fld;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;"
	)
	@Override
	public Object az(int var1, int var2) throws EOFException {
		td var3 = this.ak(var1, (byte)-1);
		return null != var3 && td.wf(var3, (byte)-77) ? var3.aw() : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Laaq;"
	)
	public aaq av(xi var1) throws EOFException {
		int var3 = var1.cm();
		td var4 = this.ak(var3, (byte)-90);
		aaq var5 = new aaq(var3);
		Class var6 = var4.ak_fld.aw_fld;
		if (var6 == Integer.class) {
			var5.ag_fld = var1.co((byte)-33);
		} else if (Long.class == var6) {
			var5.ag_fld = var1.cu();
		} else if (String.class == var6) {
			var5.ag_fld = var1.ct();
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

	protected tq(ju var1, xh var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ltq;)I"
	)
	public static int ls(tq var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	@Override
	public Object ay(int var1) throws EOFException {
		td var2 = this.ak(var1, (byte)-104);
		return null != var2 && td.wf(var2, (byte)-41) ? var2.aw() : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Laaq;"
	)
	public aaq af(xi var1) throws EOFException {
		int var2 = var1.cm();
		td var3 = this.ak(var2, (byte)-54);
		aaq var4 = new aaq(var2);
		Class var5 = var3.ak_fld.aw_fld;
		if (var5 == Integer.class) {
			var4.ag_fld = var1.co((byte)-60);
		} else if (Long.class == var5) {
			var4.ag_fld = var1.cu();
		} else if (String.class == var5) {
			var4.ag_fld = var1.ct();
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	@Override
	public Object as(int var1) throws EOFException {
		td var2 = this.ak(var1, (byte)-46);
		return null != var2 && td.wf(var2, (byte)34) ? var2.aw() : null;
	}

	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "(Ltq;Lxi;)Laaq;"
	)
	public static aaq vu(tq var0, xi var1) throws EOFException {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var2 = var1.cm();
			td var3 = var0.ak(var2, (byte)-6);
			aaq var4 = new aaq(var2);
			Class var5 = var3.ak_fld.aw_fld;
			if (var5 == Integer.class) {
				var4.ag_fld = var1.co((byte)-99);
			} else if (Long.class == var5) {
				var4.ag_fld = var1.cu();
			} else if (String.class == var5) {
				var4.ag_fld = var1.ct();
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
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aw() {
		return this.ak_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Laaq;"
	)
	public aaq al(xi var1) throws EOFException {
		int var2 = var1.dq();
		td var3 = this.ak(var2, (byte)-54);
		aaq var4 = new aaq(var2);
		Class var5 = var3.ak_fld.aw_fld;
		if (var5 == Integer.class) {
			var4.ag_fld = var1.cg();
		} else if (Long.class == var5) {
			var4.ag_fld = var1.cu();
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
}
