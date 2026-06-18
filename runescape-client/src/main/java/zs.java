import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zs")
public abstract class zs {
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv hw_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public abstract void al(byte[] var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	abstract byte[] ag(int var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Z)[B"
	)
	public static byte[] ae(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])var0;
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof zs) {
			zs var2 = (zs)var0;
			return var2.ag(-2121716164);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Z)[B"
	)
	public static byte[] av(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])var0;
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof zs) {
			zs var2 = (zs)var0;
			return var2.ag(-1851135624);
		} else {
			throw new IllegalArgumentException();
		}
	}

	zs() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Z)[B"
	)
	public static byte[] ah(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])var0;
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof zs) {
			zs var2 = (zs)var0;
			return var2.ag(-1478358422);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public abstract void af(byte[] var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	abstract byte[] aw();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	abstract byte[] ay();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	abstract byte[] ar();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	abstract byte[] as();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BB)V"
	)
	public abstract void az(byte[] var1, byte var2);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public abstract void au(byte[] var1);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public abstract void ax(byte[] var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public abstract void an(byte[] var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)I"
	)
	public static int ae(sl var0) {
		om.ap(var0, null, false, (byte)0);
		byte var2 = 0;
		int var3 = var0.av();
		int var4 = -1;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var5 = var0.ak();

			for (int var6 = var2; var6 < var3; var6++) {
				if (var4 == -1 || var5[var6] < var5[var4]) {
					var4 = var6;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var9 = sl.ob(var0, 212580981);

			for (int var11 = var2; var11 < var3; var11++) {
				if (-1 == var4 || var9[var11] < var9[var4]) {
					var4 = var11;
				}
			}
		} else if (yq.az_fld == var0.ag_fld) {
			String var10 = null;
			Object[] var12 = (Object[])var0.az();

			for (int var7 = var2; var7 < var3; var7++) {
				String var8 = (String)var12[var7];
				if (-1 == var4 || var8 != null && var8.compareTo(var10) < 0) {
					var4 = var7;
					var10 = var8;
				}
			}
		}

		return var4;
	}
}
