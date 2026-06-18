import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ru")
public class ru {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 776540865
	)
	int aw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	wj ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	pn az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	uv ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lwj;"
	)
	wj[] ae_fld = new wj[8];
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ay_fld = new ArrayList();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	ar ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean av_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	public void av(int var1, int var2, byte var3) throws EOFException {
		Iterator var4 = this.ay_fld.iterator();

		while (var4.hasNext()) {
			wj var5 = (wj)(wj)var4.next();
			if (var5.av() == 0) {
				if (var3 >= 8) {
					return;
				}

				if (var5.ae() != null) {
					this.ag_fld.ag(var5.ae());
				}

				var4.remove();
			} else {
				wj.lm(var5, 1979848000);
			}
		}

		if (null != this.az_fld) {
			for (int var9 = 0; var9 < this.az_fld.ao(); var9++) {
				if (var3 >= 8) {
					return;
				}

				wj var11 = this.ae_fld[var9];
				if (var11 != null && var11.ae() != null) {
					var11.ak(var1, var1, this.az_fld.ay());
					wj.lm(var11, 1947073605);
				} else {
					this.ae_fld[var9] = td(this, this.az_fld.ah(var9), var1, -1);
				}
			}

			if (null != this.ah_fld && this.ah_fld.ae() != null) {
				this.ah_fld.ak(var1, var1, this.az_fld.ay());
				wj.lm(this.ah_fld, 1972802995);
			} else {
				wn var10 = this.az_fld.aw();
				if (var10 != null) {
					if (var3 >= 8) {
						return;
					}

					if (null != var10.ak_fld && (this.aw_fld -= 97156417 * var2) * 776540865 <= 0 && var1 > 0) {
						int var12 = var10.ak_fld[(int)(Math.random() * var10.ak_fld.length)];
						this.ah_fld = td(this, var12, var1, 0);
						if (this.ah_fld != null) {
							if (var3 >= 8) {
								return;
							}

							wj.uv(this.ah_fld, var1, var1, this.az_fld.ay().ae(), this.az_fld.ay().av());
							wj.lm(this.ah_fld, 1998499442);
						}

						int var7 = var10.ag_fld;
						int var8 = var10.az_fld;
						int var6 = var7 + (int)(Math.random() * (var8 - var7));
						this.aw_fld = var6;
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Luv;Lar;I)V"
	)
	public void ak(uv var1, ar var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lpn;ZZI)V"
	)
	public void ag(pn var1, boolean var2, boolean var3, int var4) {
		if (this.az_fld != null) {
			this.az(var2, 1796016238);
		}

		this.az_fld = var1;
		this.av_fld = var3;

		for (int var5 = 0; var5 < var1.ao(); var5++) {
			this.ae_fld[var5] = null;
		}

		if (var1.aw() != null) {
			if (var4 <= -1124625579) {
				return;
			}

			int var7 = var1.aw().ag_fld * -239181913;
			int var8 = var1.aw().az_fld * -1441812743;
			int var6 = var7 + (int)(Math.random() * (var8 - var7));
			this.aw_fld = var6;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void az(boolean var1, int var2) {
		if (this.az_fld != null) {
			for (int var3 = 0; var3 < this.az_fld.ao(); var3++) {
				if (var2 != 1796016238) {
					return;
				}

				if (null != this.ae_fld[var3]) {
					if (var1) {
						this.ah(this.ae_fld[var3]);
					} else if (this.ae_fld[var3].ae() != null) {
						this.ag_fld.ag(this.ae_fld[var3].ae());
					}

					this.ae_fld[var3] = null;
				}
			}

			if (null != this.ah_fld) {
				if (var1) {
					this.ah(this.ah_fld);
				} else if (this.ah_fld.ae() != null) {
					if (var2 != 1796016238) {
						return;
					}

					this.ag_fld.ag(this.ah_fld.ae());
				}

				this.ah_fld = null;
			}

			this.az_fld = null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Luv;Lar;)V"
	)
	public void ay(uv var1, ar var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "(Lru;Z)V"
	)
	public static void rr(ru var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.az_fld != null) {
			for (int var2 = 0; var2 < var0.az_fld.ao(); var2++) {
				if (null != var0.ae_fld[var2]) {
					if (var1) {
						var0.ah(var0.ae_fld[var2]);
					} else if (var0.ae_fld[var2].ae() != null) {
						var0.ag_fld.ag(var0.ae_fld[var2].ae());
					}

					var0.ae_fld[var2] = null;
				}
			}

			if (null != var0.ah_fld) {
				if (var1) {
					var0.ah(var0.ah_fld);
				} else if (var0.ah_fld.ae() != null) {
					var0.ag_fld.ag(var0.ah_fld.ae());
				}

				var0.ah_fld = null;
			}

			var0.az_fld = null;
		}
	}

	public ru() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V"
	)
	void ah(wj var1) {
		wj.uv(var1, 0, var1.av(), this.az_fld.ay().aw(), this.az_fld.ay().ah(-1897016173));
		wj.lm(var1, 2126605068);
		this.ay_fld.add(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpn;ZZ)V"
	)
	public void af(pn var1, boolean var2, boolean var3) {
		if (this.az_fld != null) {
			this.az(var2, 1796016238);
		}

		this.az_fld = var1;
		this.av_fld = var3;

		for (int var4 = 0; var4 < var1.ao(); var4++) {
			this.ae_fld[var4] = null;
		}

		if (var1.aw() != null) {
			int var6 = var1.aw().ag_fld * 2081204781;
			int var7 = var1.aw().az_fld * -654822241;
			int var5 = var6 + (int)(Math.random() * (var7 - var6));
			this.aw_fld = -1775019305 * var5;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Lwj;"
	)
	wj am(int var1, int var2, int var3) throws EOFException {
		int var4 = this.ak_fld.ce(var1, -584540345) - 1;
		af var5 = af.ag(this.ak_fld, var1, var4);
		if (var5 != null) {
			al var6;
			if (var4 == 0) {
				var6 = var5.az(this.av_fld);
			} else {
				if (1 != var4) {
					return null;
				}

				var6 = var5.av();
			}

			wj var7 = new wj(var6, var2, var3);
			if (var7.ae() == null) {
				return null;
			} else {
				this.ag_fld.ak(var7.ae());
				return var7;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luv;Lar;)V"
	)
	public void as(uv var1, ar var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luv;Lar;)V"
	)
	public void ar(uv var1, ar var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	void ap(wj var1) {
		wj.uv(var1, 0, var1.av(), this.az_fld.ay().aw(), this.az_fld.ay().ah(-1897016173));
		wj.lm(var1, 2049939518);
		this.ay_fld.add(var1);
	}

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Lsf;)I"
	)
	public static int uk(sf var0) {
		return var0.ad_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void an(boolean var1) {
		if (this.az_fld != null) {
			for (int var2 = 0; var2 < this.az_fld.ao(); var2++) {
				if (null != this.ae_fld[var2]) {
					if (var1) {
						this.ah(this.ae_fld[var2]);
					} else if (this.ae_fld[var2].ae() != null) {
						this.ag_fld.ag(this.ae_fld[var2].ae());
					}

					this.ae_fld[var2] = null;
				}
			}

			if (null != this.ah_fld) {
				if (var1) {
					this.ah(this.ah_fld);
				} else if (this.ah_fld.ae() != null) {
					this.ag_fld.ag(this.ah_fld.ae());
				}

				this.ah_fld = null;
			}

			this.az_fld = null;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void aa(boolean var1) {
		if (this.az_fld != null) {
			for (int var2 = 0; var2 < this.az_fld.ao(); var2++) {
				if (null != this.ae_fld[var2]) {
					if (var1) {
						this.ah(this.ae_fld[var2]);
					} else if (this.ae_fld[var2].ae() != null) {
						this.ag_fld.ag(this.ae_fld[var2].ae());
					}

					this.ae_fld[var2] = null;
				}
			}

			if (null != this.ah_fld) {
				if (var1) {
					this.ah(this.ah_fld);
				} else if (this.ah_fld.ae() != null) {
					this.ag_fld.ag(this.ah_fld.ae());
				}

				this.ah_fld = null;
			}

			this.az_fld = null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Lwj;"
	)
	wj ai(int var1, int var2, int var3) throws EOFException {
		int var4 = this.ak_fld.ce(var1, 878093933) - 1;
		af var5 = af.ag(this.ak_fld, var1, var4);
		if (var5 != null) {
			al var6;
			if (var4 == 0) {
				var6 = var5.az(this.av_fld);
			} else {
				if (1 != var4) {
					return null;
				}

				var6 = var5.av();
			}

			wj var7 = new wj(var6, var2, var3);
			if (var7.ae() == null) {
				return null;
			} else {
				this.ag_fld.ak(var7.ae());
				return var7;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Lwj;"
	)
	wj aq(int var1, int var2, int var3) throws EOFException {
		int var4 = this.ak_fld.ce(var1, 1447732424) - 1;
		af var5 = af.ag(this.ak_fld, var1, var4);
		if (var5 != null) {
			al var6;
			if (var4 == 0) {
				var6 = var5.az(this.av_fld);
			} else {
				if (1 != var4) {
					return null;
				}

				var6 = var5.av();
			}

			wj var7 = new wj(var6, var2, var3);
			if (var7.ae() == null) {
				return null;
			} else {
				this.ag_fld.ak(var7.ae());
				return var7;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Lwj;"
	)
	wj ad(int var1, int var2, int var3) throws EOFException {
		int var4 = this.ak_fld.ce(var1, 1886806791) - 1;
		af var5 = af.ag(this.ak_fld, var1, var4);
		if (var5 != null) {
			al var6;
			if (var4 == 0) {
				var6 = var5.az(this.av_fld);
			} else {
				if (1 != var4) {
					return null;
				}

				var6 = var5.av();
			}

			wj var7 = new wj(var6, var2, var3);
			if (var7.ae() == null) {
				return null;
			} else {
				this.ag_fld.ak(var7.ae());
				return var7;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lru;Lwj;)V"
	)
	public static void hp(ru var0, wj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		wj.uv(var1, 0, var1.av(), var0.az_fld.ay().aw(), var0.az_fld.ay().ah(-1897016173));
		wj.lm(var1, 1959852973);
		var0.ay_fld.add(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	void ao(wj var1) {
		wj.uv(var1, 0, var1.av(), this.az_fld.ay().aw(), this.az_fld.ay().ah(-1897016173));
		wj.lm(var1, 2079230829);
		this.ay_fld.add(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	void ac(wj var1) {
		wj.uv(var1, 0, var1.av(), this.az_fld.ay().aw(), this.az_fld.ay().ah(-1897016173));
		wj.lm(var1, 1941780635);
		this.ay_fld.add(var1);
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lru;Lwj;)V"
	)
	public static void nk(ru var0, wj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		wj.uv(var1, 0, var1.av(), var0.az_fld.ay().aw(), var0.az_fld.ay().ah(-1897016173));
		wj.lm(var1, 2143587639);
		var0.ay_fld.add(var1);
	}

	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "(Lru;IIII)Lwj;"
	)
	public static wj td(ru var0, int var1, int var2, int var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		int var5 = var0.ak_fld.ce(var1, 1556967604) - 1;
		af var6 = af.ag(var0.ak_fld, var1, var5);
		if (var6 != null) {
			al var7;
			if (var5 == 0) {
				var7 = var6.az(var0.av_fld);
			} else {
				if (1 != var5) {
					return null;
				}

				var7 = var6.av();
			}

			wj var8 = new wj(var7, var2, var3);
			if (var8.ae() == null) {
				return null;
			} else {
				var0.ag_fld.ak(var8.ae());
				return var8;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lwj;"
	)
	wj ae(int var1, int var2, int var3, int var4) throws EOFException {
		int var5 = this.ak_fld.ce(var1, 1556967604) - 1;
		af var6 = af.al(this.ak_fld, var1, var5);
		if (var6 != null) {
			al var7;
			if (var5 == 0) {
				var7 = var6.am(this.av_fld);
			} else {
				if (1 != var5) {
					return null;
				}

				var7 = var6.aa();
			}

			wj var8 = new wj(var7, var2, var3);
			if (var8.ae() == null) {
				return null;
			} else {
				this.ag_fld.aa(var8.ae());
				return var8;
			}
		} else {
			return null;
		}
	}
}
