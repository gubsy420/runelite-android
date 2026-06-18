import java.io.EOFException;
import net.runelite.api.ItemComposition;
import net.runelite.api.IterableHashTable;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PostItemComposition;

@ObfuscatedName("og")
@Implements({"ItemComposition"})
public class og extends vc implements ItemComposition, rl9 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1968619101
	)
	int fw_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int ec_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] dg_fld;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int dy_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int by_fld;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw do_fld = new iw(64);
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw dd_fld = new iw(50);
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw dl_fld = new iw(200);
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1211593881
	)
	int da_fld;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	int dk_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String ds_fld;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] du_fld;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] db_fld;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String dx_fld;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] dw_fld;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1756350359
	)
	public int eg_fld;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int di_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int df_fld;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int de_fld;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1550174935
	)
	int eq_fld;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1802909481
	)
	int ei_fld;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int es_fld;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int ep_fld;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int dp_fld;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1990169435
	)
	public int ed_fld;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -279611401
	)
	public int en_fld;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	pb ew_fld;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] ex_fld;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 23642229
	)
	int ef_fld;
	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String vb_fld;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2061559521
	)
	public int dj_fld;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ez_fld;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] er_fld;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean eh_fld;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1535670989
	)
	int fe_fld;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int eb_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean et_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1019011255
	)
	public int ek_fld;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int ea_fld;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 779960943
	)
	public int ev_fld;
	@ObfuscatedName("yw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int yw_fld = -2;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv ey_fld;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean em_fld;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean el_fld;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "[[Ljava/lang/String;"
	)
	public String[][] eo_fld;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 552268435
	)
	int eu_fld;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1494177205
	)
	public int ee_fld;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 261173237
	)
	public int fy_fld;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -446176385
	)
	public int fa_fld;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 922203719
	)
	int fo_fld;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -230668519
	)
	int fp_fld;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 69298017
	)
	int fx_fld;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -53605389
	)
	int fv_fld;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -797779947
	)
	int fj_fld;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1758979253
	)
	int fb_fld;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 342818047
	)
	int fk_fld;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	int fc_fld;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 588084861
	)
	int fh_fld;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1992045053
	)
	int fm_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -905965499
	)
	int ej_fld;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 676732571
	)
	int fl_fld;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int dn_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static client ci_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_fld;

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Log;ILoo;)Z"
	)
	public static boolean wo(og var0, int var1, oo var2) throws EOFException {
		try {
			int var3 = var0.fm_fld;
			int var4 = var0.fe_fld;
			if (var1 == 1) {
				var3 = var0.fw_fld;
				var4 = var0.fl_fld;
			}

			if (null != var2 && var2.ae(var1, 596152720)) {
				var3 = oo.oq(var2, var1, (byte)0);
			}

			if (-1 == var3) {
				return true;
			} else {
				boolean var5 = true;
				if (!bl.dm_fld.cc(var3, 0, -902458158)) {
					var5 = false;
				}

				if (-1 != var4 && !bl.dm_fld.cc(var4, 0, 1508265084)) {
					var5 = false;
				}

				return var5;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("setColorToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "([S)V"
	)
	@Export("setColorToReplaceWith")
	@Override
	public void setColorToReplaceWith(short[] var1) {
		this.db_fld = var1;
	}

	@ObfuscatedName("xq")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;)V"
	)
	public void xq(og var1, og var2) {
		this.vb_fld = var2.getMembersName();
	}

	@ObfuscatedName("getYan2d")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getYan2d")
	@Override
	public int getYan2d() {
		return this.dn_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void be() {
		if (this.dj_fld == 1) {
			this.ev_fld = 0;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void aw(xi var1, int var2, int var3) {
		switch (var2) {
			case 2:
				this.dx_fld = xi.at(var1, -1908205691);
				break;
			case 3:
				this.ds_fld = xi.at(var1, -665666816);
				break;
			case 4:
				this.dy_fld = var1.cm() * 2076995877;
				break;
			case 5:
				this.di_fld = var1.cm() * 90750953;
				break;
			case 6:
				this.dn_fld = var1.cm() * -646331283;
				break;
			case 7:
				this.de_fld = var1.cm() * -639166725;
				if (this.de_fld > 32767) {
					this.de_fld -= 385548288;
				}
				break;
			case 8:
				this.dp_fld = var1.cm() * 2057930091;
				if (this.dp_fld > 32767) {
					this.dp_fld -= -2056585216;
				}
				break;
			case 9:
				xi.at(var1, -1883241845);
			case 10:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 28:
			case 29:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
			case 63:
			case 64:
			case 66:
			case 67:
			case 68:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 91:
			case 92:
			case 93:
			case 96:
			case 99:
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
			case 141:
			case 142:
			case 143:
			case 144:
			case 145:
			case 146:
			case 147:
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
			case 11:
				this.dj_fld = 504177375;
				break;
			case 12:
				this.es_fld = var1.co((byte)-46) * -1418994537;
				break;
			case 13:
				this.ep_fld = var1.cg() * 860177335;
				break;
			case 14:
				this.eb_fld = var1.cg() * 1685185171;
				break;
			case 15:
				this.em_fld = false;
				break;
			case 16:
				this.et_fld = true;
				break;
			case 27:
				this.ed_fld = var1.cg();
				break;
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 200:
			case 201:
			case 202:
				this.ew_fld.am(var1, var2, 30, 34, 200, 201, 202, (byte)31);
				break;
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
				this.ex_fld[var2 - 35] = xi.at(var1, 1008754888);
				break;
			case 40:
				int var9 = var1.cg();
				this.du_fld = new short[var9];
				this.db_fld = new short[var9];

				for (int var11 = 0; var11 < var9; var11++) {
					this.du_fld[var11] = (short)var1.cm();
					this.db_fld[var11] = (short)var1.cm();
				}
				break;
			case 41:
				int var8 = var1.cg();
				this.dg_fld = new short[var8];
				this.dw_fld = new short[var8];

				for (int var10 = 0; var10 < var8; var10++) {
					this.dg_fld[var10] = (short)var1.cm();
					this.dw_fld[var10] = (short)var1.cm();
				}
				break;
			case 42:
				this.fo_fld = var1.cw();
				break;
			case 43:
				int var4 = var1.cg();
				if (null == this.eo_fld) {
					this.eo_fld = new String[5][];
				}

				boolean var5 = var4 >= 0 && var4 < 5;
				if (var5 && this.eo_fld[var4] == null) {
					this.eo_fld[var4] = new String[20];
				}

				while (true) {
					int var6 = var1.cg() - 1;
					if (-1 == var6) {
						return;
					}

					String var7 = xi.at(var1, 1042067527);
					if (var5) {
						if (var3 <= 863870848) {
							return;
						}

						if (var6 >= 0 && var6 < 20) {
							if (var3 <= 863870848) {
								return;
							}

							this.eo_fld[var4][var6] = var7;
						}
					}
				}
			case 44:
				this.dk_fld = var1.dl(wa.ak_fld.az_fld) * -1838608271;
				break;
			case 45:
				this.fp_fld = var1.dl(wa.ak_fld.az_fld);
				this.fv_fld = var1.cg();
				break;
			case 46:
				this.fx_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 47:
				this.fc_fld = var1.dl(wa.ak_fld.az_fld) * -1524690295;
				break;
			case 48:
				this.fj_fld = var1.dl(wa.ak_fld.az_fld);
				this.fk_fld = var1.cg();
				break;
			case 49:
				this.fb_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 50:
				this.fh_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 51:
				this.fm_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 52:
				this.fe_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 53:
				this.fw_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 54:
				this.fl_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 65:
				this.el_fld = true;
				this.eh_fld = true;
				break;
			case 75:
				this.ev_fld = var1.cz();
				break;
			case 94:
				this.ec_fld = var1.cm() * 1910353587;
				break;
			case 95:
				this.df_fld = var1.cm() * -333011737;
				break;
			case 97:
				this.en_fld = var1.cm();
				break;
			case 98:
				this.eg_fld = var1.cm();
				break;
			case 100:
			case 101:
			case 102:
			case 103:
			case 104:
			case 105:
			case 106:
			case 107:
			case 108:
			case 109:
				if (this.ez_fld == null) {
					this.ez_fld = new int[10];
					this.er_fld = new int[10];
				}

				this.ez_fld[var2 - 100] = var1.cm();
				this.er_fld[var2 - 100] = var1.cm();
				break;
			case 110:
				this.ef_fld = var1.cm();
				break;
			case 111:
				this.eq_fld = var1.cm();
				break;
			case 112:
				this.ei_fld = var1.cm();
				break;
			case 113:
				this.ee_fld = var1.cw();
				break;
			case 114:
				this.ek_fld = var1.cw() * -1332212003;
				break;
			case 115:
				this.ea_fld = var1.cg() * -417192249;
				break;
			case 139:
				this.eu_fld = var1.cm();
				break;
			case 140:
				this.ej_fld = var1.cm();
				break;
			case 148:
				this.fy_fld = var1.cm();
				break;
			case 149:
				this.fa_fld = var1.cm();
				break;
			case 249:
				this.ey_fld = nc.ak(var1, this.ey_fld);
		}
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;)V"
	)
	public void wx(og var1, og var2) {
		this.vb_fld = var2.getMembersName();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Leg;Loo;I)V"
	)
	void am(eg var1, oo var2, int var3) {
		if (null != this.du_fld) {
			short[] var4 = this.du_fld;
			short[] var5 = this.db_fld;
			if (null != var2 && var2.ae_fld != null && var2.ae_fld.length == this.db_fld.length) {
				if (var3 >= 2024054396) {
					return;
				}

				var5 = var2.ae_fld;
			}

			for (int var6 = 0; var6 < this.du_fld.length; var6++) {
				var1.be(var4[var6], var5[var6]);
			}
		}

		if (null != this.dg_fld) {
			short[] var7 = this.dg_fld;
			short[] var8 = this.dw_fld;
			if (null != var2 && null != var2.ah_fld && var2.ah_fld.length == this.dw_fld.length) {
				var8 = var2.ah_fld;
			}

			for (int var9 = 0; var9 < this.dg_fld.length; var9++) {
				var1.bs(var7[var9], var8[var9]);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)V"
	)
	void as(og var1, og var2, int var3) {
		this.dk_fld = var1.dk_fld;
		this.dy_fld = var1.dy_fld;
		this.di_fld = var1.di_fld;
		this.dn_fld = var1.dn_fld;
		this.df_fld = var1.df_fld;
		this.de_fld = var1.de_fld;
		this.dp_fld = var1.dp_fld;
		this.du_fld = var2.du_fld;
		this.db_fld = var2.db_fld;
		this.dg_fld = var2.dg_fld;
		this.dw_fld = var2.dw_fld;
		this.dx_fld = var2.dx_fld;
		this.ds_fld = var2.ds_fld;
		this.et_fld = var2.et_fld;
		this.dj_fld = 1 * var2.dj_fld;
		this.ep_fld = var2.ep_fld;
		this.eb_fld = var2.eb_fld;
		this.ed_fld = var2.ed_fld * -1990169435;
		this.fp_fld = 1 * var2.fp_fld;
		this.fx_fld = var2.fx_fld * 69298017;
		this.fc_fld = var2.fc_fld;
		this.fj_fld = 1 * var2.fj_fld;
		this.fb_fld = var2.fb_fld * -1758979253;
		this.fh_fld = 1 * var2.fh_fld;
		this.fm_fld = var2.fm_fld * 1992045053;
		this.fe_fld = var2.fe_fld * 1535670989;
		this.fw_fld = var2.fw_fld * 1968619101;
		this.fl_fld = 1 * var2.fl_fld;
		this.ea_fld = var2.ea_fld;
		this.ew_fld = var2.ew_fld;
		this.ev_fld = var2.ev_fld * 779960943;
		this.ex_fld = new String[5];
		if (null != var2.ex_fld) {
			for (int var4 = 0; var4 < 4; var4++) {
				this.ex_fld[var4] = var2.ex_fld[var4];
			}
		}

		this.ex_fld[4] = kh.ac_fld;
		if (var2.eo_fld != null) {
			this.eo_fld = new String[5][];
			System.arraycopy(var2.eo_fld, 0, this.eo_fld, 0, 4);
		} else {
			this.eo_fld = null;
		}

		this.es_fld = 0;
		this.em_fld = false;
		this.xq(var1, var2);
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Log;II)Leg;"
	)
	public static eg fn(og var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var0.ez_fld != null && var1 > 1) {
				int var3 = -1;

				for (int var4 = 0; var4 < 10; var4++) {
					if (var1 >= var0.er_fld[var4] && var0.er_fld[var4] != 0) {
						var3 = var0.ez_fld[var4];
					}
				}

				if (-1 != var3) {
					return fn(kb.ag(var3, -1752383175), 1);
				}
			}

			eg var6 = eg.ak(bl.dm_fld, -500125551 * var0.dk_fld, 0);
			if (var6 == null) {
				return null;
			} else {
				if (128 != var0.ef_fld || var0.eq_fld != 128 || var0.ei_fld != 128) {
					var6.dh(var0.ef_fld, var0.eq_fld, var0.ei_fld);
				}

				var0.am(var6, null, 967707981);
				return var6;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfn;"
	)
	public final fn al(int var1, byte var2) {
		try {
			if (null != this.ez_fld && var1 > 1) {
				int var3 = -1;

				for (int var4 = 0; var4 < 10; var4++) {
					if (var1 >= this.er_fld[var4] && this.er_fld[var4] != 0) {
						var3 = this.ez_fld[var4];
					}
				}

				if (var3 != -1) {
					return kb.ag(var3, -1752383175).al(1, (byte)-40);
				}
			}

			fn var6 = (fn)dd_fld.ak(this.da_fld);
			if (null != var6) {
				return var6;
			} else {
				eg var8 = eg.ak(bl.dm_fld, this.dk_fld * -500125551, 0);
				if (null == var8) {
					return null;
				} else {
					if (this.ef_fld != 128 || 128 != this.eq_fld || this.ei_fld != 128) {
						var8.dh(this.ef_fld, this.eq_fld, this.ei_fld);
					}

					this.am(var8, null, -1313039856);
					var6 = eg.et(var8, 64 + this.ee_fld, this.ek_fld + 768, -50, -10, -50);
					var6.cw_fld = true;
					dd_fld.az(var6, this.da_fld);
					return var6;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Loo;I)Lfn;"
	)
	public final fn au(oo var1, int var2) {
		try {
			fn var3 = var1.al_fld;
			if (null != var3) {
				return var3;
			} else {
				eg var4 = eg.ak(bl.dm_fld, var1.af_fld, 0);
				if (var4 == null) {
					return null;
				} else {
					if (this.ef_fld != 128 || this.eq_fld != 128 || 128 != this.ei_fld) {
						var4.dh(this.ef_fld, this.eq_fld, this.ei_fld);
					}

					this.am(var4, var1, -771645286);
					var3 = eg.et(var4, 64 + this.ee_fld, this.ek_fld + 768, -50, -10, -50);
					var3.cw_fld = true;
					var1.al_fld = var3;
					return var3;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Log;"
	)
	public og ax(int var1, int var2) {
		try {
			if (this.ez_fld != null && var1 > 1) {
				int var3 = -1;

				for (int var4 = 0; var4 < 10; var4++) {
					if (var1 >= this.er_fld[var4] && this.er_fld[var4] != 0) {
						var3 = this.ez_fld[var4];
					}
				}

				if (var3 != -1) {
					return kb.ag(var3, -1752383175);
				}
			}

			return this;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
	)
	public String cg(int var1, String var2) {
		return ih.av(this.ey_fld, var1, var2);
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Log;Leg;Loo;)V"
	)
	public static void mw(og var0, eg var1, oo var2) {
		if (null != var0.du_fld) {
			short[] var3 = var0.du_fld;
			short[] var4 = var0.db_fld;
			if (null != var2 && var2.ae_fld != null && var2.ae_fld.length == var0.db_fld.length) {
				var4 = var2.ae_fld;
			}

			for (int var5 = 0; var5 < var0.du_fld.length; var5++) {
				var1.be(var3[var5], var4[var5]);
			}
		}

		if (null != var0.dg_fld) {
			short[] var6 = var0.dg_fld;
			short[] var7 = var0.dw_fld;
			if (null != var2 && null != var2.ah_fld && var2.ah_fld.length == var0.dw_fld.length) {
				var7 = var2.ah_fld;
			}

			for (int var8 = 0; var8 < var0.dg_fld.length; var8++) {
				var1.bs(var6[var8], var7[var8]);
			}
		}
	}

	@ObfuscatedName("setYan2d")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setYan2d")
	@Override
	public void setYan2d(int var1) {
		this.dn_fld = var1 * -646331283;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cb() {
		return this.db_fld != null;
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Log;)Z"
	)
	public static boolean fn(og var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return null != var0.dw_fld;
	}

	@ObfuscatedName("setTextureToReplace")
	@ObfuscatedSignature(
		descriptor = "([S)V"
	)
	@Export("setTextureToReplace")
	@Override
	public void setTextureToReplace(short[] var1) {
		this.dg_fld = var1;
	}

	og() {
		this.dx_fld = kh.aj_fld;
		this.ds_fld = kh.aj_fld;
		this.dy_fld = 758378768;
		this.di_fld = 0;
		this.dn_fld = 0;
		this.df_fld = 0;
		this.de_fld = 0;
		this.dp_fld = 0;
		this.dj_fld = 0;
		this.es_fld = -1418994537;
		this.ep_fld = -860177335;
		this.eb_fld = -1685185171;
		this.ed_fld = 350119123;
		this.et_fld = false;
		this.ex_fld = new String[]{null, null, null, null, kh.ad_fld};
		this.eo_fld = null;
		this.ec_fld = -1910353587;
		this.en_fld = -151288263;
		this.eg_fld = 1130309671;
		this.ef_fld = 1602743936;
		this.eq_fld = -23360384;
		this.ei_fld = -1110084736;
		this.ee_fld = 0;
		this.ek_fld = 0;
		this.ea_fld = 0;
		this.ev_fld = 0;
		this.em_fld = true;
		this.el_fld = false;
		this.eh_fld = false;
		this.eu_fld = 1760298085;
		this.ej_fld = -2082767501;
		this.fy_fld = 316488611;
		this.fa_fld = 1668555649;
		this.fo_fld = -2133468910;
		this.fp_fld = -1218323753;
		this.fx_fld = 1614054239;
		this.fv_fld = 0;
		this.fj_fld = 1361168579;
		this.fb_fld = 414247325;
		this.fk_fld = 0;
		this.fc_fld = 1524690295;
		this.fh_fld = 1614269739;
		this.fm_fld = -1915106133;
		this.fe_fld = -2061500933;
		this.fw_fld = -2132018677;
		this.fl_fld = 269641837;
		this.ew_fld = new pb();
		this.ew_fld.ad(2, kh.am_fld, 1962058137);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILoo;)Z"
	)
	public final boolean bc(int var1, oo var2) {
		try {
			int var3 = -1008704838 * this.fm_fld;
			int var4 = this.fe_fld * 915166866;
			if (var1 == 1) {
				var3 = this.fw_fld;
				var4 = -1313489489 * this.fl_fld;
			}

			if (null != var2 && var2.ae(var1, -440887622)) {
				var3 = oo.oq(var2, var1, (byte)0);
			}

			if (-1 == var3) {
				return true;
			} else {
				boolean var5 = true;
				if (!bl.dm_fld.cc(var3, 0, 1433395482)) {
					var5 = false;
				}

				if (-1 != var4 && !bl.dm_fld.cc(var4, 0, -215953006)) {
					var5 = false;
				}

				return var5;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("getXan2d")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getXan2d")
	@Override
	public int getXan2d() {
		return this.di_fld;
	}

	@ObfuscatedName("getZan2d")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getZan2d")
	@Override
	public int getZan2d() {
		return this.df_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long ao(int var1, long var2) {
		return hq.az(this.ey_fld, var1, var2);
	}

	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ww() {
		this.vb_fld = this.getName();
		PostItemComposition var1 = new PostItemComposition(this);
		ci_fld.getCallbacks().post(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;"
	)
	public String ab(int var1, String var2, byte var3) {
		return ih.av(this.ey_fld, var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ap(int var1) {
		int var10000;
		if (this.yw_fld == -2) {
			int var2 = -1180259883;
			if (this.fo_fld == -1 || this.ex_fld == null) {
				byte var5 = -1;
				var10000 = var5;
			} else if (this.fo_fld >= 0) {
				var1 = this.ex_fld[this.fo_fld] != null ? this.fo_fld : -1;
				var10000 = var1;
			} else {
				var1 = kh.ad_fld.equalsIgnoreCase(this.ex_fld[4]) ? 4 : -1;
				var10000 = var1;
			}
		} else {
			var10000 = this.yw_fld;
		}

		return var10000;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ac(int var1) {
		return this.db_fld != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean at(int var1) {
		return null != this.dw_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Loq;"
	)
	public oq aj() {
		return this.ew_fld;
	}

	@ObfuscatedName("getInventoryActions")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getInventoryActions")
	@Override
	public String[] getInventoryActions() {
		return this.ex_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Leg;Loo;)V"
	)
	void cx(eg var1, oo var2) {
		if (null != this.du_fld) {
			short[] var3 = this.du_fld;
			short[] var4 = this.db_fld;
			if (null != var2 && var2.ae_fld != null && var2.ae_fld.length == this.db_fld.length) {
				var4 = var2.ae_fld;
			}

			for (int var5 = 0; var5 < this.du_fld.length; var5++) {
				var1.be(var3[var5], var4[var5]);
			}
		}

		if (null != this.dg_fld) {
			short[] var6 = this.dg_fld;
			short[] var7 = this.dw_fld;
			if (null != var2 && null != var2.ah_fld && var2.ah_fld.length == this.dw_fld.length) {
				var7 = var2.ah_fld;
			}

			for (int var8 = 0; var8 < this.dg_fld.length; var8++) {
				var1.bs(var6[var8], var7[var8]);
			}
		}
	}

	@ObfuscatedName("yy")
	@ObfuscatedSignature(
		descriptor = "(Log;ILoo;)Z"
	)
	public static boolean yy(og var0, int var1, oo var2) throws EOFException {
		try {
			int var3 = var0.fp_fld;
			int var4 = var0.fx_fld;
			int var5 = var0.fc_fld * 1209245286;
			if (1 == var1) {
				var3 = var0.fj_fld;
				var4 = var0.fb_fld;
				var5 = var0.fh_fld;
			}

			if (var2 != null && var2.av(var1, 1318487140)) {
				var3 = var2.ah(var1, -1345698668);
			}

			if (-1 == var3) {
				return true;
			} else {
				boolean var6 = true;
				if (!bl.dm_fld.cc(var3, 0, 431463733)) {
					var6 = false;
				}

				if (var4 != -1 && !bl.dm_fld.cc(var4, 0, 625217291)) {
					var6 = false;
				}

				if (var5 != -1 && !bl.dm_fld.cc(var5, 0, -1145032728)) {
					var6 = false;
				}

				return var6;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("getPrice")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPrice")
	@Override
	public int getPrice() {
		return this.es_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void br() {
		if (this.dj_fld == 1) {
			this.ev_fld = 0;
		}
	}

	@ObfuscatedName("getPlaceholderTemplateId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPlaceholderTemplateId")
	@Override
	public int getPlaceholderTemplateId() {
		return this.fa_fld;
	}

	@ObfuscatedName("getNote")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getNote")
	@Override
	public int getNote() {
		return this.eg_fld;
	}

	@ObfuscatedName("getTextureToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Export("getTextureToReplaceWith")
	@Override
	public short[] getTextureToReplaceWith() {
		return this.dw_fld;
	}

	@ObfuscatedName("isStackable")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isStackable")
	@Override
	public boolean isStackable() {
		return this.cz() != 0;
	}

	@ObfuscatedName("setColorToReplace")
	@ObfuscatedSignature(
		descriptor = "([S)V"
	)
	@Export("setColorToReplace")
	@Override
	public void setColorToReplace(short[] var1) {
		this.du_fld = var1;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(ILoo;)Leg;"
	)
	public final eg cy(int var1, oo var2) {
		try {
			int var3 = this.fm_fld;
			int var4 = this.fe_fld;
			if (var1 == 1) {
				var3 = this.fw_fld;
				var4 = this.fl_fld;
			}

			if (null != var2 && var2.ae(var1, -1854164661)) {
				var3 = oo.oq(var2, var1, (byte)0);
			}

			if (var3 == -1) {
				return null;
			} else {
				eg var5 = eg.ak(bl.dm_fld, var3, 0);
				if (-1 != var4) {
					eg var6 = eg.ak(bl.dm_fld, var4, 0);
					eg[] var7 = new eg[]{var5, var6};
					var5 = new eg(var7, 2);
				}

				this.am(var5, var2, 1617139092);
				return var5;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void bs(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.dx_fld = xi.at(var1, -1862838355);
				break;
			case 3:
				this.ds_fld = xi.at(var1, -842233921);
				break;
			case 4:
				this.dy_fld = var1.cm() * 1733789712;
				break;
			case 5:
				this.di_fld = var1.cm() * 2052519930;
				break;
			case 6:
				this.dn_fld = var1.cm() * -1627510870;
				break;
			case 7:
				this.de_fld = var1.cm() * -639166725;
				if (this.de_fld > -406411815) {
					this.de_fld -= -1251857481;
				}
				break;
			case 8:
				this.dp_fld = var1.cm() * 2057930091;
				if (this.dp_fld > 32767) {
					this.dp_fld -= -2056585216;
				}
				break;
			case 9:
				xi.at(var1, 1247034421);
			case 10:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 28:
			case 29:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
			case 63:
			case 64:
			case 66:
			case 67:
			case 68:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 91:
			case 92:
			case 93:
			case 96:
			case 99:
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
			case 141:
			case 142:
			case 143:
			case 144:
			case 145:
			case 146:
			case 147:
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
			case 11:
				this.dj_fld = 504177375;
				break;
			case 12:
				this.es_fld = var1.co((byte)-74) * -1418994537;
				break;
			case 13:
				this.ep_fld = var1.cg() * -1275658109;
				break;
			case 14:
				this.eb_fld = var1.cg() * -137486376;
				break;
			case 15:
				this.em_fld = false;
				break;
			case 16:
				this.et_fld = true;
				break;
			case 27:
				this.ed_fld = var1.cg() * -877975007;
				break;
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 200:
			case 201:
			case 202:
				this.ew_fld.am(var1, var2, 30, 34, -2053073260, 1753325667, 202, (byte)-39);
				break;
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
				this.ex_fld[var2 - 35] = xi.at(var1, 135343089);
				break;
			case 40:
				int var8 = var1.cg();
				this.du_fld = new short[var8];
				this.db_fld = new short[var8];

				for (int var10 = 0; var10 < var8; var10++) {
					this.du_fld[var10] = (short)var1.cm();
					this.db_fld[var10] = (short)var1.cm();
				}
				break;
			case 41:
				int var7 = var1.cg();
				this.dg_fld = new short[var7];
				this.dw_fld = new short[var7];

				for (int var9 = 0; var9 < var7; var9++) {
					this.dg_fld[var9] = (short)var1.cm();
					this.dw_fld[var9] = (short)var1.cm();
				}
				break;
			case 42:
				this.fo_fld = var1.cw() * 2130635564;
				break;
			case 43:
				int var3 = var1.cg();
				if (null == this.eo_fld) {
					this.eo_fld = new String[5][];
				}

				boolean var4 = var3 >= 0 && var3 < 5;
				if (var4 && this.eo_fld[var3] == null) {
					this.eo_fld[var3] = new String[20];
				}

				while (true) {
					int var5 = var1.cg() - 1;
					if (-1 == var5) {
						return;
					}

					String var6 = xi.at(var1, 1540041453);
					if (var4 && var5 >= 0 && var5 < 20) {
						this.eo_fld[var3][var5] = var6;
					}
				}
			case 44:
				this.dk_fld = var1.dl(wa.ak_fld.az_fld) * -801293589;
				break;
			case 45:
				this.fp_fld = var1.dl(wa.ak_fld.az_fld) * -1646988888;
				this.fv_fld = var1.cg();
				break;
			case 46:
				this.fx_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 47:
				this.fc_fld = var1.dl(wa.ak_fld.az_fld) * -1524690295;
				break;
			case 48:
				this.fj_fld = var1.dl(wa.ak_fld.az_fld);
				this.fk_fld = var1.cg() * 1099324000;
				break;
			case 49:
				this.fb_fld = var1.dl(wa.ak_fld.az_fld) * 1156791517;
				break;
			case 50:
				this.fh_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 51:
				this.fm_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 52:
				this.fe_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 53:
				this.fw_fld = var1.dl(wa.ak_fld.az_fld) * -829848406;
				break;
			case 54:
				this.fl_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 65:
				this.el_fld = true;
				this.eh_fld = true;
				break;
			case 75:
				this.ev_fld = var1.cz();
				break;
			case 94:
				this.ec_fld = var1.cm() * 697624140;
				break;
			case 95:
				this.df_fld = var1.cm() * -466470690;
				break;
			case 97:
				this.en_fld = var1.cm() * -20581966;
				break;
			case 98:
				this.eg_fld = var1.cm();
				break;
			case 100:
			case 101:
			case 102:
			case 103:
			case 104:
			case 105:
			case 106:
			case 107:
			case 108:
			case 109:
				if (this.ez_fld == null) {
					this.ez_fld = new int[10];
					this.er_fld = new int[10];
				}

				this.ez_fld[var2 - 175892634] = var1.cm();
				this.er_fld[var2 - -1428433208] = var1.cm();
				break;
			case 110:
				this.ef_fld = var1.cm();
				break;
			case 111:
				this.eq_fld = var1.cm();
				break;
			case 112:
				this.ei_fld = var1.cm() * 438824917;
				break;
			case 113:
				this.ee_fld = var1.cw() * 1073145506;
				break;
			case 114:
				this.ek_fld = var1.cw() * -1332212003;
				break;
			case 115:
				this.ea_fld = var1.cg() * -427772739;
				break;
			case 139:
				this.eu_fld = var1.cm();
				break;
			case 140:
				this.ej_fld = var1.cm() * 1031041455;
				break;
			case 148:
				this.fy_fld = var1.cm();
				break;
			case 149:
				this.fa_fld = var1.cm() * 870659146;
				break;
			case 249:
				this.ey_fld = nc.ak(var1, this.ey_fld);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;)V"
	)
	void bj(og var1, og var2) {
		this.dk_fld = var1.dk_fld;
		this.dy_fld = var1.dy_fld;
		this.di_fld = var1.di_fld;
		this.dn_fld = var1.dn_fld;
		this.df_fld = var1.df_fld;
		this.de_fld = var1.de_fld;
		this.dp_fld = var1.dp_fld;
		this.du_fld = var1.du_fld;
		this.db_fld = var1.db_fld;
		this.dg_fld = var1.dg_fld;
		this.dw_fld = var1.dw_fld;
		this.dx_fld = var2.dx_fld;
		this.ds_fld = kh.aq_fld;
		this.et_fld = var2.et_fld;
		this.es_fld = var2.es_fld;
		this.em_fld = var2.em_fld;
		this.dj_fld = 504177375;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;)V"
	)
	void bf(og var1, og var2) {
		this.dk_fld = var1.dk_fld;
		this.dy_fld = var1.dy_fld;
		this.di_fld = var1.di_fld;
		this.dn_fld = var1.dn_fld;
		this.df_fld = var1.df_fld;
		this.de_fld = var1.de_fld;
		this.dp_fld = var1.dp_fld;
		this.du_fld = var1.du_fld;
		this.db_fld = var1.db_fld;
		this.dg_fld = var1.dg_fld;
		this.dw_fld = var1.dw_fld;
		this.dx_fld = var2.dx_fld;
		this.ds_fld = kh.aq_fld;
		this.et_fld = var2.et_fld;
		this.es_fld = var2.es_fld;
		this.em_fld = var2.em_fld;
		this.dj_fld = 1927112872;
	}

	@ObfuscatedName("isGeTradeable")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isGeTradeable")
	@Override
	public boolean isGeTradeable() {
		return this.el_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bz() {
		if (this.dj_fld == 1) {
			this.ev_fld = 0;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;)V"
	)
	void bl(og var1, og var2) {
		this.dk_fld = var1.dk_fld;
		this.dy_fld = var1.dy_fld;
		this.di_fld = var1.di_fld;
		this.dn_fld = var1.dn_fld;
		this.df_fld = var1.df_fld;
		this.de_fld = var1.de_fld;
		this.dp_fld = var1.dp_fld;
		this.du_fld = var2.du_fld;
		this.db_fld = var2.db_fld;
		this.dg_fld = var2.dg_fld;
		this.dw_fld = var2.dw_fld;
		this.dx_fld = var2.dx_fld;
		this.ds_fld = var2.ds_fld;
		this.et_fld = var2.et_fld;
		this.dj_fld = 1 * var2.dj_fld;
		this.ep_fld = var2.ep_fld;
		this.eb_fld = var2.eb_fld;
		this.ed_fld = var2.ed_fld * -1990169435;
		this.fp_fld = 1 * var2.fp_fld;
		this.fx_fld = var2.fx_fld * 69298017;
		this.fc_fld = var2.fc_fld;
		this.fj_fld = 1 * var2.fj_fld;
		this.fb_fld = var2.fb_fld * -1758979253;
		this.fh_fld = 1 * var2.fh_fld;
		this.fm_fld = var2.fm_fld * 1992045053;
		this.fe_fld = var2.fe_fld * 1535670989;
		this.fw_fld = var2.fw_fld * 1968619101;
		this.fl_fld = 1 * var2.fl_fld;
		this.ea_fld = var2.ea_fld;
		this.ew_fld = var2.ew_fld;
		this.ev_fld = var2.ev_fld * 779960943;
		this.ex_fld = new String[5];
		if (null != var2.ex_fld) {
			for (int var3 = 0; var3 < 4; var3++) {
				this.ex_fld[var3] = var2.ex_fld[var3];
			}
		}

		this.ex_fld[4] = kh.ac_fld;
		if (var2.eo_fld != null) {
			this.eo_fld = new String[5][];
			System.arraycopy(var2.eo_fld, 0, this.eo_fld, 0, 4);
		} else {
			this.eo_fld = null;
		}

		this.es_fld = 0;
		this.em_fld = false;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;)V"
	)
	void bx(og var1, og var2) {
		this.dk_fld = var1.dk_fld;
		this.dy_fld = var1.dy_fld;
		this.di_fld = var1.di_fld;
		this.dn_fld = var1.dn_fld;
		this.df_fld = var1.df_fld;
		this.de_fld = var1.de_fld;
		this.dp_fld = var1.dp_fld;
		this.du_fld = var2.du_fld;
		this.db_fld = var2.db_fld;
		this.dg_fld = var2.dg_fld;
		this.dw_fld = var2.dw_fld;
		this.dx_fld = var2.dx_fld;
		this.ds_fld = var2.ds_fld;
		this.et_fld = var2.et_fld;
		this.dj_fld = 1 * var2.dj_fld;
		this.ep_fld = var2.ep_fld;
		this.eb_fld = var2.eb_fld;
		this.ed_fld = var2.ed_fld * -1990169435;
		this.fp_fld = 1 * var2.fp_fld;
		this.fx_fld = var2.fx_fld * 69298017;
		this.fc_fld = var2.fc_fld;
		this.fj_fld = 1 * var2.fj_fld;
		this.fb_fld = var2.fb_fld * -1758979253;
		this.fh_fld = 1 * var2.fh_fld;
		this.fm_fld = var2.fm_fld * 1992045053;
		this.fe_fld = var2.fe_fld * 1535670989;
		this.fw_fld = var2.fw_fld * 1968619101;
		this.fl_fld = 1 * var2.fl_fld;
		this.ea_fld = var2.ea_fld;
		this.ew_fld = var2.ew_fld;
		this.ev_fld = var2.ev_fld * 779960943;
		this.ex_fld = new String[5];
		if (null != var2.ex_fld) {
			for (int var3 = 0; var3 < 4; var3++) {
				this.ex_fld[var3] = var2.ex_fld[var3];
			}
		}

		this.ex_fld[4] = kh.ac_fld;
		if (var2.eo_fld != null) {
			this.eo_fld = new String[5][];
			System.arraycopy(var2.eo_fld, 0, this.eo_fld, 0, 4);
		} else {
			this.eo_fld = null;
		}

		this.es_fld = 0;
		this.em_fld = false;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kj() {
		return this.fp_fld;
	}

	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "(Log;I)Loq;"
	)
	public static oq tk(og var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ew_fld;
	}

	@ObfuscatedName("getMembersName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getMembersName")
	@Override
	public String getMembersName() {
		return this.vb_fld;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cz() {
		return this.dj_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;)V"
	)
	void bo(og var1, og var2) {
		this.dk_fld = var1.dk_fld;
		this.dy_fld = var1.dy_fld;
		this.di_fld = var1.di_fld;
		this.dn_fld = var1.dn_fld;
		this.df_fld = var1.df_fld;
		this.de_fld = var1.de_fld;
		this.dp_fld = var1.dp_fld;
		this.du_fld = var1.du_fld;
		this.db_fld = var1.db_fld;
		this.dg_fld = var1.dg_fld;
		this.dw_fld = var1.dw_fld;
		this.ec_fld = var1.ec_fld;
		this.dj_fld = 1 * var1.dj_fld;
		this.dx_fld = var2.dx_fld;
		this.ds_fld = var2.ds_fld;
		this.es_fld = 0;
		this.et_fld = false;
		this.em_fld = false;
		this.el_fld = false;
		this.eh_fld = false;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;)V"
	)
	public void dz(og var1, og var2) {
		this.vb_fld = var2.getMembersName();
	}

	@ObfuscatedName("getShiftClickActionIndex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getShiftClickActionIndex")
	@Override
	public int getShiftClickActionIndex() {
		return this.ap(-1180259883);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Leg;"
	)
	public final eg bp(int var1) {
		try {
			if (this.ez_fld != null && var1 > 1) {
				int var2 = -1;

				for (int var3 = 0; var3 < 10; var3++) {
					if (var1 >= this.er_fld[var3] && this.er_fld[var3] != 0) {
						var2 = this.ez_fld[var3];
					}
				}

				if (-1 != var2) {
					return fn(kb.ag(var2, -1752383175), 1);
				}
			}

			eg var6 = eg.ak(bl.dm_fld, -500125551 * this.dk_fld, 0);
			if (var6 == null) {
				return null;
			} else {
				if (128 != this.ef_fld || this.eq_fld != 128 || this.ei_fld != 128) {
					var6.dh(this.ef_fld, this.eq_fld, this.ei_fld);
				}

				this.am(var6, null, -1015222085);
				return var6;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Log;)I"
	)
	public static int lg(og var0) {
		if (var0.fo_fld == -1 || var0.ex_fld == null) {
			return -1;
		} else if (var0.fo_fld >= 0) {
			return var0.ex_fld[var0.fo_fld] != null ? var0.fo_fld : -1;
		} else {
			return kh.ad_fld.equalsIgnoreCase(var0.ex_fld[4]) ? 4 : -1;
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Log;ILoo;B)Leg;"
	)
	public static eg gn(og var0, int var1, oo var2, byte var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var4 = var0.fp_fld;
			int var5 = var0.fx_fld;
			int var6 = var0.fc_fld * 1337197497;
			if (1 == var1) {
				var4 = var0.fj_fld;
				var5 = var0.fb_fld;
				var6 = var0.fh_fld;
			}

			if (null != var2 && var2.av(var1, -1503157837)) {
				var4 = var2.ah(var1, -1345698668);
			}

			if (-1 == var4) {
				return null;
			} else {
				eg var7 = eg.ak(bl.dm_fld, var4, 0);
				if (var5 != -1) {
					eg var8 = eg.ak(bl.dm_fld, var5, 0);
					if (var6 != -1) {
						eg var9 = eg.ak(bl.dm_fld, var6, 0);
						eg[] var10 = new eg[]{var7, var8, var9};
						var7 = new eg(var10, 3);
					} else {
						eg[] var12 = new eg[]{var7, var8};
						var7 = new eg(var12, 2);
					}
				}

				if (0 == var1 && 0 != var0.fv_fld) {
					var7.dz(0, var0.fv_fld, 0);
				}

				if (var1 == 1 && 0 != var0.fk_fld) {
					var7.dz(0, var0.fk_fld, 0);
				}

				var0.am(var7, var2, -144948734);
				return var7;
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Leg;"
	)
	public final eg bt(int var1) {
		try {
			if (this.ez_fld != null && var1 > 1) {
				int var2 = -1;

				for (int var3 = 0; var3 < 10; var3++) {
					if (var1 >= this.er_fld[var3] && this.er_fld[var3] != 0) {
						var2 = this.ez_fld[var3];
					}
				}

				if (-1 != var2) {
					return fn(kb.ag(var2, -1752383175), 1);
				}
			}

			eg var6 = eg.ak(bl.dm_fld, -500125551 * this.dk_fld, 0);
			if (var6 == null) {
				return null;
			} else {
				if (128 != this.ef_fld || this.eq_fld != 128 || this.ei_fld != 128) {
					var6.dh(this.ef_fld, this.eq_fld, this.ei_fld);
				}

				this.am(var6, null, -834155764);
				return var6;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	public final fn bv(int var1) {
		try {
			if (null != this.ez_fld && var1 > 1) {
				int var2 = -1;

				for (int var3 = 0; var3 < 10; var3++) {
					if (var1 >= this.er_fld[var3] && this.er_fld[var3] != 0) {
						var2 = this.ez_fld[var3];
					}
				}

				if (var2 != -1) {
					return kb.ag(var2, -1752383175).al(1, (byte)-114);
				}
			}

			fn var6 = (fn)dd_fld.ak(this.da_fld);
			if (null != var6) {
				return var6;
			} else {
				eg var8 = eg.ak(bl.dm_fld, this.dk_fld * -500125551, 0);
				if (null == var8) {
					return null;
				} else {
					if (this.ef_fld != 128 || 128 != this.eq_fld || this.ei_fld != 128) {
						var8.dh(this.ef_fld, this.eq_fld, this.ei_fld);
					}

					this.am(var8, null, 1820018405);
					var6 = eg.et(var8, 64 + this.ee_fld, this.ek_fld + 768, -50, -10, -50);
					var6.cw_fld = true;
					dd_fld.az(var6, this.da_fld);
					return var6;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;Log;B)V"
	)
	public static void mw(og var0, og var1, og var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.dk_fld = var1.dk_fld;
			var0.dy_fld = var1.dy_fld;
			var0.di_fld = var1.di_fld;
			var0.dn_fld = var1.dn_fld;
			var0.df_fld = var1.df_fld;
			var0.de_fld = var1.de_fld;
			var0.dp_fld = var1.dp_fld;
			var0.du_fld = var1.du_fld;
			var0.db_fld = var1.db_fld;
			var0.dg_fld = var1.dg_fld;
			var0.dw_fld = var1.dw_fld;
			var0.ec_fld = var1.ec_fld;
			var0.dj_fld = 1 * var1.dj_fld;
			var0.dx_fld = var2.dx_fld;
			var0.ds_fld = var2.ds_fld;
			var0.es_fld = 0;
			var0.et_fld = false;
			var0.em_fld = false;
			var0.el_fld = false;
			var0.eh_fld = false;
			var0.dz(var1, var2);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	public final fn bi(int var1) {
		try {
			if (null != this.ez_fld && var1 > 1) {
				int var2 = -1;

				for (int var3 = 0; var3 < 10; var3++) {
					if (var1 >= this.er_fld[var3] && this.er_fld[var3] != 0) {
						var2 = this.ez_fld[var3];
					}
				}

				if (var2 != -1) {
					return kb.ag(var2, -1752383175).al(1, (byte)-53);
				}
			}

			fn var6 = (fn)dd_fld.ak(-46309619 * this.da_fld);
			if (null != var6) {
				return var6;
			} else {
				eg var8 = eg.ak(bl.dm_fld, this.dk_fld * -500125551, 0);
				if (null == var8) {
					return null;
				} else {
					if (this.ef_fld != 128 || -463815898 != this.eq_fld || this.ei_fld != 128) {
						var8.dh(this.ef_fld, 415584634 * this.eq_fld, this.ei_fld);
					}

					this.am(var8, null, -1547886970);
					var6 = eg.et(var8, 1164438486 + this.ee_fld, this.ek_fld + 768, -50, -10, -670758117);
					var6.cw_fld = true;
					dd_fld.az(var6, this.da_fld);
					return var6;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("setTextureToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "([S)V"
	)
	@Export("setTextureToReplaceWith")
	@Override
	public void setTextureToReplaceWith(short[] var1) {
		this.dw_fld = var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	public og bu(int var1) {
		try {
			if (this.ez_fld != null && var1 > 1) {
				int var2 = -1;

				for (int var3 = 0; var3 < 10; var3++) {
					if (var1 >= this.er_fld[var3] && this.er_fld[var3] != 0) {
						var2 = this.ez_fld[var3];
					}
				}

				if (var2 != -1) {
					return kb.ag(var2, -1752383175);
				}
			}

			return this;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("getColorToReplace")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Export("getColorToReplace")
	@Override
	public short[] getColorToReplace() {
		return this.du_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILoo;I)Z"
	)
	public final boolean ai(int var1, oo var2, int var3) {
		try {
			int var4 = this.fm_fld;
			int var5 = this.fe_fld;
			if (var1 == 1) {
				var4 = this.fw_fld;
				var5 = this.fl_fld;
			}

			if (null != var2 && var2.ae(var1, -1091913798)) {
				var4 = oo.oq(var2, var1, (byte)0);
			}

			if (-1 == var4) {
				return true;
			} else {
				boolean var6 = true;
				if (!bl.dm_fld.cc(var4, 0, 1350007187)) {
					var6 = false;
				}

				if (-1 != var5 && !bl.dm_fld.cc(var5, 0, -417968546)) {
					var6 = false;
				}

				return var6;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("getParams")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/IterableHashTable;"
	)
	@Export("getParams")
	@Override
	public IterableHashTable getParams() {
		return this.ey_fld;
	}

	@ObfuscatedName("getAmbient")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAmbient")
	@Override
	public int getAmbient() {
		return this.ee_fld;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;Log;)V"
	)
	public static void ek(og var0, og var1, og var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.dk_fld = var1.dk_fld;
		var0.dy_fld = var1.dy_fld;
		var0.di_fld = var1.di_fld;
		var0.dn_fld = var1.dn_fld;
		var0.df_fld = var1.df_fld;
		var0.de_fld = var1.de_fld;
		var0.dp_fld = var1.dp_fld;
		var0.du_fld = var1.du_fld;
		var0.db_fld = var1.db_fld;
		var0.dg_fld = var1.dg_fld;
		var0.dw_fld = var1.dw_fld;
		var0.dx_fld = var2.dx_fld;
		var0.ds_fld = kh.aq_fld;
		var0.et_fld = var2.et_fld;
		var0.es_fld = var2.es_fld;
		var0.em_fld = var2.em_fld;
		var0.dj_fld = 504177375;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ch() {
		return null != this.dw_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILoo;)Leg;"
	)
	public final eg ba(int var1, oo var2) {
		try {
			int var3 = 864073664 * this.fp_fld;
			int var4 = this.fx_fld * 361111892;
			int var5 = this.fc_fld * 567170307;
			if (1 == var1) {
				var3 = this.fj_fld;
				var4 = this.fb_fld;
				var5 = this.fh_fld * -2010209968;
			}

			if (null != var2 && var2.av(var1, -58965743)) {
				var3 = var2.ah(var1, -1345698668);
			}

			if (-1 == var3) {
				return null;
			} else {
				eg var6 = eg.ak(bl.dm_fld, var3, 0);
				if (var4 != -1) {
					eg var7 = eg.ak(bl.dm_fld, var4, 0);
					if (var5 != -1) {
						eg var8 = eg.ak(bl.dm_fld, var5, 0);
						eg[] var9 = new eg[]{var6, var7, var8};
						var6 = new eg(var9, 3);
					} else {
						eg[] var12 = new eg[]{var6, var7};
						var6 = new eg(var12, 2);
					}
				}

				if (0 == var1 && 0 != this.fv_fld) {
					var6.dz(0, 367202016 * this.fv_fld, 0);
				}

				if (var1 == 1 && 0 != this.fk_fld) {
					var6.dz(0, this.fk_fld * 897034181, 0);
				}

				this.am(var6, var2, -411992488);
				return var6;
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(ILoo;)Z"
	)
	public final boolean cd(int var1, oo var2) {
		try {
			int var3 = this.fm_fld;
			int var4 = this.fe_fld;
			if (var1 == 1) {
				var3 = this.fw_fld;
				var4 = this.fl_fld;
			}

			if (null != var2 && var2.ae(var1, 1023335190)) {
				var3 = oo.oq(var2, var1, (byte)0);
			}

			if (-1 == var3) {
				return true;
			} else {
				boolean var5 = true;
				if (!bl.dm_fld.cc(var3, 0, -1730899769)) {
					var5 = false;
				}

				if (-1 != var4 && !bl.dm_fld.cc(var4, 0, -1584818743)) {
					var5 = false;
				}

				return var5;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("isTradeable")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isTradeable")
	@Override
	public boolean isTradeable() {
		return this.em_fld;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Log;I)V"
	)
	public static void hh(og var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.dj_fld == 1) {
				var0.ev_fld = 0;
			}

			var0.ww();
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(ILoo;)Z"
	)
	public final boolean cc(int var1, oo var2) {
		try {
			int var3 = -1851128794 * this.fm_fld;
			int var4 = this.fe_fld;
			if (var1 == 1) {
				var3 = -1054668202 * this.fw_fld;
				var4 = this.fl_fld;
			}

			if (null != var2 && var2.ae(var1, 128357254)) {
				var3 = oo.oq(var2, var1, (byte)0);
			}

			if (-1 == var3) {
				return true;
			} else {
				boolean var5 = true;
				if (!bl.dm_fld.cc(var3, 0, -2010081224)) {
					var5 = false;
				}

				if (-1 != var4 && !bl.dm_fld.cc(var4, 0, 1419425780)) {
					var5 = false;
				}

				return var5;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long cr(int var1, long var2) {
		return hq.az(this.ey_fld, var1, var2);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILoo;)Leg;"
	)
	public final eg cq(int var1, oo var2) {
		try {
			int var3 = this.fm_fld;
			int var4 = this.fe_fld;
			if (var1 == 1) {
				var3 = this.fw_fld;
				var4 = this.fl_fld;
			}

			if (null != var2 && var2.ae(var1, -963084423)) {
				var3 = oo.oq(var2, var1, (byte)0);
			}

			if (var3 == -1) {
				return null;
			} else {
				eg var5 = eg.ak(bl.dm_fld, var3, 0);
				if (-1 != var4) {
					eg var6 = eg.ak(bl.dm_fld, var4, 0);
					eg[] var7 = new eg[]{var5, var6};
					var5 = new eg(var7, 2);
				}

				this.am(var5, var2, 647273862);
				return var5;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ah(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			this.aw(var1, var3, 1758741037);
		}
	}

	@ObfuscatedName("getTextureToReplace")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Export("getTextureToReplace")
	@Override
	public short[] getTextureToReplace() {
		return this.dg_fld;
	}

	@ObfuscatedName("getInventoryModel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getInventoryModel")
	@Override
	public int getInventoryModel() {
		return this.dk_fld;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Leg;Loo;)V"
	)
	void cs(eg var1, oo var2) {
		if (null != this.du_fld) {
			short[] var3 = this.du_fld;
			short[] var4 = this.db_fld;
			if (null != var2 && var2.ae_fld != null && var2.ae_fld.length == this.db_fld.length) {
				var4 = var2.ae_fld;
			}

			for (int var5 = 0; var5 < this.du_fld.length; var5++) {
				var1.be(var3[var5], var4[var5]);
			}
		}

		if (null != this.dg_fld) {
			short[] var6 = this.dg_fld;
			short[] var7 = this.dw_fld;
			if (null != var2 && null != var2.ah_fld && var2.ah_fld.length == this.dw_fld.length) {
				var7 = var2.ah_fld;
			}

			for (int var8 = 0; var8 < this.dg_fld.length; var8++) {
				var1.bs(var6[var8], var7[var8]);
			}
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Log;ILoo;)Z"
	)
	public static boolean ja(og var0, int var1, oo var2) throws EOFException {
		try {
			int var3 = 1085993499 * var0.fp_fld;
			int var4 = var0.fx_fld * 902667004;
			int var5 = var0.fc_fld * 2062759380;
			if (1 == var1) {
				var3 = var0.fj_fld;
				var4 = var0.fb_fld * -853503351;
				var5 = var0.fh_fld;
			}

			if (var2 != null && var2.av(var1, 298530531)) {
				var3 = var2.ah(var1, -1345698668);
			}

			if (-1 == var3) {
				return true;
			} else {
				boolean var6 = true;
				if (!bl.dm_fld.cc(var3, 0, 1031103052)) {
					var6 = false;
				}

				if (var4 != -1 && !bl.dm_fld.cc(var4, 0, -1904110902)) {
					var6 = false;
				}

				if (var5 != -1 && !bl.dm_fld.cc(var5, 0, -1395112393)) {
					var6 = false;
				}

				return var6;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ce(int var1, int var2) {
		return my.ag(this.ey_fld, var1, var2);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long cn(int var1, long var2) {
		return hq.az(this.ey_fld, var1, var2);
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Log;ILoo;)Leg;"
	)
	public static eg ip(og var0, int var1, oo var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var3 = var0.fm_fld;
			int var4 = var0.fe_fld * 1215052552;
			if (var1 == 1) {
				var3 = var0.fw_fld * 532131112;
				var4 = -1207144074 * var0.fl_fld;
			}

			if (null != var2 && var2.ae(var1, -1482549406)) {
				var3 = oo.oq(var2, var1, (byte)0);
			}

			if (var3 == -1) {
				return null;
			} else {
				eg var5 = eg.ak(bl.dm_fld, var3, 0);
				if (-1 != var4) {
					eg var6 = eg.ak(bl.dm_fld, var4, 0);
					eg[] var7 = new eg[]{var5, var6};
					var5 = new eg(var7, 2);
				}

				var0.am(var5, var2, -938288194);
				return var5;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("setZan2d")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setZan2d")
	@Override
	public void setZan2d(int var1) {
		this.df_fld = var1 * -333011737;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILoo;I)Leg;"
	)
	public final eg aq(int var1, oo var2, int var3) {
		try {
			int var4 = this.fm_fld;
			int var5 = this.fe_fld;
			if (var1 == 1) {
				var4 = this.fw_fld;
				var5 = this.fl_fld;
			}

			if (null != var2 && var2.ae(var1, 355706820)) {
				var4 = oo.oq(var2, var1, (byte)0);
			}

			if (var4 == -1) {
				return null;
			} else {
				eg var6 = eg.ak(bl.dm_fld, var4, 0);
				if (-1 != var5) {
					eg var7 = eg.ak(bl.dm_fld, var5, 0);
					eg[] var8 = new eg[]{var6, var7};
					var6 = new eg(var8, 2);
				}

				this.am(var6, var2, 306209264);
				return var6;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	static {
		do_fld.oc(1024);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;)V"
	)
	void by(og var1, og var2) {
		this.dk_fld = var1.dk_fld;
		this.dy_fld = var1.dy_fld;
		this.di_fld = var1.di_fld;
		this.dn_fld = var1.dn_fld;
		this.df_fld = var1.df_fld;
		this.de_fld = var1.de_fld;
		this.dp_fld = var1.dp_fld;
		this.du_fld = var1.du_fld;
		this.db_fld = var1.db_fld;
		this.dg_fld = var1.dg_fld;
		this.dw_fld = var1.dw_fld;
		this.dx_fld = var2.dx_fld;
		this.ds_fld = kh.aq_fld;
		this.et_fld = var2.et_fld;
		this.es_fld = var2.es_fld;
		this.em_fld = var2.em_fld;
		this.dj_fld = -96064603;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
	)
	public String cw(int var1, String var2) {
		return ih.av(this.ey_fld, var1, var2);
	}

	@ObfuscatedName("getPlaceholderId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPlaceholderId")
	@Override
	public int getPlaceholderId() {
		return this.fy_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return this.da_fld;
	}

	@ObfuscatedName("getSubops")
	@ObfuscatedSignature(
		descriptor = "()[[Ljava/lang/String;"
	)
	@Export("getSubops")
	@Override
	public String[][] getSubops() {
		return this.eo_fld;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Log;ILoo;)Leg;"
	)
	public static eg ek(og var0, int var1, oo var2) throws EOFException {
		try {
			int var3 = -119807420 * var0.fm_fld;
			int var4 = var0.fe_fld;
			if (var1 == 1) {
				var3 = var0.fw_fld * -1748650609;
				var4 = var0.fl_fld;
			}

			if (null != var2 && var2.ae(var1, -524862536)) {
				var3 = oo.oq(var2, var1, (byte)0);
			}

			if (var3 == -1) {
				return null;
			} else {
				eg var5 = eg.ak(bl.dm_fld, var3, 0);
				if (-1 != var4) {
					eg var6 = eg.ak(bl.dm_fld, var4, 0);
					eg[] var7 = new eg[]{var5, var6};
					var5 = new eg(var7, 2);
				}

				var0.am(var5, var2, -1832697593);
				return var5;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILoo;)Leg;"
	)
	public final eg bq(int var1, oo var2) {
		try {
			int var3 = -1925509050 * this.fp_fld;
			int var4 = this.fx_fld;
			int var5 = this.fc_fld * 1671910993;
			if (1 == var1) {
				var3 = this.fj_fld;
				var4 = this.fb_fld * -1466797319;
				var5 = this.fh_fld * -211312008;
			}

			if (null != var2 && var2.av(var1, -1490226672)) {
				var3 = var2.ah(var1, -1345698668);
			}

			if (-1 == var3) {
				return null;
			} else {
				eg var6 = eg.ak(bl.dm_fld, var3, 0);
				if (var4 != -1) {
					eg var7 = eg.ak(bl.dm_fld, var4, 0);
					if (var5 != -1) {
						eg var8 = eg.ak(bl.dm_fld, var5, 0);
						eg[] var9 = new eg[]{var6, var7, var8};
						var6 = new eg(var9, 3);
					} else {
						eg[] var12 = new eg[]{var6, var7};
						var6 = new eg(var12, 2);
					}
				}

				if (0 == var1 && 0 != this.fv_fld) {
					var6.dz(0, this.fv_fld, 0);
				}

				if (var1 == 1 && 0 != this.fk_fld) {
					var6.dz(0, this.fk_fld * -216742790, 0);
				}

				this.am(var6, var2, 972385800);
				return var6;
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("yf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int yf() {
		if (this.fo_fld == -1 || this.ex_fld == null) {
			return -1;
		} else if (this.fo_fld >= 0) {
			return this.ex_fld[this.fo_fld] != null ? this.fo_fld : -1;
		} else {
			return kh.ad_fld.equalsIgnoreCase(this.ex_fld[4]) ? 4 : -1;
		}
	}

	@ObfuscatedName("setInventoryModel")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setInventoryModel")
	@Override
	public void setInventoryModel(int var1) {
		this.dk_fld = var1 * -1838608271;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Log;III)I"
	)
	public static int mz(og var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return my.ag(var0.ey_fld, var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;B)V"
	)
	void ay(og var1, og var2, byte var3) {
		this.dk_fld = var1.dk_fld;
		this.dy_fld = var1.dy_fld;
		this.di_fld = var1.di_fld;
		this.dn_fld = var1.dn_fld;
		this.df_fld = var1.df_fld;
		this.de_fld = var1.de_fld;
		this.dp_fld = var1.dp_fld;
		this.du_fld = var1.du_fld;
		this.db_fld = var1.db_fld;
		this.dg_fld = var1.dg_fld;
		this.dw_fld = var1.dw_fld;
		this.dx_fld = var2.dx_fld;
		this.ds_fld = kh.aq_fld;
		this.et_fld = var2.et_fld;
		this.es_fld = var2.es_fld;
		this.em_fld = var2.em_fld;
		this.dj_fld = 504177375;
		this.wx(var1, var2);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	public static og bd(int var0) throws EOFException {
		try {
			og var1 = (og)do_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ce.dt_fld.bb(10, var0, 584982574);
				var1 = new og();
				var1.da_fld = var0 * 1211327915;
				if (var2 != null) {
					var1.ah(new xi(var2), -1609350710);
				}

				hh(var1, 1771536038);
				if (-1 != var1.eg_fld) {
					var1.ay(kb.ag(-942601093 * var1.eg_fld, -1752383175), kb.ag(var1.en_fld * 81997147, -1752383175), (byte)-39);
				}

				if (-1 != var1.ej_fld) {
					var1.as(kb.ag(-110465505 * var1.ej_fld, -1752383175), kb.ag(var1.eu_fld, -1752383175), -776631127);
				}

				if (-1 != var1.fa_fld) {
					mw(var1, kb.ag(var1.fa_fld, -1752383175), kb.ag(-1434773745 * var1.fy_fld, -1752383175), (byte)34);
				}

				if (!ux.dq_fld && var1.et_fld) {
					if (-1 == var1.eg_fld && var1.ej_fld == -1 && var1.fa_fld == -1) {
						var1.dx_fld = var1.dx_fld + kh.aa_fld;
					}

					var1.ds_fld = kh.ai_fld;
					var1.eh_fld = false;
					var1.em_fld = false;
					var1.ew_fld.at(132907112);
					var1.ew_fld.ad(2, kh.am_fld, 1858534505);

					for (int var3 = 0; var3 < var1.ex_fld.length; var3++) {
						if (4 != var3) {
							if (null != var1.eo_fld) {
								var1.eo_fld[var3] = null;
							}

							var1.ex_fld[var3] = null;
						}
					}

					var1.fo_fld = -2133468910;
					var1.ea_fld = 0;
					var1.ec_fld = 2084991229;
					if (null != var1.ey_fld) {
						boolean var9 = false;

						for (vw var4 = eb.kn(var1.ey_fld); null != var4; var4 = var1.ey_fld.ae()) {
							px var5 = kb.ag_px((int)var4.hc_long, 653124584);
							if (var5.ar_fld) {
								var4.gy();
							} else {
								var9 = true;
							}
						}

						if (!var9) {
							var1.ey_fld = null;
						}
					}
				}

				do_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean co() {
		return this.db_fld != null;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cu() {
		return this.db_fld != null;
	}

	@ObfuscatedName("getLinkedNoteId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getLinkedNoteId")
	@Override
	public int getLinkedNoteId() {
		return this.en_fld;
	}

	@ObfuscatedName("isMembers")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isMembers")
	@Override
	public boolean isMembers() {
		return this.et_fld;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cj() {
		return null != this.dw_fld;
	}

	@ObfuscatedName("setXan2d")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setXan2d")
	@Override
	public void setXan2d(int var1) {
		this.di_fld = var1 * 90750953;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	public static og bm(int var0) throws EOFException {
		try {
			og var1 = (og)do_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ce.dt_fld.bb(10, var0, 584982574);
				var1 = new og();
				var1.da_fld = var0;
				if (var2 != null) {
					var1.ah(new xi(var2), -73999337);
				}

				hh(var1, 1771536038);
				if (-1 != var1.eg_fld) {
					var1.ay(kb.ag(var1.eg_fld, -1752383175), kb.ag(var1.en_fld, -1752383175), (byte)-125);
				}

				if (-1 != var1.ej_fld) {
					var1.as(kb.ag(var1.ej_fld, -1752383175), kb.ag(var1.eu_fld, -1752383175), -776631127);
				}

				if (-1 != var1.fa_fld) {
					mw(var1, kb.ag(var1.fa_fld, -1752383175), kb.ag(var1.fy_fld, -1752383175), (byte)25);
				}

				if (!ux.dq_fld && var1.et_fld) {
					if (-1 == var1.eg_fld && var1.ej_fld == -1 && var1.fa_fld == -1) {
						var1.dx_fld = var1.dx_fld + kh.aa_fld;
					}

					var1.ds_fld = kh.ai_fld;
					var1.eh_fld = false;
					var1.em_fld = false;
					var1.ew_fld.at(-533676581);
					var1.ew_fld.ad(2, kh.am_fld, 1338786762);

					for (int var3 = 0; var3 < var1.ex_fld.length; var3++) {
						if (4 != var3) {
							if (null != var1.eo_fld) {
								var1.eo_fld[var3] = null;
							}

							var1.ex_fld[var3] = null;
						}
					}

					var1.fo_fld = -2133468910;
					var1.ea_fld = 0;
					var1.ec_fld = -1910353587;
					if (null != var1.ey_fld) {
						boolean var9 = false;

						for (vw var4 = eb.kn(var1.ey_fld); null != var4; var4 = var1.ey_fld.ae()) {
							px var5 = kb.ag_px((int)var4.hc_long, -230523983);
							if (var5.ar_fld) {
								var4.gy();
							} else {
								var9 = true;
							}
						}

						if (!var9) {
							var1.ey_fld = null;
						}
					}
				}

				do_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static void ag() {
		cn var1 = ci_fld.getPreferences();
		xi var2 = var1.ue();
		ci_fld.iz_fld.execute(client::xh);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int az(int var0) {
		return (var0 & yy.az_fld) - 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	public static int al(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	@Override
	public void jh(xv var1) {
		this.ey_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Loq;"
	)
	public oq ak(int var1) {
		return this.ew_fld;
	}

	@ObfuscatedName("setShiftClickActionIndex")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setShiftClickActionIndex")
	@Override
	public void setShiftClickActionIndex(int var1) {
		this.yw_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae(int var1) {
		if (this.dp_fld == 1) {
			this.fy_fld = 0;
		}

		this.ww();
	}

	@ObfuscatedName("getColorToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Export("getColorToReplaceWith")
	@Override
	public short[] getColorToReplaceWith() {
		return this.db_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;B)V"
	)
	void ar(og var1, og var2, byte var3) {
		this.fl_fld = 1 * var1.fw_fld;
		this.ek_fld = var1.dp_fld;
		this.yw_fld = var1.fy_fld;
		this.dy_fld = var1.dn_fld;
		this.eg_fld = 1 * var1.ee_fld;
		this.ee_fld = 1 * var1.ee_fld;
		this.es_fld = var1.dn_fld;
		this.dw_fld = var1.dw_fld;
		this.db_fld = var1.db_fld;
		this.dw_fld = var1.dw_fld;
		this.dw_fld = var1.dg_fld;
		this.eb_fld = var1.ea_fld;
		this.fa_fld = var1.es_fld;
		this.dx_fld = var2.vb_fld;
		this.dx_fld = var2.vb_fld;
		this.ev_fld = 0;
		this.et_fld = false;
		this.em_fld = false;
		this.em_fld = false;
		this.eh_fld = false;
		this.xq(var1, var2);
	}

	@ObfuscatedName("getContrast")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getContrast")
	@Override
	public int getContrast() {
		return this.ek_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Leg;"
	)
	public final eg af(int var1, int var2) {
		try {
			if (this.er_fld != null && var1 > 1) {
				int var3 = -1;

				for (int var4 = 0; var4 < 10; var4++) {
					if (var1 >= this.er_fld[var4] && this.ez_fld[var4] != 0) {
						var3 = this.ez_fld[var4];
					}
				}

				if (-1 != var3) {
					return fn(kb.ag(var3, -1752383175), 1);
				}
			}

			eg var6 = eg.bt(bl.dm_fld, -500125551 * this.fm_fld, 0);
			if (var6 == null) {
				return null;
			} else {
				if (128 != this.da_fld || this.fe_fld != 128 || this.fv_fld != 128) {
					var6.ds(this.ef_fld, this.da_fld * -1550174935, -1802909481 * this.fx_fld);
				}

				this.am(var6, null, 967707981);
				return var6;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILoo;B)Leg;"
	)
	public final eg aa(int var1, oo var2, byte var3) {
		try {
			int var4 = -230668519 * this.fh_fld;
			int var5 = this.fm_fld * 69298017;
			int var6 = this.fb_fld * 1337197497;
			if (1 == var1) {
				var4 = -797779947 * this.fe_fld;
				var5 = this.fk_fld * -1758979253;
				var6 = this.eu_fld * 588084861;
			}

			if (null != var2 && var2.av(var1, -1503157837)) {
				var4 = var2.ah(var1, -1345698668);
			}

			if (-1 == var4) {
				return null;
			} else {
				eg var7 = eg.bv(bl.dm_fld, var4, 0);
				if (var5 != -1) {
					eg var8 = eg.bv(bl.dm_fld, var5, 0);
					if (var6 != -1) {
						eg var9 = eg.bt(bl.dm_fld, var6, 0);
						eg[] var10 = new eg[]{var7, var8, var9};
						var7 = new eg(var10, 3);
					} else {
						eg[] var12 = new eg[]{var7, var8};
						var7 = new eg(var12, 2);
					}
				}

				if (0 == var1 && 0 != this.ef_fld) {
					var7.dx(0, -53605389 * this.fm_fld, 0);
				}

				if (var1 == 1 && 0 != this.fh_fld) {
					var7.br(0, this.fx_fld * 342818047, 0);
				}

				this.am(var7, var2, -144948734);
				return var7;
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Log;ILoo;I)Z"
	)
	public static boolean lt(og var0, int var1, oo var2) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				int var4 = var0.fp_fld;
				int var5 = var0.fx_fld;
				int var6 = var0.fc_fld * 1337197497;
				if (1 == var1) {
					var4 = var0.fj_fld;
					var5 = var0.fb_fld;
					var6 = var0.fh_fld;
				}

				if (var2 != null && var2.av(var1, 757095153)) {
					var4 = var2.ah(var1, -1345698668);
				}

				if (-1 == var4) {
					return true;
				} else {
					boolean var7 = true;
					if (!bl.dm_fld.cc(var4, 0, 1693823503)) {
						var7 = false;
					}

					if (var5 != -1 && !bl.dm_fld.cc(var5, 0, 1502347238)) {
						var7 = false;
					}

					if (var6 != -1 && !bl.dm_fld.cc(var6, 0, 1218913607)) {
						var7 = false;
					}

					return var7;
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("getHaPrice")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHaPrice")
	@Override
	public int getHaPrice() {
		int var1 = this.getPrice();
		return (int)(var1 * 0.6F);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int ad(int var1, int var2, int var3) {
		return my.ag(this.ey_fld, var1, var2);
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		return this.dx_fld;
	}

	@ObfuscatedName("setName")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Export("setName")
	@Override
	public void setName(String var1) {
		this.dx_fld = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILoo;I)Z"
	)
	public final boolean an(int var1, oo var2, int var3) {
		try {
			int var4 = -230668519 * this.fv_fld;
			int var5 = this.fo_fld * 69298017;
			int var6 = this.fo_fld * 1337197497;
			if (1 == var1) {
				var4 = -797779947 * this.ei_fld;
				var5 = this.ej_fld * -1758979253;
				var6 = this.fm_fld * 588084861;
			}

			if (var2 != null && var2.av(var1, 757095153)) {
				var4 = var2.ah(var1, -1345698668);
			}

			if (-1 == var4) {
				return true;
			} else {
				boolean var7 = true;
				if (!bl.dm_fld.cc(var4, 0, 1693823503)) {
					var7 = false;
				}

				if (var5 != -1 && !bl.dm_fld.cc(var5, 0, 1502347238)) {
					var7 = false;
				}

				if (var6 != -1 && !bl.dm_fld.cc(var6, 0, 1218913607)) {
					var7 = false;
				}

				return var7;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILoo;)Z"
	)
	public final boolean bg(int var1, oo var2) {
		try {
			int var3 = -230668519 * this.fe_fld;
			int var4 = this.ej_fld * -1833383098;
			int var5 = this.fw_fld * -519574538;
			if (1 == var1) {
				var3 = 670677883 * this.dk_fld;
				var4 = this.eq_fld * -1758979253;
				var5 = this.fx_fld * 588084861;
			}

			if (var2 != null && var2.ae(var1, -1275057540)) {
				var3 = var2.ah(var1, -1345698668);
			}

			if (-1 == var3) {
				return true;
			} else {
				boolean var6 = true;
				if (!bl.dm_fld.cc(var3, 0, -1760202119)) {
					var6 = false;
				}

				if (var4 != -1 && !bl.dm_fld.cc(var4, 0, -526884827)) {
					var6 = false;
				}

				if (var5 != -1 && !bl.dm_fld.cc(var5, 0, -1084017841)) {
					var6 = false;
				}

				return var6;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ci() {
		return this.getPrice() != 0;
	}
}
