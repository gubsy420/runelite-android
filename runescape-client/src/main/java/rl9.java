import net.runelite.api.ParamHolder;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl9")
@Implements({"ParamHolder"})
public interface rl9 extends ParamHolder {
	@ObfuscatedName("setValue")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	@Export("setValue")
	@Override
	default void setValue(int var1, String var2) {
		try {
			this.te(var1, new uj(var2));
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getIntValue")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Export("getIntValue")
	@Override
	default int getIntValue(int var1) {
		try {
			vw var2 = this.ag(var1);
			if (var2 != null) {
				vl var7 = (vl)var2;
				return var7.getValue();
			} else {
				px var3 = og.ci_fld.hr(var1);
				yq var4 = yq.nm(var3.ah_fld);
				if (var4 != yq.ak_fld) {
					throw new IllegalArgumentException("trying to get int from " + var4 + " param");
				} else {
					return var3.an();
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lvw;"
	)
	default vw ag(int var1) {
		return this.getParams() == null ? null : (vw)this.getParams().get(var1);
	}

	@ObfuscatedName("getLongValue")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	@Export("getLongValue")
	@Override
	default long getLongValue(int var1) {
		try {
			vw var2 = this.ag(var1);
			if (var2 != null) {
				uj var7 = (uj)var2;
				return (Long)var7.ht();
			} else {
				px var3 = og.ci_fld.hr(var1);
				yq var4 = yq.nm(var3.ah_fld);
				if (var4 != yq.ag_fld) {
					throw new IllegalArgumentException("trying to get long from " + var4 + " param");
				} else {
					return var3.eg();
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	void jh(xv var1);

	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "(ILvw;)V"
	)
	default void te(int var1, vw var2) {
		try {
			px var3 = og.ci_fld.hr(var1);
			yq var4 = yq.nm(var3.ah_fld);
			if (var2 instanceof vl && var4 != yq.ak_fld) {
				throw new IllegalArgumentException("trying to put int into " + var4 + " param");
			} else if (var2 instanceof vk && var4 != yq.ag_fld) {
				throw new IllegalArgumentException("trying to put long into " + var4 + " param");
			} else if (var2 instanceof uj && var4 != yq.az_fld) {
				throw new IllegalArgumentException("trying to put string into " + var4 + " param");
			} else {
				if (this.getParams() == null) {
					this.jh(new xv(16));
				}

				this.getParams().put(var2, var1);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("setValue")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Export("setValue")
	@Override
	default void setValue(int var1, int var2) {
		try {
			this.te(var1, new vl(var2));
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("setValue")
	@ObfuscatedSignature(
		descriptor = "(IJ)V"
	)
	@Export("setValue")
	@Override
	default void setValue(int var1, long var2) {
		try {
			this.te(var1, new vk(var2));
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("getStringValue")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	@Export("getStringValue")
	@Override
	default String getStringValue(int var1) {
		try {
			vw var2 = this.ag(var1);
			if (var2 != null) {
				uj var7 = (uj)var2;
				return (String)(String)var7.ht();
			} else {
				px var3 = og.ci_fld.hr(var1);
				yq var4 = yq.nm(var3.ah_fld);
				if (var4 != yq.az_fld) {
					throw new IllegalArgumentException("trying to get string from " + var4 + " param");
				} else {
					return var3.mq();
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}
}
