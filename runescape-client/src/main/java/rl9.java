import net.runelite.api.ParamHolder;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl9")
@Implements({"ParamHolder"})
public interface rl9 extends ParamHolder {
	@ObfuscatedName("setValue")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	default void setValue(int var1, int var2) {
		try {
			this.zv(var1, new vl(var2));
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getStringValue")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	@Override
	default String getStringValue(int var1) {
		try {
			vw var2 = this.bd(var1);
			if (var2 != null) {
				uj var7 = (uj)var2;
				return (String)(String)var7.gb();
			} else {
				px var3 = og.ci_fld.pn(var1);
				yq var4 = yq.jw(var3.ah_fld);
				if (var4 != yq.az_fld) {
					throw new IllegalArgumentException("trying to get string from " + var4 + " param");
				} else {
					return var3.qg();
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("setValue")
	@ObfuscatedSignature(
		descriptor = "(IJ)V"
	)
	@Override
	default void setValue(int var1, long var2) {
		try {
			this.zv(var1, new vk(var2));
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("getLongValue")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	@Override
	default long getLongValue(int var1) {
		try {
			vw var2 = this.bd(var1);
			if (var2 != null) {
				uj var7 = (uj)var2;
				return (Long)var7.gb();
			} else {
				px var3 = og.ci_fld.pn(var1);
				yq var4 = yq.jw(var3.ah_fld);
				if (var4 != yq.ag_fld) {
					throw new IllegalArgumentException("trying to get long from " + var4 + " param");
				} else {
					return var3.qp();
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("zv")
	@ObfuscatedSignature(
		descriptor = "(ILvw;)V"
	)
	default void zv(int var1, vw var2) {
		try {
			px var3 = og.ci_fld.pn(var1);
			yq var4 = yq.jw(var3.ah_fld);
			if (var2 instanceof vl && var4 != yq.ak_fld) {
				throw new IllegalArgumentException("trying to put int into " + var4 + " param");
			} else if (var2 instanceof vk && var4 != yq.ag_fld) {
				throw new IllegalArgumentException("trying to put long into " + var4 + " param");
			} else if (var2 instanceof uj && var4 != yq.az_fld) {
				throw new IllegalArgumentException("trying to put string into " + var4 + " param");
			} else {
				if (this.getParams() == null) {
					this.us(new xv(16));
				}

				this.getParams().put(var2, var1);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("setValue")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	@Override
	default void setValue(int var1, String var2) {
		try {
			this.zv(var1, new uj(var2));
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Lvw;"
	)
	default vw bd(int var1) {
		return this.getParams() == null ? null : (vw)this.getParams().get(var1);
	}

	@ObfuscatedName("getIntValue")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	default int getIntValue(int var1) {
		try {
			vw var2 = this.bd(var1);
			if (var2 != null) {
				vl var7 = (vl)var2;
				return var7.getValue();
			} else {
				px var3 = og.ci_fld.pn(var1);
				yq var4 = yq.jw(var3.ah_fld);
				if (var4 != yq.ak_fld) {
					throw new IllegalArgumentException("trying to get int from " + var4 + " param");
				} else {
					return var3.zw();
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	void us(xv var1);
}
