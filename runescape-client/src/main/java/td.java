import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("td")
public abstract class td implements th {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lyq;"
	)
	yq ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bj_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	Object aw() {
		if (this.ak_fld == yq.ak_fld) {
			return 0;
		} else if (this.ak_fld == yq.ag_fld) {
			return -1L;
		} else {
			return yq.az_fld == this.ak_fld ? "" : null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ay(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			ti[] var3 = new ti[]{ti.ag_fld, ti.av_fld, ti.az_fld, ti.ak_fld};
			ti var4 = (ti)ka.ak(var3, var2);
			if (null != var4) {
				switch (var4.ae_fld) {
					case 0:
						var1.ct();
						break;
					case 1:
					default:
						throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
					case 2:
						int var5 = var1.cg();
						this.ak_fld = eu.ag(var5, -1839402635);
						if (this.ak_fld != null) {
							break;
						}

						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
					case 3:
						ky[] var6 = new ky[]{ky.ag_fld, ky.av_fld, ky.az_fld, ky.ak_fld};
						ka.ak(var6, var1.cg());
				}
			} else {
				this.ak(var1, var2, (byte)0);
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ltd;Lxi;B)V"
	)
	public static void ih(td var0, xi var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			ti[] var4 = new ti[]{ti.ag_fld, ti.av_fld, ti.az_fld, ti.ak_fld};
			ti var5 = (ti)ka.ak(var4, var3);
			if (null != var5) {
				switch (var5.ae_fld) {
					case 0:
						var1.ct();
						break;
					case 1:
					default:
						throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var5);
					case 2:
						int var6 = var1.cg();
						var0.ak_fld = eu.ag(var6, -1779856707);
						if (var0.ak_fld == null) {
							throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
						}
						break;
					case 3:
						ky[] var7 = new ky[]{ky.ag_fld, ky.av_fld, ky.az_fld, ky.ak_fld};
						ka.ak(var7, var1.cg());
				}
			} else {
				var0.ak(var1, var3, (byte)0);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ar() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	abstract void ag(xi var1, int var2);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	abstract void az(xi var1, int var2);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	abstract void av(xi var1, int var2);

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(Ltd;B)Z"
	)
	public static boolean wf(td var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return null != var0.ak_fld;
	}

	td(int var1) {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void as(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			ti[] var3 = new ti[]{ti.ag_fld, ti.av_fld, ti.az_fld, ti.ak_fld};
			ti var4 = (ti)ka.ak(var3, var2);
			if (null != var4) {
				switch (var4.ae_fld) {
					case 0:
						var1.ct();
						break;
					case 1:
					default:
						throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
					case 2:
						int var5 = var1.cg();
						this.ak_fld = eu.ag(var5, -1837890779);
						if (this.ak_fld != null) {
							break;
						}

						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
					case 3:
						ky[] var6 = new ky[]{ky.ag_fld, ky.av_fld, ky.az_fld, ky.ak_fld};
						ka.ak(var6, var1.cg());
				}
			} else {
				this.ak(var1, var2, (byte)0);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	abstract void ak(xi var1, int var2, byte var3);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean af() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean al() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	Object au() {
		if (this.ak_fld == yq.ak_fld) {
			return 0;
		} else if (this.ak_fld == yq.ag_fld) {
			return -1L;
		} else {
			return yq.az_fld == this.ak_fld ? "" : null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	Object ax() {
		if (this.ak_fld == yq.ak_fld) {
			return 0;
		} else if (this.ak_fld == yq.ag_fld) {
			return -1L;
		} else {
			return yq.az_fld == this.ak_fld ? "" : null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V"
	)
	static void ar(ArrayList var0, boolean var1, int var2) {
		if (!var1) {
			mb.ay_fld.clear();
		}

		Iterator var3 = var0.iterator();

		while (var3.hasNext()) {
			if (var2 != -1299851160) {
				return;
			}

			me var4 = (me)(me)var3.next();
			if (var4.ag_fld != -1 && -1 != var4.az_fld) {
				if (!var1) {
					mb.ay_fld.add(var4);
				}

				mb.az_fld.add(var4);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static void ar(byte var0) {
		vf.mm_fld = null;
		client.mx_fld = null;
		uk.mj_fld = null;
		dv.ja_fld = null;
		oj.ak();
		do_.ar_fld = null;
		ch.as_fld = null;
		ch.ay_fld = null;
	}

	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)[B"
	)
	public static byte[] rs(dj var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	public void ae(xi var1, byte var2) {
		while (true) {
			int var3 = var1.dv();
			if (var3 == 0) {
				return;
			}

			ti[] var4 = new ti[]{ti.av_fld, ti.ak_fld, ti.ak_fld, ti.ag_fld};
			ti var5 = (ti)ka.ak(var4, var3);
			if (null != var5) {
				switch (var5.ah_fld * -42281481) {
					case 0:
						var1.ct();
						break;
					case 1:
					default:
						throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var5);
					case 2:
						int var6 = var1.em();
						this.ak_fld = eu.ag(var6, -1779856707);
						if (this.ak_fld != null) {
							break;
						}

						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
					case 3:
						ky[] var7 = new ky[]{ky.av_fld, ky.av_fld, ky.ak_fld, ky.ag_fld};
						ka.ak(var7, var1.cg());
				}
			} else {
				this.ak(var1, var3, (byte)0);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean ah(byte var1) {
		return null != this.ak_fld;
	}
}
