import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ru")
public class ru {
	@ObfuscatedGetter(
		intValue = 776540865
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
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

				if (wj.yt(var5, 113514655) != null) {
					this.ag_fld.au(wj.yt(var5, -1720533193));
				}

				var4.remove();
			} else {
				wj.nc(var5, 1979848000);
			}
		}

		if (null != this.az_fld) {
			for (int var9 = 0; var9 < this.az_fld.ao(); var9++) {
				if (var3 >= 8) {
					return;
				}

				wj var11 = this.ae_fld[var9];
				if (var11 != null && wj.yt(var11, -59614809) != null) {
					wj.il(var11, var1, var1, this.az_fld.ay());
					wj.nc(var11, 1947073605);
				} else {
					this.ae_fld[var9] = this.ae(this.az_fld.ah(var9), var1, -1);
				}
			}

			if (null != this.ah_fld && wj.yt(this.ah_fld, 384689072) != null) {
				wj.il(this.ah_fld, var1, var1, this.az_fld.ay());
				wj.nc(this.ah_fld, 1972802995);
			} else {
				wn var10 = pn.dx(this.az_fld, 947001128);
				if (var10 != null) {
					if (var3 >= 8) {
						return;
					}

					if (null != var10.ak_fld && (this.aw_fld -= 97156417 * var2) * 776540865 <= 0 && var1 > 0) {
						int var12 = var10.ak_fld[(int)(Math.random() * var10.ak_fld.length)];
						this.ah_fld = this.ae(var12, var1, 0);
						if (this.ah_fld != null) {
							if (var3 >= 8) {
								return;
							}

							this.ah_fld.ag(var1, var1, this.az_fld.ay().aw(), wh.wa(this.az_fld.ay(), (byte)1));
							wj.nc(this.ah_fld, 1998499442);
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

		if (pn.dx(var1, -1220279551) != null) {
			if (var4 <= -1124625579) {
				return;
			}

			int var7 = pn.dx(var1, -2054782348).ag_fld * -239181913;
			int var8 = pn.dx(var1, 816355202).az_fld * -1441812743;
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
					} else if (wj.yt(this.ae_fld[var3], -1660369184) != null) {
						this.ag_fld.au(wj.yt(this.ae_fld[var3], -2144921556));
					}

					this.ae_fld[var3] = null;
				}
			}

			if (null != this.ah_fld) {
				if (var1) {
					this.ah(this.ah_fld);
				} else if (wj.yt(this.ah_fld, -1494181883) != null) {
					if (var2 != 1796016238) {
						return;
					}

					this.ag_fld.au(wj.yt(this.ah_fld, -1537326651));
				}

				this.ah_fld = null;
			}

			this.az_fld = null;
		}
	}

	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "(Lru;Lwj;)V"
	)
	public static void zi(ru var0, wj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.ag(0, var1.av(), var0.az_fld.ay().ae(), var0.az_fld.ay().ay());
		wj.nc(var1, 2049939518);
		var0.ay_fld.add(var1);
	}

	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "(Lhs;II)I"
	)
	public static int tj(hs var0, int var1, int var2) {
		return var0.ag_fld[var1 + var2 * 64];
	}

	@ObfuscatedName("zf")
	@ObfuscatedSignature(
		descriptor = "(Lru;Lwj;)V"
	)
	public static void zf(ru var0, wj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.ag(0, var1.av(), var0.az_fld.ay().ae(), var0.az_fld.ay().ay());
		wj.nc(var1, 2079230829);
		var0.ay_fld.add(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Luv;Lar;)V"
	)
	public void ay(uv var1, ar var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "(Lru;Z)V"
	)
	public static void ud(ru var0, boolean var1) {
		if (var0.az_fld != null) {
			for (int var2 = 0; var2 < var0.az_fld.ao(); var2++) {
				if (null != var0.ae_fld[var2]) {
					if (var1) {
						var0.ah(var0.ae_fld[var2]);
					} else if (wj.yt(var0.ae_fld[var2], -565779126) != null) {
						var0.ag_fld.au(wj.yt(var0.ae_fld[var2], -1554195667));
					}

					var0.ae_fld[var2] = null;
				}
			}

			if (null != var0.ah_fld) {
				if (var1) {
					var0.ah(var0.ah_fld);
				} else if (wj.yt(var0.ah_fld, -722839890) != null) {
					var0.ag_fld.au(wj.yt(var0.ah_fld, -1959243141));
				}

				var0.ah_fld = null;
			}

			var0.az_fld = null;
		}
	}

	public ru() {
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lru;Luv;Lar;I)V"
	)
	public static void kz(ru var0, uv var1, ar var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = var1;
			var0.ag_fld = var2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	void ah(wj var1) {
		var1.ag(0, var1.av(), this.az_fld.ay().ae(), this.az_fld.ay().ay());
		wj.nc(var1, 2126605068);
		this.ay_fld.add(var1);
	}

	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "(Lru;III)Lwj;"
	)
	public static wj sq(ru var0, int var1, int var2, int var3) throws EOFException {
		int var4 = rl1.ei(var0.ak_fld, var1) - 1;
		af var5 = af.ag(var0.ak_fld, var1, var4);
		if (var5 != null) {
			al var6;
			if (var4 == 0) {
				var6 = var5.az(var0.av_fld);
			} else {
				if (1 != var4) {
					return null;
				}

				var6 = var5.av();
			}

			wj var7 = new wj(var6, var2, var3);
			if (wj.yt(var7, -1768487620) == null) {
				return null;
			} else {
				var0.ag_fld.ax(wj.yt(var7, -713956492));
				return var7;
			}
		} else {
			return null;
		}
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

		if (pn.dx(var1, -1798309031) != null) {
			int var6 = pn.dx(var1, -1429536518).ag_fld * 2081204781;
			int var7 = pn.dx(var1, 814371186).az_fld * -654822241;
			int var5 = var6 + (int)(Math.random() * (var7 - var6));
			this.aw_fld = -1775019305 * var5;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Lwj;"
	)
	wj am(int var1, int var2, int var3) throws EOFException {
		int var4 = rl1.ei(this.ak_fld, var1) - 1;
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
			if (wj.yt(var7, -184014045) == null) {
				return null;
			} else {
				this.ag_fld.ax(wj.yt(var7, 186316539));
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpn;ZZ)V"
	)
	public void al(pn var1, boolean var2, boolean var3) {
		if (this.az_fld != null) {
			this.az(var2, 1796016238);
		}

		this.az_fld = var1;
		this.av_fld = var3;

		for (int var4 = 0; var4 < var1.ao(); var4++) {
			this.ae_fld[var4] = null;
		}

		if (pn.dx(var1, -46484497) != null) {
			int var6 = pn.dx(var1, -92377214).ag_fld * -239181913;
			int var7 = pn.dx(var1, -1923744732).az_fld * -1441812743;
			int var5 = var6 + (int)(Math.random() * (var7 - var6));
			this.aw_fld = var5;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpn;ZZ)V"
	)
	public void au(pn var1, boolean var2, boolean var3) {
		if (this.az_fld != null) {
			this.az(var2, 1796016238);
		}

		this.az_fld = var1;
		this.av_fld = var3;

		for (int var4 = 0; var4 < var1.ao(); var4++) {
			this.ae_fld[var4] = null;
		}

		if (pn.dx(var1, -483713570) != null) {
			int var6 = pn.dx(var1, 10373657).ag_fld * -239181913;
			int var7 = pn.dx(var1, 1131054152).az_fld * -1441812743;
			int var5 = var6 + (int)(Math.random() * (var7 - var6));
			this.aw_fld = var5;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Lwj;"
	)
	wj aq(int var1, int var2, int var3) throws EOFException {
		int var4 = rl1.ei(this.ak_fld, var1) - 1;
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
			if (wj.yt(var7, -774398956) == null) {
				return null;
			} else {
				this.ag_fld.ax(wj.yt(var7, -1889510151));
				return var7;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lru;Lwj;)V"
	)
	public static void az(ru var0, wj var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1.ag(0, var1.av(), var0.az_fld.ay().ae(), var0.az_fld.ay().ay());
			wj.nc(var1, 1959852973);
			var0.ay_fld.add(var1);
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lru;Z)V"
	)
	public static void iq(ru var0, boolean var1) {
		if (var0.az_fld != null) {
			for (int var2 = 0; var2 < var0.az_fld.ao(); var2++) {
				if (null != var0.ae_fld[var2]) {
					if (var1) {
						var0.ah(var0.ae_fld[var2]);
					} else if (wj.yt(var0.ae_fld[var2], -2053484893) != null) {
						var0.ag_fld.au(wj.yt(var0.ae_fld[var2], -1381796141));
					}

					var0.ae_fld[var2] = null;
				}
			}

			if (null != var0.ah_fld) {
				if (var1) {
					var0.ah(var0.ah_fld);
				} else if (wj.yt(var0.ah_fld, -1370489433) != null) {
					var0.ag_fld.au(wj.yt(var0.ah_fld, -396125787));
				}

				var0.ah_fld = null;
			}

			var0.az_fld = null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Lwj;"
	)
	wj ae(int var1, int var2, int var3) throws EOFException {
		int var5 = rl1.ei(this.ak_fld, var1) - 1;
		af var6 = af.ag(this.ak_fld, var1, var5);
		if (var6 != null) {
			al var7;
			if (var5 == 0) {
				var7 = var6.az(this.av_fld);
			} else {
				if (1 != var5) {
					return null;
				}

				var7 = var6.av();
			}

			wj var8 = new wj(var7, var2, var3);
			if (wj.yt(var8, -189699703) == null) {
				return null;
			} else {
				this.ag_fld.ax(wj.yt(var8, -748312467));
				return var8;
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
		int var4 = rl1.ei(this.ak_fld, var1) - 1;
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
			if (wj.yt(var7, 241133428) == null) {
				return null;
			} else {
				this.ag_fld.ax(wj.yt(var7, -498087085));
				return var7;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void ax(boolean var1) {
		if (this.az_fld != null) {
			for (int var2 = 0; var2 < this.az_fld.ao(); var2++) {
				if (null != this.ae_fld[var2]) {
					if (var1) {
						this.ah(this.ae_fld[var2]);
					} else if (wj.yt(this.ae_fld[var2], -677586246) != null) {
						this.ag_fld.au(wj.yt(this.ae_fld[var2], -1766526120));
					}

					this.ae_fld[var2] = null;
				}
			}

			if (null != this.ah_fld) {
				if (var1) {
					this.ah(this.ah_fld);
				} else if (wj.yt(this.ah_fld, -783422671) != null) {
					this.ag_fld.au(wj.yt(this.ah_fld, -1304740188));
				}

				this.ah_fld = null;
			}

			this.az_fld = null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	void at(wj var1) {
		var1.ag(0, var1.av(), this.az_fld.ay().ae(), this.az_fld.ay().ay());
		wj.nc(var1, 2143587639);
		this.ay_fld.add(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	void ac(wj var1) {
		var1.ag(0, var1.av(), this.az_fld.ay().ae(), this.az_fld.ay().ay());
		wj.nc(var1, 1941780635);
		this.ay_fld.add(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Luv;Lar;I)V"
	)
	public void ak(uv var1, ar var2, int var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}
}
