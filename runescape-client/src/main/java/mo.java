import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("mo")
public class mo {
	@ObfuscatedGetter(
		intValue = -54859065
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static mo ag_fld = new mo();
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ak_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bs_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bt_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map az_fld = new HashMap();
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ce_fld;

	mo() {
		this.av_fld = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILde;)V"
	)
	void ak(JSONObject var1, int var2, de var3) {
		this.az_fld.clear();

		JSONObject var5;
		try {
			var5 = var1;
			this.av_fld = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var8) {
			return;
		}

		try {
			this.ag(var5.getJSONArray("crmcomponents"), this.av_fld, var3, -1921303914);
		} catch (Exception var7) {
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILde;I)V"
	)
	void ag(JSONArray var1, int var2, de var3, int var4) throws JSONException {
		if (null != var1) {
			for (int var5 = 0; var5 < var1.length(); var5++) {
				JSONObject var6 = var1.getJSONObject(var5);
				if (!var6.getString("game").equals("osrs")) {
					if (var4 == -538711872) {
						return;
					}
				} else if (var6.getBoolean("removed")) {
					if (var4 == -538711872) {
						return;
					}
				} else {
					String var7 = var6.getString("platform");
					if (!var7.equals("mobile") && !var7.equals("android")) {
						if (var4 == -538711872) {
							return;
						}

						if (!var7.equals("ios")) {
							mj var8 = new mj();

							try {
								var8.ah(var6, var2, var3);
							} catch (Exception var10) {
							}

							if (!var8.as_fld.isEmpty()) {
								if (var4 == -538711872) {
									return;
								}

								String var9 = var6.getString("location");
								this.az_fld.put(var9, var8);
							}
						}
					}
				}
			}

			this.az_fld = this.az();
			lz.ak();
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Lyb;[Ljava/lang/Object;)Lyb;"
	)
	public static yb le(yb var0, Object[] var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.ag_fld = (Object[])var1;
			return var0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Map;"
	)
	Map az() {
		HashMap var2 = new HashMap();
		ArrayList var3 = new ArrayList();
		var3.addAll(this.az_fld.entrySet());
		boolean var4 = false;

		while (!var4) {
			var4 = true;

			for (int var6 = 0; var6 < var3.size() - 1; var6++) {
				if (((mj)((Entry)var3.get(var6)).getValue()).av() > ((mj)((Entry)var3.get(1 + var6)).getValue()).av()) {
					Entry var5 = (Entry)(Entry)var3.get(var6);
					var3.set(var6, var3.get(1 + var6));
					var3.set(var6 + 1, var5);
					var4 = false;
				}
			}
		}

		Iterator var8 = var3.iterator();

		while (var8.hasNext()) {
			Entry var7 = (Entry)(Entry)var8.next();
			var2.put(var7.getKey(), var7.getValue());
		}

		return var2;
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)I"
	)
	public static int qf(kj var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return kj.bk(var0, -540273059);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILde;)V"
	)
	void ah(JSONObject var1, int var2, de var3) {
		this.az_fld.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.av_fld = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.ag(var4.getJSONArray("crmcomponents"), this.av_fld, var3, -2062822441);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILde;)V"
	)
	void ae(JSONObject var1, int var2, de var3) {
		this.az_fld.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.av_fld = 1479348967 * var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.ag(var4.getJSONArray("crmcomponents"), this.av_fld * -379005019, var3, 1164120112);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILde;)V"
	)
	void as(JSONArray var1, int var2, de var3) throws JSONException {
		if (null != var1) {
			for (int var4 = 0; var4 < var1.length(); var4++) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						mj var7 = new mj();

						try {
							var7.ah(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.as_fld.isEmpty()) {
							String var8 = var5.getString("location");
							this.az_fld.put(var8, var7);
						}
					}
				}
			}

			this.az_fld = this.az();
			lz.ak();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lmj;"
	)
	mj ar(String var1) {
		return (mj)(mj)this.az_fld.get(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lmj;"
	)
	mj af(String var1) {
		return (mj)(mj)this.az_fld.get(var1);
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Ljava/lang/String;I)Lmj;"
	)
	public static mj lo(mo var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return (mj)(mj)var0.az_fld.get(var1);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	static final void dq(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		var5 = eu.dm(var5, var6);
		int var8 = 2048 - var3 & 2047;
		int var9 = 2048 - var4 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var5;
		if (0 != var8) {
			int var13 = fc.ah_fld[var8];
			int var14 = fc.aw_fld[var8];
			int var15 = var14 * var11 - var13 * var5 >> 16;
			var12 = var5 * var14 + var13 * var11 >> 16;
			var11 = var15;
		}

		if (0 != var9) {
			int var20 = fc.ah_fld[var9];
			int var22 = fc.aw_fld[var9];
			int var24 = var22 * var10 + var12 * var20 >> 16;
			var12 = var12 * var22 - var10 * var20 >> 16;
			var10 = var24;
		}

		if (client.ki_fld) {
			if (var7 != -1718204807) {
				return;
			}

			jq.pa_fld = var0 - var10;
			rl.pe_fld = var1 - var11;
			hr.pr_fld = var2 - var12;
			hh.pg_fld = var3;
			pr.pv_fld = var4;
		} else {
			ke.jd_fld = -1242416717 * (var0 - var10);
			cs.jy_fld = var1 - var11;
			gk.jc_fld = var2 - var12;
			hu.je_fld = var3;
			ab.jx_fld = var4;
		}

		if (client.dg_fld == 1) {
			tu var21;
			var21 = sq.ek();
			int var23 = (int)var21.ay_fld;
			int var25 = (int)var21.ar_fld;
			label66:
			if (client.jl_fld >= 2 && 0 == client.dv_fld % 50) {
				if (ga.mr_fld >> 7 == var23 >> 7) {
					if (an.mu_fld >> 7 == var25 >> 7) {
						break label66;
					}

					if (var7 != -1718204807) {
						return;
					}
				}

				int var16 = (int)var21.as_fld;
				int var17 = (ga.mr_fld >> 7) + bw.dk_fld.ay_fld;
				int var18 = bw.dk_fld.as_fld + (an.mu_fld >> 7);
				bu.he(var17, var18, var16, true);
			}

			var21.ah();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILde;)V"
	)
	void ay(JSONArray var1, int var2, de var3) throws JSONException {
		if (null != var1) {
			for (int var4 = 0; var4 < var1.length(); var4++) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						mj var7 = new mj();

						try {
							var7.ah(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.as_fld.isEmpty()) {
							String var8 = var5.getString("location");
							this.az_fld.put(var8, var7);
						}
					}
				}
			}

			this.az_fld = this.az();
			lz.ak();
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Lorg/json/JSONArray;ILde;)V"
	)
	public static void kd(mo var0, JSONArray var1, int var2, de var3) throws JSONException {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var1) {
			for (int var4 = 0; var4 < var1.length(); var4++) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						mj var7 = new mj();

						try {
							var7.ah(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.as_fld.isEmpty()) {
							String var8 = var5.getString("location");
							var0.az_fld.put(var8, var7);
						}
					}
				}
			}

			var0.az_fld = var0.az();
			lz.ak();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lmj;"
	)
	mj av(String var1, int var2) {
		return (mj)(mj)this.az_fld.get(var1);
	}
}
