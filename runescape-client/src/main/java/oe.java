import java.io.EOFException;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.Nullable;
import net.runelite.api.IterableHashTable;
import net.runelite.api.ObjectComposition;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PostObjectComposition;

@ObfuscatedName("oe")
@Implements({"ObjectComposition"})
public class oe extends vc implements ObjectComposition, rl9 {
	@ObfuscatedGetter(
		intValue = -720581821
	)
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dq_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bl_fld;
	@ObfuscatedGetter(
		intValue = 983461143
	)
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dz_fld;
	// $VF: synthetic field
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean fj_fld = !oe.class.desiredAssertionStatus();
	@ObfuscatedGetter(
		intValue = 474403367
	)
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cj_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean cy_fld = false;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw cs_fld = new iw(256);
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw cp_fld = new iw(256);
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "[Leg;"
	)
	static eg[] ce_fld = new eg[4];
	@ObfuscatedGetter(
		intValue = 1047437829
	)
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cn_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] cr_fld;
	@ObfuscatedGetter(
		intValue = 1238580985
	)
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int da_fld;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean dd_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw cq_fld = new iw(4096);
	@ObfuscatedGetter(
		intValue = -855015999
	)
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dx_fld;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] cw_fld;
	@ObfuscatedGetter(
		intValue = -1965561033
	)
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dv_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] cm_fld;
	@ObfuscatedGetter(
		intValue = 805564573
	)
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dk_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] cz_fld;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ci_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = -984086507
	)
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ch_fld;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean do_fld;
	@ObfuscatedGetter(
		intValue = 695712753
	)
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int co_fld;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean cl_fld;
	@ObfuscatedGetter(
		intValue = -1071654907
	)
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dh_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String cg_fld = kh.aj_fld;
	@ObfuscatedGetter(
		intValue = -1976168273
	)
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dn_fld;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	pb dt_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ca_fld;
	@ObfuscatedGetter(
		intValue = 1444253843
	)
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cb_fld = 1195249051;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean db_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedGetter(
		intValue = -552750235
	)
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dl_fld;
	@ObfuscatedGetter(
		intValue = -534177005
	)
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dr_fld;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] ck_fld;
	@ObfuscatedGetter(
		intValue = -1716393177
	)
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cu_fld;
	@ObfuscatedGetter(
		intValue = -820854325
	)
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dm_fld;
	@ObfuscatedGetter(
		intValue = -1980693817
	)
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ds_fld;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean du_fld;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ct_fld;
	@ObfuscatedGetter(
		intValue = 474996133
	)
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dg_fld;
	@ObfuscatedGetter(
		intValue = 1792932417
	)
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dc_fld;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] dy_fld;
	@ObfuscatedGetter(
		intValue = -532383575
	)
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int di_fld;
	@ObfuscatedGetter(
		intValue = 1550178577
	)
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dw_fld;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lwv;"
	)
	wv df_fld;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lwn;"
	)
	wn de_fld;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean dp_fld;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean dj_fld;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv es_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw cv_fld = new iw(500);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lfn;"
	)
	public final fn af(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
		try {
			long var8;
			if (this.ca_fld == null) {
				var8 = (this.cn_fld << 10) + var2;
			} else {
				var8 = var2 + (var1 << 3) + (this.cn_fld << 10);
			}

			fn var10 = (fn)cp_fld.ak(var8);
			if (null == var10) {
				eg var11 = this.au(var1, var2, (byte)121);
				if (var11 == null) {
					return null;
				}

				var10 = var11.bx(this.dv_fld + 64, this.dz_fld + 768, -50, -10, -50);
				cp_fld.az(var10, var8);
			}

			if (this.ch_fld >= 0) {
				var10 = var10.aw(var3, var4, var5, var6, true, this.ch_fld);
			}

			return var10;
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	oe() {
		this.co_fld = -1954687727;
		this.cu_fld = 1589487918;
		this.ci_fld = true;
		this.cj_fld = 2137293417;
		this.ch_fld = 1669888195;
		this.do_fld = false;
		this.cl_fld = false;
		this.dc_fld = 1688267327;
		this.dh_fld = 355683536;
		this.dv_fld = 0;
		this.dz_fld = 0;
		this.dm_fld = -1796299747;
		this.dq_fld = 127624853;
		this.db_fld = false;
		this.dd_fld = true;
		this.dl_fld = 748893824;
		this.dr_fld = 712215936;
		this.da_fld = -1886280576;
		this.dk_fld = 0;
		this.dx_fld = 0;
		this.ds_fld = 0;
		this.du_fld = false;
		this.ct_fld = false;
		this.dg_fld = 1110195667;
		this.dw_fld = 0;
		this.di_fld = -478391193;
		this.dn_fld = -1905215055;
		this.df_fld = new wv();
		this.de_fld = new wn();
		this.dp_fld = true;
		this.dj_fld = false;
		this.dt_fld = new pb();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void aw(xi var1, int var2, int var3) {
		switch (var2) {
			case 2:
				this.cg_fld = xi.kc(var1, -418052137);
			case 3:
			case 4:
			case 5:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 16:
			case 20:
			case 25:
			case 26:
			case 35:
			case 36:
			case 37:
			case 38:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 63:
			case 76:
			case 80:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 94:
			case 97:
			case 98:
			case 99:
			case 103:
			case 104:
			case 105:
			case 106:
			case 107:
			case 108:
			case 109:
			case 110:
			case 111:
			case 112:
			case 113:
			case 114:
			case 115:
			case 116:
			case 117:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122:
			case 123:
			case 124:
			case 125:
			case 126:
			case 127:
			case 128:
			case 129:
			case 130:
			case 131:
			case 132:
			case 133:
			case 134:
			case 135:
			case 136:
			case 137:
			case 138:
			case 139:
			case 140:
			case 141:
			case 142:
			case 143:
			case 144:
			case 145:
			case 146:
			case 147:
			case 148:
			case 149:
			case 150:
			case 151:
			case 152:
			case 153:
			case 154:
			case 155:
			case 156:
			case 157:
			case 158:
			case 159:
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 175:
			case 176:
			case 177:
			case 178:
			case 179:
			case 180:
			case 181:
			case 182:
			case 183:
			case 184:
			case 185:
			case 186:
			case 187:
			case 188:
			case 189:
			case 190:
			case 191:
			case 192:
			case 193:
			case 194:
			case 195:
			case 196:
			case 197:
			case 198:
			case 199:
			case 200:
			case 201:
			case 202:
			case 203:
			case 204:
			case 205:
			case 206:
			case 207:
			case 208:
			case 209:
			case 210:
			case 211:
			case 212:
			case 213:
			case 214:
			case 215:
			case 216:
			case 217:
			case 218:
			case 219:
			case 220:
			case 221:
			case 222:
			case 223:
			case 224:
			case 225:
			case 226:
			case 227:
			case 228:
			case 229:
			case 230:
			case 231:
			case 232:
			case 233:
			case 234:
			case 235:
			case 236:
			case 237:
			case 238:
			case 239:
			case 240:
			case 241:
			case 242:
			case 243:
			case 244:
			case 245:
			case 246:
			case 247:
			case 248:
			default:
				break;
			case 6:
				int var17 = var1.cg();
				if (var17 > 0) {
					if (this.cr_fld != null && !cy_fld) {
						var1.au_fld = var1.au_fld + var17 * (wa.ak_fld.ak() + 1) * 228932457;
					} else {
						this.ca_fld = new int[var17];
						this.cr_fld = new int[var17];

						for (int var25 = 0; var25 < var17; var25++) {
							this.cr_fld[var25] = var1.dl(wa.ak_fld.az_fld);
							this.ca_fld[var25] = var1.cg();
						}
					}
				}
				break;
			case 7:
				int var16 = var1.cg();
				if (var16 > 0) {
					if (null != this.cr_fld) {
						if (!cy_fld) {
							var1.au_fld = var1.au_fld + var16 * wa.ak_fld.ak() * 228932457;
							return;
						}

						if (var3 <= 1537432430) {
							return;
						}
					}

					this.ca_fld = null;
					this.cr_fld = new int[var16];

					for (int var24 = 0; var24 < var16; var24++) {
						if (var3 <= 1537432430) {
							return;
						}

						this.cr_fld[var24] = var1.dl(wa.ak_fld.az_fld);
					}
				}
				break;
			case 14:
				this.cb_fld = var1.cg();
				break;
			case 15:
				this.co_fld = var1.cg();
				break;
			case 17:
				this.cu_fld = 0;
				this.ci_fld = false;
				break;
			case 18:
				this.ci_fld = false;
				break;
			case 19:
				this.cj_fld = var1.cg();
				break;
			case 21:
				this.ch_fld = 0;
				break;
			case 22:
				this.do_fld = true;
				break;
			case 23:
				this.cl_fld = true;
				break;
			case 24:
				this.dc_fld = xi.tx(var1, 1092772045);
				if (this.dc_fld == 65535) {
					this.dc_fld = 1688267327;
				}
				break;
			case 27:
				this.cu_fld = -1352739689;
				break;
			case 28:
				this.dh_fld = var1.cg();
				break;
			case 29:
				this.dv_fld = xi.rp(var1, 1211962054);
				break;
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 100:
			case 101:
			case 102:
				this.dt_fld.am(var1, var2, 30, 34, 100, 101, 102, (byte)-48);
				break;
			case 39:
				this.dz_fld = xi.rp(var1, -1826223075) * -751297969;
				break;
			case 40:
				int var15 = var1.cg();
				this.cm_fld = new short[var15];
				this.ck_fld = new short[var15];

				for (int var23 = 0; var23 < var15; var23++) {
					this.cm_fld[var23] = (short)xi.tx(var1, 584221124);
					this.ck_fld[var23] = (short)xi.tx(var1, 1084096532);
				}
				break;
			case 41:
				int var14 = var1.cg();
				this.cw_fld = new short[var14];
				this.cz_fld = new short[var14];

				for (int var22 = 0; var22 < var14; var22++) {
					this.cw_fld[var22] = (short)xi.tx(var1, 1279557482);
					this.cz_fld[var22] = (short)xi.tx(var1, 2048928542);
				}
				break;
			case 61:
				xi.tx(var1, 1478382609);
				break;
			case 62:
				this.db_fld = true;
				break;
			case 64:
				this.dd_fld = false;
				break;
			case 65:
				this.dl_fld = xi.tx(var1, 1588223547);
				break;
			case 66:
				this.dr_fld = xi.tx(var1, 495139051);
				break;
			case 67:
				this.da_fld = xi.tx(var1, 1626773831);
				break;
			case 68:
				this.dq_fld = xi.tx(var1, 852731744);
				break;
			case 69:
				var1.cg();
				break;
			case 70:
				this.dk_fld = var1.cz();
				break;
			case 71:
				this.dx_fld = var1.cz();
				break;
			case 72:
				this.ds_fld = var1.cz();
				break;
			case 73:
				this.du_fld = true;
				break;
			case 74:
				this.ct_fld = true;
				break;
			case 75:
				this.dg_fld = var1.cg();
				break;
			case 77:
			case 92:
				this.di_fld = xi.tx(var1, 1321493007);
				if (this.di_fld == 65535) {
					this.di_fld = -478391193;
				}

				this.dn_fld = xi.tx(var1, 1264833946);
				if (this.dn_fld == 65535) {
					this.dn_fld = -1905215055;
				}

				int var13 = -1;
				if (var2 == 92) {
					if (var3 <= 1537432430) {
						return;
					}

					var13 = xi.tx(var1, 502742358);
					if (var13 == 65535) {
						if (var3 <= 1537432430) {
							return;
						}

						var13 = -1;
					}
				}

				int var21 = var1.cg();
				this.dy_fld = new int[2 + var21];

				for (int var27 = 0; var27 <= var21; var27++) {
					if (var3 <= 1537432430) {
						return;
					}

					this.dy_fld[var27] = xi.tx(var1, 701572771);
					if (this.dy_fld[var27] == 65535) {
						this.dy_fld[var27] = -1;
					}
				}

				this.dy_fld[1 + var21] = var13;
				break;
			case 78:
				this.df_fld.ag_fld = xi.tx(var1, 1943278898);
				this.df_fld.az_fld = var1.cg();
				this.df_fld.ak_fld = var1.cg();
				break;
			case 79:
				this.de_fld.ag_fld = xi.tx(var1, 1673321167);
				this.de_fld.az_fld = xi.tx(var1, 1552394488);
				this.df_fld.az_fld = var1.cg();
				this.df_fld.ak_fld = var1.cg();
				int var12 = var1.cg();
				this.de_fld.ak_fld = new int[var12];

				for (int var20 = 0; var20 < var12; var20++) {
					this.de_fld.ak_fld[var20] = xi.tx(var1, 498824235);
				}
				break;
			case 81:
				this.ch_fld = var1.cg() * 2005351680;
				break;
			case 82:
				this.dm_fld = xi.tx(var1, 1582475015);
				break;
			case 89:
				this.dp_fld = false;
				break;
			case 90:
				this.dj_fld = true;
				break;
			case 91:
				wh var11 = this.df_fld.av_fld;
				int var26 = var1.cg();
				zm var19 = zm.br_fld[var26];
				var11.az(var19);
				break;
			case 93:
				wh var10 = this.df_fld.av_fld;
				int var6 = var1.cg();
				zm var18 = zm.br_fld[var6];
				var10.ak(var18, xi.tx(var1, 1012211134));
				wh var7 = this.df_fld.av_fld;
				int var9 = var1.cg();
				zm var8 = zm.br_fld[var9];
				var7.ag(var8, xi.tx(var1, 1549133916));
				break;
			case 95:
				wv var4 = this.df_fld;
				kr[] var5 = new kr[]{kr.ag_fld, kr.az_fld, kr.ak_fld};
				var4.ae_fld = (kr)ka.ak(var5, var1.cg());
				break;
			case 96:
				this.dw_fld = var1.cg();
				break;
			case 249:
				this.es_fld = nc.ak(var1, this.es_fld);
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Loe;I)I"
	)
	public static int fw(oe var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 != 1 && var1 != 3 ? var0.co_fld : var0.cb_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int bw(int var1, int var2) {
		return my.ag(this.es_fld, var1, var2);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
	)
	public String cd(int var1, String var2) {
		return ih.av(this.es_fld, var1, var2);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int be() {
		return this.co_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILol;II)Lfn;"
	)
	public final fn al(int var1, int var2, int[][] var3, int var4, int var5, int var6, ol var7, int var8, int var9) {
		try {
			return this.ry(rl21.no_fld, var1, var2, var3, var4, var5, var6, var7, var8);
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)Leg;"
	)
	final eg au(int var1, int var2, byte var3) {
		try {
			synchronized (cv_fld) {
				int var7 = var1;
				oe var6 = this;
				byte var9 = 121;
				eg var10 = null;
				if (null == this.ca_fld) {
					if (10 != var1) {
						return null;
					}

					if (null == this.cr_fld) {
						return null;
					}

					boolean var11 = this.db_fld;
					if (2 == var1 && var2 > 3) {
						var11 = !var11;
					}

					int var12 = this.cr_fld.length;

					for (int var13 = 0; var13 < var12; var13++) {
						int var14 = var6.cr_fld[var13];
						int var15 = var14;
						if (var11) {
							var15 = -var14;
						}

						var10 = (eg)cv_fld.ak(var15);
						if (null == var10) {
							var10 = eg.ak(dm.cx_fld, var14, 0);
							if (null == var10) {
								return null;
							}

							if (var11) {
								var10.bh();
							}

							cv_fld.az(var10, var15);
						}

						if (var12 > 1) {
							ce_fld[var13] = var10;
						}
					}

					if (var12 > 1) {
						var10 = new eg(ce_fld, var12);
					}
				} else {
					int var23 = -1;

					for (int var25 = 0; var25 < var6.ca_fld.length; var25++) {
						if (var7 == var6.ca_fld[var25]) {
							var23 = var25;
							break;
						}
					}

					if (var23 == -1) {
						return null;
					}

					int var26 = var6.cr_fld[var23];
					int var28 = var26;
					boolean var30 = var6.db_fld ^ var2 > 3;
					if (var30) {
						var28 = var26 + 65536;
					}

					var10 = (eg)cv_fld.ak(var28);
					if (var10 == null) {
						var10 = eg.ak(dm.cx_fld, var26, 0);
						if (null == var10) {
							return null;
						}

						if (var30) {
							var10.bh();
						}

						cv_fld.az(var10, var28);
					}
				}

				boolean var24;
				if (var6.dl_fld == 128 && var6.dr_fld == 128 && var6.da_fld == 128) {
					var24 = false;
				} else {
					var24 = true;
				}

				boolean var27;
				if (var6.dk_fld == 0 && var6.dx_fld == 0 && 0 == var6.ds_fld) {
					var27 = false;
				} else {
					var27 = true;
				}

				eg var29 = new eg(var10, 0 == var2 && !var24 && !var27, var6.cm_fld == null, null == var6.cw_fld, true);
				if (var7 == 4 && var2 > 3) {
					var29.dc(256);
					var29.dh(45, 0, -45);
				}

				int var8 = var2 & 3;
				if (var8 == 1) {
					var29.aj();
				} else if (2 == var8) {
					var29.bm();
				} else if (3 == var8) {
					st.ps(var29);
				}

				if (var6.cm_fld != null) {
					for (int var31 = 0; var31 < var6.cm_fld.length; var31++) {
						eg.hm(var29, var6.cm_fld[var31], var6.ck_fld[var31]);
					}
				}

				if (null != var6.cw_fld) {
					for (int var32 = 0; var32 < var6.cw_fld.length; var32++) {
						var29.bs(var6.cw_fld[var32], var6.cz_fld[var32]);
					}
				}

				if (var24) {
					var29.br(var6.dl_fld, var6.dr_fld, var6.da_fld);
				}

				if (var27) {
					var29.dh(var6.dk_fld, var6.dx_fld, var6.ds_fld);
				}

				return var29;
			}
		} catch (Throwable var17) {
			throw new RuntimeException(var17);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int an(int var1, int var2, int var3) {
		return my.ag(this.es_fld, var1, var2);
	}

	@ObfuscatedName("getParams")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/IterableHashTable;"
	)
	@Override
	public IterableHashTable getParams() {
		return this.es_fld;
	}

	@ObfuscatedName("getVarPlayerId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getVarPlayerId() {
		return this.dn_fld;
	}

	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;II[[IIIILol;I)Lfn;"
	)
	public fn ry(@Nullable rl21 var1, int var2, int var3, int[][] var4, int var5, int var6, int var7, ol var8, int var9) {
		try {
			long var10;
			if (this.ca_fld == null) {
				var10 = var3 + (this.cn_fld << 10);
			} else {
				var10 = var3 + (var2 << 3) + (this.cn_fld << 10);
			}

			fn var12;
			synchronized (cp_fld) {
				var12 = (fn)cp_fld.de(var10);
			}

			if (var12 == null) {
				eg var20 = this.gv(var2, var3);
				if (var20 == null) {
					return null;
				}

				var12 = var20.light(this.dv_fld + 64, this.dz_fld + 768, -50, -10, -50);
				synchronized (cp_fld) {
					cp_fld.nk(var12, var10);
				}
			}

			if (var8 == null && this.ch_fld == -1) {
				return var12;
			} else {
				if (var8 != null) {
					if (!fj_fld && var1 == null) {
						throw new AssertionError();
					}

					var12 = var8.xj(var1, var12, var9, var3);
				} else if (var1 != null) {
					var12 = var12.to(var1, true);
				}

				if (this.ch_fld >= 0 && var4 != null) {
					var12 = var12.bc(var4, var5, var6, var7, var1 == null, this.ch_fld);
				}

				return var12;
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long aa(int var1, long var2) {
		return hq.az(this.es_fld, var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;"
	)
	public String ai(int var1, String var2, int var3) {
		return ih.av(this.es_fld, var1, var2);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void bz() {
		cq_fld.vh();
		cv_fld.vh();
		cs_fld.vh();
		cp_fld.vh();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Loq;"
	)
	public oq ap() {
		return this.dt_fld;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "()Loe;"
	)
	public oe getImpostor() {
		try {
			return this.ax((byte)99);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getMapIconId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMapIconId() {
		return this.dm_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Loe;"
	)
	public final oe ax(byte var1) {
		try {
			int var2 = -1;
			if (this.di_fld != -1) {
				var2 = dv.ag(this.di_fld, (byte)90);
			} else if (this.dn_fld != -1) {
				var2 = rt.ag_fld[this.dn_fld];
			}

			int var3;
			if (var2 >= 0 && var2 < this.dy_fld.length - 1) {
				var3 = this.dy_fld[var2];
			} else {
				var3 = this.dy_fld[this.dy_fld.length - 1];
			}

			return -1 != var3 ? ko.az(var3) : null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getVarbitId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getVarbitId() {
		return this.di_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public int ao(int var1, byte var2) {
		return 1 != var1 && 3 != var1 ? this.cb_fld : this.co_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lwn;"
	)
	public wn ad(byte var1) {
		return this.de_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Loq;"
	)
	public oq at() {
		return this.dt_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Loq;"
	)
	public oq ac() {
		return this.dt_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void bk(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.cg_fld = xi.kc(var1, -1925508014);
			case 3:
			case 4:
			case 5:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 16:
			case 20:
			case 25:
			case 26:
			case 35:
			case 36:
			case 37:
			case 38:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 63:
			case 76:
			case 80:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 94:
			case 97:
			case 98:
			case 99:
			case 103:
			case 104:
			case 105:
			case 106:
			case 107:
			case 108:
			case 109:
			case 110:
			case 111:
			case 112:
			case 113:
			case 114:
			case 115:
			case 116:
			case 117:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122:
			case 123:
			case 124:
			case 125:
			case 126:
			case 127:
			case 128:
			case 129:
			case 130:
			case 131:
			case 132:
			case 133:
			case 134:
			case 135:
			case 136:
			case 137:
			case 138:
			case 139:
			case 140:
			case 141:
			case 142:
			case 143:
			case 144:
			case 145:
			case 146:
			case 147:
			case 148:
			case 149:
			case 150:
			case 151:
			case 152:
			case 153:
			case 154:
			case 155:
			case 156:
			case 157:
			case 158:
			case 159:
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 175:
			case 176:
			case 177:
			case 178:
			case 179:
			case 180:
			case 181:
			case 182:
			case 183:
			case 184:
			case 185:
			case 186:
			case 187:
			case 188:
			case 189:
			case 190:
			case 191:
			case 192:
			case 193:
			case 194:
			case 195:
			case 196:
			case 197:
			case 198:
			case 199:
			case 200:
			case 201:
			case 202:
			case 203:
			case 204:
			case 205:
			case 206:
			case 207:
			case 208:
			case 209:
			case 210:
			case 211:
			case 212:
			case 213:
			case 214:
			case 215:
			case 216:
			case 217:
			case 218:
			case 219:
			case 220:
			case 221:
			case 222:
			case 223:
			case 224:
			case 225:
			case 226:
			case 227:
			case 228:
			case 229:
			case 230:
			case 231:
			case 232:
			case 233:
			case 234:
			case 235:
			case 236:
			case 237:
			case 238:
			case 239:
			case 240:
			case 241:
			case 242:
			case 243:
			case 244:
			case 245:
			case 246:
			case 247:
			case 248:
			default:
				break;
			case 6:
				int var16 = var1.cg();
				if (var16 > 0) {
					if (this.cr_fld != null && !cy_fld) {
						var1.au_fld = var1.au_fld + var16 * (wa.ak_fld.ak() + 1) * 228932457;
					} else {
						this.ca_fld = new int[var16];
						this.cr_fld = new int[var16];

						for (int var24 = 0; var24 < var16; var24++) {
							this.cr_fld[var24] = var1.dl(wa.ak_fld.az_fld);
							this.ca_fld[var24] = var1.cg();
						}
					}
				}
				break;
			case 7:
				int var15 = var1.cg();
				if (var15 > 0) {
					if (null != this.cr_fld && !cy_fld) {
						var1.au_fld = var1.au_fld + var15 * wa.ak_fld.ak() * 228932457;
					} else {
						this.ca_fld = null;
						this.cr_fld = new int[var15];

						for (int var23 = 0; var23 < var15; var23++) {
							this.cr_fld[var23] = var1.dl(wa.ak_fld.az_fld);
						}
					}
				}
				break;
			case 14:
				this.cb_fld = var1.cg();
				break;
			case 15:
				this.co_fld = var1.cg();
				break;
			case 17:
				this.cu_fld = 0;
				this.ci_fld = false;
				break;
			case 18:
				this.ci_fld = false;
				break;
			case 19:
				this.cj_fld = var1.cg();
				break;
			case 21:
				this.ch_fld = 0;
				break;
			case 22:
				this.do_fld = true;
				break;
			case 23:
				this.cl_fld = true;
				break;
			case 24:
				this.dc_fld = xi.tx(var1, 1054244485);
				if (this.dc_fld == 65535) {
					this.dc_fld = 1688267327;
				}
				break;
			case 27:
				this.cu_fld = -1352739689;
				break;
			case 28:
				this.dh_fld = var1.cg();
				break;
			case 29:
				this.dv_fld = xi.rp(var1, 1264381049);
				break;
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 100:
			case 101:
			case 102:
				this.dt_fld.am(var1, var2, 30, 34, 100, 101, 102, (byte)-93);
				break;
			case 39:
				this.dz_fld = xi.rp(var1, -1609250262) * -751297969;
				break;
			case 40:
				int var14 = var1.cg();
				this.cm_fld = new short[var14];
				this.ck_fld = new short[var14];

				for (int var22 = 0; var22 < var14; var22++) {
					this.cm_fld[var22] = (short)xi.tx(var1, 1838999338);
					this.ck_fld[var22] = (short)xi.tx(var1, 1497247194);
				}
				break;
			case 41:
				int var13 = var1.cg();
				this.cw_fld = new short[var13];
				this.cz_fld = new short[var13];

				for (int var21 = 0; var21 < var13; var21++) {
					this.cw_fld[var21] = (short)xi.tx(var1, 736707428);
					this.cz_fld[var21] = (short)xi.tx(var1, 2015835259);
				}
				break;
			case 61:
				xi.tx(var1, 2058473496);
				break;
			case 62:
				this.db_fld = true;
				break;
			case 64:
				this.dd_fld = false;
				break;
			case 65:
				this.dl_fld = xi.tx(var1, 512536485);
				break;
			case 66:
				this.dr_fld = xi.tx(var1, 1687804656);
				break;
			case 67:
				this.da_fld = xi.tx(var1, 1378483250);
				break;
			case 68:
				this.dq_fld = xi.tx(var1, 1809092186);
				break;
			case 69:
				var1.cg();
				break;
			case 70:
				this.dk_fld = var1.cz();
				break;
			case 71:
				this.dx_fld = var1.cz();
				break;
			case 72:
				this.ds_fld = var1.cz();
				break;
			case 73:
				this.du_fld = true;
				break;
			case 74:
				this.ct_fld = true;
				break;
			case 75:
				this.dg_fld = var1.cg();
				break;
			case 77:
			case 92:
				this.di_fld = xi.tx(var1, 844691798);
				if (this.di_fld == 65535) {
					this.di_fld = -478391193;
				}

				this.dn_fld = xi.tx(var1, 1135435332);
				if (this.dn_fld == 65535) {
					this.dn_fld = -1905215055;
				}

				int var12 = -1;
				if (var2 == 92) {
					var12 = xi.tx(var1, 1938818764);
					if (var12 == 65535) {
						var12 = -1;
					}
				}

				int var20 = var1.cg();
				this.dy_fld = new int[2 + var20];

				for (int var26 = 0; var26 <= var20; var26++) {
					this.dy_fld[var26] = xi.tx(var1, 1151361785);
					if (this.dy_fld[var26] == 65535) {
						this.dy_fld[var26] = -1;
					}
				}

				this.dy_fld[1 + var20] = var12;
				break;
			case 78:
				this.df_fld.ag_fld = xi.tx(var1, 1280103656);
				this.df_fld.az_fld = var1.cg();
				this.df_fld.ak_fld = var1.cg();
				break;
			case 79:
				this.de_fld.ag_fld = xi.tx(var1, 1679540401);
				this.de_fld.az_fld = xi.tx(var1, 348400179);
				this.df_fld.az_fld = var1.cg();
				this.df_fld.ak_fld = var1.cg();
				int var11 = var1.cg();
				this.de_fld.ak_fld = new int[var11];

				for (int var19 = 0; var19 < var11; var19++) {
					this.de_fld.ak_fld[var19] = xi.tx(var1, 1294107012);
				}
				break;
			case 81:
				this.ch_fld = var1.cg() * 2005351680;
				break;
			case 82:
				this.dm_fld = xi.tx(var1, 1452671175);
				break;
			case 89:
				this.dp_fld = false;
				break;
			case 90:
				this.dj_fld = true;
				break;
			case 91:
				wh var10 = this.df_fld.av_fld;
				int var25 = var1.cg();
				zm var18 = zm.br_fld[var25];
				var10.az(var18);
				break;
			case 93:
				wh var9 = this.df_fld.av_fld;
				int var5 = var1.cg();
				zm var17 = zm.br_fld[var5];
				var9.ak(var17, xi.tx(var1, 1655507104));
				wh var6 = this.df_fld.av_fld;
				int var8 = var1.cg();
				zm var7 = zm.br_fld[var8];
				var6.ag(var7, xi.tx(var1, 2141890152));
				break;
			case 95:
				wv var3 = this.df_fld;
				kr[] var4 = new kr[]{kr.ag_fld, kr.az_fld, kr.ak_fld};
				var3.ae_fld = (kr)ka.ak(var4, var1.cg());
				break;
			case 96:
				this.dw_fld = var1.cg();
				break;
			case 249:
				this.es_fld = nc.ak(var1, this.es_fld);
		}
	}

	@ObfuscatedName("getSizeY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSizeY() {
		return this.co_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ah(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				return;
			}

			this.aw(var1, var3, 1663817508);
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cl() {
		try {
			return fq(this, -1094057003);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Loe;"
	)
	public static oe bm(int var0) throws EOFException {
		try {
			oe var1 = (oe)cq_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = if_.cf_fld.bb(6, var0, 584982574);
				var1 = new oe();
				var1.cn_fld = var0;
				if (var2 != null) {
					var1.ah(new xi(var2), 1154079818);
				}

				var1.ae(-1723249944);
				if (var1.ct_fld) {
					var1.cu_fld = 0;
					var1.ci_fld = false;
				}

				cq_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Loe;I)I"
	)
	public static int gc(oe var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return 1 != var1 && 3 != var1 ? var0.cb_fld : var0.co_fld;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Loe;"
	)
	public static oe bd_oe(int var0) throws EOFException {
		try {
			oe var1 = (oe)cq_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = if_.cf_fld.bb(6, var0, 584982574);
				var1 = new oe();
				var1.cn_fld = var0;
				if (var2 != null) {
					var1.ah(new xi(var2), -1731285566);
				}

				var1.ae(-1751271987);
				if (var1.ct_fld) {
					var1.cu_fld = 0;
					var1.ci_fld = false;
				}

				cq_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ng() {
		return this.cb_fld;
	}

	@ObfuscatedName("setMapSceneId")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setMapSceneId(int var1) {
		this.dq_fld = var1;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ew() {
		try {
			return this.aq((short)-11774);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int bc(int var1, int var2) {
		return my.ag(this.es_fld, var1, var2);
	}

	@ObfuscatedName("setMapIconId")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setMapIconId(int var1) {
		this.dm_fld = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void br() {
		if (this.cj_fld == -1) {
			this.cj_fld = 0;
			if (null != this.cr_fld && (null == this.ca_fld || this.ca_fld[0] == 10)) {
				this.cj_fld = -2137293417;
			}

			if (this.dt_fld.as(-1645354766)) {
				this.cj_fld = -2137293417;
			}
		}

		if (-1 == this.dg_fld) {
			this.dg_fld = 0 != this.cu_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void be_void() {
		if (this.cj_fld == -1) {
			this.cj_fld = 0;
			if (null != this.cr_fld && (null == this.ca_fld || this.ca_fld[0] == 10)) {
				this.cj_fld = -2137293417;
			}

			if (this.dt_fld.as(-1800318037)) {
				this.cj_fld = -2137293417;
			}
		}

		if (-1 == this.dg_fld) {
			this.dg_fld = 0 != this.cu_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void bs(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.aw(var1, var2, 1705389376);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)I"
	)
	public int ab(int var1, short var2) {
		return var1 != 1 && var1 != 3 ? this.co_fld : this.cb_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;Z)V"
	)
	public static void aj(ub var0, ub var1, boolean var2) {
		if_.cf_fld = var0;
		dm.cx_fld = var1;
		cy_fld = var2;
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(Loe;II)Leg;"
	)
	public static eg wq(oe var0, int var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			eg var3 = null;
			if (null == var0.ca_fld) {
				if (10 != var1) {
					return null;
				}

				if (null == var0.cr_fld) {
					return null;
				}

				boolean var4 = var0.db_fld;
				if (2 == var1 && var2 > 3) {
					var4 = !var4;
				}

				int var5 = var0.cr_fld.length;

				for (int var6 = 0; var6 < var5; var6++) {
					int var7 = var0.cr_fld[var6];
					int var8 = var7;
					if (var4) {
						var8 = -var7;
					}

					var3 = (eg)cv_fld.ak(var8);
					if (null == var3) {
						var3 = eg.ak(dm.cx_fld, var7, 0);
						if (null == var3) {
							return null;
						}

						if (var4) {
							var3.bh();
						}

						cv_fld.az(var3, var8);
					}

					if (var5 > 1) {
						ce_fld[var6] = var3;
					}
				}

				if (var5 > 1) {
					var3 = new eg(ce_fld, var5);
				}
			} else {
				int var12 = -1;

				for (int var14 = 0; var14 < var0.ca_fld.length; var14++) {
					if (var1 == var0.ca_fld[var14]) {
						var12 = var14;
						break;
					}
				}

				if (var12 == -1) {
					return null;
				}

				int var15 = var0.cr_fld[var12];
				int var17 = var15;
				boolean var19 = var0.db_fld ^ var2 > 3;
				if (var19) {
					var17 = var15 + 65536;
				}

				var3 = (eg)cv_fld.ak(var17);
				if (var3 == null) {
					var3 = eg.ak(dm.cx_fld, var15, 0);
					if (null == var3) {
						return null;
					}

					if (var19) {
						var3.bh();
					}

					cv_fld.az(var3, var17);
				}
			}

			boolean var13;
			if (var0.dl_fld == 128 && var0.dr_fld == 128 && var0.da_fld == 128) {
				var13 = false;
			} else {
				var13 = true;
			}

			boolean var16;
			if (var0.dk_fld == 0 && var0.dx_fld == 0 && 0 == var0.ds_fld) {
				var16 = false;
			} else {
				var16 = true;
			}

			eg var18 = new eg(var3, 0 == var2 && !var13 && !var16, var0.cm_fld == null, null == var0.cw_fld, true);
			if (var1 == 4 && var2 > 3) {
				var18.dc(256);
				var18.dh(45, 0, -45);
			}

			var2 &= 3;
			if (var2 == 1) {
				var18.aj();
			} else if (2 == var2) {
				var18.bm();
			} else if (3 == var2) {
				st.ps(var18);
			}

			if (var0.cm_fld != null) {
				for (int var20 = 0; var20 < var0.cm_fld.length; var20++) {
					eg.hm(var18, var0.cm_fld[var20], var0.ck_fld[var20]);
				}
			}

			if (null != var0.cw_fld) {
				for (int var21 = 0; var21 < var0.cw_fld.length; var21++) {
					var18.bs(var0.cw_fld[var21], var0.cz_fld[var21]);
				}
			}

			if (var13) {
				var18.br(var0.dl_fld, var0.dr_fld, var0.da_fld);
			}

			if (var16) {
				var18.dh(var0.dk_fld, var0.dx_fld, var0.ds_fld);
			}

			return var18;
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public final boolean bf(int var1) {
		try {
			if (this.ca_fld != null) {
				for (int var6 = 0; var6 < this.ca_fld.length; var6++) {
					if (this.ca_fld[var6] == var1) {
						return dm.cx_fld.cc(this.cr_fld[var6], 0, -1773720634);
					}
				}

				return true;
			} else if (this.cr_fld == null) {
				return true;
			} else if (var1 != 10) {
				return true;
			} else {
				boolean var2 = true;

				for (int var3 = 0; var3 < this.cr_fld.length; var3++) {
					var2 &= dm.cx_fld.cc(this.cr_fld[var3], 0, 182899900);
				}

				return var2;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae(int var1) {
		if (this.cj_fld == -1) {
			this.cj_fld = 0;
			if (null != this.cr_fld && (null == this.ca_fld || this.ca_fld[0] == 10)) {
				this.cj_fld = -2137293417;
			}

			if (this.dt_fld.as(1198978308)) {
				this.cj_fld = -2137293417;
			}
		}

		if (-1 == this.dg_fld) {
			if (var1 >= -1649124036) {
				this.rp();
				return;
			}

			this.dg_fld = 0 != this.cu_fld ? 1 : 0;
		}

		this.rp();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public final boolean by(int var1) {
		try {
			if (this.ca_fld != null) {
				for (int var6 = 0; var6 < this.ca_fld.length; var6++) {
					if (this.ca_fld[var6] == var1) {
						return dm.cx_fld.cc(this.cr_fld[var6], 0, -2094503865);
					}
				}

				return true;
			} else if (this.cr_fld == null) {
				return true;
			} else if (var1 != 10) {
				return true;
			} else {
				boolean var2 = true;

				for (int var3 = 0; var3 < this.cr_fld.length; var3++) {
					var2 &= dm.cx_fld.cc(this.cr_fld[var3], 0, -677197776);
				}

				return var2;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean bl() {
		try {
			if (null == this.cr_fld) {
				return true;
			} else {
				boolean var1 = true;

				for (int var2 = 0; var2 < this.cr_fld.length; var2++) {
					var1 &= dm.cx_fld.cc(this.cr_fld[var2], 0, -186976418);
				}

				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean bx() {
		try {
			if (null == this.cr_fld) {
				return true;
			} else {
				boolean var1 = true;

				for (int var2 = 0; var2 < this.cr_fld.length; var2++) {
					var1 &= dm.cx_fld.cc(this.cr_fld[var2], 0, 1210835158);
				}

				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()Lwn;"
	)
	public wn cp() {
		return this.de_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.cn_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II[[IIII)Lem;"
	)
	public final em bp(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		try {
			long var7;
			if (null == this.ca_fld) {
				var7 = (this.cn_fld << 10) + var2;
			} else {
				var7 = var2 + (this.cn_fld << 10) + (var1 << 3);
			}

			Object var9 = (em)cs_fld.ak(var7);
			if (var9 == null) {
				eg var10 = this.au(var1, var2, (byte)47);
				if (var10 == null) {
					return null;
				}

				if (!this.do_fld) {
					var9 = var10.bx(64 + this.dv_fld, this.dz_fld + 768, -50, -10, -50);
				} else {
					var10.bh_fld = (short)(this.dv_fld + 64);
					var10.bs_fld = (short)(768 + this.dz_fld);
					var10.bf();
					var9 = var10;
				}

				cs_fld.az((vc)var9, var7);
			}

			if (this.do_fld) {
				var9 = eg.gs((eg)var9);
			}

			if (this.ch_fld >= 0) {
				if (var9 instanceof fn) {
					var9 = ((fn)var9).aw(var3, var4, var5, var6, true, this.ch_fld);
				} else if (var9 instanceof eg) {
					var9 = ((eg)var9).cw(var3, var4, var5, var6, true, this.ch_fld);
				}
			}

			return (em)var9;
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II[[IIII)Lem;"
	)
	public final em bt(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		try {
			long var7;
			if (null == this.ca_fld) {
				var7 = (this.cn_fld << 10) + var2;
			} else {
				var7 = var2 + (this.cn_fld << 10) + (var1 << 3);
			}

			Object var9 = (em)cs_fld.ak(var7);
			if (var9 == null) {
				eg var10 = this.au(var1, var2, (byte)111);
				if (var10 == null) {
					return null;
				}

				if (!this.do_fld) {
					var9 = var10.bx(-1598888354 + this.dv_fld, this.dz_fld + 1160953699, -50, -60975794, -1929725531);
				} else {
					var10.bh_fld = (short)(this.dv_fld + -1003683526);
					var10.bs_fld = (short)(-1892946446 + this.dz_fld);
					var10.bf();
					var9 = var10;
				}

				cs_fld.az((vc)var9, var7);
			}

			if (this.do_fld) {
				var9 = eg.gs((eg)var9);
			}

			if (-1886189133 * this.ch_fld >= 0) {
				if (var9 instanceof fn) {
					var9 = ((fn)var9).aw(var3, var4, var5, var6, true, this.ch_fld);
				} else if (var9 instanceof eg) {
					var9 = ((eg)var9).cw(var3, var4, var5, var6, true, this.ch_fld * -110782705);
				}
			}

			return (em)var9;
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II[[IIII)Lfn;"
	)
	public final fn bv(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		try {
			long var7;
			if (this.ca_fld == null) {
				var7 = (this.cn_fld << 10) + var2;
			} else {
				var7 = var2 + (var1 << 3) + (this.cn_fld << 10);
			}

			fn var9 = (fn)cp_fld.ak(var7);
			if (null == var9) {
				eg var10 = this.au(var1, var2, (byte)4);
				if (var10 == null) {
					return null;
				}

				var9 = var10.bx(this.dv_fld + 64, this.dz_fld + 768, 935621178, -814320684, -50);
				cp_fld.az(var9, var7);
			}

			if (this.ch_fld >= 0) {
				var9 = var9.aw(var3, var4, var5, var6, true, this.ch_fld);
			}

			return var9;
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	static {
		cp_fld.bh(256);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)Leg;"
	)
	final eg bu(int var1, int var2) {
		try {
			eg var3 = null;
			if (null == this.ca_fld) {
				if (10 != var1) {
					return null;
				}

				if (null == this.cr_fld) {
					return null;
				}

				boolean var4 = this.db_fld;
				if (2 == var1 && var2 > 3) {
					var4 = !var4;
				}

				int var5 = this.cr_fld.length;

				for (int var6 = 0; var6 < var5; var6++) {
					int var7 = this.cr_fld[var6];
					int var8 = var7;
					if (var4) {
						var8 = -var7;
					}

					var3 = (eg)cv_fld.ak(var8);
					if (null == var3) {
						var3 = eg.ak(dm.cx_fld, var7, 0);
						if (null == var3) {
							return null;
						}

						if (var4) {
							var3.bh();
						}

						cv_fld.az(var3, var8);
					}

					if (var5 > 1) {
						ce_fld[var6] = var3;
					}
				}

				if (var5 > 1) {
					var3 = new eg(ce_fld, var5);
				}
			} else {
				int var12 = -1;

				for (int var14 = 0; var14 < this.ca_fld.length; var14++) {
					if (var1 == this.ca_fld[var14]) {
						var12 = var14;
						break;
					}
				}

				if (var12 == -1) {
					return null;
				}

				int var15 = this.cr_fld[var12];
				int var17 = var15;
				boolean var19 = this.db_fld ^ var2 > 3;
				if (var19) {
					var17 = var15 + 65536;
				}

				var3 = (eg)cv_fld.ak(var17);
				if (var3 == null) {
					var3 = eg.ak(dm.cx_fld, var15, 0);
					if (null == var3) {
						return null;
					}

					if (var19) {
						var3.bh();
					}

					cv_fld.az(var3, var17);
				}
			}

			boolean var13;
			if (this.dl_fld == 128 && this.dr_fld == 128 && this.da_fld == 128) {
				var13 = false;
			} else {
				var13 = true;
			}

			boolean var16;
			if (this.dk_fld == 0 && this.dx_fld == 0 && 0 == this.ds_fld) {
				var16 = false;
			} else {
				var16 = true;
			}

			eg var18 = new eg(var3, 0 == var2 && !var13 && !var16, this.cm_fld == null, null == this.cw_fld, true);
			if (var1 == 4 && var2 > 3) {
				var18.dc(256);
				var18.dh(45, 0, -45);
			}

			var2 &= 3;
			if (var2 == 1) {
				var18.aj();
			} else if (2 == var2) {
				var18.bm();
			} else if (3 == var2) {
				st.ps(var18);
			}

			if (this.cm_fld != null) {
				for (int var20 = 0; var20 < this.cm_fld.length; var20++) {
					eg.hm(var18, this.cm_fld[var20], this.ck_fld[var20]);
				}
			}

			if (null != this.cw_fld) {
				for (int var21 = 0; var21 < this.cw_fld.length; var21++) {
					var18.bs(this.cw_fld[var21], this.cz_fld[var21]);
				}
			}

			if (var13) {
				var18.br(this.dl_fld, this.dr_fld, this.da_fld);
			}

			if (var16) {
				var18.dh(this.dk_fld, this.dx_fld, this.ds_fld);
			}

			return var18;
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	public boolean aq(short var1) {
		try {
			if (null == this.dy_fld) {
				return -1 != this.df_fld.ag_fld * 1077344343 || this.de_fld.ak_fld != null;
			} else {
				int[] var2 = this.dy_fld;

				for (int var3 = 0; var3 < var2.length; var3++) {
					int var4 = var2[var3];
					if (var4 != -1) {
						oe var5 = ko.az(var4);
						if (var5.df_fld.ag_fld * 1077344343 != -1 || null != var5.de_fld.ak_fld) {
							return true;
						}
					}
				}

				return false;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II[[IIII)Lem;"
	)
	public final em bo(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		try {
			long var7;
			if (null == this.ca_fld) {
				var7 = (this.cn_fld << 10) + var2;
			} else {
				var7 = var2 + (this.cn_fld << 10) + (var1 << 3);
			}

			Object var9 = (em)cs_fld.ak(var7);
			if (var9 == null) {
				eg var10 = this.au(var1, var2, (byte)114);
				if (var10 == null) {
					return null;
				}

				if (!this.do_fld) {
					var9 = var10.bx(956462828 + this.dv_fld, this.dz_fld + 768, 1658147763, 1420264982, -50);
				} else {
					var10.bh_fld = (short)(this.dv_fld + 1527967295);
					var10.bs_fld = (short)(768 + this.dz_fld);
					var10.bf();
					var9 = var10;
				}

				cs_fld.az((vc)var9, var7);
			}

			if (this.do_fld) {
				var9 = eg.gs((eg)var9);
			}

			if (628244553 * this.ch_fld >= 0) {
				if (var9 instanceof fn) {
					var9 = ((fn)var9).aw(var3, var4, var5, var6, true, this.ch_fld);
				} else if (var9 instanceof eg) {
					var9 = ((eg)var9).cw(var3, var4, var5, var6, true, this.ch_fld * -1829651320);
				}
			}

			return (em)var9;
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lwv;"
	)
	public wv am(int var1) {
		return this.df_fld;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(I)Loe;"
	)
	public static oe ke(int var0) throws EOFException {
		try {
			return ko.az(var0);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ba(int var1, int var2) {
		return my.ag(this.es_fld, var1, var2);
	}

	@ObfuscatedName("getActions")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Override
	public String[] getActions() {
		String[] var1 = new String[this.dt_fld.ak_fld.size()];

		for (int var2 = 0; var2 < this.dt_fld.ak_fld.size(); var2++) {
			oj var3 = (oj)(oj)this.dt_fld.ak_fld.get(var2);
			if (var3 != null) {
				var1[var2] = var3.ae_fld;
			}
		}

		return var1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long bq(int var1, long var2) {
		return hq.az(this.es_fld, var1, var2);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long bg(int var1, long var2) {
		return hq.az(this.es_fld, var1, var2);
	}

	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "(Loe;II[[IIIILol;I)Lfn;"
	)
	public static fn vv(oe var0, int var1, int var2, int[][] var3, int var4, int var5, int var6, ol var7, int var8) throws EOFException {
		try {
			long var9;
			if (null == var0.ca_fld) {
				var9 = (var0.cn_fld << 10) + var2;
			} else {
				var9 = var2 + (var0.cn_fld << 10) + (var1 << 3);
			}

			fn var11 = (fn)cp_fld.ak(var9);
			if (var11 == null) {
				eg var12 = var0.au(var1, var2, (byte)19);
				if (null == var12) {
					return null;
				}

				var11 = var12.bx(1308203971 + var0.dv_fld, -729961048 + var0.dz_fld, -2090501686, -10, -50);
				cp_fld.az(var11, var9);
			}

			if (null == var7 && -1 == var0.ch_fld) {
				return var11;
			} else {
				if (var7 != null) {
					var11 = var7.af(var11, var8, var2, (byte)95);
				} else {
					var11 = var11.ay(true);
				}

				if (var0.ch_fld * 616780208 >= 0 && null != var3) {
					var11 = var11.aw(var3, var4, var5, var6, false, var0.ch_fld * -376864777);
				}

				return var11;
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("yz")
	@ObfuscatedSignature(
		descriptor = "(II[[IIII)Lem;"
	)
	public em yz(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		try {
			return lk(this, var1, var2, var3, var4, var5, var6, (byte)12);
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void bh(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.cg_fld = xi.kc(var1, 1671296322);
			case 3:
			case 4:
			case 5:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 16:
			case 20:
			case 25:
			case 26:
			case 35:
			case 36:
			case 37:
			case 38:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 63:
			case 76:
			case 80:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 94:
			case 97:
			case 98:
			case 99:
			case 103:
			case 104:
			case 105:
			case 106:
			case 107:
			case 108:
			case 109:
			case 110:
			case 111:
			case 112:
			case 113:
			case 114:
			case 115:
			case 116:
			case 117:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122:
			case 123:
			case 124:
			case 125:
			case 126:
			case 127:
			case 128:
			case 129:
			case 130:
			case 131:
			case 132:
			case 133:
			case 134:
			case 135:
			case 136:
			case 137:
			case 138:
			case 139:
			case 140:
			case 141:
			case 142:
			case 143:
			case 144:
			case 145:
			case 146:
			case 147:
			case 148:
			case 149:
			case 150:
			case 151:
			case 152:
			case 153:
			case 154:
			case 155:
			case 156:
			case 157:
			case 158:
			case 159:
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 175:
			case 176:
			case 177:
			case 178:
			case 179:
			case 180:
			case 181:
			case 182:
			case 183:
			case 184:
			case 185:
			case 186:
			case 187:
			case 188:
			case 189:
			case 190:
			case 191:
			case 192:
			case 193:
			case 194:
			case 195:
			case 196:
			case 197:
			case 198:
			case 199:
			case 200:
			case 201:
			case 202:
			case 203:
			case 204:
			case 205:
			case 206:
			case 207:
			case 208:
			case 209:
			case 210:
			case 211:
			case 212:
			case 213:
			case 214:
			case 215:
			case 216:
			case 217:
			case 218:
			case 219:
			case 220:
			case 221:
			case 222:
			case 223:
			case 224:
			case 225:
			case 226:
			case 227:
			case 228:
			case 229:
			case 230:
			case 231:
			case 232:
			case 233:
			case 234:
			case 235:
			case 236:
			case 237:
			case 238:
			case 239:
			case 240:
			case 241:
			case 242:
			case 243:
			case 244:
			case 245:
			case 246:
			case 247:
			case 248:
			default:
				break;
			case 6:
				int var16 = var1.cg();
				if (var16 > 0) {
					if (this.cr_fld != null && !cy_fld) {
						var1.au_fld = var1.au_fld + var16 * (wa.ak_fld.ak() + 1) * 228932457;
					} else {
						this.ca_fld = new int[var16];
						this.cr_fld = new int[var16];

						for (int var24 = 0; var24 < var16; var24++) {
							this.cr_fld[var24] = var1.dl(wa.ak_fld.az_fld);
							this.ca_fld[var24] = var1.cg();
						}
					}
				}
				break;
			case 7:
				int var15 = var1.cg();
				if (var15 > 0) {
					if (null != this.cr_fld && !cy_fld) {
						var1.au_fld = var1.au_fld + var15 * wa.ak_fld.ak() * 228932457;
					} else {
						this.ca_fld = null;
						this.cr_fld = new int[var15];

						for (int var23 = 0; var23 < var15; var23++) {
							this.cr_fld[var23] = var1.dl(wa.ak_fld.az_fld);
						}
					}
				}
				break;
			case 14:
				this.cb_fld = var1.cg();
				break;
			case 15:
				this.co_fld = var1.cg();
				break;
			case 17:
				this.cu_fld = 0;
				this.ci_fld = false;
				break;
			case 18:
				this.ci_fld = false;
				break;
			case 19:
				this.cj_fld = var1.cg();
				break;
			case 21:
				this.ch_fld = 0;
				break;
			case 22:
				this.do_fld = true;
				break;
			case 23:
				this.cl_fld = true;
				break;
			case 24:
				this.dc_fld = xi.tx(var1, 1361082400);
				if (this.dc_fld == 65535) {
					this.dc_fld = 1688267327;
				}
				break;
			case 27:
				this.cu_fld = -1352739689;
				break;
			case 28:
				this.dh_fld = var1.cg();
				break;
			case 29:
				this.dv_fld = xi.rp(var1, -2075668440);
				break;
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 100:
			case 101:
			case 102:
				this.dt_fld.am(var1, var2, 30, 34, 100, 101, 102, (byte)-21);
				break;
			case 39:
				this.dz_fld = xi.rp(var1, 491415983) * -751297969;
				break;
			case 40:
				int var14 = var1.cg();
				this.cm_fld = new short[var14];
				this.ck_fld = new short[var14];

				for (int var22 = 0; var22 < var14; var22++) {
					this.cm_fld[var22] = (short)xi.tx(var1, 1527476314);
					this.ck_fld[var22] = (short)xi.tx(var1, 1878059077);
				}
				break;
			case 41:
				int var13 = var1.cg();
				this.cw_fld = new short[var13];
				this.cz_fld = new short[var13];

				for (int var21 = 0; var21 < var13; var21++) {
					this.cw_fld[var21] = (short)xi.tx(var1, 1144563949);
					this.cz_fld[var21] = (short)xi.tx(var1, 1520263806);
				}
				break;
			case 61:
				xi.tx(var1, 1548064374);
				break;
			case 62:
				this.db_fld = true;
				break;
			case 64:
				this.dd_fld = false;
				break;
			case 65:
				this.dl_fld = xi.tx(var1, 599206219);
				break;
			case 66:
				this.dr_fld = xi.tx(var1, 798507722);
				break;
			case 67:
				this.da_fld = xi.tx(var1, 844549984);
				break;
			case 68:
				this.dq_fld = xi.tx(var1, 1618376425);
				break;
			case 69:
				var1.cg();
				break;
			case 70:
				this.dk_fld = var1.cz();
				break;
			case 71:
				this.dx_fld = var1.cz();
				break;
			case 72:
				this.ds_fld = var1.cz();
				break;
			case 73:
				this.du_fld = true;
				break;
			case 74:
				this.ct_fld = true;
				break;
			case 75:
				this.dg_fld = var1.cg();
				break;
			case 77:
			case 92:
				this.di_fld = xi.tx(var1, 1533742966);
				if (this.di_fld == 65535) {
					this.di_fld = -478391193;
				}

				this.dn_fld = xi.tx(var1, 706752494);
				if (this.dn_fld == 65535) {
					this.dn_fld = -1905215055;
				}

				int var12 = -1;
				if (var2 == 92) {
					var12 = xi.tx(var1, 1584538401);
					if (var12 == 65535) {
						var12 = -1;
					}
				}

				int var20 = var1.cg();
				this.dy_fld = new int[2 + var20];

				for (int var26 = 0; var26 <= var20; var26++) {
					this.dy_fld[var26] = xi.tx(var1, 1902388044);
					if (this.dy_fld[var26] == 65535) {
						this.dy_fld[var26] = -1;
					}
				}

				this.dy_fld[1 + var20] = var12;
				break;
			case 78:
				this.df_fld.ag_fld = xi.tx(var1, 697404410);
				this.df_fld.az_fld = var1.cg();
				this.df_fld.ak_fld = var1.cg();
				break;
			case 79:
				this.de_fld.ag_fld = xi.tx(var1, 1986664874);
				this.de_fld.az_fld = xi.tx(var1, 1618757656);
				this.df_fld.az_fld = var1.cg();
				this.df_fld.ak_fld = var1.cg();
				int var11 = var1.cg();
				this.de_fld.ak_fld = new int[var11];

				for (int var19 = 0; var19 < var11; var19++) {
					this.de_fld.ak_fld[var19] = xi.tx(var1, 879798649);
				}
				break;
			case 81:
				this.ch_fld = var1.cg() * 2005351680;
				break;
			case 82:
				this.dm_fld = xi.tx(var1, 1105349325);
				break;
			case 89:
				this.dp_fld = false;
				break;
			case 90:
				this.dj_fld = true;
				break;
			case 91:
				wh var10 = this.df_fld.av_fld;
				int var25 = var1.cg();
				zm var18 = zm.br_fld[var25];
				var10.az(var18);
				break;
			case 93:
				wh var9 = this.df_fld.av_fld;
				int var5 = var1.cg();
				zm var17 = zm.br_fld[var5];
				var9.ak(var17, xi.tx(var1, 1734309354));
				wh var6 = this.df_fld.av_fld;
				int var8 = var1.cg();
				zm var7 = zm.br_fld[var8];
				var6.ag(var7, xi.tx(var1, 848434502));
				break;
			case 95:
				wv var3 = this.df_fld;
				kr[] var4 = new kr[]{kr.ag_fld, kr.az_fld, kr.ak_fld};
				var3.ae_fld = (kr)ka.ak(var4, var1.cg());
				break;
			case 96:
				this.dw_fld = var1.cg();
				break;
			case 249:
				this.es_fld = nc.ak(var1, this.es_fld);
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Loe;I)Z"
	)
	public static boolean ki(oe var0, int var1) throws EOFException {
		try {
			if (var0.ca_fld != null) {
				for (int var6 = 0; var6 < var0.ca_fld.length; var6++) {
					if (var0.ca_fld[var6] == var1) {
						return dm.cx_fld.cc(var0.cr_fld[var6], 0, 1198436857);
					}
				}

				return true;
			} else if (var0.cr_fld == null) {
				return true;
			} else if (var1 != 10) {
				return true;
			} else {
				boolean var2 = true;

				for (int var3 = 0; var3 < var0.cr_fld.length; var3++) {
					var2 &= dm.cx_fld.cc(var0.cr_fld[var3], 0, 339462258);
				}

				return var2;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	public final boolean ay(int var1, byte var2) {
		try {
			if (this.ca_fld != null) {
				for (int var6 = 0; var6 < this.ca_fld.length; var6++) {
					if (this.ca_fld[var6] == var1) {
						return dm.cx_fld.cc(this.cr_fld[var6], 0, -1893635875);
					}
				}

				return true;
			} else if (this.cr_fld == null) {
				return true;
			} else if (var1 != 10) {
				return true;
			} else {
				boolean var3 = true;

				for (int var4 = 0; var4 < this.cr_fld.length; var4++) {
					var3 &= dm.cx_fld.cc(this.cr_fld[var4], 0, -2144071126);
				}

				return var3;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
	)
	public String cc(int var1, String var2) {
		return ih.av(this.es_fld, var1, var2);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cq() {
		try {
			if (null == this.dy_fld) {
				return -1 != this.df_fld.ag_fld * 1077344343 || this.de_fld.ak_fld != null;
			} else {
				int[] var1 = this.dy_fld;

				for (int var2 = 0; var2 < var1.length; var2++) {
					int var3 = var1[var2];
					if (var3 != -1) {
						oe var4 = ko.az(var3);
						if (var4.df_fld.ag_fld * 1077344343 != -1 || null != var4.de_fld.ak_fld) {
							return true;
						}
					}
				}

				return false;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Loe;I)Z"
	)
	public static boolean fq(oe var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (null == var0.cr_fld) {
				return true;
			} else {
				boolean var2 = true;

				for (int var3 = 0; var3 < var0.cr_fld.length; var3++) {
					var2 &= dm.cx_fld.cc(var0.cr_fld[var3], 0, -1990687987);
				}

				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getMapSceneId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMapSceneId() {
		return this.dq_fld;
	}

	@ObfuscatedName("getSizeX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSizeX() {
		return this.cb_fld;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cy() {
		try {
			if (null == this.dy_fld) {
				return -1 != this.df_fld.ag_fld * 1077344343 || this.de_fld.ak_fld != null;
			} else {
				int[] var1 = this.dy_fld;

				for (int var2 = 0; var2 < var1.length; var2++) {
					int var3 = var1[var2];
					if (var3 != -1) {
						oe var4 = ko.az(var3);
						if (var4.df_fld.ag_fld * 1077344343 != -1 || null != var4.de_fld.ak_fld) {
							return true;
						}
					}
				}

				return false;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cf() {
		try {
			if (null == this.dy_fld) {
				return -1 != this.df_fld.ag_fld * -1642638530 || this.de_fld.ak_fld != null;
			} else {
				int[] var1 = this.dy_fld;

				for (int var2 = 0; var2 < var1.length; var2++) {
					int var3 = var1[var2];
					if (var3 != -1) {
						oe var4 = ko.az(var3);
						if (var4.df_fld.ag_fld * 1486346577 != -1 || null != var4.de_fld.ak_fld) {
							return true;
						}
					}
				}

				return false;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()Lwv;"
	)
	public wv cx() {
		return this.df_fld;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()Lwn;"
	)
	public wn cs() {
		return this.de_fld;
	}

	@ObfuscatedName("getImpostorIds")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getImpostorIds() {
		return this.dy_fld;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ce(int var1) {
		return 1 != var1 && 3 != var1 ? this.cb_fld : 1585419251 * this.co_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Date;"
	)
	static Date au() {
		Calendar var1 = Calendar.getInstance();
		var1.set(2, 0);
		var1.set(5, 1);
		var1.set(1, 1900);
		return var1.getTime();
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Loe;)Z"
	)
	public static boolean mi(oe var0) throws EOFException {
		try {
			if (null == var0.dy_fld) {
				return -1 != var0.df_fld.ag_fld * 1077344343 || var0.de_fld.ak_fld != null;
			} else {
				int[] var1 = var0.dy_fld;

				for (int var2 = 0; var2 < var1.length; var2++) {
					int var3 = var1[var2];
					if (var3 != -1) {
						oe var4 = ko.az(var3);
						if (var4.df_fld.ag_fld * 1077344343 != -1 || null != var4.de_fld.ak_fld) {
							return true;
						}
					}
				}

				return false;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "()Lpb;"
	)
	public pb getOps() {
		return this.dt_fld;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Loe;II[[IIIIB)Lem;"
	)
	public static em lk(oe var0, int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				long var8;
				if (null == var0.ca_fld) {
					var8 = (var0.cn_fld << 10) + var2;
				} else {
					var8 = var2 + (var0.cn_fld << 10) + (var1 << 3);
				}

				Object var10 = (em)cs_fld.ak(var8);
				if (var10 == null) {
					eg var11 = var0.au(var1, var2, (byte)75);
					if (var11 == null) {
						return null;
					}

					if (!var0.do_fld) {
						var10 = var11.bx(64 + var0.dv_fld, var0.dz_fld + 768, -50, -10, -50);
					} else {
						var11.bh_fld = (short)(var0.dv_fld + 64);
						var11.bs_fld = (short)(768 + var0.dz_fld);
						var11.bf();
						var10 = var11;
					}

					cs_fld.az((vc)var10, var8);
				}

				if (var0.do_fld) {
					var10 = eg.gs((eg)var10);
				}

				if (var0.ch_fld >= 0) {
					if (var10 instanceof fn) {
						var10 = ((fn)var10).aw(var3, var4, var5, var6, true, var0.ch_fld);
					} else if (var10 instanceof eg) {
						var10 = ((eg)var10).cw(var3, var4, var5, var6, true, var0.ch_fld);
					}
				}

				return (em)var10;
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Loe;B)Loq;"
	)
	public static oq nb(oe var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.dt_fld;
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	@Override
	public void us(xv var1) {
		this.es_fld = var1;
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void rp() {
		if (this.ch_fld > 0 && (client.jb_fld & 16) == 0) {
			this.ch_fld = -1;
		}

		PostObjectComposition var1 = new PostObjectComposition(this);
		og.ci_fld.getCallbacks().post(var1);
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getName() {
		return this.cg_fld;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(II)Leg;"
	)
	public eg gv(int var1, int var2) {
		try {
			return this.au(var1, var2, (byte)121);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Loq;"
	)
	public oq ak(byte var1) {
		return this.dt_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public final boolean as(int var1) {
		try {
			if (this.cr_fld != null) {
				for (int var6 = 0; var6 < this.cr_fld.length; var6++) {
					if (this.ca_fld[var6] == var1) {
						return dm.cx_fld.cc(this.ca_fld[var6], 0, 1198436857);
					}
				}

				return true;
			} else if (this.ca_fld == null) {
				return true;
			} else if (var1 != 10) {
				return true;
			} else {
				boolean var2 = true;

				for (int var3 = 0; var3 < this.cr_fld.length; var3++) {
					var2 &= dm.cx_fld.cc(this.ca_fld[var3], 0, 339462258);
				}

				return var2;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lem;"
	)
	public final em ar(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
		try {
			long var8;
			if (null == this.cr_fld) {
				var8 = (this.dw_fld << 10) + var2;
			} else {
				var8 = var2 + (this.dq_fld << 10) + (var1 << 3);
			}

			Object var10 = (em)cq_fld.ah(var8);
			if (var10 == null) {
				eg var11 = this.au(var1, var2, (byte)75);
				if (var11 == null) {
					return null;
				}

				if (!this.ct_fld) {
					var10 = var11.dp(64 + this.di_fld, this.di_fld + 768, -50, -10, -50);
				} else {
					var11.bs_fld = (short)(this.ch_fld + 64);
					var11.bs_fld = (short)(768 + this.da_fld);
					var11.ch();
					var10 = var11;
				}

				cq_fld.nk((vc)var10, var8);
			}

			if (this.ct_fld) {
				var10 = eg.gs((eg)var10);
			}

			if (-984086507 * this.dr_fld >= 0) {
				if (var10 instanceof fn) {
					var10 = ((fn)var10).cj(var3, var4, var5, var6, true, -984086507 * this.ds_fld);
				} else if (var10 instanceof eg) {
					var10 = ((eg)var10).cw(var3, var4, var5, var6, true, this.dr_fld * -984086507);
				}
			}

			return (em)var10;
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}
}
