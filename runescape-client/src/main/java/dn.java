import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.VarClientIntChanged;
import net.runelite.api.events.VarClientStrChanged;

@ObfuscatedName("dn")
public class dn {
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cs_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] az_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ae_fld = false;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 8501506455667353127L
	)
	long ah_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bz_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static kc ed_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map av_fld;

	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)J"
	)
	public static long sg(dn var0, int var1) {
		Object var2 = var0.av_fld.get(var1);
		if (var2 instanceof Integer) {
			return ((Integer)var2).intValue();
		} else {
			return var2 instanceof Long ? (Long)var2 : -1L;
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Ldn;II)I"
	)
	public static int dd(dn var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			Object var3 = var0.av_fld.get(var1);
			return var3 instanceof Integer ? (Integer)var3 : -1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ai(int var1) {
		Object var2 = this.av_fld.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)Z"
	)
	public static boolean wl(dn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ae_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int an(int var1) {
		Object var2 = this.av_fld.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void rb(int var1, int var2) {
		og.ci_fld.getCallbacks().post(new VarClientIntChanged(var1));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void ak(int var1, int var2) {
		this.av_fld.put(var1, var2);
		if (this.az_fld[var1]) {
			this.ae_fld = true;
		}

		this.rb(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)J"
	)
	long av(int var1) {
		Object var3 = this.av_fld.get(var1);
		if (var3 instanceof Integer) {
			return ((Integer)var3).intValue();
		} else {
			return var3 instanceof Long ? (Long)var3 : -1L;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;"
	)
	String ah(int var1) {
		Object var3 = this.av_fld.get(var1);
		return var3 instanceof String ? (String)var3 : "";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	void ab(int var1, String var2) {
		this.av_fld.put(var1, var2);
	}

	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	public static void yb(dn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.az_fld.length; var1++) {
			if (!var0.az_fld[var1]) {
				var0.av_fld.remove(var1);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void as(byte var1) throws FileNotFoundException {
		zb var2 = this.ay(true);

		try {
			int var3 = 3;
			int var4 = 0;
			Iterator var5 = this.av_fld.entrySet().iterator();

			while (var5.hasNext()) {
				Entry var6 = (Entry)(Entry)var5.next();
				int var7 = (Integer)var6.getKey();
				if (this.az_fld[var7]) {
					Object var8 = var6.getValue();
					var3 += 3;
					if (var8 instanceof Integer) {
						var3 += 4;
					}

					if (var8 instanceof Long) {
						var3 += 8;
					} else if (var8 instanceof String) {
						if (var1 <= 1) {
							return;
						}

						var3 += iq.bu((String)var8);
					}

					var4++;
				}
			}

			xi var21 = new xi(var3);
			var21.ea(2);
			xi.vy(var21, var4);
			Iterator var22 = this.av_fld.entrySet().iterator();

			while (var22.hasNext()) {
				Entry var23 = (Entry)(Entry)var22.next();
				int var24 = (Integer)var23.getKey();
				if (this.az_fld[var24]) {
					if (var1 <= 1) {
						return;
					}

					xi.vy(var21, var24);
					Object var9 = var23.getValue();
					yq var10 = yq.az(var9.getClass());
					var21.ea(var10.ah_fld);
					yq.aw(var9, var21);
				}
			}

			var2.az(var21.al_fld, 0, var21.au_fld);
		} catch (Exception var19) {
		} finally {
			try {
				var2.av();
			} catch (Exception var18) {
			}
		}

		this.ae_fld = false;
		this.ah_fld = lz.ak();
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	public static void pe(dn var0) throws FileNotFoundException {
		if (var0 == null) {
			var0.getClass();
		}

		zb var1 = var0.ay(false);

		label188: {
			try {
				byte[] var2 = new byte[(int)var1.ah()];
				int var3 = 0;

				while (var3 < var2.length) {
					int var4 = zb.oe(var1, var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}

					var3 += var4;
				}

				xi var24 = new xi(var2);
				if (var24.al_fld.length - var24.au_fld < 1) {
					return;
				}

				int var5 = var24.cg();
				if (var5 >= 0 && var5 <= 2) {
					if (var5 >= 2) {
						int var6 = var24.cm();
						int var7 = 0;

						while (true) {
							if (var7 >= var6) {
								break label188;
							}

							int var8 = var24.cm();
							int var9 = var24.cg();
							yq var10 = (yq)ka.ak(yq.ak(), var9);
							Object var11 = var10.as(var24);
							if (var8 >= 0 && var8 < var0.az_fld.length && var0.az_fld[var8]) {
								var0.av_fld.put(var8, var11);
							}

							var7++;
						}
					} else {
						int var25 = var24.cm();

						for (int var26 = 0; var26 < var25; var26++) {
							int var28 = var24.cm();
							int var30 = var24.co((byte)-32);
							if (var28 >= 0 && var28 < var0.az_fld.length && var0.az_fld[var28]) {
								var0.av_fld.put(var28, var30);
							}
						}

						int var27 = var24.cm();
						int var29 = 0;

						while (true) {
							if (var29 >= var27) {
								break label188;
							}

							var24.cm();
							xi.at(var24, 308256468);
							var29++;
						}
					}
				}
			} catch (Exception var22) {
				break label188;
			} finally {
				try {
					var1.av();
				} catch (Exception var21) {
				}
			}

			return;
		}

		var0.ae_fld = false;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)V"
	)
	public static void ld(dn var0, int var1) throws FileNotFoundException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ae_fld) {
			if (var1 <= 1070044252) {
				return;
			}

			if (var0.ah_fld < lz.ak() - 60000L) {
				var0.as((byte)81);
			}
		}
	}

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Map;"
	)
	public Map ve() {
		return this.av_fld;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Ldn;ILjava/lang/String;I)V"
	)
	public static void dd(dn var0, int var1, String var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld.put(var1, var2);
		var0.na(var1, var2);
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Lqg;)Lyz;"
	)
	public static yz uc(qg var0) {
		return (yz)(yz)var0.az_fld.ae();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)Ljava/lang/String;"
	)
	public static String cq(dn var0, int var1) {
		Object var2 = var0.av_fld.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	public void na(int var1, String var2) {
		og.ci_fld.getCallbacks().post(new VarClientStrChanged(var1));
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	public static void mr(dn var0) throws FileNotFoundException {
		if (var0.ae_fld && var0.ah_fld < lz.ak() - 60000L) {
			var0.as((byte)43);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bz() throws FileNotFoundException {
		zb var1 = this.ay(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.av_fld.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)(Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.az_fld[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					}

					if (var7 instanceof Long) {
						var2 += 8;
					} else if (var7 instanceof String) {
						var2 += iq.bu((String)var7);
					}

					var3++;
				}
			}

			xi var20 = new xi(var2);
			var20.ea(2);
			xi.vy(var20, var3);
			Iterator var21 = this.av_fld.entrySet().iterator();

			while (var21.hasNext()) {
				Entry var22 = (Entry)(Entry)var21.next();
				int var23 = (Integer)var22.getKey();
				if (this.az_fld[var23]) {
					xi.vy(var20, var23);
					Object var8 = var22.getValue();
					yq var9 = yq.az(var8.getClass());
					var20.ea(var9.ah_fld);
					yq.aw(var8, var20);
				}
			}

			var1.az(var20.al_fld, 0, var20.au_fld * 1087587457);
		} catch (Exception var18) {
		} finally {
			try {
				var1.av();
			} catch (Exception var17) {
			}
		}

		this.ae_fld = false;
		this.ah_fld = lz.ak();
	}

	dn() throws FileNotFoundException, EOFException {
		int var1 = client.hg_fld.ce(19, 695565261);
		this.av_fld = new HashMap();
		this.az_fld = new boolean[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			pq var4 = (pq)pq.ag_fld.ak(var2);
			pq var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = pq.ak_fld.bb(19, var2, 584982574);
				var4 = new pq();
				if (var5 != null) {
					var4.ag(new xi(var5), 20897183);
				}

				pq.ag_fld.az(var4, var2);
				var3 = var4;
			}

			this.az_fld[var2] = var3.az_fld;
		}

		this.ar(-689556025);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IJ)V"
	)
	void aq(int var1, long var2) {
		this.av_fld.put(var1, var2);
		if (this.az_fld[var1]) {
			this.ae_fld = true;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ax(int var1) {
		Object var2 = this.av_fld.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lzb;"
	)
	zb ay(boolean var1) throws FileNotFoundException {
		return cw.av("2", es.gp_fld.aw_fld, var1);
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)I"
	)
	public static int nu(dn var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			Object var2 = var0.av_fld.get(var1);
			return var2 instanceof Integer ? (Integer)var2 : -1;
		}
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Ljava/lang/String;"
	)
	public static String ni(cn var0) {
		return var0.aa_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ldn;II)V"
	)
	public static void bp(dn var0, int var1, int var2) {
		var0.av_fld.put(var1, var2);
		if (var0.az_fld[var1]) {
			var0.ae_fld = true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	long ao(int var1) {
		Object var2 = this.av_fld.get(var1);
		if (var2 instanceof Integer) {
			return ((Integer)var2).intValue();
		} else {
			return var2 instanceof Long ? (Long)var2 : -1L;
		}
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Luo;)Z"
	)
	public static boolean pc(uo var0) {
		return var0.aj_fld.ay();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	void ap(int var1, String var2) {
		this.av_fld.put(var1, var2);
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	public static void pl(dn var0) throws FileNotFoundException {
		if (var0 == null) {
			var0.getClass();
		} else {
			zb var1 = var0.ay(false);

			label188: {
				try {
					byte[] var2 = new byte[(int)var1.ah()];
					int var3 = 0;

					while (var3 < var2.length) {
						int var4 = zb.oe(var1, var2, var3, var2.length - var3);
						if (var4 == -1) {
							throw new EOFException();
						}

						var3 += var4;
					}

					xi var24 = new xi(var2);
					if (var24.al_fld.length - var24.au_fld < 1) {
						return;
					}

					int var5 = var24.cg();
					if (var5 >= 0 && var5 <= 2) {
						if (var5 >= 2) {
							int var6 = var24.cm();
							int var7 = 0;

							while (true) {
								if (var7 >= var6) {
									break label188;
								}

								int var8 = var24.cm();
								int var9 = var24.cg();
								yq var10 = (yq)ka.ak(yq.ak(), var9);
								Object var11 = var10.as(var24);
								if (var8 >= 0 && var8 < var0.az_fld.length && var0.az_fld[var8]) {
									var0.av_fld.put(var8, var11);
								}

								var7++;
							}
						} else {
							int var25 = var24.cm();

							for (int var26 = 0; var26 < var25; var26++) {
								int var28 = var24.cm();
								int var30 = var24.co((byte)-58);
								if (var28 >= 0 && var28 < var0.az_fld.length && var0.az_fld[var28]) {
									var0.av_fld.put(var28, var30);
								}
							}

							int var27 = var24.cm();
							int var29 = 0;

							while (true) {
								if (var29 >= var27) {
									break label188;
								}

								var24.cm();
								xi.at(var24, -1832978076);
								var29++;
							}
						}
					}
				} catch (Exception var22) {
					break label188;
				} finally {
					try {
						var1.av();
					} catch (Exception var21) {
					}
				}

				return;
			}

			var0.ae_fld = false;
		}
	}

	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "(Lma;)[F"
	)
	public static float[] sf(ma var0) {
		return var0.af_fld.ah_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	String at(int var1) {
		Object var2 = this.av_fld.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() {
		for (int var1 = 0; var1 < this.az_fld.length; var1++) {
			if (!this.az_fld[var1]) {
				this.av_fld.remove(var1);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		for (int var2 = 0; var2 < this.az_fld.length; var2++) {
			if (!this.az_fld[var2]) {
				if (var1 == 250156066) {
					return;
				}

				this.av_fld.remove(var2);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ar(int var1) throws FileNotFoundException {
		zb var2 = this.ay(false);

		label239: {
			try {
				byte[] var3 = new byte[(int)var2.ah()];
				int var4 = 0;

				while (var4 < var3.length) {
					if (var1 != -689556025) {
						return;
					}

					int var5 = zb.oe(var2, var3, var4, var3.length - var4);
					if (var5 == -1) {
						throw new EOFException();
					}

					var4 += var5;
				}

				xi var25 = new xi(var3);
				if (var25.al_fld.length - var25.au_fld < 1) {
					return;
				}

				int var6 = var25.cg();
				if (var6 >= 0 && var6 <= 2) {
					if (var6 >= 2) {
						int var7 = var25.cm();
						int var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label239;
							}

							int var9 = var25.cm();
							int var10 = var25.cg();
							yq var11 = (yq)ka.ak(yq.ak(), var10);
							Object var12 = var11.as(var25);
							if (var9 >= 0 && var9 < this.az_fld.length && this.az_fld[var9]) {
								this.av_fld.put(var9, var12);
							}

							var8++;
						}
					} else {
						int var26 = var25.cm();

						for (int var27 = 0; var27 < var26; var27++) {
							if (var1 != -689556025) {
								return;
							}

							int var29 = var25.cm();
							int var31 = var25.co((byte)-94);
							if (var29 >= 0 && var29 < this.az_fld.length && this.az_fld[var29]) {
								this.av_fld.put(var29, var31);
							}
						}

						int var28 = var25.cm();
						int var30 = 0;

						while (true) {
							if (var30 >= var28) {
								break label239;
							}

							if (var1 != -689556025) {
								return;
							}

							var25.cm();
							xi.at(var25, 634124217);
							var30++;
						}
					}
				}
			} catch (Exception var23) {
				break label239;
			} finally {
				try {
					var2.av();
				} catch (Exception var22) {
				}
			}

			return;
		}

		this.ae_fld = false;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void be() throws FileNotFoundException {
		zb var1 = this.ay(false);

		label184: {
			try {
				byte[] var2 = new byte[(int)var1.ah()];
				int var3 = 0;

				while (var3 < var2.length) {
					int var4 = zb.oe(var1, var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}

					var3 += var4;
				}

				xi var24 = new xi(var2);
				if (var24.al_fld.length - var24.au_fld < 1) {
					return;
				}

				int var5 = var24.cg();
				if (var5 >= 0 && var5 <= 2) {
					if (var5 >= 2) {
						int var6 = var24.cm();
						int var7 = 0;

						while (true) {
							if (var7 >= var6) {
								break label184;
							}

							int var8 = var24.cm();
							int var9 = var24.cg();
							yq var10 = (yq)ka.ak(yq.ak(), var9);
							Object var11 = var10.as(var24);
							if (var8 >= 0 && var8 < this.az_fld.length && this.az_fld[var8]) {
								this.av_fld.put(var8, var11);
							}

							var7++;
						}
					} else {
						int var25 = var24.cm();

						for (int var26 = 0; var26 < var25; var26++) {
							int var28 = var24.cm();
							int var30 = var24.co((byte)-25);
							if (var28 >= 0 && var28 < this.az_fld.length && this.az_fld[var28]) {
								this.av_fld.put(var28, var30);
							}
						}

						int var27 = var24.cm();
						int var29 = 0;

						while (true) {
							if (var29 >= var27) {
								break label184;
							}

							var24.cm();
							xi.at(var24, -363866163);
							var29++;
						}
					}
				}
			} catch (Exception var22) {
				break label184;
			} finally {
				try {
					var1.av();
				} catch (Exception var21) {
				}
			}

			return;
		}

		this.ae_fld = false;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Z)Lzb;"
	)
	zb bd(boolean var1) throws FileNotFoundException {
		return cw.av("2", es.gp_fld.aw_fld, var1);
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	static void de(int var0, int var1, int var2, int var3, int var4) throws EOFException {
		bw.dp(hk.mt_fld, var0, var1, var2, var3, var4, 785130743);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;B)Ltu;"
	)
	public static final tu av(tu var0, tu var1) {
		tu var3;
		synchronized (tu.ae_fld) {
			if (0 == tu.aw_fld) {
				var3 = new tu(var0);
			} else {
				tu.fu(tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465], var0, -1645983469);
				var3 = tu.ae_fld[tu.aw_fld];
			}
		}

		var3.ai(var1);
		return var3;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BI)[B"
	)
	static final byte[] bq(byte[] var0) {
		xi var2 = new xi(var0);
		int var3 = var2.yu();
		int var4 = var2.av();
		if (var4 >= 0) {
			if (var3 == 0) {
				byte[] var10 = new byte[var4];
				var2.bb(var10, 0, var4);
				return var10;
			} else {
				int var5 = var2.av();
				if (var5 < 0) {
					throw new RuntimeException();
				} else {
					byte[] var6 = new byte[var5];
					if (var3 == 1) {
						uv.hy(var6, var5, var0, var4, 9);
					} else {
						synchronized (ub.bz_fld) {
							ub.bz_fld.ku(var2, var6);
						}
					}

					return var6;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IJ)V"
	)
	void az(int var1, long var2) {
		this.av_fld.put(var1, var2);
		if (this.az_fld[var1]) {
			this.ae_fld = true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ag(int var1, int var2) {
		Object var3 = this.av_fld.get(var1);
		return var3 instanceof Integer ? (Integer)var3 : -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean al(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("xt")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IJ)V"
	)
	public static void xt(dn var0, int var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld.put(var1, var2);
			if (var0.az_fld[var1]) {
				var0.ae_fld = true;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void af(int var1) {
		for (int var2 = 0; var2 < this.az_fld.length; var2++) {
			if (!this.az_fld[var2]) {
				if (var1 == 250156066) {
					return;
				}

				this.av_fld.remove(var2);
			}
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)J"
	)
	public static long iy(dn var0, int var1) {
		Object var2 = var0.av_fld.get(var1);
		if (var2 instanceof Integer) {
			return ((Integer)var2).intValue();
		} else {
			return var2 instanceof Long ? (Long)var2 : -1L;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aa(int var1) {
		Object var2 = this.av_fld.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V"
	)
	void ae(int var1, String var2, int var3) {
		this.av_fld.put(var1, var2);
		this.na(var1, var2);
	}
}
