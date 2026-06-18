import java.util.Iterator;
import net.runelite.api.ChatMessageType;
import net.runelite.api.MessageNode;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements({"MessageNode"})
public class co extends vc implements MessageNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String aw_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1262276963
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1377519445
	)
	int az_fld;
	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String xp_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Laax;"
	)
	aax ae_fld;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int es_fld = (int)(System.currentTimeMillis() / 1000L);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	rw as_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	rw ay_fld = rw.ak_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1492045231
	)
	int ak_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public static byte[][][] ad_fld;

	@ObfuscatedName("setSender")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Export("setSender")
	@Override
	public void setSender(String var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void at() {
		this.ay_fld = la.fq_fld.ae_fld.bo(this.ae_fld, -1107590382) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ag(int var1) {
		this.ay_fld = rw.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ay(int var1) {
		if (null != this.av_fld) {
			this.ae_fld = new aax(cr.hs(this.av_fld), fr.gv_fld);
		} else {
			this.ae_fld = null;
		}
	}

	co(int var1, String var2, String var3, String var4) {
		this.as_fld = rw.ak_fld;
		this.ak(var1, var2, var3, var4, (byte)1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae(int var1) {
		this.as_fld = rw.ak_fld;
	}

	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "(Lco;)V"
	)
	public static void vd(co var0) {
		if (null != var0.av_fld) {
			var0.ae_fld = new aax(cr.hs(var0.av_fld), fr.gv_fld);
		} else {
			var0.ae_fld = null;
		}
	}

	@ObfuscatedName("setTimestamp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setTimestamp")
	@Override
	public void setTimestamp(int var1) {
		this.es_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	final boolean ah(short var1) {
		if (rw.ak_fld == this.as_fld) {
			this.aw(136257958);
		}

		return rw.ag_fld == this.as_fld;
	}

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "(Lco;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public static void vl(co var0, int var1, String var2, String var3, String var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = ky.ak();
			var0.ag_fld = 341995813 * client.dv_fld;
			var0.az_fld = var1;
			var0.av_fld = var2;
			var0.ay(389742450);
			var0.ah_fld = var3;
			var0.aw_fld = var4;
			var0.ag(-114594914);
			var0.ae(-599858974);
		}
	}

	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "(Lco;)V"
	)
	public static void ry(co var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.as_fld = rw.ak_fld;
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Lcx;Lss;Lsb;)V"
	)
	public static void ga(cx var0, ss var1, sb var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = var1;
		var0.ae_fld = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ap() {
		this.ay_fld = rw.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int az(int var0, int var1) {
		bg var3 = (bg)xz.tw(bg.ak_fld, var0);
		if (null == var3) {
			return 0;
		} else if (-1 == var1) {
			return 0;
		} else {
			int var4 = 0;

			for (int var5 = 0; var5 < var3.az_fld.length; var5++) {
				if (var3.ag_fld[var5] == var1) {
					var4 += var3.az_fld[var5];
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("setRuneLiteFormatMessage")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Export("setRuneLiteFormatMessage")
	@Override
	public void setRuneLiteFormatMessage(String var1) {
		this.xp_fld = var1;
	}

	@ObfuscatedName("getRuneLiteFormatMessage")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getRuneLiteFormatMessage")
	@Override
	public String getRuneLiteFormatMessage() {
		return this.xp_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	void ar(int var1, String var2, String var3, String var4) {
		this.ak_fld = ky.ak();
		this.ag_fld = 341995813 * client.dv_fld;
		this.az_fld = var1;
		this.av_fld = var2;
		this.ay(1617399602);
		this.ah_fld = var3;
		this.aw_fld = var4;
		this.ag(-114594914);
		this.ae(-910642887);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILjava/lang/Object;I)V"
	)
	public static void am(sl var0, int var1, Object var2, int var3) {
		om.ap(var0, null, true, (byte)0);
		if (var1 >= 0) {
			if (var3 >= -1623990957) {
				return;
			}

			if (var1 <= var0.av_fld) {
				var0.ay(1 + var0.av_fld, -210674912);
				if (var1 < var0.av_fld) {
					if (var3 >= -1623990957) {
						return;
					}

					eb.aj(var0, var1, var0, 1 + var1, var0.av_fld - var1);
				}

				var0.ah(var1, var2);
				var0.av_fld++;
				return;
			}
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean aa() {
		if (rw.ak_fld == this.ay_fld) {
			this.av(-776631127);
		}

		return rw.ag_fld == this.ay_fld;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Lco;B)Z"
	)
	public static boolean de(co var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (rw.ak_fld == var0.ay_fld) {
			var0.av(-776631127);
		}

		return rw.ag_fld == var0.ay_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ax() {
		this.ay_fld = la.fq_fld.ae_fld.bo(this.ae_fld, 1531468307) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V"
	)
	void ak(int var1, String var2, String var3, String var4, byte var5) {
		this.ak_fld = ky.ak();
		this.ag_fld = 341995813 * client.dv_fld;
		this.az_fld = var1;
		this.av_fld = var2;
		this.ay(1126341964);
		this.ah_fld = var3;
		this.aw_fld = var4;
		this.ag(-114594914);
		this.ae(-1090804715);
		this.bo(var1, var2, var3, var4);
	}

	@ObfuscatedName("getTimestamp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTimestamp")
	@Override
	public int getTimestamp() {
		return this.es_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ad() {
		this.ay_fld = la.fq_fld.ae_fld.bo(this.ae_fld, -923920756) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(Lco;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public static void qt(co var0, int var1, String var2, String var3, String var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = ky.ak();
		var0.ag_fld = 341995813 * client.dv_fld;
		var0.az_fld = var1;
		var0.av_fld = var2;
		var0.ay(203369751);
		var0.ah_fld = var3;
		var0.aw_fld = var4;
		var0.ag(-114594914);
		var0.ae(-760512024);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lco;)Z"
	)
	public static boolean ac(co var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (rw.ak_fld == var0.ay_fld) {
				var0.av(-776631127);
			}

			return rw.ag_fld == var0.ay_fld;
		}
	}

	@ObfuscatedName("getSender")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getSender")
	@Override
	public String getSender() {
		return this.ah_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		rw var10001;
		if (la.fq_fld.ah_fld.bo(this.ae_fld, 769031118)) {
			if (var1 >= 1167023281) {
				return;
			}

			var10001 = rw.ag_fld;
		} else {
			var10001 = rw.az_fld;
		}

		this.as_fld = var10001;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void an() {
		this.as_fld = rw.ak_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bz() {
		this.ay_fld = rw.ak_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean ac() {
		if (rw.ak_fld == this.as_fld) {
			this.aw(361624340);
		}

		return rw.ag_fld == this.as_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean aj() {
		if (rw.ak_fld == this.as_fld) {
			this.aw(-845866605);
		}

		return rw.ag_fld == this.as_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void bo(int var1, String var2, String var3, String var4) {
		this.xp_fld = null;
		this.es_fld = (int)(System.currentTimeMillis() / 1000L);
		if (var2 != null) {
			int var5 = var2.lastIndexOf(62);
			if (var5 != -1) {
				this.ae_fld = new aax(var2.substring(var5 + 1), fr.gv_fld);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lgn;)I"
	)
	public static int ac(gn var0) {
		return var0.bx_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean bm() {
		if (rw.ak_fld == this.as_fld) {
			this.aw(-1068061815);
		}

		return rw.ag_fld == this.as_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean bd() {
		if (rw.ak_fld == this.as_fld) {
			this.aw(-1369558937);
		}

		return rw.ag_fld == this.as_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ab() {
		this.as_fld = la.fq_fld.ah_fld.bo(this.ae_fld, -2124855269) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void br() {
		if (null != this.av_fld) {
			this.ae_fld = new aax(cr.hs(this.av_fld), fr.gv_fld);
		} else {
			this.ae_fld = null;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void be() {
		if (null != this.av_fld) {
			this.ae_fld = new aax(cr.hs(this.av_fld), fr.gv_fld);
		} else {
			this.ae_fld = null;
		}
	}

	@ObfuscatedName("setValue")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Export("setValue")
	@Override
	public void setValue(String var1) {
		ChatMessageType var2 = ChatMessageType.of(this.az_fld);
		if ((var2 == ChatMessageType.CLAN_CHAT || var2 == ChatMessageType.CLAN_MESSAGE) && this.aw_fld != null && this.aw_fld.startsWith("|")) {
			this.aw_fld = "|" + var1;
		} else {
			this.aw_fld = var1;
		}
	}

	@ObfuscatedName("setName")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Export("setName")
	@Override
	public void setName(String var1) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.av_fld = var1;
			int var2 = var1.lastIndexOf(62);
			if (var2 != -1) {
				var1 = var1.substring(var2 + 1);
			}

			this.ae_fld = new aax(var1, fr.gv_fld);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void av(int var1) {
		rw var10001;
		if (la.fq_fld.ae_fld.bo(this.ae_fld, 652588147)) {
			if (var1 != -776631127) {
				return;
			}

			var10001 = rw.ag_fld;
		} else {
			var10001 = rw.az_fld;
		}

		this.ay_fld = var10001;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void bk(int var0) {
		if (nv.ok_fld) {
			if (null != jr.fa_fld) {
				jr.fa_fld.ba((byte)0);
			}

			Iterator var1 = client.da_fld.iterator();

			while (var1.hasNext()) {
				dx var2 = (dx)(dx)var1.next();

				for (int var3 = 0; var3 < client.db_fld.al_fld; var3++) {
					if (var0 >= -836183525) {
						return;
					}

					cv var4 = (cv)bw.dk_fld.au_fld.ae(client.db_fld.ar_fld[var3]);
					if (var4 != null) {
						if (var0 >= -836183525) {
							return;
						}

						var4.ar(626304450);
					}
				}
			}

			nv.ok_fld = false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	void al(int var1, String var2, String var3, String var4) {
		this.ak_fld = ky.ak();
		this.ag_fld = 341995813 * client.dv_fld;
		this.az_fld = var1;
		this.av_fld = var2;
		this.ay(452185001);
		this.ah_fld = var3;
		this.aw_fld = var4;
		this.ag(-114594914);
		this.ae(-1610017497);
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		return this.av_fld;
	}

	@ObfuscatedName("getType")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/ChatMessageType;"
	)
	@Export("getType")
	@Override
	public ChatMessageType getType() {
		ChatMessageType var1 = ChatMessageType.of(this.az_fld);
		if (var1 == ChatMessageType.CLAN_CHAT) {
			if (this.aw_fld != null && this.aw_fld.startsWith("|")) {
				return ChatMessageType.CLAN_GIM_CHAT;
			}
		} else if (var1 == ChatMessageType.CLAN_MESSAGE && this.aw_fld != null && this.aw_fld.startsWith("|")) {
			return ChatMessageType.CLAN_GIM_MESSAGE;
		}

		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)Ljava/lang/Object;"
	)
	public static Object ad(sl var0, int var1) {
		om.ap(var0, null, true, (byte)0);
		if (var1 >= 0 && var1 < var0.av_fld) {
			Object var3 = var0.ae(var1);
			if (var1 < var0.av_fld - 1) {
				eb.aj(var0, 1 + var1, var0, var1, var0.av_fld - (1 + var1));
			}

			var0.af(var0.av_fld - 1);
			return var3;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("getValue")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getValue")
	@Override
	public String getValue() {
		if (this.aw_fld != null && this.aw_fld.startsWith("|")) {
			ChatMessageType var1 = ChatMessageType.of(this.az_fld);
			if (var1 == ChatMessageType.CLAN_CHAT || var1 == ChatMessageType.CLAN_MESSAGE) {
				return this.aw_fld.substring(1);
			}
		}

		return this.aw_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void am() {
		this.as_fld = rw.ak_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return this.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	final boolean az(byte var1) {
		if (rw.ak_fld == this.as_fld) {
			this.aw(-776631127);
		}

		return rw.ag_fld == this.as_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ao() {
		this.as_fld = la.fq_fld.ae_fld.bo(this.ae_fld, -923920756) ? rw.az_fld : rw.az_fld;
	}
}
