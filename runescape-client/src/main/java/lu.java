import java.awt.Rectangle;
import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetUtil;

@ObfuscatedName("lu")
@Implements({"Widget"})
public class lu extends vw implements Widget {
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String ct_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String bl_fld;
	@ObfuscatedGetter(
		intValue = 323515003
	)
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cl_fld;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fd_fld;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fp_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int br_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean bj_fld;
	@ObfuscatedGetter(
		intValue = 1461045985
	)
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bf_fld;
	@ObfuscatedGetter(
		intValue = -2140649577
	)
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int by_fld;
	@ObfuscatedGetter(
		intValue = -1223437005
	)
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int pv_fld;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] eu_fld;
	@ObfuscatedGetter(
		intValue = 1404198381
	)
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bx_fld;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] gr_fld;
	@ObfuscatedGetter(
		intValue = -1748990469
	)
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bp_fld;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] gv_fld;
	@ObfuscatedGetter(
		intValue = -1223437005
	)
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int wj_fld;
	@ObfuscatedGetter(
		intValue = -111792431
	)
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int co_fld;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "S"
	)
	public short wk_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedGetter(
		intValue = 138006387
	)
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bu_fld;
	@ObfuscatedGetter(
		intValue = -570803331
	)
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bn_fld;
	@ObfuscatedGetter(
		intValue = 1715505881
	)
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bc_fld;
	@ObfuscatedGetter(
		intValue = -1413997313
	)
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bw_fld;
	@ObfuscatedGetter(
		intValue = 831395483
	)
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ba_fld;
	@ObfuscatedGetter(
		intValue = -1443261961
	)
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int nn_fld = -1;
	@ObfuscatedGetter(
		intValue = -450643537
	)
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bq_fld;
	@ObfuscatedGetter(
		intValue = 545998793
	)
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cx_fld;
	@ObfuscatedGetter(
		intValue = -324157087
	)
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cs_fld;
	@ObfuscatedGetter(
		intValue = -1857652109
	)
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int eb_fld;
	@ObfuscatedGetter(
		intValue = 124430729
	)
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cd_fld;
	@ObfuscatedGetter(
		intValue = -2132344331
	)
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cq_fld;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	public lp dy_fld;
	@ObfuscatedGetter(
		intValue = -1661012943
	)
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cy_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean cf_fld;
	@ObfuscatedGetter(
		intValue = -1223437005
	)
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bb_fld;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean dt_fld;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int kn_fld;
	@ObfuscatedGetter(
		intValue = 590540907
	)
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cp_fld;
	@ObfuscatedGetter(
		intValue = 9463393
	)
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ce_fld;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fe_fld;
	@ObfuscatedGetter(
		intValue = 694320263
	)
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cv_fld;
	@ObfuscatedGetter(
		intValue = 681955997
	)
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ca_fld;
	@ObfuscatedGetter(
		intValue = 239766897
	)
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cg_fld;
	@ObfuscatedGetter(
		intValue = 802525691
	)
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cw_fld;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fj_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean cz_fld;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lym;"
	)
	public ym ck_fld;
	@ObfuscatedGetter(
		intValue = 1577740823
	)
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cb_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;
	@ObfuscatedGetter(
		intValue = 1412403275
	)
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cu_fld;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ci_fld;
	@ObfuscatedGetter(
		intValue = -228305239
	)
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bo_fld;
	@ObfuscatedGetter(
		intValue = 2103578503
	)
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ch_fld;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fq_fld;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fr_fld;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean dc_fld;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] fm_fld;
	@ObfuscatedGetter(
		intValue = 1891222921
	)
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dv_fld;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean dz_fld;
	@ObfuscatedGetter(
		intValue = 879314393
	)
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cn_fld;
	@ObfuscatedGetter(
		intValue = -1233078613
	)
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dm_fld;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean em_fld;
	@ObfuscatedGetter(
		intValue = 1986711867
	)
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int do_fld;
	@ObfuscatedGetter(
		intValue = 1301730821
	)
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dd_fld;
	@ObfuscatedGetter(
		intValue = -1754977669
	)
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dl_fld;
	@ObfuscatedGetter(
		intValue = 137820669
	)
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dr_fld;
	@ObfuscatedGetter(
		intValue = -253349227
	)
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int da_fld;
	@ObfuscatedGetter(
		intValue = -1003471525
	)
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dk_fld;
	@ObfuscatedGetter(
		intValue = -519645809
	)
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dx_fld;
	@ObfuscatedGetter(
		intValue = -590379409
	)
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ds_fld;
	@ObfuscatedGetter(
		intValue = 1680595947
	)
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int hn_fld;
	@ObfuscatedGetter(
		intValue = -70630065
	)
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int db_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedGetter(
		intValue = -405011595
	)
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean di_fld;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean dn_fld;
	@ObfuscatedGetter(
		intValue = -43374303
	)
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int df_fld;
	@ObfuscatedGetter(
		intValue = 159419309
	)
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int de_fld;
	@ObfuscatedGetter(
		intValue = -1198739519
	)
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int es_fld;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String dj_fld;
	@ObfuscatedGetter(
		intValue = -233337277
	)
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dq_fld;
	@ObfuscatedGetter(
		intValue = 2082962145
	)
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ep_fld;
	@ObfuscatedGetter(
		intValue = 854556803
	)
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int nf_fld;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ed_fld;
	// $VF: synthetic field
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean im_fld = !lu.class.desiredAssertionStatus();
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] et_fld;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ew_fld;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ex_fld;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	String[] eo_fld;
	@ObfuscatedGetter(
		intValue = 1627369
	)
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ec_fld;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ez_fld;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	public byte[][] er_fld;
	@ObfuscatedGetter(
		intValue = 1723920971
	)
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cm_fld;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] eg_fld;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ef_fld;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String eq_fld;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] gs_fld;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] ei_fld;
	@ObfuscatedGetter(
		intValue = -2137298625
	)
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ek_fld;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public lu ea_fld;
	@ObfuscatedGetter(
		intValue = -763835689
	)
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ev_fld;
	@ObfuscatedGetter(
		intValue = 117891801
	)
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int hj_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int an_fld;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String el_fld;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean eh_fld;
	@ObfuscatedGetter(
		intValue = 1238591925
	)
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cc_fld;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] ej_fld;
	@ObfuscatedGetter(
		intValue = 1151170383
	)
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bt_fld;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fa_fld;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fo_fld;
	@ObfuscatedGetter(
		intValue = 582360795
	)
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bv_fld;
	@ObfuscatedGetter(
		intValue = 214412161
	)
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bg_fld;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fv_fld;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] gf_fld;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fb_fld;
	@ObfuscatedGetter(
		intValue = -150852659
	)
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int gy_fld;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fc_fld;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean hh_fld;
	@ObfuscatedGetter(
		intValue = 101145729
	)
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int gb_fld;
	@ObfuscatedGetter(
		intValue = -1443261961
	)
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dh_fld;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] fw_fld;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fl_fld;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] fg_fld;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fn_fld;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] ft_fld;
	@ObfuscatedGetter(
		intValue = -377192225
	)
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cj_fld;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fu_fld;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fs_fld;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fx_fld;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fh_fld;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fi_fld;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fz_fld;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] ff_fld;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] gg_fld;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] gc_fld;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] go_fld;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] gn_fld;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] gh_fld;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String dp_fld;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] gj_fld;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] gt_fld;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String gi_fld;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	public int[][] gu_fld;
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] gp_fld;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap he_fld;
	@ObfuscatedGetter(
		intValue = 2139590355
	)
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int gk_fld;
	@ObfuscatedGetter(
		intValue = 1050344583
	)
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bi_fld;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String gq_fld;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fk_fld;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] gm_fld;
	@ObfuscatedGetter(
		intValue = 1243874365
	)
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ga_fld;
	@ObfuscatedGetter(
		intValue = -1632782049
	)
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int gd_fld;
	@ObfuscatedGetter(
		intValue = -1389783319
	)
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int gl_fld;
	@ObfuscatedGetter(
		intValue = 668367529
	)
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int gz_fld;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "[Llu;"
	)
	public lu[] ge_fld;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean gw_fld;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean gx_fld;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	public byte[][] en_fld;
	@ObfuscatedGetter(
		intValue = 1471705067
	)
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int du_fld;
	@ObfuscatedGetter(
		intValue = 1477055471
	)
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int hr_fld;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "[[Ljava/lang/String;"
	)
	public String[][] ee_fld;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] hp_fld;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean hb_fld;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean hf_fld;
	@ObfuscatedGetter(
		intValue = 235919357
	)
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cr_fld;
	@ObfuscatedGetter(
		intValue = -2054244789
	)
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dg_fld;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap hd_fld;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "S"
	)
	public short sw_fld;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	ld hk_fld;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	ma hi_fld;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fy_fld;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] hs_fld;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	Object[] hq_fld;
	@ObfuscatedGetter(
		intValue = 1189206755
	)
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int hl_fld;
	@ObfuscatedGetter(
		intValue = -1721404151
	)
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ey_fld;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde;I)V"
	)
	public void aj(String var1, String var2, String var3, String var4, String var5, de var6, int var7) {
		try {
			this.hi_fld = new ma();
			if (!this.hi_fld.ag(var1, var3, var6)) {
				this.hi_fld = null;
			} else {
				if (null == this.he_fld || null == this.hd_fld) {
					this.bd(-64371462);
				}

				this.hi_fld.az(var2, var4, var5);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	public lu(lu var1) throws EOFException {
		this.wj_fld = -1;
		this.pv_fld = -1;
		this.sw_fld = -1;
		this.wk_fld = -1;
		this.bj_fld = false;
		this.bf_fld = -190642465;
		this.by_fld = -2083432487;
		this.bo_fld = 0;
		this.bp_fld = 0;
		this.bt_fld = 0;
		this.bv_fld = 0;
		this.bi_fld = 0;
		this.bu_fld = 0;
		this.bn_fld = 0;
		this.bc_fld = 0;
		this.bw_fld = 0;
		this.ba_fld = 0;
		this.bq_fld = 0;
		this.vl(-1);
		this.bg_fld = 0;
		this.zd(-1);
		this.bb_fld = 0;
		this.cd_fld = 0;
		this.cc_fld = 1315110045;
		this.cq_fld = 1622336093;
		this.cv_fld = -1995802935;
		this.cy_fld = -1267721425;
		this.cf_fld = false;
		this.cx_fld = -218530425;
		this.cs_fld = 0;
		this.cp_fld = 0;
		this.ce_fld = 0;
		this.cn_fld = 0;
		this.cr_fld = 0;
		this.ca_fld = 0;
		this.cg_fld = 0;
		this.cw_fld = 0;
		this.cm_fld = 0;
		this.cz_fld = false;
		this.ck_fld = ym.ak_fld;
		this.cb_fld = 0;
		this.co_fld = 0;
		this.cu_fld = -2082490013;
		this.ci_fld = false;
		this.cj_fld = 1277215969;
		this.ch_fld = -759334455;
		this.cl_fld = 0;
		this.dc_fld = false;
		this.dh_fld = 0;
		this.dv_fld = 0;
		this.dm_fld = -1800825853;
		this.dq_fld = -340962923;
		this.do_fld = -1082400781;
		this.dd_fld = 1469020467;
		this.dl_fld = -968762547;
		this.dr_fld = 37770411;
		this.da_fld = 0;
		this.dk_fld = 0;
		this.dx_fld = 0;
		this.ds_fld = 0;
		this.du_fld = 0;
		this.db_fld = -1968609188;
		this.dg_fld = 0;
		this.dw_fld = 0;
		this.di_fld = false;
		this.dn_fld = false;
		this.df_fld = 216610242;
		this.de_fld = 57339867;
		this.dp_fld = "";
		this.dj_fld = "";
		this.es_fld = 0;
		this.ep_fld = 0;
		this.eb_fld = 0;
		this.ed_fld = false;
		this.ec_fld = 0;
		this.ez_fld = false;
		this.eq_fld = "";
		this.ek_fld = 413932284;
		this.ea_fld = null;
		this.ev_fld = 0;
		this.ey_fld = 0;
		this.em_fld = false;
		this.el_fld = "";
		this.eh_fld = false;
		this.gk_fld = 26740389;
		this.gi_fld = "";
		this.gq_fld = kh.ab_fld;
		this.ga_fld = -481932053;
		this.gd_fld = 0;
		this.gy_fld = 0;
		this.gz_fld = 0;
		this.gw_fld = false;
		this.gx_fld = false;
		this.gb_fld = -1564795777;
		this.gl_fld = 0;
		this.hr_fld = 0;
		this.hj_fld = 0;
		this.hb_fld = false;
		this.hf_fld = false;
		this.hh_fld = false;
		this.hn_fld = 510430013;
		this.bj_fld = var1.bj_fld;
		this.bf_fld = var1.bf_fld * 1461045985;
		this.by_fld = 1 * var1.by_fld;
		this.bl_fld = var1.bl_fld;
		this.bx_fld = 1 * var1.bx_fld;
		this.bo_fld = var1.bo_fld * -228305239;
		this.bp_fld = var1.bp_fld * -1748990469;
		this.bt_fld = 1 * var1.bt_fld;
		this.bv_fld = 1 * var1.bv_fld;
		this.bi_fld = var1.bi_fld * 1050344583;
		this.bu_fld = var1.bu_fld * 138006387;
		this.bn_fld = var1.bn_fld * -570803331;
		this.bc_fld = var1.bc_fld * 1715505881;
		this.bw_fld = 1 * var1.bw_fld;
		this.ba_fld = 1 * var1.ba_fld;
		this.bq_fld = 1 * var1.bq_fld;
		this.vl(-1);
		this.bg_fld = var1.bg_fld * 214412161;
		this.zd(-1);
		this.bb_fld = 1 * var1.bb_fld;
		this.cd_fld = 1 * var1.cd_fld;
		this.cc_fld = 1 * var1.cc_fld;
		this.cq_fld = var1.cq_fld * -2132344331;
		this.cv_fld = 1 * var1.cv_fld;
		this.cy_fld = var1.cy_fld * -1661012943;
		this.cx_fld = 1 * var1.cx_fld;
		this.cs_fld = var1.cs_fld * -324157087;
		this.cf_fld = var1.cf_fld;
		this.cp_fld = 1 * var1.cp_fld;
		this.ce_fld = 1 * var1.ce_fld;
		this.cn_fld = 1 * var1.cn_fld;
		this.cr_fld = 1 * var1.cr_fld;
		this.ca_fld = var1.ca_fld * 681955997;
		this.cg_fld = 1 * var1.cg_fld;
		this.cw_fld = 1 * var1.cw_fld;
		this.cm_fld = 1 * var1.cm_fld;
		this.cz_fld = var1.cz_fld;
		this.ck_fld = var1.ck_fld;
		this.cb_fld = 1 * var1.cb_fld;
		this.co_fld = var1.co_fld * -111792431;
		this.cu_fld = var1.cu_fld * 1412403275;
		this.ci_fld = var1.ci_fld;
		this.cj_fld = var1.cj_fld * -377192225;
		this.ch_fld = var1.ch_fld * 2103578503;
		this.ct_fld = var1.ct_fld;
		this.cl_fld = var1.cl_fld * 323515003;
		this.dc_fld = var1.dc_fld;
		this.dh_fld = var1.dh_fld * -1443261961;
		this.dv_fld = 1 * var1.dv_fld;
		this.dz_fld = var1.dz_fld;
		this.dt_fld = var1.dt_fld;
		this.dm_fld = var1.dm_fld * -1233078613;
		this.dq_fld = var1.dq_fld * -233337277;
		this.do_fld = var1.do_fld * 1986711867;
		this.dd_fld = 1 * var1.dd_fld;
		this.dl_fld = var1.dl_fld * -1754977669;
		this.dr_fld = var1.dr_fld * 137820669;
		this.da_fld = var1.da_fld * -253349227;
		this.dk_fld = var1.dk_fld * -1003471525;
		this.dx_fld = 1 * var1.dx_fld;
		this.ds_fld = var1.ds_fld * -590379409;
		this.du_fld = var1.du_fld * 1471705067;
		this.db_fld = 1 * var1.db_fld;
		this.dg_fld = 1 * var1.dg_fld;
		this.dw_fld = var1.dw_fld * -405011595;
		if (null != var1.dy_fld) {
			this.dy_fld = new lp(var1.dy_fld);
		}

		this.di_fld = var1.di_fld;
		this.dn_fld = var1.dn_fld;
		this.df_fld = var1.df_fld * -43374303;
		this.de_fld = var1.de_fld * 159419309;
		this.dp_fld = var1.dp_fld;
		this.dj_fld = var1.dj_fld;
		this.es_fld = 1 * var1.es_fld;
		this.ep_fld = 1 * var1.ep_fld;
		this.eb_fld = 1 * var1.eb_fld;
		this.ed_fld = var1.ed_fld;
		this.et_fld = this.az(var1.et_fld, (short)7947);
		this.ew_fld = this.az(var1.ew_fld, (short)6293);
		this.ex_fld = this.az(var1.ex_fld, (short)31682);
		this.eo_fld = (String[])(String[])this.ag(var1.eo_fld, 655679703);
		if (null != var1.hi_fld) {
			this.hi_fld = new ma(var1.hi_fld);
		}

		this.hn_fld = 1 * var1.hn_fld;
		this.he_fld = var1.he_fld;
		if (null != var1.hd_fld) {
			this.hd_fld = new HashMap();
			this.hd_fld.putAll(var1.hd_fld);
		}

		this.hk_fld = null;
		this.ec_fld = var1.ec_fld * 1627369;
		this.ez_fld = var1.ez_fld;
		if (var1.er_fld != null) {
			this.er_fld = new byte[var1.er_fld.length][];

			for (int var2 = 0; var2 < var1.er_fld.length; var2++) {
				this.er_fld[var2] = new byte[var1.er_fld[var2].length];
				System.arraycopy(var1.er_fld[var2], 0, this.er_fld[var2], 0, var1.er_fld[var2].length);
			}
		}

		if (null != var1.en_fld) {
			this.en_fld = new byte[var1.en_fld.length][];

			for (int var4 = 0; var4 < var1.en_fld.length; var4++) {
				this.en_fld[var4] = new byte[var1.en_fld[var4].length];
				System.arraycopy(var1.en_fld[var4], 0, this.en_fld[var4], 0, var1.en_fld[var4].length);
			}
		}

		this.eg_fld = this.az(var1.eg_fld, (short)18051);
		this.ef_fld = this.az(var1.ef_fld, (short)3464);
		this.eq_fld = var1.eq_fld;
		this.ei_fld = (String[])(String[])this.ag(var1.ei_fld, 1244799445);
		if (null != var1.ee_fld) {
			this.ee_fld = new String[var1.ee_fld.length][];

			for (int var5 = 0; var5 < var1.ee_fld.length; var5++) {
				this.ee_fld[var5] = new String[var1.ee_fld[var5].length];
				System.arraycopy(var1.ee_fld[var5], 0, this.ee_fld[var5], 0, var1.ee_fld[var5].length);
			}
		}

		this.ek_fld = var1.ek_fld * -2137298625;
		this.ea_fld = var1.ea_fld;
		this.ev_fld = var1.ev_fld * -763835689;
		this.ey_fld = var1.ey_fld * -1721404151;
		this.em_fld = var1.em_fld;
		this.el_fld = var1.el_fld;
		this.eh_fld = var1.eh_fld;
		this.eu_fld = (Object[])var1.eu_fld;
		this.ej_fld = (Object[])var1.ej_fld;
		this.fy_fld = (Object[])var1.fy_fld;
		this.fa_fld = (Object[])var1.fa_fld;
		this.fo_fld = (Object[])var1.fo_fld;
		this.fp_fld = (Object[])var1.fp_fld;
		this.fx_fld = (Object[])var1.fx_fld;
		this.fv_fld = (Object[])var1.fv_fld;
		this.fj_fld = (Object[])var1.fj_fld;
		this.fb_fld = (Object[])var1.fb_fld;
		this.fk_fld = (Object[])var1.fk_fld;
		this.fc_fld = (Object[])var1.fc_fld;
		this.fh_fld = (Object[])var1.fh_fld;
		this.fm_fld = var1.fm_fld;
		this.fe_fld = (Object[])var1.fe_fld;
		this.fw_fld = var1.fw_fld;
		this.fl_fld = (Object[])var1.fl_fld;
		this.fg_fld = var1.fg_fld;
		this.fn_fld = (Object[])var1.fn_fld;
		this.ft_fld = (Object[])var1.ft_fld;
		this.fd_fld = (Object[])var1.fd_fld;
		this.fq_fld = (Object[])var1.fq_fld;
		this.fs_fld = (Object[])var1.fs_fld;
		this.fu_fld = (Object[])var1.fu_fld;
		this.fr_fld = (Object[])var1.fr_fld;
		this.fi_fld = (Object[])var1.fi_fld;
		this.fz_fld = (Object[])var1.fz_fld;
		this.ff_fld = (Object[])var1.ff_fld;
		this.gg_fld = (Object[])var1.gg_fld;
		this.gc_fld = (Object[])var1.gc_fld;
		this.go_fld = (Object[])var1.go_fld;
		this.gn_fld = (Object[])var1.gn_fld;
		this.gh_fld = (Object[])var1.gh_fld;
		this.gr_fld = (Object[])var1.gr_fld;
		this.gj_fld = (Object[])var1.gj_fld;
		this.gt_fld = (Object[])var1.gt_fld;
		this.gs_fld = (Object[])var1.gs_fld;
		this.gu_fld = var1.gu_fld;
		this.gp_fld = this.az(var1.gp_fld, (short)10641);
		this.gv_fld = this.az(var1.gv_fld, (short)6917);
		this.gk_fld = var1.gk_fld * 2139590355;
		this.gi_fld = var1.gi_fld;
		this.gq_fld = var1.gq_fld;
		this.gf_fld = this.az(var1.gf_fld, (short)18200);
		this.gm_fld = this.az(var1.gm_fld, (short)29131);
		this.ga_fld = 1 * var1.ga_fld;
		this.gd_fld = 1 * var1.gd_fld;
		this.gy_fld = var1.gy_fld * -150852659;
		this.gz_fld = 1 * var1.gz_fld;
		if (null != var1.ge_fld) {
			this.ge_fld = new lu[var1.ge_fld.length];

			for (int var6 = 0; var6 < var1.ge_fld.length; var6++) {
				this.ge_fld[var6] = new lu(var1.ge_fld[var6]);
			}
		}

		this.gw_fld = var1.gw_fld;
		this.gx_fld = var1.gx_fld;
		this.gb_fld = 1 * var1.gb_fld;
		this.gl_fld = 1 * var1.gl_fld;
		this.hr_fld = var1.hr_fld * 1477055471;
		this.hj_fld = 1 * var1.hj_fld;
		this.hp_fld = this.az(var1.hp_fld, (short)9406);
		this.hb_fld = var1.hb_fld;
		this.hf_fld = var1.hf_fld;
		this.hh_fld = var1.hh_fld;
		if (var1.hl_fld > 0) {
			this.hs_fld = this.az(var1.hs_fld, (short)9020);
			this.hq_fld = (Object[])this.ag((Object[])var1.hq_fld, 596001012);
			this.hl_fld = var1.hl_fld * 1189206755;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)[Ljava/lang/Object;"
	)
	Object[] ag(Object[] var1, int var2) {
		return (Object[])(null != var1 ? Arrays.copyOf((Object[])var1, var1.length) : null);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([IS)[I"
	)
	int[] az(int[] var1, short var2) {
		return null != var1 ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ek() {
		return this.hn_fld == 2;
	}

	@ObfuscatedName("setRelativeY")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setRelativeY(int var1) {
		this.bg_fld = var1;
	}

	@ObfuscatedName("yv")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOriginalY(int var1) {
		this.bc_fld = var1;
		return this;
	}

	@ObfuscatedName("setChildren")
	@ObfuscatedSignature(
		descriptor = "([Lnet/runelite/api/widgets/Widget;)V"
	)
	@Override
	public void setChildren(Widget[] var1) {
		if (this.getType() != 0) {
			throw new UnsupportedOperationException("children can only be set on type layer widgets");
		} else if (this.by_fld != -1) {
			throw new UnsupportedOperationException("only static widgets may have children");
		} else {
			this.ge_fld = (lu[])var1;
		}
	}

	@ObfuscatedName("zd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void zd(int var1) {
		if (this.wk_fld > -1) {
			this.setRelativeY(this.wk_fld);
		}
	}

	@ObfuscatedName("getOriginalY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOriginalY() {
		return this.bc_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ae(xi var1, int var2) {
		var1.cg();
		this.bj_fld = true;
		this.bx_fld = var1.cg();
		this.bp_fld = xi.tx(var1, 1258617606);
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz();
		this.bw_fld = xi.tx(var1, 562783079);
		if (9 == this.bx_fld) {
			if (var2 <= -1412529775) {
				return;
			}

			this.ba_fld = var1.cz();
		} else {
			this.ba_fld = xi.tx(var1, 1634335006);
		}

		this.bi_fld = xi.rp(var1, 924842300);
		this.bu_fld = xi.rp(var1, -216454189);
		this.bt_fld = xi.rp(var1, 467473714);
		this.bv_fld = xi.rp(var1, 311843818);
		this.cv_fld = xi.tx(var1, 1781699110);
		if (65535 == this.cv_fld) {
			this.cv_fld = -1995802935;
		} else {
			this.cv_fld = 1995802935 * ((this.bf_fld & -65536) + this.cv_fld);
		}

		this.cf_fld = var1.cg() == 1;
		if (0 == this.bx_fld) {
			this.cn_fld = xi.tx(var1, 1772749158);
			this.cr_fld = xi.tx(var1, 1596784492);
			this.hb_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 5) {
			this.cj_fld = var1.co();
			this.cl_fld = xi.tx(var1, 697276098);
			this.dc_fld = var1.cg() == 1;
			this.cb_fld = var1.cg();
			this.dh_fld = var1.cg();
			this.dv_fld = var1.co();
			this.dz_fld = var1.cg() == 1;
			this.dt_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 6) {
			this.dm_fld = -1800825853;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld);
			this.da_fld = var1.cz();
			this.dk_fld = var1.cz();
			this.dx_fld = xi.tx(var1, 397502377);
			this.ds_fld = xi.tx(var1, 1264371183);
			this.du_fld = xi.tx(var1, 1451012031);
			this.db_fld = xi.tx(var1, 877354979);
			this.dl_fld = xi.tx(var1, 1710312316);
			if (65535 == this.dl_fld) {
				this.dl_fld = -968762547;
			}

			this.di_fld = var1.cg() == 1;
			xi.tx(var1, 449424927);
			if (0 != this.bi_fld) {
				this.dg_fld = xi.tx(var1, 1677267603);
			}

			if (this.bu_fld != 0) {
				xi.tx(var1, 1510892922);
			}
		}

		if (4 == this.bx_fld) {
			this.de_fld = xi.tx(var1, 1251839341);
			if (65535 == this.de_fld) {
				this.de_fld = 57339867;
			}

			this.dp_fld = xi.kc(var1, 1695725812);
			this.es_fld = var1.cg();
			this.ep_fld = var1.cg();
			this.eb_fld = var1.cg();
			this.ed_fld = var1.cg() == 1;
			this.ca_fld = var1.co();
		}

		if (this.bx_fld == 3) {
			this.ca_fld = var1.co();
			boolean var10001;
			if (var1.cg() == 1) {
				if (var2 <= -1412529775) {
					return;
				}

				var10001 = true;
			} else {
				var10001 = false;
			}

			this.cz_fld = var10001;
			this.cb_fld = var1.cg();
		}

		if (this.bx_fld == 9) {
			this.cu_fld = var1.cg();
			this.ca_fld = var1.co();
			boolean var5;
			if (var1.cg() == 1) {
				if (var2 <= -1412529775) {
					return;
				}

				var5 = true;
			} else {
				var5 = false;
			}

			this.ci_fld = var5;
		}

		this.ec_fld = var1.ck();
		this.eq_fld = xi.kc(var1, -896948065);
		int var3 = var1.cg();
		if (var3 > 0) {
			this.ei_fld = new String[var3];

			for (int var4 = 0; var4 < var3; var4++) {
				this.ei_fld[var4] = xi.kc(var1, 1770363920);
			}
		}

		this.ev_fld = var1.cg();
		this.ey_fld = var1.cg();
		boolean var6;
		if (var1.cg() == 1) {
			if (var2 <= -1412529775) {
				return;
			}

			var6 = true;
		} else {
			var6 = false;
		}

		this.em_fld = var6;
		this.el_fld = xi.kc(var1, -1481826524);
		this.eu_fld = (Object[])this.aw(var1, 1006055606);
		this.fp_fld = (Object[])this.aw(var1, 1006055606);
		this.fv_fld = (Object[])this.aw(var1, 1006055606);
		this.fc_fld = (Object[])this.aw(var1, 1006055606);
		this.fk_fld = (Object[])this.aw(var1, 1006055606);
		this.fh_fld = (Object[])this.aw(var1, 1006055606);
		this.fe_fld = (Object[])this.aw(var1, 1006055606);
		this.fl_fld = (Object[])this.aw(var1, 1006055606);
		this.fn_fld = (Object[])this.aw(var1, 1006055606);
		this.ft_fld = (Object[])this.aw(var1, 1006055606);
		this.fx_fld = (Object[])this.aw(var1, 1006055606);
		this.ej_fld = (Object[])this.aw(var1, 1006055606);
		this.fy_fld = (Object[])this.aw(var1, 1006055606);
		this.fa_fld = (Object[])this.aw(var1, 1006055606);
		this.fo_fld = (Object[])this.aw(var1, 1006055606);
		this.fj_fld = (Object[])this.aw(var1, 1006055606);
		this.fb_fld = (Object[])this.aw(var1, 1006055606);
		this.fq_fld = (Object[])this.aw(var1, 1006055606);
		this.fm_fld = this.ay(var1, 269896632);
		this.fw_fld = this.ay(var1, 1923649293);
		this.fg_fld = this.ay(var1, 110272351);
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "(IIII)Llu;"
	)
	public lu setPos(int var1, int var2, int var3, int var4) {
		return this.setOriginalX(var1).setOriginalY(var2).setXPositionMode(var3).setYPositionMode(var4);
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde;)V"
	)
	public static void qo(lu var0, String var1, String var2, String var3, String var4, String var5, de var6) throws UnsupportedEncodingException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.hi_fld = new ma();
			if (!var0.hi_fld.ag(var1, var3, var6)) {
				var0.hi_fld = null;
			} else {
				if (null == var0.he_fld || null == var0.hd_fld) {
					var0.bd(-1292691591);
				}

				var0.hi_fld.az(var2, var4, var5);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V"
	)
	public void br(String var1, int var2, int var3) {
		if (11 != this.bx_fld) {
			if (var3 != -558054360) {
				;
			}
		} else {
			if (null == this.hd_fld) {
				this.bd(-1584056311);
			}

			this.hd_fld.put(var1, var2);
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;ZLde;I)Lyv;"
	)
	public static yv ef(lu var0, lw var1, boolean var2, de var3, int var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var0.getSpriteId() != -1) {
				SpritePixels var5 = (SpritePixels)(SpritePixels)client.ah_java_util_Map.get(var0.getId());
				if (var5 != null) {
					return (yv)var5;
				}
			}

			int var10 = -423043034;
			if (null != var0.ct_fld) {
				yv var11 = var0.ar(var1, var3, 521764807);
				if (var11 != null) {
					return var11;
				}
			}

			int var17;
			if (var2) {
				var17 = var0.ch_fld;
			} else {
				var17 = var0.cj_fld;
			}

			yv var10000;
			if (var17 == -1) {
				Object var6 = null;
				var10000 = (yv)var6;
			} else {
				long var12 = ((var0.dz_fld ? 1L : 0L) << 38) + ((long)var0.dh_fld << 36) + var17 + ((var0.dt_fld ? 1L : 0L) << 39) + ((long)var0.dv_fld << 40);
				yv var14 = (yv)var1.as_fld.ak(var12);
				if (var14 != null) {
					var10000 = var14;
				} else {
					var14 = wf.av(var1.av_fld, var17, 0);
					if (null == var14) {
						Object var16 = null;
						var10000 = (yv)var16;
					} else {
						pr(var0, var14, -1404429990);
						var1.as_fld.az(var14, var12);
						var10000 = var14;
					}
				}
			}

			return var10000;
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("contains")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Point;)Z"
	)
	@Override
	public boolean contains(Point var1) {
		Rectangle var2 = this.getBounds();
		return var2 != null && var2.contains(new java.awt.Point(var1.getX(), var1.getY()));
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIII)Z"
	)
	public static boolean gq(lu var0, int var1, int var2, int var3, int var4) {
		if (var0.bx_fld == 11 && var0.hi_fld != null && qz(var0, 303927453)) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(ma.ao(var0.hi_fld, (short)19354)[0] * (2068289896 * var0.bb_fld));
			int var6 = (int)(ma.ao(var0.hi_fld, (short)22991)[1] * var0.cd_fld);
			int var7 = var5 + (int)(ma.ao(var0.hi_fld, (short)26502)[2] * (1220209890 * var0.bb_fld));
			int var8 = var6 + (int)(ma.ao(var0.hi_fld, (short)29858)[3] * var0.cd_fld);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("getXTextAlignment")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getXTextAlignment() {
		return this.ep_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)[Ljava/lang/Object;"
	)
	Object[] aw(xi var1, int var2) {
		int var3 = var1.cg();
		if (var3 == 0) {
			return null;
		} else {
			Object[] var4 = (Object[])(new Object[var3]);

			for (int var5 = 0; var5 < var3; var5++) {
				int var6 = var1.cg();
				if (0 == var6) {
					var4[var5] = new Integer(var1.co());
				} else if (var6 == 1) {
					var4[var5] = xi.kc(var1, -216972048);
				}
			}

			this.eh_fld = true;
			return (Object[])var4;
		}
	}

	@ObfuscatedName("setOnMouseOverListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnMouseOverListener(Object[] var1) {
		this.fp_fld = (Object[])var1;
	}

	@ObfuscatedName("getYPositionMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getYPositionMode() {
		return this.bv_fld;
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setFontId(int var1) {
		this.de_fld = var1;
		return this;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)[I"
	)
	int[] ay(xi var1, int var2) {
		int var3 = var1.cg();
		if (0 == var3) {
			return null;
		} else {
			int[] var4 = new int[var3];

			for (int var5 = 0; var5 < var3; var5++) {
				var4[var5] = var1.co();
			}

			return var4;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lma;"
	)
	public ma bx_ma(int var1) {
		return this.hi_fld;
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llp;ZI)V"
	)
	public static void wo(lu var0, lp var1, boolean var2, int var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.dm_fld = 279120917;
			var0.dy_fld = new lp(var1);
			if (!var2) {
				var0.dy_fld.af_fld = Arrays.copyOf(var0.dy_fld.ar_fld, var0.dy_fld.ar_fld.length);
				var0.dy_fld.au((short)3193);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("clearActions")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void clearActions() {
		this.ei_fld = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;B)Lyv;"
	)
	yv af(lw var1, de var2, byte var3) {
		if (null != this.ct_fld && var2 != null) {
			kb var4 = (kb)(kb)var1.au_fld.ag(this.ct_fld);
			if (var4 == null) {
				var4 = new kb(this.ct_fld, var2);
				var1.au_fld.az(this.ct_fld, var4);
			}

			return var4.ak();
		} else {
			return null;
		}
	}

	@ObfuscatedName("setTargetVerb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Override
	public void setTargetVerb(String var1) {
		this.el_fld = var1;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setRotationX(int var1) {
		this.dx_fld = var1;
		return this;
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setRotationY(int var1) {
		this.du_fld = var1;
		return this;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean al(int var1) {
		return this.dz_fld || this.dt_fld || 0 != this.dh_fld || this.dv_fld != 0;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)I"
	)
	public static int jj(lu var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = 0; var4 < var0.hl_fld; var4++) {
			if (var0.hs_fld[var4] == var1) {
				return (Integer)var0.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("getRotationZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRotationZ() {
		return this.ds_fld;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde;)V"
	)
	public void ex(String var1, String var2, String var3, String var4, String var5, de var6) {
		try {
			this.hi_fld = new ma();
			if (!this.hi_fld.ag(var1, var3, var6)) {
				this.hi_fld = null;
			} else {
				if (null == this.he_fld || null == this.hd_fld) {
					this.bd(1830428324);
				}

				this.hi_fld.az(var2, var4, var5);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llw;ZI)Lkp;"
	)
	public kp aa(lw var1, boolean var2, int var3) {
		try {
			if (this.ch_fld == -1) {
				var2 = false;
			}

			int var4 = var2 ? this.ch_fld : this.cj_fld;
			if (-1 == var4) {
				return null;
			} else {
				long var5 = ((long)this.dv_fld << 40) + ((this.dt_fld ? 1L : 0L) << 39) + ((this.dz_fld ? 1L : 0L) << 38) + var4 + ((long)this.dh_fld << 36);
				kp var7 = (kp)var1.al_fld.ak(var5);
				if (var7 != null) {
					return var7;
				} else {
					yv var8 = ef(this, var1, var2, null, -423043034);
					if (var8 == null) {
						return null;
					} else {
						yv var9 = yv.wo(var8);
						int[] var10 = new int[var9.ay_fld];
						int[] var11 = new int[var9.ay_fld];

						for (int var12 = 0; var12 < var9.ay_fld; var12++) {
							int var13 = 0;
							int var14 = var9.aw_fld;

							for (int var15 = 0; var15 < var9.aw_fld; var15++) {
								if (0 == var9.ah_fld[var12 * var9.aw_fld + var15]) {
									var13 = var15;
									break;
								}
							}

							for (int var18 = var9.aw_fld - 1; var18 >= var13; var18--) {
								if (0 == var9.ah_fld[var18 + var12 * var9.aw_fld]) {
									var14 = var18 + 1;
									break;
								}
							}

							var10[var12] = var13;
							var11[var12] = var14 - var13;
						}

						var7 = new kp(var9.aw_fld, var9.ay_fld, var11, var10, var4);
						var1.al_fld.az(var7, var5);
						return var7;
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("getWidthMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWidthMode() {
		return this.bi_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V"
	)
	public void ai(int var1, String var2, int var3) {
		label40: {
			if (null != this.ei_fld) {
				if (this.ei_fld.length > var1) {
					break label40;
				}

				if (var3 == -504129724) {
					return;
				}
			}

			String[] var4 = new String[var1 + 1];
			if (this.ei_fld != null) {
				if (var3 == -504129724) {
					return;
				}

				for (int var5 = 0; var5 < this.ei_fld.length; var5++) {
					var4[var5] = this.ei_fld[var5];
				}
			}

			this.ei_fld = var4;
		}

		this.ei_fld[var1] = var2;
	}

	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setItemQuantity(int var1) {
		this.gd_fld = var1;
		return this;
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHeight() {
		return this.cd_fld;
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public static int wc(lu var0) {
		if (11 == var0.bx_fld && var0.hi_fld != null && null != var0.hd_fld && !var0.hd_fld.isEmpty()) {
			String var1 = var0.hi_fld.al();
			return null != var1 && var0.hd_fld.containsKey(var0.hi_fld.al()) ? (Integer)var0.hd_fld.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lyv;I)V"
	)
	public static void pr(lu var0, yv var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.dz_fld) {
			yv.zb(var1);
		}

		if (var0.dt_fld) {
			var1.ai();
		}

		if (var0.dh_fld > 0) {
			var1.aa(var0.dh_fld);
		}

		if (var0.dh_fld >= 1) {
			if (var2 >= 185271048) {
				return;
			}

			var1.am(1);
		}

		if (var0.dh_fld >= 2) {
			if (var2 >= 185271048) {
				return;
			}

			var1.am(16777215);
		}

		if (0 != var0.dv_fld) {
			var1.ad(var0.dv_fld);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;I)V"
	)
	public void aq(int var1, int var2, String var3, int var4) {
		if (null == this.ee_fld || this.ee_fld.length <= var1) {
			String[][] var5 = new String[var1 + 1][];
			if (null != this.ee_fld) {
				if (var4 <= 1404198381) {
					return;
				}

				System.arraycopy(this.ee_fld, 0, var5, 0, this.ee_fld.length);
			}

			this.ee_fld = var5;
		}

		label50: {
			if (this.ee_fld[var1] != null) {
				if (var4 <= 1404198381) {
					return;
				}

				if (this.ee_fld[var1].length > var2) {
					break label50;
				}
			}

			String[] var6 = new String[var2 + 1];
			if (null != this.ee_fld[var1]) {
				System.arraycopy(this.ee_fld[var1], 0, var6, 0, this.ee_fld[var1].length);
			}

			this.ee_fld[var1] = var6;
		}

		this.ee_fld[var1][var2] = var3;
	}

	@ObfuscatedName("isFilled")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isFilled() {
		return this.cz_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Ljava/lang/Object;"
	)
	public Object ao(int var1, Object var2, int var3) {
		for (int var4 = 0; var4 < this.hl_fld; var4++) {
			if (var1 == this.hs_fld[var4]) {
				return this.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("getParent")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/widgets/Widget;"
	)
	@Override
	public Widget getParent() {
		int var1 = this.getParentId();
		return var1 == -1 ? null : og.ci_fld.getWidget(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lol;IZLlp;Lpp;Lpg;B)Lfn;"
	)
	public fn an(lw var1, ol var2, int var3, boolean var4, lp var5, pp var6, pg var7, byte var8) {
		try {
			int var9;
			int var10;
			if (var4) {
				var9 = this.do_fld;
				var10 = this.dd_fld;
			} else {
				var9 = this.dm_fld;
				var10 = this.dq_fld;
			}

			if (0 == var9) {
				return null;
			} else if (1 == var9 && var10 == -1) {
				return null;
			} else {
				if (var7 != null && var7.ae_fld && 6 == var9) {
					var9 = 3;
				}

				long var11 = (var9 << 16) + var10;
				if (2 == var9 || 6 == var9) {
					if (var6 == null) {
						return null;
					}

					var11 = (var9 << 16) + var6.ca_fld;
				}

				if (null != var7) {
					var11 |= var7.ak_fld << 20;
				}

				fn var13 = (fn)var1.ar_fld.ak(var11);
				if (null == var13) {
					eg var14 = null;
					int var15 = 64;
					int var16 = 768;
					switch (var9) {
						case 1:
							var14 = eg.ak(var1.az_fld, var10, 0);
							break;
						case 2:
							var14 = var6.ay(null, -1381387792);
							break;
						case 3:
							var14 = null != var5 ? var5.af((byte)59) : null;
							break;
						case 4:
							og var17 = kb.ag(var10, -1752383175);
							var14 = var17.af(10, -735297366);
							var15 += var17.ee_fld;
							var16 += var17.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var14 = var6.ay(var7, -1845400614);
					}

					if (null == var14) {
						return null;
					}

					var13 = var14.bx(var15, var16, -50, -10, -50);
					var1.ar_fld.az(var13, var11);
				}

				if (null != var2) {
					var13 = var2.an(var13, var3, 1374814161);
				}

				return var13;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Llu;"
	)
	public lu setText(String var1) {
		this.dp_fld = var1;
		return this;
	}

	@ObfuscatedName("getTextShadowed")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean getTextShadowed() {
		return this.ed_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V"
	)
	public void at(int var1, Object var2, int var3) {
		for (int var4 = 0; var4 < this.hl_fld; var4++) {
			if (this.hs_fld[var4] == var1) {
				if (var3 != 583965381) {
					return;
				}

				this.hq_fld[var4] = var2;
				return;
			}
		}

		if (null == this.hq_fld) {
			this.hs_fld = new int[4];
			this.hq_fld = (Object[])(new Object[4]);
		} else if (this.hq_fld.length == this.hl_fld) {
			this.hs_fld = Arrays.copyOf(this.hs_fld, 2 * this.hs_fld.length);
			this.hq_fld = (Object[])Arrays.copyOf((Object[])this.hq_fld, this.hq_fld.length * 2);
		}

		this.hs_fld[this.hl_fld] = var1;
		this.hq_fld[this.hl_fld] = var2;
		this.hl_fld++;
	}

	@ObfuscatedName("setAction")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	@Override
	public void setAction(int var1, String var2) {
		this.ai(var1, var2, 1385349242);
	}

	@ObfuscatedName("getTargetVerb")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getTargetVerb() {
		return this.el_fld;
	}

	@ObfuscatedName("setDragDeadTime")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setDragDeadTime(int var1) {
		this.ey_fld = var1;
	}

	@ObfuscatedName("getOnKeyListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Override
	public Object[] getOnKeyListener() {
		return (Object[])this.fu_fld;
	}

	@ObfuscatedName("setOnScrollWheelListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnScrollWheelListener(Object[] var1) {
		this.fq_fld = (Object[])var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lde;J)V"
	)
	public void ac(String var1, String var2, de var3, long var4) {
		if (this.bx_fld == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.hi_fld = new ma();
			if (!this.hi_fld.ag(var1, var2, var3)) {
				this.hi_fld = null;
			} else {
				if (this.he_fld == null || null == this.hd_fld) {
					this.bd(-2094735428);
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void av(xi var1, int var2) {
		this.bj_fld = false;
		this.bx_fld = var1.cg();
		this.bo_fld = var1.cg();
		this.bp_fld = xi.tx(var1, 662491251);
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz();
		this.bw_fld = xi.tx(var1, 1761251052);
		this.ba_fld = xi.tx(var1, 1919252035);
		this.cb_fld = var1.cg();
		this.cv_fld = xi.tx(var1, 1116234712);
		if (this.cv_fld == 65535) {
			if (var2 != -1894614222) {
				return;
			}

			this.cv_fld = -1995802935;
		} else {
			this.cv_fld = (this.bf_fld & -65536) + this.cv_fld;
		}

		this.gk_fld = xi.tx(var1, 756350859);
		if (this.gk_fld == 65535) {
			this.gk_fld = 26740389;
		}

		int var3 = var1.cg();
		if (var3 > 0) {
			if (var2 != -1894614222) {
				return;
			}

			this.gp_fld = new int[var3];
			this.gv_fld = new int[var3];

			for (int var4 = 0; var4 < var3; var4++) {
				this.gp_fld[var4] = var1.cg();
				this.gv_fld[var4] = xi.tx(var1, 1362292260);
			}
		}

		int var8 = var1.cg();
		if (var8 > 0) {
			this.gu_fld = new int[var8][];

			for (int var5 = 0; var5 < var8; var5++) {
				int var6 = xi.tx(var1, 1785127357);
				this.gu_fld[var5] = new int[var6];

				for (int var7 = 0; var7 < var6; var7++) {
					this.gu_fld[var5][var7] = xi.tx(var1, 1935579796);
					if (this.gu_fld[var5][var7] == 65535) {
						this.gu_fld[var5][var7] = -1;
					}
				}
			}
		}

		if (0 == this.bx_fld) {
			this.cr_fld = xi.tx(var1, 540878274);
			this.cf_fld = var1.cg() == 1;
		}

		if (1 == this.bx_fld) {
			if (var2 != -1894614222) {
				return;
			}

			xi.tx(var1, 1475382319);
			var1.cg();
		}

		if (3 == this.bx_fld) {
			this.cz_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4 || 1 == this.bx_fld) {
			this.ep_fld = var1.cg();
			this.eb_fld = var1.cg();
			this.es_fld = var1.cg();
			this.de_fld = xi.tx(var1, 2018138342);
			if (65535 == this.de_fld) {
				this.de_fld = 57339867;
			}

			this.ed_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4) {
			this.dp_fld = xi.kc(var1, -1609285527);
			this.dj_fld = xi.kc(var1, 1530678426);
		}

		if (this.bx_fld == 1 || 3 == this.bx_fld || this.bx_fld == 4) {
			this.ca_fld = var1.co();
		}

		if (3 == this.bx_fld || 4 == this.bx_fld) {
			this.cg_fld = var1.co();
			this.cw_fld = var1.co();
			this.cm_fld = var1.co();
		}

		if (5 == this.bx_fld) {
			this.cj_fld = var1.co();
			this.ch_fld = var1.co();
		}

		if (this.bx_fld == 6) {
			this.dm_fld = -1800825853;
			this.do_fld = -1082400781;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld);
			this.dd_fld = var1.dl(wa.ak_fld.az_fld);
			this.dl_fld = xi.tx(var1, 600156895);
			if (65535 == this.dl_fld) {
				this.dl_fld = -968762547;
			}

			this.dr_fld = xi.tx(var1, 1154196434);
			if (this.dr_fld == 65535) {
				if (var2 != -1894614222) {
					return;
				}

				this.dr_fld = 37770411;
			}

			this.db_fld = xi.tx(var1, 719571157);
			this.dx_fld = xi.tx(var1, 1061996217);
			this.ds_fld = xi.tx(var1, 1080822707);
		}

		if (this.bx_fld == 8) {
			if (var2 != -1894614222) {
				return;
			}

			this.dp_fld = xi.kc(var1, -1354455776);
		}

		if (2 == this.bo_fld) {
			this.el_fld = xi.kc(var1, -161719043);
			this.gi_fld = xi.kc(var1, 1009453986);
			int var9 = xi.tx(var1, 1752941212) & 63;
			this.ec_fld = -950189223 * (this.ec_fld | var9 << 11);
		}

		label240: {
			if (this.bo_fld != 1 && 4 != this.bo_fld) {
				if (var2 != -1894614222) {
					return;
				}

				if (this.bo_fld != 5 && this.bo_fld != 6) {
					break label240;
				}
			}

			this.gq_fld = xi.kc(var1, -1370423885);
			if (this.gq_fld.isEmpty()) {
				if (1 == this.bo_fld) {
					this.gq_fld = kh.ab_fld;
				}

				if (4 == this.bo_fld) {
					this.gq_fld = kh.ap_fld;
				}

				if (5 == this.bo_fld) {
					this.gq_fld = kh.ap_fld;
				}

				if (6 == this.bo_fld) {
					this.gq_fld = kh.at_fld;
				}
			}
		}

		label232: {
			if (1 != this.bo_fld && this.bo_fld != 4) {
				if (var2 != -1894614222) {
					return;
				}

				if (5 != this.bo_fld) {
					break label232;
				}
			}

			this.ec_fld = -950189223 * (this.ec_fld | 4194304);
		}

		if (6 == this.bo_fld) {
			this.ec_fld = -950189223 * (this.ec_fld | 1);
		}
	}

	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "(II)Llu;"
	)
	public lu qg(int var1, int var2) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else if (this.getType() != 0) {
			throw new UnsupportedOperationException("children can only be created on type layer widgets");
		} else {
			lu var3 = new lu();
			var3.setType(var2);
			var3.cv_fld = var3.bf_fld = this.bf_fld;
			var3.cy_fld = this.by_fld;
			var3.pf(true);
			lu var4 = og.ci_fld.getWidget(this.bf_fld);
			if (!im_fld && var4 != this && this.by_fld == -1) {
				throw new AssertionError();
			} else {
				lu[] var5 = var4.ge_fld;
				if (var1 < 0) {
					if (var5 == null) {
						var1 = 0;
					} else {
						var1 = 0;

						for (int var6 = var5.length - 1; var6 >= 0; var6--) {
							if (var5[var6] != null) {
								var1 = var6 + 1;
								break;
							}
						}
					}
				}

				if (var5 == null) {
					var5 = new lu[var1 + 1];
					var4.ge_fld = var5;
				} else if (var5.length <= var1) {
					lu[] var7 = new lu[var1 + 1];
					System.arraycopy(var5, 0, var7, 0, var5.length);
					var5 = var7;
					var4.ge_fld = var7;
				}

				var5[var1] = var3;
				var3.by_fld = var1;
				if (this.by_fld > -1) {
					if (!im_fld && this.getType() != 0) {
						throw new AssertionError();
					}

					if (var1 > this.cs_fld) {
						this.cs_fld = var1;
					}

					if (var1 < this.cx_fld) {
						this.cx_fld = var1;
					}
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lde;B)V"
	)
	public void bm(String var1, de var2, byte var3) {
		if (this.bx_fld == 11 && null != var1) {
			this.hi_fld = new ma();
			this.hi_fld.aq(var1, var2);
		}
	}

	@ObfuscatedName("revalidateScroll")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void revalidateScroll() {
		try {
			if (!og.ci_fld.isClientThread()) {
				if (!tf.$assertionsDisabled) {
					throw new AssertionError("must be called on client thread");
				} else {
					throw new IllegalStateException("must be called on client thread");
				}
			} else {
				this.revalidate();
				client.aq(cf.cg_fld.aw_fld[WidgetUtil.componentToInterface(this.getId())], this, false, cf.cg_fld, client.cz_fld);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Lub;II[I)[B"
	)
	public static byte[] ek(ub var0, int var1, int var2, int[] var3) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (var1 >= 0 && var1 < var0.bc_fld.length && null != var0.bc_fld[var1] && var2 >= 0 && var2 < var0.bc_fld[var1].length) {
				if (var0.bc_fld[var1][var2] == null) {
					boolean var4 = var0.cw(var1, var3, (byte)8);
					if (!var4) {
						var0.av(var1, 901265219);
						var4 = var0.cw(var1, var3, (byte)8);
						if (!var4) {
							return null;
						}
					}
				}

				byte[] var8 = im.ak(var0.bc_fld[var1][var2], false);
				if (var0.bs_fld) {
					var0.bc_fld[var1][var2] = null;
				}

				return var8;
			} else {
				return null;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOriginalX(int var1) {
		this.bn_fld = var1;
		return this;
	}

	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void td(String var1) {
		this.eq_fld = var1;
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String qz() {
		return this.eq_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bd(int var1) {
		this.he_fld = new HashMap();
		this.hd_fld = new HashMap();
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gu() {
		return this.dp_fld;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long dn(int var1, long var2) {
		for (int var4 = 0; var4 < this.hl_fld; var4++) {
			if (var1 == this.hs_fld[var4]) {
				return (Long)this.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("getOriginalHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOriginalHeight() {
		return this.ba_fld;
	}

	@ObfuscatedName("getSpriteTiling")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean getSpriteTiling() {
		return this.dc_fld;
	}

	@ObfuscatedName("getNestedChildren")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/widgets/Widget;"
	)
	@Override
	public Widget[] getNestedChildren() {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else if (this.by_fld > -1) {
			return new Widget[0];
		} else {
			pk var1 = (pk)cf.cg_fld.ai_fld.get(this.bf_fld);
			if (var1 == null) {
				return new lu[0];
			} else {
				int var2 = var1.getId();
				ArrayList var3 = new ArrayList();

				for (lu var7 : og.ci_fld.tg(var2)) {
					if (var7 != null && var7.cv_fld == -1) {
						var3.add(var7);
					}
				}

				return (Widget[])(Widget[])var3.toArray(new lu[0]);
			}
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lol;IZLlp;Lpp;Lpg;)Lfn;"
	)
	public fn cl(lw var1, ol var2, int var3, boolean var4, lp var5, pp var6, pg var7) {
		try {
			int var8;
			int var9;
			if (var4) {
				var8 = this.do_fld * 1249031305;
				var9 = this.dd_fld;
			} else {
				var8 = 541646880 * this.dm_fld;
				var9 = this.dq_fld;
			}

			if (0 == var8) {
				return null;
			} else if (1 == var8 && var9 == -1) {
				return null;
			} else {
				if (var7 != null && var7.ae_fld && 6 == var8) {
					var8 = 3;
				}

				long var10 = (var8 << 16) + var9;
				if (2 == var8 || 6 == var8) {
					if (var6 == null) {
						return null;
					}

					var10 = (var8 << 16) + var6.ca_fld;
				}

				if (null != var7) {
					var10 |= var7.ak_fld << 20;
				}

				fn var12 = (fn)var1.ar_fld.ak(var10);
				if (null == var12) {
					eg var13 = null;
					int var14 = 64;
					int var15 = 1045855816;
					switch (var8) {
						case 1:
							var13 = eg.ak(var1.az_fld, var9, 0);
							break;
						case 2:
							var13 = var6.ay(null, -1268541705);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)3) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = var16.af(10, 686120708);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = var6.ay(var7, -1499907116);
					}

					if (null == var13) {
						return null;
					}

					var12 = var13.bx(var14, var15, -50, -10, -50);
					var1.ar_fld.az(var12, var10);
				}

				if (null != var2) {
					var12 = var2.an(var12, var3, 1374814161);
				}

				return var12;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	public static void lg(lu var0, int var1, int var2) {
		if (11 == var0.bx_fld) {
			if (var0.he_fld == null) {
				var0.bd(-487250190);
			}

			var0.he_fld.put(var1, var2);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Lli;"
	)
	public static li bv(lu var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.hk_fld != null ? var0.hk_fld.ak_fld : null;
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "()Lli;"
	)
	public li fg() {
		return this.hk_fld != null ? this.hk_fld.ak_fld : null;
	}

	@ObfuscatedName("getOnOpListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Override
	public Object[] getOnOpListener() {
		return (Object[])this.ft_fld;
	}

	@ObfuscatedName("setOnVarTransmitListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnVarTransmitListener(Object[] var1) {
		this.fh_fld = (Object[])var1;
	}

	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Lzv;"
	)
	public zv xg(lw var1) {
		try {
			return dg(this, var1, (byte)-81);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;B)Lzf;"
	)
	public static zf dg(lu var0, lw var1, byte var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var0.de_fld == -1) {
				return null;
			} else {
				zf var3 = (zf)var1.af_fld.ak(var0.de_fld);
				if (null != var3) {
					return var3;
				} else {
					var3 = dv.ae(var1.av_fld, var1.ae_fld, var0.de_fld, 0);
					if (null != var3) {
						var1.af_fld.az(var3, var0.de_fld);
					}

					return var3;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
	)
	Object[] bq(Object[] var1) {
		return (Object[])(null != var1 ? Arrays.copyOf((Object[])var1, var1.length) : null);
	}

	@ObfuscatedName("zz")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOriginalHeight(int var1) {
		this.ba_fld = var1;
		return this;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bj(int var1) {
		return this.hd_fld != null && !this.hd_fld.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("getItemQuantity")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getItemQuantity() {
		return this.gd_fld;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde;)V"
	)
	public static void dd(lu var0, String var1, String var2, String var3, String var4, String var5, de var6) throws UnsupportedEncodingException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.hi_fld = new ma();
			if (!var0.hi_fld.ag(var1, var3, var6)) {
				var0.hi_fld = null;
			} else {
				if (null == var0.he_fld || null == var0.hd_fld) {
					var0.bd(-1885406961);
				}

				var0.hi_fld.az(var2, var4, var5);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("setOnTargetEnterListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnTargetEnterListener(Object[] var1) {
		this.fk_fld = (Object[])var1;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cb() {
		return this.dz_fld || this.dt_fld || 0 != this.dh_fld || this.dv_fld != 0;
	}

	@ObfuscatedName("setType")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setType(int var1) {
		this.bx_fld = var1;
	}

	@ObfuscatedName("getOriginalWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOriginalWidth() {
		return this.bw_fld;
	}

	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Z"
	)
	public static boolean wm(lu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return 11 == var0.bx_fld || 12 == var0.bx_fld;
	}

	@ObfuscatedName("xs")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setAnimationId(int var1) {
		this.dl_fld = var1;
		return this;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([I)[I"
	)
	int[] cd(int[] var1) {
		return null != var1 ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Llw;)V"
	)
	void fw(lw var1) {
		this.hb_fld = true;
		ArrayList var2 = this.hi_fld.as();
		ArrayList var3 = ma.ck(this.hi_fld, -2120439258);
		int var4 = var2.size() + var3.size();
		this.ge_fld = new lu[var4];
		int var5 = 0;
		Iterator var6 = var2.iterator();

		while (var6.hasNext()) {
			lq var7 = (lq)(lq)var6.next();
			lu var8 = is.ak(5, this, var5, 0, 0, 0, 0, var7.ag_fld);
			var8.ct_fld = var7.ak_fld.az();
			kb var9 = new kb(var7.ak_fld);
			var1.au_fld.az(var8.ct_fld, var9);
			this.ge_fld[var5++] = var8;
		}

		var6 = var3.iterator();

		while (var6.hasNext()) {
			mr var11 = (mr)(mr)var6.next();
			lu var12 = is.ak(4, this, var5, 0, 0, 0, 0, var11.ae_fld);
			var12.dp_fld = var11.av_fld;
			var12.de_fld = (Integer)this.he_fld.get(var11.ay_fld) * -82239663;
			var12.ep_fld = var11.ah_fld * 1375656682;
			var12.eb_fld = 992230371 * var11.aw_fld;
			this.ge_fld[var5++] = var12;
		}
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde;)V"
	)
	public static void of(lu var0, String var1, String var2, String var3, String var4, String var5, de var6) throws UnsupportedEncodingException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.hi_fld = new ma();
				if (!var0.hi_fld.ag(var1, var3, var6)) {
					var0.hi_fld = null;
				} else {
					if (null == var0.he_fld || null == var0.hd_fld) {
						var0.bd(1005534549);
					}

					var0.hi_fld.az(var2, var4, var5);
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void bt(byte var1) {
		this.hk_fld = new ld();

		for (int var2 = 1; var2 <= 12; var2++) {
			this.hk_fld.az_fld.ak(var2, 0);
		}

		for (char var3 = 0; var3 < ' '; var3++) {
			this.hk_fld.az_fld.ag(var3, 0);
		}

		this.hk_fld.az_fld.ag('\u0080', 0);
		this.hk_fld.az_fld.ak(82, 2);
		this.hk_fld.az_fld.ak(81, 2);
		this.hk_fld.az_fld.ak(86, 2);
	}

	@ObfuscatedName("getFontId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getFontId() {
		return this.de_fld;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setClickMask(int var1) {
		this.ec_fld = var1;
		return this;
	}

	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "(II)Llu;"
	)
	public lu setSize(int var1, int var2) {
		return this.setOriginalWidth(var1).setOriginalHeight(var2);
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;Z)Lkp;"
	)
	public static kp mw(lu var0, lw var1, boolean var2) throws EOFException {
		try {
			if (var0.ch_fld == -1) {
				var2 = false;
			}

			int var3 = var2 ? var0.ch_fld * -397786198 : var0.cj_fld;
			if (-1 == var3) {
				return null;
			} else {
				long var4 = ((long)var0.dv_fld << 735178423)
					+ ((var0.dt_fld ? 1L : 0L) << 384065631)
					+ ((var0.dz_fld ? 1L : 0L) << 38)
					+ var3
					+ ((long)(1261731204 * var0.dh_fld) << 36);
				kp var6 = (kp)var1.al_fld.ak(var4);
				if (var6 != null) {
					return var6;
				} else {
					yv var7 = ef(var0, var1, var2, null, -423043034);
					if (var7 == null) {
						return null;
					} else {
						yv var8 = yv.wo(var7);
						int[] var9 = new int[var8.ay_fld];
						int[] var10 = new int[var8.ay_fld];

						for (int var11 = 0; var11 < var8.ay_fld; var11++) {
							int var12 = 0;
							int var13 = var8.aw_fld;

							for (int var14 = 0; var14 < var8.aw_fld; var14++) {
								if (0 == var8.ah_fld[var11 * var8.aw_fld + var14]) {
									var12 = var14;
									break;
								}
							}

							for (int var18 = var8.aw_fld - 1; var18 >= var12; var18--) {
								if (0 == var8.ah_fld[var18 + var11 * var8.aw_fld]) {
									var13 = var18 + 1;
									break;
								}
							}

							var9[var11] = var12;
							var10[var11] = var13 - var12;
						}

						var6 = new kp(var8.aw_fld, var8.ay_fld, var10, var9, var3);
						var1.al_fld.az(var6, var4);
						return var6;
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setXPositionMode(int var1) {
		this.bt_fld = var1;
		return this;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)Ljava/lang/Object;"
	)
	public Object du(int var1, Object var2) {
		for (int var3 = 0; var3 < this.hl_fld; var3++) {
			if (var1 == this.hs_fld[var3]) {
				return this.hq_fld[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lsc;"
	)
	public sc bu(int var1) {
		return this.hk_fld != null ? this.hk_fld.az_fld : null;
	}

	@ObfuscatedName("getScrollX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getScrollX() {
		return this.cp_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Lld;"
	)
	public ld bn(byte var1) {
		return this.hk_fld;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mc(int var1) {
		this.nn_fld = var1;
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(Llu;IJ)J"
	)
	public static long rp(lu var0, int var1, long var2) {
		for (int var4 = 0; var4 < var0.hl_fld; var4++) {
			if (var1 == var0.hs_fld[var4]) {
				return (Long)var0.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] cp() {
		return this.gf_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)Z"
	)
	boolean bc(li var1, int var2) {
		boolean var3 = false;
		if (null != this.dp_fld && !this.dp_fld.isEmpty()) {
			var3 |= li.sc(var1, bw.ax(this.dp_fld), 269455100);
			this.dp_fld = "";
		}

		if (this.dj_fld != null && !this.dj_fld.isEmpty()) {
			String var7 = this.dj_fld;
			StringBuilder var8 = new StringBuilder(var7.length());
			int var9 = 0;
			int var10 = -1;

			for (int var11 = 0; var11 < var7.length(); var11++) {
				char var12 = var7.charAt(var11);
				if ('<' == var12) {
					var8.append(var7.substring(var9, var11));
					var10 = var11;
				} else if (var12 == '>' && var10 != -1) {
					String var13 = var7.substring(var10 + 1, var11);
					var10 = -1;
					if (var13.equals("lt")) {
						var8.append("<");
					} else if (var13.equals("gt")) {
						var8.append(">");
					} else if (var13.equals("br")) {
						var8.append("\n");
					}

					var9 = 1 + var11;
				}
			}

			if (var9 < var7.length()) {
				var8.append(var7.substring(var9, var7.length()));
			}

			String var6 = var8.toString();
			var3 |= var1.ae(var6);
			this.dj_fld = "";
		}

		return var3;
	}

	@ObfuscatedName("setOnMouseRepeatListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnMouseRepeatListener(Object[] var1) {
		this.fx_fld = (Object[])var1;
	}

	@ObfuscatedName("getDragDeadTime")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getDragDeadTime() {
		return this.ey_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Llw;I)Z"
	)
	public boolean bw(lw var1, int var2) {
		try {
			li var3 = bv(this, -712274036);
			if (var3 == null) {
				return false;
			} else {
				boolean var4 = false;
				if (!var3.cq() && this.de_fld != -1) {
					int var5 = var3.cv();
					int var6 = var3.cy();
					int var7 = var3.cc();
					int var8 = li.dg(var3, (byte)-43);
					zf var9 = dg(this, var1, (byte)12);
					if (null != var9) {
						var4 |= var3.ah(var9);
						var4 |= this.bc(var3, 55221958);
						var4 |= var3.al(var5, var6);
						var4 |= li.ik(var3, var7, var8, (byte)-44);
					}
				} else if (var3.cq()) {
					var4 |= this.bc(var3, 55221958);
				}

				li.jd(var3, 261216131);
				return var4;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;Z)Lkp;"
	)
	public static kp qi(lu var0, lw var1, boolean var2) throws EOFException {
		try {
			if (var0.ch_fld == -1) {
				var2 = false;
			}

			int var3 = var2 ? var0.ch_fld * -1633846296 : var0.cj_fld * -423108784;
			if (-1 == var3) {
				return null;
			} else {
				long var4 = ((long)(1687104053 * var0.dv_fld) << 1119072921)
					+ ((var0.dt_fld ? 1L : 0L) << 39)
					+ ((var0.dz_fld ? 1L : 0L) << 42621897)
					+ var3
					+ ((long)(-1358680044 * var0.dh_fld) << -1215926208);
				kp var6 = (kp)var1.al_fld.ak(var4);
				if (var6 != null) {
					return var6;
				} else {
					yv var7 = ef(var0, var1, var2, null, -423043034);
					if (var7 == null) {
						return null;
					} else {
						yv var8 = yv.wo(var7);
						int[] var9 = new int[var8.ay_fld];
						int[] var10 = new int[var8.ay_fld];

						for (int var11 = 0; var11 < var8.ay_fld; var11++) {
							int var12 = 0;
							int var13 = var8.aw_fld;

							for (int var14 = 0; var14 < var8.aw_fld; var14++) {
								if (0 == var8.ah_fld[var11 * var8.aw_fld + var14]) {
									var12 = var14;
									break;
								}
							}

							for (int var18 = var8.aw_fld - 1; var18 >= var12; var18--) {
								if (0 == var8.ah_fld[var18 + var11 * var8.aw_fld]) {
									var13 = var18 + 1;
									break;
								}
							}

							var9[var11] = var12;
							var10[var11] = var13 - var12;
						}

						var6 = new kp(var8.aw_fld, var8.ay_fld, var10, var9, var3);
						var1.al_fld.az(var6, var4);
						return var6;
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "()[Llu;"
	)
	public lu[] getChildren() {
		return this.ge_fld;
	}

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void vl(int var1) {
		if (this.sw_fld > -1) {
			this.setRelativeX(this.sw_fld);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bz(int var1, int var2, int var3) {
		if (11 == this.bx_fld) {
			if (this.he_fld == null) {
				this.bd(1230390981);
			}

			this.he_fld.put(var1, var2);
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setTextColor(int var1) {
		this.ca_fld = var1;
		return this;
	}

	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setScrollHeight(int var1) {
		this.cr_fld = var1;
		return this;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
	)
	Object[] bb(Object[] var1) {
		return (Object[])(null != var1 ? Arrays.copyOf((Object[])var1, var1.length) : null);
	}

	@ObfuscatedName("hasListener")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean hasListener() {
		return this.eh_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lph;"
	)
	public static ph ag(int var0) throws EOFException {
		try {
			ph var2 = (ph)ph.az_fld.ak(var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = ph.ag_fld.bb(14, var0, 584982574);
				var2 = new ph();
				if (null != var3) {
					var2.av(new xi(var3), (byte)-46);
				}

				ph.az_fld.az(var2, var0);
				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ah(xi var1, int var2) {
		this.bl_fld = xi.kc(var1, 409262132);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bc() {
		return this.gm_fld;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cf(xi var1) {
		var1.cg();
		this.bj_fld = true;
		this.bx_fld = var1.cg();
		this.bp_fld = xi.tx(var1, 1038598345) * -868651010;
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz();
		this.bw_fld = xi.tx(var1, 1471823473) * -1701357480;
		if (9 == this.bx_fld) {
			this.ba_fld = var1.cz() * -1644924798;
		} else {
			this.ba_fld = xi.tx(var1, 1688678816);
		}

		this.bi_fld = xi.rp(var1, -258363569) * 1320325300;
		this.bu_fld = xi.rp(var1, -325863210);
		this.bt_fld = xi.rp(var1, -1290427005) * -1977540311;
		this.bv_fld = xi.rp(var1, -377959748) * -1615104396;
		this.cv_fld = xi.tx(var1, 1617868275) * 1696815699;
		if (65535 == this.cv_fld) {
			this.cv_fld = -1995802935;
		} else {
			this.cv_fld = -1872657625 * ((this.bf_fld & 1673981763) + this.cv_fld);
		}

		this.cf_fld = var1.cg() == 1;
		if (0 == this.bx_fld) {
			this.cn_fld = xi.tx(var1, 2127649290);
			this.cr_fld = xi.tx(var1, 803075335);
			this.hb_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 5) {
			this.cj_fld = var1.co();
			this.cl_fld = xi.tx(var1, 332924564);
			this.dc_fld = var1.cg() == 1;
			this.cb_fld = var1.cg() * 1213948940;
			this.dh_fld = var1.cg();
			this.dv_fld = var1.co();
			this.dz_fld = var1.cg() == 1;
			this.dt_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 6) {
			this.dm_fld = 658583697;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld);
			this.da_fld = var1.cz() * 2060613333;
			this.dk_fld = var1.cz() * 2070216514;
			this.dx_fld = xi.tx(var1, 1409175669) * -1983433456;
			this.ds_fld = xi.tx(var1, 862155018);
			this.du_fld = xi.tx(var1, 951429237);
			this.db_fld = xi.tx(var1, 1539669789);
			this.dl_fld = xi.tx(var1, 1035557031);
			if (1975696353 == this.dl_fld) {
				this.dl_fld = 997960001;
			}

			this.di_fld = var1.cg() == 1;
			xi.tx(var1, 1085714870);
			if (0 != this.bi_fld) {
				this.dg_fld = xi.tx(var1, 865914328);
			}

			if (this.bu_fld * 1483089828 != 0) {
				xi.tx(var1, 1497758069);
			}
		}

		if (4 == this.bx_fld) {
			this.de_fld = xi.tx(var1, 744669164);
			if (1886587611 == this.de_fld) {
				this.de_fld = -529272795;
			}

			this.dp_fld = xi.kc(var1, -104639611);
			this.es_fld = var1.cg();
			this.ep_fld = var1.cg() * 1579793947;
			this.eb_fld = var1.cg() * 1503082921;
			this.ed_fld = var1.cg() == 1;
			this.ca_fld = var1.co() * -1758080874;
		}

		if (this.bx_fld == 3) {
			this.ca_fld = var1.co();
			this.cz_fld = var1.cg() == 1;
			this.cb_fld = var1.cg() * 343872093;
		}

		if (this.bx_fld == 9) {
			this.cu_fld = var1.cg();
			this.ca_fld = var1.co() * -1170168797;
			this.ci_fld = var1.cg() == 1;
		}

		this.ec_fld = var1.ck();
		this.eq_fld = xi.kc(var1, 1124431347);
		int var2 = var1.cg();
		if (var2 > 0) {
			this.ei_fld = new String[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				this.ei_fld[var3] = xi.kc(var1, 224067346);
			}
		}

		this.ev_fld = var1.cg();
		this.ey_fld = var1.cg() * 131304914;
		this.em_fld = var1.cg() == 1;
		this.el_fld = xi.kc(var1, -415877578);
		this.eu_fld = (Object[])this.aw(var1, 1006055606);
		this.fp_fld = (Object[])this.aw(var1, 1006055606);
		this.fv_fld = (Object[])this.aw(var1, 1006055606);
		this.fc_fld = (Object[])this.aw(var1, 1006055606);
		this.fk_fld = (Object[])this.aw(var1, 1006055606);
		this.fh_fld = (Object[])this.aw(var1, 1006055606);
		this.fe_fld = (Object[])this.aw(var1, 1006055606);
		this.fl_fld = (Object[])this.aw(var1, 1006055606);
		this.fn_fld = (Object[])this.aw(var1, 1006055606);
		this.ft_fld = (Object[])this.aw(var1, 1006055606);
		this.fx_fld = (Object[])this.aw(var1, 1006055606);
		this.ej_fld = (Object[])this.aw(var1, 1006055606);
		this.fy_fld = (Object[])this.aw(var1, 1006055606);
		this.fa_fld = (Object[])this.aw(var1, 1006055606);
		this.fo_fld = (Object[])this.aw(var1, 1006055606);
		this.fj_fld = (Object[])this.aw(var1, 1006055606);
		this.fb_fld = (Object[])this.aw(var1, 1006055606);
		this.fq_fld = (Object[])this.aw(var1, 1006055606);
		this.fm_fld = this.ay(var1, 288211997);
		this.fw_fld = this.ay(var1, 1474329466);
		this.fg_fld = this.ay(var1, 955192697);
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public static boolean kv(lu var0) {
		return 11 == var0.bx_fld || 12 == var0.bx_fld;
	}

	@ObfuscatedName("getOpacity")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOpacity() {
		return this.cb_fld;
	}

	@ObfuscatedName("setNoClickThrough")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setNoClickThrough(boolean var1) {
		this.hb_fld = var1;
	}

	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setScrollY(int var1) {
		this.ce_fld = var1;
		return this;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)[Ljava/lang/Object;"
	)
	Object[] cx(xi var1) {
		int var2 = var1.cg();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = (Object[])(new Object[var2]);

			for (int var4 = 0; var4 < var2; var4++) {
				int var5 = var1.cg();
				if (0 == var5) {
					var3[var4] = new Integer(var1.co());
				} else if (var5 == 1) {
					var3[var4] = xi.kc(var1, -687701122);
				}
			}

			this.eh_fld = true;
			return (Object[])var3;
		}
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("createChild")
	@ObfuscatedSignature(
		descriptor = "(II)Lnet/runelite/api/widgets/Widget;"
	)
	@Override
	public Widget createChild(int var1, int var2) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			return this.qg(var1, var2);
		}
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setTextShadowed(boolean var1) {
		this.ed_fld = var1;
		return this;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)[I"
	)
	int[] cs(xi var1) {
		int var2 = var1.cg();
		if (0 == var2) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; var4++) {
				var3[var4] = var1.co();
			}

			return var3;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setModelZoom(int var1) {
		this.db_fld = var1;
		return this;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)[I"
	)
	int[] cp(xi var1) {
		int var2 = var1.cg();
		if (0 == var2) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; var4++) {
				var3[var4] = var1.co();
			}

			return var3;
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setYPositionMode(int var1) {
		this.bv_fld = var1;
		return this;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Llw;ZLde;)Lyv;"
	)
	public yv cn(lw var1, boolean var2, de var3) {
		try {
			if (null != this.ct_fld) {
				yv var4 = this.ar(var1, var3, 521764807);
				if (var4 != null) {
					return var4;
				}
			}

			int var10;
			if (var2) {
				var10 = this.ch_fld;
			} else {
				var10 = this.cj_fld * -2101388578;
			}

			if (var10 == -1) {
				return null;
			} else {
				long var5 = ((this.dz_fld ? 1L : 0L) << 38)
					+ ((long)(628050516 * this.dh_fld) << 36)
					+ var10
					+ ((this.dt_fld ? 1L : 0L) << 103328016)
					+ ((long)(1113812018 * this.dv_fld) << 40);
				yv var7 = (yv)var1.as_fld.ak(var5);
				if (var7 != null) {
					return var7;
				} else {
					var7 = wf.av(var1.av_fld, var10, 0);
					if (null == var7) {
						return null;
					} else {
						pr(this, var7, -1944439442);
						var1.as_fld.az(var7, var5);
						return var7;
					}
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Lyv;"
	)
	yv cw(lw var1, de var2) {
		if (!this.al(598842371)) {
			return this.af(var1, var2, (byte)0);
		} else {
			String var3 = this.ct_fld + (this.dz_fld ? 1 : 0) + (this.dt_fld ? 1 : 0) + this.dh_fld + this.dv_fld;
			yv var4 = (yv)(yv)var1.ax_fld.ag(var3);
			if (null == var4) {
				yv var5 = this.af(var1, var2, (byte)0);
				if (var5 != null) {
					var4 = var5.al();
					pr(this, var4, -1154549880);
					var1.ax_fld.az(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Lyv;"
	)
	yv cg(lw var1, de var2) {
		if (null != this.ct_fld && var2 != null) {
			kb var3 = (kb)(kb)var1.au_fld.ag(this.ct_fld);
			if (var3 == null) {
				var3 = new kb(this.ct_fld, var2);
				var1.au_fld.az(this.ct_fld, var3);
			}

			return var3.ak();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Lyv;"
	)
	yv ca(lw var1, de var2) {
		if (null != this.ct_fld && var2 != null) {
			kb var3 = (kb)(kb)var1.au_fld.ag(this.ct_fld);
			if (var3 == null) {
				var3 = new kb(this.ct_fld, var2);
				var1.au_fld.az(this.ct_fld, var3);
			}

			return var3.ak();
		} else {
			return null;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/widgets/Widget;)Llu;"
	)
	public lu setDragParent(Widget var1) {
		this.ea_fld = (lu)var1;
		return this;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long ap(int var1, long var2) {
		for (int var4 = 0; var4 < this.hl_fld; var4++) {
			if (var1 == this.hs_fld[var4]) {
				return (Long)this.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("getIndex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getIndex() {
		return this.by_fld;
	}

	@ObfuscatedName("yy")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOpacity(int var1) {
		this.cb_fld = var1;
		return this;
	}

	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu createChild(int var1) {
		return this.qg(-1, var1);
	}

	@ObfuscatedName("setOnClickListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnClickListener(Object[] var1) {
		this.ej_fld = (Object[])var1;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ck() {
		return this.dz_fld || this.dt_fld || 0 != this.dh_fld || -679869938 * this.dv_fld != 0;
	}

	@ObfuscatedName("getScrollY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getScrollY() {
		return this.ce_fld;
	}

	@ObfuscatedName("getScrollHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getScrollHeight() {
		return this.cr_fld;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	void co(yv var1) {
		if (this.dz_fld) {
			yv.zb(var1);
		}

		if (this.dt_fld) {
			var1.ai();
		}

		if (this.dh_fld > 0) {
			var1.aa(-470925794 * this.dh_fld);
		}

		if (this.dh_fld >= 1) {
			var1.am(1);
		}

		if (this.dh_fld >= 2) {
			var1.am(16777215);
		}

		if (0 != this.dv_fld) {
			var1.ad(this.dv_fld * 1136564310);
		}
	}

	@ObfuscatedName("setOnTargetLeaveListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnTargetLeaveListener(Object[] var1) {
		this.fc_fld = (Object[])var1;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	void cu(yv var1) {
		if (this.dz_fld) {
			yv.zb(var1);
		}

		if (this.dt_fld) {
			var1.ai();
		}

		if (this.dh_fld > 0) {
			var1.aa(this.dh_fld);
		}

		if (this.dh_fld >= 1) {
			var1.am(1);
		}

		if (this.dh_fld >= 2) {
			var1.am(16777215);
		}

		if (0 != this.dv_fld) {
			var1.ad(this.dv_fld);
		}
	}

	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Llu;"
	)
	public lu setName(String var1) {
		this.td(var1.replace(' ', ' '));
		return this;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Lzf;"
	)
	public zf ci(lw var1) {
		try {
			if (this.de_fld == -1) {
				return null;
			} else {
				zf var2 = (zf)var1.af_fld.ak(this.de_fld);
				if (null != var2) {
					return var2;
				} else {
					var2 = dv.ae(var1.av_fld, var1.ae_fld, this.de_fld, 0);
					if (null != var2) {
						var1.af_fld.az(var2, this.de_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getAnimationId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAnimationId() {
		return this.dl_fld;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Lzf;"
	)
	public zf cj(lw var1) {
		try {
			if (this.de_fld == -1) {
				return null;
			} else {
				zf var2 = (zf)var1.af_fld.ak(this.de_fld);
				if (null != var2) {
					return var2;
				} else {
					var2 = dv.ae(var1.av_fld, var1.ae_fld, this.de_fld, 0);
					if (null != var2) {
						var1.af_fld.az(var2, this.de_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lol;IZLlp;Lpp;Lpg;)Lfn;"
	)
	public fn ch(lw var1, ol var2, int var3, boolean var4, lp var5, pp var6, pg var7) {
		try {
			int var8;
			int var9;
			if (var4) {
				var8 = this.do_fld;
				var9 = this.dd_fld * 1942414419;
			} else {
				var8 = this.dm_fld;
				var9 = this.dq_fld;
			}

			if (0 == var8) {
				return null;
			} else if (1 == var8 && var9 == -1) {
				return null;
			} else {
				if (var7 != null && var7.ae_fld && 6 == var8) {
					var8 = 3;
				}

				long var10 = (var8 << 16) + var9;
				if (2 == var8 || 6 == var8) {
					if (var6 == null) {
						return null;
					}

					var10 = (var8 << 16) + var6.ca_fld;
				}

				if (null != var7) {
					var10 |= var7.ak_fld << 20;
				}

				fn var12 = (fn)var1.ar_fld.ak(var10);
				if (null == var12) {
					eg var13 = null;
					int var14 = 64;
					int var15 = 768;
					switch (var8) {
						case 1:
							var13 = eg.ak(var1.az_fld, var9, 0);
							break;
						case 2:
							var13 = var6.ay(null, -1376378467);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)58) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = var16.af(10, -1724242918);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = var6.ay(var7, -1742166923);
					}

					if (null == var13) {
						return null;
					}

					var12 = var13.bx(var14, var15, -50, -10, -50);
					var1.ar_fld.az(var12, var10);
				}

				if (null != var2) {
					var12 = var2.an(var12, var3, 1374814161);
				}

				return var12;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("getItemId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getItemId() {
		return this.ga_fld;
	}

	@ObfuscatedName("getItemQuantityMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getItemQuantityMode() {
		return this.df_fld;
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;I)I"
	)
	public static int fk(lu var0, String var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return 11 == var0.bx_fld && var0.hi_fld != null && qz(var0, 297822854) ? var0.hi_fld.aw(var1) : -1;
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lol;IZLlp;Lpp;Lpg;)Lfn;"
	)
	public fn ct(lw var1, ol var2, int var3, boolean var4, lp var5, pp var6, pg var7) {
		try {
			int var8;
			int var9;
			if (var4) {
				var8 = this.do_fld;
				var9 = this.dd_fld;
			} else {
				var8 = this.dm_fld;
				var9 = this.dq_fld;
			}

			if (0 == var8) {
				return null;
			} else if (1 == var8 && var9 == -1) {
				return null;
			} else {
				if (var7 != null && var7.ae_fld && 6 == var8) {
					var8 = 3;
				}

				long var10 = (var8 << 16) + var9;
				if (2 == var8 || 6 == var8) {
					if (var6 == null) {
						return null;
					}

					var10 = (var8 << 16) + var6.ca_fld;
				}

				if (null != var7) {
					var10 |= var7.ak_fld << 20;
				}

				fn var12 = (fn)var1.ar_fld.ak(var10);
				if (null == var12) {
					eg var13 = null;
					int var14 = 64;
					int var15 = 768;
					switch (var8) {
						case 1:
							var13 = eg.ak(var1.az_fld, var9, 0);
							break;
						case 2:
							var13 = var6.ay(null, -1225350609);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)39) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = var16.af(10, 1965776228);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = var6.ay(var7, -1460889653);
					}

					if (null == var13) {
						return null;
					}

					var12 = var13.bx(var14, var15, -50, -10, -50);
					var1.ar_fld.az(var12, var10);
				}

				if (null != var2) {
					var12 = var2.an(var12, var3, 1374814161);
				}

				return var12;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lde;)V"
	)
	public void ec(String var1, de var2) {
		if (this.bx_fld == 11 && null != var1) {
			this.hi_fld = new ma();
			this.hi_fld.aq(var1, var2);
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lol;IZLlp;Lpp;Lpg;)Lfn;"
	)
	public fn dc(lw var1, ol var2, int var3, boolean var4, lp var5, pp var6, pg var7) {
		try {
			int var8;
			int var9;
			if (var4) {
				var8 = this.do_fld * -390552016;
				var9 = this.dd_fld;
			} else {
				var8 = -1732002923 * this.dm_fld;
				var9 = -243399863 * this.dq_fld;
			}

			if (0 == var8) {
				return null;
			} else if (1 == var8 && var9 == -1) {
				return null;
			} else {
				if (var7 != null && var7.ae_fld && 6 == var8) {
					var8 = 3;
				}

				long var10 = (var8 << 16) + var9;
				if (2 == var8 || 6 == var8) {
					if (var6 == null) {
						return null;
					}

					var10 = (var8 << 16) + var6.ca_fld;
				}

				if (null != var7) {
					var10 |= var7.ak_fld << 20;
				}

				fn var12 = (fn)var1.ar_fld.ak(var10);
				if (null == var12) {
					eg var13 = null;
					int var14 = -472948854;
					int var15 = 768;
					switch (var8) {
						case 1:
							var13 = eg.ak(var1.az_fld, var9, 0);
							break;
						case 2:
							var13 = var6.ay(null, -1368018730);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)118) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = var16.af(10, 1970719006);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = var6.ay(var7, -2094152470);
					}

					if (null == var13) {
						return null;
					}

					var12 = var13.bx(var14, var15, -1350575517, -10, -50);
					var1.ar_fld.az(var12, var10);
				}

				if (null != var2) {
					var12 = var2.an(var12, var3, 1374814161);
				}

				return var12;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Lyv;"
	)
	yv cr(lw var1, de var2) {
		if (!this.al(320097083)) {
			return this.af(var1, var2, (byte)0);
		} else {
			String var3 = this.ct_fld + (this.dz_fld ? 1 : 0) + (this.dt_fld ? 1 : 0) + -1186621155 * this.dh_fld + 1236978456 * this.dv_fld;
			yv var4 = (yv)(yv)var1.ax_fld.ag(var3);
			if (null == var4) {
				yv var5 = this.af(var1, var2, (byte)0);
				if (var5 != null) {
					var4 = var5.al();
					pr(this, var4, -268730796);
					var1.ax_fld.az(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setHasListener(boolean var1) {
		this.eh_fld = var1;
		return this;
	}

	@ObfuscatedName("getOnInvTransmitListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Override
	public Object[] getOnInvTransmitListener() {
		return (Object[])this.fe_fld;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setFilled(boolean var1) {
		this.cz_fld = var1;
		return this;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void is(int var1) {
		this.wj_fld = var1;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Llw;Z)Lkp;"
	)
	public kp dv(lw var1, boolean var2) {
		try {
			if (this.ch_fld == -1) {
				var2 = false;
			}

			int var3 = var2 ? this.ch_fld : this.cj_fld;
			if (-1 == var3) {
				return null;
			} else {
				long var4 = ((long)this.dv_fld << 40) + ((this.dt_fld ? 1L : 0L) << 39) + ((this.dz_fld ? 1L : 0L) << 38) + var3 + ((long)this.dh_fld << 36);
				kp var6 = (kp)var1.al_fld.ak(var4);
				if (var6 != null) {
					return var6;
				} else {
					yv var7 = ef(this, var1, var2, null, -423043034);
					if (var7 == null) {
						return null;
					} else {
						yv var8 = yv.wo(var7);
						int[] var9 = new int[var8.ay_fld];
						int[] var10 = new int[var8.ay_fld];

						for (int var11 = 0; var11 < var8.ay_fld; var11++) {
							int var12 = 0;
							int var13 = var8.aw_fld;

							for (int var14 = 0; var14 < var8.aw_fld; var14++) {
								if (0 == var8.ah_fld[var11 * var8.aw_fld + var14]) {
									var12 = var14;
									break;
								}
							}

							for (int var18 = var8.aw_fld - 1; var18 >= var12; var18--) {
								if (0 == var8.ah_fld[var18 + var11 * var8.aw_fld]) {
									var13 = var18 + 1;
									break;
								}
							}

							var9[var11] = var12;
							var10[var11] = var13 - var12;
						}

						var6 = new kp(var8.aw_fld, var8.ay_fld, var10, var9, var3);
						var1.al_fld.az(var6, var4);
						return var6;
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("setOnDragListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnDragListener(Object[] var1) {
		this.fj_fld = (Object[])var1;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lxi;)V"
	)
	public static void jv(lu var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bj_fld = false;
		var0.bx_fld = var1.cg();
		var0.bo_fld = var1.cg();
		var0.bp_fld = xi.tx(var1, 994766852) * 1974271862;
		var0.bn_fld = var1.cz();
		var0.bc_fld = var1.cz() * 2026791513;
		var0.bw_fld = xi.tx(var1, 740736679);
		var0.ba_fld = xi.tx(var1, 1468309955) * -227866188;
		var0.cb_fld = var1.cg() * 1231864795;
		var0.cv_fld = xi.tx(var1, 2073648740) * 1288719269;
		if (var0.cv_fld == 65535) {
			var0.cv_fld = -1995802935;
		} else {
			var0.cv_fld = ((var0.bf_fld & -1997328292) + var0.cv_fld) * 1336580762;
		}

		var0.gk_fld = xi.tx(var1, 1583808459) * -1318914841;
		if (var0.gk_fld == 2027538977) {
			var0.gk_fld = 26740389;
		}

		int var2 = var1.cg();
		if (var2 > 0) {
			var0.gp_fld = new int[var2];
			var0.gv_fld = new int[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				var0.gp_fld[var3] = var1.cg();
				var0.gv_fld[var3] = xi.tx(var1, 1696137390);
			}
		}

		int var7 = var1.cg();
		if (var7 > 0) {
			var0.gu_fld = new int[var7][];

			for (int var4 = 0; var4 < var7; var4++) {
				int var5 = xi.tx(var1, 730117317);
				var0.gu_fld[var4] = new int[var5];

				for (int var6 = 0; var6 < var5; var6++) {
					var0.gu_fld[var4][var6] = xi.tx(var1, 506032836);
					if (var0.gu_fld[var4][var6] == 1201234438) {
						var0.gu_fld[var4][var6] = -1;
					}
				}
			}
		}

		if (0 == var0.bx_fld) {
			var0.cr_fld = xi.tx(var1, 1951737005);
			var0.cf_fld = var1.cg() == 1;
		}

		if (1 == var0.bx_fld) {
			xi.tx(var1, 1009689863);
			var1.cg();
		}

		if (3 == var0.bx_fld) {
			var0.cz_fld = var1.cg() == 1;
		}

		if (var0.bx_fld == 4 || 1 == var0.bx_fld) {
			var0.ep_fld = var1.cg() * 962627214;
			var0.eb_fld = var1.cg() * 72253439;
			var0.es_fld = var1.cg() * 1094656221;
			var0.de_fld = xi.tx(var1, 1783227053);
			if (65535 == var0.de_fld) {
				var0.de_fld = 1883807713;
			}

			var0.ed_fld = var1.cg() == 1;
		}

		if (var0.bx_fld == 4) {
			var0.dp_fld = xi.kc(var1, -851276072);
			var0.dj_fld = xi.kc(var1, -362622819);
		}

		if (var0.bx_fld == 1 || 3 == var0.bx_fld || var0.bx_fld == 4) {
			var0.ca_fld = var1.co();
		}

		if (3 == var0.bx_fld || 4 == var0.bx_fld) {
			var0.cg_fld = var1.co() * -1431161919;
			var0.cw_fld = var1.co() * -278183800;
			var0.cm_fld = var1.co();
		}

		if (5 == var0.bx_fld) {
			var0.cj_fld = var1.co();
			var0.ch_fld = var1.co() * -395997907;
		}

		if (var0.bx_fld == 6) {
			var0.dm_fld = -1800825853;
			var0.do_fld = 571206572;
			var0.dq_fld = var1.dl(wa.ak_fld.az_fld) * -1727287075;
			var0.dd_fld = var1.dl(wa.ak_fld.az_fld) * 1259669067;
			var0.dl_fld = xi.tx(var1, 412706458) * -2035712846;
			if (65535 == var0.dl_fld) {
				var0.dl_fld = -229266474;
			}

			var0.dr_fld = xi.tx(var1, 1450336648);
			if (var0.dr_fld == 744709241) {
				var0.dr_fld = 37770411;
			}

			var0.db_fld = xi.tx(var1, 547005988);
			var0.dx_fld = xi.tx(var1, 1799140741);
			var0.ds_fld = xi.tx(var1, 1725359588);
		}

		if (var0.bx_fld == 8) {
			var0.dp_fld = xi.kc(var1, 430089749);
		}

		if (2 == var0.bo_fld) {
			var0.el_fld = xi.kc(var1, 1371489653);
			var0.gi_fld = xi.kc(var1, -749163782);
			int var8 = xi.tx(var1, 1555794515) & 178765744;
			var0.ec_fld = -394576144 * (var0.ec_fld | var8 << 11);
		}

		if (var0.bo_fld == 1 || 4 == var0.bo_fld || var0.bo_fld == 5 || var0.bo_fld == 6) {
			var0.gq_fld = xi.kc(var1, -1442016386);
			if (var0.gq_fld.isEmpty()) {
				if (1 == var0.bo_fld) {
					var0.gq_fld = kh.ab_fld;
				}

				if (4 == var0.bo_fld) {
					var0.gq_fld = kh.ap_fld;
				}

				if (5 == var0.bo_fld) {
					var0.gq_fld = kh.ap_fld;
				}

				if (6 == var0.bo_fld) {
					var0.gq_fld = kh.at_fld;
				}
			}
		}

		if (1 == var0.bo_fld || var0.bo_fld == 4 || 5 == var0.bo_fld) {
			var0.ec_fld = -950189223 * (var0.ec_fld | -331491562);
		}

		if (6 == var0.bo_fld) {
			var0.ec_fld = -427477287 * (var0.ec_fld | 1);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Llu;S)I"
	)
	public static int em(lu var0, short var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (11 == var0.bx_fld && var0.hi_fld != null && null != var0.hd_fld && !var0.hd_fld.isEmpty()) {
			String var2 = var0.hi_fld.al();
			return null != var2 && var0.hd_fld.containsKey(var0.hi_fld.al()) ? (Integer)var0.hd_fld.get(var2) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Llu;)[I"
	)
	public static int[] gf(lu var0) {
		if (var0.bx_fld == 11 && var0.hi_fld != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = var0.hi_fld.ar().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				if (!mu.mw(var4, (byte)1).equals("user_id")) {
					if (var4.ak((byte)-42) != 0) {
						return null;
					}

					var1[var2++] = var4.ag((byte)-80);
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("getOnVarTransmitListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Override
	public Object[] getOnVarTransmitListener() {
		return (Object[])this.fh_fld;
	}

	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setLineHeight(int var1) {
		this.es_fld = var1;
		return this;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	public void de(int var1, Object var2) {
		for (int var3 = 0; var3 < this.hl_fld; var3++) {
			if (this.hs_fld[var3] == var1) {
				this.hq_fld[var3] = var2;
				return;
			}
		}

		if (null == this.hq_fld) {
			this.hs_fld = new int[4];
			this.hq_fld = (Object[])(new Object[4]);
		} else if (this.hq_fld.length == this.hl_fld) {
			this.hs_fld = Arrays.copyOf(this.hs_fld, 2 * this.hs_fld.length);
			this.hq_fld = (Object[])Arrays.copyOf((Object[])this.hq_fld, this.hq_fld.length * 2);
		}

		this.hs_fld[this.hl_fld] = var1;
		this.hq_fld[this.hl_fld] = var2;
		this.hl_fld++;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Llw;Z)Lkp;"
	)
	public kp dt(lw var1, boolean var2) {
		try {
			if (this.ch_fld == -1) {
				var2 = false;
			}

			int var3 = var2 ? this.ch_fld : this.cj_fld;
			if (-1 == var3) {
				return null;
			} else {
				long var4 = ((long)this.dv_fld << 40) + ((this.dt_fld ? 1L : 0L) << 39) + ((this.dz_fld ? 1L : 0L) << 38) + var3 + ((long)this.dh_fld << 36);
				kp var6 = (kp)var1.al_fld.ak(var4);
				if (var6 != null) {
					return var6;
				} else {
					yv var7 = ef(this, var1, var2, null, -423043034);
					if (var7 == null) {
						return null;
					} else {
						yv var8 = yv.wo(var7);
						int[] var9 = new int[var8.ay_fld];
						int[] var10 = new int[var8.ay_fld];

						for (int var11 = 0; var11 < var8.ay_fld; var11++) {
							int var12 = 0;
							int var13 = var8.aw_fld;

							for (int var14 = 0; var14 < var8.aw_fld; var14++) {
								if (0 == var8.ah_fld[var11 * var8.aw_fld + var14]) {
									var12 = var14;
									break;
								}
							}

							for (int var18 = var8.aw_fld - 1; var18 >= var12; var18--) {
								if (0 == var8.ah_fld[var18 + var11 * var8.aw_fld]) {
									var13 = var18 + 1;
									break;
								}
							}

							var9[var11] = var12;
							var10[var11] = var13 - var12;
						}

						var6 = new kp(var8.aw_fld, var8.ay_fld, var10, var9, var3);
						var1.al_fld.az(var6, var4);
						return var6;
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] fp() {
		if (this.bx_fld == 11 && this.hi_fld != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.hi_fld.ar().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				if (!mu.mw(var4, (byte)1).equals("user_id")) {
					if (var4.ak((byte)9) != 0) {
						return null;
					}

					var1[var2++] = var4.ag((byte)-20);
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	public void dq(int var1, String var2) {
		if (null == this.ei_fld || this.ei_fld.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.ei_fld != null) {
				for (int var4 = 0; var4 < this.ei_fld.length; var4++) {
					var3[var4] = this.ei_fld[var4];
				}
			}

			this.ei_fld = var3;
		}

		this.ei_fld[var1] = var2;
	}

	@ObfuscatedName("setFlippedHorizontally")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setFlippedHorizontally(boolean var1) {
		this.dt_fld = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public static boolean am(lu var0) {
		return var0.dz_fld || var0.dt_fld || 0 != var0.dh_fld || var0.dv_fld != 0;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	public void do_(int var1, String var2) {
		if (null == this.ei_fld || this.ei_fld.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.ei_fld != null) {
				for (int var4 = 0; var4 < this.ei_fld.length; var4++) {
					var3[var4] = this.ei_fld[var4];
				}
			}

			this.ei_fld = var3;
		}

		this.ei_fld[var1] = var2;
	}

	@ObfuscatedName("getXPositionMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getXPositionMode() {
		return this.bt_fld;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setYTextAlignment(int var1) {
		this.eb_fld = var1;
		return this;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dl() {
		return !this.bj_fld || 0 == this.bx_fld || this.bx_fld == 11 || this.eh_fld || -1182342613 == this.bp_fld || this.bx_fld == 12;
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ei() {
		return this.hn_fld == 2;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dk() {
		return 11 == this.bx_fld || 12 == this.bx_fld;
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setModelId(int var1) {
		this.dq_fld = var1;
		return this;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)Ljava/lang/Object;"
	)
	public Object ds(int var1, Object var2) {
		for (int var3 = 0; var3 < this.hl_fld; var3++) {
			if (var1 == this.hs_fld[var3]) {
				return this.hq_fld[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("getTargetPriority")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTargetPriority() {
		return this.ek_fld;
	}

	@ObfuscatedName("getContentType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getContentType() {
		return this.bp_fld;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int db(int var1, int var2) {
		for (int var3 = 0; var3 < this.hl_fld; var3++) {
			if (this.hs_fld[var3] == var1) {
				return (Integer)this.hq_fld[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int dg(int var1, int var2) {
		for (int var3 = 0; var3 < this.hl_fld; var3++) {
			if (this.hs_fld[var3] == var1) {
				return (Integer)this.hq_fld[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int dw(int var1, int var2) {
		for (int var3 = 0; var3 < this.hl_fld; var3++) {
			if (this.hs_fld[var3] == var1) {
				return (Integer)this.hq_fld[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;Lol;IZLlp;Lpp;Lpg;)Lfn;"
	)
	public static fn vw(lu var0, lw var1, ol var2, int var3, boolean var4, lp var5, pp var6, pg var7) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var8;
			int var9;
			if (var4) {
				var8 = var0.do_fld;
				var9 = var0.dd_fld;
			} else {
				var8 = -1327120964 * var0.dm_fld;
				var9 = var0.dq_fld;
			}

			if (0 == var8) {
				return null;
			} else if (1 == var8 && var9 == -1) {
				return null;
			} else {
				if (var7 != null && var7.ae_fld && 6 == var8) {
					var8 = 3;
				}

				long var10 = (var8 << 16) + var9;
				if (2 == var8 || 6 == var8) {
					if (var6 == null) {
						return null;
					}

					var10 = (var8 << 16) + var6.ca_fld;
				}

				if (null != var7) {
					var10 |= var7.ak_fld << 20;
				}

				fn var12 = (fn)var1.ar_fld.ak(var10);
				if (null == var12) {
					eg var13 = null;
					int var14 = 64;
					int var15 = 768;
					switch (var8) {
						case 1:
							var13 = eg.ak(var1.az_fld, var9, 0);
							break;
						case 2:
							var13 = var6.ay(null, -1182492629);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)68) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = var16.af(10, -1685036559);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = var6.ay(var7, -1786042404);
					}

					if (null == var13) {
						return null;
					}

					var12 = var13.bx(var14, var15, 1082413838, -1810226375, -2111060588);
					var1.ar_fld.az(var12, var10);
				}

				if (null != var2) {
					var12 = var2.an(var12, var3, 1374814161);
				}

				return var12;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Lyv;"
	)
	yv cm(lw var1, de var2) {
		if (!this.al(1198270595)) {
			return this.af(var1, var2, (byte)0);
		} else {
			String var3 = this.ct_fld + (this.dz_fld ? 1 : 0) + (this.dt_fld ? 1 : 0) + 183253571 * this.dh_fld + 434808463 * this.dv_fld;
			yv var4 = (yv)(yv)var1.ax_fld.ag(var3);
			if (null == var4) {
				yv var5 = this.af(var1, var2, (byte)0);
				if (var5 != null) {
					var4 = var5.al();
					pr(this, var4, -135145051);
					var1.ax_fld.az(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void qw(int var1) {
		this.pv_fld = var1;
	}

	@ObfuscatedName("getWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWidth() {
		return this.bb_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.bf_fld;
	}

	@ObfuscatedName("setRelativeX")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setRelativeX(int var1) {
		this.bq_fld = var1;
	}

	public lu() {
		this.wj_fld = -1;
		this.pv_fld = -1;
		this.sw_fld = -1;
		this.wk_fld = -1;
		this.bj_fld = false;
		this.bf_fld = -190642465;
		this.by_fld = -2083432487;
		this.bo_fld = 0;
		this.bp_fld = 0;
		this.bt_fld = 0;
		this.bv_fld = 0;
		this.bi_fld = 0;
		this.bu_fld = 0;
		this.bn_fld = 0;
		this.bc_fld = 0;
		this.bw_fld = 0;
		this.ba_fld = 0;
		this.bq_fld = 0;
		this.vl(-1);
		this.bg_fld = 0;
		this.zd(-1);
		this.bb_fld = 0;
		this.cd_fld = 0;
		this.cc_fld = 1315110045;
		this.cq_fld = 1622336093;
		this.cv_fld = -1995802935;
		this.cy_fld = -1267721425;
		this.cf_fld = false;
		this.cx_fld = -218530425;
		this.cs_fld = 0;
		this.cp_fld = 0;
		this.ce_fld = 0;
		this.cn_fld = 0;
		this.cr_fld = 0;
		this.ca_fld = 0;
		this.cg_fld = 0;
		this.cw_fld = 0;
		this.cm_fld = 0;
		this.cz_fld = false;
		this.ck_fld = ym.ak_fld;
		this.cb_fld = 0;
		this.co_fld = 0;
		this.cu_fld = -2082490013;
		this.ci_fld = false;
		this.cj_fld = 1277215969;
		this.ch_fld = -759334455;
		this.cl_fld = 0;
		this.dc_fld = false;
		this.dh_fld = 0;
		this.dv_fld = 0;
		this.dm_fld = -1800825853;
		this.dq_fld = -340962923;
		this.do_fld = -1082400781;
		this.dd_fld = 1469020467;
		this.dl_fld = -968762547;
		this.dr_fld = 37770411;
		this.da_fld = 0;
		this.dk_fld = 0;
		this.dx_fld = 0;
		this.ds_fld = 0;
		this.du_fld = 0;
		this.db_fld = -1968609188;
		this.dg_fld = 0;
		this.dw_fld = 0;
		this.di_fld = false;
		this.dn_fld = false;
		this.df_fld = 216610242;
		this.de_fld = 57339867;
		this.dp_fld = "";
		this.dj_fld = "";
		this.es_fld = 0;
		this.ep_fld = 0;
		this.eb_fld = 0;
		this.ed_fld = false;
		this.ec_fld = 0;
		this.ez_fld = false;
		this.eq_fld = "";
		this.ek_fld = 413932284;
		this.ea_fld = null;
		this.ev_fld = 0;
		this.ey_fld = 0;
		this.em_fld = false;
		this.el_fld = "";
		this.eh_fld = false;
		this.gk_fld = 26740389;
		this.gi_fld = "";
		this.gq_fld = kh.ab_fld;
		this.ga_fld = -481932053;
		this.gd_fld = 0;
		this.gy_fld = 0;
		this.gz_fld = 0;
		this.gw_fld = false;
		this.gx_fld = false;
		this.gb_fld = -1564795777;
		this.gl_fld = 0;
		this.hr_fld = 0;
		this.hj_fld = 0;
		this.hb_fld = false;
		this.hf_fld = false;
		this.hh_fld = false;
		this.hn_fld = 510430013;
	}

	@ObfuscatedName("getStaticChildren")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/widgets/Widget;"
	)
	@Override
	public Widget[] getStaticChildren() {
		if (this.by_fld > -1) {
			return new Widget[0];
		} else {
			ArrayList var1 = new ArrayList();

			for (lu var5 : og.ci_fld.tg(WidgetUtil.componentToInterface(this.bf_fld))) {
				if (var5 != null && var5.cv_fld == this.bf_fld) {
					var1.add(var5);
				}
			}

			return (Widget[])(Widget[])var1.toArray(new lu[0]);
		}
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getName() {
		return this.qz().replace(' ', ' ');
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Llw;I)V"
	)
	void bp(lw var1, int var2) {
		this.hb_fld = true;
		ArrayList var3 = this.hi_fld.as();
		ArrayList var4 = ma.ck(this.hi_fld, 1083306836);
		int var5 = var3.size() + var4.size();
		this.ge_fld = new lu[var5];
		int var6 = 0;
		Iterator var7 = var3.iterator();

		while (var7.hasNext()) {
			lq var8 = (lq)(lq)var7.next();
			lu var9 = is.ak(5, this, var6, 0, 0, 0, 0, var8.ag_fld);
			var9.ct_fld = var8.ak_fld.az();
			kb var10 = new kb(var8.ak_fld);
			var1.au_fld.az(var9.ct_fld, var10);
			this.ge_fld[var6++] = var9;
		}

		var7 = var4.iterator();

		while (var7.hasNext()) {
			mr var12 = (mr)(mr)var7.next();
			lu var13 = is.ak(4, this, var6, 0, 0, 0, 0, var12.ae_fld);
			var13.dp_fld = var12.av_fld;
			var13.de_fld = (Integer)this.he_fld.get(var12.ay_fld);
			var13.ep_fld = var12.ah_fld * 224036757;
			var13.eb_fld = 992230371 * var12.aw_fld;
			this.ge_fld[var6++] = var13;
		}
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasLocation() {
		return new Point(this.wj_fld, this.pv_fld);
	}

	@ObfuscatedName("getRotationX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRotationX() {
		return this.dx_fld;
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Llu;)[I"
	)
	public static int[] mk(lu var0) {
		if (var0.bx_fld == 11 && var0.hi_fld != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = var0.hi_fld.ar().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				if (!mu.mw(var4, (byte)1).equals("user_id")) {
					if (var4.ak((byte)50) != 0) {
						return null;
					}

					var1[var2++] = var4.ag((byte)-97);
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	public void df(int var1, Object var2) {
		for (int var3 = 0; var3 < this.hl_fld; var3++) {
			if (this.hs_fld[var3] == var1) {
				this.hq_fld[var3] = var2;
				return;
			}
		}

		if (null == this.hq_fld) {
			this.hs_fld = new int[4];
			this.hq_fld = (Object[])(new Object[4]);
		} else if (this.hq_fld.length == this.hl_fld) {
			this.hs_fld = Arrays.copyOf(this.hs_fld, 2 * this.hs_fld.length);
			this.hq_fld = (Object[])Arrays.copyOf((Object[])this.hq_fld, this.hq_fld.length * 2);
		}

		this.hs_fld[this.hl_fld] = var1;
		this.hq_fld[this.hl_fld] = var2;
		this.hl_fld++;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dr() {
		return !this.bj_fld || 0 == this.bx_fld || this.bx_fld == 11 || this.eh_fld || 691281195 == this.bp_fld || this.bx_fld == 12;
	}

	@ObfuscatedName("getText")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getText() {
		return this.gu().replace(' ', ' ');
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	public void dp(int var1, Object var2) {
		for (int var3 = 0; var3 < this.hl_fld; var3++) {
			if (this.hs_fld[var3] == var1) {
				this.hq_fld[var3] = var2;
				return;
			}
		}

		if (null == this.hq_fld) {
			this.hs_fld = new int[4];
			this.hq_fld = (Object[])(new Object[4]);
		} else if (this.hq_fld.length == this.hl_fld) {
			this.hs_fld = Arrays.copyOf(this.hs_fld, 2 * this.hs_fld.length);
			this.hq_fld = (Object[])Arrays.copyOf((Object[])this.hq_fld, this.hq_fld.length * 2);
		}

		this.hs_fld[this.hl_fld] = var1;
		this.hq_fld[this.hl_fld] = var2;
		this.hl_fld++;
	}

	@ObfuscatedName("getModelType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getModelType() {
		return this.dm_fld;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	public void dj(int var1, Object var2) {
		for (int var3 = 0; var3 < this.hl_fld; var3++) {
			if (this.hs_fld[var3] == var1) {
				this.hq_fld[var3] = var2;
				return;
			}
		}

		if (null == this.hq_fld) {
			this.hs_fld = new int[4];
			this.hq_fld = (Object[])(new Object[4]);
		} else if (this.hq_fld.length == this.hl_fld) {
			this.hs_fld = Arrays.copyOf(this.hs_fld, 2 * this.hs_fld.length);
			this.hq_fld = (Object[])Arrays.copyOf((Object[])this.hq_fld, this.hq_fld.length * 2);
		}

		this.hs_fld[this.hl_fld] = var1;
		this.hq_fld[this.hl_fld] = var2;
		this.hl_fld++;
	}

	@ObfuscatedName("getNoClickThrough")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean getNoClickThrough() {
		return this.hb_fld;
	}

	@ObfuscatedName("getType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getType() {
		return this.bx_fld;
	}

	@ObfuscatedName("setOnDragCompleteListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnDragCompleteListener(Object[] var1) {
		this.fb_fld = (Object[])var1;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lde;)V"
	)
	public void eo(String var1, de var2) {
		if (this.bx_fld == 11 && null != var1) {
			this.hi_fld = new ma();
			this.hi_fld.aq(var1, var2);
		}
	}

	@ObfuscatedName("isFlippedHorizontally")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isFlippedHorizontally() {
		return this.dt_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z"
	)
	public boolean be(int var1, int var2, int var3, int var4, int var5) {
		if (this.bx_fld == 11 && this.hi_fld != null && qz(this, 993637541)) {
			var1 -= var3;
			var2 -= var4;
			int var6 = (int)(ma.ao(this.hi_fld, (short)22093)[0] * this.bb_fld);
			int var7 = (int)(ma.ao(this.hi_fld, (short)10739)[1] * this.cd_fld);
			int var8 = var6 + (int)(ma.ao(this.hi_fld, (short)23579)[2] * this.bb_fld);
			int var9 = var7 + (int)(ma.ao(this.hi_fld, (short)13148)[3] * this.cd_fld);
			return var1 >= var6 && var2 >= var7 && var1 < var8 && var2 < var9;
		} else {
			return false;
		}
	}

	@ObfuscatedName("setHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setHeight(int var1) {
		this.cd_fld = var1;
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setScrollX(int var1) {
		this.cp_fld = var1;
		return this;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ez() {
		this.he_fld = new HashMap();
		this.hd_fld = new HashMap();
	}

	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "(Llu;ILjava/lang/String;)V"
	)
	public static void vc(lu var0, int var1, String var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null == var0.ei_fld || var0.ei_fld.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (var0.ei_fld != null) {
				for (int var4 = 0; var4 < var0.ei_fld.length; var4++) {
					var3[var4] = var0.ei_fld[var4];
				}
			}

			var0.ei_fld = var3;
		}

		var0.ei_fld[var1] = var2;
	}

	@ObfuscatedName("getOnLoadListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Override
	public Object[] getOnLoadListener() {
		return (Object[])this.eu_fld;
	}

	@ObfuscatedName("isIf3")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isIf3() {
		return this.bj_fld;
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(Llw;Z)Lkp;"
	)
	public kp zu(lw var1, boolean var2) {
		try {
			return this.aa(var1, var2, 15790320);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void er() {
		this.he_fld = new HashMap();
		this.hd_fld = new HashMap();
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Z"
	)
	public boolean gc(lw var1) {
		try {
			li var2 = bv(this, -1147767225);
			if (var2 == null) {
				return false;
			} else {
				boolean var3 = false;
				if (!var2.cq() && this.de_fld != -1) {
					int var4 = var2.cv();
					int var5 = var2.cy();
					int var6 = var2.cc();
					int var7 = li.dg(var2, (byte)6);
					zf var8 = dg(this, var1, (byte)11);
					if (null != var8) {
						var3 |= var2.ah(var8);
						var3 |= this.bc(var2, 55221958);
						var3 |= var2.al(var4, var5);
						var3 |= li.ik(var2, var6, var7, (byte)-107);
					}
				} else if (var2.cq()) {
					var3 |= this.bc(var2, 55221958);
				}

				li.jd(var2, 261216131);
				return var3;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public String eh(String var1) {
		return this.bx_fld == 11 && null != this.hi_fld && qz(this, 1249132947) ? this.hi_fld.ay(var1) : null;
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Z"
	)
	public static boolean qz(lu var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.hn_fld == 2;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	public int[] bl(int var1) {
		if (this.bx_fld == 11 && this.hi_fld != null) {
			int[] var2 = new int[3];
			int var3 = 0;
			Iterator var4 = this.hi_fld.ar().iterator();

			while (var4.hasNext()) {
				mu var5 = (mu)(mu)var4.next();
				if (!mu.mw(var5, (byte)1).equals("user_id")) {
					if (var5.ak((byte)-61) != 0) {
						return null;
					}

					var2[var3++] = var5.ag((byte)-120);
					if (var3 > 3) {
						return null;
					}
				}
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean ef(int var1, int var2, int var3, int var4) {
		if (this.bx_fld == 11 && this.hi_fld != null && qz(this, 409790418)) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(ma.ao(this.hi_fld, (short)10802)[0] * this.bb_fld);
			int var6 = (int)(ma.ao(this.hi_fld, (short)21841)[1] * this.cd_fld);
			int var7 = var5 + (int)(ma.ao(this.hi_fld, (short)21634)[2] * this.bb_fld);
			int var8 = var6 + (int)(ma.ao(this.hi_fld, (short)14129)[3] * this.cd_fld);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("getOriginalX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOriginalX() {
		return this.bn_fld;
	}

	@ObfuscatedName("getYTextAlignment")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getYTextAlignment() {
		return this.eb_fld;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setRotationZ(int var1) {
		this.ds_fld = var1;
		return this;
	}

	@ObfuscatedName("getLineHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getLineHeight() {
		return this.es_fld;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setHidden(boolean var1) {
		this.cf_fld = var1;
		return this;
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "()Lzv;"
	)
	public zv getFont() {
		try {
			return this.xg(cf.cg_fld);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ee() {
		return this.hn_fld == 2;
	}

	@ObfuscatedName("isHidden")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isHidden() {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else if (this.isSelfHidden()) {
			return true;
		} else {
			Widget var1 = this.getParent();
			if (var1 == null) {
				if (WidgetUtil.componentToInterface(this.getId()) != og.ci_fld.getTopLevelInterfaceId()) {
					return true;
				}
			} else if (var1.isHidden()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fy() {
		return this.hd_fld != null && !this.hd_fld.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("getSpriteId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSpriteId() {
		return this.cj_fld;
	}

	@ObfuscatedName("getBounds")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Rectangle;"
	)
	@Override
	public Rectangle getBounds() {
		return new Rectangle(this.wj_fld, this.pv_fld, this.getWidth(), this.getHeight());
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ea() {
		return this.hn_fld == 2;
	}

	@ObfuscatedName("getTextColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTextColor() {
		return this.ca_fld;
	}

	@ObfuscatedName("setTargetPriority")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setTargetPriority(int var1) {
		this.ek_fld = var1;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int ev(String var1) {
		return 11 == this.bx_fld && this.hi_fld != null && qz(this, 1548761245) ? this.hi_fld.aw(var1) : -1;
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int ey(String var1) {
		return 11 == this.bx_fld && this.hi_fld != null && qz(this, 1403256113) ? this.hi_fld.aw(var1) : -1;
	}

	@ObfuscatedName("setDragDeadZone")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setDragDeadZone(int var1) {
		this.ev_fld = var1;
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void pf(boolean var1) {
		this.bj_fld = var1;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setItemId(int var1) {
		this.ga_fld = var1;
		return this;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int em(String var1) {
		return 11 == this.bx_fld && this.hi_fld != null && qz(this, 2080050142) ? this.hi_fld.aw(var1) : -1;
	}

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setHeightMode(int var1) {
		this.bu_fld = var1;
		return this;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public String el(String var1) {
		return this.bx_fld == 11 && null != this.hi_fld && qz(this, 1465243715) ? this.hi_fld.ay(var1) : null;
	}

	@ObfuscatedName("getClickMask")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getClickMask() {
		return this.ec_fld;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean eq(int var1, int var2, int var3, int var4) {
		if (this.bx_fld == 11 && this.hi_fld != null && qz(this, 1700161566)) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(ma.ao(this.hi_fld, (short)31660)[0] * this.bb_fld);
			int var6 = (int)(ma.ao(this.hi_fld, (short)16704)[1] * this.cd_fld);
			int var7 = var5 + (int)(ma.ao(this.hi_fld, (short)28705)[2] * this.bb_fld);
			int var8 = var6 + (int)(ma.ao(this.hi_fld, (short)28073)[3] * this.cd_fld);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("getRelativeY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRelativeY() {
		return this.bg_fld;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eu() {
		return this.hd_fld != null && !this.hd_fld.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("getDragParent")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/widgets/Widget;"
	)
	@Override
	public Widget getDragParent() {
		return this.ea_fld;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Z"
	)
	public boolean ff(lw var1) {
		try {
			li var2 = bv(this, -1205306763);
			if (var2 == null) {
				return false;
			} else {
				boolean var3 = false;
				if (!var2.cq() && this.de_fld != -1) {
					int var4 = var2.cv();
					int var5 = var2.cy();
					int var6 = var2.cc();
					int var7 = li.dg(var2, (byte)-64);
					zf var8 = dg(this, var1, (byte)-2);
					if (null != var8) {
						var3 |= var2.ah(var8);
						var3 |= this.bc(var2, 55221958);
						var3 |= var2.al(var4, var5);
						var3 |= li.ik(var2, var6, var7, (byte)-118);
					}
				} else if (var2.cq()) {
					var3 |= this.bc(var2, 55221958);
				}

				li.jd(var2, 261216131);
				return var3;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOriginalWidth(int var1) {
		this.bw_fld = var1;
		return this;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String fo() {
		if (11 == this.bx_fld && null != this.hi_fld) {
			String var1 = this.hi_fld.al();
			Iterator var2 = this.hi_fld.ar().iterator();

			while (var2.hasNext()) {
				mu var3 = (mu)(mu)var2.next();
				String var4 = String.format("%%%S%%", (Object[])(new Object[]{mu.mw(var3, (byte)1)}));
				if (var3.ak((byte)39) == 0) {
					var1.replaceAll(var4, Integer.toString(var3.ag((byte)-108)));
				} else {
					var1.replaceAll(var4, var3.ah(-1876249062));
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lde;J)V"
	)
	public void ep(String var1, String var2, de var3, long var4) {
		if (this.bx_fld == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.hi_fld = new ma();
			if (!this.hi_fld.ag(var1, var2, var3)) {
				this.hi_fld = null;
			} else {
				if (this.he_fld == null || null == this.hd_fld) {
					this.bd(-1435034261);
				}
			}
		}
	}

	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;Ljava/lang/String;Lde;J)V"
	)
	public static void vc(lu var0, String var1, String var2, de var3, long var4) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.bx_fld == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			var0.hi_fld = new ma();
			if (!var0.hi_fld.ag(var1, var2, var3)) {
				var0.hi_fld = null;
			} else {
				if (var0.he_fld == null || null == var0.hd_fld) {
					var0.bd(-1190035852);
				}
			}
		}
	}

	@ObfuscatedName("setForcedPosition")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public void setForcedPosition(int var1, int var2) {
		this.sw_fld = (short)var1;
		this.wk_fld = (short)var2;
		this.setRelativeX(var1);
		this.setRelativeY(var2);
	}

	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setSpriteId(int var1) {
		this.cj_fld = var1;
		return this;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] fx() {
		if (this.bx_fld == 11 && this.hi_fld != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.hi_fld.ar().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				if (!mu.mw(var4, (byte)1).equals("user_id")) {
					if (var4.ak((byte)-71) != 0) {
						return null;
					}

					var1[var2++] = var4.ag((byte)-35);
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("getHeightMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHeightMode() {
		return this.bu_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;B)Z"
	)
	public boolean bo(lw var1, de var2, byte var3) {
		if (11 == this.bx_fld && null != this.hi_fld) {
			this.hi_fld.av(var2);
			if (ma.wj(this.hi_fld, (byte)-30) != this.hn_fld) {
				this.hn_fld = ma.wj(this.hi_fld, (byte)-30);
				if (this.hn_fld >= 3) {
					return true;
				}

				if (2 == this.hn_fld) {
					this.bp(var1, -511255598);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "()Lsc;"
	)
	public sc fs() {
		return this.hk_fld != null ? this.hk_fld.az_fld : null;
	}

	@ObfuscatedName("getDragDeadZone")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getDragDeadZone() {
		return this.ev_fld;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(II)Llu;"
	)
	public lu setPos(int var1, int var2) {
		return this.setOriginalX(var1).setOriginalY(var2);
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Z"
	)
	public static boolean qh(lu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return !var0.bj_fld || 0 == var0.bx_fld || var0.bx_fld == 11 || var0.eh_fld || 1338 == var0.bp_fld || var0.bx_fld == 12;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setXTextAlignment(int var1) {
		this.ep_fld = var1;
		return this;
	}

	@ObfuscatedName("getNoScrollThrough")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean getNoScrollThrough() {
		return this.hf_fld;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Z"
	)
	public boolean fc(lw var1, de var2) {
		if (11 == this.bx_fld && null != this.hi_fld) {
			this.hi_fld.av(var2);
			if (ma.wj(this.hi_fld, (byte)-30) != this.hn_fld) {
				this.hn_fld = ma.wj(this.hi_fld, (byte)-30);
				if (this.hn_fld >= 3) {
					return true;
				}

				if (2 == this.hn_fld) {
					this.bp(var1, -2123632286);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("setOnHoldListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnHoldListener(Object[] var1) {
		this.fo_fld = (Object[])var1;
	}

	@ObfuscatedName("setOnOpListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnOpListener(Object[] var1) {
		this.ft_fld = (Object[])var1;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Z"
	)
	public boolean fh(lw var1, de var2) {
		if (11 == this.bx_fld && null != this.hi_fld) {
			this.hi_fld.av(var2);
			if (ma.wj(this.hi_fld, (byte)-30) != this.hn_fld) {
				this.hn_fld = ma.wj(this.hi_fld, (byte)-30);
				if (this.hn_fld >= 3) {
					return true;
				}

				if (2 == this.hn_fld) {
					this.bp(var1, 41796530);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Llw;)V"
	)
	void fm(lw var1) {
		this.hb_fld = true;
		ArrayList var2 = this.hi_fld.as();
		ArrayList var3 = ma.ck(this.hi_fld, -314008139);
		int var4 = var2.size() + var3.size();
		this.ge_fld = new lu[var4];
		int var5 = 0;
		Iterator var6 = var2.iterator();

		while (var6.hasNext()) {
			lq var7 = (lq)(lq)var6.next();
			lu var8 = is.ak(5, this, var5, 0, 0, 0, 0, var7.ag_fld);
			var8.ct_fld = var7.ak_fld.az();
			kb var9 = new kb(var7.ak_fld);
			var1.au_fld.az(var8.ct_fld, var9);
			this.ge_fld[var5++] = var8;
		}

		var6 = var3.iterator();

		while (var6.hasNext()) {
			mr var11 = (mr)(mr)var6.next();
			lu var12 = is.ak(4, this, var5, 0, 0, 0, 0, var11.ae_fld);
			var12.dp_fld = var11.av_fld;
			var12.de_fld = (Integer)this.he_fld.get(var11.ay_fld);
			var12.ep_fld = var11.ah_fld * 224036757;
			var12.eb_fld = 992230371 * var11.aw_fld;
			this.ge_fld[var5++] = var12;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	static String as(int var0) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + db.ag_fld + var2.substring(var3);
		}

		if (var2.length() > 9) {
			return " " + gd.ag(65408, -1940547058) + var2.substring(0, var2.length() - 8) + kh.hl_fld + " " + db.av_fld + var2 + db.ae_fld + db.ay_fld;
		} else {
			return var2.length() > 6
				? " " + gd.ag(16777215, -1940547058) + var2.substring(0, var2.length() - 4) + kh.hw_fld + " " + db.av_fld + var2 + db.ae_fld + db.ay_fld
				: " " + gd.ag(16776960, -1940547058) + var2 + db.ay_fld;
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fl() {
		this.hk_fld = new ld();

		for (int var1 = 1; var1 <= 12; var1++) {
			this.hk_fld.az_fld.ak(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; var2++) {
			this.hk_fld.az_fld.ag(var2, 0);
		}

		this.hk_fld.az_fld.ag('\u0080', 0);
		this.hk_fld.az_fld.ak(82, 2);
		this.hk_fld.az_fld.ak(81, 2);
		this.hk_fld.az_fld.ak(86, 2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;I)Lyv;"
	)
	yv ar(lw var1, de var2, int var3) {
		if (!this.al(-978031646)) {
			return this.af(var1, var2, (byte)0);
		} else {
			String var4 = this.ct_fld + (this.dz_fld ? 1 : 0) + (this.dt_fld ? 1 : 0) + this.dh_fld + this.dv_fld;
			yv var5 = (yv)(yv)var1.ax_fld.ag(var4);
			if (null == var5) {
				yv var6 = this.af(var1, var2, (byte)0);
				if (var6 != null) {
					var5 = var6.al();
					pr(this, var5, -144005898);
					var1.ax_fld.az(var4, var5);
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("getVarTransmitTrigger")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getVarTransmitTrigger() {
		return this.fm_fld;
	}

	@ObfuscatedName("isSelfHidden")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isSelfHidden() {
		return this.cf_fld;
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "()Lli;"
	)
	public li fn() {
		return this.hk_fld != null ? this.hk_fld.ak_fld : null;
	}

	@ObfuscatedName("isFlippedVertically")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isFlippedVertically() {
		return this.dz_fld;
	}

	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;)V"
	)
	public static void sh(lu var0, lw var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.hb_fld = true;
				ArrayList var2 = var0.hi_fld.as();
				ArrayList var3 = ma.ck(var0.hi_fld, 1531828534);
				int var4 = var2.size() + var3.size();
				var0.ge_fld = new lu[var4];
				int var5 = 0;
				Iterator var6 = var2.iterator();

				while (var6.hasNext()) {
					lq var7 = (lq)(lq)var6.next();
					lu var8 = is.ak(5, var0, var5, 0, 0, 0, 0, var7.ag_fld);
					var8.ct_fld = var7.ak_fld.az();
					kb var9 = new kb(var7.ak_fld);
					var1.au_fld.az(var8.ct_fld, var9);
					var0.ge_fld[var5++] = var8;
				}

				var6 = var3.iterator();

				while (var6.hasNext()) {
					mr var13 = (mr)(mr)var6.next();
					lu var14 = is.ak(4, var0, var5, 0, 0, 0, 0, var13.ae_fld);
					var14.dp_fld = var13.av_fld;
					var14.de_fld = (Integer)var0.he_fld.get(var13.ay_fld);
					var14.ep_fld = var13.ah_fld * 224036757;
					var14.eb_fld = 992230371 * var13.aw_fld;
					var0.ge_fld[var5++] = var14;
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lma;"
	)
	public static ma nz(lu var0) {
		return var0.hi_fld;
	}

	@ObfuscatedName("getChild")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/widgets/Widget;"
	)
	@Override
	public Widget getChild(int var1) {
		lu[] var2 = this.getChildren();
		return var2 != null && var1 >= 0 && var1 < var2.length ? var2[var1] : null;
	}

	@ObfuscatedName("setOnMouseLeaveListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnMouseLeaveListener(Object[] var1) {
		this.fv_fld = (Object[])var1;
	}

	@ObfuscatedName("getBorderType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBorderType() {
		return this.dh_fld;
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "()Lli;"
	)
	public li ft() {
		return this.hk_fld != null ? this.hk_fld.ak_fld : null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/lang/String;"
	)
	public String bk(String var1, short var2) {
		return this.bx_fld == 11 && null != this.hi_fld && qz(this, 1000795609) ? this.hi_fld.ay(var1) : null;
	}

	@ObfuscatedName("getParentId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getParentId() {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			int var1 = this.cv_fld;
			if (var1 != -1) {
				return var1;
			} else {
				int var2 = this.getId();
				if (WidgetUtil.componentToInterface(var2) == og.ci_fld.getTopLevelInterfaceId()) {
					return -1;
				} else {
					int var3 = this.nn_fld;
					if (var3 != -1) {
						pk var4 = (pk)cf.cg_fld.ai_fld.get(var3);
						if (var4 != null && var4.getId() == WidgetUtil.componentToInterface(var2)) {
							return var3;
						}

						this.nn_fld = -1;
					}

					int var8 = WidgetUtil.componentToInterface(this.getId());
					xz var5 = og.ci_fld.getComponentTable();
					Iterator var6 = var5.iterator();

					while (var6.hasNext()) {
						pk var7 = (pk)(pk)var6.next();
						if (var8 == var7.getId()) {
							return (int)var7.getHash();
						}
					}

					return -1;
				}
			}
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setModelType(int var1) {
		this.dm_fld = var1;
		return this;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "()Lln;"
	)
	public ln fq() {
		return this.hk_fld != null ? this.hk_fld.ag_fld : null;
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "()Lsc;"
	)
	public sc fu() {
		return this.hk_fld != null ? this.hk_fld.az_fld : null;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "()Lsc;"
	)
	public sc fr() {
		return this.hk_fld != null ? this.hk_fld.az_fld : null;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "()Lld;"
	)
	public ld fi() {
		return this.hk_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cq(xi var1) {
		this.bj_fld = false;
		this.bx_fld = var1.cg();
		this.bo_fld = var1.cg() * -353273877;
		this.bp_fld = xi.tx(var1, 453733182) * -373959816;
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz();
		this.bw_fld = xi.tx(var1, 482347163) * -803187643;
		this.ba_fld = xi.tx(var1, 890079319) * -1723821249;
		this.cb_fld = var1.cg();
		this.cv_fld = xi.tx(var1, 359947017);
		if (this.cv_fld == 65535) {
			this.cv_fld = -429499679;
		} else {
			this.cv_fld = ((this.bf_fld & -336334651) + this.cv_fld) * 450079110;
		}

		this.gk_fld = xi.tx(var1, 1771581780);
		if (this.gk_fld == -274481432) {
			this.gk_fld = 1643570708;
		}

		int var2 = var1.cg();
		if (var2 > 0) {
			this.gp_fld = new int[var2];
			this.gv_fld = new int[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				this.gp_fld[var3] = var1.cg();
				this.gv_fld[var3] = xi.tx(var1, 1188750021);
			}
		}

		int var7 = var1.cg();
		if (var7 > 0) {
			this.gu_fld = new int[var7][];

			for (int var4 = 0; var4 < var7; var4++) {
				int var5 = xi.tx(var1, 1918276345);
				this.gu_fld[var4] = new int[var5];

				for (int var6 = 0; var6 < var5; var6++) {
					this.gu_fld[var4][var6] = xi.tx(var1, 1490562364);
					if (this.gu_fld[var4][var6] == 65535) {
						this.gu_fld[var4][var6] = -1;
					}
				}
			}
		}

		if (0 == this.bx_fld) {
			this.cr_fld = xi.tx(var1, 1772732351) * -1842719791;
			this.cf_fld = var1.cg() == 1;
		}

		if (1 == this.bx_fld) {
			xi.tx(var1, 1368320939);
			var1.cg();
		}

		if (3 == this.bx_fld) {
			this.cz_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4 || 1 == this.bx_fld) {
			this.ep_fld = var1.cg();
			this.eb_fld = var1.cg() * -567204055;
			this.es_fld = var1.cg() * 103930364;
			this.de_fld = xi.tx(var1, 636216451) * 1133677321;
			if (1719725822 == this.de_fld) {
				this.de_fld = 57339867;
			}

			this.ed_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4) {
			this.dp_fld = xi.kc(var1, 815637553);
			this.dj_fld = xi.kc(var1, 1671682000);
		}

		if (this.bx_fld == 1 || 3 == this.bx_fld || this.bx_fld == 4) {
			this.ca_fld = var1.co() * -1943764605;
		}

		if (3 == this.bx_fld || 4 == this.bx_fld) {
			this.cg_fld = var1.co() * 966531967;
			this.cw_fld = var1.co();
			this.cm_fld = var1.co();
		}

		if (5 == this.bx_fld) {
			this.cj_fld = var1.co() * -1730676206;
			this.ch_fld = var1.co();
		}

		if (this.bx_fld == 6) {
			this.dm_fld = 1445345206;
			this.do_fld = -1082400781;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld);
			this.dd_fld = var1.dl(wa.ak_fld.az_fld) * 1629857022;
			this.dl_fld = xi.tx(var1, 1119443570);
			if (862202823 == this.dl_fld) {
				this.dl_fld = -968762547;
			}

			this.dr_fld = xi.tx(var1, 1954801653);
			if (this.dr_fld == 65535) {
				this.dr_fld = -1475529628;
			}

			this.db_fld = xi.tx(var1, 1968539659);
			this.dx_fld = xi.tx(var1, 1324032206) * -1407212792;
			this.ds_fld = xi.tx(var1, 1200923458);
		}

		if (this.bx_fld == 8) {
			this.dp_fld = xi.kc(var1, 2110443202);
		}

		if (2 == this.bo_fld) {
			this.el_fld = xi.kc(var1, -1521167236);
			this.gi_fld = xi.kc(var1, -1664600108);
			int var8 = xi.tx(var1, 1082820609) & 1030340648;
			this.ec_fld = -150017922 * (this.ec_fld | var8 << 11);
		}

		if (this.bo_fld == 1 || 4 == this.bo_fld || this.bo_fld == 5 || this.bo_fld == 6) {
			this.gq_fld = xi.kc(var1, 2052085867);
			if (this.gq_fld.isEmpty()) {
				if (1 == this.bo_fld) {
					this.gq_fld = kh.ab_fld;
				}

				if (4 == this.bo_fld) {
					this.gq_fld = kh.ap_fld;
				}

				if (5 == this.bo_fld) {
					this.gq_fld = kh.ap_fld;
				}

				if (6 == this.bo_fld) {
					this.gq_fld = kh.at_fld;
				}
			}
		}

		if (1 == this.bo_fld || this.bo_fld == 4 || 5 == this.bo_fld) {
			this.ec_fld = 1577281889 * (this.ec_fld | 4194304);
		}

		if (6 == this.bo_fld) {
			this.ec_fld = 981510457 * (this.ec_fld | 1);
		}
	}

	@ObfuscatedName("revalidate")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void revalidate() {
		try {
			if (!og.ci_fld.isClientThread()) {
				if (!tf.$assertionsDisabled) {
					throw new AssertionError("must be called on client thread");
				} else {
					throw new IllegalStateException("must be called on client thread");
				}
			} else {
				client.wo(this, pf.qw_fld, bc.qx_fld, cf.cg_fld, client.cz_fld);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getScrollWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getScrollWidth() {
		return this.cn_fld;
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Z"
	)
	public boolean gg(lw var1) {
		try {
			li var2 = bv(this, -1810286143);
			if (var2 == null) {
				return false;
			} else {
				boolean var3 = false;
				if (!var2.cq() && this.de_fld != -1) {
					int var4 = var2.cv();
					int var5 = var2.cy();
					int var6 = var2.cc();
					int var7 = li.dg(var2, (byte)-28);
					zf var8 = dg(this, var1, (byte)-18);
					if (null != var8) {
						var3 |= var2.ah(var8);
						var3 |= this.bc(var2, 55221958);
						var3 |= var2.al(var4, var5);
						var3 |= li.ik(var2, var6, var7, (byte)-94);
					}
				} else if (var2.cq()) {
					var3 |= this.bc(var2, 55221958);
				}

				li.jd(var2, 261216131);
				return var3;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setItemQuantityMode(int var1) {
		this.df_fld = var1;
		return this;
	}

	@ObfuscatedName("setOnTimerListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnTimerListener(Object[] var1) {
		this.fn_fld = (Object[])var1;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dx() {
		return 11 == this.bx_fld || 12 == this.bx_fld;
	}

	@ObfuscatedName("getActions")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Override
	public String[] getActions() {
		return this.ei_fld;
	}

	@ObfuscatedName("getRelativeX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRelativeX() {
		return this.bq_fld;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Z"
	)
	public boolean go(lw var1) {
		try {
			li var2 = bv(this, -678495960);
			if (var2 == null) {
				return false;
			} else {
				boolean var3 = false;
				if (!var2.cq() && this.de_fld != -1) {
					int var4 = var2.cv();
					int var5 = var2.cy();
					int var6 = var2.cc();
					int var7 = li.dg(var2, (byte)-33);
					zf var8 = dg(this, var1, (byte)-30);
					if (null != var8) {
						var3 |= var2.ah(var8);
						var3 |= this.bc(var2, 55221958);
						var3 |= var2.al(var4, var5);
						var3 |= li.ik(var2, var6, var7, (byte)-13);
					}
				} else if (var2.cq()) {
					var3 |= this.bc(var2, 55221958);
				}

				li.jd(var2, 261216131);
				return var3;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Llu;"
	)
	public lu setSize(int var1, int var2, int var3, int var4) {
		return this.setOriginalWidth(var1).setOriginalHeight(var2).setWidthMode(var3).setHeightMode(var4);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;ZLde;)Lyv;"
	)
	public static yv dm(lu var0, lw var1, boolean var2, de var3) throws EOFException {
		try {
			if (null != var0.ct_fld) {
				yv var4 = var0.ar(var1, var3, 521764807);
				if (var4 != null) {
					return var4;
				}
			}

			int var10;
			if (var2) {
				var10 = var0.ch_fld;
			} else {
				var10 = var0.cj_fld;
			}

			if (var10 == -1) {
				return null;
			} else {
				long var5 = ((var0.dz_fld ? 1L : 0L) << 38) + ((long)var0.dh_fld << 36) + var10 + ((var0.dt_fld ? 1L : 0L) << 39) + ((long)var0.dv_fld << 40);
				yv var7 = (yv)var1.as_fld.ak(var5);
				if (var7 != null) {
					return var7;
				} else {
					var7 = wf.av(var1.av_fld, var10, 0);
					if (null == var7) {
						return null;
					} else {
						pr(var0, var7, -1856571655);
						var1.as_fld.az(var7, var5);
						return var7;
					}
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("setVarTransmitTrigger")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	@Override
	public void setVarTransmitTrigger(int[] var1) {
		this.fm_fld = var1;
	}

	@ObfuscatedName("getModelZoom")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getModelZoom() {
		return this.db_fld;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Llp;Z)V"
	)
	public void gn(lp var1, boolean var2) {
		try {
			this.dm_fld = 279120917;
			this.dy_fld = new lp(var1);
			if (!var2) {
				this.dy_fld.af_fld = Arrays.copyOf(this.dy_fld.ar_fld, this.dy_fld.ar_fld.length);
				this.dy_fld.au((short)-9684);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Llu;ILjava/lang/Object;)V"
	)
	public static void it(lu var0, int var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var3 = 0; var3 < var0.hl_fld; var3++) {
			if (var0.hs_fld[var3] == var1) {
				var0.hq_fld[var3] = var2;
				return;
			}
		}

		if (null == var0.hq_fld) {
			var0.hs_fld = new int[4];
			var0.hq_fld = (Object[])(new Object[4]);
		} else if (var0.hq_fld.length == var0.hl_fld) {
			var0.hs_fld = Arrays.copyOf(var0.hs_fld, 2 * var0.hs_fld.length);
			var0.hq_fld = (Object[])Arrays.copyOf((Object[])var0.hq_fld, var0.hq_fld.length * 2);
		}

		var0.hs_fld[var0.hl_fld * -379722129] = var1;
		var0.hq_fld[var0.hl_fld] = var2;
		var0.hl_fld += 344559068;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Llp;Z)V"
	)
	public void gh(lp var1, boolean var2) {
		try {
			this.dm_fld = 279120917;
			this.dy_fld = new lp(var1);
			if (!var2) {
				this.dy_fld.af_fld = Arrays.copyOf(this.dy_fld.ar_fld, this.dy_fld.ar_fld.length);
				this.dy_fld.au((short)24638);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lxi;)V"
	)
	public static void rr(lu var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.cg();
		var0.bj_fld = true;
		var0.bx_fld = var1.cg();
		var0.bp_fld = xi.tx(var1, 943999986);
		var0.bn_fld = var1.cz();
		var0.bc_fld = var1.cz();
		var0.bw_fld = xi.tx(var1, 1741125963);
		if (9 == var0.bx_fld) {
			var0.ba_fld = var1.cz();
		} else {
			var0.ba_fld = xi.tx(var1, 2116358042);
		}

		var0.bi_fld = xi.rp(var1, -866058878);
		var0.bu_fld = xi.rp(var1, 1364772989);
		var0.bt_fld = xi.rp(var1, -1356506371);
		var0.bv_fld = xi.rp(var1, 1393110752);
		var0.cv_fld = xi.tx(var1, 1504087432);
		if (65535 == var0.cv_fld) {
			var0.cv_fld = -1995802935;
		} else {
			var0.cv_fld = 1995802935 * ((var0.bf_fld & -65536) + var0.cv_fld);
		}

		var0.cf_fld = var1.cg() == 1;
		if (0 == var0.bx_fld) {
			var0.cn_fld = xi.tx(var1, 1776954037);
			var0.cr_fld = xi.tx(var1, 640678326);
			var0.hb_fld = var1.cg() == 1;
		}

		if (var0.bx_fld == 5) {
			var0.cj_fld = var1.co();
			var0.cl_fld = xi.tx(var1, 783719692);
			var0.dc_fld = var1.cg() == 1;
			var0.cb_fld = var1.cg();
			var0.dh_fld = var1.cg();
			var0.dv_fld = var1.co();
			var0.dz_fld = var1.cg() == 1;
			var0.dt_fld = var1.cg() == 1;
		}

		if (var0.bx_fld == 6) {
			var0.dm_fld = -1800825853;
			var0.dq_fld = var1.dl(wa.ak_fld.az_fld);
			var0.da_fld = var1.cz();
			var0.dk_fld = var1.cz();
			var0.dx_fld = xi.tx(var1, 1724570004);
			var0.ds_fld = xi.tx(var1, 1689626002);
			var0.du_fld = xi.tx(var1, 1025808563);
			var0.db_fld = xi.tx(var1, 1450251555);
			var0.dl_fld = xi.tx(var1, 1432726652);
			if (65535 == var0.dl_fld) {
				var0.dl_fld = -968762547;
			}

			var0.di_fld = var1.cg() == 1;
			xi.tx(var1, 2082763476);
			if (0 != var0.bi_fld) {
				var0.dg_fld = xi.tx(var1, 1930574649);
			}

			if (var0.bu_fld != 0) {
				xi.tx(var1, 917806952);
			}
		}

		if (4 == var0.bx_fld) {
			var0.de_fld = xi.tx(var1, 763323572);
			if (65535 == var0.de_fld) {
				var0.de_fld = 57339867;
			}

			var0.dp_fld = xi.kc(var1, -1686072473);
			var0.es_fld = var1.cg();
			var0.ep_fld = var1.cg();
			var0.eb_fld = var1.cg();
			var0.ed_fld = var1.cg() == 1;
			var0.ca_fld = var1.co();
		}

		if (var0.bx_fld == 3) {
			var0.ca_fld = var1.co();
			var0.cz_fld = var1.cg() == 1;
			var0.cb_fld = var1.cg();
		}

		if (var0.bx_fld == 9) {
			var0.cu_fld = var1.cg();
			var0.ca_fld = var1.co();
			var0.ci_fld = var1.cg() == 1;
		}

		var0.ec_fld = var1.ck();
		var0.eq_fld = xi.kc(var1, -1071947454);
		int var2 = var1.cg();
		if (var2 > 0) {
			var0.ei_fld = new String[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				var0.ei_fld[var3] = xi.kc(var1, -199356415);
			}
		}

		var0.ev_fld = var1.cg();
		var0.ey_fld = var1.cg();
		var0.em_fld = var1.cg() == 1;
		var0.el_fld = xi.kc(var1, 989045272);
		var0.eu_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fp_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fv_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fc_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fk_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fh_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fe_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fl_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fn_fld = (Object[])var0.aw(var1, 1006055606);
		var0.ft_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fx_fld = (Object[])var0.aw(var1, 1006055606);
		var0.ej_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fy_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fa_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fo_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fj_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fb_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fq_fld = (Object[])var0.aw(var1, 1006055606);
		var0.fm_fld = var0.ay(var1, 1984799128);
		var0.fw_fld = var0.ay(var1, 358102990);
		var0.fg_fld = var0.ay(var1, 1660277231);
	}

	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lli;)Z"
	)
	public static boolean wm(lu var0, li var1) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var2 = false;
		if (null != var0.dp_fld && !var0.dp_fld.isEmpty()) {
			var2 |= li.sc(var1, bw.ax(var0.dp_fld), 43812545);
			var0.dp_fld = "";
		}

		if (var0.dj_fld != null && !var0.dj_fld.isEmpty()) {
			String var6 = var0.dj_fld;
			StringBuilder var7 = new StringBuilder(var6.length());
			int var8 = 0;
			int var9 = -1;

			for (int var10 = 0; var10 < var6.length(); var10++) {
				char var11 = var6.charAt(var10);
				if ('<' == var11) {
					var7.append(var6.substring(var8, var10));
					var9 = var10;
				} else if (var11 == 1723531644 && var9 != -1) {
					String var12 = var6.substring(var9 + 1, var10);
					var9 = -1;
					if (var12.equals("lt")) {
						var7.append("<");
					} else if (var12.equals("gt")) {
						var7.append(">");
					} else if (var12.equals("br")) {
						var7.append("\n");
					}

					var8 = 1 + var10;
				}
			}

			if (var8 < var6.length()) {
				var7.append(var6.substring(var8, var6.length()));
			}

			String var5 = var7.toString();
			var2 |= var1.ae(var5);
			var0.dj_fld = "";
		}

		return var2;
	}

	@ObfuscatedName("setOnReleaseListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnReleaseListener(Object[] var1) {
		this.fa_fld = (Object[])var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	static void ai(boolean var0, byte var1) {
		if (!og.ci_fld.ib((byte)9)) {
			if (var1 == 18) {
				return;
			}

			if (!og.ci_fld.ie(-290013867)) {
				if (var1 == 18) {
					return;
				}

				if (!client.ga(og.ci_fld, -988962053)) {
					bn.ci_fld = kh.it_fld;
					bn.cj_fld = kh.ii_fld;
					bn.ch_fld = kh.iw_fld;
					jz.ac(2);
					if (var0) {
						bn.bq_fld = "";
					}

					bw.ah(-1931517770);
					if (client.dq_fld && bn.ba_fld != null && !bn.ba_fld.isEmpty()) {
						bn.dz_fld = 1451298735;
					} else {
						bn.dz_fld = 0;
					}

					return;
				}

				if (var1 == 18) {
					return;
				}
			}
		}

		jz.ac(10);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lln;"
	)
	public ln bi(int var1) {
		return this.hk_fld != null ? this.hk_fld.ag_fld : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llw;ZLde;I)Lyv;"
	)
	public yv as(lw var1, boolean var2, de var3, int var4) {
		try {
			if (this.fy() != -1) {
				SpritePixels var5 = (SpritePixels)(SpritePixels)client.ah_java_util_Map.get(this.getOriginalX());
				if (var5 != null) {
					return (yv)var5;
				}
			}

			int var10 = -423043034;
			if (null != this.gi_fld) {
				yv var11 = this.ar(var1, var3, 521764807);
				if (var11 != null) {
					return var11;
				}
			}

			int var17;
			if (var2) {
				var17 = this.dm_fld * 2103578503;
			} else {
				var17 = this.bg_fld * -377192225;
			}

			yv var10000;
			if (var17 == -1) {
				Object var6 = null;
				var10000 = (yv)var6;
			} else {
				long var12 = ((this.dt_fld ? 1L : 0L) << 38)
					+ ((long)this.nn_fld << 36)
					+ var17
					+ ((this.di_fld ? 1L : 0L) << 39)
					+ ((long)(1891222921 * this.dh_fld) << 40);
				yv var14 = (yv)var1.as_fld.ae(var12);
				if (var14 != null) {
					var10000 = var14;
				} else {
					var14 = wf.av(var1.ae_fld, var17, 0);
					if (null == var14) {
						Object var16 = null;
						var10000 = (yv)var16;
					} else {
						pr(this, var14, -1404429990);
						var1.as_fld.al(var14, var12);
						var10000 = var14;
					}
				}
			}

			return var10000;
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("setWidth")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setWidth(int var1) {
		this.bb_fld = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lyv;I)V"
	)
	void au(yv var1, int var2) {
		if (this.gw_fld) {
			yv.zb(var1);
		}

		if (this.gw_fld) {
			var1.ax();
		}

		if (this.bv_fld * -1443261961 > 0) {
			var1.aa(-1443261961 * this.db_fld);
		}

		if (this.nn_fld >= 1) {
			if (var2 >= 185271048) {
				return;
			}

			var1.setMaxWidth(1);
		}

		if (this.ev_fld >= 2) {
			if (var2 >= 185271048) {
				return;
			}

			var1.setMaxHeight(16777215);
		}

		if (0 != this.bt_fld) {
			var1.dh(this.by_fld * 1891222921);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llw;B)Lzf;"
	)
	public zf ax(lw var1, byte var2) {
		try {
			if (this.cx_fld == -1) {
				return null;
			} else {
				zf var3 = (zf)var1.ar_fld.aw(159419309 * this.gz_fld);
				if (null != var3) {
					return var3;
				} else {
					var3 = dv.ae(var1.ah_fld, var1.az_fld, 159419309 * this.bv_fld, 0);
					if (null != var3) {
						var1.al_fld.nk(var3, 159419309 * this.ch_fld);
					}

					return var3;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("setOnDialogAbortListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnDialogAbortListener(Object[] var1) {
		this.gn_fld = (Object[])var1;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setContentType(int var1) {
		this.bp_fld = var1;
		return this;
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(Llu;IJ)J"
	)
	public static long pw(lu var0, int var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = 0; var4 < var0.hl_fld; var4++) {
			if (var1 == var0.hs_fld[var4]) {
				return (Long)var0.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean am(int var1) {
		return 11 == this.ch_fld || 12 == this.cu_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ad(int var1) {
		return 11 == this.bp_fld || 12 == this.dw_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bs(int var1) {
		return this.dd_fld == 2;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String by(int var1) {
		if (11 == this.de_fld && null != this.hi_fld) {
			String var2 = this.hi_fld.al();
			Iterator var3 = this.hi_fld.ar().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				String var5 = String.format("%%%S%%", (Object[])(new Object[]{mu.mw(var4, (byte)1)}));
				if (var4.ak((byte)-17) == 0) {
					var2.replaceAll(var5, Integer.toString(var4.ag((byte)-29)));
				} else {
					var2.replaceAll(var5, var4.ah(1263192160));
				}
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfuscatedName("setBorderType")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setBorderType(int var1) {
		this.dh_fld = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int ab(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.do_fld; var4++) {
			if (this.ew_fld[var4] == var1) {
				return (Integer)this.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setSpriteTiling(boolean var1) {
		this.dc_fld = var1;
		return this;
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setScrollWidth(int var1) {
		this.cn_fld = var1;
		return this;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Ljava/lang/String;"
	)
	public static String ar(lu var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (11 == var0.bx_fld && null != var0.hi_fld) {
			String var2 = var0.hi_fld.al();
			Iterator var3 = var0.hi_fld.ar().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				String var5 = String.format("%%%S%%", (Object[])(new Object[]{mu.mw(var4, (byte)1)}));
				if (var4.ak((byte)-17) == 0) {
					var2.replaceAll(var5, Integer.toString(var4.ag((byte)-29)));
				} else {
					var2.replaceAll(var5, var4.ah(1263192160));
				}
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Llp;ZI)V"
	)
	public void ba(lp var1, boolean var2, int var3) {
		try {
			this.cn_fld = 279120917;
			this.dy_fld = new lp(var1);
			if (!var2) {
				this.dy_fld.af_fld = Arrays.copyOf(this.dy_fld.al_fld, this.dy_fld.al_fld.length);
				this.dy_fld.au((short)3193);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("setOnKeyListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Override
	public void setOnKeyListener(Object[] var1) {
		this.fu_fld = (Object[])var1;
	}

	@ObfuscatedName("setFlippedVertically")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setFlippedVertically(boolean var1) {
		this.dz_fld = var1;
	}

	@ObfuscatedName("getRotationY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRotationY() {
		return this.du_fld;
	}

	@ObfuscatedName("setNoScrollThrough")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setNoScrollThrough(boolean var1) {
		this.hf_fld = var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int bh(String var1, int var2) {
		return 11 == this.dm_fld && this.hi_fld != null && qz(this, 297822854) ? this.hi_fld.aw(var1) : -1;
	}

	@ObfuscatedName("getDynamicChildren")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/widgets/Widget;"
	)
	@Override
	public Widget[] getDynamicChildren() {
		lu var1 = og.ci_fld.getWidget(this.bf_fld);
		if (var1 == null) {
			return new Widget[0];
		} else {
			lu[] var2 = var1.ge_fld;
			if (var2 == null) {
				return new Widget[0];
			} else {
				ArrayList var3 = new ArrayList();

				for (lu var7 : var2) {
					if (var7 != null) {
						if (!im_fld && var7.cv_fld != this.bf_fld) {
							throw new AssertionError();
						}

						if (var7.cy_fld == this.by_fld) {
							var3.add(var7);
						}
					}
				}

				return (Widget[])(Widget[])var3.toArray(new lu[0]);
			}
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "()Lym;"
	)
	public ym ji() {
		return this.ck_fld;
	}

	@ObfuscatedName("getModelId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getModelId() {
		return this.dq_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	public int bf(short var1) {
		if (11 == this.bg_fld && this.hi_fld != null && null != this.he_fld && !this.hd_fld.isEmpty()) {
			String var2 = this.hi_fld.al();
			return null != var2 && this.hd_fld.containsKey(this.hi_fld.al()) ? (Integer)this.he_fld.get(var2) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("deleteAllChildren")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void deleteAllChildren() {
		if (this.getChildren() != null) {
			Arrays.fill(this.getChildren(), null);
		}
	}

	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setWidthMode(int var1) {
		this.bi_fld = var1;
		return this;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lli;"
	)
	public li bv(int var1) {
		return this.hk_fld != null ? this.hk_fld.ak_fld : null;
	}
}
