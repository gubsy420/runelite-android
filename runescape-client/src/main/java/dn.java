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
	@ObfuscatedGetter(
		longValue = 8501506455667353127L
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "J"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void au(int var1, int var2) {
		this.av_fld.put(var1, var2);
		if (this.az_fld[var1]) {
			this.ae_fld = true;
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int an(int var1) {
		Object var2 = this.av_fld.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ak(int var1, int var2) {
		this.av_fld.put(var1, var2);
		if (this.az_fld[var1]) {
			this.ae_fld = true;
		}

		this.vi(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	long av(int var1) {
		Object var3 = this.av_fld.get(var1);
		if (var3 instanceof Integer) {
			return ((Integer)var3).intValue();
		} else {
			return var3 instanceof Long ? (Long)var3 : -1L;
		}
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)V"
	)
	public static void wx(dn var0, int var1) throws FileNotFoundException {
		if (var0 == null) {
			var0.getClass();
		} else {
			zb var2 = var0.ay(false);

			label243: {
				try {
					byte[] var3 = new byte[(int)var2.ah()];
					int var4 = 0;

					while (var4 < var3.length) {
						if (var1 != -689556025) {
							return;
						}

						int var5 = zb.fd(var2, var3, var4, var3.length - var4);
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
							int var7 = xi.tx(var25, 743634559);
							int var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label243;
								}

								int var9 = xi.tx(var25, 2137338166);
								int var10 = var25.cg();
								yq var11 = (yq)ka.ak(yq.ak(), var10);
								Object var12 = var11.as(var25);
								if (var9 >= 0 && var9 < var0.az_fld.length && var0.az_fld[var9]) {
									var0.av_fld.put(var9, var12);
								}

								var8++;
							}
						} else {
							int var26 = xi.tx(var25, 1755764056);

							for (int var27 = 0; var27 < var26; var27++) {
								if (var1 != -689556025) {
									return;
								}

								int var29 = xi.tx(var25, 1330208898);
								int var31 = var25.co();
								if (var29 >= 0 && var29 < var0.az_fld.length && var0.az_fld[var29]) {
									var0.av_fld.put(var29, var31);
								}
							}

							int var28 = xi.tx(var25, 500143964);
							int var30 = 0;

							while (true) {
								if (var30 >= var28) {
									break label243;
								}

								if (var1 != -689556025) {
									return;
								}

								xi.tx(var25, 1453316007);
								xi.kc(var25, 634124217);
								var30++;
							}
						}
					}
				} catch (Exception var23) {
					break label243;
				} finally {
					try {
						var2.av();
					} catch (Exception var22) {
					}
				}

				return;
			}

			var0.ae_fld = false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	void ab(int var1, String var2) {
		this.av_fld.put(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ag(int var1) {
		Object var3 = this.av_fld.get(var1);
		return var3 instanceof Integer ? (Integer)var3 : -1;
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
			var21.bc(2);
			var21.bw(var4);
			Iterator var22 = this.av_fld.entrySet().iterator();

			while (var22.hasNext()) {
				Entry var23 = (Entry)(Entry)var22.next();
				int var24 = (Integer)var23.getKey();
				if (this.az_fld[var24]) {
					if (var1 <= 1) {
						return;
					}

					var21.bw(var24);
					Object var9 = var23.getValue();
					yq var10 = yq.az(var9.getClass());
					var21.bc(var10.ah_fld);
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

	dn() throws FileNotFoundException, EOFException {
		int var1 = rl1.ei(client.hg_fld, 19);
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
					var4.ag(new xi(var5));
				}

				pq.ag_fld.az(var4, var2);
				var3 = var4;
			}

			this.az_fld[var2] = var3.az_fld;
		}

		wx(this, -689556025);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean al() {
		return this.ae_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ax(int var1) {
		Object var2 = this.av_fld.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void af(int var1) throws FileNotFoundException {
		if (this.ae_fld) {
			if (var1 <= 1070044252) {
				return;
			}

			if (this.ah_fld < lz.ak() - 60000L) {
				this.as((byte)81);
			}
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

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IJ)V"
	)
	public static void lq(dn var0, int var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld.put(var1, var2);
		if (var0.az_fld[var1]) {
			var0.ae_fld = true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Z)Lzb;"
	)
	zb ay(boolean var1) throws FileNotFoundException {
		return cw.av("2", es.gp_fld.aw_fld, var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bj() {
		return this.ae_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	long am(int var1) {
		Object var2 = this.av_fld.get(var1);
		if (var2 instanceof Integer) {
			return ((Integer)var2).intValue();
		} else {
			return var2 instanceof Long ? (Long)var2 : -1L;
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

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	public void qf(int var1, String var2) {
		og.ci_fld.getCallbacks().post(new VarClientStrChanged(var1));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	void ap(int var1, String var2) {
		this.av_fld.put(var1, var2);
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void vi(int var1, int var2) {
		og.ci_fld.getCallbacks().post(new VarClientIntChanged(var1));
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Leg;)Lfn;"
	)
	public static fn ki(eg var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bx(128, 43690, 0, -1, 0);
		}
	}

	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)Ljava/lang/String;"
	)
	public static String uy(dn var0, int var1) {
		Object var2 = var0.av_fld.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	void ae(int var1, String var2) {
		this.av_fld.put(var1, var2);
		this.qf(var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	String ac(int var1) {
		Object var2 = this.av_fld.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IJ)V"
	)
	public static void tq(dn var0, int var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld.put(var1, var2);
			if (var0.az_fld[var1]) {
				var0.ae_fld = true;
			}
		}
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bm() {
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void br() throws FileNotFoundException {
		zb var1 = this.ay(false);

		label184: {
			try {
				byte[] var2 = new byte[(int)var1.ah()];
				int var3 = 0;

				while (var3 < var2.length) {
					int var4 = zb.fd(var1, var2, var3, var2.length - var3);
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
						int var6 = xi.tx(var24, 1466211122);
						int var7 = 0;

						while (true) {
							if (var7 >= var6) {
								break label184;
							}

							int var8 = xi.tx(var24, 1606212537);
							int var9 = var24.cg();
							yq var10 = (yq)ka.ak(yq.ak(), var9);
							Object var11 = var10.as(var24);
							if (var8 >= 0 && var8 < this.az_fld.length && this.az_fld[var8]) {
								this.av_fld.put(var8, var11);
							}

							var7++;
						}
					} else {
						int var25 = xi.tx(var24, 1486253833);

						for (int var26 = 0; var26 < var25; var26++) {
							int var28 = xi.tx(var24, 1219016886);
							int var30 = var24.co();
							if (var28 >= 0 && var28 < this.az_fld.length && this.az_fld[var28]) {
								this.av_fld.put(var28, var30);
							}
						}

						int var27 = xi.tx(var24, 930529110);
						int var29 = 0;

						while (true) {
							if (var29 >= var27) {
								break label184;
							}

							xi.tx(var24, 1833866573);
							xi.kc(var24, -1832978076);
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
					int var4 = zb.fd(var1, var2, var3, var2.length - var3);
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
						int var6 = xi.tx(var24, 381805587);
						int var7 = 0;

						while (true) {
							if (var7 >= var6) {
								break label184;
							}

							int var8 = xi.tx(var24, 1459033572);
							int var9 = var24.cg();
							yq var10 = (yq)ka.ak(yq.ak(), var9);
							Object var11 = var10.as(var24);
							if (var8 >= 0 && var8 < this.az_fld.length && this.az_fld[var8]) {
								this.av_fld.put(var8, var11);
							}

							var7++;
						}
					} else {
						int var25 = xi.tx(var24, 608986397);

						for (int var26 = 0; var26 < var25; var26++) {
							int var28 = xi.tx(var24, 713801568);
							int var30 = var24.co();
							if (var28 >= 0 && var28 < this.az_fld.length && this.az_fld[var28]) {
								this.av_fld.put(var28, var30);
							}
						}

						int var27 = xi.tx(var24, 1135550051);
						int var29 = 0;

						while (true) {
							if (var29 >= var27) {
								break label184;
							}

							xi.tx(var24, 778490609);
							xi.kc(var24, -363866163);
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

	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IB)Ljava/lang/String;"
	)
	public static String vd(dn var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			Object var3 = var0.av_fld.get(var1);
			return var3 instanceof String ? (String)var3 : "";
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bs() throws FileNotFoundException {
		zb var1 = this.ay(false);

		label184: {
			try {
				byte[] var2 = new byte[(int)var1.ah()];
				int var3 = 0;

				while (var3 < var2.length) {
					int var4 = zb.fd(var1, var2, var3, var2.length - var3);
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
						int var6 = xi.tx(var24, 1404742042);
						int var7 = 0;

						while (true) {
							if (var7 >= var6) {
								break label184;
							}

							int var8 = xi.tx(var24, 433121093);
							int var9 = var24.cg();
							yq var10 = (yq)ka.ak(yq.ak(), var9);
							Object var11 = var10.as(var24);
							if (var8 >= 0 && var8 < this.az_fld.length && this.az_fld[var8]) {
								this.av_fld.put(var8, var11);
							}

							var7++;
						}
					} else {
						int var25 = xi.tx(var24, 1105995484);

						for (int var26 = 0; var26 < var25; var26++) {
							int var28 = xi.tx(var24, 1355579057);
							int var30 = var24.co();
							if (var28 >= 0 && var28 < this.az_fld.length && this.az_fld[var28]) {
								this.av_fld.put(var28, var30);
							}
						}

						int var27 = xi.tx(var24, 748730476);
						int var29 = 0;

						while (true) {
							if (var29 >= var27) {
								break label184;
							}

							xi.tx(var24, 2129961569);
							xi.kc(var24, 308256468);
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bh() throws FileNotFoundException {
		if (this.ae_fld && this.ah_fld < lz.ak() - 60000L) {
			this.as((byte)108);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bk() throws FileNotFoundException {
		if (this.ae_fld && this.ah_fld < lz.ak() - 60000L) {
			this.as((byte)43);
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	public static void ld(dn var0) throws FileNotFoundException {
		if (var0 == null) {
			var0.getClass();
		} else {
			zb var1 = var0.ay(true);

			try {
				int var2 = 3;
				int var3 = 0;
				Iterator var4 = var0.av_fld.entrySet().iterator();

				while (var4.hasNext()) {
					Entry var5 = (Entry)(Entry)var4.next();
					int var6 = (Integer)var5.getKey();
					if (var0.az_fld[var6]) {
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
				var20.bc(2);
				var20.bw(var3);
				Iterator var21 = var0.av_fld.entrySet().iterator();

				while (var21.hasNext()) {
					Entry var22 = (Entry)(Entry)var21.next();
					int var23 = (Integer)var22.getKey();
					if (var0.az_fld[var23]) {
						var20.bw(var23);
						Object var8 = var22.getValue();
						yq var9 = yq.az(var8.getClass());
						var20.bc(var9.ah_fld);
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

			var0.ae_fld = false;
			var0.ah_fld = lz.ak();
		}
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
		descriptor = "(IIIII)V"
	)
	static void de(int var0, int var1, int var2, int var3, int var4) throws EOFException {
		bw.dp(hk.mt_fld, var0, var1, var2, var3, var4, 785130743);
	}

	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Map;"
	)
	public Map sv() {
		return this.av_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)Ltu;"
	)
	public static final tu av(tu var0, tu var1) {
		tu var3;
		synchronized (tu.ae_fld) {
			if (0 == tu.aw_fld) {
				var3 = new tu(var0);
			} else {
				tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].ay(var0);
				var3 = tu.ae_fld[tu.aw_fld];
			}
		}

		var3.ai(var1);
		return var3;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([B)[B"
	)
	static final byte[] bq(byte[] var0) {
		xi var2 = new xi(var0);
		int var3 = var2.gf();
		int var4 = var2.ka();
		if (var4 >= 0) {
			if (var3 == 0) {
				byte[] var10 = new byte[var4];
				var2.zw(var10, 0, var4);
				return var10;
			} else {
				int var5 = var2.ka();
				if (var5 < 0) {
					throw new RuntimeException();
				} else {
					byte[] var6 = new byte[var5];
					if (var3 == 1) {
						uv.pz(var6, var5, var0, var4, 9);
					} else {
						synchronized (ub.bz_fld) {
							ub.bz_fld.az(var2, var6);
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

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)J"
	)
	public static long ir(dn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		Object var2 = var0.av_fld.get(var1);
		if (var2 instanceof Integer) {
			return ((Integer)var2).intValue();
		} else {
			return var2 instanceof Long ? (Long)var2 : -1L;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;"
	)
	String ah(int var1, byte var2) {
		Object var3 = this.av_fld.get(var1);
		return var3 instanceof String ? (String)var3 : "";
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
			var20.cp(2);
			var20.cx(var3);
			Iterator var21 = this.av_fld.entrySet().iterator();

			while (var21.hasNext()) {
				Entry var22 = (Entry)(Entry)var21.next();
				int var23 = (Integer)var22.getKey();
				if (this.az_fld[var23]) {
					var20.bc(var23);
					Object var8 = var22.getValue();
					yq var9 = yq.az(var8.getClass());
					var20.ee(-1347456803 * var9.ae_fld);
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

					int var5 = zb.fd(var2, var3, var4, var3.length - var4);
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
						int var7 = xi.tx(var25, 743634559);
						int var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label239;
							}

							int var9 = xi.tx(var25, 2137338166);
							int var10 = var25.ei();
							yq var11 = (yq)ka.ak(yq.ak(), var10);
							Object var12 = var11.as(var25);
							if (var9 >= 0 && var9 < this.az_fld.length && this.az_fld[var9]) {
								this.av_fld.put(var9, var12);
							}

							var8++;
						}
					} else {
						int var26 = xi.tx(var25, 1755764056);

						for (int var27 = 0; var27 < var26; var27++) {
							if (var1 != -689556025) {
								return;
							}

							int var29 = xi.tx(var25, 1330208898);
							int var31 = var25.do_();
							if (var29 >= 0 && var29 < this.az_fld.length && this.az_fld[var29]) {
								this.av_fld.put(var29, var31);
							}
						}

						int var28 = xi.tx(var25, 500143964);
						int var30 = 0;

						while (true) {
							if (var30 >= var28) {
								break label239;
							}

							if (var1 != -689556025) {
								return;
							}

							xi.tx(var25, 1453316007);
							xi.kc(var25, 634124217);
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
}
