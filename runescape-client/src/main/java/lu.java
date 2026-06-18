import java.awt.Rectangle;
import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetUtil;

@ObfuscatedName("lu")
@Implements({"Widget"})
public class lu extends vw implements Widget {
	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "S"
	)
	public short wh_fld;
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
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 323515003
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
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1461045985
	)
	public int bf_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2140649577
	)
	public int by_fld;
	// $VF: synthetic field
	@ObfuscatedName("yr")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean yr_fld = !lu.class.desiredAssertionStatus();
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] eu_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1404198381
	)
	public int bx_fld;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] gr_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1748990469
	)
	public int bp_fld;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] gv_fld;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -111792431
	)
	public int co_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 138006387
	)
	public int bu_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -570803331
	)
	public int bn_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1715505881
	)
	public int bc_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1413997313
	)
	public int bw_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 831395483
	)
	public int ba_fld;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -450643537
	)
	public int bq_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 545998793
	)
	public int cx_fld;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -324157087
	)
	public int cs_fld;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1857652109
	)
	public int eb_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 124430729
	)
	public int cd_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2132344331
	)
	public int cq_fld;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	public lp dy_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1661012943
	)
	public int cy_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean cf_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1223437005
	)
	public int bb_fld;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean dt_fld;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 590540907
	)
	public int cp_fld;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 9463393
	)
	public int ce_fld;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] fe_fld;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1223437005
	)
	public int ss_fld = -1;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 694320263
	)
	public int cv_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 681955997
	)
	public int ca_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 239766897
	)
	public int cg_fld;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 802525691
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
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1577740823
	)
	public int cb_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1412403275
	)
	public int cu_fld;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ci_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -228305239
	)
	public int bo_fld;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2103578503
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
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1891222921
	)
	public int dv_fld;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean dz_fld;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 879314393
	)
	public int cn_fld;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1233078613
	)
	public int dm_fld;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean em_fld;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1986711867
	)
	int do_fld;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1301730821
	)
	int dd_fld;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1754977669
	)
	public int dl_fld;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 137820669
	)
	public int dr_fld;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -253349227
	)
	public int da_fld;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1003471525
	)
	public int dk_fld;
	@ObfuscatedName("yp")
	@ObfuscatedSignature(
		descriptor = "S"
	)
	public short yp_fld;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -519645809
	)
	public int dx_fld;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -590379409
	)
	public int ds_fld;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1680595947
	)
	int hn_fld;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -70630065
	)
	public int db_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -405011595
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
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -43374303
	)
	public int df_fld;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 159419309
	)
	public int de_fld;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1198739519
	)
	public int es_fld;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String dj_fld;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -233337277
	)
	public int dq_fld;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2082962145
	)
	public int ep_fld;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 854556803
	)
	static int nf_fld;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ed_fld;
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
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1627369
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
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1723920971
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
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int np_fld;
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
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2137298625
	)
	public int ek_fld;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public lu ea_fld;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -763835689
	)
	public int ev_fld;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 117891801
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
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1238591925
	)
	public int cc_fld;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] ej_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1151170383
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
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 582360795
	)
	public int bv_fld;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 214412161
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
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -150852659
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
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 101145729
	)
	public int gb_fld;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1443261961
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
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -377192225
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
	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -590379409
	)
	public int mv_fld = -1;
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
	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1223437005
	)
	public int vi_fld = -1;
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
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap hd_fld;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2139590355
	)
	public int gk_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1050344583
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
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1243874365
	)
	public int ga_fld;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1632782049
	)
	public int gd_fld;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1389783319
	)
	public int gl_fld;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 668367529
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
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1471705067
	)
	public int du_fld;
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1477055471
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
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 235919357
	)
	public int cr_fld;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2054244789
	)
	public int dg_fld;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap he_fld;
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
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1189206755
	)
	int hl_fld;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1721404151
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
				if (null == this.hd_fld || null == this.he_fld) {
					this.bd(-64371462);
				}

				this.hi_fld.az(var2, var4, var5);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("getModelId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getModelId")
	@Override
	public int getModelId() {
		return this.dq_fld;
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setXTextAlignment(int var1) {
		this.ep_fld = var1;
		return this;
	}

	public lu(lu var1) throws EOFException {
		this.wh_fld = -1;
		this.yp_fld = -1;
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
		this.ik(-1);
		this.bg_fld = 0;
		this.qz(-1);
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
		this.ik(-1);
		this.bg_fld = var1.bg_fld * 214412161;
		this.qz(-1);
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
		this.et_fld = pz(this, var1.et_fld, (short)7947);
		this.ew_fld = pz(this, var1.ew_fld, (short)6293);
		this.ex_fld = pz(this, var1.ex_fld, (short)31682);
		this.eo_fld = (String[])(String[])this.ag(var1.eo_fld, 655679703);
		if (null != var1.hi_fld) {
			this.hi_fld = new ma(var1.hi_fld);
		}

		this.hn_fld = 1 * var1.hn_fld;
		this.hd_fld = var1.hd_fld;
		if (null != var1.he_fld) {
			this.he_fld = new HashMap();
			this.he_fld.putAll(var1.he_fld);
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

		this.eg_fld = pz(this, var1.eg_fld, (short)18051);
		this.ef_fld = pz(this, var1.ef_fld, (short)3464);
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
		this.gp_fld = pz(this, var1.gp_fld, (short)10641);
		this.gv_fld = pz(this, var1.gv_fld, (short)6917);
		this.gk_fld = var1.gk_fld * 2139590355;
		this.gi_fld = var1.gi_fld;
		this.gq_fld = var1.gq_fld;
		this.gf_fld = pz(this, var1.gf_fld, (short)18200);
		this.gm_fld = pz(this, var1.gm_fld, (short)29131);
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
		this.hp_fld = pz(this, var1.hp_fld, (short)9406);
		this.hb_fld = var1.hb_fld;
		this.hf_fld = var1.hf_fld;
		this.hh_fld = var1.hh_fld;
		if (var1.hl_fld > 0) {
			this.hs_fld = pz(this, var1.hs_fld, (short)9020);
			this.hq_fld = (Object[])this.ag((Object[])var1.hq_fld, 596001012);
			this.hl_fld = var1.hl_fld * 1189206755;
		}
	}

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Ljava/lang/String;"
	)
	public static String rg(lu var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (11 == var0.bx_fld && null != var0.hi_fld) {
			String var1 = var0.hi_fld.al();
			Iterator var2 = var0.hi_fld.af().iterator();

			while (var2.hasNext()) {
				mu var3 = (mu)(mu)var2.next();
				String var4 = String.format("%%%S%%", (Object[])(new Object[]{mu.wi(var3, (byte)1)}));
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)[Ljava/lang/Object;"
	)
	Object[] ag(Object[] var1, int var2) {
		return (Object[])(null != var1 ? Arrays.copyOf((Object[])var1, var1.length) : null);
	}

	@ObfuscatedName("getStaticChildren")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/widgets/Widget;"
	)
	@Export("getStaticChildren")
	@Override
	public Widget[] getStaticChildren() {
		if (this.by_fld > -1) {
			return new Widget[0];
		} else {
			ArrayList var1 = new ArrayList();

			for (lu var5 : og.ci_fld.al(WidgetUtil.componentToInterface(this.bf_fld))) {
				if (var5 != null && var5.cv_fld == this.bf_fld) {
					var1.add(var5);
				}
			}

			return (Widget[])(Widget[])var1.toArray(new lu[0]);
		}
	}

	@ObfuscatedName("getModelType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getModelType")
	@Override
	public int getModelType() {
		return this.dm_fld;
	}

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lxi;)[I"
	)
	public static int[] rg(lu var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var1.cg();
		if (0 == var2) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; var4++) {
				var3[var4] = var1.co((byte)-32);
			}

			return var3;
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dr() {
		return this.hn_fld == 2;
	}

	@ObfuscatedName("getNoScrollThrough")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("getNoScrollThrough")
	@Override
	public boolean getNoScrollThrough() {
		return this.hf_fld;
	}

	@ObfuscatedName("getTextColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTextColor")
	@Override
	public int getTextColor() {
		return this.ca_fld;
	}

	@ObfuscatedName("getOnInvTransmitListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Export("getOnInvTransmitListener")
	@Override
	public Object[] getOnInvTransmitListener() {
		return (Object[])this.fe_fld;
	}

	@ObfuscatedName("deleteAllChildren")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("deleteAllChildren")
	@Override
	public void deleteAllChildren() {
		if (this.getChildren() != null) {
			Arrays.fill(this.getChildren(), null);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ae(xi var1, int var2) {
		var1.cg();
		this.bj_fld = true;
		this.bx_fld = var1.cg();
		this.bp_fld = var1.cm();
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz();
		this.bw_fld = var1.cm();
		if (9 == this.bx_fld) {
			if (var2 <= -1412529775) {
				return;
			}

			this.ba_fld = var1.cz();
		} else {
			this.ba_fld = var1.cm();
		}

		this.bi_fld = var1.cw();
		this.bu_fld = var1.cw();
		this.bt_fld = var1.cw();
		this.bv_fld = var1.cw();
		this.cv_fld = var1.cm();
		if (65535 == this.cv_fld) {
			this.cv_fld = -1995802935;
		} else {
			this.cv_fld = 1995802935 * ((this.bf_fld & -65536) + this.cv_fld);
		}

		this.cf_fld = var1.cg() == 1;
		if (0 == this.bx_fld) {
			this.cn_fld = var1.cm();
			this.cr_fld = var1.cm();
			this.hb_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 5) {
			this.cj_fld = var1.co((byte)-15);
			this.cl_fld = var1.cm();
			this.dc_fld = var1.cg() == 1;
			this.cb_fld = var1.cg();
			this.dh_fld = var1.cg();
			this.dv_fld = var1.co((byte)-100);
			this.dz_fld = var1.cg() == 1;
			this.dt_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 6) {
			this.dm_fld = -1800825853;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld);
			this.da_fld = var1.cz();
			this.dk_fld = var1.cz();
			this.dx_fld = var1.cm();
			this.ds_fld = var1.cm();
			this.du_fld = var1.cm();
			this.db_fld = var1.cm();
			this.dl_fld = var1.cm();
			if (65535 == this.dl_fld) {
				this.dl_fld = -968762547;
			}

			this.di_fld = var1.cg() == 1;
			var1.cm();
			if (0 != this.bi_fld) {
				this.dg_fld = var1.cm();
			}

			if (this.bu_fld != 0) {
				var1.cm();
			}
		}

		if (4 == this.bx_fld) {
			this.de_fld = var1.cm();
			if (65535 == this.de_fld) {
				this.de_fld = 57339867;
			}

			this.dp_fld = xi.at(var1, 1695725812);
			this.es_fld = var1.cg();
			this.ep_fld = var1.cg();
			this.eb_fld = var1.cg();
			this.ed_fld = var1.cg() == 1;
			this.ca_fld = var1.co((byte)-44);
		}

		if (this.bx_fld == 3) {
			this.ca_fld = var1.co((byte)-71);
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
			this.ca_fld = var1.co((byte)-38);
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

		this.ec_fld = xi.lx(var1, 2032903346);
		this.eq_fld = xi.at(var1, -896948065);
		int var3 = var1.cg();
		if (var3 > 0) {
			this.ei_fld = new String[var3];

			for (int var4 = 0; var4 < var3; var4++) {
				this.ei_fld[var4] = xi.at(var1, 1770363920);
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
		this.el_fld = xi.at(var1, -1481826524);
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

	@ObfuscatedName("xd")
	@ObfuscatedSignature(
		descriptor = "(II)Llu;"
	)
	public lu setPos(int var1, int var2) {
		return this.setOriginalX(var1).setOriginalY(var2);
	}

	@ObfuscatedName("getOnOpListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Export("getOnOpListener")
	@Override
	public Object[] getOnOpListener() {
		return (Object[])this.ft_fld;
	}

	@ObfuscatedName("getNestedChildren")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/widgets/Widget;"
	)
	@Export("getNestedChildren")
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
			pk var1 = (pk)ib.iu(cf.cg_fld.an_fld, this.bf_fld);
			if (var1 == null) {
				return new lu[0];
			} else {
				int var2 = var1.getId();
				ArrayList var3 = new ArrayList();

				for (lu var7 : og.ci_fld.al(var2)) {
					if (var7 != null && var7.cv_fld == -1) {
						var3.add(var7);
					}
				}

				return (Widget[])(Widget[])var3.toArray(new lu[0]);
			}
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void jt(boolean var1) {
		this.bj_fld = var1;
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
			if (null == this.he_fld) {
				this.bd(-1584056311);
			}

			this.he_fld.put(var1, var2);
		}
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
					var4[var5] = new Integer(var1.co((byte)-58));
				} else if (var6 == 1) {
					var4[var5] = xi.at(var1, -216972048);
				}
			}

			this.eh_fld = true;
			return (Object[])var4;
		}
	}

	@ObfuscatedName("getScrollHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getScrollHeight")
	@Override
	public int getScrollHeight() {
		return this.cr_fld;
	}

	@ObfuscatedName("xs")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;Lde;)Lyv;"
	)
	public static yv xs(lu var0, lw var1, de var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.al(320097083)) {
			return var0.af(var1, var2, (byte)0);
		} else {
			String var3 = var0.ct_fld + (var0.dz_fld ? 1 : 0) + (var0.dt_fld ? 1 : 0) + -1186621155 * var0.dh_fld + 1236978456 * var0.dv_fld;
			yv var4 = (yv)(yv)var1.ax_fld.ag(var3);
			if (null == var4) {
				yv var5 = var0.af(var1, var2, (byte)0);
				if (var5 != null) {
					var4 = var5.al();
					mg(var0, var4, -268730796);
					var1.ax_fld.az(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setScrollX(int var1) {
		this.cp_fld = var1;
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
				var4[var5] = var1.co((byte)-48);
			}

			return var4;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llw;ZLde;I)Lyv;"
	)
	public yv as(lw var1, boolean var2, de var3, int var4) {
		try {
			if (this.getSpriteId() != -1) {
				SpritePixels var5 = (SpritePixels)(SpritePixels)client.vl_java_util_Map.get(this.getId());
				if (var5 != null) {
					return (yv)var5;
				}
			}

			int var10 = -423043034;
			if (null != this.ct_fld) {
				yv var11 = aa(this, var1, var3, 521764807);
				if (var11 != null) {
					return var11;
				}
			}

			int var17;
			if (var2) {
				var17 = this.ch_fld;
			} else {
				var17 = this.cj_fld;
			}

			yv var10000;
			if (var17 == -1) {
				Object var6 = null;
				var10000 = (yv)var6;
			} else {
				long var12 = ((this.dz_fld ? 1L : 0L) << 38) + ((long)this.dh_fld << 36) + var17 + ((this.dt_fld ? 1L : 0L) << 39) + ((long)this.dv_fld << 40);
				yv var14 = (yv)var1.as_fld.ak(var12);
				if (var14 != null) {
					var10000 = var14;
				} else {
					var14 = wf.av(var1.ae_fld, var17, 0);
					if (null == var14) {
						Object var16 = null;
						var10000 = (yv)var16;
					} else {
						mg(this, var14, -1404429990);
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lma;"
	)
	public ma bx(int var1) {
		return this.hi_fld;
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

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOpacity(int var1) {
		this.cb_fld = var1;
		return this;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean al(int var1) {
		return this.dz_fld || this.dt_fld || 0 != this.dh_fld || this.dv_fld != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llw;B)Lzf;"
	)
	public zf ax(lw var1, byte var2) {
		try {
			if (this.de_fld == -1) {
				return null;
			} else {
				zf var3 = (zf)var1.af_fld.ak(this.de_fld);
				if (null != var3) {
					return var3;
				} else {
					var3 = dv.ae(var1.ae_fld, var1.ah_fld, this.de_fld, 0);
					if (null != var3) {
						var1.af_fld.az(var3, this.de_fld);
					}

					return var3;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
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

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "()[Llu;"
	)
	public lu[] getChildren() {
		return this.ge_fld;
	}

	@ObfuscatedName("getSpriteId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getSpriteId")
	@Override
	public int getSpriteId() {
		return this.cj_fld;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setTextShadowed(boolean var1) {
		this.ed_fld = var1;
		return this;
	}

	@ObfuscatedName("getTextShadowed")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("getTextShadowed")
	@Override
	public boolean getTextShadowed() {
		return this.ed_fld;
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOriginalY(int var1) {
		this.bc_fld = var1;
		return this;
	}

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setClickMask(int var1) {
		this.ec_fld = var1;
		return this;
	}

	@ObfuscatedName("getItemQuantity")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getItemQuantity")
	@Override
	public int getItemQuantity() {
		return this.gd_fld;
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setModelId(int var1) {
		this.dq_fld = var1;
		return this;
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

	@ObfuscatedName("setOnDragCompleteListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnDragCompleteListener")
	@Override
	public void setOnDragCompleteListener(Object[] var1) {
		this.fb_fld = (Object[])var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean am(int var1) {
		return !this.bj_fld || 0 == this.bx_fld || this.bx_fld == 11 || this.eh_fld || 1338 == this.bp_fld || this.bx_fld == 12;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Lzv;"
	)
	public zv ck(lw var1) {
		try {
			return this.ax(var1, (byte)-81);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getOnLoadListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Export("getOnLoadListener")
	@Override
	public Object[] getOnLoadListener() {
		return (Object[])this.eu_fld;
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

	@ObfuscatedName("isSelfHidden")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isSelfHidden")
	@Override
	public boolean isSelfHidden() {
		return this.cf_fld;
	}

	@ObfuscatedName("getLineHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getLineHeight")
	@Override
	public int getLineHeight() {
		return this.es_fld;
	}

	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "(Llu;ILjava/lang/Object;)V"
	)
	public static void rf(lu var0, int var1, Object var2) {
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

		var0.hs_fld[var0.hl_fld] = var1;
		var0.hq_fld[var0.hl_fld] = var2;
		var0.hl_fld++;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ad(int var1) {
		return 11 == this.bx_fld || 12 == this.bx_fld;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setFontId(int var1) {
		this.de_fld = var1;
		return this;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Llw;)V"
	)
	void fe(lw var1) {
		this.hb_fld = true;
		ArrayList var2 = this.hi_fld.as();
		ArrayList var3 = this.hi_fld.ar();
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
			var12.de_fld = (Integer)this.hd_fld.get(var11.ay_fld);
			var12.ep_fld = var11.ah_fld * 224036757;
			var12.eb_fld = 992230371 * var11.aw_fld;
			this.ge_fld[var5++] = var12;
		}
	}

	@ObfuscatedName("isIf3")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isIf3")
	@Override
	public boolean isIf3() {
		return this.bj_fld;
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/widgets/Widget;)Llu;"
	)
	public lu setDragParent(Widget var1) {
		this.ea_fld = (lu)var1;
		return this;
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
							var14 = eg.ak(var1.av_fld, var10, 0);
							break;
						case 2:
							var14 = pp.tv(var6, null, -1381387792);
							break;
						case 3:
							var14 = null != var5 ? var5.af((byte)59) : null;
							break;
						case 4:
							og var17 = kb.ag(var10, -1752383175);
							var14 = og.fn(var17, 10);
							var15 += var17.ee_fld;
							var16 += var17.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var14 = pp.tv(var6, var7, -1845400614);
					}

					if (null == var14) {
						return null;
					}

					var13 = eg.et(var14, var15, var16, -50, -10, -50);
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

	@ObfuscatedName("getClickMask")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getClickMask")
	@Override
	public int getClickMask() {
		return this.ec_fld;
	}

	@ObfuscatedName("getSpriteTiling")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("getSpriteTiling")
	@Override
	public boolean getSpriteTiling() {
		return this.dc_fld;
	}

	@ObfuscatedName("clearActions")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("clearActions")
	@Override
	public void clearActions() {
		this.ei_fld = null;
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
				if (this.hd_fld == null || null == this.he_fld) {
					this.bd(-2094735428);
				}
			}
		}
	}

	@ObfuscatedName("setOnScrollWheelListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnScrollWheelListener")
	@Override
	public void setOnScrollWheelListener(Object[] var1) {
		this.fq_fld = (Object[])var1;
	}

	@ObfuscatedName("getBorderType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBorderType")
	@Override
	public int getBorderType() {
		return this.dh_fld;
	}

	@ObfuscatedName("getItemQuantityMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getItemQuantityMode")
	@Override
	public int getItemQuantityMode() {
		return this.df_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void av(xi var1, int var2) {
		this.bj_fld = false;
		this.bx_fld = var1.cg();
		this.bo_fld = var1.cg();
		this.bp_fld = var1.cm();
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz();
		this.bw_fld = var1.cm();
		this.ba_fld = var1.cm();
		this.cb_fld = var1.cg();
		this.cv_fld = var1.cm();
		if (this.cv_fld == 65535) {
			if (var2 != -1894614222) {
				return;
			}

			this.cv_fld = -1995802935;
		} else {
			this.cv_fld = (this.bf_fld & -65536) + this.cv_fld;
		}

		this.gk_fld = var1.cm();
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
				this.gv_fld[var4] = var1.cm();
			}
		}

		int var8 = var1.cg();
		if (var8 > 0) {
			this.gu_fld = new int[var8][];

			for (int var5 = 0; var5 < var8; var5++) {
				int var6 = var1.cm();
				this.gu_fld[var5] = new int[var6];

				for (int var7 = 0; var7 < var6; var7++) {
					this.gu_fld[var5][var7] = var1.cm();
					if (this.gu_fld[var5][var7] == 65535) {
						this.gu_fld[var5][var7] = -1;
					}
				}
			}
		}

		if (0 == this.bx_fld) {
			this.cr_fld = var1.cm();
			this.cf_fld = var1.cg() == 1;
		}

		if (1 == this.bx_fld) {
			if (var2 != -1894614222) {
				return;
			}

			var1.cm();
			var1.cg();
		}

		if (3 == this.bx_fld) {
			this.cz_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4 || 1 == this.bx_fld) {
			this.ep_fld = var1.cg();
			this.eb_fld = var1.cg();
			this.es_fld = var1.cg();
			this.de_fld = var1.cm();
			if (65535 == this.de_fld) {
				this.de_fld = 57339867;
			}

			this.ed_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4) {
			this.dp_fld = xi.at(var1, -1609285527);
			this.dj_fld = xi.at(var1, 1530678426);
		}

		if (this.bx_fld == 1 || 3 == this.bx_fld || this.bx_fld == 4) {
			this.ca_fld = var1.co((byte)-89);
		}

		if (3 == this.bx_fld || 4 == this.bx_fld) {
			this.cg_fld = var1.co((byte)-73);
			this.cw_fld = var1.co((byte)-65);
			this.cm_fld = var1.co((byte)-35);
		}

		if (5 == this.bx_fld) {
			this.cj_fld = var1.co((byte)-29);
			this.ch_fld = var1.co((byte)-102);
		}

		if (this.bx_fld == 6) {
			this.dm_fld = -1800825853;
			this.do_fld = -1082400781;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld);
			this.dd_fld = var1.dl(wa.ak_fld.az_fld);
			this.dl_fld = var1.cm();
			if (65535 == this.dl_fld) {
				this.dl_fld = -968762547;
			}

			this.dr_fld = var1.cm();
			if (this.dr_fld == 65535) {
				if (var2 != -1894614222) {
					return;
				}

				this.dr_fld = 37770411;
			}

			this.db_fld = var1.cm();
			this.dx_fld = var1.cm();
			this.ds_fld = var1.cm();
		}

		if (this.bx_fld == 8) {
			if (var2 != -1894614222) {
				return;
			}

			this.dp_fld = xi.at(var1, -1354455776);
		}

		if (2 == this.bo_fld) {
			this.el_fld = xi.at(var1, -161719043);
			this.gi_fld = xi.at(var1, 1009453986);
			int var9 = var1.cm() & 63;
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

			this.gq_fld = xi.at(var1, -1370423885);
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bd(int var1) {
		this.hd_fld = new HashMap();
		this.he_fld = new HashMap();
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return this.bf_fld;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde;)V"
	)
	public static void jv(lu var0, String var1, String var2, String var3, String var4, String var5, de var6) throws UnsupportedEncodingException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.hi_fld = new ma();
			if (!var0.hi_fld.ag(var1, var3, var6)) {
				var0.hi_fld = null;
			} else {
				if (null == var0.hd_fld || null == var0.he_fld) {
					var0.bd(1005534549);
				}

				var0.hi_fld.az(var2, var4, var5);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setRotationZ(int var1) {
		this.ds_fld = var1;
		return this;
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
							var13 = eg.ak(var1.av_fld, var9, 0);
							break;
						case 2:
							var13 = pp.tv(var6, null, -1268541705);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)3) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = og.fn(var16, 10);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = pp.tv(var6, var7, -1499907116);
					}

					if (null == var13) {
						return null;
					}

					var12 = eg.et(var13, var14, var15, -50, -10, -50);
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

	@ObfuscatedName("setTargetPriority")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setTargetPriority")
	@Override
	public void setTargetPriority(int var1) {
		this.ek_fld = var1;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean eg(int var1, int var2, int var3, int var4) {
		if (this.bx_fld == 11 && this.hi_fld != null && this.bs_boolean(303927453)) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.hi_fld.au()[0] * (2068289896 * this.bb_fld));
			int var6 = (int)(this.hi_fld.au()[1] * this.cd_fld);
			int var7 = var5 + (int)(this.hi_fld.au()[2] * (1220209890 * this.bb_fld));
			int var8 = var6 + (int)(this.hi_fld.au()[3] * this.cd_fld);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bs_boolean(int var1) {
		return this.hn_fld == 2;
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "()Lli;"
	)
	public li fg() {
		return this.hk_fld != null ? this.hk_fld.ak_fld : null;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
	)
	Object[] bq(Object[] var1) {
		return (Object[])(null != var1 ? Arrays.copyOf((Object[])var1, var1.length) : null);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bj(int var1) {
		return this.he_fld != null && !this.he_fld.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("setOnDragListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnDragListener")
	@Override
	public void setOnDragListener(Object[] var1) {
		this.fj_fld = (Object[])var1;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;)I"
	)
	public static int kd(lu var0, String var1) {
		return 11 == var0.bx_fld && var0.hi_fld != null && var0.bs_boolean(1403256113) ? ma.rs(var0.hi_fld, var1, -1943798141) : -1;
	}

	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setModelType(int var1) {
		this.dm_fld = var1;
		return this;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(II)Llu;"
	)
	public lu setSize(int var1, int var2) {
		return this.setOriginalWidth(var1).setOriginalHeight(var2);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Llu;III)I"
	)
	public static int hg(lu var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			for (int var4 = 0; var4 < var0.hl_fld; var4++) {
				if (var0.hs_fld[var4] == var1) {
					return (Integer)var0.hq_fld[var4];
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("yj")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String yj() {
		return this.dp_fld;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cz() {
		return this.dz_fld || this.dt_fld || 0 != this.dh_fld || this.dv_fld != 0;
	}

	@ObfuscatedName("getRotationX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRotationX")
	@Override
	public int getRotationX() {
		return this.dx_fld;
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(Llu;[IS)[I"
	)
	public static int[] pz(lu var0, int[] var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return null != var1 ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String by(int var1) {
		if (11 == this.bx_fld && null != this.hi_fld) {
			String var2 = this.hi_fld.al();
			Iterator var3 = this.hi_fld.af().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				String var5 = String.format("%%%S%%", (Object[])(new Object[]{mu.wi(var4, (byte)1)}));
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

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setHeightMode(int var1) {
		this.bu_fld = var1;
		return this;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "([I)[I"
	)
	int[] cc(int[] var1) {
		return null != var1 ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("hasListener")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("hasListener")
	@Override
	public boolean hasListener() {
		return this.eh_fld;
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "()Lma;"
	)
	public ma fk() {
		return this.hi_fld;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Llw;)V"
	)
	void fw(lw var1) {
		this.hb_fld = true;
		ArrayList var2 = this.hi_fld.as();
		ArrayList var3 = this.hi_fld.ar();
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
			var12.de_fld = (Integer)this.hd_fld.get(var11.ay_fld) * -82239663;
			var12.ep_fld = var11.ah_fld * 1375656682;
			var12.eb_fld = 992230371 * var11.aw_fld;
			this.ge_fld[var5++] = var12;
		}
	}

	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;Lol;IZLlp;Lpp;Lpg;)Lfn;"
	)
	public static fn ru(lu var0, lw var1, ol var2, int var3, boolean var4, lp var5, pp var6, pg var7) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var8;
			int var9;
			if (var4) {
				var8 = var0.do_fld;
				var9 = var0.dd_fld * 1942414419;
			} else {
				var8 = var0.dm_fld;
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
							var13 = eg.ak(var1.av_fld, var9, 0);
							break;
						case 2:
							var13 = pp.tv(var6, null, -1376378467);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)58) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = og.fn(var16, 10);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = pp.tv(var6, var7, -1742166923);
					}

					if (null == var13) {
						return null;
					}

					var12 = eg.et(var13, var14, var15, -50, -10, -50);
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

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String qz(lu var0, String var1) {
		return var0.bx_fld == 11 && null != var0.hi_fld && var0.bs_boolean(1465243715) ? var0.hi_fld.ay(var1) : null;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "()Lma;"
	)
	public ma fb() {
		return this.hi_fld;
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

	@ObfuscatedName("getBounds")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Rectangle;"
	)
	@Export("getBounds")
	@Override
	public Rectangle getBounds() {
		return new Rectangle(this.mv_fld, this.vi_fld, this.getWidth(), this.getHeight());
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ny(int var1) {
		this.mv_fld = var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Lld;"
	)
	public ld bn(byte var1) {
		return this.hk_fld;
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde;)V"
	)
	public static void gg(lu var0, String var1, String var2, String var3, String var4, String var5, de var6) throws UnsupportedEncodingException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.hi_fld = new ma();
			if (!var0.hi_fld.ag(var1, var3, var6)) {
				var0.hi_fld = null;
			} else {
				if (null == var0.hd_fld || null == var0.he_fld) {
					var0.bd(1830428324);
				}

				var0.hi_fld.az(var2, var4, var5);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)Z"
	)
	boolean bc(li var1, int var2) {
		boolean var3 = false;
		if (null != this.dp_fld && !this.dp_fld.isEmpty()) {
			var3 |= var1.av(bw.ax(this.dp_fld));
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
			var3 |= li.wh(var1, var6, (short)-21259);
			this.dj_fld = "";
		}

		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String at(lu var0, String var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bx_fld == 11 && null != var0.hi_fld && var0.bs_boolean(1249132947) ? var0.hi_fld.ay(var1) : null;
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setTextColor(int var1) {
		this.ca_fld = var1;
		return this;
	}

	@ObfuscatedName("getOnKeyListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Export("getOnKeyListener")
	@Override
	public Object[] getOnKeyListener() {
		return (Object[])this.fu_fld;
	}

	@ObfuscatedName("getYTextAlignment")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getYTextAlignment")
	@Override
	public int getYTextAlignment() {
		return this.eb_fld;
	}

	@ObfuscatedName("getParentId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getParentId")
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
					int var3 = this.ss_fld;
					if (var3 != -1) {
						pk var4 = (pk)ib.iu(cf.cg_fld.an_fld, var3);
						if (var4 != null && var4.getId() == WidgetUtil.componentToInterface(var2)) {
							return var3;
						}

						this.ss_fld = -1;
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

	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;Lde;B)Z"
	)
	public static boolean ws(lu var0, lw var1, de var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (11 == var0.bx_fld && null != var0.hi_fld) {
			ma.dh(var0.hi_fld, var2, 2099032597);
			if (var0.hi_fld.ae() != var0.hn_fld) {
				var0.hn_fld = var0.hi_fld.ae();
				if (var0.hn_fld >= 3) {
					return true;
				}

				if (2 == var0.hn_fld) {
					var0.bp(var1, -511255598);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(Llu;ILjava/lang/String;)V"
	)
	public static void et(lu var0, int var1, String var2) {
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

	@ObfuscatedName("getYPositionMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getYPositionMode")
	@Override
	public int getYPositionMode() {
		return this.bv_fld;
	}

	@ObfuscatedName("getNoClickThrough")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("getNoClickThrough")
	@Override
	public boolean getNoClickThrough() {
		return this.hb_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Llw;I)Z"
	)
	public boolean bw(lw var1, int var2) {
		try {
			li var3 = ax(this, -712274036);
			if (var3 == null) {
				return false;
			} else {
				boolean var4 = false;
				if (!var3.cq() && this.de_fld != -1) {
					int var5 = li.nf(var3, -2123246946);
					int var6 = var3.cy();
					int var7 = var3.cc();
					int var8 = li.em(var3, (byte)-43);
					zf var9 = this.ax(var1, (byte)12);
					if (null != var9) {
						var4 |= li.kw(var3, var9, 1709100418);
						var4 |= this.bc(var3, 55221958);
						var4 |= var3.al(var5, var6);
						var4 |= var3.ap(var7, var8);
					}
				} else if (var3.cq()) {
					var4 |= this.bc(var3, 55221958);
				}

				var3.ak();
				return var4;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Llp;ZI)V"
	)
	public void ba(lp var1, boolean var2, int var3) {
		try {
			this.dm_fld = 279120917;
			this.dy_fld = new lp(var1);
			if (!var2) {
				this.dy_fld.af_fld = Arrays.copyOf(this.dy_fld.ar_fld, this.dy_fld.ar_fld.length);
				this.dy_fld.au((short)3193);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getOriginalHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOriginalHeight")
	@Override
	public int getOriginalHeight() {
		return this.ba_fld;
	}

	@ObfuscatedName("getParent")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/widgets/Widget;"
	)
	@Export("getParent")
	@Override
	public Widget getParent() {
		int var1 = this.getParentId();
		return var1 == -1 ? null : og.ci_fld.getWidget(var1);
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setRotationX(int var1) {
		this.dx_fld = var1;
		return this;
	}

	@ObfuscatedName("getDragDeadTime")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getDragDeadTime")
	@Override
	public int getDragDeadTime() {
		return this.ey_fld;
	}

	@ObfuscatedName("getDragParent")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/widgets/Widget;"
	)
	@Export("getDragParent")
	@Override
	public Widget getDragParent() {
		return this.ea_fld;
	}

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setScrollY(int var1) {
		this.ce_fld = var1;
		return this;
	}

	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Llu;"
	)
	public lu setText(String var1) {
		this.dp_fld = var1;
		return this;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bz(int var1, int var2, int var3) {
		if (11 == this.bx_fld) {
			if (this.hd_fld == null) {
				this.bd(1230390981);
			}

			this.hd_fld.put(var1, var2);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([I)[I"
	)
	int[] cd(int[] var1) {
		return null != var1 ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("setType")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setType")
	@Override
	public void setType(int var1) {
		this.bx_fld = var1;
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lyv;I)V"
	)
	public static void mg(lu var0, yv var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.dz_fld) {
				var1.aq();
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
	}

	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;Lde;)Z"
	)
	public static boolean qs(lu var0, lw var1, de var2) {
		if (11 == var0.bx_fld && null != var0.hi_fld) {
			ma.dh(var0.hi_fld, var2, 2113344988);
			if (var0.hi_fld.ae() != var0.hn_fld) {
				var0.hn_fld = var0.hi_fld.ae();
				if (var0.hn_fld >= 3) {
					return true;
				}

				if (2 == var0.hn_fld) {
					var0.bp(var1, 41796530);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setYTextAlignment(int var1) {
		this.eb_fld = var1;
		return this;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
	)
	Object[] bb(Object[] var1) {
		return (Object[])(null != var1 ? Arrays.copyOf((Object[])var1, var1.length) : null);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setYPositionMode(int var1) {
		this.bv_fld = var1;
		return this;
	}

	@ObfuscatedName("getWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWidth")
	@Override
	public int getWidth() {
		return this.bb_fld;
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void tq(int var1) {
		this.ss_fld = var1;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Llw;Z)Lkp;"
	)
	public kp dm(lw var1, boolean var2) {
		try {
			return qv(this, var1, var2, 15790320);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getWidthMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWidthMode")
	@Override
	public int getWidthMode() {
		return this.bi_fld;
	}

	@ObfuscatedName("setDragDeadZone")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setDragDeadZone")
	@Override
	public void setDragDeadZone(int var1) {
		this.ev_fld = var1;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setSpriteTiling(boolean var1) {
		this.dc_fld = var1;
		return this;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lph;"
	)
	public static ph ag(int var0, int var1) throws EOFException {
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int bh(String var1, int var2) {
		return 11 == this.bx_fld && this.hi_fld != null && this.bs_boolean(297822854) ? ma.rs(this.hi_fld, var1, -835587419) : -1;
	}

	@ObfuscatedName("getText")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getText")
	@Override
	public String getText() {
		return this.yj().replace(' ', ' ');
	}

	@ObfuscatedName("getVarTransmitTrigger")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getVarTransmitTrigger")
	@Override
	public int[] getVarTransmitTrigger() {
		return this.fm_fld;
	}

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String zc() {
		return this.eq_fld;
	}

	@ObfuscatedName("getScrollX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getScrollX")
	@Override
	public int getScrollX() {
		return this.cp_fld;
	}

	@ObfuscatedName("zp")
	@ObfuscatedSignature(
		descriptor = "()Lzv;"
	)
	public zv getFont() {
		try {
			return this.ck(cf.cg_fld);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
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
				client.us(this, pf.qw_fld, bc.qx_fld, cf.cg_fld, client.cz_fld);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getIndex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getIndex")
	@Override
	public int getIndex() {
		return this.by_fld;
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOriginalWidth(int var1) {
		this.bw_fld = var1;
		return this;
	}

	@ObfuscatedName("getScrollWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getScrollWidth")
	@Override
	public int getScrollWidth() {
		return this.cn_fld;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] fj() {
		if (this.bx_fld == 11 && this.hi_fld != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.hi_fld.af().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				if (!mu.wi(var4, (byte)1).equals("user_id")) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ah(xi var1, int var2) {
		this.bl_fld = xi.at(var1, 409262132);
	}

	@ObfuscatedName("setHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setHeight")
	@Override
	public void setHeight(int var1) {
		this.cd_fld = var1;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cy(xi var1) {
		var1.cg();
		this.bj_fld = true;
		this.bx_fld = var1.cg();
		this.bp_fld = var1.cm();
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz();
		this.bw_fld = var1.cm();
		if (9 == this.bx_fld) {
			this.ba_fld = var1.cz();
		} else {
			this.ba_fld = var1.cm();
		}

		this.bi_fld = var1.cw();
		this.bu_fld = var1.cw();
		this.bt_fld = var1.cw();
		this.bv_fld = var1.cw();
		this.cv_fld = var1.cm();
		if (65535 == this.cv_fld) {
			this.cv_fld = -1995802935;
		} else {
			this.cv_fld = 1995802935 * ((this.bf_fld & -65536) + this.cv_fld);
		}

		this.cf_fld = var1.cg() == 1;
		if (0 == this.bx_fld) {
			this.cn_fld = var1.cm();
			this.cr_fld = var1.cm();
			this.hb_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 5) {
			this.cj_fld = var1.co((byte)-104);
			this.cl_fld = var1.cm();
			this.dc_fld = var1.cg() == 1;
			this.cb_fld = var1.cg();
			this.dh_fld = var1.cg();
			this.dv_fld = var1.co((byte)-118);
			this.dz_fld = var1.cg() == 1;
			this.dt_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 6) {
			this.dm_fld = -1800825853;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld);
			this.da_fld = var1.cz();
			this.dk_fld = var1.cz();
			this.dx_fld = var1.cm();
			this.ds_fld = var1.cm();
			this.du_fld = var1.cm();
			this.db_fld = var1.cm();
			this.dl_fld = var1.cm();
			if (65535 == this.dl_fld) {
				this.dl_fld = -968762547;
			}

			this.di_fld = var1.cg() == 1;
			var1.cm();
			if (0 != this.bi_fld) {
				this.dg_fld = var1.cm();
			}

			if (this.bu_fld != 0) {
				var1.cm();
			}
		}

		if (4 == this.bx_fld) {
			this.de_fld = var1.cm();
			if (65535 == this.de_fld) {
				this.de_fld = 57339867;
			}

			this.dp_fld = xi.at(var1, -1686072473);
			this.es_fld = var1.cg();
			this.ep_fld = var1.cg();
			this.eb_fld = var1.cg();
			this.ed_fld = var1.cg() == 1;
			this.ca_fld = var1.co((byte)-92);
		}

		if (this.bx_fld == 3) {
			this.ca_fld = var1.co((byte)-84);
			this.cz_fld = var1.cg() == 1;
			this.cb_fld = var1.cg();
		}

		if (this.bx_fld == 9) {
			this.cu_fld = var1.cg();
			this.ca_fld = var1.co((byte)-74);
			this.ci_fld = var1.cg() == 1;
		}

		this.ec_fld = xi.lx(var1, 1601184486);
		this.eq_fld = xi.at(var1, -1071947454);
		int var2 = var1.cg();
		if (var2 > 0) {
			this.ei_fld = new String[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				this.ei_fld[var3] = xi.at(var1, -199356415);
			}
		}

		this.ev_fld = var1.cg();
		this.ey_fld = var1.cg();
		this.em_fld = var1.cg() == 1;
		this.el_fld = xi.at(var1, 989045272);
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
		this.fm_fld = this.ay(var1, 1984799128);
		this.fw_fld = this.ay(var1, 358102990);
		this.fg_fld = this.ay(var1, 1660277231);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cf(xi var1) {
		var1.cg();
		this.bj_fld = true;
		this.bx_fld = var1.cg();
		this.bp_fld = var1.cm() * -868651010;
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz();
		this.bw_fld = var1.cm() * -1701357480;
		if (9 == this.bx_fld) {
			this.ba_fld = var1.cz() * -1644924798;
		} else {
			this.ba_fld = var1.cm();
		}

		this.bi_fld = var1.cw() * 1320325300;
		this.bu_fld = var1.cw();
		this.bt_fld = var1.cw() * -1977540311;
		this.bv_fld = var1.cw() * -1615104396;
		this.cv_fld = var1.cm() * 1696815699;
		if (65535 == this.cv_fld) {
			this.cv_fld = -1995802935;
		} else {
			this.cv_fld = -1872657625 * ((this.bf_fld & 1673981763) + this.cv_fld);
		}

		this.cf_fld = var1.cg() == 1;
		if (0 == this.bx_fld) {
			this.cn_fld = var1.cm();
			this.cr_fld = var1.cm();
			this.hb_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 5) {
			this.cj_fld = var1.co((byte)-123);
			this.cl_fld = var1.cm();
			this.dc_fld = var1.cg() == 1;
			this.cb_fld = var1.cg() * 1213948940;
			this.dh_fld = var1.cg();
			this.dv_fld = var1.co((byte)-115);
			this.dz_fld = var1.cg() == 1;
			this.dt_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 6) {
			this.dm_fld = 658583697;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld);
			this.da_fld = var1.cz() * 2060613333;
			this.dk_fld = var1.cz() * 2070216514;
			this.dx_fld = var1.cm() * -1983433456;
			this.ds_fld = var1.cm();
			this.du_fld = var1.cm();
			this.db_fld = var1.cm();
			this.dl_fld = var1.cm();
			if (1975696353 == this.dl_fld) {
				this.dl_fld = 997960001;
			}

			this.di_fld = var1.cg() == 1;
			var1.cm();
			if (0 != this.bi_fld) {
				this.dg_fld = var1.cm();
			}

			if (this.bu_fld * 1483089828 != 0) {
				var1.cm();
			}
		}

		if (4 == this.bx_fld) {
			this.de_fld = var1.cm();
			if (1886587611 == this.de_fld) {
				this.de_fld = -529272795;
			}

			this.dp_fld = xi.at(var1, -104639611);
			this.es_fld = var1.cg();
			this.ep_fld = var1.cg() * 1579793947;
			this.eb_fld = var1.cg() * 1503082921;
			this.ed_fld = var1.cg() == 1;
			this.ca_fld = var1.co((byte)-85) * -1758080874;
		}

		if (this.bx_fld == 3) {
			this.ca_fld = var1.co((byte)-55);
			this.cz_fld = var1.cg() == 1;
			this.cb_fld = var1.cg() * 343872093;
		}

		if (this.bx_fld == 9) {
			this.cu_fld = var1.cg();
			this.ca_fld = var1.co((byte)-27) * -1170168797;
			this.ci_fld = var1.cg() == 1;
		}

		this.ec_fld = xi.lx(var1, -335086292);
		this.eq_fld = xi.at(var1, 1124431347);
		int var2 = var1.cg();
		if (var2 > 0) {
			this.ei_fld = new String[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				this.ei_fld[var3] = xi.at(var1, 224067346);
			}
		}

		this.ev_fld = var1.cg();
		this.ey_fld = var1.cg() * 131304914;
		this.em_fld = var1.cg() == 1;
		this.el_fld = xi.at(var1, -415877578);
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
				var3[var4] = var1.co((byte)-101);
			}

			return var3;
		}
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu createChild(int var1) {
		return this.qs(-1, var1);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Llw;ZLde;)Lyv;"
	)
	public yv ce(lw var1, boolean var2, de var3) {
		try {
			if (null != this.ct_fld) {
				yv var4 = aa(this, var1, var3, 521764807);
				if (var4 != null) {
					return var4;
				}
			}

			int var10;
			if (var2) {
				var10 = this.ch_fld;
			} else {
				var10 = this.cj_fld;
			}

			if (var10 == -1) {
				return null;
			} else {
				long var5 = ((this.dz_fld ? 1L : 0L) << 38) + ((long)this.dh_fld << 36) + var10 + ((this.dt_fld ? 1L : 0L) << 39) + ((long)this.dv_fld << 40);
				yv var7 = (yv)var1.as_fld.ak(var5);
				if (var7 != null) {
					return var7;
				} else {
					var7 = wf.av(var1.ae_fld, var10, 0);
					if (null == var7) {
						return null;
					} else {
						mg(this, var7, -1856571655);
						var1.as_fld.az(var7, var5);
						return var7;
					}
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lxi;)[Ljava/lang/Object;"
	)
	public static Object[] nx(lu var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var1.cg();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = (Object[])(new Object[var2]);

			for (int var4 = 0; var4 < var2; var4++) {
				int var5 = var1.cg();
				if (0 == var5) {
					var3[var4] = new Integer(var1.co((byte)-119));
				} else if (var5 == 1) {
					var3[var4] = xi.at(var1, -687701122);
				}
			}

			var0.eh_fld = true;
			return (Object[])var3;
		}
	}

	@ObfuscatedName("setRelativeX")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setRelativeX")
	@Override
	public void setRelativeX(int var1) {
		this.bq_fld = var1;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Llw;ZLde;)Lyv;"
	)
	public yv cn(lw var1, boolean var2, de var3) {
		try {
			if (null != this.ct_fld) {
				yv var4 = aa(this, var1, var3, 521764807);
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
					var7 = wf.av(var1.ae_fld, var10, 0);
					if (null == var7) {
						return null;
					} else {
						mg(this, var7, -1944439442);
						var1.as_fld.az(var7, var5);
						return var7;
					}
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Lyv;"
	)
	yv cr(lw var1, de var2) {
		if (!this.al(598842371)) {
			return this.af(var1, var2, (byte)0);
		} else {
			String var3 = this.ct_fld + (this.dz_fld ? 1 : 0) + (this.dt_fld ? 1 : 0) + this.dh_fld + this.dv_fld;
			yv var4 = (yv)(yv)var1.ax_fld.ag(var3);
			if (null == var4) {
				yv var5 = this.af(var1, var2, (byte)0);
				if (var5 != null) {
					var4 = var5.al();
					mg(this, var4, -1154549880);
					var1.ax_fld.az(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("getActions")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getActions")
	@Override
	public String[] getActions() {
		return this.ei_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;Lde;I)Lyv;"
	)
	public static yv aa(lu var0, lw var1, de var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.al(-978031646)) {
			return var0.af(var1, var2, (byte)0);
		} else {
			String var4 = var0.ct_fld + (var0.dz_fld ? 1 : 0) + (var0.dt_fld ? 1 : 0) + var0.dh_fld + var0.dv_fld;
			yv var5 = (yv)(yv)var1.ax_fld.ag(var4);
			if (null == var5) {
				yv var6 = var0.af(var1, var2, (byte)0);
				if (var6 != null) {
					var5 = var6.al();
					mg(var0, var5, -144005898);
					var1.ax_fld.az(var4, var5);
				}
			}

			return var5;
		}
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("createChild")
	@ObfuscatedSignature(
		descriptor = "(II)Lnet/runelite/api/widgets/Widget;"
	)
	@Export("createChild")
	@Override
	public Widget createChild(int var1, int var2) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			return this.qs(var1, var2);
		}
	}

	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public static boolean wd(lu var0) {
		return 11 == var0.bx_fld || 12 == var0.bx_fld;
	}

	@ObfuscatedName("setChildren")
	@ObfuscatedSignature(
		descriptor = "([Lnet/runelite/api/widgets/Widget;)V"
	)
	@Export("setChildren")
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

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setHidden(boolean var1) {
		this.cf_fld = var1;
		return this;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void en(int var1, int var2) {
		if (11 == this.bx_fld) {
			if (this.hd_fld == null) {
				this.bd(-487250190);
			}

			this.hd_fld.put(var1, var2);
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Llu;"
	)
	public lu setName(String var1) {
		this.jo(var1.replace(' ', ' '));
		return this;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOriginalHeight(int var1) {
		this.ba_fld = var1;
		return this;
	}

	@ObfuscatedName("ym")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setContentType(int var1) {
		this.bp_fld = var1;
		return this;
	}

	@ObfuscatedName("setForcedPosition")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Export("setForcedPosition")
	@Override
	public void setForcedPosition(int var1, int var2) {
		this.wh_fld = (short)var1;
		this.yp_fld = (short)var2;
		this.setRelativeX(var1);
		this.setRelativeY(var2);
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setSpriteId(int var1) {
		this.cj_fld = var1;
		return this;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	public int bf(short var1) {
		if (11 == this.bx_fld && this.hi_fld != null && null != this.he_fld && !this.he_fld.isEmpty()) {
			String var2 = this.hi_fld.al();
			return null != var2 && this.he_fld.containsKey(this.hi_fld.al()) ? (Integer)this.he_fld.get(var2) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("setOnKeyListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnKeyListener")
	@Override
	public void setOnKeyListener(Object[] var1) {
		this.fu_fld = (Object[])var1;
	}

	@ObfuscatedName("setAction")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	@Export("setAction")
	@Override
	public void setAction(int var1, String var2) {
		this.ai(var1, var2, 1385349242);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Lyv;"
	)
	yv cw(lw var1, de var2) {
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

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setWidthMode(int var1) {
		this.bi_fld = var1;
		return this;
	}

	@ObfuscatedName("setNoClickThrough")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setNoClickThrough")
	@Override
	public void setNoClickThrough(boolean var1) {
		this.hb_fld = var1;
	}

	@ObfuscatedName("getOriginalWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOriginalWidth")
	@Override
	public int getOriginalWidth() {
		return this.bw_fld;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Lyv;"
	)
	yv cm(lw var1, de var2) {
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

	@ObfuscatedName("setDragDeadTime")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setDragDeadTime")
	@Override
	public void setDragDeadTime(int var1) {
		this.ey_fld = var1;
	}

	@ObfuscatedName("setFlippedHorizontally")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setFlippedHorizontally")
	@Override
	public void setFlippedHorizontally(boolean var1) {
		this.dt_fld = var1;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cb() {
		return this.dz_fld || this.dt_fld || 0 != this.dh_fld || this.dv_fld != 0;
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

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public static boolean lg(lu var0) {
		return 11 == var0.bx_fld || 12 == var0.bx_fld;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ck() {
		return this.dz_fld || this.dt_fld || 0 != this.dh_fld || -679869938 * this.dv_fld != 0;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	void co(yv var1) {
		if (this.dz_fld) {
			var1.aq();
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	void cu(yv var1) {
		if (this.dz_fld) {
			var1.aq();
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
					var2 = dv.ae(var1.ae_fld, var1.ah_fld, this.de_fld, 0);
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

	@ObfuscatedName("setOnDialogAbortListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnDialogAbortListener")
	@Override
	public void setOnDialogAbortListener(Object[] var1) {
		this.gn_fld = (Object[])var1;
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
					var2 = dv.ae(var1.ae_fld, var1.ah_fld, this.de_fld, 0);
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
	@Export("getAnimationId")
	@Override
	public int getAnimationId() {
		return this.dl_fld;
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void qz(int var1) {
		if (this.yp_fld > -1) {
			this.setRelativeY(this.yp_fld);
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
							var13 = eg.ak(var1.av_fld, var9, 0);
							break;
						case 2:
							var13 = pp.tv(var6, null, -1225350609);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)39) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = og.fn(var16, 10);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = pp.tv(var6, var7, -1460889653);
					}

					if (null == var13) {
						return null;
					}

					var12 = eg.et(var13, var14, var15, -50, -10, -50);
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

	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llw;ZI)Lkp;"
	)
	public static kp qv(lu var0, lw var1, boolean var2, int var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var0.ch_fld == -1) {
				var2 = false;
			}

			int var4 = var2 ? var0.ch_fld : var0.cj_fld;
			if (-1 == var4) {
				return null;
			} else {
				long var5 = ((long)var0.dv_fld << 40) + ((var0.dt_fld ? 1L : 0L) << 39) + ((var0.dz_fld ? 1L : 0L) << 38) + var4 + ((long)var0.dh_fld << 36);
				kp var7 = (kp)var1.al_fld.ak(var5);
				if (var7 != null) {
					return var7;
				} else {
					yv var8 = var0.as(var1, var2, null, -423043034);
					if (var8 == null) {
						return null;
					} else {
						yv var9 = yv.vo(var8);
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

	@ObfuscatedName("setTargetVerb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Export("setTargetVerb")
	@Override
	public void setTargetVerb(String var1) {
		this.el_fld = var1;
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
							var13 = eg.ak(var1.av_fld, var9, 0);
							break;
						case 2:
							var13 = pp.tv(var6, null, -1368018730);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)118) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = og.fn(var16, 10);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = pp.tv(var6, var7, -2094152470);
					}

					if (null == var13) {
						return null;
					}

					var12 = eg.et(var13, var14, var15, -1350575517, -10, -50);
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

	@ObfuscatedName("getRotationY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRotationY")
	@Override
	public int getRotationY() {
		return this.du_fld;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Llw;Z)Lkp;"
	)
	public kp dz(lw var1, boolean var2) {
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
					yv var7 = this.as(var1, var2, null, -423043034);
					if (var7 == null) {
						return null;
					} else {
						yv var8 = yv.vo(var7);
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

	@ObfuscatedName("getItemId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getItemId")
	@Override
	public int getItemId() {
		return this.ga_fld;
	}

	@ObfuscatedName("revalidateScroll")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("revalidateScroll")
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
				client.jm(cf.cg_fld.aw_fld[WidgetUtil.componentToInterface(this.getId())], this, false, cf.cg_fld, client.cz_fld);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] ud() {
		return this.gf_fld;
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

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Llw;Z)Lkp;"
	)
	public kp cr(lw var1, boolean var2) {
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
					yv var7 = this.as(var1, var2, null, -423043034);
					if (var7 == null) {
						return null;
					} else {
						yv var8 = yv.vo(var7);
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

	@ObfuscatedName("getTargetVerb")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getTargetVerb")
	@Override
	public String getTargetVerb() {
		return this.el_fld;
	}

	@ObfuscatedName("getRelativeX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRelativeX")
	@Override
	public int getRelativeX() {
		return this.bq_fld;
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setScrollHeight(int var1) {
		this.cr_fld = var1;
		return this;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setFilled(boolean var1) {
		this.cz_fld = var1;
		return this;
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

	@ObfuscatedName("setRelativeY")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setRelativeY")
	@Override
	public void setRelativeY(int var1) {
		this.bg_fld = var1;
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

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ea() {
		return !this.bj_fld || 0 == this.bx_fld || this.bx_fld == 11 || this.eh_fld || -1182342613 == this.bp_fld || this.bx_fld == 12;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dl() {
		return this.hn_fld == 2;
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

			int var3 = var2 ? this.ch_fld * -397786198 : this.cj_fld;
			if (-1 == var3) {
				return null;
			} else {
				long var4 = ((long)this.dv_fld << 735178423)
					+ ((this.dt_fld ? 1L : 0L) << 384065631)
					+ ((this.dz_fld ? 1L : 0L) << 38)
					+ var3
					+ ((long)(1261731204 * this.dh_fld) << 36);
				kp var6 = (kp)var1.al_fld.ak(var4);
				if (var6 != null) {
					return var6;
				} else {
					yv var7 = this.as(var1, var2, null, -423043034);
					if (var7 == null) {
						return null;
					} else {
						yv var8 = yv.vo(var7);
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

	@ObfuscatedName("setOnMouseOverListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnMouseOverListener")
	@Override
	public void setOnMouseOverListener(Object[] var1) {
		this.fp_fld = (Object[])var1;
	}

	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setOriginalX(int var1) {
		this.bn_fld = var1;
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

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHeight")
	@Override
	public int getHeight() {
		return this.cd_fld;
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setModelZoom(int var1) {
		this.db_fld = var1;
		return this;
	}

	@ObfuscatedName("getOpacity")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOpacity")
	@Override
	public int getOpacity() {
		return this.cb_fld;
	}

	@ObfuscatedName("isFlippedHorizontally")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isFlippedHorizontally")
	@Override
	public boolean isFlippedHorizontally() {
		return this.dt_fld;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lol;IZLlp;Lpp;Lpg;)Lfn;"
	)
	public fn dh(lw var1, ol var2, int var3, boolean var4, lp var5, pp var6, pg var7) {
		try {
			int var8;
			int var9;
			if (var4) {
				var8 = this.do_fld;
				var9 = this.dd_fld;
			} else {
				var8 = -1327120964 * this.dm_fld;
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
							var13 = eg.ak(var1.av_fld, var9, 0);
							break;
						case 2:
							var13 = pp.tv(var6, null, -1182492629);
							break;
						case 3:
							var13 = null != var5 ? var5.af((byte)68) : null;
							break;
						case 4:
							og var16 = kb.ag(var9, -1752383175);
							var13 = og.fn(var16, 10);
							var14 += var16.ee_fld;
							var15 += var16.ek_fld;
						case 5:
						default:
							break;
						case 6:
							var13 = pp.tv(var6, var7, -1786042404);
					}

					if (null == var13) {
						return null;
					}

					var12 = eg.et(var13, var14, var15, 1082413838, -1810226375, -2111060588);
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

	@ObfuscatedName("setOnTargetLeaveListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnTargetLeaveListener")
	@Override
	public void setOnTargetLeaveListener(Object[] var1) {
		this.fc_fld = (Object[])var1;
	}

	@ObfuscatedName("setWidth")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setWidth")
	@Override
	public void setWidth(int var1) {
		this.bb_fld = var1;
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

	@ObfuscatedName("setOnMouseLeaveListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnMouseLeaveListener")
	@Override
	public void setOnMouseLeaveListener(Object[] var1) {
		this.fv_fld = (Object[])var1;
	}

	@ObfuscatedName("setOnMouseRepeatListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnMouseRepeatListener")
	@Override
	public void setOnMouseRepeatListener(Object[] var1) {
		this.fx_fld = (Object[])var1;
	}

	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "(II)Llu;"
	)
	public lu qs(int var1, int var2) {
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
			var3.jt(true);
			lu var4 = og.ci_fld.getWidget(this.bf_fld);
			if (!yr_fld && var4 != this && this.by_fld == -1) {
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
					if (!yr_fld && this.getType() != 0) {
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

	@ObfuscatedName("getOriginalX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOriginalX")
	@Override
	public int getOriginalX() {
		return this.bn_fld;
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Lyv;"
	)
	yv cg(lw var1, de var2) {
		if (!this.al(1198270595)) {
			return this.af(var1, var2, (byte)0);
		} else {
			String var3 = this.ct_fld + (this.dz_fld ? 1 : 0) + (this.dt_fld ? 1 : 0) + 183253571 * this.dh_fld + 434808463 * this.dv_fld;
			yv var4 = (yv)(yv)var1.ax_fld.ag(var3);
			if (null == var4) {
				yv var5 = this.af(var1, var2, (byte)0);
				if (var5 != null) {
					var4 = var5.al();
					mg(this, var4, -135145051);
					var1.ax_fld.az(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("getDragDeadZone")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getDragDeadZone")
	@Override
	public int getDragDeadZone() {
		return this.ev_fld;
	}

	public lu() {
		this.wh_fld = -1;
		this.yp_fld = -1;
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
		this.ik(-1);
		this.bg_fld = 0;
		this.qz(-1);
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

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setItemQuantity(int var1) {
		this.gd_fld = var1;
		return this;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Llw;I)V"
	)
	void bp(lw var1, int var2) {
		this.hb_fld = true;
		ArrayList var3 = this.hi_fld.as();
		ArrayList var4 = this.hi_fld.ar();
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
			var13.de_fld = (Integer)this.hd_fld.get(var12.ay_fld);
			var13.ep_fld = var12.ah_fld * 224036757;
			var13.eb_fld = 992230371 * var12.aw_fld;
			this.ge_fld[var6++] = var13;
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

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ei() {
		return !this.bj_fld || 0 == this.bx_fld || this.bx_fld == 11 || this.eh_fld || 691281195 == this.bp_fld || this.bx_fld == 12;
	}

	@ObfuscatedName("isFilled")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isFilled")
	@Override
	public boolean isFilled() {
		return this.cz_fld;
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

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	public void es(int var1, Object var2) {
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

		this.hs_fld[this.hl_fld * -379722129] = var1;
		this.hq_fld[this.hl_fld] = var2;
		this.hl_fld += 344559068;
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setItemQuantityMode(int var1) {
		this.df_fld = var1;
		return this;
	}

	@ObfuscatedName("setOnReleaseListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnReleaseListener")
	@Override
	public void setOnReleaseListener(Object[] var1) {
		this.fa_fld = (Object[])var1;
	}

	@ObfuscatedName("setOnTimerListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnTimerListener")
	@Override
	public void setOnTimerListener(Object[] var1) {
		this.fn_fld = (Object[])var1;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long dy(int var1, long var2) {
		for (int var4 = 0; var4 < this.hl_fld; var4++) {
			if (var1 == this.hs_fld[var4]) {
				return (Long)this.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("setOnTargetEnterListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnTargetEnterListener")
	@Override
	public void setOnTargetEnterListener(Object[] var1) {
		this.fk_fld = (Object[])var1;
	}

	@ObfuscatedName("getContentType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getContentType")
	@Override
	public int getContentType() {
		return this.bp_fld;
	}

	@ObfuscatedName("getXPositionMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getXPositionMode")
	@Override
	public int getXPositionMode() {
		return this.bt_fld;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lde;J)V"
	)
	public void eb(String var1, String var2, de var3, long var4) {
		if (this.bx_fld == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.hi_fld = new ma();
			if (!this.hi_fld.ag(var1, var2, var3)) {
				this.hi_fld = null;
			} else {
				if (this.hd_fld == null || null == this.he_fld) {
					this.bd(-1190035852);
				}
			}
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde;)V"
	)
	public void ed(String var1, String var2, String var3, String var4, String var5, de var6) {
		try {
			this.hi_fld = new ma();
			if (!this.hi_fld.ag(var1, var3, var6)) {
				this.hi_fld = null;
			} else {
				if (null == this.hd_fld || null == this.he_fld) {
					this.bd(-1292691591);
				}

				this.hi_fld.az(var2, var4, var5);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void oo(int var1) {
		this.vi_fld = var1;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long di(int var1, long var2) {
		for (int var4 = 0; var4 < this.hl_fld; var4++) {
			if (var1 == this.hs_fld[var4]) {
				return (Long)this.hq_fld[var4];
			}
		}

		return var2;
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

			int var3 = var2 ? this.ch_fld * -1633846296 : this.cj_fld * -423108784;
			if (-1 == var3) {
				return null;
			} else {
				long var4 = ((long)(1687104053 * this.dv_fld) << 1119072921)
					+ ((this.dt_fld ? 1L : 0L) << 39)
					+ ((this.dz_fld ? 1L : 0L) << 42621897)
					+ var3
					+ ((long)(-1358680044 * this.dh_fld) << -1215926208);
				kp var6 = (kp)var1.al_fld.ak(var4);
				if (var6 != null) {
					return var6;
				} else {
					yv var7 = this.as(var1, var2, null, -423043034);
					if (var7 == null) {
						return null;
					} else {
						yv var8 = yv.vo(var7);
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

	@ObfuscatedName("getRelativeY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRelativeY")
	@Override
	public int getRelativeY() {
		return this.bg_fld;
	}

	@ObfuscatedName("getXTextAlignment")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getXTextAlignment")
	@Override
	public int getXTextAlignment() {
		return this.ep_fld;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llp;Z)V"
	)
	public static void jf(lu var0, lp var1, boolean var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.dm_fld = 279120917;
			var0.dy_fld = new lp(var1);
			if (!var2) {
				var0.dy_fld.af_fld = Arrays.copyOf(var0.dy_fld.ar_fld, var0.dy_fld.ar_fld.length);
				var0.dy_fld.au((short)24638);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z"
	)
	public boolean be(int var1, int var2, int var3, int var4, int var5) {
		if (this.bx_fld == 11 && this.hi_fld != null && this.bs_boolean(993637541)) {
			var1 -= var3;
			var2 -= var4;
			int var6 = (int)(this.hi_fld.au()[0] * this.bb_fld);
			int var7 = (int)(this.hi_fld.au()[1] * this.cd_fld);
			int var8 = var6 + (int)(this.hi_fld.au()[2] * this.bb_fld);
			int var9 = var7 + (int)(this.hi_fld.au()[3] * this.cd_fld);
			return var1 >= var6 && var2 >= var7 && var1 < var8 && var2 < var9;
		} else {
			return false;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()Lym;"
	)
	public ym hv() {
		return this.ck_fld;
	}

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;)I"
	)
	public static int uk(lu var0, String var1) {
		return 11 == var0.bx_fld && var0.hi_fld != null && var0.bs_boolean(2080050142) ? ma.rs(var0.hi_fld, var1, -1231403784) : -1;
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void er() {
		this.hd_fld = new HashMap();
		this.he_fld = new HashMap();
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setRotationY(int var1) {
		this.du_fld = var1;
		return this;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ez() {
		this.hd_fld = new HashMap();
		this.he_fld = new HashMap();
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getCanvasLocation")
	@Override
	public Point getCanvasLocation() {
		return new Point(this.mv_fld, this.vi_fld);
	}

	@ObfuscatedName("getHeightMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHeightMode")
	@Override
	public int getHeightMode() {
		return this.bu_fld;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Z"
	)
	public boolean gc(lw var1) {
		try {
			li var2 = ax(this, -1147767225);
			if (var2 == null) {
				return false;
			} else {
				boolean var3 = false;
				if (!var2.cq() && this.de_fld != -1) {
					int var4 = li.nf(var2, -2134230596);
					int var5 = var2.cy();
					int var6 = var2.cc();
					int var7 = li.em(var2, (byte)6);
					zf var8 = this.ax(var1, (byte)11);
					if (null != var8) {
						var3 |= li.kw(var2, var8, 858118665);
						var3 |= this.bc(var2, 55221958);
						var3 |= var2.al(var4, var5);
						var3 |= var2.ap(var6, var7);
					}
				} else if (var2.cq()) {
					var3 |= this.bc(var2, 55221958);
				}

				var2.ak();
				return var3;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
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
			Iterator var4 = this.hi_fld.af().iterator();

			while (var4.hasNext()) {
				mu var5 = (mu)(mu)var4.next();
				if (!mu.wi(var5, (byte)1).equals("user_id")) {
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

	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde;)V"
	)
	public static void wb(lu var0, String var1, String var2, String var3, String var4, String var5, de var6) throws UnsupportedEncodingException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.hi_fld = new ma();
			if (!var0.hi_fld.ag(var1, var3, var6)) {
				var0.hi_fld = null;
			} else {
				if (null == var0.hd_fld || null == var0.he_fld) {
					var0.bd(-1885406961);
				}

				var0.hi_fld.az(var2, var4, var5);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void jo(String var1) {
		this.eq_fld = var1;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean eq(int var1, int var2, int var3, int var4) {
		if (this.bx_fld == 11 && this.hi_fld != null && this.bs_boolean(409790418)) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.hi_fld.au()[0] * this.bb_fld);
			int var6 = (int)(this.hi_fld.au()[1] * this.cd_fld);
			int var7 = var5 + (int)(this.hi_fld.au()[2] * this.bb_fld);
			int var8 = var6 + (int)(this.hi_fld.au()[3] * this.cd_fld);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "()Lln;"
	)
	public ln fd() {
		return this.hk_fld != null ? this.hk_fld.ag_fld : null;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fy() {
		return this.he_fld != null && !this.he_fld.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ek() {
		return this.hn_fld == 2;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int ev(String var1) {
		return 11 == this.bx_fld && this.hi_fld != null && this.bs_boolean(1548761245) ? ma.rs(this.hi_fld, var1, 838849613) : -1;
	}

	@ObfuscatedName("getOriginalY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOriginalY")
	@Override
	public int getOriginalY() {
		return this.bc_fld;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean ef(int var1, int var2, int var3, int var4) {
		if (this.bx_fld == 11 && this.hi_fld != null && this.bs_boolean(1700161566)) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.hi_fld.au()[0] * this.bb_fld);
			int var6 = (int)(this.hi_fld.au()[1] * this.cd_fld);
			int var7 = var5 + (int)(this.hi_fld.au()[2] * this.bb_fld);
			int var8 = var6 + (int)(this.hi_fld.au()[3] * this.cd_fld);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eu() {
		return this.he_fld != null && !this.he_fld.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ej() {
		return this.he_fld != null && !this.he_fld.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Z"
	)
	public boolean ff(lw var1) {
		try {
			li var2 = ax(this, -1205306763);
			if (var2 == null) {
				return false;
			} else {
				boolean var3 = false;
				if (!var2.cq() && this.de_fld != -1) {
					int var4 = li.nf(var2, -2139917579);
					int var5 = var2.cy();
					int var6 = var2.cc();
					int var7 = li.em(var2, (byte)-64);
					zf var8 = this.ax(var1, (byte)-2);
					if (null != var8) {
						var3 |= li.kw(var2, var8, -420224509);
						var3 |= this.bc(var2, 55221958);
						var3 |= var2.al(var4, var5);
						var3 |= var2.ap(var6, var7);
					}
				} else if (var2.cq()) {
					var3 |= this.bc(var2, 55221958);
				}

				var2.ak();
				return var3;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fa() {
		if (11 == this.bx_fld && this.hi_fld != null && null != this.he_fld && !this.he_fld.isEmpty()) {
			String var1 = this.hi_fld.al();
			return null != var1 && this.he_fld.containsKey(this.hi_fld.al()) ? (Integer)this.he_fld.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("getRotationZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRotationZ")
	@Override
	public int getRotationZ() {
		return this.ds_fld;
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
				if (this.hd_fld == null || null == this.he_fld) {
					this.bd(-1435034261);
				}
			}
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] fx() {
		if (this.bx_fld == 11 && this.hi_fld != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.hi_fld.af().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				if (!mu.wi(var4, (byte)1).equals("user_id")) {
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

	@ObfuscatedName("setOnOpListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnOpListener")
	@Override
	public void setOnOpListener(Object[] var1) {
		this.ft_fld = (Object[])var1;
	}

	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setItemId(int var1) {
		this.ga_fld = var1;
		return this;
	}

	@ObfuscatedName("setNoScrollThrough")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setNoScrollThrough")
	@Override
	public void setNoScrollThrough(boolean var1) {
		this.hf_fld = var1;
	}

	@ObfuscatedName("setOnClickListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnClickListener")
	@Override
	public void setOnClickListener(Object[] var1) {
		this.ej_fld = (Object[])var1;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "()Lsc;"
	)
	public sc fs() {
		return this.hk_fld != null ? this.hk_fld.az_fld : null;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;)Z"
	)
	public boolean fc(lw var1, de var2) {
		if (11 == this.bx_fld && null != this.hi_fld) {
			ma.dh(this.hi_fld, var2, 2104391350);
			if (this.hi_fld.ae() != this.hn_fld) {
				this.hn_fld = this.hi_fld.ae();
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

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Llw;)V"
	)
	void fm(lw var1) {
		this.hb_fld = true;
		ArrayList var2 = this.hi_fld.as();
		ArrayList var3 = this.hi_fld.ar();
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
			var12.de_fld = (Integer)this.hd_fld.get(var11.ay_fld);
			var12.ep_fld = var11.ah_fld * 224036757;
			var12.eb_fld = 992230371 * var11.aw_fld;
			this.ge_fld[var5++] = var12;
		}
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Llu;"
	)
	public lu setPos(int var1, int var2, int var3, int var4) {
		return this.setOriginalX(var1).setOriginalY(var2).setXPositionMode(var3).setYPositionMode(var4);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;"
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

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "()Lli;"
	)
	public li fn() {
		return this.hk_fld != null ? this.hk_fld.ak_fld : null;
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
		return this.bx_fld == 11 && null != this.hi_fld && this.bs_boolean(1000795609) ? this.hi_fld.ay(var1) : null;
	}

	@ObfuscatedName("setFlippedVertically")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setFlippedVertically")
	@Override
	public void setFlippedVertically(boolean var1) {
		this.dz_fld = var1;
	}

	@ObfuscatedName("getFontId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getFontId")
	@Override
	public int getFontId() {
		return this.de_fld;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Llu;ILjava/lang/Object;I)Ljava/lang/Object;"
	)
	public static Object go(lu var0, int var1, Object var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			for (int var4 = 0; var4 < var0.hl_fld; var4++) {
				if (var1 == var0.hs_fld[var4]) {
					return var0.hq_fld[var4];
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("getOnVarTransmitListener")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Export("getOnVarTransmitListener")
	@Override
	public Object[] getOnVarTransmitListener() {
		return (Object[])this.fh_fld;
	}

	@ObfuscatedName("setVarTransmitTrigger")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	@Export("setVarTransmitTrigger")
	@Override
	public void setVarTransmitTrigger(int[] var1) {
		this.fm_fld = var1;
	}

	@ObfuscatedName("setOnHoldListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnHoldListener")
	@Override
	public void setOnHoldListener(Object[] var1) {
		this.fo_fld = (Object[])var1;
	}

	@ObfuscatedName("isFlippedVertically")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isFlippedVertically")
	@Override
	public boolean isFlippedVertically() {
		return this.dz_fld;
	}

	@ObfuscatedName("setOnVarTransmitListener")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)V"
	)
	@Export("setOnVarTransmitListener")
	@Override
	public void setOnVarTransmitListener(Object[] var1) {
		this.fh_fld = (Object[])var1;
	}

	@ObfuscatedName("getType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getType")
	@Override
	public int getType() {
		return this.bx_fld;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "()Lln;"
	)
	public ln fq() {
		return this.hk_fld != null ? this.hk_fld.ag_fld : null;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "()Lsc;"
	)
	public sc fr() {
		return this.hk_fld != null ? this.hk_fld.az_fld : null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;Lde;)V"
	)
	public static void bz(lu var0, String var1, de var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.bx_fld == 11 && null != var1) {
			var0.hi_fld = new ma();
			var0.hi_fld.aq(var1, var2);
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Z)Llu;"
	)
	public lu setHasListener(boolean var1) {
		this.eh_fld = var1;
		return this;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setAnimationId(int var1) {
		this.dl_fld = var1;
		return this;
	}

	@ObfuscatedName("getDynamicChildren")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/widgets/Widget;"
	)
	@Export("getDynamicChildren")
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
						if (!yr_fld && var7.cv_fld != this.bf_fld) {
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

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "()Lld;"
	)
	public ld fi() {
		return this.hk_fld;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Lli;)Z"
	)
	boolean fz(li var1) {
		boolean var2 = false;
		if (null != this.dp_fld && !this.dp_fld.isEmpty()) {
			var2 |= var1.av(bw.ax(this.dp_fld));
			this.dp_fld = "";
		}

		if (this.dj_fld != null && !this.dj_fld.isEmpty()) {
			String var6 = this.dj_fld;
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
			var2 |= li.wh(var1, var5, (short)-14060);
			this.dj_fld = "";
		}

		return var2;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cq(xi var1) {
		this.bj_fld = false;
		this.bx_fld = var1.cg();
		this.bo_fld = var1.cg() * -353273877;
		this.bp_fld = var1.cm() * -373959816;
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz();
		this.bw_fld = var1.cm() * -803187643;
		this.ba_fld = var1.cm() * -1723821249;
		this.cb_fld = var1.cg();
		this.cv_fld = var1.cm();
		if (this.cv_fld == 65535) {
			this.cv_fld = -429499679;
		} else {
			this.cv_fld = ((this.bf_fld & -336334651) + this.cv_fld) * 450079110;
		}

		this.gk_fld = var1.cm();
		if (this.gk_fld == -274481432) {
			this.gk_fld = 1643570708;
		}

		int var2 = var1.cg();
		if (var2 > 0) {
			this.gp_fld = new int[var2];
			this.gv_fld = new int[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				this.gp_fld[var3] = var1.cg();
				this.gv_fld[var3] = var1.cm();
			}
		}

		int var7 = var1.cg();
		if (var7 > 0) {
			this.gu_fld = new int[var7][];

			for (int var4 = 0; var4 < var7; var4++) {
				int var5 = var1.cm();
				this.gu_fld[var4] = new int[var5];

				for (int var6 = 0; var6 < var5; var6++) {
					this.gu_fld[var4][var6] = var1.cm();
					if (this.gu_fld[var4][var6] == 65535) {
						this.gu_fld[var4][var6] = -1;
					}
				}
			}
		}

		if (0 == this.bx_fld) {
			this.cr_fld = var1.cm() * -1842719791;
			this.cf_fld = var1.cg() == 1;
		}

		if (1 == this.bx_fld) {
			var1.cm();
			var1.cg();
		}

		if (3 == this.bx_fld) {
			this.cz_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4 || 1 == this.bx_fld) {
			this.ep_fld = var1.cg();
			this.eb_fld = var1.cg() * -567204055;
			this.es_fld = var1.cg() * 103930364;
			this.de_fld = var1.cm() * 1133677321;
			if (1719725822 == this.de_fld) {
				this.de_fld = 57339867;
			}

			this.ed_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4) {
			this.dp_fld = xi.at(var1, 815637553);
			this.dj_fld = xi.at(var1, 1671682000);
		}

		if (this.bx_fld == 1 || 3 == this.bx_fld || this.bx_fld == 4) {
			this.ca_fld = var1.co((byte)-128) * -1943764605;
		}

		if (3 == this.bx_fld || 4 == this.bx_fld) {
			this.cg_fld = var1.co((byte)-128) * 966531967;
			this.cw_fld = var1.co((byte)-76);
			this.cm_fld = var1.co((byte)-86);
		}

		if (5 == this.bx_fld) {
			this.cj_fld = var1.co((byte)-2) * -1730676206;
			this.ch_fld = var1.co((byte)-55);
		}

		if (this.bx_fld == 6) {
			this.dm_fld = 1445345206;
			this.do_fld = -1082400781;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld);
			this.dd_fld = var1.dl(wa.ak_fld.az_fld) * 1629857022;
			this.dl_fld = var1.cm();
			if (862202823 == this.dl_fld) {
				this.dl_fld = -968762547;
			}

			this.dr_fld = var1.cm();
			if (this.dr_fld == 65535) {
				this.dr_fld = -1475529628;
			}

			this.db_fld = var1.cm();
			this.dx_fld = var1.cm() * -1407212792;
			this.ds_fld = var1.cm();
		}

		if (this.bx_fld == 8) {
			this.dp_fld = xi.at(var1, 2110443202);
		}

		if (2 == this.bo_fld) {
			this.el_fld = xi.at(var1, -1521167236);
			this.gi_fld = xi.at(var1, -1664600108);
			int var8 = var1.cm() & 1030340648;
			this.ec_fld = -150017922 * (this.ec_fld | var8 << 11);
		}

		if (this.bo_fld == 1 || 4 == this.bo_fld || this.bo_fld == 5 || this.bo_fld == 6) {
			this.gq_fld = xi.at(var1, 2052085867);
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

	@ObfuscatedName("isHidden")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isHidden")
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

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Z"
	)
	public boolean gg(lw var1) {
		try {
			li var2 = ax(this, -1810286143);
			if (var2 == null) {
				return false;
			} else {
				boolean var3 = false;
				if (!var2.cq() && this.de_fld != -1) {
					int var4 = li.nf(var2, -2137260516);
					int var5 = var2.cy();
					int var6 = var2.cc();
					int var7 = li.em(var2, (byte)-28);
					zf var8 = this.ax(var1, (byte)-18);
					if (null != var8) {
						var3 |= li.kw(var2, var8, -1566108131);
						var3 |= this.bc(var2, 55221958);
						var3 |= var2.al(var4, var5);
						var3 |= var2.ap(var6, var7);
					}
				} else if (var2.cq()) {
					var3 |= this.bc(var2, 55221958);
				}

				var2.ak();
				return var3;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		return this.zc().replace(' ', ' ');
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Llw;)Z"
	)
	public boolean go(lw var1) {
		try {
			li var2 = ax(this, -678495960);
			if (var2 == null) {
				return false;
			} else {
				boolean var3 = false;
				if (!var2.cq() && this.de_fld != -1) {
					int var4 = li.nf(var2, -2142353832);
					int var5 = var2.cy();
					int var6 = var2.cc();
					int var7 = li.em(var2, (byte)-33);
					zf var8 = this.ax(var1, (byte)-30);
					if (null != var8) {
						var3 |= li.kw(var2, var8, -1262338624);
						var3 |= this.bc(var2, 55221958);
						var3 |= var2.al(var4, var5);
						var3 |= var2.ap(var6, var7);
					}
				} else if (var2.cq()) {
					var3 |= this.bc(var2, 55221958);
				}

				var2.ak();
				return var3;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	static void ai(boolean var0, byte var1) {
		if (!client.de(og.ci_fld, (byte)9)) {
			if (var1 == 18) {
				return;
			}

			if (!og.ci_fld.ie(-290013867)) {
				if (var1 == 18) {
					return;
				}

				if (!og.ci_fld.iz(-988962053)) {
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Lli;"
	)
	public static li ax(lu var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.hk_fld != null ? var0.hk_fld.ak_fld : null;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ik(int var1) {
		if (this.wh_fld > -1) {
			this.setRelativeX(this.wh_fld);
		}
	}

	@ObfuscatedName("setBorderType")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setBorderType")
	@Override
	public void setBorderType(int var1) {
		this.dh_fld = var1;
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Llu;)[I"
	)
	public static int[] nd(lu var0) {
		if (var0.bx_fld == 11 && var0.hi_fld != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = var0.hi_fld.af().iterator();

			while (var3.hasNext()) {
				mu var4 = (mu)(mu)var3.next();
				if (!mu.wi(var4, (byte)1).equals("user_id")) {
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

	@ObfuscatedName("getChild")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/widgets/Widget;"
	)
	@Export("getChild")
	@Override
	public Widget getChild(int var1) {
		lu[] var2 = this.getChildren();
		return var2 != null && var1 >= 0 && var1 < var2.length ? var2[var1] : null;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cv(xi var1) {
		this.bj_fld = false;
		this.bx_fld = var1.cg();
		this.bo_fld = var1.cg();
		this.bp_fld = var1.cm() * 1974271862;
		this.bn_fld = var1.cz();
		this.bc_fld = var1.cz() * 2026791513;
		this.bw_fld = var1.cm();
		this.ba_fld = var1.cm() * -227866188;
		this.cb_fld = var1.cg() * 1231864795;
		this.cv_fld = var1.cm() * 1288719269;
		if (this.cv_fld == 65535) {
			this.cv_fld = -1995802935;
		} else {
			this.cv_fld = ((this.bf_fld & -1997328292) + this.cv_fld) * 1336580762;
		}

		this.gk_fld = var1.cm() * -1318914841;
		if (this.gk_fld == 2027538977) {
			this.gk_fld = 26740389;
		}

		int var2 = var1.cg();
		if (var2 > 0) {
			this.gp_fld = new int[var2];
			this.gv_fld = new int[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				this.gp_fld[var3] = var1.cg();
				this.gv_fld[var3] = var1.cm();
			}
		}

		int var7 = var1.cg();
		if (var7 > 0) {
			this.gu_fld = new int[var7][];

			for (int var4 = 0; var4 < var7; var4++) {
				int var5 = var1.cm();
				this.gu_fld[var4] = new int[var5];

				for (int var6 = 0; var6 < var5; var6++) {
					this.gu_fld[var4][var6] = var1.cm();
					if (this.gu_fld[var4][var6] == 1201234438) {
						this.gu_fld[var4][var6] = -1;
					}
				}
			}
		}

		if (0 == this.bx_fld) {
			this.cr_fld = var1.cm();
			this.cf_fld = var1.cg() == 1;
		}

		if (1 == this.bx_fld) {
			var1.cm();
			var1.cg();
		}

		if (3 == this.bx_fld) {
			this.cz_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4 || 1 == this.bx_fld) {
			this.ep_fld = var1.cg() * 962627214;
			this.eb_fld = var1.cg() * 72253439;
			this.es_fld = var1.cg() * 1094656221;
			this.de_fld = var1.cm();
			if (65535 == this.de_fld) {
				this.de_fld = 1883807713;
			}

			this.ed_fld = var1.cg() == 1;
		}

		if (this.bx_fld == 4) {
			this.dp_fld = xi.at(var1, -851276072);
			this.dj_fld = xi.at(var1, -362622819);
		}

		if (this.bx_fld == 1 || 3 == this.bx_fld || this.bx_fld == 4) {
			this.ca_fld = var1.co((byte)-120);
		}

		if (3 == this.bx_fld || 4 == this.bx_fld) {
			this.cg_fld = var1.co((byte)-84) * -1431161919;
			this.cw_fld = var1.co((byte)-75) * -278183800;
			this.cm_fld = var1.co((byte)-121);
		}

		if (5 == this.bx_fld) {
			this.cj_fld = var1.co((byte)-6);
			this.ch_fld = var1.co((byte)-127) * -395997907;
		}

		if (this.bx_fld == 6) {
			this.dm_fld = -1800825853;
			this.do_fld = 571206572;
			this.dq_fld = var1.dl(wa.ak_fld.az_fld) * -1727287075;
			this.dd_fld = var1.dl(wa.ak_fld.az_fld) * 1259669067;
			this.dl_fld = var1.cm() * -2035712846;
			if (65535 == this.dl_fld) {
				this.dl_fld = -229266474;
			}

			this.dr_fld = var1.cm();
			if (this.dr_fld == 744709241) {
				this.dr_fld = 37770411;
			}

			this.db_fld = var1.cm();
			this.dx_fld = var1.cm();
			this.ds_fld = var1.cm();
		}

		if (this.bx_fld == 8) {
			this.dp_fld = xi.at(var1, 430089749);
		}

		if (2 == this.bo_fld) {
			this.el_fld = xi.at(var1, 1371489653);
			this.gi_fld = xi.at(var1, -749163782);
			int var8 = var1.cm() & 178765744;
			this.ec_fld = -394576144 * (this.ec_fld | var8 << 11);
		}

		if (this.bo_fld == 1 || 4 == this.bo_fld || this.bo_fld == 5 || this.bo_fld == 6) {
			this.gq_fld = xi.at(var1, -1442016386);
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
			this.ec_fld = -950189223 * (this.ec_fld | -331491562);
		}

		if (6 == this.bo_fld) {
			this.ec_fld = -427477287 * (this.ec_fld | 1);
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] jo() {
		return this.gm_fld;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setXPositionMode(int var1) {
		this.bt_fld = var1;
		return this;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lln;"
	)
	public ln bi(int var1) {
		return this.hk_fld != null ? this.hk_fld.ag_fld : null;
	}

	@ObfuscatedName("getTargetPriority")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTargetPriority")
	@Override
	public int getTargetPriority() {
		return this.ek_fld;
	}

	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setScrollWidth(int var1) {
		this.cn_fld = var1;
		return this;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([IS)[I"
	)
	int[] az(int[] var1, short var2) {
		return null != var1 ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lyv;I)V"
	)
	void au(yv var1, int var2) {
		if (this.eh_fld) {
			var1.ch();
		}

		if (this.hb_fld) {
			var1.cw();
		}

		if (this.ga_fld * -1443261961 > 0) {
			var1.dv(-1443261961 * this.dk_fld);
		}

		if (this.bo_fld >= 1) {
			if (var2 >= 185271048) {
				return;
			}

			var1.dv(1);
		}

		if (this.bf_fld >= 2) {
			if (var2 >= 185271048) {
				return;
			}

			var1.ad(16777215);
		}

		if (0 != this.ca_fld) {
			var1.setMaxHeight(this.gd_fld * 1891222921);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llw;ZI)Lkp;"
	)
	public kp aa(lw var1, boolean var2, int var3) {
		try {
			if (this.cj_fld == -1) {
				var2 = false;
			}

			int var4 = var2 ? this.dx_fld * 2103578503 : this.cl_fld * -377192225;
			if (-1 == var4) {
				return null;
			} else {
				long var5 = ((long)(1891222921 * this.ca_fld) << 40)
					+ ((this.dt_fld ? 1L : 0L) << 39)
					+ ((this.bj_fld ? 1L : 0L) << 38)
					+ var4
					+ ((long)(-1443261961 * this.bf_fld) << 36);
				kp var7 = (kp)var1.ar_fld.bs(var5);
				if (var7 != null) {
					return var7;
				} else {
					yv var8 = this.as(var1, var2, null, -423043034);
					if (var8 == null) {
						return null;
					} else {
						yv var9 = yv.vo(var8);
						int[] var10 = new int[var9.ay_fld];
						int[] var11 = new int[var9.as_fld];

						for (int var12 = 0; var12 < var9.ay_fld; var12++) {
							int var13 = 0;
							int var14 = var9.aw_fld;

							for (int var15 = 0; var15 < var9.ay_fld; var15++) {
								if (0 == var9.ah_fld[var12 * var9.as_fld + var15]) {
									var13 = var15;
									break;
								}
							}

							for (int var18 = var9.ad_fld - 1; var18 >= var13; var18--) {
								if (0 == var9.ah_fld[var18 + var12 * var9.ad_fld]) {
									var14 = var18 + 1;
									break;
								}
							}

							var10[var12] = var13;
							var11[var12] = var14 - var13;
						}

						var7 = new kp(var9.as_fld, var9.ay_fld, var11, var10, var4);
						var1.af_fld.at(var7, var5);
						return var7;
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Ljava/lang/Object;"
	)
	public Object ao(int var1, Object var2, int var3) {
		for (int var4 = 0; var4 < this.dd_fld; var4++) {
			if (var1 == this.hs_fld[var4]) {
				return this.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu setLineHeight(int var1) {
		this.es_fld = var1;
		return this;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int ab(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.dd_fld; var4++) {
			if (this.et_fld[var4] == var1) {
				return (Integer)this.hq_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IIII)Llu;"
	)
	public lu setSize(int var1, int var2, int var3, int var4) {
		return this.setOriginalWidth(var1).setOriginalHeight(var2).setWidthMode(var3).setHeightMode(var4);
	}

	@ObfuscatedName("getModelZoom")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getModelZoom")
	@Override
	public int getModelZoom() {
		return this.db_fld;
	}

	@ObfuscatedName("getScrollY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getScrollY")
	@Override
	public int getScrollY() {
		return this.ce_fld;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public String eh(String var1) {
		return this.ey_fld == 11 && null != this.hi_fld && this.am(1465243715) ? this.hi_fld.ay(var1) : null;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;B)Z"
	)
	public boolean bo(lw var1, de var2, byte var3) {
		if (11 == this.ev_fld && null != this.hi_fld) {
			ma.dh(this.hi_fld, var2, 2099032597);
			if (this.hi_fld.ae() != this.hn_fld) {
				this.dd_fld = this.hi_fld.ae() * -510430013;
				if (this.do_fld >= 3) {
					return true;
				}

				if (2 == this.dd_fld) {
					this.bp(var1, -511255598);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lli;"
	)
	public li bv(int var1) {
		return this.hk_fld != null ? this.hk_fld.ak_fld : null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lde;I)Lyv;"
	)
	yv ar(lw var1, de var2, int var3) {
		if (!this.al(-978031646)) {
			return this.af(var1, var2, (byte)0);
		} else {
			String var4 = this.dp_fld + (this.ez_fld ? 1 : 0) + (this.ed_fld ? 1 : 0) + -1443261961 * this.ds_fld + 1891222921 * this.ce_fld;
			yv var5 = (yv)(yv)var1.ax_fld.ag(var4);
			if (null == var5) {
				yv var6 = this.af(var1, var2, (byte)0);
				if (var6 != null) {
					var5 = var6.af();
					mg(this, var5, -144005898);
					var1.au_fld.az(var4, var5);
				}
			}

			return var5;
		}
	}
}
