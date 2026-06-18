import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.runelite.api.GameObject;
import net.runelite.api.ModelData;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.DecorativeObjectDespawned;
import net.runelite.api.events.DecorativeObjectSpawned;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.WallObjectDespawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.hooks.DrawCallbacks;

@ObfuscatedName("ev")
@Implements({"Scene"})
public class ev extends em implements Scene {
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ci_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ad_fld = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "[Lef;"
	)
	public ef[] gk_fld;
	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int us_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "[Lfa;"
	)
	public fa[] of_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] fy_fld;
	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float tv_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] vd_fld = new int[184];
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bh_fld;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int td_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld = Math.min(128, 1);
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float sg_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld = Math.max(383, 520);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bx_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld = (as_fld - ay_fld + 1) / 32 + 1;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cb_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] an_fld = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aa_fld = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ai_fld = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] nl_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aq_fld = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] am_fld = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int eq_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ao_fld = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int um_fld;
	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float tx_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int es_fld;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int tj_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aj_fld;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] pc_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	public fy bm_fld;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dg_fld;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dk_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[Leh;"
	)
	eh[] bb_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int be_fld;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ce_fld;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] da_fld = new int[][]{
		{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
		{12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3},
		{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
		{3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}
	};
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	public fw vg_fld;
	@ObfuscatedName("xv")
	@ObfuscatedSignature(
		descriptor = "[Lfs;"
	)
	public fs[] xv_fld;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "[Lei;"
	)
	ei[] dy_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bj_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean ac_fld = false;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int sx_fld;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	public short[][][] kq_ArrArrArrshort;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bp_fld;
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "[[[Lrl10;"
	)
	public rl10[][][] vo_fld;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1046037205
	)
	int dh_fld;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dj_fld;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ph_fld;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	public short[][][] fl_fld;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] eu_ArrArrArrint;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean dc_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cr_fld;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ux_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public uy bo_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float bi_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cm_fld;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "[Lrl17;"
	)
	public rl17[] eu_Arrrl17;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	BitSet ex_fld;
	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ou_fld;
	// $VF: synthetic field
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean pu_boolean = !ev.class.desiredAssertionStatus();
	@ObfuscatedName("zb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 3
	)
	public int zb_fld;
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] wb_fld = new int[184];
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float bc_fld;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ss_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cf_fld;
	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int wi_fld;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bq_fld;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cp_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1124760005
	)
	public int bw_fld;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Lrl16;"
	)
	public static rl16 jz_fld = new rl16();
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int wj_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bu_fld;
	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	public Map up_java_util_Map;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dv_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bs_fld;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	int[][][] cv_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ba_fld;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cu_fld;
	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int zc_fld;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lrl18;"
	)
	public rl18 wc_fld;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	int[][][] cs_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "[[[Lei;"
	)
	public ei[][][] bl_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bn_fld;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dz_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bz_fld;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bg_fld;
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "[Len;"
	)
	public en[] oy_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int by_fld;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	public dx fb_fld;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int du_fld;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int do_fld;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] fm_fld;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int co_fld;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dw_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cc_fld;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int eb_fld;
	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean mf_boolean;
	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int up_int;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int eu_int;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] jj_fld;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] po_fld;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] pg_fld;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] ns_fld;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float cj_fld;
	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int mf_int;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int de_fld;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int df_fld;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int sz_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int qq_fld;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cn_fld;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ch_fld;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] kq_Arrbyte;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ct_fld;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	fj[] cl_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bf_fld;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int db_fld;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ck_fld;
	@ObfuscatedName("xc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int xc_fld;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cw_fld;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int hs_fld;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int di_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "[[Leh;"
	)
	eh[][] dq_fld;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ep_fld;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	fn dd_fld;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	public fj[] sd_fld;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na dl_fld;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] dm_fld;
	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float li_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	fy bd_fld;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dx_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] dr_fld = new int[][]{
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
		{1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
		{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
		{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1},
		{1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}
	};
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ec_fld;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int eo_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cd_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cz_fld;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ds_fld;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dt_fld;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	er dn_fld;
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int qr_fld;
	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "[Lfl;"
	)
	public fl[] lh_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cx_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ca_fld;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] dp_fld;
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int pm_fld;
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean wy_fld;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "[[Lrl17;"
	)
	public rl17[][] rx_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bv_fld;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	public long[] sp_fld;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Deque;"
	)
	public static Deque qo_fld = new ArrayDeque();
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	public BitSet ej_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cq_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cg_fld;
	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1124760005
	)
	public int oe_fld;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "[[[Lrl10;"
	)
	public rl10[][][] ky_fld;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	BitSet ed_fld;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	BitSet et_fld;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Set;"
	)
	public Set nk_fld;
	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	public ey lm_fld;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	BitSet ew_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bk_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -525480395
	)
	public int bt_fld;
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "[Lfv;"
	)
	public fv[] pu_Arrfv;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cy_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int br_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILfn;)V"
	)
	public void ag(int var1, fn var2) {
		this.ep_fld = var1;
		this.dd_fld = var2;
	}

	@ObfuscatedName("getBaseY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBaseY")
	@Override
	public int getBaseY() {
		return this.ou_fld;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIZ)Z"
	)
	public static boolean hg(ev var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.cz(var0.et_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ah() {
		this.ep_fld = -1;
		this.dd_fld = null;
	}

	@ObfuscatedName("zq")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void zq(int var1, int var2) {
		if (!pu_boolean && (var2 & 15) != var2) {
			throw new AssertionError();
		} else {
			this.pg_fld[var1] = this.pg_fld[var1] & -983041;
			this.pg_fld[var1] = this.pg_fld[var1] | var2 << 16;
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)V"
	)
	public static void ke(ev var0, int var1, int var2, int var3, int var4) {
		ei var5 = var0.bl_fld[var1][var2][var3];
		if (var5 != null) {
			fv var6 = var5.aa_fld;
			if (var6 != null) {
				if (var6.as_fld != 0) {
					var6.as_fld = var6.as_fld < 0 ? -var4 : var4;
				}

				if (var6.ar_fld != 0) {
					var6.ar_fld = var6.ar_fld < 0 ? -var4 : var4;
				}
			}
		}
	}

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void qe(int var1) {
		this.bp_fld = var1;
		this.cm_fld = -1;
		this.dg_fld = -1;
		this.bc_fld = -1.0F;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean dc(int var1, int var2, int var3, int var4, boolean var5) {
		return this.cj(this.ex_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int as() {
		return ay_fld;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIIIIIJI)V"
	)
	public void jl(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13, int var15) {
		try {
			this.bs(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var15);
		} catch (Throwable var17) {
			throw new RuntimeException(var17);
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int hy(int var1) {
		return this.pg_fld[var1] >> 24 & 0xFF;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void jp(int var1, int var2) {
		if (var1 < 0) {
			var1 = 0;
		}

		this.cp_fld = var1;
		this.dj_fld = var2;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean jc(int var1, int var2, int var3, int var4, boolean var5) {
		return this.cj(this.ex_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ab() {
		Arrays.fill(this.pg_fld, 0);
		Arrays.fill(this.of_fld, null);
		Arrays.fill(this.lh_fld, null);
		Arrays.fill(this.xv_fld, null);
		Arrays.fill(this.pu_Arrfv, null);
		Arrays.fill(this.gk_fld, null);
		Arrays.fill(this.oy_fld, null);
		Arrays.fill(this.sd_fld, null);
		Arrays.fill(this.pc_fld, (byte)0);
		Arrays.fill(this.cl_fld, null);

		for (int var1 = 0; var1 < this.dv_fld >> 3; var1++) {
			for (int var2 = 0; var2 < this.dk_fld >> 3; var2++) {
				rl17 var3 = this.rx_fld[var1][var2];
				var3.ol_fld.clear();
				var3.xi_fld.clear();
			}
		}
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Lfj;II)I"
	)
	public int nx(fj var1, int var2, int var3) {
		return this.dy(var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ap(int var1) {
		int var2 = (var1 << 1) + 1;
		var2 = this.fy_fld[var2];
		var2 <<= 1;
		int var5 = var1 << 1;
		this.fy_fld[var2] = this.fy_fld[var5];
		var2 = var1 << 1;
		var2 = this.fy_fld[var2];
		var2 = (var2 << 1) + 1;
		int var9 = (var1 << 1) + 1;
		this.fy_fld[var2] = this.fy_fld[var9];
		var2 = (var1 << 1) + 1;
		int var11 = this.qq_fld;
		int var12 = (var11 << 1) + 1;
		this.fy_fld[var2] = this.fy_fld[var12];
		var2 = var1 << 1;
		this.fy_fld[var2] = this.qq_fld;
		var2 = (var1 << 1) + 1;
		var2 = this.fy_fld[var2];
		var2 <<= 1;
		this.fy_fld[var2] = var1;
		var2 = var1 << 1;
		var2 = this.fy_fld[var2];
		var2 = (var2 << 1) + 1;
		this.fy_fld[var2] = var1;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean jk(int var1, int var2, int var3, int var4) {
		return py.tv(this, this.et_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public void ac(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		eh var9 = new eh();
		var9.ak_fld = var3 / 128;
		var9.ag_fld = var4 / 128;
		var9.az_fld = var5 / 128;
		var9.av_fld = var6 / 128;
		var9.ae_fld = var2;
		var9.ah_fld = var3;
		var9.aw_fld = var4;
		var9.ay_fld = var5;
		var9.as_fld = var6;
		var9.ar_fld = var7;
		var9.af_fld = var8;
		this.dq_fld[var1][this.dm_fld[var1]++] = var9;
	}

	@ObfuscatedName("zh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void zh(int var1) {
		this.bl_fld = null;
		this.dy_fld = null;
		this.setMinLevel(var1);

		for (int var2 = 0; var2 < this.dv_fld; var2++) {
			for (int var3 = 0; var3 < this.dk_fld; var3++) {
				int var4 = this.dj(var1, var2, var3);
				if (!this.hz(var4)) {
					this.sv(var4, var1, var2, var3);
				}

				if (this.vo_fld[var1][var2][var3] == null) {
					this.vo_fld[var1][var2][var3] = new rl10(this, var4);
					this.lg(var1, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean dt(int var1, int var2, int var3, int var4) {
		if (!this.cl(var1, var2, var3, var4)) {
			return this.ch(var1, var2, var3, var4);
		} else {
			this.dc(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + ay_fld;
			int var6 = var2 * 64;
			int var7 = (var3 - this.ds_fld - this.cx_fld - 1) * 128;
			int var8 = (var4 - this.ds_fld - this.ca_fld - 1) * 128;

			for (int var9 = -this.es_fld; var9 <= this.bu_fld; var9 += 128) {
				if (this.dm(var7, this.dp_fld[var1] + var9, var8, var5, var6)) {
					return mu(this, var1, var2, var3, var4, true);
				}
			}

			return mu(this, var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int bz(int var1, int var2, int var3) {
		int var4 = var2 + this.qr_fld;
		int var5 = var3 + this.qr_fld;
		int var6 = 0;
		int var7 = this.dj(var1, var4, var5);
		if (this.hz(var7)) {
			byte var8 = this.pc_fld[var7];

			for (int var9 = 0; var9 < var8; var9++) {
				fj var10 = this.sd_fld[var7 * 5 + var9];
				if ((var10.ax_fld & 256) == 256 && var10.ak_fld instanceof fn) {
					fn var11 = (fn)var10.ak_fld;
					var11.calculateBoundsCylinder();
					if (var11.ez_fld > var6) {
						var6 = var11.ez_fld * -1271205903;
					}
				}
			}
		}

		return var6;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)V"
	)
	public static void iu(ev var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		ei var5 = var0.bl_fld[var1][var2][var3];
		if (var5 != null) {
			fv var6 = var5.aa_fld;
			if (var6 != null) {
				if (var6.as_fld * -290157676 != 0) {
					var6.as_fld = (var6.as_fld * 1739028892 < 0 ? -var4 : var4) * 1097621912;
				}

				if (var6.ar_fld * 1743839857 != 0) {
					var6.ar_fld = var6.ar_fld * 1197887848 < 0 ? -var4 : var4;
				}
			}
		}
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void wf(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.db_fld = var1;
		var0.ck_fld = var2;
		var0.cw_fld = var3;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIIIIILem;IZJI)Z"
	)
	public static boolean jh(
		ev var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, em var9, int var10, boolean var11, long var12, int var14
	) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var15 = var2 + var0.qr_fld;
			int var16 = var3 + var0.qr_fld;
			if (var11) {
				boolean var17 = og.ci_fld.getCallbacks().draw(var9, false);
				if (!var17) {
					if ((var6 & 127) == 64 && (var7 & 127) == 64 && var9 instanceof da && ((da)var9).bn_fld * -2106839931 == 1) {
						int var33 = var6 >> 7;
						int var35 = var7 >> 7;
						var0.fb_fld.ar_fld[var33][var35] = -1;
					}

					return false;
				}
			}

			for (int var27 = var15; var27 < var15 + var4; var27++) {
				for (int var18 = var16; var18 < var16 + var5; var18++) {
					if (var27 < 0 || var18 < 0 || var27 >= var0.dv_fld || var18 >= var0.dk_fld) {
						return false;
					}

					int var19 = var0.dj(var1, var27, var18);
					if (var0.hz(var19) && var0.pc_fld[var19] >= 5) {
						return false;
					}
				}
			}

			fj var28;
			if (var11) {
				var28 = (fj)(fj)qo_fld.pollLast();
				if (var28 == null) {
					var28 = new fj();
				}

				var28.au_fld = 0;
				var28.al_fld = 0;
			} else {
				var28 = new fj();
			}

			var28.tf(var12);
			var28.en(var14);
			var28.pc(var1);
			var28.eq(var6);
			var28.nz(var7);
			var28.mk(var8);
			var28.sy(var9);
			var28.wv(var10);
			var28.ay_fld = var2;
			var28.ar_fld = var3;
			var28.as_fld = var2 + var4 - 1;
			var28.af_fld = var3 + var5 - 1;
			if (var11) {
				rl17 var29 = var0.rx_fld[var15 >> 3][var16 >> 3];
				var29.xi_fld.add(var28);
			} else if (var9 instanceof dz) {
				rl17 var30 = var0.rx_fld[var15 >> 3][var16 >> 3];
				var30.ol_fld.add(var28);
				var0.mo((dz)var9);
			}

			var0.to(var9, var10, var6, var8, var7, var2, var3);

			for (int var31 = var15; var31 < var15 + var4; var31++) {
				for (int var34 = var16; var34 < var16 + var5; var34++) {
					byte var20 = 0;
					if (var31 > var15) {
						var20 |= 1;
					}

					if (var31 < var15 + var4 - 1) {
						var20 |= 4;
					}

					if (var34 > var16) {
						var20 |= 8;
					}

					if (var34 < var16 + var5 - 1) {
						var20 |= 2;
					}

					for (int var21 = var1; var21 >= 0; var21--) {
						int var22 = var0.dj(var21, var31, var34);
						if (var0.vo_fld[var21][var31][var34] == null) {
							var0.vo_fld[var21][var31][var34] = new rl10(var0, var22);
							var0.lg(var21, var31, var34);
						}

						if (!var0.hz(var22)) {
							var0.sv(var22, var21, var31, var34);
						}
					}

					int var36 = var0.dj(var1, var31, var34);
					byte var37 = var0.pc_fld[var36];
					var0.sd_fld[var36 * 5 + var37] = var28;
					var0.fm_fld[var36 * 5 + var37] = (byte)var20;
					var0.kq_Arrbyte[var36] = (byte)(var0.kq_Arrbyte[var36] | var20);
					var0.pc_fld[var36]++;
				}
			}

			if (!var11 && var0.wy_fld) {
				if (!pu_boolean && var9 instanceof da) {
					throw new AssertionError();
				}

				if (!pu_boolean && var9 instanceof bc) {
					throw new AssertionError();
				}

				if (!pu_boolean && var9 instanceof bt) {
					throw new AssertionError();
				}

				if (!pu_boolean && var9 instanceof ev) {
					throw new AssertionError();
				}

				client.logger.trace("Game object spawn: {}", var28.getId());
				GameObjectSpawned var32 = new GameObjectSpawned();
				var32.setTile(var0.vo_fld[var1][var15][var16]);
				var32.setGameObject(var28);
				og.ci_fld.getCallbacks().post(var32);
				int var24 = var0.dj(var1, var2, var3);
				var0.sp_fld[var24] = var0.sp_fld[var24] | 1080863910568919040L;
			}

			if (var0.wy_fld && !var11 && client.bt_fld != null) {
				client.bt_fld.invalidateZone(var0, var15 >> 3, var16 >> 3);
			}

			return true;
		} catch (Throwable var26) {
			throw new RuntimeException(var26);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIIIIIJI)V"
	)
	public void bs(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13, int var15) {
		try {
			int var16 = var2 + this.qr_fld;
			int var17 = var3 + this.qr_fld;
			if (var5 != null) {
				int var18 = this.dj(var1, var16, var17);
				fv var19 = new fv();
				var19.ft(var13);
				var19.hw(var15);
				var19.fw(var2 * 128 + 64);
				var19.vb(var3 * 128 + 64);
				var19.kg(var4);
				var19.gf(var5);
				var19.rv(var6);
				var19.gk(var7);
				var19.nx(var8);
				var19.as_fld = var9;
				var19.ar_fld = var10;
				var19.af_fld = var11;
				var19.al_fld = var12;

				for (int var20 = var1; var20 >= 0; var20--) {
					int var21 = this.dj(var20, var16, var17);
					if (!this.hz(var21)) {
						this.sv(var21, var20, var16, var17);
					}

					if (this.vo_fld[var20][var16][var17] == null) {
						this.vo_fld[var20][var16][var17] = new rl10(this, var21);
						this.lg(var20, var16, var17);
					}
				}

				if (!pu_boolean && this.pu_Arrfv[var18] != null) {
					throw new AssertionError();
				}

				this.pu_Arrfv[var18] = var19;
				this.pg_fld[var18] = this.pg_fld[var18] | 32768;
				var19.pj_fld = var1;
				if (var5 instanceof dz || var6 instanceof dz) {
					rl17 var24 = this.rx_fld[var16 >> 3][var17 >> 3];
					var24.ol_fld.add(var19);
					this.mo((dz)var5);
					this.mo((dz)var6);
				}

				this.to(var5, 0, var19.getX(), var19.getZ(), var19.getY(), var2, var3);
				this.to(var6, 0, var19.getX(), var19.getZ(), var19.getY(), var2, var3);
				if (this.wy_fld) {
					DecorativeObjectSpawned var25 = new DecorativeObjectSpawned();
					var25.setTile(this.vo_fld[var1][var16][var17]);
					var25.setDecorativeObject(var19);
					og.ci_fld.getCallbacks().post(var25);
				}

				if (this.wy_fld && client.bt_fld != null) {
					client.bt_fld.invalidateZone(this, var16 >> 3, var17 >> 3);
				}
			}
		} catch (Throwable var23) {
			throw new RuntimeException(var23);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIIILem;IJZ)Z"
	)
	public boolean bj(int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, boolean var10) {
		try {
			if (var6 == null) {
				return true;
			} else {
				int var11 = var2 - var5;
				int var12 = var3 - var5;
				int var13 = var5 + var2;
				int var14 = var3 + var5;
				if (var10) {
					if (var7 > 640 && var7 < 1408) {
						var14 += 128;
					}

					if (var7 > 1152 && var7 < 1920) {
						var13 += 128;
					}

					if (var7 > 1664 || var7 < 384) {
						var12 -= 128;
					}

					if (var7 > 128 && var7 < 896) {
						var11 -= 128;
					}
				}

				var11 >>= 7;
				var12 >>= 7;
				var13 >>= 7;
				var14 >>= 7;
				return this.ac(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIIILem;IJIIII)Z"
	)
	public boolean bf(int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		try {
			return var6 == null ? true : jh(this, var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;IJ)Z"
	)
	public boolean bl(int var1, int var2, int var3, int var4, em var5, int var6, long var7) {
		if (var5 == null) {
			return false;
		} else {
			int var9 = (var2 >> 7) + this.qr_fld;
			int var10 = (var3 >> 7) + this.qr_fld;
			if (var9 >= 0 && var10 >= 0 && var9 < this.dv_fld && var10 < this.dk_fld) {
				fj var11 = (fj)(fj)qo_fld.pollLast();
				if (var11 == null) {
					var11 = new fj();
				}

				var11.az_fld = var7;
				var11.ax_fld = 0;
				var11.av_fld = var1;
				var11.ah_fld = var2;
				var11.aw_fld = var3;
				var11.ae_fld = var4;
				var11.ak_fld = var5;
				var11.ag_fld = var6;
				var11.ay_fld = var2 >> 7;
				var11.ar_fld = var3 >> 7;
				var11.as_fld = var2 >> 7;
				var11.af_fld = var3 >> 7;
				var11.au_fld = 0;
				var11.al_fld = 0;
				int var12 = this.dj(var1, var9, var10);
				if (!this.hz(var12)) {
					this.sv(var12, var1, var9, var10);
				}

				if (this.vo_fld[var1][var9][var10] == null) {
					this.vo_fld[var1][var9][var10] = new rl10(this, var12);
					this.lg(var1, var9, var10);
				}

				this.pg_fld[var12] = this.pg_fld[var12] | 128;
				rl17 var13 = this.rx_fld[var9 >> 3][var10 >> 3];
				var13.xi_fld.add(var11);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIIIIIIII)V"
	)
	public void bm(
		int var1,
		int var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20
	) {
		if (var4 == 0) {
			fa var21 = new fa(var11, var12, var13, var14, -1, var19, false);

			for (int var22 = var1; var22 >= 0; var22--) {
				int var23 = this.dj(var22, var2, var3);
				if (this.vo_fld[var22][var2][var3] == null) {
					this.vo_fld[var22][var2][var3] = new rl10(this, var23);
					this.lg(var22, var2, var3);
				}

				if (!this.hz(var23)) {
					this.sv(var23, var22, var2, var3);
				}
			}

			int var26 = this.dj(var1, var2, var3);
			this.of_fld[var26] = var21;
			this.pg_fld[var26] = this.pg_fld[var26] | 256 | (var21.az_fld != 12345678 ? 512 : 0);
		} else if (var4 != 1) {
			fl var24 = new fl(
				var4,
				var5,
				var6,
				var2 - this.qr_fld,
				var3 - this.qr_fld,
				var7,
				var8,
				var9,
				var10,
				var11,
				var12,
				var13,
				var14,
				var15,
				var16,
				var17,
				var18,
				var19,
				Math.max(1, var20)
			);

			for (int var27 = var1; var27 >= 0; var27--) {
				int var31 = this.dj(var27, var2, var3);
				if (this.vo_fld[var27][var2][var3] == null) {
					this.vo_fld[var27][var2][var3] = new rl10(this, var31);
					this.lg(var27, var2, var3);
				}

				if (!this.hz(var31)) {
					this.sv(var31, var27, var2, var3);
				}
			}

			int var28 = this.dj(var1, var2, var3);
			this.lh_fld[var28] = var24;
			this.pg_fld[var28] = this.pg_fld[var28] | 1024;
		} else {
			fa var25 = new fa(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

			for (int var29 = var1; var29 >= 0; var29--) {
				int var32 = this.dj(var29, var2, var3);
				if (this.vo_fld[var29][var2][var3] == null) {
					this.vo_fld[var29][var2][var3] = new rl10(this, var32);
					this.lg(var29, var2, var3);
				}

				if (!this.hz(var32)) {
					this.sv(var32, var29, var2, var3);
				}
			}

			int var30 = this.dj(var1, var2, var3);
			this.of_fld[var30] = var25;
			this.pg_fld[var30] = this.pg_fld[var30] | 256 | (var25.az_fld != 12345678 ? 512 : 0);
		}
	}

	@ObfuscatedName("getTileHeights")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	@Export("getTileHeights")
	@Override
	public int[][][] getTileHeights() {
		return this.cv_fld;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ge(int var1, int var2) {
		this.pg_fld[var2] = this.pg_fld[var1];
		this.of_fld[var2] = this.of_fld[var1];
		this.lh_fld[var2] = this.lh_fld[var1];
		this.xv_fld[var2] = this.xv_fld[var1];
		this.pu_Arrfv[var2] = this.pu_Arrfv[var1];
		this.gk_fld[var2] = this.gk_fld[var1];
		this.oy_fld[var2] = this.oy_fld[var1];
		this.pc_fld[var2] = this.pc_fld[var1];

		for (int var3 = 0; var3 < 5; var3++) {
			this.sd_fld[var2 * 5 + var3] = this.sd_fld[var1 * 5 + var3];
			this.fm_fld[var2 * 5 + var3] = this.fm_fld[var1 * 5 + var3];
		}

		this.kq_Arrbyte[var2] = this.kq_Arrbyte[var1];
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	public static void ge(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		ev var7 = hk.mt_fld.az_fld;
		int var8 = var1 + var7.qr_fld;
		int var9 = var2 + var7.qr_fld;
		rl17 var10 = var7.rx_fld[var8 >> 3][var9 >> 3];
		if (var5 == 0) {
			fs var11 = var7.xa(var0, var1, var2);
			if (var11 != null && (var11.ak_fld instanceof dz || var11.ag_fld instanceof dz) && !var10.ol_fld.contains(var11)) {
				var10.ol_fld.add(var11);
			}
		} else if (var5 == 1) {
			fv var12 = var7.km(var0, var1, var2);
			if (var12 != null && (var12.ak_fld instanceof dz || var12.ag_fld instanceof dz) && !var10.ol_fld.contains(var12)) {
				var10.ol_fld.add(var12);
			}
		} else if (var5 == 2) {
			fj var13 = var7.gc(var0, var1, var2);
			if (var13 != null && var13.ak_fld instanceof dz && !var10.ol_fld.contains(var13)) {
				var10.ol_fld.add(var13);
			}
		} else if (var5 == 3) {
			ef var14 = var7.tk(var0, var1, var2);
			if (var14 != null && var14.ak_fld instanceof dz && !var10.ol_fld.contains(var14)) {
				var10.ol_fld.add(var14);
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bo() {
		for (int var1 = 0; var1 < this.rx_fld.length; var1++) {
			for (int var2 = 0; var2 < this.rx_fld[var1].length; var2++) {
				rl17 var3 = this.rx_fld[var1][var2];

				for (int var4 = 0; var4 < var3.xi_fld.size(); var4++) {
					fj var5 = (fj)(fj)var3.xi_fld.get(var4);
					this.removeGameObject(var5);
					var5.ak_fld = null;
					qo_fld.addLast(var5);
				}

				var3.xi_fld.clear();
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bi(int var1, int var2, int var3) {
		var2 += this.qr_fld;
		var3 += this.qr_fld;
		int var4 = this.dj(var1, var2, var3);
		if (this.hz(var4) && (this.pg_fld[var4] & 16384) != 0) {
			fs var5 = this.xv_fld[var4];
			this.xv_fld[var4] = null;
			this.pg_fld[var4] = this.pg_fld[var4] & -16385;
			if (var5.ak_fld instanceof dz || var5.ag_fld instanceof dz) {
				rl17 var6 = this.rx_fld[var2 >> 3][var3 >> 3];
				var6.ol_fld.remove(var5);
			}

			if (this.wy_fld) {
				WallObjectDespawned var9 = new WallObjectDespawned();
				var9.setTile(this.vo_fld[var1][var2][var3]);
				var9.setWallObject(var5);
				og.ci_fld.getCallbacks().post(var9);
			}

			if (this.wy_fld && client.bt_fld != null) {
				client.bt_fld.invalidateZone(this, var2 >> 3, var3 >> 3);
			}
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIZ)Z"
	)
	public static boolean gi(ev var0, int var1, int var2, int var3, int var4, boolean var5) {
		return var0.cj(var0.ew_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bn(int var1, int var2, int var3) {
		int var4 = var2 + this.qr_fld;
		int var5 = var3 + this.qr_fld;
		int var6 = this.dj(var1, var4, var5);
		if (this.hz(var6)) {
			byte var7 = this.pc_fld[var6];

			for (int var8 = 0; var8 < var7; var8++) {
				fj var9 = this.sd_fld[var6 * 5 + var8];
				long var10 = var9.az_fld;
				int var12 = (int)(var10 >> 16 & 7L);
				if (var12 == 2 && var2 == var9.ay_fld && var3 == var9.ar_fld) {
					this.removeGameObject(var9);
					return;
				}
			}
		}
	}

	@ObfuscatedName("getMinLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getMinLevel")
	@Override
	public int getMinLevel() {
		return this.cu_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfj;)V"
	)
	public static void at(ev var0, fj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var2 = var1.ay_fld * 1400629934; var2 <= var1.as_fld; var2++) {
			for (int var3 = var1.ar_fld * 938233720; var3 <= var1.af_fld; var3++) {
				ei var4 = var0.bl_fld[var1.av_fld][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.ah_fld; var5++) {
						if (var4.aw_fld[var5] == var1) {
							var4.ah_fld -= -784657836;

							for (int var6 = var5; var6 < var4.ah_fld; var6++) {
								var4.aw_fld[var6] = var4.aw_fld[var6 + 1];
								var4.aq_fld[var6] = var4.aq_fld[var6 + 1];
							}

							var4.aw_fld[var4.ah_fld * 1629613423] = null;
							break;
						}
					}

					var0.bt(var4);
				}
			}
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void lm() {
		int var1 = this.dm_fld[this.bw_fld];
		eh[] var2 = this.dq_fld[this.bw_fld];
		this.ce_fld = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			eh var4 = var2[var3];
			if (var4.ae_fld == 1) {
				int var14 = var4.ak_fld - this.dw_fld + this.ds_fld;
				if (var14 >= 0 && var14 <= this.ds_fld + this.ds_fld) {
					int var16 = var4.az_fld - this.cc_fld + this.ds_fld;
					if (var16 < 0) {
						var16 = 0;
					}

					int var18 = var4.av_fld - this.cc_fld + this.ds_fld;
					if (var18 > this.ds_fld + this.ds_fld) {
						var18 = this.ds_fld + this.ds_fld;
					}

					boolean var20 = false;

					while (var16 <= var18) {
						if (this.dz(var14, var16++)) {
							var20 = true;
							break;
						}
					}

					if (var20) {
						int var22 = this.du_fld - var4.ah_fld;
						if (var22 > 32) {
							var4.al_fld = -462812273;
						} else {
							if (var22 >= -32) {
								continue;
							}

							var4.al_fld = -925624546;
							var22 = -var22;
						}

						var4.an_fld = (var4.ay_fld - this.co_fld << 8) / var22;
						var4.aa_fld = (var4.as_fld - this.co_fld << 8) / var22;
						var4.ai_fld = (var4.ar_fld - this.do_fld << 8) / var22;
						var4.aq_fld = (var4.af_fld - this.do_fld << 8) / var22;
						this.bb_fld[this.ce_fld++] = var4;
					}
				}
			} else if (var4.ae_fld == 2) {
				int var13 = var4.az_fld - this.cc_fld + this.ds_fld;
				if (var13 >= 0 && var13 <= this.ds_fld + this.ds_fld) {
					int var15 = var4.ak_fld - this.dw_fld + this.ds_fld;
					if (var15 < 0) {
						var15 = 0;
					}

					int var17 = var4.ag_fld - this.dw_fld + this.ds_fld;
					if (var17 > this.ds_fld + this.ds_fld) {
						var17 = this.ds_fld + this.ds_fld;
					}

					boolean var19 = false;

					while (var15 <= var17) {
						if (this.dz(var15++, var13)) {
							var19 = true;
							break;
						}
					}

					if (var19) {
						int var21 = this.co_fld - var4.ay_fld;
						if (var21 > 32) {
							var4.al_fld = -1388436819;
						} else {
							if (var21 >= -32) {
								continue;
							}

							var4.al_fld = -1851249092;
							var21 = -var21;
						}

						var4.au_fld = (var4.ah_fld - this.du_fld << 8) / var21;
						var4.ax_fld = (var4.aw_fld - this.du_fld << 8) / var21;
						var4.ai_fld = (var4.ar_fld - this.do_fld << 8) / var21;
						var4.aq_fld = (var4.af_fld - this.do_fld << 8) / var21;
						this.bb_fld[this.ce_fld++] = var4;
					}
				}
			} else if (var4.ae_fld == 4) {
				int var5 = var4.ar_fld - this.do_fld;
				if (var5 > 128) {
					int var6 = var4.az_fld - this.cc_fld + this.ds_fld;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = var4.av_fld - this.cc_fld + this.ds_fld;
					if (var7 > this.ds_fld + this.ds_fld) {
						var7 = this.ds_fld + this.ds_fld;
					}

					if (var6 <= var7) {
						int var8 = var4.ak_fld - this.dw_fld + this.ds_fld;
						if (var8 < 0) {
							var8 = 0;
						}

						int var9 = var4.ag_fld - this.dw_fld + this.ds_fld;
						if (var9 > this.ds_fld + this.ds_fld) {
							var9 = this.ds_fld + this.ds_fld;
						}

						boolean var10 = false;

						label187:
						for (int var11 = var8; var11 <= var9; var11++) {
							for (int var12 = var6; var12 <= var7; var12++) {
								if (this.dz(var11, var12)) {
									var10 = true;
									break label187;
								}
							}
						}

						if (var10) {
							var4.al_fld = 1980905931;
							var4.au_fld = (var4.ah_fld - this.du_fld << 8) / var5;
							var4.ax_fld = (var4.aw_fld - this.du_fld << 8) / var5;
							var4.an_fld = (var4.ay_fld - this.co_fld << 8) / var5;
							var4.aa_fld = (var4.as_fld - this.co_fld << 8) / var5;
							this.bb_fld[this.ce_fld++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int ar(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfj;"
	)
	public static fj jt(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void kn(boolean var1) {
		if (!jh.qi(this) || var1) {
			this.dc_fld = true;
			this.bq_fld = var1;
			this.bv_fld = -1;
			this.wi_fld = -1;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long cd(int var1, int var2, int var3) {
		var2 += this.qr_fld;
		var3 += this.qr_fld;
		int var4 = this.dj(var1, var2, var3);
		return this.hz(var4) && this.xv_fld[var4] != null ? this.xv_fld[var4].az_fld * -4472860599998239529L : 0L;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ak() {
		return this.ep_fld;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void lt(int var1, int var2, int var3) {
		zn(this, var1, var2, var3);
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void eu(int var1, int var2) {
		ei var3 = this.bl_fld[0][var1][var2];

		for (int var4 = 0; var4 < 3; var4++) {
			ei var5 = this.bl_fld[var4][var1][var2] = this.bl_fld[var4 + 1][var1][var2];
			if (var5 != null) {
				var5.af_fld--;

				for (int var6 = 0; var6 < var5.ah_fld; var6++) {
					fj var7 = var5.aw_fld[var6];
					if (bw.ag(var7.az_fld) && var7.ay_fld == var1 && var7.ar_fld == var2) {
						var7.av_fld--;
					}
				}
			}
		}

		if (this.bl_fld[0][var1][var2] == null) {
			this.bl_fld[0][var1][var2] = new ei(0, var1, var2);
		}

		this.bl_fld[0][var1][var2].bd_fld = var3;
		this.bl_fld[3][var1][var2] = null;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long cv(int var1, int var2, int var3) {
		var2 += this.qr_fld;
		var3 += this.qr_fld;
		int var4 = this.dj(var1, var2, var3);
		return this.hz(var4) && this.gk_fld[var4] != null ? this.gk_fld[var4].ag_fld * 2728893160458550201L : 0L;
	}

	@ObfuscatedName("xk")
	@ObfuscatedSignature(
		descriptor = "(Lrl17;III)V"
	)
	public void xk(rl17 var1, int var2, int var3, int var4) {
		var1.im_fld = Math.min(var1.im_fld, var4);
		var1.nu_fld = Math.max(var1.nu_fld, var4);
		boolean var5 = (var2 & 7) == 0 && var2 > 0;
		boolean var6 = (var3 & 7) == 0 && var3 > 0;
		if (var5) {
			rl17 var7 = this.rx_fld[(var2 >> 3) - 1][var3 >> 3];
			var7.im_fld = Math.min(var7.im_fld, var4);
			var7.nu_fld = Math.max(var7.nu_fld, var4);
		}

		if (var6) {
			rl17 var8 = this.rx_fld[var2 >> 3][(var3 >> 3) - 1];
			var8.im_fld = Math.min(var8.im_fld, var4);
			var8.nu_fld = Math.max(var8.nu_fld, var4);
		}

		if (var6 && var5) {
			rl17 var9 = this.rx_fld[(var2 >> 3) - 1][(var3 >> 3) - 1];
			var9.im_fld = Math.min(var9.im_fld, var4);
			var9.nu_fld = Math.max(var9.nu_fld, var4);
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IIIJ)I"
	)
	public int cx(int var1, int var2, int var3, long var4) {
		var2 += this.qr_fld;
		var3 += this.qr_fld;
		int var6 = this.dj(var1, var2, var3);
		if (!this.hz(var6)) {
			return -1;
		} else if (this.xv_fld[var6] != null && this.xv_fld[var6].az_fld * -4472860599998239529L == var4) {
			return this.xv_fld[var6].as_fld * 57097171 & 0xFF;
		} else if (this.pu_Arrfv[var6] != null && this.pu_Arrfv[var6].az_fld * 7130385936274174641L == var4) {
			return this.pu_Arrfv[var6].au_fld * -890468509 & 0xFF;
		} else if (this.gk_fld[var6] != null && this.gk_fld[var6].ag_fld * 2728893160458550201L == var4) {
			return this.gk_fld[var6].az_fld * 1337340647 & 0xFF;
		} else {
			byte var7 = this.pc_fld[var6];

			for (int var8 = 0; var8 < var7; var8++) {
				fj var9 = this.sd_fld[var6 * 5 + var8];
				if (var9.az_fld == var4) {
					return var9.ax_fld & 0xFF;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(ILrl17;Lfn;)V"
	)
	public void xn(int var1, rl17 var2, fn var3) {
		var3.calculateBoundsCylinder();
		int var4 = var1 - var3.ez_fld;
		int var5 = var1 + var3.cz_fld;
		if (var4 < var2.im_fld) {
			var2.im_fld = var4;
		}

		if (var5 > var2.nu_fld) {
			var2.nu_fld = var5;
		}
	}

	@ObfuscatedName("getBaseX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBaseX")
	@Override
	public int getBaseX() {
		return this.eu_int;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Leg;IIIII)V"
	)
	void im(eg var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; var12++) {
			if (var12 != this.cf_fld) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.dv_fld) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.dk_fld && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
								int var15 = this.dj(var12, var13, var14);
								if (this.hz(var15)) {
									int var16 = this.xp(var12, var13, var14) - this.xp(var2, var3, var4);
									fs var17 = this.xv_fld[var15];
									if (var17 != null) {
										if (var17.ak_fld instanceof eg) {
											eg var18 = (eg)var17.ak_fld;
											eg.zd(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7);
										}

										if (var17.ag_fld instanceof eg) {
											eg var24 = (eg)var17.ag_fld;
											eg.zd(var1, var24, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7);
										}
									}

									byte var25 = this.pc_fld[var15];

									for (int var19 = 0; var19 < var25; var19++) {
										fj var20 = this.sd_fld[var15 * 5 + var19];
										if (var20 != null && var20.ak_fld instanceof eg) {
											eg var21 = (eg)var20.ak_fld;
											int var22 = var20.as_fld - var20.ay_fld + 1;
											int var23 = var20.af_fld - var20.ar_fld + 1;
											eg.zd(
												var1,
												var21,
												(var20.ay_fld + this.qr_fld - var3) * 128 + (var22 - var5) * 64,
												var16,
												(var20.ar_fld + this.qr_fld - var4) * 128 + (var23 - var6) * 64,
												var7
											);
										}
									}
								}
							}
						}
					}
				}

				var8--;
				var7 = false;
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)I"
	)
	int cn(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.cr(var1, var2, var3) - this.cr(var4, var5, var6);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void hw(int var0) throws EOFException {
		try {
			dx var1 = bw.dk_fld;
			ev var2 = var1.az_fld;
			if (var2.ej_fld.get(var0)) {
				var2.zi();
			}

			for (int var3 = 0; var3 < var1.ad_fld.aa(); var3++) {
				rg var4 = (rg)sq.jx(var1.an_fld, var1.ad_fld.mf(var3));
				var4.ah_fld.az_fld.zi();
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int cr(int var1, int var2, int var3) {
		return (this.cv_fld[var1][var2][var3] + this.cv_fld[var1][var2 + 1][var3] + this.cv_fld[var1][var2][var3 + 1] + this.cv_fld[var1][var2 + 1][var3 + 1]) / 4;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int fh(int var1, int var2, int var3) {
		int var4 = 0;
		ei var5 = this.bl_fld[var1][var2][var3];
		if (var5 != null) {
			for (int var6 = 0; var6 < var5.ah_fld; var6++) {
				if ((var5.aw_fld[var6].ax_fld * -1613956585 & 256) == 256 && var5.aw_fld[var6].ak_fld instanceof fn) {
					fn var7 = (fn)var5.aw_fld[var6].ak_fld;
					var7.ap();
					if (var7.ez_fld > var4) {
						var4 = var7.ez_fld;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean hz(int var1) {
		return (this.pg_fld[var1] & 1) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	public boolean as(int var1, int var2, int var3, int var4, boolean var5) {
		DrawCallbacks var6 = client.bt_fld;
		if (og.ci_fld.isGpu() && var6 != null && this.aj_fld) {
			for (int var7 = this.bn_fld; var7 < this.dz_fld; var7++) {
				int var8 = this.dk_fld;
				int var9 = 0;

				for (int var10 = this.cr_fld; var10 < this.bg_fld; var10++) {
					int var11 = this.dj(var4, var7, var10);
					if (this.hz(var11) && var6.tileInFrustum(this, this.ci_fld, this.cj_fld, this.ch_fld, this.ct_fld, var1, var2, var3, var4, var7, var10)) {
						var8 = Math.min(var8, var10);
						var9 = Math.max(var9, var10);
					}
				}

				if (var5) {
					wb_fld[var7] = var8;
					vd_fld[var7] = var9;
				} else {
					wb_fld[var7] = Math.min(wb_fld[var7], var8);
					vd_fld[var7] = Math.max(vd_fld[var7], var9);
				}
			}

			for (int var12 = this.bn_fld + 1; var12 < this.dz_fld - 1; var12++) {
				wb_fld[var12] = Math.min(wb_fld[var12], Math.max(wb_fld[var12 - 1], wb_fld[var12 + 1]));
				vd_fld[var12] = Math.max(vd_fld[var12], Math.min(vd_fld[var12 - 1], vd_fld[var12 + 1]));
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void wg() {
		int var1 = this.qq_fld;
		var1 <<= 1;
		this.fy_fld[var1] = this.qq_fld;
		var1 = this.qq_fld;
		var1 = (var1 << 1) + 1;
		this.fy_fld[var1] = this.qq_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void al(int var1) {
		this.ds_fld = og.al(25, 90, var1);
		fh.ae(this.ds_fld);
		if (this.dp_fld != null && this.dp_fld.length > 0) {
			this.dh(this.dp_fld, this.es_fld, this.bu_fld, this.cq_fld, this.cg_fld);
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ck(int var1, int var2, int var3, int var4) {
		return py.tv(this, this.ed_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ur(int var1, int var2) {
		ve(this, var1, var2);
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIIIIIZ)V"
	)
	public static void dg(ev var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				if (var1 < 0) {
					var1 = 0;
				} else if (var1 >= var0.dv_fld * -673334556) {
					var1 = var0.dv_fld * 128 - 1;
				}

				if (var3 < 0) {
					var3 = 0;
				} else if (var3 >= var0.dk_fld * 186029136) {
					var3 = var0.dk_fld * 24273364 - 1;
				}

				if (var4 < 1) {
					var4 = 1;
				} else if (var4 > 520) {
					var4 = 128194161;
				}

				var0.ci_fld = fc.ay_fld[var4];
				var0.cj_fld = fc.as_fld[var4];
				var0.ch_fld = fc.ay_fld[var5];
				var0.ct_fld = fc.as_fld[var5];
				ve(var0, (var4 - ay_fld) / -1776315892, var5 / 670569146);
				var0.du_fld = var1;
				var0.do_fld = var2;
				var0.co_fld = var3;
				var0.dw_fld = var1 / 128;
				var0.cc_fld = var3 / 1731906337;
				var0.eb_fld = var7 / 1407211653;
				var0.ec_fld = var8 / 128;
				var0.bw_fld = var6;
				ee var10 = new ee(var1, var2, var3, var4, var5, var7, var8);
				if (var0.dd_fld != null) {
					var0.dd_fld.gk(fk.ae_fld);
					var0.dd_fld.bu(0, var4, var5, 0, 0, 0, -1L);
				}

				if (fc.an()) {
					fc.ar_fld.al_fld = 0;
					var0.lg(var10, var9, true);
					fc.ar_fld.al_fld = 1;
					var0.lg(var10, var9, false);
					fc.ar_fld.al_fld = 2;
				} else {
					fc.ar_fld.al_fld = 2;
					var0.lg(var10, var9, true);
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean cb(int var1, int var2, int var3, int var4, boolean var5) {
		return this.cz(this.ed_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean co(int var1, int var2, int var3, int var4) {
		return py.tv(this, this.et_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean ix(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.bk_fld + var3 * this.bj_fld + var4 * this.bf_fld + var5);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean cj(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.bk_fld + var3 * this.bj_fld + var4 * this.bf_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ch(int var1, int var2, int var3, int var4) {
		return this.ix(this.ew_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void iy(int var1) {
		this.zh(var1);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean cl(int var1, int var2, int var3, int var4) {
		return this.ix(this.ex_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void er(int var1, int var2) {
		no(this, var1, var2);
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	public static void pn(ev var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ep_fld = -1;
			var0.dd_fld = null;
		}
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	public static void to(ev var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.cz_fld; var1++) {
			ei var2 = var0.dy_fld[var1];

			for (int var3 = var2.ay_fld * -1044694629; var3 < var2.ah_fld; var3++) {
				var2.aw_fld[var3] = null;
			}

			var2.ah_fld = var2.ay_fld;
			if (var2.ar_fld != null) {
				var2.ar_fld.clear();
			}

			var0.bt(var2);
		}

		var0.cz_fld = 0;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void kj() {
		if (this.dc_fld) {
			this.dc_fld = false;
			this.bv_fld = this.cm_fld;
			this.wi_fld = this.dg_fld;
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void hh(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.ae_fld = null;
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean dz(int var1, int var2) {
		if (!this.co(this.cp_fld, this.dj_fld, var1, var2)) {
			return this.ck(this.cp_fld, this.dj_fld, var1, var2);
		} else {
			hb.xu(this, this.cp_fld, this.dj_fld, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; var4++) {
				for (int var5 = -1; var5 <= 1; var5++) {
					if (this.dt(this.cp_fld, this.dj_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.dt(this.cp_fld, (this.dj_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.dt(this.cp_fld + 1, this.dj_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.dt(this.cp_fld + 1, (this.dj_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.cb(this.cp_fld, this.dj_fld, var1, var2, var3);
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lei;Z)V"
	)
	void lr(fw var1, ei var2, boolean var3) {
		try {
			this.dl_fld.az(var2);

			label663:
			while (true) {
				ei var4;
				int var5;
				int var6;
				int var7;
				int var8;
				ei[][] var9;
				while (true) {
					var4 = (ei)zi.ex(this.dl_fld);
					if (var4 == null) {
						return;
					}

					if (var4.ab_fld) {
						var5 = var4.al_fld;
						var6 = var4.au_fld;
						var7 = var4.af_fld;
						var8 = var4.ax_fld;
						var9 = this.bl_fld[var7];
						if (!var4.ao_fld) {
							break;
						}

						if (var3) {
							if (var7 > 0) {
								ei var10 = this.bl_fld[var7 - 1][var5][var6];
								if (var10 != null && var10.ab_fld) {
									continue;
								}
							}

							if (var5 <= this.dw_fld && var5 > this.bn_fld) {
								ei var23 = var9[var5 - 1][var6];
								if (var23 != null && var23.ab_fld && (var23.ao_fld || (var4.am_fld & 1) == 0)) {
									continue;
								}
							}

							if (var5 >= this.dw_fld && var5 < this.dz_fld - 1) {
								ei var24 = var9[var5 + 1][var6];
								if (var24 != null && var24.ab_fld && (var24.ao_fld || (var4.am_fld & 4) == 0)) {
									continue;
								}
							}

							if (var6 <= this.cc_fld && var6 > this.cr_fld) {
								ei var25 = var9[var5][var6 - 1];
								if (var25 != null && var25.ab_fld && (var25.ao_fld || (var4.am_fld & 8) == 0)) {
									continue;
								}
							}

							if (var6 >= this.cc_fld && var6 < this.bg_fld - 1) {
								ei var26 = var9[var5][var6 + 1];
								if (var26 != null && var26.ab_fld && (var26.ao_fld || (var4.am_fld & 2) == 0)) {
									continue;
								}
							}
						} else {
							var3 = true;
						}

						var4.ao_fld = false;
						if (var4.bd_fld != null) {
							ei var27 = var4.bd_fld;
							if (var27.az_fld != null) {
								if (!this.dj_boolean(0, var5, var6)) {
									var1.ag(this, var27.az_fld, 0, var5, var6, 104502291);
								}
							} else if (var27.av_fld != null && !this.dj_boolean(0, var5, var6)) {
								var1.az(this, var27.av_fld, var5, var6, (byte)-23);
							}

							fs var11 = var27.an_fld;
							if (var11 != null) {
								var1.ak(var11.ak_fld, 0, var11.ae_fld, var11.av_fld, var11.ah_fld, var11.az_fld);
							}

							for (int var12 = 0; var12 < var27.ah_fld; var12++) {
								fj var13 = var27.aw_fld[var12];
								if (var13 != null) {
									var1.ak(var13.ak_fld, var13.ag_fld, var13.ah_fld, var13.ae_fld, var13.aw_fld, var13.az_fld);
								}
							}

							if (var27.ar_fld != null && !var27.ar_fld.isEmpty()) {
								for (int var48 = 0; var48 < var27.ar_fld.size(); var48++) {
									fj var55 = (fj)(fj)var27.ar_fld.get(var48);
									var1.ak(var55.ak_fld, var55.ag_fld, var55.ah_fld, var55.ae_fld, var55.aw_fld, var55.az_fld);
								}
							}
						}

						boolean var28 = false;
						if (var4.az_fld != null) {
							if (!this.dj_boolean(var8, var5, var6)) {
								var28 = true;
								if (var4.az_fld.az_fld * -1656357861 != 12345678 || var7 <= this.db_fld) {
									var1.ag(this, var4.az_fld, var8, var5, var6, 1181603903);
								}
							}
						} else if (var4.av_fld != null && !this.dj_boolean(var8, var5, var6)) {
							var28 = true;
							var1.az(this, var4.av_fld, var5, var6, (byte)60);
						}

						int var36 = 0;
						int var49 = 0;
						fs var56 = var4.an_fld;
						fv var14 = var4.aa_fld;
						if (var56 != null || var14 != null) {
							if (this.dw_fld == var5) {
								var36++;
							} else if (this.dw_fld < var5) {
								var36 += 2;
							}

							if (this.cc_fld == var6) {
								var36 += 3;
							} else if (this.cc_fld > var6) {
								var36 += 6;
							}

							var49 = an_fld[var36];
							var4.bm_fld = ai_fld[var36];
						}

						if (var56 != null) {
							if ((var56.aw_fld & aa_fld[var36]) != 0) {
								if (var56.aw_fld == 16) {
									var4.at_fld = -436509225;
									var4.ac_fld = aq_fld[var36];
									var4.aj_fld = -799242229 - var4.ac_fld;
								} else if (var56.aw_fld == 32) {
									var4.at_fld = -873018450;
									var4.ac_fld = am_fld[var36];
									var4.aj_fld = -1598484458 - var4.ac_fld;
								} else if (var56.aw_fld == 64) {
									var4.at_fld = -1746036900;
									var4.ac_fld = ad_fld[var36];
									var4.aj_fld = 1097998380 - var4.ac_fld;
								} else {
									var4.at_fld = -1309527675;
									var4.ac_fld = ao_fld[var36];
									var4.aj_fld = 1897240609 - var4.ac_fld;
								}
							} else {
								var4.at_fld = 0;
							}

							if ((var56.aw_fld & var49) != 0 && !el.gt(this, var8, var5, var6, var56.aw_fld)) {
								var1.ak(var56.ak_fld, 0, var56.ae_fld, var56.av_fld, var56.ah_fld, var56.az_fld);
							}

							if ((var56.ay_fld & var49) != 0 && !el.gt(this, var8, var5, var6, var56.ay_fld)) {
								var1.ak(var56.ag_fld, 0, var56.ae_fld, var56.av_fld, var56.ah_fld, var56.az_fld);
							}
						}

						if (var14 != null && !this.de(var8, var5, var6, var14.ak_fld.ez_fld * -1271205903)) {
							if ((var14.aw_fld & var49) != 0) {
								var1.ak(var14.ak_fld, 0, var14.ae_fld + var14.as_fld, var14.av_fld, var14.ah_fld + var14.ar_fld, var14.az_fld);
							} else if (var14.aw_fld == 256) {
								int var15 = var14.ae_fld - this.du_fld;
								int var16 = var14.ah_fld - this.co_fld;
								int var17 = var14.ay_fld;
								int var18;
								if (var17 != 1 && var17 != 2) {
									var18 = var15;
								} else {
									var18 = -var15;
								}

								int var19;
								if (var17 != 2 && var17 != 3) {
									var19 = var16;
								} else {
									var19 = -var16;
								}

								if (var19 < var18) {
									var1.ak(var14.ak_fld, 0, var14.ae_fld + var14.as_fld, var14.av_fld, var14.ah_fld + var14.ar_fld, var14.az_fld);
								} else if (var14.ag_fld != null) {
									var1.ak(var14.ag_fld, 0, var14.ae_fld + var14.af_fld, var14.av_fld, var14.ah_fld + var14.al_fld, var14.az_fld);
								}
							}
						}

						if (var28) {
							ef var65 = var4.ai_fld;
							if (var65 != null) {
								var1.ak(var65.ak_fld, 0, var65.ae_fld, var65.av_fld, var65.ah_fld, var65.ag_fld);
							}

							en var71 = var4.ae_fld;
							if (var71 != null && var71.ay_fld == 0) {
								if (var71.av_fld != null) {
									var1.ak(var71.av_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}

								if (var71.ae_fld != null) {
									var1.ak(var71.ae_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}

								if (var71.ah_fld != null) {
									var1.ak(var71.ah_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}
							}
						}

						int var66 = var4.am_fld;
						if (var66 != 0) {
							if (var5 < this.dw_fld && var5 >= this.bn_fld && var5 < this.dz_fld - 1 && (var66 & 4) != 0) {
								ei var72 = var9[var5 + 1][var6];
								if (var72 != null && var72.ab_fld) {
									this.dl_fld.az(var72);
								}
							}

							if (var6 < this.cc_fld && var6 >= this.cr_fld && var6 < this.bg_fld - 1 && (var66 & 2) != 0) {
								ei var73 = var9[var5][var6 + 1];
								if (var73 != null && var73.ab_fld) {
									this.dl_fld.az(var73);
								}
							}

							if (var5 > this.dw_fld && var5 > this.bn_fld && var5 < this.dz_fld && (var66 & 1) != 0) {
								ei var74 = var9[var5 - 1][var6];
								if (var74 != null && var74.ab_fld) {
									this.dl_fld.az(var74);
								}
							}

							if (var6 > this.cc_fld && var6 > this.cr_fld && var6 < this.bg_fld && (var66 & 8) != 0) {
								ei var75 = var9[var5][var6 - 1];
								if (var75 != null && var75.ab_fld) {
									this.dl_fld.az(var75);
								}
							}
						}
						break;
					}
				}

				if (var4.at_fld != 0) {
					boolean var29 = true;

					for (int var37 = 0; var37 < var4.ah_fld; var37++) {
						if (var4.aw_fld[var37].au_fld * 1952704125 != this.dh_fld && (var4.aq_fld[var37] & var4.at_fld) == var4.ac_fld) {
							var29 = false;
							break;
						}
					}

					if (var29) {
						fs var38 = var4.an_fld;
						if (!el.gt(this, var8, var5, var6, var38.aw_fld)) {
							var1.ak(var38.ak_fld, 0, var38.ae_fld, var38.av_fld, var38.ah_fld, var38.az_fld);
						}

						var4.at_fld = 0;
					}
				}

				if (var4.ap_fld) {
					try {
						var4.ap_fld = false;
						int var30 = 0;

						label611:
						for (int var39 = 0; var39 < var4.ah_fld; var39++) {
							fj var50 = var4.aw_fld[var39];
							if (var50.au_fld != this.dh_fld) {
								for (int var57 = var50.ay_fld; var57 <= var50.as_fld; var57++) {
									for (int var61 = var50.ar_fld; var61 <= var50.af_fld; var61++) {
										ei var67 = var9[var57][var61];
										if (var67.ao_fld) {
											var4.ap_fld = true;
											continue label611;
										}

										if (var67.at_fld != 0) {
											int var76 = 0;
											if (var57 > var50.ay_fld) {
												var76++;
											}

											if (var57 < var50.as_fld) {
												var76 += 4;
											}

											if (var61 > var50.ar_fld) {
												var76 += 8;
											}

											if (var61 < var50.af_fld) {
												var76 += 2;
											}

											if ((var76 & var67.at_fld) == var4.aj_fld) {
												var4.ap_fld = true;
												continue label611;
											}
										}
									}
								}

								this.cl_fld[var30++] = var50;
								var50.al_fld = this.dy(var50, this.dw_fld, this.cc_fld);
							}
						}

						if (var4.ag(830000886)) {
							for (int var40 = 0; var40 < var4.ar_fld.size(); var40++) {
								fj var51 = (fj)(fj)var4.ar_fld.get(var40);
								if (var51.au_fld != this.dh_fld) {
									this.cl_fld[var30++] = var51;
									var51.al_fld = this.dy(var51, this.dw_fld, this.cc_fld);
								}
							}
						}

						while (true) {
							int var41 = -50;
							int var52 = -1;

							for (int var58 = 0; var58 < var30; var58++) {
								fj var62 = this.cl_fld[var58];
								if (var62.au_fld != this.dh_fld) {
									if (var62.al_fld > var41) {
										var41 = var62.al_fld;
										var52 = var58;
									} else if (var62.al_fld == var41) {
										int var68 = var62.ah_fld - this.du_fld;
										int var77 = var62.aw_fld - this.co_fld;
										int var80 = this.cl_fld[var52].ah_fld * -564370133 - this.du_fld;
										int var81 = this.cl_fld[var52].aw_fld * -502866077 - this.co_fld;
										if (var68 * var68 + var77 * var77 > var80 * var80 + var81 * var81) {
											var52 = var58;
										}
									}
								}
							}

							if (var52 == -1) {
								if (var4.ap_fld) {
									continue label663;
								}
								break;
							}

							fj var59 = this.cl_fld[var52];
							var59.au_fld = this.dh_fld;
							if (!zq(this, var8, var59.ay_fld, var59.as_fld, var59.ar_fld, var59.af_fld, var59.ak_fld.ez_fld * -1271205903)) {
								var1.ak(var59.ak_fld, var59.ag_fld, var59.ah_fld, var59.ae_fld, var59.aw_fld, var59.az_fld);
							}

							for (int var63 = var59.ay_fld; var63 <= var59.as_fld; var63++) {
								for (int var69 = var59.ar_fld; var69 <= var59.af_fld; var69++) {
									ei var78 = var9[var63][var69];
									if (var78.at_fld != 0) {
										this.dl_fld.az(var78);
									} else if ((var63 != var5 || var69 != var6) && var78.ab_fld) {
										this.dl_fld.az(var78);
									}
								}
							}
						}
					} catch (Exception var21) {
						var4.ap_fld = false;
					}
				}

				if (var4.ab_fld && var4.at_fld == 0) {
					if (var5 <= this.dw_fld && var5 > this.bn_fld) {
						ei var31 = var9[var5 - 1][var6];
						if (var31 != null && var31.ab_fld) {
							continue;
						}
					}

					if (var5 >= this.dw_fld && var5 < this.dz_fld - 1) {
						ei var32 = var9[var5 + 1][var6];
						if (var32 != null && var32.ab_fld) {
							continue;
						}
					}

					if (var6 <= this.cc_fld && var6 > this.cr_fld) {
						ei var33 = var9[var5][var6 - 1];
						if (var33 != null && var33.ab_fld) {
							continue;
						}
					}

					if (var6 >= this.cc_fld && var6 < this.bg_fld - 1) {
						ei var34 = var9[var5][var6 + 1];
						if (var34 != null && var34.ab_fld) {
							continue;
						}
					}

					var4.ab_fld = false;
					this.dx_fld--;
					en var35 = var4.ae_fld;
					if (var35 != null && var35.ay_fld != 0) {
						if (var35.av_fld != null) {
							var1.ak(var35.av_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}

						if (var35.ae_fld != null) {
							var1.ak(var35.ae_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}

						if (var35.ah_fld != null) {
							var1.ak(var35.ah_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}
					}

					if (var4.bm_fld != 0) {
						fv var42 = var4.aa_fld;
						if (var42 != null && !this.de(var8, var5, var6, var42.ak_fld.ez_fld * -1271205903)) {
							if ((var42.aw_fld & var4.bm_fld) != 0) {
								var1.ak(var42.ak_fld, 0, var42.ae_fld + var42.as_fld, var42.av_fld, var42.ah_fld + var42.ar_fld, var42.az_fld);
							} else if (var42.aw_fld == 256) {
								int var53 = var42.ae_fld - this.du_fld;
								int var60 = var42.ah_fld - this.co_fld;
								int var64 = var42.ay_fld;
								int var70;
								if (var64 != 1 && var64 != 2) {
									var70 = var53;
								} else {
									var70 = -var53;
								}

								int var79;
								if (var64 != 2 && var64 != 3) {
									var79 = var60;
								} else {
									var79 = -var60;
								}

								if (var79 >= var70) {
									var1.ak(var42.ak_fld, 0, var42.ae_fld + var42.as_fld, var42.av_fld, var42.ah_fld + var42.ar_fld, var42.az_fld);
								} else if (var42.ag_fld != null) {
									var1.ak(var42.ag_fld, 0, var42.ae_fld + var42.af_fld, var42.av_fld, var42.ah_fld + var42.al_fld, var42.az_fld);
								}
							}
						}

						fs var54 = var4.an_fld;
						if (var54 != null) {
							if ((var54.ay_fld & var4.bm_fld) != 0 && !el.gt(this, var8, var5, var6, var54.ay_fld)) {
								var1.ak(var54.ag_fld, 0, var54.ae_fld, var54.av_fld, var54.ah_fld, var54.az_fld);
							}

							if ((var54.aw_fld & var4.bm_fld) != 0 && !el.gt(this, var8, var5, var6, var54.aw_fld)) {
								var1.ak(var54.ak_fld, 0, var54.ae_fld, var54.av_fld, var54.ah_fld, var54.az_fld);
							}
						}
					}

					if (var7 < this.cf_fld - 1) {
						ei var43 = this.bl_fld[var7 + 1][var5][var6];
						if (var43 != null && var43.ab_fld) {
							this.dl_fld.az(var43);
						}
					}

					if (var5 < this.dw_fld && var5 >= this.bn_fld && var5 < this.dz_fld - 1) {
						ei var44 = var9[var5 + 1][var6];
						if (var44 != null && var44.ab_fld) {
							this.dl_fld.az(var44);
						}
					}

					if (var6 < this.cc_fld && var6 >= this.cr_fld && var6 < this.bg_fld - 1) {
						ei var45 = var9[var5][var6 + 1];
						if (var45 != null && var45.ab_fld) {
							this.dl_fld.az(var45);
						}
					}

					if (var5 > this.dw_fld && var5 > this.bn_fld && var5 < this.dz_fld) {
						ei var46 = var9[var5 - 1][var6];
						if (var46 != null && var46.ab_fld) {
							this.dl_fld.az(var46);
						}
					}

					if (var6 > this.cc_fld && var6 > this.cr_fld && var6 < this.bg_fld) {
						ei var47 = var9[var5][var6 - 1];
						if (var47 != null && var47.ab_fld) {
							this.dl_fld.az(var47);
						}
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z"
	)
	boolean dm(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = fc.ah_fld;
		int[] var7 = fc.aw_fld;
		int var8 = var6[var4];
		int var9 = var7[var4];
		int var10 = var6[var5];
		int var11 = var7[var5];
		int var12 = var3 * var10 + var1 * var11 >> 16;
		int var13 = var3 * var11 - var1 * var10 >> 16;
		int var14 = var2 * var8 + var13 * var9 >> 16;
		int var15 = var2 * var9 - var13 * var8 >> 16;
		if (var14 >= 50 && var14 <= fh.az()) {
			int var16 = this.cy_fld + var12 * 128 / var14;
			int var17 = this.dt_fld + var15 * 128 / var14;
			return var16 >= this.cn_fld && var16 <= this.eo_fld && var17 >= this.cb_fld && var17 <= this.cd_fld;
		} else {
			return false;
		}
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/util/Set;)Z"
	)
	public boolean nb(int var1, int var2, int var3, int var4, int var5, Set var6) {
		boolean var7 = false;
		int var8 = var5 + ((this.nl_fld[1][var1 + this.qr_fld][var2 + this.qr_fld] & 2) >> 1) & 3;

		for (int var9 = var1; var9 <= var3; var9++) {
			for (int var10 = var2; var10 <= var4; var10++) {
				var7 |= (this.nl_fld[var8][var9 + this.qr_fld][var10 + this.qr_fld] & 8) != 0;
			}
		}

		var5 = var7 ? 0 : var5;
		boolean var14 = this.mf_int != 0 && this.aj_fld;
		if (var5 >= this.cu_fld && (var14 || var5 <= this.bw_fld)) {
			if (var5 > this.fb_fld.ae_fld * -457350413 && !var6.isEmpty()) {
				for (int var15 = var1; var15 <= var3; var15++) {
					for (int var11 = var2; var11 <= var4; var11++) {
						int var12 = this.eu_ArrArrArrint[var5][var15 + this.qr_fld][var11 + this.qr_fld];
						if (var6.contains(var12)) {
							return false;
						}
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean kd() {
		return this.bq_fld && this.bv_fld != -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIILem;JI)V"
	)
	public static void ap(ev var0, int var1, int var2, int var3, int var4, em var5, long var6, int var8) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var9 = var2 + var0.qr_fld;
			int var10 = var3 + var0.qr_fld;
			if (var5 != null) {
				int var11 = var0.dj(var1, var9, var10);
				ef var12 = new ef();
				var12.ap(var5);
				var12.hk(var2 * 128 + 64);
				var12.jk(var3 * 128 + 64);
				var12.wi(var4);
				var12.rp(var6);
				var12.oy(var8);
				rl10 var13 = var0.vo_fld[var1][var9][var10];
				if (var13 == null) {
					var0.vo_fld[var1][var9][var10] = var13 = new rl10(var0, var11);
					var0.lg(var1, var9, var10);
				}

				if (!var0.hz(var11)) {
					var0.sv(var11, var1, var9, var10);
				}

				if (!pu_boolean && var0.gk_fld[var11] != null) {
					throw new AssertionError();
				}

				var0.gk_fld[var11] = var12;
				var0.pg_fld[var11] = var0.pg_fld[var11] | 2048;
				var0.sp_fld[var11] = var0.sp_fld[var11] | 1080863910568919040L;
				if (var5 instanceof dz) {
					rl17 var14 = var0.rx_fld[var9 >> 3][var10 >> 3];
					var14.ol_fld.add(var12);
					var0.mo((dz)var5);
				}

				var0.to(var5, 0, var12.getX(), var12.getZ(), var12.getY(), var2, var3);
				var12.nj_fld = var1;
				if (var0.wy_fld) {
					GroundObjectSpawned var19 = new GroundObjectSpawned();
					var19.setTile(var13);
					var19.setGroundObject(var12);
					og.ci_fld.getCallbacks().post(var19);
				}

				if (var0.wy_fld && client.bt_fld != null) {
					client.bt_fld.invalidateZone(var0, var9 >> 3, var10 >> 3);
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void dd() {
		this.bq_fld = true;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)Lfj;"
	)
	public fj bg(int var1, int var2, int var3) {
		int var4 = var2 + this.qr_fld;
		int var5 = var3 + this.qr_fld;
		int var6 = this.dj(var1, var4, var5);
		if (!this.hz(var6)) {
			return null;
		} else {
			byte var7 = this.pc_fld[var6];

			for (int var8 = 0; var8 < var7; var8++) {
				fj var9 = this.sd_fld[var6 * 5 + var8];
				long var10 = var9.az_fld;
				int var12 = (int)(var10 >> 16 & 7L);
				if (var12 == 2 && var2 == var9.ay_fld && var3 == var9.ar_fld) {
					return var9;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void np() {
		try {
			if ((client.ly_fld & 16) != 0) {
				for (int var1 = 0; var1 < this.dv_fld >> 3; var1++) {
					for (int var2 = 0; var2 < this.dk_fld >> 3; var2++) {
						rl17 var3 = this.rx_fld[var1][var2];
						if (var3 != null) {
							boolean var4 = false;

							for (int var5 = 0; var5 < var3.ol_fld.size(); var5++) {
								TileObject var6 = (TileObject)(TileObject)var3.ol_fld.get(var5);
								if (var6 instanceof fj) {
									fj var7 = (fj)var6;
									if (!pu_boolean && !(var7.ak_fld instanceof dz)) {
										throw new AssertionError();
									}

									dz var8 = (dz)var7.ak_fld;
									if (!var8.fy_fld && var8.gt()) {
										var8.hv();
										var8.fy_fld = true;
										var4 = true;
									}
								} else if (var6 instanceof ef) {
									ef var11 = (ef)var6;
									if (!pu_boolean && !(var11.ak_fld instanceof dz)) {
										throw new AssertionError();
									}

									dz var14 = (dz)var11.ak_fld;
									if (!var14.fy_fld && var14.gt()) {
										var14.hv();
										var14.fy_fld = true;
										var4 = true;
									}
								} else if (var6 instanceof fs) {
									fs var12 = (fs)var6;
									if (var12.ak_fld instanceof dz) {
										dz var15 = (dz)var12.ak_fld;
										if (!var15.fy_fld && var15.gt()) {
											var15.hv();
											var15.fy_fld = true;
											var4 = true;
										}
									}

									if (var12.ag_fld instanceof dz) {
										dz var16 = (dz)var12.ag_fld;
										if (!var16.fy_fld && var16.gt()) {
											var16.hv();
											var16.fy_fld = true;
											var4 = true;
										}
									}
								} else if (var6 instanceof fv) {
									fv var13 = (fv)var6;
									if (var13.ak_fld instanceof dz) {
										dz var17 = (dz)var13.ak_fld;
										if (!var17.fy_fld && var17.gt()) {
											var17.hv();
											var17.fy_fld = true;
											var4 = true;
										}
									}

									if (var13.ag_fld instanceof dz) {
										dz var18 = (dz)var13.ag_fld;
										if (!var18.fy_fld && var18.gt()) {
											var18.hv();
											var18.fy_fld = true;
											var4 = true;
										}
									}
								}
							}

							if (var4) {
								client.bt_fld.invalidateZone(this, var3.zb_fld, var3.bj_fld);
							}
						}
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("setMinLevel")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setMinLevel")
	@Override
	public void setMinLevel(int var1) {
		this.cu_fld = var1;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cc() {
		for (int var1 = 0; var1 < this.cf_fld; var1++) {
			for (int var2 = this.qr_fld; var2 < this.dv_fld - this.qr_fld; var2++) {
				for (int var3 = this.qr_fld; var3 < this.dk_fld - this.qr_fld; var3++) {
					rl10 var4 = this.ky_fld[var1][var2 - this.qr_fld][var3 - this.qr_fld];
					if (var4 != null) {
						this.jm(var4);
						if (var4.getBridge() != null) {
							this.jm(var4.getBridge());
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void dr() {
		if (this.dc_fld) {
			this.dc_fld = false;
			this.bv_fld = this.cm_fld;
			this.wi_fld = this.dg_fld;
		}
	}

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void zn(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var4 = 0; var4 < var0.cf_fld; var4++) {
				for (int var5 = 0; var5 < var0.dv_fld; var5++) {
					for (int var6 = 0; var6 < var0.dk_fld; var6++) {
						int var7 = var0.dj(var4, var5, var6);
						if (var0.hz(var7)) {
							fs var8 = var0.xv_fld[var7];
							if (var8 != null && var8.ak_fld instanceof eg) {
								eg var9 = (eg)var8.ak_fld;
								var0.ij(var9, var4, var5, var6, 1, 1);
								if (var8.ag_fld instanceof ModelData) {
									eg var10 = (eg)var8.ag_fld;
									var0.ij(var10, var4, var5, var6, 1, 1);
									eg.zd(var9, var10, 0, 0, 0, false);
									var8.ag_fld = var10.light(var10.bh_fld, var10.bs_fld, var1, var2, var3);
								}

								var8.ak_fld = var9.light(var9.bh_fld, var9.bs_fld, var1, var2, var3);
							}

							byte var13 = var0.pc_fld[var7];

							for (int var14 = 0; var14 < var13; var14++) {
								fj var11 = var0.sd_fld[var7 * 5 + var14];
								if (var11 != null && var11.ak_fld instanceof eg) {
									eg var12 = (eg)var11.ak_fld;
									var0.ij(var12, var4, var5, var6, var11.as_fld - var11.ay_fld + 1, var11.af_fld - var11.ar_fld + 1);
									var11.ak_fld = var12.light(var12.bh_fld, var12.bs_fld, var1, var2, var3);
								}
							}

							ef var15 = var0.gk_fld[var7];
							if (var15 != null && var15.ak_fld instanceof eg) {
								eg var16 = (eg)var15.ak_fld;
								var0.ya(var16, var4, var5, var6);
								var15.ak_fld = var16.light(var16.bh_fld, var16.bs_fld, var1, var2, var3);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void da() {
		this.bv_fld = -1;
		this.bq_fld = false;
	}

	@ObfuscatedName("zt")
	@ObfuscatedSignature(
		descriptor = "(Lfw;)V"
	)
	public void zt(fw var1) {
		try {
			boolean var2 = this.mf_int != 0 && this.aj_fld;
			int var3 = og.ci_fld.isGpu() ? xc_fld : this.ds_fld;

			for (int var4 = this.cf_fld - 1; var4 >= this.cu_fld; var4--) {
				boolean var5 = this.as(this.du_fld, this.do_fld, this.co_fld, var4, this.cf_fld - 1 == var4);

				for (int var6 = this.bn_fld; var6 < this.dz_fld; var6++) {
					int var7 = var5 ? wb_fld[var6] : this.cr_fld;
					int var8 = var5 ? vd_fld[var6] : this.bg_fld - 1;

					for (int var9 = var7; var9 <= var8; var9++) {
						int var10 = this.dj(var4, var6, var9);
						if (this.hz(var10)) {
							int var11 = this.pi(var10);
							int var12 = this.eu_ArrArrArrint[this.fb_fld.ae_fld * -457350413][var6][var9];
							if ((var11 <= this.bw_fld || var2)
								&& (
									!this.aj_fld
										|| var5
										|| this.sm(var6 - this.dw_fld + this.cx_fld + this.ds_fld, var9 - this.cc_fld + this.ca_fld + this.ds_fld)
										|| this.cv_fld[var4][var6][var9] - this.do_fld >= 2000
								)
								&& (!var2 || this.fb_fld.ae_fld * -457350413 >= var11 || var12 == 0 || !this.nk_fld.contains(var12))) {
								int var13 = this.pg_fld[var10];
								var13 |= 6;
								var13 |= this.pc_fld[var10] <= 0 && (var13 & 128) == 0 ? 0 : 8;
								var13 &= -16711697;
								this.pg_fld[var10] = var13;
								this.dx_fld++;
							} else {
								this.pg_fld[var10] = this.pg_fld[var10] & -23;
							}
						}
					}
				}
			}

			int var18 = Math.abs(this.cx_fld);
			int var19 = Math.abs(this.ca_fld);

			label143:
			for (int var20 = 0; var20 < 2; var20++) {
				boolean var21 = var20 == 0;

				for (int var22 = this.cu_fld; var22 < this.cf_fld; var22++) {
					for (int var23 = -(var18 + var3); var23 <= 0; var23++) {
						int var24 = var23 + this.dw_fld;
						int var25 = this.dw_fld - var23;
						if (var24 >= this.bn_fld || var25 < this.dz_fld) {
							for (int var26 = -(var19 + var3); var26 <= 0; var26++) {
								int var30 = var26 + this.cc_fld;
								int var14 = this.cc_fld - var26;
								if (var24 >= this.bn_fld && var24 < this.dz_fld) {
									if (var30 >= this.cr_fld && var30 < this.bg_fld) {
										int var15 = this.dj(var22, var24, var30);
										if ((this.pg_fld[var15] & 3) == 3) {
											this.is(var1, var15, var21);
										}
									}

									if (var14 >= this.cr_fld && var14 < this.bg_fld) {
										int var31 = this.dj(var22, var24, var14);
										if ((this.pg_fld[var31] & 3) == 3) {
											this.is(var1, var31, var21);
										}
									}
								}

								if (var25 >= this.bn_fld && var25 < this.dz_fld) {
									if (var30 >= this.cr_fld && var30 < this.bg_fld) {
										int var32 = this.dj(var22, var25, var30);
										if ((this.pg_fld[var32] & 3) == 3) {
											this.is(var1, var32, var21);
										}
									}

									if (var14 >= this.cr_fld && var14 < this.bg_fld) {
										int var33 = this.dj(var22, var25, var14);
										if ((this.pg_fld[var33] & 3) == 3) {
											this.is(var1, var33, var21);
										}
									}
								}

								if (this.dx_fld == 0) {
									break label143;
								}
							}
						}
					}
				}
			}

			this.fs();
		} catch (Throwable var17) {
			throw new RuntimeException(var17);
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void dk(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		try {
			int var10 = client.ly_fld >> 7 & 15;
			rl23.pk(var10);
			client.wf();
			var1 = ke.jd_fld;
			var2 = cs.jy_fld;
			var3 = gk.jc_fld;
			var4 = hu.je_fld;
			var5 = ab.jx_fld;
			boolean var11 = og.ci_fld.isGpu();
			if (!var11 && client.vp_fld != 0) {
				fh.mq(og.ci_fld.getViewportXOffset(), og.ci_fld.getViewportYOffset(), og.ci_fld.getViewportWidth(), og.ci_fld.getViewportHeight(), client.vp_fld);
			}

			this.du_fld = Ints.constrainToRange(var1, this.oe_fld << 7, (this.tj_fld << 7) - 1);
			this.do_fld = var2;
			this.co_fld = Ints.constrainToRange(var3, this.by_fld << 7, (this.ba_fld << 7) - 1);
			this.li_fld = Floats.constrainToRange((float)client.rg_double, this.oe_fld << 7, (this.tj_fld << 7) - 1);
			this.tv_fld = (float)client.th_double;
			this.tx_fld = Floats.constrainToRange((float)client.xy_fld, this.by_fld << 7, (this.ba_fld << 7) - 1);
			this.dw_fld = this.du_fld >> 7;
			this.cc_fld = this.co_fld >> 7;
			this.dw_fld = this.dw_fld + this.qr_fld;
			this.cc_fld = this.cc_fld + this.qr_fld;
			this.eb_fld = var7 >> 7;
			this.ec_fld = var8 >> 7;
			this.eb_fld = this.eb_fld + this.qr_fld;
			this.ec_fld = this.ec_fld + this.qr_fld;
			this.bw_fld = var6;
			int var12 = Ints.constrainToRange(var4, 0, 520);
			float var13 = (float)client.ig_fld;
			if (!client.ve_fld) {
				var4 = var12;
				var13 = Floats.constrainToRange(var13, (float) (Math.PI / 8), 1.1750293F);
			}

			this.ur((var12 - ay_fld) / 32, var5 / 64);
			this.ci_fld = fc.ay_fld[var4];
			this.cj_fld = fc.as_fld[var4];
			this.ch_fld = fc.ay_fld[var5];
			this.ct_fld = fc.as_fld[var5];
			this.sg_fld = var13;
			this.ss_fld = (float)client.ne_fld;
			ee var14 = new ee(this.du_fld, this.do_fld, this.co_fld, var4, var5, var7, var8);
			var14.mw_fld = this.li_fld;
			var14.hm_fld = this.tv_fld;
			var14.oh_fld = this.tx_fld;
			var14.tg_fld = this.sg_fld;
			var14.ie_fld = this.ss_fld;
			var14.bf_float = (float)Math.sin(this.sg_fld);
			var14.ya_fld = (float)Math.cos(this.sg_fld);
			var14.rz_fld = (float)Math.sin(this.ss_fld);
			var14.mo_fld = (float)Math.cos(this.ss_fld);
			this.vg_fld = var14;
			ee.zp_fld = var14;
			if (this.dd_fld != null && !og.ci_fld.isGpu()) {
				this.dd_fld.da(fk.ae_fld);
				this.dd_fld.kf(0, var4, var5, 0, 0, 0, -1L);
			}

			if ((client.ly_fld & 16) != 0) {
				this.ic(true, var9);
				this.gq(var14, null);
				fc.ar_fld.au_fld.rf(this.bd_fld);
				this.zd(null);
				og.ci_fld.getCallbacks().drawScene();
			} else if (fc.al_fld.je() && !og.ci_fld.isGpu()) {
				fc.ar_fld.al_fld = 0;
				this.ic(true, var9);
				this.sq(var14);
				fc.ar_fld.au_fld.rf(this.bd_fld);
				fc.ar_fld.al_fld = 1;
				this.ic(false, var9);
				this.zt(var14);
				fc.ar_fld.au_fld.rf(this.bd_fld);
				fc.ar_fld.al_fld = 2;
				og.ci_fld.getCallbacks().drawScene();
				if (client.bt_fld != null) {
					client.bt_fld.postDrawScene();
				}
			} else {
				fc.ar_fld.al_fld = 2;
				this.ic(true, var9);
				this.zt(var14);
				fc.ar_fld.au_fld.rf(this.bd_fld);
				og.ci_fld.getCallbacks().drawScene();
				if (client.bt_fld != null) {
					client.bt_fld.postDrawScene();
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lfw;ZZ)V"
	)
	void lg(fw var1, boolean var2, boolean var3) {
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void db(fw var1, boolean var2) {
		this.dx_fld = 0;

		for (int var3 = this.cu_fld; var3 < this.cf_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.bn_fld; var5 < this.dz_fld; var5++) {
				for (int var6 = this.cr_fld; var6 < this.bg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null) {
						if (var7.ad_fld <= this.bw_fld
							&& (
								!var2
									|| this.dz(var5 - this.dw_fld + this.cx_fld + this.ds_fld, var6 - this.cc_fld + this.ca_fld + this.ds_fld)
									|| this.cv_fld[var3][var5][var6] - this.do_fld >= 2000
							)) {
							var7.ao_fld = true;
							var7.ab_fld = true;
							var7.ap_fld = var7.ah_fld > 0 || var7.ag(158942193);
							this.dx_fld++;
						} else {
							var7.ao_fld = false;
							var7.ab_fld = false;
							var7.at_fld = 0;
						}
					}
				}
			}
		}

		int var14 = Math.abs(this.cx_fld);
		int var15 = Math.abs(this.ca_fld);

		for (int var16 = this.cu_fld; var16 < this.cf_fld; var16++) {
			ei[][] var18 = this.bl_fld[var16];

			for (int var20 = -(this.ds_fld + var14); var20 <= 0; var20++) {
				int var8 = this.dw_fld + var20;
				int var9 = this.dw_fld - var20;
				if (var8 >= this.bn_fld || var9 < this.dz_fld) {
					for (int var10 = -(this.ds_fld + var15); var10 <= 0; var10++) {
						int var11 = this.cc_fld + var10;
						int var12 = this.cc_fld - var10;
						if (var8 >= this.bn_fld && var8 < this.dz_fld) {
							if (var11 >= this.cr_fld && var11 < this.bg_fld) {
								ei var13 = var18[var8][var11];
								if (var13 != null && var13.ao_fld) {
									this.dg(var1, var13, true);
								}
							}

							if (var12 >= this.cr_fld && var12 < this.bg_fld) {
								ei var27 = var18[var8][var12];
								if (var27 != null && var27.ao_fld) {
									this.dg(var1, var27, true);
								}
							}
						}

						if (var9 >= this.bn_fld && var9 < this.dz_fld) {
							if (var11 >= this.cr_fld && var11 < this.bg_fld) {
								ei var28 = var18[var9][var11];
								if (var28 != null && var28.ao_fld) {
									this.dg(var1, var28, true);
								}
							}

							if (var12 >= this.cr_fld && var12 < this.bg_fld) {
								ei var29 = var18[var9][var12];
								if (var29 != null && var29.ao_fld) {
									this.dg(var1, var29, true);
								}
							}
						}

						if (this.dx_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ak(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		for (int var17 = this.cu_fld; var17 < this.cf_fld; var17++) {
			ei[][] var19 = this.bl_fld[var17];

			for (int var21 = -(this.ds_fld + var14); var21 <= 0; var21++) {
				int var22 = this.de_fld + var21;
				int var23 = this.de_fld - var21;
				if (var22 >= this.bn_fld || var23 < this.dz_fld) {
					for (int var24 = -(this.ds_fld + var15); var24 <= 0; var24++) {
						int var25 = this.df_fld + var24;
						int var26 = this.df_fld - var24;
						if (var22 >= this.bn_fld && var22 < this.dz_fld) {
							if (var25 >= this.cr_fld && var25 < this.bg_fld) {
								ei var30 = var19[var22][var25];
								if (var30 != null && var30.ao_fld) {
									this.dg(var1, var30, false);
								}
							}

							if (var26 >= this.cr_fld && var26 < this.bg_fld) {
								ei var31 = var19[var22][var26];
								if (var31 != null && var31.ao_fld) {
									this.dg(var1, var31, false);
								}
							}
						}

						if (var23 >= this.bn_fld && var23 < this.dz_fld) {
							if (var25 >= this.cr_fld && var25 < this.bg_fld) {
								ei var32 = var19[var23][var25];
								if (var32 != null && var32.ao_fld) {
									this.dg(var1, var32, false);
								}
							}

							if (var26 >= this.cr_fld && var26 < this.bg_fld) {
								ei var33 = var19[var23][var26];
								if (var33 != null && var33.ao_fld) {
									this.dg(var1, var33, false);
								}
							}
						}

						if (this.dx_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ak(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		fc.ar_fld.au_fld.ak(this.bd_fld);
		this.dr();
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(III)Lfj;"
	)
	public fj gc(int var1, int var2, int var3) {
		return this.bg(var1, var2, var3);
	}

	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ws(int var1, int var2) {
		if (!pu_boolean && (var2 & 15) != var2) {
			throw new AssertionError();
		} else {
			this.pg_fld[var1] = this.pg_fld[var1] & -15728641;
			this.pg_fld[var1] = this.pg_fld[var1] | var2 << 20;
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lei;Z)V"
	)
	void dg(fw var1, ei var2, boolean var3) {
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int eo(boolean var0) {
		return var0 ? 1 : 128;
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(Lev;Ljava/util/BitSet;IIII)Z"
	)
	public static boolean vr(ev var0, BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * var0.br_fld + var3 * var0.be_fld + var4 * var0.bs_fld + var5);
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void kq(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var2 += var0.qr_fld;
			var3 += var0.qr_fld;
			int var4 = var0.dj(var1, var2, var3);
			if (var0.hz(var4) && (var0.pg_fld[var4] & 32768) != 0) {
				fv var5 = var0.pu_Arrfv[var4];
				var0.pu_Arrfv[var4] = null;
				var0.pg_fld[var4] = var0.pg_fld[var4] & -32769;
				if (var5.ak_fld instanceof dz || var5.ag_fld instanceof dz) {
					rl17 var6 = var0.rx_fld[var2 >> 3][var3 >> 3];
					var6.ol_fld.remove(var5);
				}

				if (var0.wy_fld) {
					DecorativeObjectDespawned var9 = new DecorativeObjectDespawned();
					var9.setTile(var0.vo_fld[var1][var2][var3]);
					var9.setDecorativeObject(var5);
					og.ci_fld.getCallbacks().post(var9);
				}

				if (var0.wy_fld && client.bt_fld != null) {
					client.bt_fld.invalidateZone(var0, var2 >> 3, var3 >> 3);
				}
			}
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Lfj;II)I"
	)
	int dy(fj var1, int var2, int var3) {
		int var4 = var2 - var1.ay_fld;
		int var5 = var1.as_fld - var2;
		if (var5 > var4) {
			var4 = var5;
		}

		int var6 = var3 - var1.ar_fld;
		int var7 = var1.af_fld - var3;
		return var7 > var6 ? var4 + var7 : var4 + var6;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void di() {
		int var1 = this.dm_fld[this.bw_fld];
		eh[] var2 = this.dq_fld[this.bw_fld];
		this.ce_fld = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			eh var4 = var2[var3];
			if (var4.ae_fld == 1) {
				int var14 = var4.ak_fld - this.dw_fld + this.ds_fld;
				if (var14 >= 0 && var14 <= this.ds_fld + this.ds_fld) {
					int var16 = var4.az_fld - this.cc_fld + this.ds_fld;
					if (var16 < 0) {
						var16 = 0;
					}

					int var18 = var4.av_fld - this.cc_fld + this.ds_fld;
					if (var18 > this.ds_fld + this.ds_fld) {
						var18 = this.ds_fld + this.ds_fld;
					}

					boolean var20 = false;

					while (var16 <= var18) {
						if (this.dz(var14, var16++)) {
							var20 = true;
							break;
						}
					}

					if (var20) {
						int var22 = this.du_fld - var4.ah_fld;
						if (var22 > 32) {
							var4.al_fld = -462812273;
						} else {
							if (var22 >= -32) {
								continue;
							}

							var4.al_fld = -925624546;
							var22 = -var22;
						}

						var4.an_fld = (var4.ay_fld - this.co_fld << 8) / var22;
						var4.aa_fld = (var4.as_fld - this.co_fld << 8) / var22;
						var4.ai_fld = (var4.ar_fld - this.do_fld << 8) / var22;
						var4.aq_fld = (var4.af_fld - this.do_fld << 8) / var22;
						this.bb_fld[this.ce_fld++] = var4;
					}
				}
			} else if (var4.ae_fld == 2) {
				int var13 = var4.az_fld - this.cc_fld + this.ds_fld;
				if (var13 >= 0 && var13 <= this.ds_fld + this.ds_fld) {
					int var15 = var4.ak_fld - this.dw_fld + this.ds_fld;
					if (var15 < 0) {
						var15 = 0;
					}

					int var17 = var4.ag_fld - this.dw_fld + this.ds_fld;
					if (var17 > this.ds_fld + this.ds_fld) {
						var17 = this.ds_fld + this.ds_fld;
					}

					boolean var19 = false;

					while (var15 <= var17) {
						if (this.dz(var15++, var13)) {
							var19 = true;
							break;
						}
					}

					if (var19) {
						int var21 = this.co_fld - var4.ay_fld;
						if (var21 > 32) {
							var4.al_fld = -1388436819;
						} else {
							if (var21 >= -32) {
								continue;
							}

							var4.al_fld = -1851249092;
							var21 = -var21;
						}

						var4.au_fld = (var4.ah_fld - this.du_fld << 8) / var21;
						var4.ax_fld = (var4.aw_fld - this.du_fld << 8) / var21;
						var4.ai_fld = (var4.ar_fld - this.do_fld << 8) / var21;
						var4.aq_fld = (var4.af_fld - this.do_fld << 8) / var21;
						this.bb_fld[this.ce_fld++] = var4;
					}
				}
			} else if (var4.ae_fld == 4) {
				int var5 = var4.ar_fld - this.do_fld;
				if (var5 > 128) {
					int var6 = var4.az_fld - this.cc_fld + this.ds_fld;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = var4.av_fld - this.cc_fld + this.ds_fld;
					if (var7 > this.ds_fld + this.ds_fld) {
						var7 = this.ds_fld + this.ds_fld;
					}

					if (var6 <= var7) {
						int var8 = var4.ak_fld - this.dw_fld + this.ds_fld;
						if (var8 < 0) {
							var8 = 0;
						}

						int var9 = var4.ag_fld - this.dw_fld + this.ds_fld;
						if (var9 > this.ds_fld + this.ds_fld) {
							var9 = this.ds_fld + this.ds_fld;
						}

						boolean var10 = false;

						label188:
						for (int var11 = var8; var11 <= var9; var11++) {
							for (int var12 = var6; var12 <= var7; var12++) {
								if (this.dz(var11, var12)) {
									var10 = true;
									break label188;
								}
							}
						}

						if (var10) {
							var4.al_fld = 1980905931;
							var4.au_fld = (var4.ah_fld - this.du_fld << 8) / var5;
							var4.ax_fld = (var4.aw_fld - this.du_fld << 8) / var5;
							var4.an_fld = (var4.ay_fld - this.co_fld << 8) / var5;
							var4.aa_fld = (var4.as_fld - this.co_fld << 8) / var5;
							this.bb_fld[this.ce_fld++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int xp(int var1, int var2, int var3) {
		return this.cv_fld[var1][var2 + 1][var3 + 1] + this.cv_fld[var1][var2][var3] + this.cv_fld[var1][var2 + 1][var3] + this.cv_fld[var1][var2][var3 + 1] >> 2;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean dj_boolean(int var1, int var2, int var3) {
		int var4 = this.cs_fld[var1][var2][var3];
		if (var4 == -this.dh_fld) {
			return false;
		} else if (var4 == this.dh_fld) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.mh(var5 + 1, this.cv_fld[var1][var2][var3], var6 + 1)
				&& this.mh(var5 + 128 - 1, this.cv_fld[var1][var2 + 1][var3], var6 + 1)
				&& this.mh(var5 + 128 - 1, this.cv_fld[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
				&& this.mh(var5 + 1, this.cv_fld[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.cs_fld[var1][var2][var3] = this.dh_fld;
				return true;
			} else {
				this.cs_fld[var1][var2][var3] = -this.dh_fld;
				return false;
			}
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean de(int var1, int var2, int var3, int var4) {
		if (!this.dj_boolean(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.mh(var5 + 1, this.cv_fld[var1][var2][var3] - var4, var6 + 1)
				&& this.mh(var5 + 128 - 1, this.cv_fld[var1][var2 + 1][var3] - var4, var6 + 1)
				&& this.mh(var5 + 128 - 1, this.cv_fld[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
				&& this.mh(var5 + 1, this.cv_fld[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILem;IZJI)Z"
	)
	public boolean ac(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, em var9, int var10, boolean var11, long var12, int var14) {
		try {
			return jh(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14);
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ty(int var1, int var2) {
		if (!pu_boolean && (var2 & 0xFF) != var2) {
			throw new AssertionError();
		} else {
			this.pg_fld[var1] = this.pg_fld[var1] & 16777215;
			this.pg_fld[var1] = this.pg_fld[var1] | var2 << 24;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	void bt(ei var1) {
		var1.am_fld = 0;

		for (int var2 = 0; var2 < var1.ah_fld; var2++) {
			var1.am_fld = var1.am_fld | var1.aq_fld[var2];
		}
	}

	@ObfuscatedName("zq")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIII)Z"
	)
	public static boolean zq(ev var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == var3 && var4 == var5) {
			if (!var0.dj_boolean(var1, var2, var4)) {
				return false;
			} else {
				int var13 = var2 << 7;
				int var15 = var4 << 7;
				return var0.mh(var13 + 1, var0.cv_fld[var1][var2][var4] - var6, var15 + 1)
					&& var0.mh(var13 + 128 - 1, var0.cv_fld[var1][var2 + 1][var4] - var6, var15 + 1)
					&& var0.mh(var13 + 128 - 1, var0.cv_fld[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
					&& var0.mh(var13 + 1, var0.cv_fld[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
			}
		} else {
			for (int var7 = var2; var7 <= var3; var7++) {
				for (int var8 = var4; var8 <= var5; var8++) {
					if (var0.cs_fld[var1][var7][var8] == -var0.dh_fld) {
						return false;
					}
				}
			}

			int var12 = (var2 << 7) + 1;
			int var14 = (var4 << 7) + 2;
			int var9 = var0.cv_fld[var1][var2][var4] - var6;
			if (!var0.mh(var12, var9, var14)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!var0.mh(var10, var9, var14)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					return !var0.mh(var12, var9, var11) ? false : var0.mh(var10, var9, var11);
				}
			}
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ep() {
		return this.ep_fld;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(ILfn;)V"
	)
	public void eb(int var1, fn var2) {
		this.ep_fld = var1;
		this.dd_fld = var2;
	}

	@ObfuscatedName("getRoofs")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	@Export("getRoofs")
	@Override
	public int[][][] getRoofs() {
		return this.eu_ArrArrArrint;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(ILfn;)V"
	)
	public void ed(int var1, fn var2) {
		this.ep_fld = var1;
		this.dd_fld = var2;
	}

	@ObfuscatedName("xa")
	@ObfuscatedSignature(
		descriptor = "(III)Lfs;"
	)
	public fs xa(int var1, int var2, int var3) {
		return zr(this, var1, var2, var3);
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(Leg;III)V"
	)
	public void ya(eg var1, int var2, int var3, int var4) {
		xb(this, var1, var2, var3, var4);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean af(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
			int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(IIIIILem;IJIIII)Z"
	)
	public boolean fz(int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		try {
			return var6 == null ? true : jh(this, var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void vt(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.ai_fld = null;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean cm(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5);
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIIILem;IJI)Z"
	)
	public static boolean hx(ev var0, int var1, int var2, int var3, int var4, int var5, int var6, em var7, int var8, long var9, int var11) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var7 == null) {
				return true;
			} else {
				int var12 = var2 * 128 + 64 * var5;
				int var13 = var3 * 128 + 64 * var6;
				return jh(var0, var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lv() {
		int var2 = this.qq_fld;
		var2 <<= 1;
		int var1 = this.fy_fld[var2];
		if (var1 >= this.qq_fld) {
			return this.hs_fld;
		} else {
			this.ic(var1);
			return var1;
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int ec(boolean var0) {
		return var0 ? 1 : -1264245581;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int ez(boolean var0) {
		return var0 ? 1 : 128;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIIIIIIIIIIIIIIIII)V"
	)
	public static void jl(
		ev var0,
		int var1,
		int var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20
	) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var4 == 0) {
			fa var24 = new fa(var11, var12, var13, var14, -1, var19, false);

			for (int var26 = var1; var26 >= 0; var26--) {
				if (var0.bl_fld[var26][var2][var3] == null) {
					var0.bl_fld[var26][var2][var3] = new ei(var26, var2, var3);
				}
			}

			var0.bl_fld[var1][var2][var3].az_fld = var24;
		} else if (var4 != 1) {
			if (var20 == 0) {
				var20 = 1;
			}

			fl var23 = new fl(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (int var25 = var1; var25 >= 0; var25--) {
				if (var0.bl_fld[var25][var2][var3] == null) {
					var0.bl_fld[var25][var2][var3] = new ei(var25, var2, var3);
				}
			}

			var0.bl_fld[var1][var2][var3].av_fld = var23;
		} else {
			fa var21 = new fa(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (int var22 = var1; var22 >= 0; var22--) {
				if (var0.bl_fld[var22][var2][var3] == null) {
					var0.bl_fld[var22][var2][var3] = new ei(var22, var2, var3);
				}
			}

			var0.bl_fld[var1][var2][var3].az_fld = var21;
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int er(boolean var0) {
		return var0 ? 1 : 128;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int en(boolean var0) {
		return var0 ? 1 : 128;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int eg(boolean var0) {
		return var0 ? -786430142 : 588445217;
	}

	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void qn(int var1, int var2, int var3) {
		if (var2 >= 0 && var2 < this.dv_fld && var3 >= 0 && var3 < this.dk_fld) {
			int var4 = this.dj(var1, var2, var3);
			if (this.hz(var4)) {
				this.ap(var4);
			}
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIIIIIJI)V"
	)
	public void fs(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13, int var15) {
		if (var5 != null) {
			fv var16 = new fv();
			var16.az_fld = var13;
			var16.au_fld = var15;
			var16.ae_fld = var2 * 1572450944 + 786225472;
			var16.ah_fld = var3 * -231508608 + -115754304;
			var16.av_fld = var4;
			var16.ak_fld = var5;
			var16.ag_fld = var6;
			var16.aw_fld = var7;
			var16.ay_fld = var8;
			var16.as_fld = var9;
			var16.ar_fld = var10;
			var16.af_fld = var11;
			var16.al_fld = var12;

			for (int var17 = var1; var17 >= 0; var17--) {
				if (this.bl_fld[var17][var2][var3] == null) {
					this.bl_fld[var17][var2][var3] = new ei(var17, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].aa_fld = var16;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean ik(ev var0, int var1, int var2, int var3, int var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (!var0.dj_boolean(var1, var2, var3)) {
				return false;
			} else {
				int var5 = var2 << 7;
				int var6 = var3 << 7;
				int var7 = var0.cv_fld[var1][var2][var3] - 1;
				int var8 = var7 - 120;
				int var9 = var7 - 230;
				int var10 = var7 - 238;
				if (var4 < 16) {
					if (var4 == 1) {
						if (var5 > var0.du_fld) {
							if (!var0.mh(var5, var7, var6)) {
								return false;
							}

							if (!var0.mh(var5, var7, var6 + 128)) {
								return false;
							}
						}

						if (var1 > 0) {
							if (!var0.mh(var5, var8, var6)) {
								return false;
							}

							if (!var0.mh(var5, var8, var6 + 128)) {
								return false;
							}
						}

						if (!var0.mh(var5, var9, var6)) {
							return false;
						}

						if (!var0.mh(var5, var9, var6 + 128)) {
							return false;
						}

						return true;
					}

					if (var4 == 2) {
						if (var6 < var0.co_fld) {
							if (!var0.mh(var5, var7, var6 + 128)) {
								return false;
							}

							if (!var0.mh(var5 + 128, var7, var6 + 128)) {
								return false;
							}
						}

						if (var1 > 0) {
							if (!var0.mh(var5, var8, var6 + 128)) {
								return false;
							}

							if (!var0.mh(var5 + 128, var8, var6 + 128)) {
								return false;
							}
						}

						if (!var0.mh(var5, var9, var6 + 128)) {
							return false;
						}

						if (!var0.mh(var5 + 128, var9, var6 + 128)) {
							return false;
						}

						return true;
					}

					if (var4 == 4) {
						if (var5 < var0.du_fld) {
							if (!var0.mh(var5 + 128, var7, var6)) {
								return false;
							}

							if (!var0.mh(var5 + 128, var7, var6 + 128)) {
								return false;
							}
						}

						if (var1 > 0) {
							if (!var0.mh(var5 + 128, var8, var6)) {
								return false;
							}

							if (!var0.mh(var5 + 128, var8, var6 + 128)) {
								return false;
							}
						}

						if (!var0.mh(var5 + 128, var9, var6)) {
							return false;
						}

						if (!var0.mh(var5 + 128, var9, var6 + 128)) {
							return false;
						}

						return true;
					}

					if (var4 == 8) {
						if (var6 > var0.co_fld) {
							if (!var0.mh(var5, var7, var6)) {
								return false;
							}

							if (!var0.mh(var5 + 128, var7, var6)) {
								return false;
							}
						}

						if (var1 > 0) {
							if (!var0.mh(var5, var8, var6)) {
								return false;
							}

							if (!var0.mh(var5 + 128, var8, var6)) {
								return false;
							}
						}

						if (!var0.mh(var5, var9, var6)) {
							return false;
						}

						if (!var0.mh(var5 + 128, var9, var6)) {
							return false;
						}

						return true;
					}
				}

				if (!var0.mh(var5 + 64, var10, var6 + 64)) {
					return false;
				} else if (var4 == 16) {
					return var0.mh(var5, var9, var6 + 128);
				} else if (var4 == 32) {
					return var0.mh(var5 + 128, var9, var6 + 128);
				} else if (var4 == 64) {
					return var0.mh(var5 + 128, var9, var6);
				} else {
					return var4 == 128 ? var0.mh(var5, var9, var6) : true;
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int eq() {
		return ay_fld;
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int ei() {
		return ay_fld;
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int ee() {
		return ay_fld;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(ZZ)V"
	)
	public void ic(boolean var1, boolean var2) {
		this.dh_fld += 1046037205;
		this.bd_fld.rf(fc.ar_fld.au_fld);
		fc.ar_fld.au_fld.rf(this.bm_fld);
		if (var1) {
			DrawCallbacks var3 = client.bt_fld;
			if (var3 != null && this.aj_fld) {
				gc.ax_fld = 0;
				var3.drawScene(this.li_fld, this.tv_fld, this.tx_fld, this.sg_fld, this.ss_fld, this.bw_fld);
			}

			int var4 = og.ci_fld.isGpu() ? xc_fld : this.ds_fld;
			int var5 = !var2 && this.dn_fld != er.ak_fld ? this.eb_fld : this.dw_fld;
			int var6 = !var2 && this.dn_fld != er.ak_fld ? this.ec_fld : this.cc_fld;
			if (this.aj_fld) {
				this.bn_fld = Math.max(var5 - var4, this.oe_fld + this.qr_fld);
				this.cr_fld = Math.max(var6 - var4, this.by_fld + this.qr_fld);
				this.dz_fld = Math.min(var5 + var4, this.tj_fld + this.qr_fld);
				this.bg_fld = Math.min(var6 + var4, this.ba_fld + this.qr_fld);
			} else {
				this.bn_fld = 0;
				this.cr_fld = 0;
				this.dz_fld = this.dv_fld;
				this.bg_fld = this.dk_fld;
				var5 = this.dv_fld / 2;
				var6 = this.dk_fld / 2;
				this.ds_fld = Math.max(var5, var6);
			}

			this.cx_fld = this.dw_fld - var5;
			this.ca_fld = this.cc_fld - var6;
			this.dx_fld = 0;
			this.na();
			boolean var7 = og.ci_fld.isMenuOpen();
			if (!var7) {
				this.bx_fld = this.oe_fld;
				this.um_fld = this.by_fld;
			}

			if ((client.ly_fld & 16) != 0) {
				boolean var8 = this.mf_int != 0 && this.aj_fld;
				int var9 = var8 ? this.cf_fld - 1 : this.bw_fld;
				client.bt_fld
					.preSceneDraw(
						this, this.lm_fld, this.li_fld, this.tv_fld, this.tx_fld, this.sg_fld, this.ss_fld, this.cu_fld, this.fb_fld.ae_fld * -457350413, var9, this.nk_fld
					);
			}
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIIIIIIII)V"
	)
	public void fb(
		int var1,
		int var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20
	) {
		if (var4 == 0) {
			fa var24 = new fa(var11, var12, var13, var14, -1, var19, false);

			for (int var26 = var1; var26 >= 0; var26--) {
				if (this.bl_fld[var26][var2][var3] == null) {
					this.bl_fld[var26][var2][var3] = new ei(var26, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].az_fld = var24;
		} else if (var4 != 1) {
			if (var20 == 0) {
				var20 = 1;
			}

			fl var23 = new fl(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (int var25 = var1; var25 >= 0; var25--) {
				if (this.bl_fld[var25][var2][var3] == null) {
					this.bl_fld[var25][var2][var3] = new ei(var25, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].av_fld = var23;
		} else {
			fa var21 = new fa(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (int var22 = var1; var22 >= 0; var22--) {
				if (this.bl_fld[var22][var2][var3] == null) {
					this.bl_fld[var22][var2][var3] = new ei(var22, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].az_fld = var21;
		}
	}

	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Z"
	)
	public static boolean rr(ev var0, int var1, int var2, int var3) {
		int var4 = var0.cs_fld[var1][var2][var3];
		if (var4 == -var0.dh_fld) {
			return false;
		} else if (var4 == var0.dh_fld) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (var0.mh(var5 + 1, var0.cv_fld[var1][var2][var3], var6 + 1)
				&& var0.mh(var5 + 128 - 1, var0.cv_fld[var1][var2 + 1][var3], var6 + 1)
				&& var0.mh(var5 + 128 - 1, var0.cv_fld[var1][var2 + 1][var3 + 1], var6 + 992565491 - 1)
				&& var0.mh(var5 + 1, var0.cv_fld[var1][var2][var3 + 1], var6 + 128 - 1)) {
				var0.cs_fld[var1][var2][var3] = var0.dh_fld;
				return true;
			} else {
				var0.cs_fld[var1][var2][var3] = -var0.dh_fld;
				return false;
			}
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int ea(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "([IIIII)V"
	)
	public void js(int[] var1, int var2, int var3, int var4, int var5) {
		this.dp_fld = var1;
		this.es_fld = var2;
		this.bu_fld = var3;
		this.cq_fld = var4;
		this.cg_fld = var5;
		this.cn_fld = 0;
		this.cb_fld = 0;
		this.eo_fld = var4;
		this.cd_fld = var5;
		this.cy_fld = var4 / 2;
		this.dt_fld = var5 / 2;
		this.et_fld.set(0, this.et_fld.size());
		this.ex_fld.set(0, this.ex_fld.size());
	}

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfj;)V"
	)
	public static void qp(ev var0, fj var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var2 = var1.ay_fld; var2 <= var1.as_fld; var2++) {
				int var3 = var2 + var0.qr_fld;

				for (int var4 = var1.ar_fld; var4 <= var1.af_fld; var4++) {
					int var5 = var4 + var0.qr_fld;
					int var6 = var0.dj(var1.av_fld, var3, var5);
					if (var0.hz(var6)) {
						byte var7 = var0.pc_fld[var6];

						for (int var8 = 0; var8 < var7; var8++) {
							fj var9 = var0.sd_fld[var6 * 5 + var8];
							if (var9 == var1) {
								var7 = --var0.pc_fld[var6];

								for (int var10 = var8; var10 < var7; var10++) {
									var0.sd_fld[var6 * 5 + var10] = var0.sd_fld[var6 * 5 + var10 + 1];
									var0.fm_fld[var6 * 5 + var10] = var0.fm_fld[var6 * 5 + var10 + 1];
								}

								var0.sd_fld[var6 * 5 + var7] = null;
								break;
							}
						}

						var0.pg_fld[var6] = var0.pg_fld[var6] & -129;
						var0.kq_Arrbyte[var6] = 0;

						for (int var12 = 0; var12 < var0.pc_fld[var6]; var12++) {
							var0.kq_Arrbyte[var6] = (byte)(var0.kq_Arrbyte[var6] | var0.fm_fld[var6 * 5 + var12]);
						}
					}
				}
			}

			var0.nr(var1);
		}
	}

	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfw;Z)V"
	)
	public static void tb(ev var0, fw var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.dx_fld = 0;

		for (int var3 = var0.cu_fld; var3 < var0.cf_fld; var3++) {
			ei[][] var4 = var0.bl_fld[var3];

			for (int var5 = var0.bn_fld; var5 < var0.dz_fld; var5++) {
				for (int var6 = var0.cr_fld; var6 < var0.bg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null
						&& var7.ad_fld <= var0.bw_fld
						&& (
							!var2
								|| var0.dz(var5 - var0.dw_fld + var0.cx_fld + var0.ds_fld, var6 - var0.cc_fld + var0.ca_fld + var0.ds_fld)
								|| var0.cv_fld[var3][var5][var6] - var0.do_fld >= 2000
						)) {
						var0.dw(var1, var7);
					}
				}
			}
		}

		var0.dr();
		fc.ar_fld.au_fld.ak(var0.bd_fld);
	}

	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void zi() {
		try {
			for (int var1 = 0; var1 < this.dv_fld >> 3; var1++) {
				for (int var2 = 0; var2 < this.dk_fld >> 3; var2++) {
					rl17 var3 = this.rx_fld[var1][var2];
					boolean var4 = false;
					Iterator var5 = var3.ol_fld.iterator();

					while (var5.hasNext()) {
						TileObject var6 = (TileObject)(TileObject)var5.next();
						if (var6 instanceof fj) {
							fj var12 = (fj)var6;
							var4 |= this.bl(var12.ak_fld, var12.getOrientation(), var12.getX(), var12.getZ(), var12.getY(), var12.ay_fld, var12.ar_fld);
						} else if (var6 instanceof fs) {
							fs var11 = (fs)var6;
							var4 |= this.bl(var11.ak_fld, 0, var11.getX(), var11.getZ(), var11.getY(), var11.getX() >> 7, var11.getY() >> 7)
								|| this.bl(var11.ag_fld, 0, var11.getX(), var11.getZ(), var11.getY(), var11.getX() >> 7, var11.getY() >> 7);
						} else if (!(var6 instanceof fv)) {
							if (var6 instanceof ef) {
								ef var10 = (ef)var6;
								var4 |= this.bl(var10.ak_fld, 0, var10.getX(), var10.getZ(), var10.getY(), var10.getX() >> 7, var10.getY() >> 7);
							}
						} else {
							fv var7 = (fv)var6;
							var4 |= this.bl(var7.ak_fld, 0, var7.getX(), var7.getZ(), var7.getY(), var7.getX() >> 7, var7.getY() >> 7)
								|| this.bl(var7.ag_fld, 0, var7.getX(), var7.getZ(), var7.getY(), var7.getX() >> 7, var7.getY() >> 7);
						}
					}

					if (var4 && client.bt_fld != null) {
						client.bt_fld.invalidateZone(this, var3.zb_fld, var3.bj_fld);
					}
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)J"
	)
	public static long jv(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		return var4 != null && var4.aa_fld != null ? var4.aa_fld.az_fld * 7130385936274174641L : 0L;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void lb(int var1) {
		this.cu_fld = var1;

		for (int var2 = 0; var2 < this.dv_fld; var2++) {
			for (int var3 = 0; var3 < this.dk_fld; var3++) {
				if (this.bl_fld[var1][var2][var3] == null) {
					this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void pv(int var1) {
		this.bp_fld = var1;
		this.cm_fld = -1;
		this.dg_fld = -1;
		this.bc_fld = -1.0F;
	}

	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfv;"
	)
	public static fv rj(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		return var4 == null ? null : var4.aa_fld;
	}

	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void sv(int var1, int var2, int var3, int var4) {
		this.em(var1);
		this.pg_fld[var1] = 1;
	}

	@ObfuscatedName("getRoofRemovalMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRoofRemovalMode")
	@Override
	public int getRoofRemovalMode() {
		return this.mf_int;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ka(int var1, int var2, int var3, int var4) {
		this.aj(var1, var2, var3, var4);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int dj(int var1, int var2, int var3) {
		if (pu_boolean || var1 >= 0 && var1 <= 3) {
			if (pu_boolean || var2 >= 0 && var2 < this.dv_fld) {
				if (pu_boolean || var3 >= 0 && var3 < this.dk_fld) {
					return var1 << this.zc_fld | var2 << this.ph_fld | var3;
				} else {
					throw new AssertionError();
				}
			} else {
				throw new AssertionError();
			}
		} else {
			throw new AssertionError();
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ej(int var1, int var2) {
		ei var3 = this.bl_fld[0][var1][var2];

		for (int var4 = 0; var4 < 3; var4++) {
			ei var5 = this.bl_fld[var4][var1][var2] = this.bl_fld[var4 + 1][var1][var2];
			if (var5 != null) {
				var5.af_fld--;

				for (int var6 = 0; var6 < var5.ah_fld; var6++) {
					fj var7 = var5.aw_fld[var6];
					if (bw.ag(var7.az_fld) && var7.ay_fld == var1 && var7.ar_fld == var2) {
						var7.av_fld -= 1552898015;
					}
				}
			}
		}

		if (this.bl_fld[0][var1][var2] == null) {
			this.bl_fld[0][var1][var2] = new ei(0, var1, var2);
		}

		this.bl_fld[0][var1][var2].bd_fld = var3;
		this.bl_fld[3][var1][var2] = null;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public void fy(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		eh var9 = new eh();
		var9.ak_fld = var3 / 128;
		var9.ag_fld = var4 / 128;
		var9.az_fld = var5 / 128;
		var9.av_fld = var6 / 128;
		var9.ae_fld = var2;
		var9.ah_fld = var3;
		var9.aw_fld = var4;
		var9.ay_fld = var5;
		var9.as_fld = var6;
		var9.ar_fld = var7;
		var9.af_fld = var8;
		this.dq_fld[var1][this.dm_fld[var1]++] = var9;
	}

	@ObfuscatedName("tn")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfv;"
	)
	public static fv tn(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var2 += var0.qr_fld;
			var3 += var0.qr_fld;
			int var4 = var0.dj(var1, var2, var3);
			return var0.hz(var4) ? var0.pu_Arrfv[var4] : null;
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public void fp(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		eh var9 = new eh();
		var9.ak_fld = var3 / 128;
		var9.ag_fld = var4 / 128;
		var9.az_fld = var5 / 128;
		var9.av_fld = var6 / 128;
		var9.ae_fld = var2;
		var9.ah_fld = var3;
		var9.aw_fld = var4;
		var9.ay_fld = var5;
		var9.as_fld = var6;
		var9.ar_fld = var7;
		var9.af_fld = var8;
		this.dq_fld[var1][this.dm_fld[var1]++] = var9;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void fx(int var1, int var2, int var3, int var4) {
		ei var5 = this.bl_fld[var1][var2][var3];
		if (var5 != null) {
			this.bl_fld[var1][var2][var3].ad_fld = var4 * 259311142;
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	public void iq(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		ei var7 = this.bl_fld[var4][var5][var6];
		if (var7 != null) {
			fa var8 = var7.az_fld;
			if (var8 != null) {
				int var18 = var8.aw_fld;
				if (var18 != 0) {
					for (int var19 = 0; var19 < 4; var19++) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}
				}
			} else {
				fl var9 = var7.av_fld;
				if (var9 != null) {
					int var10 = var9.ad_fld;
					int var11 = var9.ao_fld;
					int var12 = var9.ab_fld;
					int var13 = var9.ap_fld;
					int[] var14 = dr_fld[var10];
					int[] var15 = da_fld[var11];
					int var16 = 0;
					if (var12 != 0) {
						for (int var17 = 0; var17 < 4; var17++) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (int var26 = 0; var26 < 4; var26++) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIIIIIIII)V"
	)
	public void fk(
		int var1,
		int var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20
	) {
		if (var4 == 0) {
			fa var24 = new fa(var11, var12, var13, var14, -1, var19, false);

			for (int var26 = var1; var26 >= 0; var26--) {
				if (this.bl_fld[var26][var2][var3] == null) {
					this.bl_fld[var26][var2][var3] = new ei(var26, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].az_fld = var24;
		} else if (var4 != 1) {
			if (var20 == 0) {
				var20 = 1;
			}

			fl var23 = new fl(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (int var25 = var1; var25 >= 0; var25--) {
				if (this.bl_fld[var25][var2][var3] == null) {
					this.bl_fld[var25][var2][var3] = new ei(var25, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].av_fld = var23;
		} else {
			fa var21 = new fa(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (int var22 = var1; var22 >= 0; var22--) {
				if (this.bl_fld[var22][var2][var3] == null) {
					this.bl_fld[var22][var2][var3] = new ei(var22, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].az_fld = var21;
		}
	}

	@ObfuscatedName("getDrawDistance")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getDrawDistance")
	@Override
	public int getDrawDistance() {
		return xc_fld;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean dn(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.ce_fld; var4++) {
			eh var5 = this.bb_fld[var4];
			if (var5.al_fld == 1) {
				int var6 = var5.ah_fld - var1;
				if (var6 > 0) {
					int var7 = var5.ay_fld + (var5.an_fld * var6 >> 8);
					int var8 = var5.as_fld + (var5.aa_fld * var6 >> 8);
					int var9 = var5.ar_fld + (var5.ai_fld * var6 >> 8);
					int var10 = var5.af_fld + (var5.aq_fld * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.al_fld == 2) {
				int var11 = var1 - var5.ah_fld;
				if (var11 > 0) {
					int var15 = var5.ay_fld + (var5.an_fld * var11 >> 8);
					int var19 = var5.as_fld + (var5.aa_fld * var11 >> 8);
					int var23 = var5.ar_fld + (var5.ai_fld * var11 >> 8);
					int var27 = var5.af_fld + (var5.aq_fld * var11 >> 8);
					if (var3 >= var15 && var3 <= var19 && var2 >= var23 && var2 <= var27) {
						return true;
					}
				}
			} else if (var5.al_fld == 3) {
				int var12 = var5.ay_fld - var3;
				if (var12 > 0) {
					int var16 = var5.ah_fld + (var5.au_fld * var12 >> 8);
					int var20 = var5.aw_fld + (var5.ax_fld * var12 >> 8);
					int var24 = var5.ar_fld + (var5.ai_fld * var12 >> 8);
					int var28 = var5.af_fld + (var5.aq_fld * var12 >> 8);
					if (var1 >= var16 && var1 <= var20 && var2 >= var24 && var2 <= var28) {
						return true;
					}
				}
			} else if (var5.al_fld == 4) {
				int var13 = var3 - var5.ay_fld;
				if (var13 > 0) {
					int var17 = var5.ah_fld + (var5.au_fld * var13 >> 8);
					int var21 = var5.aw_fld + (var5.ax_fld * var13 >> 8);
					int var25 = var5.ar_fld + (var5.ai_fld * var13 >> 8);
					int var29 = var5.af_fld + (var5.aq_fld * var13 >> 8);
					if (var1 >= var17 && var1 <= var21 && var2 >= var25 && var2 <= var29) {
						return true;
					}
				}
			} else if (var5.al_fld == 5) {
				int var14 = var2 - var5.ar_fld;
				if (var14 > 0) {
					int var18 = var5.ah_fld + (var5.au_fld * var14 >> 8);
					int var22 = var5.aw_fld + (var5.ax_fld * var14 >> 8);
					int var26 = var5.ay_fld + (var5.an_fld * var14 >> 8);
					int var30 = var5.as_fld + (var5.aa_fld * var14 >> 8);
					if (var1 >= var18 && var1 <= var22 && var3 >= var26 && var3 <= var30) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void xo(int var1, int var2, int var3, int var4) {
		fe(this, var1, var2, var3, var4);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lfw;I)V"
	)
	public void bz(fw var1, int var2) {
		try {
			int var3 = this.pg_fld[var2];
			if ((var3 & 32) != 0) {
				int var4 = 3 << this.zc_fld | var2;
				this.bz(var1, var4);
			}

			int var19 = var2 >> this.ph_fld & this.sz_fld;
			int var5 = var2 & this.up_int;
			int var6 = var2 >> this.zc_fld & 3;
			int var7 = this.df(var2);
			int var8 = this.pi(var2);
			int var9 = var19 - this.qr_fld;
			int var10 = var5 - this.qr_fld;
			if ((var3 & 256) != 0) {
				if (!this.md(var7, var19, var5) && ((var3 & 512) != 0 || var6 <= this.db_fld)) {
					fa var11 = this.of_fld[var2];
					var1.io(this, var11, var8, var7, var9, var10);
				}
			} else if ((var3 & 1024) != 0 && !this.md(var7, var19, var5)) {
				var1.xo(this, this.lh_fld[var2], var8, var9, var10);
			}

			if ((var3 & 16384) != 0) {
				fs var20 = this.xv_fld[var2];
				if (var20.ak_fld != null && !this.wo(var7, var19, var5, var20.aw_fld)) {
					this.oa(var1, var20.ak_fld, 0, var20.ae_fld, var20.av_fld, var20.ah_fld, var20.az_fld);
				}

				if (var20.ag_fld != null && !this.wo(var7, var19, var5, var20.aw_fld)) {
					this.oa(var1, var20.ag_fld, 0, var20.ae_fld, var20.av_fld, var20.ah_fld, var20.az_fld);
				}
			}

			if ((var3 & 32768) != 0) {
				fv var21 = this.pu_Arrfv[var2];
				if (!this.dc(var7, var19, var5, var21.ak_fld.ez_fld * -1271205903)) {
					if (var21.aw_fld == 256) {
						this.oa(var1, var21.ak_fld, 0, var21.ae_fld + var21.as_fld, var21.av_fld, var21.ah_fld + var21.ar_fld, var21.az_fld);
						if (var21.ag_fld != null) {
							this.oa(var1, var21.ag_fld, 0, var21.ae_fld + var21.af_fld, var21.av_fld, var21.ah_fld + var21.al_fld, var21.az_fld);
						}
					} else {
						this.oa(var1, var21.ak_fld, 0, var21.ae_fld + var21.as_fld, var21.av_fld, var21.ah_fld + var21.ar_fld, var21.az_fld);
					}
				}
			}

			if ((var3 & 2048) != 0) {
				ef var22 = this.gk_fld[var2];
				this.oa(var1, var22.ak_fld, 0, var22.ae_fld, var22.av_fld, var22.ah_fld, var22.ag_fld);
			}

			if ((this.pg_fld[var2] & 12288) != 0) {
				en var23 = this.oy_fld[var2];
				if (var23.av_fld != null) {
					this.oa(var1, var23.av_fld, 0, var23.ag_fld, var23.ak_fld - var23.ay_fld, var23.az_fld, var23.aw_fld);
				}

				if (var23.ae_fld != null) {
					this.oa(var1, var23.ae_fld, 0, var23.ag_fld, var23.ak_fld - var23.ay_fld, var23.az_fld, var23.aw_fld);
				}

				if (var23.ah_fld != null) {
					this.oa(var1, var23.ah_fld, 0, var23.ag_fld, var23.ak_fld - var23.ay_fld, var23.az_fld, var23.aw_fld);
				}
			}

			for (int var24 = 0; var24 < this.pc_fld[var2]; var24++) {
				fj var12 = this.sd_fld[var2 * 5 + var24];
				var12.au_fld = this.dh_fld;
				if (var9 == var12.ay_fld && var10 == var12.ar_fld) {
					try {
						this.oa(var1, var12.ak_fld, var12.ag_fld, var12.ah_fld, var12.ae_fld, var12.aw_fld, var12.az_fld);
					} catch (Exception var17) {
						client.logger.debug("exception drawing game entity", (Throwable)var17);
					}
				}
			}

			if ((var3 & 128) != 0) {
				rl17 var25 = this.rx_fld[var19 >> 3][var5 >> 3];

				for (int var26 = 0; var26 < var25.xi_fld.size(); var26++) {
					fj var13 = (fj)(fj)var25.xi_fld.get(var26);
					if (var13.ak_fld instanceof rq && var13.ay_fld == var9 && var13.ar_fld == var10) {
						var13.au_fld = this.dh_fld;

						try {
							this.oa(var1, var13.ak_fld, var13.ag_fld, var13.ah_fld, var13.ae_fld, var13.aw_fld, var13.az_fld);
						} catch (Exception var16) {
							client.logger.debug("exception drawing game entity", (Throwable)var16);
						}
					}
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public void fa(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		eh var9 = new eh();
		var9.ak_fld = var3 / 642883522;
		var9.ag_fld = var4 / 128 * 1352795072;
		var9.az_fld = var5 / 634334327;
		var9.av_fld = var6 / 128 * 1948847639;
		var9.ae_fld = var2 * -1502379719;
		var9.ah_fld = var3;
		var9.aw_fld = var4 * -519717351;
		var9.ay_fld = var5;
		var9.as_fld = var6 * 976606640;
		var9.ar_fld = var7 * -226141041;
		var9.af_fld = var8 * -747206641;
		this.dq_fld[var1][this.dm_fld[var1]++] = var9;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dx(int var1) {
		boolean var2 = this.nk_fld.add(var1);
		if (var2 && (client.ly_fld & 16) != 0 && this.up_java_util_Map != null) {
			int[] var3 = (int[])this.up_java_util_Map.get(var1);
			if (var3 != null) {
				for (int var7 : var3) {
					this.dx(var7);
				}
			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int fm(int var1, int var2, int var3) {
		int var4 = 0;
		ei var5 = this.bl_fld[var1][var2][var3];
		if (var5 != null) {
			for (int var6 = 0; var6 < var5.ah_fld; var6++) {
				if ((var5.aw_fld[var6].ax_fld * -1613956585 & 256) == 256 && var5.aw_fld[var6].ak_fld instanceof fn) {
					fn var7 = (fn)var5.aw_fld[var6].ak_fld;
					var7.ap();
					if (var7.ez_fld > var4) {
						var4 = var7.ez_fld;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int fe(int var1, int var2, int var3) {
		int var4 = 0;
		ei var5 = this.bl_fld[var1][var2][var3];
		if (var5 != null) {
			for (int var6 = 0; var6 < var5.ah_fld; var6++) {
				if ((var5.aw_fld[var6].ax_fld * 1650700399 & 256) == 256 && var5.aw_fld[var6].ak_fld instanceof fn) {
					fn var7 = (fn)var5.aw_fld[var6].ak_fld;
					var7.ap();
					if (var7.ez_fld > var4) {
						var4 = var7.ez_fld * 749891428;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIIIIIIIIIIIIIIIII)V"
	)
	public static void hy(
		ev var0,
		int var1,
		int var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20
	) {
		if (var0 == null) {
			var0.getClass();
		} else if (var4 == 0) {
			fa var24 = new fa(var11, var12, var13, var14, -1, var19, false);

			for (int var26 = var1; var26 >= 0; var26--) {
				if (var0.bl_fld[var26][var2][var3] == null) {
					var0.bl_fld[var26][var2][var3] = new ei(var26, var2, var3);
				}
			}

			var0.bl_fld[var1][var2][var3].az_fld = var24;
		} else if (var4 != 1) {
			if (var20 == 0) {
				var20 = 1;
			}

			fl var23 = new fl(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (int var25 = var1; var25 >= 0; var25--) {
				if (var0.bl_fld[var25][var2][var3] == null) {
					var0.bl_fld[var25][var2][var3] = new ei(var25, var2, var3);
				}
			}

			var0.bl_fld[var1][var2][var3].av_fld = var23;
		} else {
			fa var21 = new fa(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (int var22 = var1; var22 >= 0; var22--) {
				if (var0.bl_fld[var22][var2][var3] == null) {
					var0.bl_fld[var22][var2][var3] = new ei(var22, var2, var3);
				}
			}

			var0.bl_fld[var1][var2][var3].az_fld = var21;
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void fw(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.ah_fld = var5;
		var11.ag_fld = var2 * -500082803 + -1213858179;
		var11.az_fld = var3 * -68472369 + 1375606873;
		var11.ak_fld = var4 * 139491910;
		var11.aw_fld = var6;
		var11.av_fld = var8;
		var11.ae_fld = var9;
		var11.ay_fld = var10 * 336885059;
		if (this.bl_fld[var1][var2][var3] == null) {
			this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		this.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void gp(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					qp(var0, var6);
					return;
				}
			}
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gt() {
		for (int var1 = 0; var1 < this.cz_fld; var1++) {
			ei var2 = this.dy_fld[var1];

			for (int var3 = var2.ay_fld * -1044694629; var3 < var2.ah_fld; var3++) {
				var2.aw_fld[var3] = null;
			}

			var2.ah_fld = var2.ay_fld;
			if (var2.ar_fld != null) {
				var2.ar_fld.clear();
			}

			this.bt(var2);
		}

		this.cz_fld = 0;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long cq(int var1, int var2, int var3) {
		int var4 = var2 + this.qr_fld;
		int var5 = var3 + this.qr_fld;
		int var6 = this.dj(var1, var4, var5);
		if (!this.hz(var6)) {
			return 0L;
		} else {
			byte var7 = this.pc_fld[var6];

			for (int var8 = 0; var8 < var7; var8++) {
				fj var9 = this.sd_fld[var6 * 5 + var8];
				long var10 = var9.az_fld;
				int var12 = (int)(var10 >> 16 & 7L);
				if (var12 == 2 && var2 == var9.ay_fld && var3 == var9.ar_fld) {
					return var9.az_fld;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIIIIIJI)V"
	)
	public void fd(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13, int var15) {
		if (var5 != null) {
			fv var16 = new fv();
			var16.az_fld = var13;
			var16.au_fld = var15;
			var16.ae_fld = var2 * 1572450944 + 786225472;
			var16.ah_fld = var3 * -231508608 + -115754304;
			var16.av_fld = var4;
			var16.ak_fld = var5;
			var16.ag_fld = var6;
			var16.aw_fld = var7;
			var16.ay_fld = var8;
			var16.as_fld = var9;
			var16.ar_fld = var10;
			var16.af_fld = var11;
			var16.al_fld = var12;

			for (int var17 = var1; var17 >= 0; var17--) {
				if (this.bl_fld[var17][var2][var3] == null) {
					this.bl_fld[var17][var2][var3] = new ei(var17, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].aa_fld = var16;
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIIIIIJI)V"
	)
	public void fq(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13, int var15) {
		if (var5 != null) {
			fv var16 = new fv();
			var16.az_fld = var13;
			var16.au_fld = var15;
			var16.ae_fld = var2 * -252816928 + 786225472;
			var16.ah_fld = var3 * -231508608 + -115754304;
			var16.av_fld = var4 * -1946611173;
			var16.ak_fld = var5;
			var16.ag_fld = var6;
			var16.aw_fld = var7;
			var16.ay_fld = var8 * 75960625;
			var16.as_fld = var9;
			var16.ar_fld = var10;
			var16.af_fld = var11;
			var16.al_fld = var12;

			for (int var17 = var1; var17 >= 0; var17--) {
				if (this.bl_fld[var17][var2][var3] == null) {
					this.bl_fld[var17][var2][var3] = new ei(var17, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].aa_fld = var16;
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void mm(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		try {
			ee var15 = ee.zp_fld;
			float var16 = var15.mw_fld;
			float var17 = var15.hm_fld;
			float var18 = var15.oh_fld;
			ul var19 = ul.ta();
			var19.ak_fld.cr((float)client.gu(var1 & 2047), 0.0F, 0.0F);
			var19.ag_fld.wc(var4, var5, var6);
			ul var20 = ul.ta();
			var20.ag_fld.wc(-(this.dv_fld * 64) - this.eq_fld, this.ux_fld, -(this.dk_fld * 64) - this.pm_fld);
			uy var21 = ((ey)this.vg_fld).ak_fld;
			var21.wx(var20);
			uy var22 = uy.uo();
			var22.el(1.0F, this.bi_fld, 1.0F, 1.0F);
			sv.ii(var21, var22);
			sv.ii(var21, this.bo_fld);
			var22.wx(var19);
			sv.ii(var21, var22);
			var22.cv(var21);
			var22.bf();
			this.li_fld = var22.lu(var16, var17, var18);
			this.tv_fld = var22.vr(var16, var17, var18);
			this.tx_fld = var22.fb(var16, var17, var18);
			this.du_fld = (int)this.li_fld;
			this.do_fld = (int)this.tv_fld;
			this.co_fld = (int)this.tx_fld;
			this.dw_fld = this.du_fld >> 7;
			this.cc_fld = this.co_fld >> 7;
			this.eb_fld = (int)var22.lu(var12, 0.0F, var13) >> 7;
			this.ec_fld = (int)var22.fb(var12, 0.0F, var13) >> 7;
			var19.tz();
			var20.tz();
			var22.cj();
			this.lm_fld.ak_fld.cv(var21);
			uc var23 = uc.by_fld;
			var23.ca();
			var23.tl(-var15.tg_fld);
			var23.hr(-var15.ie_fld);
			var23.oh(var16, var17, var18);
			uy var24 = uy.uo();
			var24.yt(var23);
			var24.bf();
			sv.ii(var21, var24);
			var24.cj();
			ej.bk_fld = false;
			((ey)this.vg_fld).az_fld = var10;
			if ((client.ly_fld & 16) != 0) {
				this.ic(true, var14);
				this.gq(this.vg_fld, this.lm_fld);
				fc.ar_fld.au_fld.rf(this.bd_fld);
			} else {
				this.ic(fc.ar_fld.al_fld != 1, var14);
				if (fc.ar_fld.al_fld == 0) {
					if (!pu_boolean && !fc.al_fld.je()) {
						throw new AssertionError();
					}

					if (!pu_boolean && og.ci_fld.isGpu()) {
						throw new AssertionError();
					}

					this.sq(this.vg_fld);
				} else {
					this.zt(this.vg_fld);
				}

				fc.ar_fld.au_fld.rf(this.bd_fld);
				if (client.bt_fld != null) {
					client.bt_fld.postDrawScene();
				}
			}

			ej.bk_fld = false;
		} catch (Throwable var26) {
			throw new RuntimeException(var26);
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIIIIIJI)V"
	)
	public void fu(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13, int var15) {
		if (var5 != null) {
			fv var16 = new fv();
			var16.az_fld = var13;
			var16.au_fld = var15;
			var16.ae_fld = var2 * 1572450944 + 786225472;
			var16.ah_fld = var3 * -1440476487 + -115754304;
			var16.av_fld = var4 * -969009755;
			var16.ak_fld = var5;
			var16.ag_fld = var6;
			var16.aw_fld = var7;
			var16.ay_fld = var8;
			var16.as_fld = var9;
			var16.ar_fld = var10;
			var16.af_fld = var11 * -1597793066;
			var16.al_fld = var12;

			for (int var17 = var1; var17 >= 0; var17--) {
				if (this.bl_fld[var17][var2][var3] == null) {
					this.bl_fld[var17][var2][var3] = new ei(var17, var2, var3);
				}
			}

			this.bl_fld[var1][var2][var3].aa_fld = var16;
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ka_boolean(int var1, int var2, int var3, int var4) {
		if (!this.cl(var1, var2, var3, var4)) {
			return this.ch(var1, var2, var3, var4);
		} else {
			this.dc(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + ay_fld;
			int var6 = var2 * 64;
			int var7 = (var3 - this.ds_fld - this.cx_fld - 1) * 128;
			int var8 = (var4 - this.ds_fld - this.ca_fld - 1) * 128;

			for (int var9 = -this.es_fld; var9 <= this.bu_fld; var9 += 128) {
				if (this.dm(var7, this.dp_fld[var1] + var9, var8, var5, var6)) {
					return mu(this, var1, var2, var3, var4, true);
				}
			}

			return mu(this, var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(IIIIILem;IJZ)Z"
	)
	public boolean fi(int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, boolean var10) {
		try {
			if (var6 == null) {
				return true;
			} else {
				int var11 = var2 - var5;
				int var12 = var3 - var5;
				int var13 = var2 + var5;
				int var14 = var3 + var5;
				if (var10) {
					if (var7 > 640 && var7 < 1408) {
						var14 += 128;
					}

					if (var7 > 1152 && var7 < 1920) {
						var13 += 128;
					}

					if (var7 > 1664 || var7 < 384) {
						var12 -= 128;
					}

					if (var7 > 128 && var7 < 896) {
						var11 -= 128;
					}
				}

				var11 /= 128;
				var12 /= 128;
				var13 /= 128;
				var14 /= 128;
				return jh(this, var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JI)V"
	)
	public void fc(int var1, int var2, int var3, int var4, em var5, long var6, int var8) {
		if (var5 != null) {
			ef var9 = new ef();
			var9.ak_fld = var5;
			var9.ae_fld = var2 * -1166307200 + 1564330048;
			var9.ah_fld = var3 * 624443617 + 419027520;
			var9.av_fld = var4;
			var9.ag_fld = var6;
			var9.ag(var8, -448052585);
			if (this.bl_fld[var1][var2][var3] == null) {
				this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
			}

			this.bl_fld[var1][var2][var3].ai_fld = var9;
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILem;IZJI)Z"
	)
	boolean gg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, em var9, int var10, boolean var11, long var12, int var14) {
		for (int var15 = var2; var15 < var2 + var4; var15++) {
			for (int var16 = var3; var16 < var3 + var5; var16++) {
				if (var15 < 0 || var16 < 0 || var15 >= this.dv_fld || var16 >= this.dk_fld) {
					return false;
				}

				ei var17 = this.bl_fld[var1][var15][var16];
				if (var17 != null && var17.ah_fld >= 5) {
					return false;
				}
			}
		}

		fj var21 = new fj();
		var21.az_fld = var12;
		var21.ax_fld = var14;
		var21.av_fld = var1;
		var21.ah_fld = var6;
		var21.aw_fld = var7;
		var21.ae_fld = var8;
		var21.ak_fld = var9;
		var21.ag_fld = var10;
		var21.ay_fld = var2;
		var21.ar_fld = var3;
		var21.as_fld = var2 + var4 - 1;
		var21.af_fld = var3 + var5 - 1;

		for (int var22 = var2; var22 < var2 + var4; var22++) {
			for (int var23 = var3; var23 < var3 + var5; var23++) {
				int var18 = 0;
				if (var22 > var2) {
					var18++;
				}

				if (var22 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var23 > var3) {
					var18 += 8;
				}

				if (var23 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; var19--) {
					if (this.bl_fld[var19][var22][var23] == null) {
						this.bl_fld[var19][var22][var23] = new ei(var19, var22, var23);
					}
				}

				ei var24 = this.bl_fld[var1][var22][var23];
				if (var11) {
					this.gh(var24);
				}

				var24.aw_fld[var24.ah_fld] = var21;
				var24.aq_fld[var24.ah_fld] = var18;
				var24.am_fld |= var18;
				var24.ah_fld++;
			}
		}

		return true;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;IJ)Z"
	)
	public boolean gc(int var1, int var2, int var3, int var4, em var5, int var6, long var7) {
		if (var5 == null) {
			return false;
		} else {
			int var9 = var2 / 128;
			int var10 = var3 / 128;
			if (var9 >= 0 && var10 >= 0 && var9 < this.dv_fld && var10 < this.dk_fld) {
				ei var11 = this.bl_fld[var1][var9][var10];
				if (var11 != null && (var11.ar_fld == null || var11.ar_fld.size() != 50)) {
					if (var11.ar_fld == null) {
						var11.ar_fld = new ArrayList();
					}

					fj var12 = new fj();
					var12.az_fld = var7;
					var12.ax_fld = 0;
					var12.av_fld = var1;
					var12.ah_fld = var2;
					var12.aw_fld = var3;
					var12.ae_fld = var4;
					var12.ak_fld = var5;
					var12.ag_fld = var6;
					var12.ay_fld = var9;
					var12.ar_fld = var10;
					var12.as_fld = var9;
					var12.af_fld = var10;
					var11.ar_fld.add(var12);
					this.gh(var11);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;IJ)Z"
	)
	public boolean gn(int var1, int var2, int var3, int var4, em var5, int var6, long var7) {
		if (var5 == null) {
			return false;
		} else {
			int var9 = var2 / 128;
			int var10 = var3 / 128;
			if (var9 >= 0 && var10 >= 0 && var9 < this.dv_fld && var10 < this.dk_fld) {
				ei var11 = this.bl_fld[var1][var9][var10];
				if (var11 != null && (var11.ar_fld == null || var11.ar_fld.size() != 50)) {
					if (var11.ar_fld == null) {
						var11.ar_fld = new ArrayList();
					}

					fj var12 = new fj();
					var12.az_fld = var7;
					var12.ax_fld = 0;
					var12.av_fld = var1;
					var12.ah_fld = var2;
					var12.aw_fld = var3;
					var12.ae_fld = var4;
					var12.ak_fld = var5;
					var12.ag_fld = var6;
					var12.ay_fld = var9;
					var12.ar_fld = var10;
					var12.as_fld = var9;
					var12.af_fld = var10;
					var11.ar_fld.add(var12);
					this.gh(var11);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean wo(int var1, int var2, int var3, int var4) {
		return el.gt(this, var1, var2, var3, var4);
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lei;)Z"
	)
	boolean gr(ei var1) {
		if (var1.as_fld != this.dh_fld) {
			var1.as_fld = this.dh_fld;
			var1.ay_fld = var1.ah_fld;
			if (this.cz_fld >= this.dy_fld.length) {
				this.dy_fld = (ei[])(ei[])Arrays.copyOf(this.dy_fld, this.dy_fld.length * 2);
			}

			this.dy_fld[this.cz_fld++] = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;Lem;IIIIJ)V"
	)
	public void fq(fw var1, fw var2, em var3, int var4, int var5, int var6, int var7, long var8) {
		try {
			if (var3 instanceof fn) {
				fn var10 = (fn)var3;
				var10.calculateBoundsCylinder();
				client.tu(var1, var2, var10, var4, var5, var6, var7, var8);
			} else if (var3 instanceof dz) {
				int var16 = client.ly_fld >> 7 & 15;
				dz var11 = (dz)var3;
				if (var11.fy_fld || var16 > 0) {
					fn var12 = var11.bx(rl21.ao_fld);
					if (var12 != null) {
						var12.calculateBoundsCylinder();
						int var13 = var11.getAnimationHeightOffset();
						if (!pu_boolean && var11.fy_fld && var13 != 0) {
							throw new AssertionError();
						}

						client.tu(var1, var2, var12, var4, var5, var6 - var13, var7, var8);
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lei;)Z"
	)
	boolean bx(ei var1) {
		if (var1.as_fld != this.dh_fld) {
			var1.as_fld = this.dh_fld;
			var1.ay_fld = var1.ah_fld;
			if (this.cz_fld >= this.dy_fld.length) {
				this.dy_fld = (ei[])(ei[])Arrays.copyOf(this.dy_fld, this.dy_fld.length * 2);
			}

			this.dy_fld[this.cz_fld++] = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ey() {
		for (int var1 = 0; var1 < this.cf_fld; var1++) {
			for (int var2 = 0; var2 < this.dv_fld; var2++) {
				for (int var3 = 0; var3 < this.dk_fld; var3++) {
					this.bl_fld[var1][var2][var3] = null;
				}
			}
		}

		if (this.dm_fld != null) {
			for (int var4 = 0; var4 < this.di_fld; var4++) {
				for (int var7 = 0; var7 < this.dm_fld[var4]; var7++) {
					this.dq_fld[var4][var7] = null;
				}

				this.dm_fld[var4] = 0;
			}
		}

		if (this.bb_fld != null) {
			Arrays.fill(this.bb_fld, null);
		}

		this.ce_fld = 0;

		for (int var5 = 0; var5 < this.cz_fld; var5++) {
			this.dy_fld[var5] = null;
		}

		this.cz_fld = 0;

		for (int var6 = 0; var6 < this.cl_fld.length; var6++) {
			this.cl_fld[var6] = null;
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	void gu(fj var1) {
		for (int var2 = var1.ay_fld * 227101990; var2 <= var1.as_fld; var2++) {
			for (int var3 = var1.ar_fld * 1567316318; var3 <= var1.af_fld; var3++) {
				ei var4 = this.bl_fld[var1.av_fld * -2067436034][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.ah_fld; var5++) {
						if (var4.aw_fld[var5] == var1) {
							var4.ah_fld -= -871854475;

							for (int var6 = var5; var6 < var4.ah_fld; var6++) {
								var4.aw_fld[var6] = var4.aw_fld[var6 + 1];
								var4.aq_fld[var6] = var4.aq_fld[var6 + 1];
							}

							var4.aw_fld[var4.ah_fld * 1360931881] = null;
							break;
						}
					}

					this.bt(var4);
				}
			}
		}
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIII)V"
	)
	public void to(em var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			fn var8 = null;
			int var9 = client.ly_fld >> 7 & 15;
			if (!(var1 instanceof dz) || !((dz)var1).fy_fld && var9 <= 0) {
				if (var1 instanceof fn) {
					var8 = (fn)var1;
				}
			} else {
				var8 = ((dz)var1).da();
			}

			if (var8 != null) {
				var8.calculateExtreme(var2);
				fm var10 = var8.getAABB(var2);
				int var11 = var3 - ((var6 & 7) << 7);
				int var12 = var5 - ((var7 & 7) << 7);
				int var13 = var11 + var10.ag_fld;
				int var14 = var4 + var10.az_fld;
				int var15 = var12 + var10.av_fld;
				int var16 = var13 - var10.ae_fld;
				int var17 = var14 - var10.ah_fld;
				int var18 = var15 - var10.aw_fld;
				int var19 = var13 + var10.ae_fld;
				int var20 = var14 + var10.ah_fld;
				int var21 = var15 + var10.aw_fld;
				int var22 = var6 + this.qr_fld;
				int var23 = var7 + this.qr_fld;
				rl17 var24 = this.rx_fld[var22 >> 3][var23 >> 3];
				var24.pu_fld = Math.min(var24.pu_fld, var16);
				var24.im_fld = Math.min(var24.im_fld, var17);
				var24.af_fld = Math.min(var24.af_fld, var18);
				var24.nl_fld = Math.max(var24.nl_fld, var19);
				var24.nu_fld = Math.max(var24.nu_fld, var20);
				var24.yv_fld = Math.max(var24.yv_fld, var21);
			}
		} catch (Throwable var26) {
			throw new RuntimeException(var26);
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	void gp(fj var1) {
		for (int var2 = var1.ay_fld; var2 <= var1.as_fld; var2++) {
			for (int var3 = var1.ar_fld; var3 <= var1.af_fld; var3++) {
				ei var4 = this.bl_fld[var1.av_fld][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.ah_fld; var5++) {
						if (var4.aw_fld[var5] == var1) {
							var4.ah_fld--;

							for (int var6 = var5; var6 < var4.ah_fld; var6++) {
								var4.aw_fld[var6] = var4.aw_fld[var6 + 1];
								var4.aq_fld[var6] = var4.aq_fld[var6 + 1];
							}

							var4.aw_fld[var4.ah_fld] = null;
							break;
						}
					}

					this.bt(var4);
				}
			}
		}
	}

	@ObfuscatedName("getWorldViewId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWorldViewId")
	@Override
	public int getWorldViewId() {
		return this.bt_fld;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	void gv(fj var1) {
		for (int var2 = var1.ay_fld; var2 <= var1.as_fld; var2++) {
			for (int var3 = var1.ar_fld * 1987223924; var3 <= var1.af_fld; var3++) {
				ei var4 = this.bl_fld[var1.av_fld * 211260525][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.ah_fld; var5++) {
						if (var4.aw_fld[var5] == var1) {
							var4.ah_fld--;

							for (int var6 = var5; var6 < var4.ah_fld; var6++) {
								var4.aw_fld[var6] = var4.aw_fld[var6 + 1];
								var4.aq_fld[var6] = var4.aq_fld[var6 + 1];
							}

							var4.aw_fld[var4.ah_fld] = null;
							break;
						}
					}

					this.bt(var4);
				}
			}
		}
	}

	@ObfuscatedName("getUnderlayIds")
	@ObfuscatedSignature(
		descriptor = "()[[[S"
	)
	@Export("getUnderlayIds")
	@Override
	public short[][][] getUnderlayIds() {
		return this.kq_ArrArrArrshort;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;)V"
	)
	public void gq(fw var1, fw var2) {
		try {
			int var3 = this.dw_fld >> 3;
			int var4 = this.cc_fld >> 3;
			int var5 = xc_fld >> 3;
			int var6 = this.dv_fld >> 3;
			int var7 = this.dk_fld >> 3;
			this.wj_fld = 0;

			for (int var8 = -var5; var8 <= var5; var8++) {
				for (int var9 = -var5; var9 <= var5; var9++) {
					int var10 = var3 + var8;
					int var11 = var4 + var9;
					if (var10 >= 0 && var10 < var6 && var11 >= 0 && var11 < var7) {
						rl17 var12 = this.eu_Arrrl17[this.wj_fld++] = this.rx_fld[var10][var11];
						var12.of_fld = false;
					}
				}
			}

			Arrays.sort(this.eu_Arrrl17, 0, this.wj_fld, this.wc_fld);
			rl23.ow(var1, this);

			for (int var15 = 0; var15 < this.wj_fld; var15++) {
				rl17 var18 = this.eu_Arrrl17[var15];
				if (!this.aj_fld || this.ma(var18, var18.zb_fld, var18.bj_fld)) {
					var18.of_fld = true;
					client.bt_fld.drawZoneOpaque(var2, this, var18.zb_fld, var18.bj_fld);
					this.cv(var1, var2, var18, this.nk_fld);
					this.du(var1, var2, var18);
				}
			}

			for (int var16 = this.wj_fld - 1; var16 >= 0; var16--) {
				rl17 var19 = this.eu_Arrrl17[var16];
				if (var19.of_fld) {
					this.ht(var1, var2, var19);
				}
			}

			rl23.qv();
			rl23.ox();

			for (int var17 = this.wj_fld - 1; var17 >= 0; var17--) {
				rl17 var20 = this.eu_Arrrl17[var17];
				if (var20.of_fld) {
					this.mp(var1, var20);
				}
			}

			client.bt_fld.drawPass(var2, this, 0);
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void aj(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.an_fld = null;
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	void gk(fj var1) {
		for (int var2 = var1.ay_fld; var2 <= var1.as_fld; var2++) {
			for (int var3 = var1.ar_fld; var3 <= var1.af_fld; var3++) {
				ei var4 = this.bl_fld[var1.av_fld][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.ah_fld; var5++) {
						if (var4.aw_fld[var5] == var1) {
							var4.ah_fld--;

							for (int var6 = var5; var6 < var4.ah_fld; var6++) {
								var4.aw_fld[var6] = var4.aw_fld[var6 + 1];
								var4.aq_fld[var6] = var4.aq_fld[var6 + 1];
							}

							var4.aw_fld[var4.ah_fld] = null;
							break;
						}
					}

					this.bt(var4);
				}
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ga(int var1, int var2, int var3, int var4) {
		ei var5 = this.bl_fld[var1][var2][var3];
		if (var5 != null) {
			fv var6 = var5.aa_fld;
			if (var6 != null) {
				if (var6.as_fld != 0) {
					var6.as_fld = var6.as_fld < 0 ? -var4 : var4;
				}

				if (var6.ar_fld != 0) {
					var6.ar_fld = var6.ar_fld < 0 ? -var4 : var4;
				}
			}
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void gl(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.aa_fld = null;
		}
	}

	@ObfuscatedName("setDrawDistance")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setDrawDistance")
	@Override
	public void setDrawDistance(int var1) {
		xc_fld = var1;
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JI)V"
	)
	public void ni(int var1, int var2, int var3, int var4, em var5, long var6, int var8) {
		try {
			ap(this, var1, var2, var3, var4, var5, var6, var8);
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "([IIIII)V"
	)
	public void dh(int[] var1, int var2, int var3, int var4, int var5) {
		this.dp_fld = var1;
		this.es_fld = var2;
		this.bu_fld = var3;
		this.cq_fld = var4;
		this.cg_fld = var5;
		this.cn_fld = 0;
		this.cb_fld = 0;
		this.eo_fld = var4;
		this.cd_fld = var5;
		this.cy_fld = var4 / 2;
		this.dt_fld = var5 / 2;
		this.et_fld.set(0, this.et_fld.size());
		this.ex_fld.set(0, this.ex_fld.size());
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfw;Z)V"
	)
	public static void ag(ev var0, fw var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.dx_fld = 0;

			for (int var3 = var0.cu_fld; var3 < var0.cf_fld; var3++) {
				ei[][] var4 = var0.bl_fld[var3];

				for (int var5 = var0.bn_fld; var5 < var0.dz_fld; var5++) {
					for (int var6 = var0.cr_fld; var6 < var0.bg_fld; var6++) {
						ei var7 = var4[var5][var6];
						if (var7 != null
							&& var7.ad_fld <= var0.bw_fld
							&& (
								!var2
									|| var0.dz(var5 - var0.dw_fld + var0.cx_fld + var0.ds_fld, var6 - var0.cc_fld + var0.ca_fld + var0.ds_fld)
									|| var0.cv_fld[var3][var5][var6] - var0.do_fld >= 2000
							)) {
							var0.dw(var1, var7);
						}
					}
				}
			}

			var0.dr();
			fc.ar_fld.au_fld.ak(var0.bd_fld);
		}
	}

	@ObfuscatedName("setRoofRemovalMode")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setRoofRemovalMode")
	@Override
	public void setRoofRemovalMode(int var1) {
		this.mf_int = var1;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)Z"
	)
	public static boolean kf(ev var0, int var1, int var2) {
		if (!var0.co(var0.cp_fld, var0.dj_fld, var1, var2)) {
			return var0.ck(var0.cp_fld, var0.dj_fld, var1, var2);
		} else {
			hb.xu(var0, var0.cp_fld, var0.dj_fld, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; var4++) {
				for (int var5 = -1; var5 <= 1; var5++) {
					if (var0.dt(var0.cp_fld, var0.dj_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (var0.dt(var0.cp_fld, (var0.dj_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (var0.dt(var0.cp_fld + 1, var0.dj_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (var0.dt(var0.cp_fld + 1, (var0.dj_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return var0.cb(var0.cp_fld, var0.dj_fld, var1, var2, var3);
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void hj(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					qp(this, var6);
					return;
				}
			}
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean mh(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.ce_fld; var4++) {
			eh var5 = this.bb_fld[var4];
			if (var5.al_fld == 1) {
				int var6 = var5.ah_fld - var1;
				if (var6 > 0) {
					int var7 = var5.ay_fld + (var5.an_fld * var6 >> 8);
					int var8 = var5.as_fld + (var5.aa_fld * var6 >> 8);
					int var9 = var5.ar_fld + (var5.ai_fld * var6 >> 8);
					int var10 = var5.af_fld + (var5.aq_fld * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.al_fld == 2) {
				int var11 = var1 - var5.ah_fld;
				if (var11 > 0) {
					int var15 = var5.ay_fld + (var5.an_fld * var11 >> 8);
					int var19 = var5.as_fld + (var5.aa_fld * var11 >> 8);
					int var23 = var5.ar_fld + (var5.ai_fld * var11 >> 8);
					int var27 = var5.af_fld + (var5.aq_fld * var11 >> 8);
					if (var3 >= var15 && var3 <= var19 && var2 >= var23 && var2 <= var27) {
						return true;
					}
				}
			} else if (var5.al_fld == 3) {
				int var12 = var5.ay_fld - var3;
				if (var12 > 0) {
					int var16 = var5.ah_fld + (var5.au_fld * var12 >> 8);
					int var20 = var5.aw_fld + (var5.ax_fld * var12 >> 8);
					int var24 = var5.ar_fld + (var5.ai_fld * var12 >> 8);
					int var28 = var5.af_fld + (var5.aq_fld * var12 >> 8);
					if (var1 >= var16 && var1 <= var20 && var2 >= var24 && var2 <= var28) {
						return true;
					}
				}
			} else if (var5.al_fld == 4) {
				int var13 = var3 - var5.ay_fld;
				if (var13 > 0) {
					int var17 = var5.ah_fld + (var5.au_fld * var13 >> 8);
					int var21 = var5.aw_fld + (var5.ax_fld * var13 >> 8);
					int var25 = var5.ar_fld + (var5.ai_fld * var13 >> 8);
					int var29 = var5.af_fld + (var5.aq_fld * var13 >> 8);
					if (var1 >= var17 && var1 <= var21 && var2 >= var25 && var2 <= var29) {
						return true;
					}
				}
			} else if (var5.al_fld == 5) {
				int var14 = var2 - var5.ar_fld;
				if (var14 > 0) {
					int var18 = var5.ah_fld + (var5.au_fld * var14 >> 8);
					int var22 = var5.aw_fld + (var5.ax_fld * var14 >> 8);
					int var26 = var5.ay_fld + (var5.an_fld * var14 >> 8);
					int var30 = var5.as_fld + (var5.aa_fld * var14 >> 8);
					if (var1 >= var18 && var1 <= var22 && var3 >= var26 && var3 <= var30) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)V"
	)
	public static void lm(ev var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ds_fld = og.al(25, 90, var1);
		fh.ae(var0.ds_fld);
		if (var0.dp_fld != null && var0.dp_fld.length > 0) {
			var0.dh(var0.dp_fld, var0.es_fld, var0.bu_fld, var0.cq_fld, var0.cg_fld);
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void hf(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.ai_fld = null;
		}
	}

	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "(Lrl10;I[Ljava/util/Set;)V"
	)
	public void ru(rl10 var1, int var2, Set[] var3) {
		this.ap(var1.xo_fld);

		int var4;
		while ((var4 = this.lv()) != this.hs_fld) {
			int var5 = var4 >> this.ph_fld & this.sz_fld;
			int var6 = var4 & this.up_int;
			int var7 = var4 >> this.zc_fld & 3;
			if (this.eu_ArrArrArrint[var7][var5][var6] == 0) {
				if (this.ds(var7, var5, var6)) {
					this.qn(var7, var5 - 1, var6);
					this.qn(var7, var5 + 1, var6);
					this.qn(var7, var5, var6 - 1);
					this.qn(var7, var5, var6 + 1);
					this.qn(var7, var5 - 1, var6 - 1);
					this.qn(var7, var5 + 1, var6 - 1);
					this.qn(var7, var5 - 1, var6 + 1);
					this.qn(var7, var5 + 1, var6 + 1);
				}

				this.eu_ArrArrArrint[var7][var5][var6] = var2;
				int var8 = var7 + 1;

				for (int var9 = 0; var8 < 4; var9++) {
					int var10 = this.eu_ArrArrArrint[var8][var5][var6];
					if (var10 != 0) {
						var3[var9].add(var10);
						break;
					}

					var10 = var2 | var9 + 1 << 28;
					this.eu_ArrArrArrint[var8][var5][var6] = var10;
					var3[var9].add(var10);
					var8++;
				}
			}
		}

		for (int var11 = 0; var11 < 3; var11++) {
			Set var12 = var3[var11];
			if (var12.size() > 0) {
				this.up_java_util_Map.put(var2 | var11 << 28, var12.stream().mapToInt(var0 -> ((Integer)var0).intValue()).toArray());
				var12.clear();
			}
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	public void cw(er var1) {
		if (var1 != this.dn_fld) {
			this.dn_fld = var1;
			this.dh(this.dp_fld, this.es_fld, this.bu_fld, this.cq_fld, this.cg_fld);
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lrl10;)V"
	)
	public void jm(rl10 var1) {
		Callbacks var2 = og.ci_fld.getCallbacks();
		fs var3 = var1.getWallObject();
		if (var3 != null) {
			WallObjectSpawned var4 = new WallObjectSpawned();
			var4.setTile(var1);
			var4.setWallObject(var3);
			var2.post(var4);
		}

		fv var13 = var1.getDecorativeObject();
		if (var13 != null) {
			DecorativeObjectSpawned var5 = new DecorativeObjectSpawned();
			var5.setTile(var1);
			var5.setDecorativeObject(var13);
			var2.post(var5);
		}

		ef var14 = var1.getGroundObject();
		if (var14 != null) {
			GroundObjectSpawned var6 = new GroundObjectSpawned();
			var6.setTile(var1);
			var6.setGroundObject(var14);
			var2.post(var6);
		}

		for (fj var9 : var1.getGameObjects()) {
			if (var9 != null) {
				int var10 = var9.ay_fld;
				int var11 = var9.ar_fld;
				if (var10 == var1.ex() && var11 == var1.ci() && var9.as_fld < 104 && var9.af_fld < 104) {
					GameObjectSpawned var12 = new GameObjectSpawned();
					var12.setTile(var1);
					var12.setGameObject(var9);
					var2.post(var12);
				}
			}
		}
	}

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfj;"
	)
	public static fj qe(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int ay(boolean var0) {
		return var0 ? 520 : 383;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lev;[IIIIII)V"
	)
	public static void mc(ev var0, int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		}

		var5 += var0.qr_fld;
		var6 += var0.qr_fld;
		int var7 = var0.dj(var4, var5, var6);
		if (var0.hz(var7)) {
			int var8 = var0.pg_fld[var7];
			if ((var8 & 256) != 0) {
				fa var9 = var0.of_fld[var7];
				int var10 = var9.aw_fld;
				if (var10 != 0) {
					for (int var11 = 0; var11 < 4; var11++) {
						var1[var2] = var10;
						var1[var2 + 1] = var10;
						var1[var2 + 2] = var10;
						var1[var2 + 3] = var10;
						var2 += var3;
					}
				}
			} else if ((var8 & 1024) != 0) {
				fl var20 = var0.lh_fld[var7];
				if (var20 != null) {
					int var21 = var20.ad_fld;
					int var22 = var20.ao_fld;
					int var12 = var20.ab_fld;
					int var13 = var20.ap_fld;
					int[] var14 = dr_fld[var21];
					int[] var15 = da_fld[var22];
					int var16 = 0;
					if (var12 != 0) {
						for (int var17 = 0; var17 < 4; var17++) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (int var29 = 0; var29 < 4; var29++) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("zd")
	@ObfuscatedSignature(
		descriptor = "(Lfw;)V"
	)
	public void zd(fw var1) {
		this.bd_fld.rf(fc.ar_fld.au_fld);
		fc.ar_fld.au_fld.rf(this.bm_fld);
		client.bt_fld.drawPass(var1, this, 2);

		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = this.wj_fld - 1; var3 >= 0; var3--) {
				rl17 var4 = this.eu_Arrrl17[var3];
				if (var4.of_fld) {
					client.bt_fld.drawZoneAlpha(var1, this, var2, var4.zb_fld, var4.bj_fld);

					for (int var5 = 0; var5 < var4.xi_fld.size(); var5++) {
						fj var6 = (fj)(fj)var4.xi_fld.get(var5);
						if (var6.av_fld == var2 && var6.ak_fld instanceof ev) {
							ev var7 = (ev)var6.ak_fld;
							var7.zd(var7.lm_fld);
						}
					}
				}
			}
		}

		client.bt_fld.drawPass(var1, this, 1);
		client.bt_fld.postSceneDraw(this);
		this.fs();
		fc.ar_fld.au_fld.rf(this.bd_fld);
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III)Lef;"
	)
	public ef hq(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld : null;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(III)Lef;"
	)
	public ef hl(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld : null;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(III)Lef;"
	)
	public ef hc(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld : null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)Lef;"
	)
	public ef bb(int var1, int var2, int var3) {
		var2 += this.qr_fld;
		var3 += this.qr_fld;
		int var4 = this.dj(var1, var2, var3);
		return this.hz(var4) ? this.gk_fld[var4] : null;
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void ll(fw var1, boolean var2) {
		this.dx_fld = 0;

		for (int var3 = this.cu_fld; var3 < this.cf_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.bn_fld; var5 < this.dz_fld; var5++) {
				for (int var6 = this.cr_fld; var6 < this.bg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null
						&& var7.ad_fld <= this.bw_fld
						&& (
							!var2
								|| this.dz(var5 - this.dw_fld + this.cx_fld + this.ds_fld, var6 - this.cc_fld + this.ca_fld + this.ds_fld)
								|| this.cv_fld[var3][var5][var6] - this.do_fld >= -1202574060
						)) {
						this.dw(var1, var7);
					}
				}
			}
		}

		this.dr();
		fc.ar_fld.au_fld.ak(this.bd_fld);
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int df(int var1) {
		int var2 = var1 >> this.zc_fld & 3;
		return var2 + (this.pg_fld[var1 & this.zb_fld - 1] >> 5 & 1) & 3;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long hv(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.an_fld != null ? var4.an_fld.az_fld * -4472860599998239529L : 0L;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long ht(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.aa_fld != null ? var4.aa_fld.az_fld * 7130385936274174641L : 0L;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long hx(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.aa_fld != null ? var4.aa_fld.az_fld * 7130385936274174641L : 0L;
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	boolean mv(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 == var3 && var4 == var5) {
			if (!this.dj_boolean(var1, var2, var4)) {
				return false;
			} else {
				int var13 = var2 << 7;
				int var15 = var4 << 7;
				return this.mh(var13 + 1, this.cv_fld[var1][var2][var4] - var6, var15 + 1)
					&& this.mh(var13 + -1401975648 - 1, this.cv_fld[var1][var2 + 1][var4] - var6, var15 + 1)
					&& this.mh(var13 + 128 - 1, this.cv_fld[var1][var2 + 1][var4 + 1] - var6, var15 + -1621170969 - 1)
					&& this.mh(var13 + 1, this.cv_fld[var1][var2][var4 + 1] - var6, var15 + 184198862 - 1);
			}
		} else {
			for (int var7 = var2; var7 <= var3; var7++) {
				for (int var8 = var4; var8 <= var5; var8++) {
					if (this.cs_fld[var1][var7][var8] == -this.dh_fld) {
						return false;
					}
				}
			}

			int var12 = (var2 << 7) + 1;
			int var14 = (var4 << 7) + 2;
			int var9 = this.cv_fld[var1][var2][var4] - var6;
			if (!this.mh(var12, var9, var14)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.mh(var10, var9, var14)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					return !this.mh(var12, var9, var11) ? false : this.mh(var10, var9, var11);
				}
			}
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long hy(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					return var6.az_fld;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long hz(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					return var6.az_fld;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long ho(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					return var6.az_fld;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int aw(boolean var0) {
		return var0 ? 1 : 128;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long ib(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld.ag_fld * 2728893160458550201L : 0L;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean ds(int var1, int var2, int var3) {
		return (this.nl_fld[var1][var2][var3] & 4) != 0;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()[[[Lrl10;"
	)
	public rl10[][][] getExtendedTiles() {
		return this.vo_fld;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z"
	)
	boolean kt(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = fc.ah_fld;
		int[] var7 = fc.aw_fld;
		int var8 = var6[var4];
		int var9 = var7[var4];
		int var10 = var6[var5];
		int var11 = var7[var5];
		int var12 = var3 * var10 + var1 * var11 >> 16;
		int var13 = var3 * var11 - var1 * var10 >> 16;
		int var14 = var2 * var8 + var13 * var9 >> 16;
		int var15 = var2 * var9 - var13 * var8 >> 16;
		if (var14 >= 50 && var14 <= fh.az()) {
			int var16 = this.cy_fld + var12 * -222619243 / var14;
			int var17 = this.dt_fld + var15 * 117073947 / var14;
			return var16 >= this.cn_fld && var16 <= this.eo_fld && var17 >= this.cb_fld && var17 <= this.cd_fld;
		} else {
			return false;
		}
	}

	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "(Lfw;)V"
	)
	public void sq(fw var1) {
		try {
			if (!pu_boolean && og.ci_fld.isGpu()) {
				throw new AssertionError();
			} else {
				boolean var2 = this.mf_int != 0 && this.aj_fld;
				this.dx_fld = 0;

				for (int var3 = this.cu_fld; var3 < this.cf_fld; var3++) {
					for (int var4 = this.bn_fld; var4 < this.dz_fld; var4++) {
						for (int var5 = this.cr_fld; var5 < this.bg_fld; var5++) {
							int var6 = this.dj(var3, var4, var5);
							if (this.hz(var6)) {
								int var7 = this.pi(var6);
								int var8 = this.eu_ArrArrArrint[this.fb_fld.ae_fld * -457350413][var4][var5];
								if ((var7 <= this.bw_fld || var2)
									&& (
										!this.aj_fld
											|| this.sm(var4 - this.dw_fld + this.cx_fld + this.ds_fld, var5 - this.cc_fld + this.ca_fld + this.ds_fld)
											|| this.cv_fld[var3][var4][var5] - this.do_fld >= 2000
									)
									&& (!var2 || this.fb_fld.ae_fld * -457350413 >= var7 || var8 == 0 || !this.nk_fld.contains(var8))) {
									this.bz(var1, var6);
								}
							}
						}
					}
				}

				this.fs();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void kr(int var1, int var2, int var3) {
		this.db_fld = var1;
		this.ck_fld = var2;
		this.cw_fld = var3;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fs() {
		this.dr();
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lei;)V"
	)
	void dw(fw var1, ei var2) {
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lev;[IIIII)V"
	)
	public static void ks(ev var0, int[] var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.dp_fld = var1;
		var0.es_fld = var2;
		var0.bu_fld = var3;
		var0.cq_fld = var4;
		var0.cg_fld = var5;
		var0.cn_fld = 0;
		var0.cb_fld = 0;
		var0.eo_fld = var4;
		var0.cd_fld = var5;
		var0.cy_fld = var4 / 2;
		var0.dt_fld = var5 / 2;
		var0.et_fld.set(0, var0.et_fld.size());
		var0.ex_fld.set(0, var0.ex_fld.size());
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	public void il(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		ei var7 = this.bl_fld[var4][var5][var6];
		if (var7 != null) {
			fa var8 = var7.az_fld;
			if (var8 != null) {
				int var18 = var8.aw_fld;
				if (var18 != 0) {
					for (int var19 = 0; var19 < 4; var19++) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}
				}
			} else {
				fl var9 = var7.av_fld;
				if (var9 != null) {
					int var10 = var9.ad_fld;
					int var11 = var9.ao_fld;
					int var12 = var9.ab_fld;
					int var13 = var9.ap_fld;
					int[] var14 = dr_fld[var10];
					int[] var15 = da_fld[var11];
					int var16 = 0;
					if (var12 != 0) {
						for (int var17 = 0; var17 < 4; var17++) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (int var26 = 0; var26 < 4; var26++) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	public void ia(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		ei var7 = this.bl_fld[var4][var5][var6];
		if (var7 != null) {
			fa var8 = var7.az_fld;
			if (var8 != null) {
				int var18 = var8.aw_fld;
				if (var18 != 0) {
					for (int var19 = 0; var19 < 4; var19++) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}
				}
			} else {
				fl var9 = var7.av_fld;
				if (var9 != null) {
					int var10 = var9.ad_fld;
					int var11 = var9.ao_fld;
					int var12 = var9.ab_fld;
					int var13 = var9.ap_fld;
					int[] var14 = dr_fld[var10];
					int[] var15 = da_fld[var11];
					int var16 = 0;
					if (var12 != 0) {
						for (int var17 = 0; var17 < 4; var17++) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (int var26 = 0; var26 < 4; var26++) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("getMapRegions")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getMapRegions")
	@Override
	public int[] getMapRegions() {
		return this.jj_fld;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int ek() {
		return ay_fld;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long hg(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.an_fld != null ? var4.an_fld.az_fld * -4472860599998239529L : 0L;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Z"
	)
	public static boolean iq(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = 0; var4 < var0.ce_fld; var4++) {
			eh var5 = var0.bb_fld[var4];
			if (var5.al_fld == 1) {
				int var6 = var5.ah_fld - var1;
				if (var6 > 0) {
					int var7 = var5.ay_fld + (var5.an_fld * var6 >> 8);
					int var8 = var5.as_fld + (var5.aa_fld * var6 >> 8);
					int var9 = var5.ar_fld + (var5.ai_fld * var6 >> 8);
					int var10 = var5.af_fld + (var5.aq_fld * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.al_fld == 2) {
				int var11 = var1 - var5.ah_fld;
				if (var11 > 0) {
					int var15 = var5.ay_fld + (var5.an_fld * var11 >> 8);
					int var19 = var5.as_fld + (var5.aa_fld * var11 >> 8);
					int var23 = var5.ar_fld + (var5.ai_fld * var11 >> 8);
					int var27 = var5.af_fld + (var5.aq_fld * var11 >> 8);
					if (var3 >= var15 && var3 <= var19 && var2 >= var23 && var2 <= var27) {
						return true;
					}
				}
			} else if (var5.al_fld == 3) {
				int var12 = var5.ay_fld - var3;
				if (var12 > 0) {
					int var16 = var5.ah_fld + (var5.au_fld * var12 >> 8);
					int var20 = var5.aw_fld + (var5.ax_fld * var12 >> 8);
					int var24 = var5.ar_fld + (var5.ai_fld * var12 >> 8);
					int var28 = var5.af_fld + (var5.aq_fld * var12 >> 8);
					if (var1 >= var16 && var1 <= var20 && var2 >= var24 && var2 <= var28) {
						return true;
					}
				}
			} else if (var5.al_fld == 4) {
				int var13 = var3 - var5.ay_fld;
				if (var13 > 0) {
					int var17 = var5.ah_fld + (var5.au_fld * var13 >> 8);
					int var21 = var5.aw_fld + (var5.ax_fld * var13 >> 8);
					int var25 = var5.ar_fld + (var5.ai_fld * var13 >> 8);
					int var29 = var5.af_fld + (var5.aq_fld * var13 >> 8);
					if (var1 >= var17 && var1 <= var21 && var2 >= var25 && var2 <= var29) {
						return true;
					}
				}
			} else if (var5.al_fld == 5) {
				int var14 = var2 - var5.ar_fld;
				if (var14 > 0) {
					int var18 = var5.ah_fld + (var5.au_fld * var14 >> 8);
					int var22 = var5.aw_fld + (var5.ax_fld * var14 >> 8);
					int var26 = var5.ay_fld + (var5.an_fld * var14 >> 8);
					int var30 = var5.as_fld + (var5.aa_fld * var14 >> 8);
					if (var1 >= var18 && var1 <= var22 && var3 >= var26 && var3 <= var30) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lfw;IZ)V"
	)
	public void is(fw var1, int var2, boolean var3) {
		try {
			this.ap(var2);

			label671:
			while (true) {
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var10;
				int var11;
				int var12;
				while (true) {
					var4 = this.lv();
					if (var4 == this.hs_fld) {
						return;
					}

					if (this.gp(var4)) {
						var5 = var4 >> this.ph_fld & this.sz_fld;
						var6 = var4 & this.up_int;
						var7 = var4 >> this.zc_fld & 3;
						var8 = this.df(var4);
						int var9 = this.pi(var4);
						var10 = var5 - this.qr_fld;
						var11 = var6 - this.qr_fld;
						var12 = this.pg_fld[var4];
						if (!this.dv(var4)) {
							break;
						}

						if (var3) {
							if (var7 > 0) {
								int var13 = var4 - this.zb_fld;
								if (this.hz(var13) && this.gp(var13)) {
									continue;
								}
							}

							if (var5 <= this.dw_fld && var5 > this.bn_fld) {
								int var27 = var4 - this.us_fld;
								if (this.hz(var27) && this.gp(var27) && (this.dv(var27) || (this.kq_Arrbyte[var4] & 1) == 0)) {
									continue;
								}
							}

							if (var5 >= this.dw_fld && var5 < this.dz_fld - 1) {
								int var28 = var4 + this.us_fld;
								if (this.hz(var28) && this.gp(var28) && (this.dv(var28) || (this.kq_Arrbyte[var4] & 4) == 0)) {
									continue;
								}
							}

							if (var6 <= this.cc_fld && var6 > this.cr_fld) {
								int var29 = var4 - this.sx_fld;
								if (this.hz(var29) && this.gp(var29) && (this.dv(var29) || (this.kq_Arrbyte[var4] & 8) == 0)) {
									continue;
								}
							}

							if (var6 >= this.cc_fld && var6 < this.bg_fld - 1) {
								int var30 = var4 + this.sx_fld;
								if (this.hz(var30) && this.gp(var30) && (this.dv(var30) || (this.kq_Arrbyte[var4] & 2) == 0)) {
									continue;
								}
							}
						} else {
							var3 = true;
						}

						var12 = this.pg_fld[var4] = this.pg_fld[var4] & -3;
						if ((var12 & 32) != 0) {
							int var31 = this.dj(3, var5, var6);
							int var14 = this.pg_fld[var31];
							if ((var14 & 256) != 0) {
								if (!this.md(0, var5, var6)) {
									var1.io(this, this.of_fld[var31], 0, 0, var10, var11);
								}
							} else if ((var14 & 1024) != 0 && !this.md(0, var5, var6)) {
								var1.xo(this, this.lh_fld[var31], 0, var10, var11);
							}

							if ((var14 & 16384) != 0) {
								fs var15 = this.xv_fld[var31];
								this.oa(var1, var15.ak_fld, 0, var15.ae_fld, var15.av_fld, var15.ah_fld, var15.az_fld);
							}

							for (int var56 = 0; var56 < this.pc_fld[var31]; var56++) {
								fj var16 = this.sd_fld[var31 * 5 + var56];
								if (var16 != null) {
									this.oa(var1, var16.ak_fld, var16.ag_fld, var16.ah_fld, var16.ae_fld, var16.aw_fld, var16.az_fld);
								}
							}
						}

						boolean var32 = false;
						if ((var12 & 256) != 0) {
							if (!this.md(var8, var5, var6)) {
								var32 = true;
								if ((var12 & 512) != 0 || var7 <= this.db_fld) {
									fa var47 = this.of_fld[var4];
									var1.io(this, var47, var9, var8, var10, var11);
								}
							}
						} else if ((var12 & 1024) != 0 && !this.md(var8, var5, var6)) {
							var32 = true;
							var1.xo(this, this.lh_fld[var4], var9, var10, var11);
						}

						int var48 = 0;
						int var57 = 0;
						int var63 = 0;
						if ((var12 & 49152) != 0) {
							if (var5 == this.dw_fld) {
								var48++;
							} else if (this.dw_fld < var5) {
								var48 += 2;
							}

							if (var6 == this.cc_fld) {
								var48 += 3;
							} else if (this.cc_fld > var6) {
								var48 += 6;
							}

							var57 = an_fld[var48];
							int var17 = ai_fld[var48];
							this.ty(var4, var17);
							var63 = aa_fld[var48];
							if (!pu_boolean && (~(var57 | var17) & 0xFF) != var63) {
								throw new AssertionError();
							}
						}

						if ((var12 & 16384) != 0) {
							fs var70 = this.xv_fld[var4];
							if ((var70.aw_fld & var63) != 0) {
								byte var18;
								int var19;
								switch (var70.aw_fld) {
									case 16:
										var18 = 3;
										var19 = aq_fld[var48];
										break;
									case 32:
										var18 = 6;
										var19 = am_fld[var48];
										break;
									case 64:
										var18 = 12;
										var19 = ad_fld[var48];
										break;
									case 128:
										var18 = 9;
										var19 = ao_fld[var48];
										break;
									default:
										throw new IllegalStateException();
								}

								this.zq(var4, var18);
								this.ws(var4, var19);
								if (!pu_boolean && (var18 ^ var19) != var18 - var19) {
									throw new AssertionError();
								}

								var12 = this.pg_fld[var4] = this.pg_fld[var4] | 16;
							}

							if ((var70.aw_fld & var57) != 0 && !this.wo(var8, var5, var6, var70.aw_fld)) {
								this.oa(var1, var70.ak_fld, 0, var70.ae_fld, var70.av_fld, var70.ah_fld, var70.az_fld);
							}

							if ((var70.ay_fld & var57) != 0 && !this.wo(var8, var5, var6, var70.ay_fld)) {
								this.oa(var1, var70.ag_fld, 0, var70.ae_fld, var70.av_fld, var70.ah_fld, var70.az_fld);
							}
						}

						if ((var12 & 32768) != 0) {
							fv var71 = this.pu_Arrfv[var4];
							if (!this.dc(var8, var5, var6, var71.ak_fld.ez_fld * -1271205903)) {
								if ((var71.aw_fld & var57) != 0) {
									this.oa(var1, var71.ak_fld, 0, var71.ae_fld + var71.as_fld, var71.av_fld, var71.ah_fld + var71.ar_fld, var71.az_fld);
								} else if (var71.aw_fld == 256) {
									int var79 = var71.ae_fld - this.du_fld;
									int var88 = var71.ah_fld - this.co_fld;
									int var20 = var71.ay_fld;
									int var21;
									if (var20 != 1 && var20 != 2) {
										var21 = var79;
									} else {
										var21 = -var79;
									}

									int var22;
									if (var20 != 2 && var20 != 3) {
										var22 = var88;
									} else {
										var22 = -var88;
									}

									if (var22 < var21) {
										this.oa(var1, var71.ak_fld, 0, var71.ae_fld + var71.as_fld, var71.av_fld, var71.ah_fld + var71.ar_fld, var71.az_fld);
									} else if (var71.ag_fld != null) {
										this.oa(var1, var71.ag_fld, 0, var71.ae_fld + var71.af_fld, var71.av_fld, var71.ah_fld + var71.al_fld, var71.az_fld);
									}
								}
							}
						}

						if (var32) {
							if ((this.pg_fld[var4] & 2048) != 0) {
								ef var72 = this.gk_fld[var4];
								this.oa(var1, var72.ak_fld, 0, var72.ae_fld, var72.av_fld, var72.ah_fld, var72.ag_fld);
							}

							if ((this.pg_fld[var4] & 4096) != 0) {
								en var73 = this.oy_fld[var4];
								if (var73.av_fld != null) {
									this.oa(var1, var73.av_fld, 0, var73.ag_fld, var73.ak_fld, var73.az_fld, var73.aw_fld);
								}

								if (var73.ae_fld != null) {
									this.oa(var1, var73.ae_fld, 0, var73.ag_fld, var73.ak_fld, var73.az_fld, var73.aw_fld);
								}

								if (var73.ah_fld != null) {
									this.oa(var1, var73.ah_fld, 0, var73.ag_fld, var73.ak_fld, var73.az_fld, var73.aw_fld);
								}
							}
						}

						byte var74 = this.kq_Arrbyte[var4];
						if (var5 < this.dw_fld && var5 >= this.bn_fld && var5 < this.dz_fld - 1 && (var74 & 4) != 0) {
							int var80 = var4 + this.us_fld;
							if (this.hz(var80) && this.gp(var80)) {
								this.ap(var80);
							}
						}

						if (var6 < this.cc_fld && var6 >= this.cr_fld && var6 < this.bg_fld - 1 && (var74 & 2) != 0) {
							int var81 = var4 + this.sx_fld;
							if (this.hz(var81) && this.gp(var81)) {
								this.ap(var81);
							}
						}

						if (var5 > this.dw_fld && var5 > this.bn_fld && var5 < this.dz_fld && (var74 & 1) != 0) {
							int var82 = var4 - this.us_fld;
							if (this.hz(var82) && this.gp(var82)) {
								this.ap(var82);
							}
						}

						if (var6 > this.cc_fld && var6 > this.cr_fld && var6 < this.bg_fld && (var74 & 8) != 0) {
							int var83 = var4 - this.sx_fld;
							if (this.hz(var83) && this.gp(var83)) {
								this.ap(var83);
							}
						}
						break;
					}
				}

				if ((var12 & 16) != 0) {
					boolean var33 = true;

					for (int var49 = 0; var49 < this.pc_fld[var4]; var49++) {
						fj var58 = this.sd_fld[var4 * 5 + var49];
						byte var64 = this.fm_fld[var4 * 5 + var49];
						if (var58.au_fld != this.dh_fld && (var64 & this.rk(var4)) == this.fd(var4)) {
							var33 = false;
							break;
						}
					}

					if (var33) {
						fs var50 = this.xv_fld[var4];
						if (!this.wo(var8, var5, var6, var50.aw_fld)) {
							this.oa(var1, var50.ak_fld, 0, var50.ae_fld, var50.av_fld, var50.ah_fld, var50.az_fld);
						}

						var12 = this.pg_fld[var4] = this.pg_fld[var4] & -17;
					}
				}

				if ((var12 & 8) != 0) {
					try {
						var12 = this.pg_fld[var4] = this.pg_fld[var4] & -9;
						int var34 = 0;

						label616:
						for (int var51 = 0; var51 < this.pc_fld[var4]; var51++) {
							fj var59 = this.sd_fld[var4 * 5 + var51];
							if (var59.au_fld != this.dh_fld) {
								for (int var65 = var59.ay_fld; var65 <= var59.as_fld; var65++) {
									for (int var75 = var59.ar_fld; var75 <= var59.af_fld; var75++) {
										int var84 = var65 + this.qr_fld;
										int var89 = var75 + this.qr_fld;
										int var92 = this.dj(var7, var84, var89);
										if (this.dv(var92)) {
											var12 = this.pg_fld[var4] = this.pg_fld[var4] | 8;
											continue label616;
										}

										if ((this.pg_fld[var92] & 16) != 0) {
											byte var95 = 0;
											if (var65 > var59.ay_fld) {
												var95 |= 1;
											}

											if (var65 < var59.as_fld) {
												var95 |= 4;
											}

											if (var75 > var59.ar_fld) {
												var95 |= 8;
											}

											if (var75 < var59.af_fld) {
												var95 |= 2;
											}

											int var98 = this.rk(var4) ^ this.fd(var4);
											if ((var95 & this.rk(var92)) == var98) {
												var12 = this.pg_fld[var4] = this.pg_fld[var4] | 8;
												continue label616;
											}
										}
									}
								}

								if (!pu_boolean && var34 >= 5) {
									throw new AssertionError();
								}

								this.cl_fld[var34++] = var59;
								var59.al_fld = this.nx(var59, this.dw_fld - this.qr_fld, this.cc_fld - this.qr_fld);
							}
						}

						if ((var12 & 128) != 0) {
							rl17 var52 = this.rx_fld[var5 >> 3][var6 >> 3];

							for (int var60 = 0; var60 < var52.xi_fld.size(); var60++) {
								fj var66 = (fj)(fj)var52.xi_fld.get(var60);
								if (var66.ak_fld instanceof rq && var66.au_fld != this.dh_fld && var66.ay_fld == var10 && var66.ar_fld == var11 && var34 < 55) {
									if (!pu_boolean && var34 >= 55) {
										throw new AssertionError();
									}

									this.cl_fld[var34++] = var66;
									var66.al_fld = this.nx(var66, this.dw_fld - this.qr_fld, this.cc_fld - this.qr_fld);
								}
							}
						}

						while (true) {
							int var53 = -50;
							int var61 = -1;

							for (int var67 = 0; var67 < var34; var67++) {
								fj var76 = this.cl_fld[var67];
								if (var76.au_fld != this.dh_fld) {
									if (var76.al_fld > var53) {
										var53 = var76.al_fld;
										var61 = var67;
									} else if (var53 == var76.al_fld) {
										int var85 = var76.ah_fld - this.du_fld;
										int var90 = var76.aw_fld - this.co_fld;
										int var93 = this.cl_fld[var61].ah_fld * -564370133 - this.du_fld;
										int var96 = this.cl_fld[var61].aw_fld * -502866077 - this.co_fld;
										if (var85 * var85 + var90 * var90 > var93 * var93 + var96 * var96) {
											var61 = var67;
										}
									}
								}
							}

							if (var61 == -1) {
								if ((var12 & 8) != 0) {
									continue label671;
								}
								break;
							}

							fj var68 = this.cl_fld[var61];
							var68.au_fld = this.dh_fld;
							this.oa(var1, var68.ak_fld, var68.ag_fld, var68.ah_fld, var68.ae_fld, var68.aw_fld, var68.az_fld);

							for (int var77 = var68.ay_fld; var77 <= var68.as_fld; var77++) {
								for (int var86 = var68.ar_fld; var86 <= var68.af_fld; var86++) {
									int var91 = var77 + this.qr_fld;
									int var94 = var86 + this.qr_fld;
									int var97 = this.dj(var7, var91, var94);
									if ((this.pg_fld[var97] & 16) != 0) {
										this.ap(var97);
									} else if ((var91 != var5 || var94 != var6) && this.gp(var97)) {
										this.ap(var97);
									}
								}
							}
						}
					} catch (Exception var24) {
						client.logger.debug("exception drawing game entity", (Throwable)var24);
						var12 = this.pg_fld[var4] = this.pg_fld[var4] & -9;
					}
				}

				if (!this.gp(var4)) {
					if (!pu_boolean) {
						throw new AssertionError("tile needs backside draw");
					}
				} else if ((var12 & 16) == 0) {
					if (var5 <= this.dw_fld && var5 > this.bn_fld) {
						int var35 = var4 - this.us_fld;
						if (this.hz(var35) && this.gp(var35)) {
							continue;
						}
					}

					if (var5 >= this.dw_fld && var5 < this.dz_fld - 1) {
						int var36 = var4 + this.us_fld;
						if (this.hz(var36) && this.gp(var36)) {
							continue;
						}
					}

					if (var6 <= this.cc_fld && var6 > this.cr_fld) {
						int var37 = var4 - this.sx_fld;
						if (this.hz(var37) && this.gp(var37)) {
							continue;
						}
					}

					if (var6 >= this.cc_fld && var6 < this.bg_fld - 1) {
						int var38 = var4 + this.sx_fld;
						if (this.hz(var38) && this.gp(var38)) {
							continue;
						}
					}

					var12 = this.pg_fld[var4] = this.pg_fld[var4] & -5;
					this.dx_fld--;
					if ((var12 & 8192) != 0) {
						en var39 = this.oy_fld[var4];
						if (var39.av_fld != null) {
							this.oa(var1, var39.av_fld, 0, var39.ag_fld, var39.ak_fld - var39.ay_fld, var39.az_fld, var39.aw_fld);
						}

						if (var39.ae_fld != null) {
							this.oa(var1, var39.ae_fld, 0, var39.ag_fld, var39.ak_fld - var39.ay_fld, var39.az_fld, var39.aw_fld);
						}

						if (var39.ah_fld != null) {
							this.oa(var1, var39.ah_fld, 0, var39.ag_fld, var39.ak_fld - var39.ay_fld, var39.az_fld, var39.aw_fld);
						}
					}

					if ((var12 & 49152) != 0 && this.hy(var4) != 0) {
						if ((var12 & 32768) != 0) {
							fv var40 = this.pu_Arrfv[var4];
							if (!this.dc(var8, var5, var6, var40.ak_fld.ez_fld * -1271205903)) {
								if ((var40.aw_fld & this.hy(var4)) != 0) {
									this.oa(var1, var40.ak_fld, 0, var40.ae_fld + var40.as_fld, var40.av_fld, var40.ah_fld + var40.ar_fld, var40.az_fld);
								} else if (var40.aw_fld == 256) {
									int var54 = var40.ae_fld - this.du_fld;
									int var62 = var40.ah_fld - this.co_fld;
									int var69 = var40.ay_fld;
									int var78;
									if (var69 != 1 && var69 != 2) {
										var78 = var54;
									} else {
										var78 = -var54;
									}

									int var87;
									if (var69 != 2 && var69 != 3) {
										var87 = var62;
									} else {
										var87 = -var62;
									}

									if (var87 >= var78) {
										this.oa(var1, var40.ak_fld, 0, var40.ae_fld + var40.as_fld, var40.av_fld, var40.ah_fld + var40.ar_fld, var40.az_fld);
									} else if (var40.ag_fld != null) {
										this.oa(var1, var40.ag_fld, 0, var40.ae_fld + var40.af_fld, var40.av_fld, var40.ah_fld + var40.al_fld, var40.az_fld);
									}
								}
							}
						}

						if ((var12 & 16384) != 0) {
							fs var41 = this.xv_fld[var4];
							int var55 = this.hy(var4);
							if ((var41.ay_fld & var55) != 0 && !this.wo(var8, var5, var6, var41.ay_fld)) {
								this.oa(var1, var41.ag_fld, 0, var41.ae_fld, var41.av_fld, var41.ah_fld, var41.az_fld);
							}

							if ((var41.aw_fld & var55) != 0 && !this.wo(var8, var5, var6, var41.aw_fld)) {
								this.oa(var1, var41.ak_fld, 0, var41.ae_fld, var41.av_fld, var41.ah_fld, var41.az_fld);
							}
						}
					}

					if (var7 < this.cf_fld - 1) {
						int var42 = var4 + this.zb_fld;
						if (this.hz(var42) && this.gp(var42)) {
							this.ap(var42);
						}
					}

					if (var5 < this.dw_fld && var5 >= this.bn_fld && var5 < this.dz_fld - 1) {
						int var43 = var4 + this.us_fld;
						if (this.hz(var43) && this.gp(var43)) {
							this.ap(var43);
						}
					}

					if (var6 < this.cc_fld && var6 >= this.cr_fld && var6 < this.bg_fld - 1) {
						int var44 = var4 + this.sx_fld;
						if (this.hz(var44) && this.gp(var44)) {
							this.ap(var44);
						}
					}

					if (var5 > this.dw_fld && var5 > this.bn_fld && var5 < this.dz_fld) {
						int var45 = var4 - this.us_fld;
						if (this.hz(var45) && this.gp(var45)) {
							this.ap(var45);
						}
					}

					if (var6 > this.cc_fld && var6 > this.cr_fld && var6 < this.bg_fld) {
						int var46 = var4 - this.sx_fld;
						if (this.hz(var46) && this.gp(var46)) {
							this.ap(var46);
						}
					}
				}
			}
		} catch (Throwable var25) {
			throw new RuntimeException(var25);
		}
	}

	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void sf(int var1) {
		this.ds_fld = og.al(25, 90, var1);
		fh.ae(this.ds_fld);
		if (this.dp_fld != null && this.dp_fld.length > 0) {
			this.dh(this.dp_fld, this.es_fld, this.bu_fld, this.cq_fld, this.cg_fld);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIII)Z"
	)
	public boolean bl(em var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			if (var1 instanceof dz) {
				dz var8 = (dz)var1;
				if (var8.kc_fld != -1 && var8.mi_fld != rt.ag_fld[var8.kc_fld]) {
					var8.hv();
					this.to(var8, var2, var3, var4, var5, var6, var7);
					return var8.fy_fld;
				}
			}

			return false;
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aw(int var1) {
		this.ds_fld = og.al(25, -342384559, var1);
		fh.ae(this.ds_fld);
		if (this.dp_fld != null && this.dp_fld.length > 0) {
			this.dh(this.dp_fld, this.es_fld, this.bu_fld, this.cq_fld, this.cg_fld);
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	public void ik(er var1) {
		if (var1 != this.dn_fld) {
			this.dn_fld = var1;
			this.dh(this.dp_fld, this.es_fld, this.bu_fld, this.cq_fld, this.cg_fld);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean cz(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean ou(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		return af(var0, var1, var2, var3, var4, var5, var6, var7);
	}

	@ObfuscatedName("getOverrideAmount")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Export("getOverrideAmount")
	@Override
	public byte getOverrideAmount() {
		return this.bm_fld.ae_fld;
	}

	@ObfuscatedName("getOverrideLuminance")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Export("getOverrideLuminance")
	@Override
	public byte getOverrideLuminance() {
		return this.bm_fld.av_fld;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean iu(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5);
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean ih(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)V"
	)
	public static void cm(ev var0, int var1, int var2) {
		ei var3 = var0.bl_fld[0][var1][var2];

		for (int var4 = 0; var4 < 3; var4++) {
			ei var5 = var0.bl_fld[var4][var1][var2] = var0.bl_fld[var4 + 1][var1][var2];
			if (var5 != null) {
				var5.af_fld--;

				for (int var6 = 0; var6 < var5.ah_fld; var6++) {
					fj var7 = var5.aw_fld[var6];
					if (bw.ag(var7.az_fld) && var7.ay_fld == var1 && var7.ar_fld == var2) {
						var7.av_fld--;
					}
				}
			}
		}

		if (var0.bl_fld[0][var1][var2] == null) {
			var0.bl_fld[0][var1][var2] = new ei(0, var1, var2);
		}

		var0.bl_fld[0][var1][var2].bd_fld = var3;
		var0.bl_fld[3][var1][var2] = null;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean it(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean ii(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean iw(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean jz(int var1, int var2, int var3, int var4) {
		return py.tv(this, this.ed_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean jj(int var1, int var2, int var3, int var4, boolean var5) {
		return this.cz(this.ed_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)V"
	)
	public static void no(ev var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var1 - var0.qr_fld;
		int var4 = var2 - var0.qr_fld;
		var0.ge(var0.dj(0, var1, var2), var0.td_fld);

		for (int var5 = 0; var5 < 3; var5++) {
			int var6 = var0.dj(var5, var1, var2);
			var0.ge(var6 + var0.zb_fld, var6);
			if (var0.hz(var6)) {
				byte var7 = var0.pc_fld[var6];

				for (int var8 = 0; var8 < var7; var8++) {
					fj var9 = var0.sd_fld[var6 * 5 + var8];
					long var10 = var9.az_fld;
					int var12 = (int)(var10 >> 16 & 7L);
					if (var12 == 2 && var9.ay_fld == var3 && var9.ar_fld == var4) {
						var9.av_fld = var9.av_fld * 888822967 - 1;
					}
				}

				fs var15 = var0.xv_fld[var6];
				if (var15 != null) {
					var15.hl_fld--;
				}

				ef var16 = var0.gk_fld[var6];
				if (var16 != null) {
					var16.nj_fld--;
				}

				fv var17 = var0.pu_Arrfv[var6];
				if (var17 != null) {
					var17.pj_fld--;
				}
			}
		}

		int var13 = var0.dj(0, var1, var2);
		if (!var0.hz(var13)) {
			var0.sv(var13, 0, var1, var2);
		}

		if (var0.vo_fld[0][var1][var2] == null) {
			var0.vo_fld[0][var1][var2] = new rl10(var0, var13);
			var0.lg(0, var1, var2);
		}

		var0.pg_fld[var13] = var0.pg_fld[var13] | 32;
		int var14 = var0.dj(3, var1, var2);
		var0.ge(var0.td_fld, var14);
		var0.pg_fld[var14] = var0.pg_fld[var14] & -2;
		var0.em(var0.td_fld);
		var0.vo_fld[3][var1][var2] = null;
		var0.lg(3, var2, var2);
		var0.vo_fld[0][var1][var2].ru_fld = new rl10(var0, var14);
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void iv(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.cf_fld; var4++) {
			for (int var5 = 0; var5 < this.dv_fld; var5++) {
				for (int var6 = 0; var6 < this.dk_fld; var6++) {
					ei var7 = this.bl_fld[var4][var5][var6];
					if (var7 != null) {
						fs var8 = var7.an_fld;
						if (var8 != null && var8.ak_fld instanceof eg) {
							eg var9 = (eg)var8.ak_fld;
							this.im(var9, var4, var5, var6, 1, 1);
							if (var8.ag_fld instanceof eg) {
								eg var10 = (eg)var8.ag_fld;
								this.im(var10, var4, var5, var6, 1, 1);
								eg.ag(var9, var10, 0, 0, 0, false);
								var8.ag_fld = eg.et(var10, var10.bh_fld, var10.bs_fld, var1, var2, var3);
							}

							var8.ak_fld = eg.et(var9, var9.bh_fld, var9.bs_fld, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.ah_fld; var12++) {
							fj var14 = var7.aw_fld[var12];
							if (var14 != null && var14.ak_fld instanceof eg) {
								eg var11 = (eg)var14.ak_fld;
								this.im(var11, var4, var5, var6, var14.as_fld - var14.ay_fld + 1, var14.af_fld - var14.ar_fld + 1);
								var14.ak_fld = eg.et(var11, var11.bh_fld, var11.bs_fld, var1, var2, var3);
							}
						}

						ef var13 = var7.ai_fld;
						if (var13 != null && var13.ak_fld instanceof eg) {
							eg var15 = (eg)var13.ak_fld;
							xb(this, var15, var4, var5, var6);
							var13.ak_fld = eg.et(var15, var15.bh_fld, var15.bs_fld, var1, var2, var3);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean jn(int var1, int var2, int var3, int var4) {
		return py.tv(this, this.et_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void fl(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.ah_fld = var5;
		var11.ag_fld = var2 * -1810046336 + 484684255;
		var11.az_fld = var3 * -1839159424 + 163178049;
		var11.ak_fld = var4 * 1081480156;
		var11.aw_fld = var6;
		var11.av_fld = var8;
		var11.ae_fld = var9;
		var11.ay_fld = var10 * -735456137;
		if (this.bl_fld[var1][var2][var3] == null) {
			this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		this.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIJ)I"
	)
	public static int gb(ev var0, int var1, int var2, int var3, long var4) {
		ei var6 = var0.bl_fld[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.an_fld != null && var6.an_fld.az_fld * -4472860599998239529L == var4) {
			return var6.an_fld.as_fld * -2088485856 & 0xFF;
		} else if (var6.aa_fld != null && var6.aa_fld.az_fld * 7130385936274174641L == var4) {
			return var6.aa_fld.au_fld * -890468509 & 0xFF;
		} else if (var6.ai_fld != null && var6.ai_fld.ag_fld * 2728893160458550201L == var4) {
			return ef.sc(var6.ai_fld, 834095326) & 0xFF;
		} else {
			for (int var7 = 0; var7 < var6.ah_fld; var7++) {
				if (var6.aw_fld[var7].az_fld * 2121558925630479837L == var4) {
					return var6.aw_fld[var7].ax_fld * 239029509 & 0xFF;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lev;)Z"
	)
	public static boolean mq(ev var0) {
		return var0.bq_fld && var0.bv_fld != -1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean ci(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.bk_fld + var3 * this.bj_fld + var4 * this.bf_fld + var5);
	}

	@ObfuscatedName("getTileShapes")
	@ObfuscatedSignature(
		descriptor = "()[[[B"
	)
	@Export("getTileShapes")
	@Override
	public byte[][][] getTileShapes() {
		return this.ns_fld;
	}

	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILem;IJI)Z"
	)
	public boolean ut(int var1, int var2, int var3, int var4, int var5, int var6, em var7, int var8, long var9, int var11) {
		try {
			return hx(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfv;"
	)
	public static fv ys(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		return var4 == null ? null : var4.aa_fld;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean jv(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.bk_fld + var3 * this.bj_fld + var4 * this.bf_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean jd(int var1, int var2, int var3, int var4, boolean var5) {
		return this.cj(this.ew_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void kk() {
		this.bv_fld = -1;
		this.bq_fld = false;
	}

	@ObfuscatedName("getExtendedTileSettings")
	@ObfuscatedSignature(
		descriptor = "()[[[B"
	)
	@Export("getExtendedTileSettings")
	@Override
	public byte[][][] getExtendedTileSettings() {
		return this.nl_fld;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean jx(int var1, int var2, int var3, int var4, boolean var5) {
		return this.cj(this.ex_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Leg;IIIII)V"
	)
	void ce(eg var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; var12++) {
			if (var12 != this.cf_fld) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.dv_fld) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.dk_fld && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
								ei var15 = this.bl_fld[var12][var13][var14];
								if (var15 != null) {
									int var16 = this.cn(var12, var13, var14, var2, var3, var4);
									fs var17 = var15.an_fld;
									if (var17 != null) {
										if (var17.ak_fld instanceof eg) {
											eg var18 = (eg)var17.ak_fld;
											eg.ag(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.ag_fld instanceof eg) {
											eg var23 = (eg)var17.ag_fld;
											eg.ag(var1, var23, (var13 - var3) * -944520687 + (1 - var5) * -187629190, var16, (var14 - var4) * -687814217 + (1 - var6) * 1311873195, var7);
										}
									}

									for (int var24 = 0; var24 < var15.ah_fld; var24++) {
										fj var19 = var15.aw_fld[var24];
										if (var19 != null && var19.ak_fld instanceof eg) {
											eg var20 = (eg)var19.ak_fld;
											int var21 = var19.as_fld - var19.ay_fld + 1;
											int var22 = var19.af_fld - var19.ar_fld + 1;
											eg.ag(var1, var20, (var19.ay_fld - var3) * 128 + (var21 - var5) * 64, var16, (var19.ar_fld - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				var8--;
				var7 = false;
			}
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	public void is(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		ei var7 = this.bl_fld[var4][var5][var6];
		if (var7 != null) {
			fa var8 = var7.az_fld;
			if (var8 != null) {
				int var18 = var8.aw_fld;
				if (false) {
					for (int var19 = 0; var19 < 4; var19++) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}
				}
			} else {
				fl var9 = var7.av_fld;
				if (var9 != null) {
					int var10 = var9.ad_fld;
					int var11 = var9.ao_fld;
					int var12 = var9.ab_fld;
					int var13 = var9.ap_fld;
					int[] var14 = dr_fld[var10];
					int[] var15 = da_fld[var11];
					int var16 = 0;
					if (var12 != 0) {
						for (int var17 = 0; var17 < 4; var17++) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (int var26 = 0; var26 < 4; var26++) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ju(int var1, int var2) {
		if (var1 < 0) {
			var1 = 0;
		}

		this.cp_fld = var1;
		this.dj_fld = var2;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(III)Lfv;"
	)
	public fv km(int var1, int var2, int var3) {
		return tn(this, var1, var2, var3);
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lev;Ljava/util/BitSet;IIII)Z"
	)
	public static boolean gq(ev var0, BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * var0.br_fld + var3 * var0.be_fld + var4 * var0.bs_fld + var5);
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ji(int var1, int var2) {
		if (var1 < 0) {
			var1 = 0;
		}

		this.cp_fld = var1;
		this.dj_fld = var2;
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void jr(int var1, int var2) {
		if (var1 < 0) {
			var1 = 0;
		}

		this.cp_fld = var1;
		this.dj_fld = var2;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void le(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		try {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 >= this.dv_fld * 128) {
				var1 = this.dv_fld * 1187576632 - 1;
			}

			if (var3 < 0) {
				var3 = 0;
			} else if (var3 >= this.dk_fld * 128) {
				var3 = this.dk_fld * 128 - 1;
			}

			if (var4 < 1) {
				var4 = 1;
			} else if (var4 > 520) {
				var4 = 520;
			}

			this.ci_fld = fc.ay_fld[var4];
			this.cj_fld = fc.as_fld[var4];
			this.ch_fld = fc.ay_fld[var5];
			this.ct_fld = fc.as_fld[var5];
			ve(this, (var4 - ay_fld) / 1224751986, var5 / 64);
			this.du_fld = var1;
			this.do_fld = var2;
			this.co_fld = var3;
			this.dw_fld = var1 / 128;
			this.cc_fld = var3 / 128;
			this.eb_fld = var7 / -454243004;
			this.ec_fld = var8 / 128;
			this.bw_fld = var6;
			ee var10 = new ee(var1, var2, var3, var4, var5, var7, var8);
			if (this.dd_fld != null) {
				this.dd_fld.gk(fk.ae_fld);
				this.dd_fld.bu(0, var4, var5, 0, 0, 0, -1L);
			}

			if (fc.an()) {
				fc.ar_fld.al_fld = 0;
				this.lg(var10, var9, true);
				fc.ar_fld.al_fld = 1;
				this.lg(var10, var9, false);
				fc.ar_fld.al_fld = 2;
			} else {
				fc.ar_fld.al_fld = 2;
				this.lg(var10, var9, true);
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean kl(int var1, int var2) {
		if (!this.co(this.cp_fld, this.dj_fld, var1, var2)) {
			return this.ck(this.cp_fld, this.dj_fld, var1, var2);
		} else {
			hb.xu(this, this.cp_fld, this.dj_fld, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; var4++) {
				for (int var5 = -1; var5 <= 1; var5++) {
					if (this.dt(this.cp_fld, this.dj_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.dt(this.cp_fld, (this.dj_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.dt(this.cp_fld + 1, this.dj_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.dt(this.cp_fld + 1, (this.dj_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.cb(this.cp_fld, this.dj_fld, var1, var2, var3);
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ig(int var1, int var2, int var3, int var4) {
		return py.tv(this, this.ed_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ky(int var1, int var2, int var3, int var4) {
		if (!this.cl(var1, var2, var3, var4)) {
			return this.ch(var1, var2, var3, var4);
		} else {
			this.dc(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + ay_fld;
			int var6 = var2 * 64;
			int var7 = (var3 - this.ds_fld - this.cx_fld - 1) * 128;
			int var8 = (var4 - this.ds_fld - this.ca_fld - 1) * 128;

			for (int var9 = -this.es_fld; var9 <= this.bu_fld; var9 += 128) {
				if (this.dm(var7, this.dp_fld[var1] + var9, var8, var5, var6)) {
					return mu(this, var1, var2, var3, var4, true);
				}
			}

			return mu(this, var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	public void io(er var1) {
		if (var1 != this.dn_fld) {
			this.dn_fld = var1;
			this.dh(this.dp_fld, this.es_fld, this.bu_fld, this.cq_fld, this.cg_fld);
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "([IIIII)V"
	)
	public void ft(int[] var1, int var2, int var3, int var4, int var5) {
		this.dh(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "(Lem;Z)Z"
	)
	public static boolean ti(em var0, boolean var1) {
		return og.ci_fld.getCallbacks().draw(var0, var1);
	}

	public ev(boolean var1, int var2, int var3, int var4, int var5, er var6, int[][][] var7) {
		ev var8 = this;
		this.mf_int = 0;
		this.up_java_util_Map = null;
		this.bx_fld = -1;
		this.um_fld = -1;
		this.wc_fld = new rl18(this);
		this.vo_fld = new rl10[var2][var3][var4];
		this.eu_ArrArrArrint = new int[var2][var3][var4];
		int var16 = 32 - Integer.numberOfLeadingZeros(var3 + 3);
		int var17 = 32 - Integer.numberOfLeadingZeros(var4 + 3);
		int var18 = 4 * (1 << var16) * (1 << var17);
		int var19 = var18 << 1;
		this.ph_fld = var17;
		this.zc_fld = var16 + var17;
		this.sz_fld = (1 << var16) - 1;
		this.up_int = (1 << var17) - 1;
		this.zb_fld = 1 << var16 + var17;
		this.us_fld = 1 << var17;
		this.sx_fld = 1;
		this.hs_fld = var18 - 1;
		this.qq_fld = var18 - 2;
		this.td_fld = var18 - 3;
		this.pg_fld = new int[var18];
		this.of_fld = new fa[var18];
		this.lh_fld = new fl[var18];
		this.xv_fld = new fs[var18];
		this.pu_Arrfv = new fv[var18];
		this.gk_fld = new ef[var18];
		this.oy_fld = new en[var18];
		this.pc_fld = new byte[var18];
		this.sd_fld = new fj[var18 * 5];
		this.fm_fld = new byte[var18 * 5];
		this.kq_Arrbyte = new byte[var18];
		this.sp_fld = new long[var18];
		this.fy_fld = new int[var19];
		Arrays.fill(this.fy_fld, this.hs_fld);
		this.wg();
		int var20 = var3 >> 3;
		int var21 = var4 >> 3;
		this.rx_fld = new rl17[var20][var21];
		this.eu_Arrrl17 = new rl17[var20 * var21];

		for (int var22 = 0; var22 < var20; var22++) {
			int var23 = 0;

			while (var23 < var21) {
				rl17 var24 = var8.rx_fld[var22][var23] = new rl17();
				var24.zb_fld = var22;
				var24.bj_fld = var23++;
			}
		}

		if (var1) {
			var8.ej_fld = rt.ag_fld != null ? new BitSet(rt.ag_fld.length) : null;
			var8.nk_fld = new HashSet();
		} else {
			var8.ej_fld = null;
			var8.vg_fld = new ey(new uy());
			var8.lm_fld = new ey(new uy());
			var8.nk_fld = Collections.emptySet();
		}

		this.bm_fld = new fy();
		this.bd_fld = new fy();
		this.bw_fld = 0;
		this.bo_fld = new uy();
		this.eq_fld = 0;
		this.ux_fld = 0;
		this.pm_fld = 0;
		this.bi_fld = 1.0F;
		this.cm_fld = -1;
		this.dg_fld = -1;
		this.bc_fld = -1.0F;
		this.bv_fld = -1;
		this.wi_fld = -1;
		this.bq_fld = false;
		this.cu_fld = 0;
		this.dx_fld = 0;
		this.dh_fld = -1;
		this.cl_fld = new fj[55];
		this.dc_fld = false;
		this.db_fld = 0;
		this.ck_fld = 0;
		this.cw_fld = 0;
		this.di_fld = 4;
		this.ep_fld = -1;
		this.dl_fld = new na();
		this.cz_fld = 0;
		this.dy_fld = new ei[32];
		this.ds_fld = 0;
		this.dn_fld = er.ak_fld;
		this.cx_fld = 0;
		this.ca_fld = 0;
		this.dp_fld = new int[9];
		this.cf_fld = var2;
		this.dv_fld = var3;
		this.dk_fld = var4;
		this.bl_fld = new ei[var2][var3][var4];
		this.cs_fld = new int[var2][var3 + 1][var4 + 1];
		this.cv_fld = var7;
		this.ds_fld = var5;
		this.dn_fld = var6;
		this.aj_fld = var1;
		if (!var1) {
			this.bz_fld = 0;
			this.ed_fld = null;
			this.et_fld = null;
			this.br_fld = 0;
			this.be_fld = 0;
			this.bs_fld = 0;
			this.bh_fld = 0;
			this.ew_fld = null;
			this.ex_fld = null;
			this.bk_fld = 0;
			this.bj_fld = 0;
			this.bf_fld = 0;
		} else {
			this.bz_fld = (af_fld - 1) * 1048352;
			this.ed_fld = new BitSet(this.bz_fld);
			this.et_fld = new BitSet(this.bz_fld);
			this.br_fld = 1048352;
			this.be_fld = 32761;
			this.bs_fld = 181;
			this.bh_fld = af_fld * 1071648;
			this.ew_fld = new BitSet(this.bh_fld);
			this.ex_fld = new BitSet(this.bh_fld);
			this.bk_fld = 1071648;
			this.bj_fld = 33489;
			this.bf_fld = 183;
			this.dm_fld = new int[this.di_fld];
			this.dq_fld = new eh[this.di_fld][500];
			this.bb_fld = new eh[500];
		}

		fh.ae(var5);
		this.ab();
	}

	@ObfuscatedName("removeTile")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Tile;)V"
	)
	@Export("removeTile")
	@Override
	public void removeTile(Tile var1) {
		rl10 var2 = (rl10)var1;
		int var3 = var2.xo_fld;
		int var4 = this.pg_fld[var3];
		int var5 = var3 >> this.ph_fld & this.sz_fld;
		int var6 = var3 & this.up_int;
		rl17 var7 = this.rx_fld[var5 >> 3][var6 >> 3];
		if ((var4 & 2048) != 0) {
			var7.ol_fld.remove(this.gk_fld[var3]);
		}

		if ((var4 & 12288) != 0) {
			var7.ol_fld.remove(this.oy_fld[var3]);
		}

		if ((var4 & 16384) != 0) {
			var7.ol_fld.remove(this.xv_fld[var3]);
		}

		if ((var4 & 32768) != 0) {
			var7.ol_fld.remove(this.pu_Arrfv[var3]);
		}

		byte var8 = this.pc_fld[var3];

		for (int var9 = 0; var9 < var8; var9++) {
			fj var10 = this.sd_fld[var3 * 5 + var9];
			var7.ol_fld.remove(var10);
		}

		this.em(var3);
		var2.ru_fld = null;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z"
	)
	boolean kf(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = fc.ah_fld;
		int[] var7 = fc.aw_fld;
		int var8 = var6[var4];
		int var9 = var7[var4];
		int var10 = var6[var5];
		int var11 = var7[var5];
		int var12 = var3 * var10 + var1 * var11 >> 16;
		int var13 = var3 * var11 - var1 * var10 >> 16;
		int var14 = var2 * var8 + var13 * var9 >> 16;
		int var15 = var2 * var9 - var13 * var8 >> 16;
		if (var14 >= -283038286 && var14 <= fh.az()) {
			int var16 = this.cy_fld + var12 * 128 / var14;
			int var17 = this.dt_fld + var15 * 301288381 / var14;
			return var16 >= this.cn_fld && var16 <= this.eo_fld && var17 >= this.cb_fld && var17 <= this.cd_fld;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Z"
	)
	public static boolean aw(ev var0, int var1, int var2, int var3) {
		int var4 = var0.cs_fld[var1][var2][var3];
		if (var4 == -var0.dh_fld) {
			return false;
		} else if (var4 == var0.dh_fld) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (var0.mh(var5 + 1, var0.cv_fld[var1][var2][var3], var6 + 1)
				&& var0.mh(var5 + 128 - 1, var0.cv_fld[var1][var2 + 1][var3], var6 + 1)
				&& var0.mh(var5 + 128 - 1, var0.cv_fld[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
				&& var0.mh(var5 + 1, var0.cv_fld[var1][var2][var3 + 1], var6 + 128 - 1)) {
				var0.cs_fld[var1][var2][var3] = var0.dh_fld;
				return true;
			} else {
				var0.cs_fld[var1][var2][var3] = -var0.dh_fld;
				return false;
			}
		}
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)J"
	)
	public static long vm(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var2 += var0.qr_fld;
		var3 += var0.qr_fld;
		int var4 = var0.dj(var1, var2, var3);
		return var0.hz(var4) && var0.pu_Arrfv[var4] != null ? var0.pu_Arrfv[var4].az_fld * 7130385936274174641L : 0L;
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void lw(int var1) {
		if (var1 != 0 && var1 >> 28 == 0) {
			this.dx(var1);
		}
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIILem;Lem;IIJI)V"
	)
	public static void rp(ev var0, int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, long var9, int var11) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var12 = var2 + var0.qr_fld;
			int var13 = var3 + var0.qr_fld;
			if (var5 != null || var6 != null) {
				int var14 = var0.dj(var1, var12, var13);
				fs var15 = new fs();
				var15.hb(var9);
				var15.pc(var11);
				var15.ly(var2 * 128 + 64);
				var15.xn(var3 * 128 + 64);
				var15.tg(var4);
				var15.sq(var5);
				var15.ga(var6);
				var15.ie(var7);
				var15.dc(var8);

				for (int var16 = var1; var16 >= 0; var16--) {
					int var17 = var0.dj(var16, var12, var13);
					if (!var0.hz(var17)) {
						var0.sv(var17, var16, var12, var13);
					}

					if (var0.vo_fld[var16][var12][var13] == null) {
						var0.vo_fld[var16][var12][var13] = new rl10(var0, var17);
						var0.lg(var16, var12, var13);
					}
				}

				if (!pu_boolean && var0.xv_fld[var14] != null) {
					throw new AssertionError();
				}

				var0.xv_fld[var14] = var15;
				var0.pg_fld[var14] = var0.pg_fld[var14] | 16384;
				var0.sp_fld[var14] = var0.sp_fld[var14] | 1080863910568919040L;
				if (var5 instanceof dz || var6 instanceof dz) {
					rl17 var22 = var0.rx_fld[var12 >> 3][var13 >> 3];
					var22.ol_fld.add(var15);
					var0.mo((dz)var5);
					var0.mo((dz)var6);
				}

				var0.to(var5, 0, var15.getX(), var15.getZ(), var15.getY(), var2, var3);
				var0.to(var6, 0, var15.getX(), var15.getZ(), var15.getY(), var2, var3);
				var15.hl_fld = var1;
				if (var0.wy_fld) {
					WallObjectSpawned var23 = new WallObjectSpawned();
					var23.setTile(var0.vo_fld[var1][var12][var13]);
					var23.setWallObject(var15);
					og.ci_fld.getCallbacks().post(var23);
				}

				if (var0.wy_fld && client.bt_fld != null) {
					client.bt_fld.invalidateZone(var0, var12 >> 3, var13 >> 3);
				}
			}
		} catch (Throwable var21) {
			throw new RuntimeException(var21);
		}
	}

	@ObfuscatedName("isInstance")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isInstance")
	@Override
	public boolean isInstance() {
		return this.mf_boolean;
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void ft(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.ah_fld = var5;
		var11.ag_fld = var2 * -1810046336 + -905023168;
		var11.az_fld = var3 * -1839159424 + 1227903936;
		var11.ak_fld = var4;
		var11.aw_fld = var6;
		var11.av_fld = var8;
		var11.ae_fld = var9;
		var11.ay_fld = var10;
		if (this.bl_fld[var1][var2][var3] == null) {
			this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		this.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void kv(boolean var1) {
		if (!jh.qi(this) || var1) {
			this.dc_fld = true;
			this.bq_fld = var1;
			this.bv_fld = -1;
			this.wi_fld = -1;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void kz(boolean var1) {
		if (!jh.qi(this) || var1) {
			this.dc_fld = true;
			this.bq_fld = var1;
			this.bv_fld = -1;
			this.wi_fld = -1;
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void kc(int var1, int var2, int var3) {
		this.db_fld = var1;
		this.ck_fld = var2;
		this.cw_fld = var3;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIJI)V"
	)
	public void be(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, long var9, int var11) {
		try {
			rp(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lrl17;II)Z"
	)
	public boolean ma(rl17 var1, int var2, int var3) {
		if ((client.ly_fld & 32) != 0) {
			return client.bt_fld.zoneInFrustum(var2, var3, var1.nu_fld, var1.im_fld);
		} else {
			int var4 = var1.nu_fld;
			int var5 = -var1.im_fld;
			int var6 = ((var2 << 3) - this.qr_fld << 7) + 512 - this.du_fld;
			int var7 = ((var3 << 3) - this.qr_fld << 7) + 512 - this.co_fld;
			int var8 = var4 - this.do_fld;
			short var9 = 724;
			int var10 = fc.ar_fld.dw();
			int var11 = fc.ar_fld.sk();
			int var12 = fc.ar_fld.gc();
			int var13 = fc.ar_fld.ue();
			int var14 = fc.ar_fld.no();
			float var15 = this.ct_fld * var7 - this.ch_fld * var6;
			float var16 = this.ci_fld * var8 + this.cj_fld * var15;
			float var17 = this.cj_fld * var9;
			float var18 = var16 + var17;
			if (var18 > 50.0F) {
				float var19 = var7 * this.ch_fld + this.ct_fld * var6;
				float var20 = (var19 - var9) * var10;
				float var21 = (var19 + var9) * var10;
				if (var20 < var11 * var18 && var21 > var12 * var18) {
					float var22 = this.cj_fld * var8 - var15 * this.ci_fld;
					float var23 = this.ci_fld * var9;
					float var24 = (var22 + var23) * var10;
					if (var24 > var13 * var18) {
						float var25 = this.cj_fld * var5 + var23;
						float var26 = (var22 - var25) * var10;
						if (var26 < var14 * var18) {
							return true;
						}
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void km_void(int var1, int var2, int var3) {
		this.db_fld = var1;
		this.ck_fld = var2;
		this.cw_fld = var3;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void kw(int var1, int var2, int var3) {
		this.db_fld = var1;
		this.ck_fld = var2;
		this.cw_fld = var3;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfw;Z)V"
	)
	public static void dq(ev var0, fw var1, boolean var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.dx_fld = 0;

				for (int var3 = var0.cu_fld; var3 < var0.cf_fld; var3++) {
					ei[][] var4 = var0.bl_fld[var3];

					for (int var5 = var0.bn_fld; var5 < var0.dz_fld; var5++) {
						for (int var6 = var0.cr_fld; var6 < var0.bg_fld; var6++) {
							ei var7 = var4[var5][var6];
							if (var7 != null) {
								if (var7.ad_fld <= var0.bw_fld
									&& (
										!var2
											|| var0.dz(var5 - var0.dw_fld + var0.cx_fld + var0.ds_fld, var6 - var0.cc_fld + var0.ca_fld + var0.ds_fld)
											|| var0.cv_fld[var3][var5][var6] - var0.do_fld >= 2000
									)) {
									var7.ao_fld = true;
									var7.ab_fld = true;
									var7.ap_fld = var7.ah_fld * 1029554399 > 0 || var7.ag(-534903355);
									var0.dx_fld++;
								} else {
									var7.ao_fld = false;
									var7.ab_fld = false;
									var7.at_fld = 0;
								}
							}
						}
					}
				}

				int var16 = Math.abs(var0.cx_fld);
				int var17 = Math.abs(var0.ca_fld);

				for (int var18 = var0.cu_fld; var18 < var0.cf_fld; var18++) {
					ei[][] var20 = var0.bl_fld[var18];

					for (int var22 = -(var0.ds_fld + var16); var22 <= 0; var22++) {
						int var8 = var0.dw_fld + var22;
						int var9 = var0.dw_fld - var22;
						if (var8 >= var0.bn_fld || var9 < var0.dz_fld) {
							for (int var10 = -(var0.ds_fld + var17); var10 <= 0; var10++) {
								int var11 = var0.cc_fld + var10;
								int var12 = var0.cc_fld - var10;
								if (var8 >= var0.bn_fld && var8 < var0.dz_fld) {
									if (var11 >= var0.cr_fld && var11 < var0.bg_fld) {
										ei var13 = var20[var8][var11];
										if (var13 != null && var13.ao_fld) {
											var0.dg(var1, var13, true);
										}
									}

									if (var12 >= var0.cr_fld && var12 < var0.bg_fld) {
										ei var29 = var20[var8][var12];
										if (var29 != null && var29.ao_fld) {
											var0.dg(var1, var29, true);
										}
									}
								}

								if (var9 >= var0.bn_fld && var9 < var0.dz_fld) {
									if (var11 >= var0.cr_fld && var11 < var0.bg_fld) {
										ei var30 = var20[var9][var11];
										if (var30 != null && var30.ao_fld) {
											var0.dg(var1, var30, true);
										}
									}

									if (var12 >= var0.cr_fld && var12 < var0.bg_fld) {
										ei var31 = var20[var9][var12];
										if (var31 != null && var31.ao_fld) {
											var0.dg(var1, var31, true);
										}
									}
								}

								if (var0.dx_fld == 0) {
									var0.dr();
									fc.ar_fld.au_fld.ak(var0.bd_fld);
									return;
								}
							}
						}
					}
				}

				for (int var19 = var0.cu_fld; var19 < var0.cf_fld; var19++) {
					ei[][] var21 = var0.bl_fld[var19];

					for (int var23 = -(var0.ds_fld + var16); var23 <= 0; var23++) {
						int var24 = var0.de_fld + var23;
						int var25 = var0.de_fld - var23;
						if (var24 >= var0.bn_fld || var25 < var0.dz_fld) {
							for (int var26 = -(var0.ds_fld + var17); var26 <= 0; var26++) {
								int var27 = var0.df_fld + var26;
								int var28 = var0.df_fld - var26;
								if (var24 >= var0.bn_fld && var24 < var0.dz_fld) {
									if (var27 >= var0.cr_fld && var27 < var0.bg_fld) {
										ei var32 = var21[var24][var27];
										if (var32 != null && var32.ao_fld) {
											var0.dg(var1, var32, false);
										}
									}

									if (var28 >= var0.cr_fld && var28 < var0.bg_fld) {
										ei var33 = var21[var24][var28];
										if (var33 != null && var33.ao_fld) {
											var0.dg(var1, var33, false);
										}
									}
								}

								if (var25 >= var0.bn_fld && var25 < var0.dz_fld) {
									if (var27 >= var0.cr_fld && var27 < var0.bg_fld) {
										ei var34 = var21[var25][var27];
										if (var34 != null && var34.ao_fld) {
											var0.dg(var1, var34, false);
										}
									}

									if (var28 >= var0.cr_fld && var28 < var0.bg_fld) {
										ei var35 = var21[var25][var28];
										if (var35 != null && var35.ao_fld) {
											var0.dg(var1, var35, false);
										}
									}
								}

								if (var0.dx_fld == 0) {
									var0.dr();
									fc.ar_fld.au_fld.ak(var0.bd_fld);
									return;
								}
							}
						}
					}
				}

				fc.ar_fld.au_fld.ak(var0.bd_fld);
				var0.dr();
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfv;"
	)
	public static fv cv(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			ei var4 = var0.bl_fld[var1][var2][var3];
			return var4 == null ? null : var4.aa_fld;
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ki() {
		this.bq_fld = true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Log;IJ)J"
	)
	public static long az(og var0, int var1, long var2) {
		return hq.az(var0.ey_fld, var1, var2);
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ke() {
		this.bq_fld = true;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int fd(int var1) {
		return this.pg_fld[var1] >> 20 & 15;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void fl(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var2 += var0.qr_fld;
		var3 += var0.qr_fld;
		int var4 = var0.dj(var1, var2, var3);
		if (var0.hz(var4) && (var0.pg_fld[var4] & 2048) != 0) {
			ef var5 = var0.gk_fld[var4];
			var0.gk_fld[var4] = null;
			var0.pg_fld[var4] = var0.pg_fld[var4] & -2049;
			if (var5.ak_fld instanceof dz) {
				rl17 var6 = var0.rx_fld[var2 >> 3][var3 >> 3];
				var6.ol_fld.remove(var5);
			}

			if (var0.wy_fld) {
				GroundObjectDespawned var9 = new GroundObjectDespawned();
				var9.setTile(var0.vo_fld[var1][var2][var3]);
				var9.setGroundObject(var5);
				og.ci_fld.getCallbacks().post(var9);
			}

			if (var0.wy_fld && client.bt_fld != null) {
				client.bt_fld.invalidateZone(var0, var2 >> 3, var3 >> 3);
			}
		}
	}

	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIILem;IJ)Z"
	)
	public static boolean wy(ev var0, int var1, int var2, int var3, int var4, em var5, int var6, long var7) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var5 == null) {
			return false;
		} else {
			int var9 = var2 / 128;
			int var10 = var3 / 128;
			if (var9 >= 0 && var10 >= 0 && var9 < var0.dv_fld && var10 < var0.dk_fld) {
				ei var11 = var0.bl_fld[var1][var9][var10];
				if (var11 != null && (var11.ar_fld == null || var11.ar_fld.size() != 50)) {
					if (var11.ar_fld == null) {
						var11.ar_fld = new ArrayList();
					}

					fj var12 = new fj();
					var12.az_fld = var7;
					var12.ax_fld = 0;
					var12.av_fld = var1;
					var12.ah_fld = var2;
					var12.aw_fld = var3;
					var12.ae_fld = var4;
					var12.ak_fld = var5;
					var12.ag_fld = var6;
					var12.ay_fld = var9;
					var12.ar_fld = var10;
					var12.as_fld = var9;
					var12.af_fld = var10;
					var11.ar_fld.add(var12);
					var0.gh(var11);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void et() {
		this.ep_fld = -1;
		this.dd_fld = null;
	}

	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfw;Z)V"
	)
	public static void td(ev var0, fw var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.dx_fld = 0;

			for (int var3 = var0.cu_fld; var3 < var0.cf_fld; var3++) {
				ei[][] var4 = var0.bl_fld[var3];

				for (int var5 = var0.bn_fld; var5 < var0.dz_fld; var5++) {
					for (int var6 = var0.cr_fld; var6 < var0.bg_fld; var6++) {
						ei var7 = var4[var5][var6];
						if (var7 != null
							&& var7.ad_fld <= var0.bw_fld
							&& (
								!var2
									|| var0.dz(var5 - var0.dw_fld + var0.cx_fld + var0.ds_fld, var6 - var0.cc_fld + var0.ca_fld + var0.ds_fld)
									|| var0.cv_fld[var3][var5][var6] - var0.do_fld >= -816559351
							)) {
							var0.dw(var1, var7);
						}
					}
				}
			}

			var0.dr();
			fc.ar_fld.au_fld.ak(var0.bd_fld);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lev;)I"
	)
	public static int bl(ev var0) {
		return var0.ep_fld;
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIIIII)V"
	)
	public static void og(ev var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var0 == null) {
			var0.getClass();
		} else {
			eh var9 = new eh();
			var9.ak_fld = var3 / 128;
			var9.ag_fld = var4 / 128 * -756904905;
			var9.az_fld = var5 / 128 * -14885874;
			var9.av_fld = var6 / 128;
			var9.ae_fld = var2;
			var9.ah_fld = var3;
			var9.aw_fld = var4;
			var9.ay_fld = var5 * -396330112;
			var9.as_fld = var6;
			var9.ar_fld = var7 * -1894193487;
			var9.af_fld = var8 * -695168559;
			var0.dq_fld[var1][var0.dm_fld[var1]++] = var9;
		}
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "(IIF)V"
	)
	public void wc(int var1, int var2, float var3) {
		int var4 = var1;
		int var5 = var2;
		cv var6 = cl.qs_fld;
		if (this.aj_fld && var6 != null && var6.getWorldView().isTopLevel()) {
			int var7 = var6.bi_fld >> 7;
			int var8 = var6.dm_fld >> 7;
			byte var11 = 70;
			int var12 = (int)Math.hypot(var7 - var1, var8 - var2) - 70;
			if (var12 > 0) {
				var4 = (70 * var1 + var12 * var7) / (70 + var12);
				var5 = (70 * var2 + var12 * var8) / (70 + var12);
			}
		}

		this.cm_fld = var4;
		this.dg_fld = var5;
		this.bc_fld = var3;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void mx(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		uy var15 = kv.ak();
		ul var16 = uv.ak();
		uz.lv(var16.ak_fld, of.ak(var1), 0.0F, 0.0F, -288334468);
		tu.fh(var16.ag_fld, var4, var5, var6, (byte)-77);
		ul var17 = uv.ak();
		tu.fh(var17.ag_fld, -(this.dv_fld * 64) - this.eq_fld, this.ux_fld, -(this.dk_fld * 64) - this.pm_fld, (byte)-49);
		uy var18 = kv.ak();
		var18.ax(var17);
		var15.am(1.0F, this.bi_fld, 1.0F, 1.0F);
		uy.es(var18, var15, -317908119);
		uy.es(var18, this.bo_fld, -796444334);
		var15.ax(var16);
		uy.es(var18, var15, -1656168376);
		var15.as(var18);
		var15.aw();
		this.du_fld = (int)var15.ab(var7, var8, var9);
		this.do_fld = (int)uy.xc(var15, var7, var8, var9, 1082803709);
		this.co_fld = (int)var15.at(var7, var8, var9);
		this.dw_fld = this.du_fld / 128;
		this.cc_fld = this.co_fld / 128;
		this.eb_fld = (int)var15.ab(var12, 0.0F, var13) / 128;
		this.ec_fld = (int)var15.at(var12, 0.0F, var13) / 128;
		uc var19 = new uc();
		uy var20 = kv.ak();
		var19.ag(of.ak(-var2));
		var19.az(of.ak(-var3));
		uc.in(var19, var7, var8, var9, -405011595);
		uy.wf(var20, var19, 80442925);
		var20.aw();
		ul.hd(var16, (byte)-16);
		ul.hd(var17, (byte)-103);
		var15.aq();
		uy.es(var18, var20, -446354451);
		ey var21 = new ey(var18);
		var21.as(var10);
		ej.bk_fld = false;
		this.lg(var21, var14, fc.ar_fld.al_fld != 1);
		ej.bk_fld = false;
		var20.aq();
		var18.aq();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;Lrl17;Ljava/util/Set;)V"
	)
	public void cv(fw var1, fw var2, rl17 var3, Set var4) {
		try {
			for (int var5 = 0; var5 < var3.ol_fld.size(); var5++) {
				TileObject var6 = (TileObject)(TileObject)var3.ol_fld.get(var5);
				if (var6 instanceof fj) {
					fj var7 = (fj)var6;
					if (!pu_boolean && !(var7.ak_fld instanceof dz)) {
						throw new AssertionError();
					}

					dz var8 = (dz)var7.ak_fld;
					if (!var8.fy_fld && this.nb(var7.ay_fld, var7.ar_fld, var7.as_fld, var7.af_fld, var7.av_fld, var4)) {
						this.nd(var1, var8, var7, var7.ag_fld, var7.ah_fld, var7.ae_fld, var7.aw_fld, var7.az_fld);
					}
				} else if (var6 instanceof ef) {
					ef var14 = (ef)var6;
					if (!pu_boolean && !(var14.ak_fld instanceof dz)) {
						throw new AssertionError();
					}

					dz var18 = (dz)var14.ak_fld;
					if (!var18.fy_fld) {
						int var9 = var14.ae_fld >> 7;
						int var10 = var14.ah_fld >> 7;
						if (this.nb(var9, var10, var9, var10, var14.nj_fld, var4)) {
							this.nd(var1, var18, var14, 0, var14.ae_fld, var14.av_fld, var14.ah_fld, var14.ag_fld);
						}
					}
				} else if (var6 instanceof fs) {
					fs var15 = (fs)var6;
					int var19 = var15.ae_fld >> 7;
					int var22 = var15.ah_fld >> 7;
					if (this.nb(var19, var22, var19, var22, var15.hl_fld, var4)) {
						if (var15.ak_fld instanceof dz) {
							dz var25 = (dz)var15.ak_fld;
							if (!var25.fy_fld) {
								this.nd(var1, var25, var15, 0, var15.ae_fld, var15.av_fld, var15.ah_fld, var15.az_fld);
							}
						}

						if (var15.ag_fld instanceof dz) {
							dz var26 = (dz)var15.ag_fld;
							if (!var26.fy_fld) {
								this.nd(var1, var26, var15, 0, var15.ae_fld, var15.av_fld, var15.ah_fld, var15.az_fld);
							}
						}
					}
				} else if (var6 instanceof fv) {
					fv var16 = (fv)var6;
					int var20 = var16.ae_fld >> 7;
					int var23 = var16.ah_fld >> 7;
					if (this.nb(var20, var23, var20, var23, var16.pj_fld, var4)) {
						if (var16.ak_fld instanceof dz) {
							dz var27 = (dz)var16.ak_fld;
							if (!var27.fy_fld) {
								this.nd(var1, var27, var16, 0, var16.ae_fld + var16.as_fld, var16.av_fld, var16.ah_fld + var16.ar_fld, var16.az_fld);
							}
						}

						if (var16.ag_fld instanceof dz) {
							dz var28 = (dz)var16.ag_fld;
							if (!var28.fy_fld) {
								this.nd(var1, var28, var16, 0, var16.ae_fld + var16.af_fld, var16.av_fld, var16.ah_fld + var16.al_fld, var16.az_fld);
							}
						}
					}
				} else if (var6 instanceof en) {
					en var17 = (en)var6;
					int var21 = var17.ag_fld >> 7;
					int var24 = var17.az_fld >> 7;
					if (this.nb(var21, var24, var21, var24, var17.yn_fld, var4)) {
						if (var17.av_fld != null) {
							dw var29 = (dw)var17.av_fld;
							fn var11 = var29.getModel();
							if (var11 == null) {
								continue;
							}

							var29.setModelHeight(var11.getModelHeight());
							client.bt_fld.drawDynamic(-1, var1, this, var17, var29, var11, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld);
							client.tu(var1, var2, var11, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld, var17.aw_fld);
						}

						if (var17.ae_fld != null) {
							dw var30 = (dw)var17.ae_fld;
							fn var32 = var30.getModel();
							if (var32 == null) {
								continue;
							}

							var30.setModelHeight(var32.getModelHeight());
							client.bt_fld.drawDynamic(-1, var1, this, var17, var30, var32, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld);
							client.tu(var1, var2, var32, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld, var17.aw_fld);
						}

						if (var17.ah_fld != null) {
							dw var31 = (dw)var17.ah_fld;
							fn var33 = var31.getModel();
							if (var33 != null) {
								var31.setModelHeight(var33.getModelHeight());
								client.bt_fld.drawDynamic(-1, var1, this, var17, var31, var33, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld);
								client.tu(var1, var2, var33, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld, var17.aw_fld);
							}
						}
					}
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean md(int var1, int var2, int var3) {
		return this.dj_boolean(var1, var2, var3);
	}

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)V"
	)
	public static void ve(ev var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1 < 0) {
				var1 = 0;
			}

			var0.cp_fld = var1;
			var0.dj_fld = var2;
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void fg(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.ah_fld = var5;
		var11.ag_fld = var2 * -1810046336 + -905023168;
		var11.az_fld = var3 * -1839159424 + 1227903936;
		var11.ak_fld = var4;
		var11.aw_fld = var6;
		var11.av_fld = var8;
		var11.ae_fld = var9;
		var11.ay_fld = var10;
		if (this.bl_fld[var1][var2][var3] == null) {
			this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		this.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void lg(int var1, int var2, int var3) {
		if (this.ky_fld != null) {
			int var4 = var2 - this.qr_fld;
			int var5 = var3 - this.qr_fld;
			if (var4 >= 0 && var4 < this.ky_fld[var1].length && var5 >= 0 && var5 < this.ky_fld[var1][var4].length) {
				this.ky_fld[var1][var4][var5] = this.vo_fld[var1][var2][var3];
			}
		}
	}

	@ObfuscatedName("yg")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn getSkybox() {
		return this.dd_fld;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void kx() {
		if (this.dc_fld) {
			this.dc_fld = false;
			this.bv_fld = this.cm_fld;
			this.wi_fld = this.dg_fld;
		}
	}

	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "(III)Lef;"
	)
	public ef tk(int var1, int var2, int var3) {
		return this.bb(var1, var2, var3);
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	public void ij(er var1) {
		if (var1 != this.dn_fld) {
			this.dn_fld = var1;
			this.dh(this.dp_fld, this.es_fld, this.bu_fld, this.cq_fld, this.cg_fld);
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void kg() {
		this.bv_fld = -1;
		this.bq_fld = false;
	}

	@ObfuscatedName("getInstanceTemplateChunks")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	@Export("getInstanceTemplateChunks")
	@Override
	public int[][][] getInstanceTemplateChunks() {
		return this.po_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cg(int var1) {
		this.bp_fld = var1;
		this.cm_fld = -1;
		this.dg_fld = -1;
		this.bc_fld = -1.0F;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void kb(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		try {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 >= this.dv_fld) {
				var1 = this.dv_fld * 128 - 1;
			}

			if (var3 < 0) {
				var3 = 0;
			} else if (var3 >= this.dk_fld) {
				var3 = this.dk_fld * 128 - 1;
			}

			if (var4 < 1) {
				var4 = 1;
			} else if (var4 > -1003781323) {
				var4 = -2073441907;
			}

			this.ci_fld = fc.ay_fld[var4];
			this.cj_fld = fc.as_fld[var4];
			this.ch_fld = fc.ay_fld[var5];
			this.ct_fld = fc.as_fld[var5];
			ve(this, (var4 - ay_fld) / 32, var5 / 64);
			this.du_fld = var1;
			this.do_fld = var2;
			this.co_fld = var3;
			this.dw_fld = var1 / -1212970143;
			this.cc_fld = var3 / 128;
			this.eb_fld = var7 / 128;
			this.ec_fld = var8 / -1268382879;
			this.bw_fld = var6;
			ee var10 = new ee(var1, var2, var3, var4, var5, var7, var8);
			if (this.dd_fld != null) {
				this.dd_fld.gk(fk.ae_fld);
				this.dd_fld.bu(0, var4, var5, 0, 0, 0, -1L);
			}

			if (fc.an()) {
				fc.ar_fld.al_fld = 0;
				this.lg(var10, var9, true);
				fc.ar_fld.al_fld = 1;
				this.lg(var10, var9, false);
				fc.ar_fld.al_fld = 2;
			} else {
				fc.ar_fld.al_fld = 2;
				this.lg(var10, var9, true);
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lei;)Z"
	)
	boolean gh(ei var1) {
		if (var1.as_fld != this.dh_fld) {
			var1.as_fld = this.dh_fld;
			var1.ay_fld = var1.ah_fld;
			if (this.cz_fld >= this.dy_fld.length) {
				this.dy_fld = (ei[])(ei[])Arrays.copyOf(this.dy_fld, this.dy_fld.length * 2);
			}

			this.dy_fld[this.cz_fld++] = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void gb(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.aa_fld = null;
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean kq() {
		return this.bq_fld && this.bv_fld != -1;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void ln(fw var1, boolean var2) {
		this.dx_fld = 0;

		for (int var3 = this.cu_fld; var3 < this.cf_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.bn_fld; var5 < this.dz_fld; var5++) {
				for (int var6 = this.cr_fld; var6 < this.bg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null
						&& var7.ad_fld <= this.bw_fld
						&& (
							!var2
								|| this.dz(var5 - this.dw_fld + this.cx_fld + this.ds_fld, var6 - this.cc_fld + this.ca_fld + this.ds_fld)
								|| this.cv_fld[var3][var5][var6] - this.do_fld >= 76429667
						)) {
						this.dw(var1, var7);
					}
				}
			}
		}

		this.dr();
		fc.ar_fld.au_fld.ak(this.bd_fld);
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long hm(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld.ag_fld * 2728893160458550201L : 0L;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)J"
	)
	public static long bf(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					return var6.az_fld;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void aj(int var1, int var2, int var3, int var4) {
		int var5 = this.dj(var1, var2, var3);
		if ((this.nl_fld[var1][var2][var3] & 8) != 0) {
			this.pg_fld[var5] = this.pg_fld[var5] | 64;
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ev() {
		for (int var1 = 0; var1 < this.cf_fld; var1++) {
			for (int var2 = 0; var2 < this.dv_fld; var2++) {
				for (int var3 = 0; var3 < this.dk_fld; var3++) {
					this.bl_fld[var1][var2][var3] = null;
				}
			}
		}

		if (this.dm_fld != null) {
			for (int var4 = 0; var4 < this.di_fld; var4++) {
				for (int var7 = 0; var7 < this.dm_fld[var4]; var7++) {
					this.dq_fld[var4][var7] = null;
				}

				this.dm_fld[var4] = 0;
			}
		}

		if (this.bb_fld != null) {
			Arrays.fill(this.bb_fld, null);
		}

		this.ce_fld = 0;

		for (int var5 = 0; var5 < this.cz_fld; var5++) {
			this.dy_fld[var5] = null;
		}

		this.cz_fld = 0;

		for (int var6 = 0; var6 < this.cl_fld.length; var6++) {
			this.cl_fld[var6] = null;
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void lt(fw var1, boolean var2) {
		this.dx_fld = 0;

		for (int var3 = this.cu_fld; var3 < this.cf_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.bn_fld; var5 < this.dz_fld; var5++) {
				for (int var6 = this.cr_fld; var6 < this.bg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null) {
						if (var7.ad_fld <= this.bw_fld
							&& (
								!var2
									|| this.dz(var5 - this.dw_fld + this.cx_fld + this.ds_fld, var6 - this.cc_fld + this.ca_fld + this.ds_fld)
									|| this.cv_fld[var3][var5][var6] - this.do_fld >= 1701727096
							)) {
							var7.ao_fld = true;
							var7.ab_fld = true;
							var7.ap_fld = var7.ah_fld > 0 || var7.ag(-374388801);
							this.dx_fld++;
						} else {
							var7.ao_fld = false;
							var7.ab_fld = false;
							var7.at_fld = 0;
						}
					}
				}
			}
		}

		int var14 = Math.abs(this.cx_fld);
		int var15 = Math.abs(this.ca_fld);

		for (int var16 = this.cu_fld; var16 < this.cf_fld; var16++) {
			ei[][] var18 = this.bl_fld[var16];

			for (int var20 = -(this.ds_fld + var14); var20 <= 0; var20++) {
				int var8 = this.dw_fld + var20;
				int var9 = this.dw_fld - var20;
				if (var8 >= this.bn_fld || var9 < this.dz_fld) {
					for (int var10 = -(this.ds_fld + var15); var10 <= 0; var10++) {
						int var11 = this.cc_fld + var10;
						int var12 = this.cc_fld - var10;
						if (var8 >= this.bn_fld && var8 < this.dz_fld) {
							if (var11 >= this.cr_fld && var11 < this.bg_fld) {
								ei var13 = var18[var8][var11];
								if (var13 != null && var13.ao_fld) {
									this.dg(var1, var13, true);
								}
							}

							if (var12 >= this.cr_fld && var12 < this.bg_fld) {
								ei var27 = var18[var8][var12];
								if (var27 != null && var27.ao_fld) {
									this.dg(var1, var27, true);
								}
							}
						}

						if (var9 >= this.bn_fld && var9 < this.dz_fld) {
							if (var11 >= this.cr_fld && var11 < this.bg_fld) {
								ei var28 = var18[var9][var11];
								if (var28 != null && var28.ao_fld) {
									this.dg(var1, var28, true);
								}
							}

							if (var12 >= this.cr_fld && var12 < this.bg_fld) {
								ei var29 = var18[var9][var12];
								if (var29 != null && var29.ao_fld) {
									this.dg(var1, var29, true);
								}
							}
						}

						if (this.dx_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ak(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		for (int var17 = this.cu_fld; var17 < this.cf_fld; var17++) {
			ei[][] var19 = this.bl_fld[var17];

			for (int var21 = -(this.ds_fld + var14); var21 <= 0; var21++) {
				int var22 = this.de_fld + var21;
				int var23 = this.de_fld - var21;
				if (var22 >= this.bn_fld || var23 < this.dz_fld) {
					for (int var24 = -(this.ds_fld + var15); var24 <= 0; var24++) {
						int var25 = this.df_fld + var24;
						int var26 = this.df_fld - var24;
						if (var22 >= this.bn_fld && var22 < this.dz_fld) {
							if (var25 >= this.cr_fld && var25 < this.bg_fld) {
								ei var30 = var19[var22][var25];
								if (var30 != null && var30.ao_fld) {
									this.dg(var1, var30, false);
								}
							}

							if (var26 >= this.cr_fld && var26 < this.bg_fld) {
								ei var31 = var19[var22][var26];
								if (var31 != null && var31.ao_fld) {
									this.dg(var1, var31, false);
								}
							}
						}

						if (var23 >= this.bn_fld && var23 < this.dz_fld) {
							if (var25 >= this.cr_fld && var25 < this.bg_fld) {
								ei var32 = var19[var23][var25];
								if (var32 != null && var32.ao_fld) {
									this.dg(var1, var32, false);
								}
							}

							if (var26 >= this.cr_fld && var26 < this.bg_fld) {
								ei var33 = var19[var23][var26];
								if (var33 != null && var33.ao_fld) {
									this.dg(var1, var33, false);
								}
							}
						}

						if (this.dx_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ak(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		fc.ar_fld.au_fld.ak(this.bd_fld);
		this.dr();
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIIJ)I"
	)
	public int ie(int var1, int var2, int var3, long var4) {
		ei var6 = this.bl_fld[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.an_fld != null && var6.an_fld.az_fld * -4472860599998239529L == var4) {
			return var6.an_fld.as_fld * 57097171 & 0xFF;
		} else if (var6.aa_fld != null && var6.aa_fld.az_fld * 7130385936274174641L == var4) {
			return var6.aa_fld.au_fld * 1463326926 & 0xFF;
		} else if (var6.ai_fld != null && var6.ai_fld.ag_fld * 2728893160458550201L == var4) {
			return ef.sc(var6.ai_fld, -91466746) & 0xFF;
		} else {
			for (int var7 = 0; var7 < var6.ah_fld; var7++) {
				if (var6.aw_fld[var7].az_fld * 2121558925630479837L == var4) {
					return var6.aw_fld[var7].ax_fld * -1613956585 & 1057028374;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Z"
	)
	public static boolean ng(ev var0, int var1, int var2, int var3) {
		int var4 = var0.cs_fld[var1][var2][var3];
		if (var4 == -var0.dh_fld) {
			return false;
		} else if (var4 == var0.dh_fld) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (var0.mh(var5 + 1, var0.cv_fld[var1][var2][var3], var6 + 1)
				&& var0.mh(var5 + 1091847747 - 1, var0.cv_fld[var1][var2 + 1][var3], var6 + 1)
				&& var0.mh(var5 + 128 - 1, var0.cv_fld[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
				&& var0.mh(var5 + 1, var0.cv_fld[var1][var2][var3 + 1], var6 + 128 - 1)) {
				var0.cs_fld[var1][var2][var3] = var0.dh_fld;
				return true;
			} else {
				var0.cs_fld[var1][var2][var3] = -var0.dh_fld;
				return false;
			}
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lei;Z)V"
	)
	void lx(fw var1, ei var2, boolean var3) {
		try {
			this.dl_fld.az(var2);

			label663:
			while (true) {
				ei var4;
				int var5;
				int var6;
				int var7;
				int var8;
				ei[][] var9;
				while (true) {
					var4 = (ei)zi.ex(this.dl_fld);
					if (var4 == null) {
						return;
					}

					if (var4.ab_fld) {
						var5 = var4.al_fld;
						var6 = var4.au_fld;
						var7 = var4.af_fld;
						var8 = var4.ax_fld;
						var9 = this.bl_fld[var7];
						if (!var4.ao_fld) {
							break;
						}

						if (var3) {
							if (var7 > 0) {
								ei var10 = this.bl_fld[var7 - 1][var5][var6];
								if (var10 != null && var10.ab_fld) {
									continue;
								}
							}

							if (var5 <= this.dw_fld && var5 > this.bn_fld) {
								ei var23 = var9[var5 - 1][var6];
								if (var23 != null && var23.ab_fld && (var23.ao_fld || (var4.am_fld & 1) == 0)) {
									continue;
								}
							}

							if (var5 >= this.dw_fld && var5 < this.dz_fld - 1) {
								ei var24 = var9[var5 + 1][var6];
								if (var24 != null && var24.ab_fld && (var24.ao_fld || (var4.am_fld & 4) == 0)) {
									continue;
								}
							}

							if (var6 <= this.cc_fld && var6 > this.cr_fld) {
								ei var25 = var9[var5][var6 - 1];
								if (var25 != null && var25.ab_fld && (var25.ao_fld || (var4.am_fld & 8) == 0)) {
									continue;
								}
							}

							if (var6 >= this.cc_fld && var6 < this.bg_fld - 1) {
								ei var26 = var9[var5][var6 + 1];
								if (var26 != null && var26.ab_fld && (var26.ao_fld || (var4.am_fld & 2) == 0)) {
									continue;
								}
							}
						} else {
							var3 = true;
						}

						var4.ao_fld = false;
						if (var4.bd_fld != null) {
							ei var27 = var4.bd_fld;
							if (var27.az_fld != null) {
								if (!this.dj_boolean(0, var5, var6)) {
									var1.ag(this, var27.az_fld, 0, var5, var6, 1070004095);
								}
							} else if (var27.av_fld != null && !this.dj_boolean(0, var5, var6)) {
								var1.az(this, var27.av_fld, var5, var6, (byte)-9);
							}

							fs var11 = var27.an_fld;
							if (var11 != null) {
								var1.ak(var11.ak_fld, 0, var11.ae_fld, var11.av_fld, var11.ah_fld, var11.az_fld);
							}

							for (int var12 = 0; var12 < var27.ah_fld; var12++) {
								fj var13 = var27.aw_fld[var12];
								if (var13 != null) {
									var1.ak(var13.ak_fld, var13.ag_fld, var13.ah_fld, var13.ae_fld, var13.aw_fld, var13.az_fld);
								}
							}

							if (var27.ar_fld != null && !var27.ar_fld.isEmpty()) {
								for (int var48 = 0; var48 < var27.ar_fld.size(); var48++) {
									fj var55 = (fj)(fj)var27.ar_fld.get(var48);
									var1.ak(var55.ak_fld, var55.ag_fld, var55.ah_fld, var55.ae_fld, var55.aw_fld, var55.az_fld);
								}
							}
						}

						boolean var28 = false;
						if (var4.az_fld != null) {
							if (!this.dj_boolean(var8, var5, var6)) {
								var28 = true;
								if (var4.az_fld.az_fld * -1656357861 != 12345678 || var7 <= this.db_fld) {
									var1.ag(this, var4.az_fld, var8, var5, var6, 1425591655);
								}
							}
						} else if (var4.av_fld != null && !this.dj_boolean(var8, var5, var6)) {
							var28 = true;
							var1.az(this, var4.av_fld, var5, var6, (byte)-125);
						}

						int var36 = 0;
						int var49 = 0;
						fs var56 = var4.an_fld;
						fv var14 = var4.aa_fld;
						if (var56 != null || var14 != null) {
							if (this.dw_fld == var5) {
								var36++;
							} else if (this.dw_fld < var5) {
								var36 += 2;
							}

							if (this.cc_fld == var6) {
								var36 += 3;
							} else if (this.cc_fld > var6) {
								var36 += 6;
							}

							var49 = an_fld[var36];
							var4.bm_fld = ai_fld[var36];
						}

						if (var56 != null) {
							if ((var56.aw_fld & aa_fld[var36]) != 0) {
								if (var56.aw_fld == 16) {
									var4.at_fld = -436509225;
									var4.ac_fld = aq_fld[var36];
									var4.aj_fld = -799242229 - var4.ac_fld;
								} else if (var56.aw_fld == 32) {
									var4.at_fld = -873018450;
									var4.ac_fld = am_fld[var36];
									var4.aj_fld = -1598484458 - var4.ac_fld;
								} else if (var56.aw_fld == 64) {
									var4.at_fld = -1746036900;
									var4.ac_fld = ad_fld[var36];
									var4.aj_fld = 1097998380 - var4.ac_fld;
								} else {
									var4.at_fld = -1309527675;
									var4.ac_fld = ao_fld[var36];
									var4.aj_fld = 1897240609 - var4.ac_fld;
								}
							} else {
								var4.at_fld = 0;
							}

							if ((var56.aw_fld & var49) != 0 && !el.gt(this, var8, var5, var6, var56.aw_fld)) {
								var1.ak(var56.ak_fld, 0, var56.ae_fld, var56.av_fld, var56.ah_fld, var56.az_fld);
							}

							if ((var56.ay_fld & var49) != 0 && !el.gt(this, var8, var5, var6, var56.ay_fld)) {
								var1.ak(var56.ag_fld, 0, var56.ae_fld, var56.av_fld, var56.ah_fld, var56.az_fld);
							}
						}

						if (var14 != null && !this.de(var8, var5, var6, var14.ak_fld.ez_fld * -1271205903)) {
							if ((var14.aw_fld & var49) != 0) {
								var1.ak(var14.ak_fld, 0, var14.ae_fld + var14.as_fld, var14.av_fld, var14.ah_fld + var14.ar_fld, var14.az_fld);
							} else if (var14.aw_fld == 256) {
								int var15 = var14.ae_fld - this.du_fld;
								int var16 = var14.ah_fld - this.co_fld;
								int var17 = var14.ay_fld;
								int var18;
								if (var17 != 1 && var17 != 2) {
									var18 = var15;
								} else {
									var18 = -var15;
								}

								int var19;
								if (var17 != 2 && var17 != 3) {
									var19 = var16;
								} else {
									var19 = -var16;
								}

								if (var19 < var18) {
									var1.ak(var14.ak_fld, 0, var14.ae_fld + var14.as_fld, var14.av_fld, var14.ah_fld + var14.ar_fld, var14.az_fld);
								} else if (var14.ag_fld != null) {
									var1.ak(var14.ag_fld, 0, var14.ae_fld + var14.af_fld, var14.av_fld, var14.ah_fld + var14.al_fld, var14.az_fld);
								}
							}
						}

						if (var28) {
							ef var65 = var4.ai_fld;
							if (var65 != null) {
								var1.ak(var65.ak_fld, 0, var65.ae_fld, var65.av_fld, var65.ah_fld, var65.ag_fld);
							}

							en var71 = var4.ae_fld;
							if (var71 != null && var71.ay_fld == 0) {
								if (var71.av_fld != null) {
									var1.ak(var71.av_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}

								if (var71.ae_fld != null) {
									var1.ak(var71.ae_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}

								if (var71.ah_fld != null) {
									var1.ak(var71.ah_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}
							}
						}

						int var66 = var4.am_fld;
						if (var66 != 0) {
							if (var5 < this.dw_fld && var5 >= this.bn_fld && var5 < this.dz_fld - 1 && (var66 & 4) != 0) {
								ei var72 = var9[var5 + 1][var6];
								if (var72 != null && var72.ab_fld) {
									this.dl_fld.az(var72);
								}
							}

							if (var6 < this.cc_fld && var6 >= this.cr_fld && var6 < this.bg_fld - 1 && (var66 & 2) != 0) {
								ei var73 = var9[var5][var6 + 1];
								if (var73 != null && var73.ab_fld) {
									this.dl_fld.az(var73);
								}
							}

							if (var5 > this.dw_fld && var5 > this.bn_fld && var5 < this.dz_fld && (var66 & 1) != 0) {
								ei var74 = var9[var5 - 1][var6];
								if (var74 != null && var74.ab_fld) {
									this.dl_fld.az(var74);
								}
							}

							if (var6 > this.cc_fld && var6 > this.cr_fld && var6 < this.bg_fld && (var66 & 8) != 0) {
								ei var75 = var9[var5][var6 - 1];
								if (var75 != null && var75.ab_fld) {
									this.dl_fld.az(var75);
								}
							}
						}
						break;
					}
				}

				if (var4.at_fld != 0) {
					boolean var29 = true;

					for (int var37 = 0; var37 < var4.ah_fld; var37++) {
						if (var4.aw_fld[var37].au_fld * 1952704125 != this.dh_fld && (var4.aq_fld[var37] & var4.at_fld) == var4.ac_fld) {
							var29 = false;
							break;
						}
					}

					if (var29) {
						fs var38 = var4.an_fld;
						if (!el.gt(this, var8, var5, var6, var38.aw_fld)) {
							var1.ak(var38.ak_fld, 0, var38.ae_fld, var38.av_fld, var38.ah_fld, var38.az_fld);
						}

						var4.at_fld = 0;
					}
				}

				if (var4.ap_fld) {
					try {
						var4.ap_fld = false;
						int var30 = 0;

						label611:
						for (int var39 = 0; var39 < var4.ah_fld; var39++) {
							fj var50 = var4.aw_fld[var39];
							if (var50.au_fld != this.dh_fld) {
								for (int var57 = var50.ay_fld; var57 <= var50.as_fld; var57++) {
									for (int var61 = var50.ar_fld; var61 <= var50.af_fld; var61++) {
										ei var67 = var9[var57][var61];
										if (var67.ao_fld) {
											var4.ap_fld = true;
											continue label611;
										}

										if (var67.at_fld != 0) {
											int var76 = 0;
											if (var57 > var50.ay_fld) {
												var76++;
											}

											if (var57 < var50.as_fld) {
												var76 += 4;
											}

											if (var61 > var50.ar_fld) {
												var76 += 8;
											}

											if (var61 < var50.af_fld) {
												var76 += 2;
											}

											if ((var76 & var67.at_fld) == var4.aj_fld) {
												var4.ap_fld = true;
												continue label611;
											}
										}
									}
								}

								this.cl_fld[var30++] = var50;
								var50.al_fld = this.dy(var50, this.dw_fld, this.cc_fld);
							}
						}

						if (var4.ag(339136532)) {
							for (int var40 = 0; var40 < var4.ar_fld.size(); var40++) {
								fj var51 = (fj)(fj)var4.ar_fld.get(var40);
								if (var51.au_fld != this.dh_fld) {
									this.cl_fld[var30++] = var51;
									var51.al_fld = this.dy(var51, this.dw_fld, this.cc_fld);
								}
							}
						}

						while (true) {
							int var41 = -50;
							int var52 = -1;

							for (int var58 = 0; var58 < var30; var58++) {
								fj var62 = this.cl_fld[var58];
								if (var62.au_fld != this.dh_fld) {
									if (var62.al_fld > var41) {
										var41 = var62.al_fld;
										var52 = var58;
									} else if (var62.al_fld == var41) {
										int var68 = var62.ah_fld - this.du_fld;
										int var77 = var62.aw_fld - this.co_fld;
										int var80 = this.cl_fld[var52].ah_fld * -564370133 - this.du_fld;
										int var81 = this.cl_fld[var52].aw_fld * -502866077 - this.co_fld;
										if (var68 * var68 + var77 * var77 > var80 * var80 + var81 * var81) {
											var52 = var58;
										}
									}
								}
							}

							if (var52 == -1) {
								if (var4.ap_fld) {
									continue label663;
								}
								break;
							}

							fj var59 = this.cl_fld[var52];
							var59.au_fld = this.dh_fld;
							if (!zq(this, var8, var59.ay_fld, var59.as_fld, var59.ar_fld, var59.af_fld, var59.ak_fld.ez_fld * -1271205903)) {
								var1.ak(var59.ak_fld, var59.ag_fld, var59.ah_fld, var59.ae_fld, var59.aw_fld, var59.az_fld);
							}

							for (int var63 = var59.ay_fld; var63 <= var59.as_fld; var63++) {
								for (int var69 = var59.ar_fld; var69 <= var59.af_fld; var69++) {
									ei var78 = var9[var63][var69];
									if (var78.at_fld != 0) {
										this.dl_fld.az(var78);
									} else if ((var63 != var5 || var69 != var6) && var78.ab_fld) {
										this.dl_fld.az(var78);
									}
								}
							}
						}
					} catch (Exception var21) {
						var4.ap_fld = false;
					}
				}

				if (var4.ab_fld && var4.at_fld == 0) {
					if (var5 <= this.dw_fld && var5 > this.bn_fld) {
						ei var31 = var9[var5 - 1][var6];
						if (var31 != null && var31.ab_fld) {
							continue;
						}
					}

					if (var5 >= this.dw_fld && var5 < this.dz_fld - 1) {
						ei var32 = var9[var5 + 1][var6];
						if (var32 != null && var32.ab_fld) {
							continue;
						}
					}

					if (var6 <= this.cc_fld && var6 > this.cr_fld) {
						ei var33 = var9[var5][var6 - 1];
						if (var33 != null && var33.ab_fld) {
							continue;
						}
					}

					if (var6 >= this.cc_fld && var6 < this.bg_fld - 1) {
						ei var34 = var9[var5][var6 + 1];
						if (var34 != null && var34.ab_fld) {
							continue;
						}
					}

					var4.ab_fld = false;
					this.dx_fld--;
					en var35 = var4.ae_fld;
					if (var35 != null && var35.ay_fld != 0) {
						if (var35.av_fld != null) {
							var1.ak(var35.av_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}

						if (var35.ae_fld != null) {
							var1.ak(var35.ae_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}

						if (var35.ah_fld != null) {
							var1.ak(var35.ah_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}
					}

					if (var4.bm_fld != 0) {
						fv var42 = var4.aa_fld;
						if (var42 != null && !this.de(var8, var5, var6, var42.ak_fld.ez_fld * -1271205903)) {
							if ((var42.aw_fld & var4.bm_fld) != 0) {
								var1.ak(var42.ak_fld, 0, var42.ae_fld + var42.as_fld, var42.av_fld, var42.ah_fld + var42.ar_fld, var42.az_fld);
							} else if (var42.aw_fld == 256) {
								int var53 = var42.ae_fld - this.du_fld;
								int var60 = var42.ah_fld - this.co_fld;
								int var64 = var42.ay_fld;
								int var70;
								if (var64 != 1 && var64 != 2) {
									var70 = var53;
								} else {
									var70 = -var53;
								}

								int var79;
								if (var64 != 2 && var64 != 3) {
									var79 = var60;
								} else {
									var79 = -var60;
								}

								if (var79 >= var70) {
									var1.ak(var42.ak_fld, 0, var42.ae_fld + var42.as_fld, var42.av_fld, var42.ah_fld + var42.ar_fld, var42.az_fld);
								} else if (var42.ag_fld != null) {
									var1.ak(var42.ag_fld, 0, var42.ae_fld + var42.af_fld, var42.av_fld, var42.ah_fld + var42.al_fld, var42.az_fld);
								}
							}
						}

						fs var54 = var4.an_fld;
						if (var54 != null) {
							if ((var54.ay_fld & var4.bm_fld) != 0 && !el.gt(this, var8, var5, var6, var54.ay_fld)) {
								var1.ak(var54.ag_fld, 0, var54.ae_fld, var54.av_fld, var54.ah_fld, var54.az_fld);
							}

							if ((var54.aw_fld & var4.bm_fld) != 0 && !el.gt(this, var8, var5, var6, var54.aw_fld)) {
								var1.ak(var54.ak_fld, 0, var54.ae_fld, var54.av_fld, var54.ah_fld, var54.az_fld);
							}
						}
					}

					if (var7 < this.cf_fld - 1) {
						ei var43 = this.bl_fld[var7 + 1][var5][var6];
						if (var43 != null && var43.ab_fld) {
							this.dl_fld.az(var43);
						}
					}

					if (var5 < this.dw_fld && var5 >= this.bn_fld && var5 < this.dz_fld - 1) {
						ei var44 = var9[var5 + 1][var6];
						if (var44 != null && var44.ab_fld) {
							this.dl_fld.az(var44);
						}
					}

					if (var6 < this.cc_fld && var6 >= this.cr_fld && var6 < this.bg_fld - 1) {
						ei var45 = var9[var5][var6 + 1];
						if (var45 != null && var45.ab_fld) {
							this.dl_fld.az(var45);
						}
					}

					if (var5 > this.dw_fld && var5 > this.bn_fld && var5 < this.dz_fld) {
						ei var46 = var9[var5 - 1][var6];
						if (var46 != null && var46.ab_fld) {
							this.dl_fld.az(var46);
						}
					}

					if (var6 > this.cc_fld && var6 > this.cr_fld && var6 < this.bg_fld) {
						ei var47 = var9[var5][var6 - 1];
						if (var47 != null && var47.ab_fld) {
							this.dl_fld.az(var47);
						}
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)V"
	)
	public static void fe(ev var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var2 += var0.qr_fld;
		var3 += var0.qr_fld;
		int var5 = var0.dj(var1, var2, var3);
		if (var0.hz(var5)) {
			fv var6 = var0.pu_Arrfv[var5];
			if (var6 != null) {
				if (var6.as_fld != 0) {
					var6.as_fld = var6.as_fld < 0 ? -var4 : var4;
				}

				if (var6.ar_fld != 0) {
					var6.ar_fld = var6.ar_fld < 0 ? -var4 : var4;
				}
			}
		}
	}

	@ObfuscatedName("zr")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfs;"
	)
	public static fs zr(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var2 += var0.qr_fld;
			var3 += var0.qr_fld;
			int var4 = var0.dj(var1, var2, var3);
			return var0.hz(var4) ? var0.xv_fld[var4] : null;
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lei;)V"
	)
	void lj(fw var1, ei var2) {
		try {
			if (var2 != null) {
				int var3 = var2.al_fld * 158543424;
				int var4 = var2.au_fld * 1787679331;
				int var5 = var2.af_fld;
				int var6 = var2.ax_fld * -958344666;
				if (var2.af_fld * -376174190 == 0 && var2.bd_fld != null) {
					this.dw(var1, var2.bd_fld);
				}

				if (var2.az_fld != null) {
					if (!this.dj_boolean(var6, var3, var4) && (var2.az_fld.az_fld * -1996943778 != 12345678 || var5 <= this.db_fld)) {
						var1.ag(this, var2.az_fld, var6, var3, var4, 1814363428);
					}
				} else if (var2.av_fld != null && !this.dj_boolean(var6, var3, var4)) {
					var1.az(this, var2.av_fld, var3, var4, (byte)-111);
				}

				fs var7 = var2.an_fld;
				if (var7 != null) {
					if (var7.ak_fld != null && !el.gt(this, var6, var3, var4, var7.aw_fld * 1620546755)) {
						var1.ak(var7.ak_fld, 0, var7.ae_fld, var7.av_fld, var7.ah_fld, var7.az_fld);
					}

					if (var7.ag_fld != null && !el.gt(this, var6, var3, var4, var7.ay_fld * 832960368)) {
						var1.ak(var7.ag_fld, 0, var7.ae_fld * 2069066814, var7.av_fld * -645299925, var7.ah_fld * 1398193545, var7.az_fld);
					}
				}

				fv var8 = var2.aa_fld;
				if (var8 != null && !this.de(var6, var3, var4, var8.ak_fld.ez_fld * -1271205903)) {
					if (var8.aw_fld == -1072731920) {
						var1.ak(var8.ak_fld, 0, var8.ae_fld + var8.as_fld, var8.av_fld, var8.ah_fld + var8.ar_fld, var8.az_fld);
						if (var8.ag_fld != null) {
							var1.ak(var8.ag_fld, 0, var8.ae_fld + var8.af_fld, var8.av_fld * 594242349, var8.ah_fld + var8.al_fld, var8.az_fld);
						}
					} else {
						var1.ak(var8.ak_fld, 0, var8.ae_fld + var8.as_fld, var8.av_fld, var8.ah_fld + var8.ar_fld, var8.az_fld);
					}
				}

				ef var9 = var2.ai_fld;
				if (var9 != null) {
					var1.ak(var9.ak_fld, 0, var9.ae_fld * -1420064736, var9.av_fld, var9.ah_fld, var9.ag_fld);
				}

				en var10 = var2.ae_fld;
				if (var10 != null) {
					if (var10.av_fld != null) {
						var1.ak(var10.av_fld, 0, var10.ag_fld * -1329456708, var10.ak_fld - var10.ay_fld, var10.az_fld, var10.aw_fld);
					}

					if (var10.ae_fld != null) {
						var1.ak(var10.ae_fld, 0, var10.ag_fld * 167580324, var10.ak_fld - var10.ay_fld, var10.az_fld * -1652776856, var10.aw_fld);
					}

					if (var10.ah_fld != null) {
						var1.ak(var10.ah_fld, 0, var10.ag_fld, var10.ak_fld - var10.ay_fld, var10.az_fld, var10.aw_fld);
					}
				}

				for (int var11 = 0; var11 < var2.ah_fld; var11++) {
					fj var12 = var2.aw_fld[var11];
					var12.au_fld = this.dh_fld * -439268463;
					if (var12.ay_fld == var2.al_fld
						&& var12.ar_fld == var2.au_fld
						&& !zq(this, var6, var12.ay_fld * -473322276, var12.as_fld, var12.ar_fld * -608337963, var12.af_fld * -675889490, var12.ak_fld.ez_fld * -1113141377)) {
						try {
							var1.ak(var12.ak_fld, var12.ag_fld, var12.ah_fld, var12.ae_fld * -828754752, var12.aw_fld, var12.az_fld);
						} catch (Exception var16) {
						}
					}
				}

				if (var2.ag(-221309821)) {
					for (int var18 = 0; var18 < var2.ar_fld.size(); var18++) {
						fj var19 = (fj)(fj)var2.ar_fld.get(var18);
						var19.au_fld = this.dh_fld * 1724089629;
						if (!zq(this, var6, var2.al_fld * -1825981336, var2.al_fld, var2.au_fld, var2.au_fld * -179370268, var19.ak_fld.ez_fld * -1731035669)) {
							try {
								var1.ak(var19.ak_fld, var19.ag_fld * -639977334, var19.ah_fld * 1612610297, var19.ae_fld * -1856906660, var19.aw_fld, var19.az_fld);
							} catch (Exception var15) {
							}
						}
					}
				}
			}
		} catch (Throwable var17) {
			throw new RuntimeException(var17);
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Lfj;II)I"
	)
	int lz(fj var1, int var2, int var3) {
		int var4 = var2 - var1.ay_fld;
		int var5 = var1.as_fld - var2;
		if (var5 > var4) {
			var4 = var5;
		}

		int var6 = var3 - var1.ar_fld;
		int var7 = var1.af_fld - var3;
		return var7 > var6 ? var4 + var7 : var4 + var6;
	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIILem;JLem;Lem;I)V"
	)
	public static void ql(ev var0, int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		if (var0 == null) {
			var0.getClass();
		}

		en var11 = new en();
		var11.ah_fld = var5;
		var11.ag_fld = var2 * -1810046336 + -905023168;
		var11.az_fld = var3 * -1839159424 + 1227903936;
		var11.ak_fld = var4;
		var11.aw_fld = var6;
		var11.av_fld = var8;
		var11.ae_fld = var9;
		var11.ay_fld = var10;
		if (var0.bl_fld[var1][var2][var3] == null) {
			var0.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		var0.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lfj;II)I"
	)
	int lk(fj var1, int var2, int var3) {
		int var4 = var2 - var1.ay_fld;
		int var5 = var1.as_fld - var2;
		if (var5 > var4) {
			var4 = var5;
		}

		int var6 = var3 - var1.ar_fld;
		int var7 = var1.af_fld - var3;
		return var7 > var6 ? var4 + var7 : var4 + var6;
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Ldz;Lnet/runelite/api/TileObject;IIIIJ)V"
	)
	public void nd(fw var1, dz var2, TileObject var3, int var4, int var5, int var6, int var7, long var8) {
		try {
			if (!pu_boolean && var2.fy_fld) {
				throw new AssertionError();
			} else {
				int var10 = client.ly_fld >> 7 & 15;
				if (var10 > 0) {
					var2.oy();
					rl23.hy(var3, var2, var4, var5, var6, var7);
				} else {
					fn var11;
					try {
						var11 = var2.getModel();
					} catch (Exception var14) {
						client.logger.debug("exception drawing dynamic game entity", (Throwable)var14);
						return;
					}

					if (var11 != null) {
						var2.setModelHeight(var11.getModelHeight());
						int var12 = var2.getAnimationHeightOffset();
						client.bt_fld.drawDynamic(-1, var1, this, var3, var2, var11, var4, var5, var6 - var12, var7);
						client.tu(var1, this.lm_fld, var11, var4, var5, var6 - var12, var7, var8);
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)I"
	)
	public static int rl(ev var0, int var1, int var2, int var3) {
		return (var0.cv_fld[var1][var2][var3] + var0.cv_fld[var1][var2 + 1][var3] + var0.cv_fld[var1][var2][var3 + 1] + var0.cv_fld[var1][var2 + 1][var3 + 1]) / 4;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int ef(boolean var0) {
		return var0 ? 520 : -83780963;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ks() {
		this.bv_fld = -1;
		this.bq_fld = false;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void go() {
		for (int var1 = 0; var1 < 4; var1++) {
			for (int var2 = 0; var2 < this.dv_fld; var2++) {
				for (int var3 = 0; var3 < this.dk_fld; var3++) {
					int var4 = this.dj(var1, var2, var3);
					if (this.hz(var4)) {
						int var5 = var2 >> 3;
						int var6 = var3 >> 3;
						rl17 var7 = this.rx_fld[var5][var6];
						if ((this.pg_fld[var4] & 32) != 0) {
							if (!pu_boolean && var1 != 0) {
								throw new AssertionError();
							}

							int var8 = this.cv_fld[0][var2][var3];
							this.xk(var7, var2, var3, var8);
						}

						int var14 = (this.nl_fld[1][var2][var3] & 2) >> 1;
						int var9 = var1 + var14;
						int var10 = this.cv_fld[var9][var2][var3];
						this.xk(var7, var2, var3, var10);
						int var11 = this.pg_fld[var4];
						if ((var11 & 2048) != 0) {
							ef var12 = this.gk_fld[var4];
							if (var12.ak_fld instanceof fn) {
								this.xn(var10, var7, (fn)var12.ak_fld);
							}
						}

						if ((var11 & 16384) != 0) {
							fs var15 = this.xv_fld[var4];
							if (var15.ak_fld instanceof fn) {
								this.xn(var10, var7, (fn)var15.ak_fld);
							}

							if (var15.ag_fld instanceof fn) {
								this.xn(var10, var7, (fn)var15.ag_fld);
							}
						}

						if ((var11 & 32768) != 0) {
							fv var16 = this.pu_Arrfv[var4];
							if (var16.ak_fld instanceof fn) {
								this.xn(var10, var7, (fn)var16.ak_fld);
							}

							if (var16.ag_fld instanceof fn) {
								this.xn(var10, var7, (fn)var16.ag_fld);
							}
						}

						for (int var17 = 0; var17 < this.pc_fld[var4]; var17++) {
							fj var13 = this.sd_fld[var4 * 5 + var17];
							if (var13.ak_fld instanceof fn) {
								this.xn(var10, var7, (fn)var13.ak_fld);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean lh(int var1, int var2, int var3, int var4) {
		if (!this.dj_boolean(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.cv_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.du_fld) {
						if (!this.mh(var5, var7, var6)) {
							return false;
						}

						if (!this.mh(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5, var8, var6)) {
							return false;
						}

						if (!this.mh(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6)) {
						return false;
					}

					if (!this.mh(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.co_fld) {
						if (!this.mh(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.mh(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.du_fld) {
						if (!this.mh(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.mh(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.co_fld) {
						if (!this.mh(var5, var7, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5, var8, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6)) {
						return false;
					}

					if (!this.mh(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.mh(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.mh(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.mh(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.mh(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? this.mh(var5, var9, var6) : true;
			}
		}
	}

	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean zi(ev var0, int var1, int var2, int var3, int var4) {
		return var0.ix(var0.ex_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ly(int var1, int var2, int var3, int var4) {
		if (!this.dj_boolean(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.cv_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.du_fld) {
						if (!this.mh(var5, var7, var6)) {
							return false;
						}

						if (!this.mh(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5, var8, var6)) {
							return false;
						}

						if (!this.mh(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6)) {
						return false;
					}

					if (!this.mh(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.co_fld) {
						if (!this.mh(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.mh(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.du_fld) {
						if (!this.mh(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.mh(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.co_fld) {
						if (!this.mh(var5, var7, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5, var8, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6)) {
						return false;
					}

					if (!this.mh(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.mh(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.mh(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.mh(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.mh(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? this.mh(var5, var9, var6) : true;
			}
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean lv(int var1, int var2, int var3, int var4) {
		if (!this.dj_boolean(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.cv_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.du_fld) {
						if (!this.mh(var5, var7, var6)) {
							return false;
						}

						if (!this.mh(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5, var8, var6)) {
							return false;
						}

						if (!this.mh(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6)) {
						return false;
					}

					if (!this.mh(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.co_fld) {
						if (!this.mh(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.mh(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.du_fld) {
						if (!this.mh(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.mh(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.co_fld) {
						if (!this.mh(var5, var7, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5, var8, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6)) {
						return false;
					}

					if (!this.mh(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.mh(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.mh(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.mh(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.mh(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? this.mh(var5, var9, var6) : true;
			}
		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lrl17;)V"
	)
	public void mp(fw var1, rl17 var2) {
		try {
			for (int var3 = 0; var3 < var2.xi_fld.size(); var3++) {
				fj var4 = (fj)(fj)var2.xi_fld.get(var3);
				if (var4.ak_fld instanceof ev) {
					var1.lf(var4.ak_fld, var4.ag_fld, var4.ah_fld, var4.ae_fld, var4.aw_fld, var4.az_fld);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "()[[[Lrl10;"
	)
	public rl10[][][] getTiles() {
		return this.ky_fld;
	}

	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "(Lev;Leg;III)V"
	)
	public static void xb(ev var0, eg var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var5 = var3 + 1;
			int var6 = var4 + 1;

			for (int var7 = var3; var7 <= var5; var7++) {
				if (var7 >= 0 && var7 < var0.dv_fld) {
					for (int var8 = var4 - 1; var8 <= var6; var8++) {
						if (var8 >= 0 && var8 < var0.dk_fld && (var7 >= var5 || var8 >= var6)) {
							int var9 = var0.dj(var2, var7, var8);
							if (var0.hz(var9)) {
								ef var10 = var0.gk_fld[var9];
								if (var10 != null && var10.ak_fld instanceof eg) {
									int var11 = var0.xp(var2, var7, var8) - var0.xp(var2, var3, var4);
									eg var12 = (eg)var10.ak_fld;
									eg.zd(var1, var12, (var7 - var3) * 128, var11, (var8 - var4) * 128, true);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean mt(int var1, int var2, int var3, int var4) {
		if (!this.dj_boolean(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.mh(var5 + 1, this.cv_fld[var1][var2][var3] - var4, var6 + 1)
				&& this.mh(var5 + 128 - 1, this.cv_fld[var1][var2 + 1][var3] - var4, var6 + 1)
				&& this.mh(var5 + 128 - 1, this.cv_fld[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
				&& this.mh(var5 + 1, this.cv_fld[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("getOverrideSaturation")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Export("getOverrideSaturation")
	@Override
	public byte getOverrideSaturation() {
		return this.bm_fld.az_fld;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ma(int var1, int var2, int var3, int var4) {
		if (!this.dj_boolean(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.mh(var5 + 1, this.cv_fld[var1][var2][var3] - var4, var6 + 1)
				&& this.mh(var5 + 128 - 1, this.cv_fld[var1][var2 + 1][var3] - var4, var6 + 1)
				&& this.mh(var5 + 128 - 1, this.cv_fld[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
				&& this.mh(var5 + 1, this.cv_fld[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILem;IJI)Z"
	)
	public boolean fr(int var1, int var2, int var3, int var4, int var5, int var6, em var7, int var8, long var9, int var11) {
		try {
			if (var7 == null) {
				return true;
			} else {
				int var12 = var2 * 128 + 64 * var5;
				int var13 = var3 * 128 + 64 * var6;
				return jh(this, var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(Lfw;ZZ)V"
	)
	void ds(fw var1, boolean var2, boolean var3) {
		try {
			this.dh_fld += 1046037205;
			this.bd_fld.ak(fc.ar_fld.au_fld);
			fc.ar_fld.au_fld.ak(this.bm_fld);
			if (var3) {
				this.de_fld = !var2 && this.dn_fld != er.ak_fld ? this.eb_fld : this.dw_fld;
				this.df_fld = !var2 && this.dn_fld != er.ak_fld ? this.ec_fld : this.cc_fld;
				if (this.aj_fld) {
					this.bn_fld = this.de_fld - this.ds_fld;
					if (this.bn_fld < 0) {
						this.bn_fld = 0;
					}

					this.cr_fld = this.df_fld - this.ds_fld;
					if (this.cr_fld < 0) {
						this.cr_fld = 0;
					}

					this.dz_fld = this.de_fld + this.ds_fld;
					if (this.dz_fld > this.dv_fld) {
						this.dz_fld = this.dv_fld;
					}

					this.bg_fld = this.df_fld + this.ds_fld;
					if (this.bg_fld > this.dk_fld) {
						this.bg_fld = this.dk_fld;
					}
				} else {
					this.bn_fld = 0;
					this.cr_fld = 0;
					this.dz_fld = this.dv_fld;
					this.bg_fld = this.dk_fld;
					this.de_fld = this.dv_fld / 2;
					this.df_fld = this.dk_fld / 2;
					this.ds_fld = Math.max(this.de_fld, this.df_fld);
				}

				this.cx_fld = this.dw_fld - this.de_fld;
				this.ca_fld = this.cc_fld - this.df_fld;
				if (this.aj_fld) {
					this.di();
				}
			}

			if (fc.ar_fld.al_fld == 0) {
				eq(this, var1, this.aj_fld);
			} else {
				this.db(var1, this.aj_fld);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void mj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		uy var15 = kv.ak();
		ul var16 = uv.ak();
		uz.lv(var16.ak_fld, of.ak(var1), 0.0F, 0.0F, -1769051314);
		tu.fh(var16.ag_fld, var4, var5, var6, (byte)-12);
		ul var17 = uv.ak();
		tu.fh(var17.ag_fld, -(this.dv_fld * 64) - this.eq_fld, this.ux_fld, -(this.dk_fld * 471006537) - this.pm_fld, (byte)73);
		uy var18 = kv.ak();
		var18.ax(var17);
		var15.am(1.0F, this.bi_fld, 1.0F, 1.0F);
		uy.es(var18, var15, -1780601725);
		uy.es(var18, this.bo_fld, -1395729692);
		var15.ax(var16);
		uy.es(var18, var15, -657777670);
		var15.as(var18);
		var15.aw();
		this.du_fld = (int)var15.ab(var7, var8, var9);
		this.do_fld = (int)uy.xc(var15, var7, var8, var9, 1082803709);
		this.co_fld = (int)var15.at(var7, var8, var9);
		this.dw_fld = this.du_fld / 128;
		this.cc_fld = this.co_fld / 682993848;
		this.eb_fld = (int)var15.ab(var12, 0.0F, var13) / 128;
		this.ec_fld = (int)var15.at(var12, 0.0F, var13) / 128;
		uc var19 = new uc();
		uy var20 = kv.ak();
		var19.ag(of.ak(-var2));
		var19.az(of.ak(-var3));
		uc.in(var19, var7, var8, var9, -405011595);
		uy.wf(var20, var19, 2106238112);
		var20.aw();
		ul.hd(var16, (byte)-22);
		ul.hd(var17, (byte)-88);
		var15.aq();
		uy.es(var18, var20, -958037546);
		ey var21 = new ey(var18);
		var21.as(var10);
		ej.bk_fld = false;
		this.lg(var21, var14, fc.ar_fld.al_fld != 1);
		ej.bk_fld = false;
		var20.aq();
		var18.aq();
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void lp(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		uy var15 = kv.ak();
		ul var16 = uv.ak();
		uz.lv(var16.ak_fld, of.ak(var1), 0.0F, 0.0F, -551539559);
		tu.fh(var16.ag_fld, var4, var5, var6, (byte)12);
		ul var17 = uv.ak();
		tu.fh(var17.ag_fld, -(this.dv_fld * -979250146) - this.eq_fld, this.ux_fld, -(this.dk_fld * -1773465042) - this.pm_fld, (byte)42);
		uy var18 = kv.ak();
		var18.ax(var17);
		var15.am(1.0F, this.bi_fld, 1.0F, 1.0F);
		uy.es(var18, var15, -1853163267);
		uy.es(var18, this.bo_fld, -764499054);
		var15.ax(var16);
		uy.es(var18, var15, -1178862971);
		var15.as(var18);
		var15.aw();
		this.du_fld = (int)var15.ab(var7, var8, var9);
		this.do_fld = (int)uy.xc(var15, var7, var8, var9, 1082803709);
		this.co_fld = (int)var15.at(var7, var8, var9);
		this.dw_fld = this.du_fld / 2018427147;
		this.cc_fld = this.co_fld / -1724321723;
		this.eb_fld = (int)var15.ab(var12, 0.0F, var13) / 128;
		this.ec_fld = (int)var15.at(var12, 0.0F, var13) / 128;
		uc var19 = new uc();
		uy var20 = kv.ak();
		var19.ag(of.ak(-var2));
		var19.az(of.ak(-var3));
		uc.in(var19, var7, var8, var9, -405011595);
		uy.wf(var20, var19, 20573955);
		var20.aw();
		ul.hd(var16, (byte)-2);
		ul.hd(var17, (byte)-59);
		var15.aq();
		uy.es(var18, var20, -960636401);
		ey var21 = new ey(var18);
		var21.as(var10);
		ej.bk_fld = false;
		this.lg(var21, var14, fc.ar_fld.al_fld != 1);
		ej.bk_fld = false;
		var20.aq();
		var18.aq();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void at(int var1, int var2) {
		int var3 = var1 - this.oe_fld;
		int var4 = var2 - this.by_fld;
		this.zq(this.fm(0, var1, var2), this.hs_fld);

		for (int var5 = 0; var5 < 3; var5++) {
			int var6 = this.fe(var5, var1, var2);
			this.er(var6 + this.zc_fld, var6);
			if (this.hz(var6)) {
				byte var7 = this.fm_fld[var6];

				for (int var8 = 0; var8 < var7; var8++) {
					fj var9 = this.sd_fld[var6 * 5 + var8];
					long var10 = var9.az_fld;
					int var12 = (int)(var10 >> 16 & 7L);
					if (var12 == 2 && var9.ax_fld == var3 && var9.af_fld == var4) {
						var9.au_fld = (var9.af_fld * 888822967 - 1) * -1102364409;
					}
				}

				fs var15 = this.xv_fld[var6];
				if (var15 != null) {
					var15.hl_fld--;
				}

				ef var16 = this.gk_fld[var6];
				if (var16 != null) {
					var16.nj_fld--;
				}

				fv var17 = this.pu_Arrfv[var6];
				if (var17 != null) {
					var17.pj_fld--;
				}
			}
		}

		int var13 = this.fm(0, var1, var2);
		if (!this.gp(var13)) {
			this.ga(var13, 0, var1, var2);
		}

		if (this.ky_fld[0][var1][var2] == null) {
			this.vo_fld[0][var1][var2] = new rl10(this, var13);
			this.lt(0, var1, var2);
		}

		this.fy_fld[var13] = this.fy_fld[var13] | 32;
		int var14 = this.bz(3, var1, var2);
		this.ge(this.ph_fld, var14);
		this.pg_fld[var14] = this.pg_fld[var14] & -2;
		this.al(this.td_fld);
		this.vo_fld[3][var1][var2] = null;
		this.hf(3, var2, var2);
		this.ky_fld[0][var1][var2].ru_fld = new rl10(this, var14);
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean sm(int var1, int var2) {
		return this.dz(var1, var2);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JI)V"
	)
	public void bd(int var1, int var2, int var3, int var4, em var5, long var6, int var8) {
		try {
			int var9 = var2 + this.eu_int;
			int var10 = var3 + this.pm_fld;
			if (var5 != null) {
				int var11 = this.fh(var1, var9, var10);
				ef var12 = new ef();
				var12.ap(var5);
				var12.wi(var2 * 128 + 64);
				var12.jk(var3 * 128 + 64);
				var12.hk(var4);
				var12.rp(var6);
				var12.jk(var8);
				rl10 var13 = this.ky_fld[var1][var9][var10];
				if (var13 == null) {
					this.vo_fld[var1][var9][var10] = var13 = new rl10(this, var11);
					this.bi(var1, var9, var10);
				}

				if (!this.gp(var11)) {
					this.fx(var11, var1, var9, var10);
				}

				if (!pu_boolean && this.gk_fld[var11] != null) {
					throw new AssertionError();
				}

				this.gk_fld[var11] = var12;
				this.fy_fld[var11] = this.fy_fld[var11] | 2048;
				this.sp_fld[var11] = this.sp_fld[var11] | 1080863910568919040L;
				if (var5 instanceof dz) {
					rl17 var14 = this.rx_fld[var9 >> 3][var10 >> 3];
					var14.ol_fld.add(var12);
					this.mo((dz)var5);
				}

				this.to(var5, 0, var12.getY(), var12.wy(), var12.getPlane(), var2, var3);
				var12.nj_fld = var1;
				if (this.mf_boolean) {
					GroundObjectSpawned var19 = new GroundObjectSpawned();
					var19.setTile(var13);
					var19.setGroundObject(var12);
					og.ci_fld.getCallbacks().post(var19);
				}

				if (this.mf_boolean && client.bt_fld != null) {
					client.bt_fld.invalidateZone(this, var9 >> 3, var10 >> 3);
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long cc(int var1, int var2, int var3) {
		var2 += this.ba_fld;
		var3 += this.um_fld;
		int var4 = this.xp(var1, var2, var3);
		return this.dv(var4) && this.pu_Arrfv[var4] != null ? this.pu_Arrfv[var4].az_fld * 7130385936274174641L : 0L;
	}

	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int we(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lev;[IIIII)V"
	)
	public static void an(ev var0, int[] var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.dp_fld = var1;
		var0.es_fld = var2;
		var0.bu_fld = var3;
		var0.cq_fld = var4;
		var0.cg_fld = var5;
		var0.cn_fld = 0;
		var0.cb_fld = 0;
		var0.eo_fld = var4;
		var0.cd_fld = var5;
		var0.cy_fld = var4 / 2;
		var0.dt_fld = var5 / 2;
		var0.et_fld.set(0, var0.et_fld.size());
		var0.ex_fld.set(0, var0.ex_fld.size());
	}

	@ObfuscatedName("getOverlayIds")
	@ObfuscatedSignature(
		descriptor = "()[[[S"
	)
	@Export("getOverlayIds")
	@Override
	public short[][][] getOverlayIds() {
		return this.fl_fld;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	public static void jj(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		ev var7 = hk.mt_fld.az_fld;
		int var8 = var1 + var7.qr_fld;
		int var9 = var2 + var7.qr_fld;
		if (var5 == 2) {
			fj var10 = var7.gc(var0, var1, var2);
			if (var10 != null && var10.ak_fld instanceof dz && !((dz)var10.ak_fld).gt()) {
				return;
			}
		} else if (var5 == 3) {
			ef var11 = var7.tk(var0, var1, var2);
			if (var11 != null && var11.ak_fld instanceof dz && !((dz)var11.ak_fld).gt()) {
				return;
			}
		}

		if (client.bt_fld != null) {
			client.bt_fld.invalidateZone(var7, var8 >> 3, var9 >> 3);
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILem;IJI)Z"
	)
	public boolean bh(int var1, int var2, int var3, int var4, int var5, int var6, em var7, int var8, long var9, int var11) {
		try {
			if (var7 == null) {
				return true;
			} else {
				int var12 = var2 * 128 + 64 * var5;
				int var13 = var3 * 128 + 64 * var6;
				return jh(this, var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	void bp(fj var1) {
		for (int var2 = var1.ae_fld * 1511530387; var2 <= var1.ag_fld; var2++) {
			int var3 = var2 + this.um_fld;

			for (int var4 = var1.ah_fld * -462437065; var4 <= var1.au_fld; var4++) {
				int var5 = var4 + this.bx_fld;
				int var6 = this.bz(var1.ay_fld * 888822967, var3, var5);
				if (this.gp(var6)) {
					byte var7 = this.fm_fld[var6];

					for (int var8 = 0; var8 < var7; var8++) {
						fj var9 = this.sd_fld[var6 * 5 + var8];
						if (var9 == var1) {
							var7 = --this.kq_Arrbyte[var6];

							for (int var10 = var8; var10 < var7; var10++) {
								this.sd_fld[var6 * 5 + var10] = this.sd_fld[var6 * 5 + var10 + 1];
								this.pc_fld[var6 * 5 + var10] = this.fm_fld[var6 * 5 + var10 + 1];
							}

							this.sd_fld[var6 * 5 + var7] = null;
							break;
						}
					}

					this.pg_fld[var6] = this.pg_fld[var6] & -129;
					this.fm_fld[var6] = 0;

					for (int var12 = 0; var12 < this.kq_Arrbyte[var6]; var12++) {
						this.pc_fld[var6] = (byte)(this.pc_fld[var6] | this.pc_fld[var6 * 5 + var12]);
					}
				}
			}
		}

		this.nr(var1);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean dv(int var1) {
		return (this.pg_fld[var1] & 2) != 0;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIJI)V"
	)
	public void if_(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, long var9, int var11) {
		try {
			int var12 = var2 + this.qr_fld;
			int var13 = var3 + this.ba_fld;
			if (var5 != null || var6 != null) {
				int var14 = this.fe(var1, var12, var13);
				fs var15 = new fs();
				var15.hb(var9);
				var15.pc(var11);
				var15.ie(var2 * 128 + 64);
				var15.pc(var3 * 128 + 64);
				var15.ly(var4);
				var15.sq(var5);
				var15.ga(var6);
				var15.pc(var7);
				var15.ie(var8);

				for (int var16 = var1; var16 >= 0; var16--) {
					int var17 = this.dj(var16, var12, var13);
					if (!this.hz(var17)) {
						this.ka(var17, var16, var12, var13);
					}

					if (this.ky_fld[var16][var12][var13] == null) {
						this.vo_fld[var16][var12][var13] = new rl10(this, var17);
						this.qn(var16, var12, var13);
					}
				}

				if (!pu_boolean && this.xv_fld[var14] != null) {
					throw new AssertionError();
				}

				this.xv_fld[var14] = var15;
				this.pg_fld[var14] = this.pg_fld[var14] | 16384;
				this.sp_fld[var14] = this.sp_fld[var14] | 1080863910568919040L;
				if (var5 instanceof dz || var6 instanceof dz) {
					rl17 var22 = this.rx_fld[var12 >> 3][var13 >> 3];
					var22.ol_fld.add(var15);
					this.mo((dz)var5);
					this.mo((dz)var6);
				}

				this.to(var5, 0, var15.vy(), var15.getConfig(), var15.getOrientationB(), var2, var3);
				this.to(var6, 0, var15.getPlane(), var15.getX(), var15.vy(), var2, var3);
				var15.hl_fld = var1;
				if (this.mf_boolean) {
					WallObjectSpawned var23 = new WallObjectSpawned();
					var23.setTile(this.vo_fld[var1][var12][var13]);
					var23.setWallObject(var15);
					og.ci_fld.getCallbacks().post(var23);
				}

				if (this.mf_boolean && client.bt_fld != null) {
					client.bt_fld.invalidateZone(this, var12 >> 3, var13 >> 3);
				}
			}
		} catch (Throwable var21) {
			throw new RuntimeException(var21);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)I"
	)
	public static int ch(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		return (var0.cv_fld[var1][var2][var3] + var0.cv_fld[var1][var2 + 1][var3] + var0.cv_fld[var1][var2][var3 + 1] + var0.cv_fld[var1][var2 + 1][var3 + 1]) / 4;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bv(int var1, int var2, int var3, int var4) {
		var2 += this.tj_fld;
		var3 += this.tj_fld;
		int var5 = this.fh(var1, var2, var3);
		if (this.dv(var5)) {
			fv var6 = this.pu_Arrfv[var5];
			if (var6 != null) {
				if (var6.ar_fld * -704799827 != 0) {
					var6.af_fld = (var6.au_fld * -704799827 < 0 ? -var4 : var4) * -422936539;
				}

				if (var6.av_fld * 56412047 != 0) {
					var6.av_fld = (var6.as_fld * 56412047 < 0 ? -var4 : var4) * -455182481;
				}
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bu(int var1, int var2, int var3) {
		if (var2 >= 0 && var2 < this.cz_fld && var3 >= 0 && var3 < this.ca_fld) {
			int var4 = this.fe(var1, var2, var3);
			if (this.gp(var4)) {
				this.cg(var4);
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)Lfs;"
	)
	public fs ba(int var1, int var2, int var3) {
		return zr(this, var1, var2, var3);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void cs(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.eo_fld; var4++) {
			for (int var5 = 0; var5 < this.ds_fld; var5++) {
				for (int var6 = 0; var6 < this.cn_fld; var6++) {
					int var7 = this.fm(var4, var5, var6);
					if (this.dv(var7)) {
						fs var8 = this.xv_fld[var7];
						if (var8 != null && var8.ag_fld instanceof eg) {
							eg var9 = (eg)var8.ag_fld;
							this.ij(var9, var4, var5, var6, 1, 1);
							if (var8.ag_fld instanceof ModelData) {
								eg var10 = (eg)var8.ak_fld;
								this.ij(var10, var4, var5, var6, 1, 1);
								eg.zd(var9, var10, 0, 0, 0, false);
								var8.ak_fld = var10.light(var10.bh_fld, var10.bs_fld, var1, var2, var3);
							}

							var8.ag_fld = var9.light(var9.bh_fld, var9.bh_fld, var1, var2, var3);
						}

						byte var13 = this.fm_fld[var7];

						for (int var14 = 0; var14 < var13; var14++) {
							fj var11 = this.sd_fld[var7 * 5 + var14];
							if (var11 != null && var11.ak_fld instanceof eg) {
								eg var12 = (eg)var11.ak_fld;
								this.ij(var12, var4, var5, var6, var11.al_fld - var11.ax_fld + 1, var11.ag_fld - var11.au_fld + 1);
								var11.ak_fld = var12.light(var12.bs_fld, var12.bs_fld, var1, var2, var3);
							}
						}

						ef var15 = this.gk_fld[var7];
						if (var15 != null && var15.ak_fld instanceof eg) {
							eg var16 = (eg)var15.ak_fld;
							this.ya(var16, var4, var5, var6);
							var15.ak_fld = var16.light(var16.bh_fld, var16.bh_fld, var1, var2, var3);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Leg;III)V"
	)
	void cp(eg var1, int var2, int var3, int var4) {
		int var5 = var3 + 1;
		int var6 = var4 + 1;

		for (int var7 = var3; var7 <= var5; var7++) {
			if (var7 >= 0 && var7 < this.dh_fld) {
				for (int var8 = var4 - 1; var8 <= var6; var8++) {
					if (var8 >= 0 && var8 < this.dt_fld && (var7 >= var5 || var8 >= var6)) {
						int var9 = this.fm(var2, var7, var8);
						if (this.dv(var9)) {
							ef var10 = this.gk_fld[var9];
							if (var10 != null && var10.ak_fld instanceof eg) {
								int var11 = this.bz(var2, var7, var8) - this.fe(var2, var3, var4);
								eg var12 = (eg)var10.ak_fld;
								eg.zd(var1, var12, (var7 - var3) * 128, var11, (var8 - var4) * 128, true);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void dv(int var1, int var2) {
		if (!pu_boolean && (var2 & 15) != var2) {
			throw new AssertionError();
		} else {
			this.fy_fld[var1] = this.fy_fld[var1] & -983041;
			this.pg_fld[var1] = this.pg_fld[var1] | var2 << 16;
		}
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lrl17;)Z"
	)
	public boolean wo(fw var1, rl17 var2) {
		int var3 = var2.zb_fld;
		int var4 = var2.bj_fld;
		int var5 = ((var3 << 3) - this.qr_fld << 7) + (var2.pu_fld + var2.nl_fld) / 2;
		int var6 = (var2.nu_fld + var2.im_fld) / 2;
		int var7 = ((var4 << 3) - this.qr_fld << 7) + (var2.af_fld + var2.yv_fld) / 2;
		int var8 = (var2.nl_fld - var2.pu_fld + 1) / 2;
		int var9 = (var2.nu_fld - var2.im_fld + 1) / 2;
		int var10 = (var2.yv_fld - var2.af_fld + 1) / 2;
		return client.fq(var1, 0, 0, 0, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ox(int var1, int var2, int var3) {
		if (var3 == this.fb_fld.ae_fld * -457350413 && !og.ci_fld.isMenuOpen()) {
			this.bx_fld = var1;
			this.um_fld = var2;
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean jw(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.bz_fld + var3 * this.bj_fld + var4 * this.br_fld + var5);
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Leg;IIIII)V"
	)
	public void ij(eg var1, int var2, int var3, int var4, int var5, int var6) {
		this.im(var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean cu(int var1, int var2, int var3, int var4, boolean var5) {
		return this.cj(this.ew_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cv() {
		this.fb_fld = null;

		for (int var1 = 0; var1 < this.dv_fld >> 3; var1++) {
			for (int var2 = 0; var2 < this.dk_fld >> 3; var2++) {
				rl17 var3 = this.rx_fld[var1][var2];

				for (int var4 = 0; var4 < 4; var4++) {
					int var5 = this.dj(var4, var1, var2);
					fs var6 = this.xv_fld[var5];
					if (var6 != null) {
						var6.az_fld = -1L;
						var6.ak_fld = var6.ag_fld = null;
					}

					fv var7 = this.pu_Arrfv[var5];
					if (var7 != null) {
						var7.az_fld = -1L;
						var7.ak_fld = var7.ag_fld = null;
					}

					ef var8 = this.gk_fld[var5];
					if (var8 != null) {
						var8.ag_fld = -1L;
						var8.ak_fld = null;
					}

					for (int var9 = 0; var9 < this.pc_fld[var5]; var9++) {
						fj var10 = this.sd_fld[var5 * 5 + var9];
						var10.az_fld = -1L;
						var10.ak_fld = null;
					}
				}

				Iterator var11 = var3.ol_fld.iterator();

				while (var11.hasNext()) {
					TileObject var12 = (TileObject)(TileObject)var11.next();
					if (var12 instanceof fj) {
						fj var13 = (fj)var12;
						dz var17 = (dz)var13.ak_fld;
						if (!pu_boolean && var17.vc_fld != this) {
							throw new AssertionError();
						}

						var17.vc_fld = null;
					} else if (var12 instanceof ef) {
						ef var14 = (ef)var12;
						dz var18 = (dz)var14.ak_fld;
						if (!pu_boolean && var18.vc_fld != this) {
							throw new AssertionError();
						}

						var18.vc_fld = null;
					} else if (var12 instanceof fs) {
						fs var15 = (fs)var12;
						if (var15.ak_fld instanceof dz) {
							dz var19 = (dz)var15.ak_fld;
							if (!pu_boolean && var19.vc_fld != this) {
								throw new AssertionError();
							}

							var19.vc_fld = null;
						}

						if (var15.ag_fld instanceof dz) {
							dz var20 = (dz)var15.ag_fld;
							if (!pu_boolean && var20.vc_fld != this) {
								throw new AssertionError();
							}

							var20.vc_fld = null;
						}
					} else if (var12 instanceof fv) {
						fv var16 = (fv)var12;
						if (var16.ak_fld instanceof dz) {
							dz var21 = (dz)var16.ak_fld;
							if (!pu_boolean && var21.vc_fld != this) {
								throw new AssertionError();
							}

							var21.vc_fld = null;
						}

						if (var16.ag_fld instanceof dz) {
							dz var22 = (dz)var16.ag_fld;
							if (!pu_boolean && var22.vc_fld != this) {
								throw new AssertionError();
							}

							var22.vc_fld = null;
						}
					}
				}
			}
		}

		this.zo();
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean ct(int var1, int var2, int var3, int var4, boolean var5) {
		return this.iw(this.ew_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfw;Z)V"
	)
	public static void eq(ev var0, fw var1, boolean var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.dx_fld = 0;

			for (int var3 = var0.cu_fld; var3 < var0.cf_fld; var3++) {
				ei[][] var4 = var0.bl_fld[var3];

				for (int var5 = var0.bn_fld; var5 < var0.dz_fld; var5++) {
					for (int var6 = var0.cr_fld; var6 < var0.bg_fld; var6++) {
						ei var7 = var4[var5][var6];
						if (var7 != null
							&& var7.ad_fld <= var0.bw_fld
							&& (
								!var2
									|| var0.dz(var5 - var0.dw_fld + var0.cx_fld + var0.ds_fld, var6 - var0.cc_fld + var0.ca_fld + var0.ds_fld)
									|| var0.cv_fld[var3][var5][var6] - var0.do_fld >= 2000
							)) {
							var0.dw(var1, var7);
						}
					}
				}
			}

			var0.dr();
			fc.ar_fld.au_fld.ak(var0.bd_fld);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void ta(boolean var1) {
		cf(this, var1);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	boolean dp(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 == var3 && var4 == var5) {
			if (!this.dn(var1, var2, var4)) {
				return false;
			} else {
				int var13 = var2 << 7;
				int var15 = var4 << 7;
				return this.dn(var13 + 1, this.cs_fld[var1][var2][var4] - var6, var15 + 1)
					&& this.mh(var13 + 128 - 1, this.cv_fld[var1][var2 + 1][var4] - var6, var15 + 1)
					&& this.dn(var13 + 128 - 1, this.cs_fld[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
					&& this.dn(var13 + 1, this.cs_fld[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
			}
		} else {
			for (int var7 = var2; var7 <= var3; var7++) {
				for (int var8 = var4; var8 <= var5; var8++) {
					if (this.cs_fld[var1][var7][var8] == -this.bg_fld) {
						return false;
					}
				}
			}

			int var12 = (var2 << 7) + 1;
			int var14 = (var4 << 7) + 2;
			int var9 = this.cv_fld[var1][var2][var4] - var6;
			if (!this.dj_boolean(var12, var9, var14)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.mh(var10, var9, var14)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					return !this.mh(var12, var9, var11) ? false : this.mh(var10, var9, var11);
				}
			}
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean df(int var1, int var2, int var3, int var4) {
		if (!this.mh(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.cv_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.dg_fld) {
						if (!this.mh(var5, var7, var6)) {
							return false;
						}

						if (!this.dn(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj_boolean(var5, var8, var6)) {
							return false;
						}

						if (!this.dj_boolean(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.mh(var5, var9, var6)) {
						return false;
					}

					if (!this.dn(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.dz_fld) {
						if (!this.dj_boolean(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.dn(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dn(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.dn(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dn(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.dj_boolean(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.do_fld) {
						if (!this.dj_boolean(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.dn(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.mh(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dn(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.dj_boolean(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.dj_fld) {
						if (!this.mh(var5, var7, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj_boolean(var5, var8, var6)) {
							return false;
						}

						if (!this.mh(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.dj_boolean(var5, var9, var6)) {
						return false;
					}

					if (!this.dn(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.dn(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.dj_boolean(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.dj_boolean(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.mh(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? this.mh(var5, var9, var6) : true;
			}
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(IIIIILem;IJZ)V"
	)
	public void ot(int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, boolean var10) {
		try {
			this.bj(var1, var2, var3, var4, var5, var6, var7, var8, var10);
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILem;IZJI)Z"
	)
	boolean by(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, em var9, int var10, boolean var11, long var12, int var14) {
		for (int var15 = var2; var15 < var2 + var4; var15++) {
			for (int var16 = var3; var16 < var3 + var5; var16++) {
				if (var15 < 0 || var16 < 0 || var15 >= this.dw_fld || var16 >= this.cq_fld) {
					return false;
				}

				ei var17 = this.bl_fld[var1][var15][var16];
				if (var17 != null && var17.ay_fld >= 5) {
					return false;
				}
			}
		}

		fj var21 = new fj();
		var21.az_fld = var12;
		var21.ax_fld = var14;
		var21.as_fld = var1 * -1102364409;
		var21.al_fld = var6 * -1366216317;
		var21.ah_fld = var7 * -1033266613;
		var21.ag_fld = var8 * -270823847;
		var21.ak_fld = var9;
		var21.ay_fld = var10 * 1695772435;
		var21.ag_fld = var2 * 855692955;
		var21.aw_fld = var3 * 1189675143;
		var21.au_fld = (var2 + var4 - 1) * -214654169;
		var21.ax_fld = (var3 + var5 - 1) * -1474830849;

		for (int var22 = var2; var22 < var2 + var4; var22++) {
			for (int var23 = var3; var23 < var3 + var5; var23++) {
				int var18 = 0;
				if (var22 > var2) {
					var18++;
				}

				if (var22 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var23 > var3) {
					var18 += 8;
				}

				if (var23 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; var19--) {
					if (this.bl_fld[var19][var22][var23] == null) {
						this.bl_fld[var19][var22][var23] = new ei(var19, var22, var23);
					}
				}

				ei var24 = this.bl_fld[var1][var22][var23];
				if (var11) {
					this.gh(var24);
				}

				var24.aw_fld[var24.as_fld * -260411347] = var21;
				var24.aq_fld[var24.ac_fld * -260411347] = var18;
				var24.ah_fld = (var24.ac_fld | var18) * -705834675;
				var24.al_fld = var24.af_fld + 728326053;
			}
		}

		return true;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lev;Z)V"
	)
	public static void cf(ev var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!jh.qi(var0) || var1) {
			var0.dc_fld = true;
			var0.bq_fld = var1;
			var0.bv_fld = -1;
			var0.wi_fld = -1;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)Lfv;"
	)
	public fv bq(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 == null ? null : var4.aa_fld;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean dc(int var1, int var2, int var3, int var4) {
		return this.de(var1, var2, var3, var4);
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;Lrl17;)V"
	)
	public void ht(fw var1, fw var2, rl17 var3) {
		try {
			if (!var3.xi_fld.isEmpty()) {
				rl16.uz_fld = var1;
				var3.xi_fld.sort(jz_fld);

				for (int var4 = 0; var4 < var3.xi_fld.size(); var4++) {
					fj var5 = (fj)(fj)var3.xi_fld.get(var4);
					if (!(var5.ak_fld instanceof ev)) {
						em var6 = var5.ak_fld;

						fn var7;
						try {
							var7 = var6 instanceof fn ? (fn)var6 : var6.getModel();
							if (var7 == null) {
								continue;
							}
						} catch (Exception var10) {
							client.logger.debug("exception drawing game entity", (Throwable)var10);
							continue;
						}

						if (var7 != var6) {
							var6.setModelHeight(var7.getModelHeight());
						}

						int var8 = var6.getAnimationHeightOffset();
						client.bt_fld.drawTemp(var1, this, var5, var7, var5.ag_fld, var5.ah_fld, var5.ae_fld - var8, var5.aw_fld);
						client.tu(var1, var2, var7, var5.ag_fld, var5.ah_fld, var5.ae_fld - var8, var5.aw_fld, var5.az_fld);
					}
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public void fo(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		eh var9 = new eh();
		var9.as_fld = var3 / 128 * 1910341793;
		var9.ah_fld = var4 / 128 * -756904905;
		var9.ai_fld = var5 / 128 * -14885874;
		var9.af_fld = var6 / 128 * -533939309;
		var9.ae_fld = var2;
		var9.ae_fld = var3 * -1433563909;
		var9.as_fld = var4 * 1545529577;
		var9.ax_fld = var5 * -396330112;
		var9.au_fld = var6 * -1864950081;
		var9.aa_fld = var7 * -1894193487;
		var9.ai_fld = var8 * -695168559;
		this.dq_fld[var1][this.dp_fld[var1]++] = var9;
	}

	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void zo() {
		this.ab();
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int pi(int var1) {
		int var2 = var1 >> this.zc_fld & 3;
		return (this.pg_fld[var1] & 64) != 0 ? 0 : var2;
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void na() {
		boolean var1 = this.mf_int != 0 && this.aj_fld;
		if (var1) {
			this.nk_fld.clear();
			cv var2 = og.ci_fld.getLocalPlayer();
			if (var2 != null && (this.mf_int & 1) != 0) {
				LocalPoint var3 = var2.getLocalLocation();
				if (var3.isInScene()) {
					int var4 = this.eu_ArrArrArrint[this.fb_fld.ae_fld * -457350413][var3.getSceneX() + this.qr_fld][var3.getSceneY() + this.qr_fld];
					this.lw(var4);
				}
			}

			if (this.bx_fld >= this.oe_fld && this.bx_fld < this.tj_fld && this.um_fld >= this.by_fld && this.um_fld < this.ba_fld && (this.mf_int & 2) != 0) {
				int var15 = this.eu_ArrArrArrint[this.fb_fld.ae_fld * -457350413][this.bx_fld + this.qr_fld][this.um_fld + this.qr_fld];
				this.lw(var15);
			}

			LocalPoint var16 = og.ci_fld.getLocalDestinationLocation();
			if (var16 != null && var16.isInScene() && (this.mf_int & 4) != 0) {
				int var17 = this.eu_ArrArrArrint[this.fb_fld.ae_fld * -457350413][var16.getSceneX() + this.qr_fld][var16.getSceneY() + this.qr_fld];
				this.lw(var17);
			}

			if (og.ci_fld.getCameraPitch() < 310 && (this.mf_int & 8) != 0 && var2 != null) {
				int var18 = var2.jv_int() >> 7;
				int var5 = var2.gg() >> 7;
				int var6 = og.ci_fld.getCameraX() >> 7;
				int var7 = og.ci_fld.getCameraY() >> 7;
				if (var18 >= this.oe_fld
					&& var5 >= this.by_fld
					&& var6 >= this.oe_fld
					&& var7 >= this.by_fld
					&& var18 < this.tj_fld
					&& var5 < this.ba_fld
					&& var6 < this.tj_fld
					&& var7 < this.ba_fld) {
					int var8 = Math.abs(var18 - var6);
					int var9 = Integer.compare(var18, var6);
					int var10 = -Math.abs(var5 - var7);
					int var11 = Integer.compare(var5, var7);
					int var12 = var8 + var10;

					while (var6 != var18 || var7 != var5) {
						if (this.ds(this.fb_fld.ae_fld * -457350413, var6 + this.qr_fld, var7 + this.qr_fld)) {
							int var14 = this.eu_ArrArrArrint[this.fb_fld.ae_fld * -457350413][var6 + this.qr_fld][var7 + this.qr_fld];
							this.lw(var14);
						}

						int var13 = 2 * var12;
						if (var13 >= var10) {
							var12 += var10;
							var6 += var9;
						} else {
							var12 += var8;
							var7 += var11;
						}
					}
				}
			}

			this.nk_fld.remove(0);
		}
	}

	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int rk(int var1) {
		return this.pg_fld[var1] >> 16 & 15;
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void fn(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		int var11 = var2 + this.oe_fld;
		int var12 = var3 + this.bp_fld;
		en var13 = new en();
		var13.ah_fld = var5;
		var13.ak_fld = (var2 * 128 + 64) * 522729925;
		var13.az_fld = var3 * 128 + 64;
		var13.ay_fld = var4 * -1670039403;
		var13.aw_fld = var6;
		var13.ah_fld = var8;
		var13.av_fld = var9;
		var13.ak_fld = var10 * -1900192417;
		var13.oq(var1);
		int var14 = this.fh(var1, var11, var12);
		if (!this.dv(var14)) {
			this.bv(var14, var1, var11, var12);
		}

		if (this.ky_fld[var1][var11][var12] == null) {
			this.ky_fld[var1][var11][var12] = new rl10(this, var14);
			this.km_void(var1, var11, var12);
		}

		rl17 var15 = this.rx_fld[var11 >> 3][var12 >> 3];
		if ((this.fy_fld[var14] & 12288) != 0) {
			var15.ol_fld.remove(this.oy_fld[var14]);
		}

		this.oy_fld[var14] = var13;
		this.fy_fld[var14] = this.fy_fld[var14] & -12289;
		this.pg_fld[var14] = this.pg_fld[var14] | (var10 != 0 ? 8192 : 4096);
		var15.ol_fld.add(var13);
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	public void nr(fj var1) {
		int var2 = (int)(var1.az_fld >> 16 & 7L);
		if (var2 == 2) {
			if (!pu_boolean && var1.getRenderable() instanceof da) {
				throw new AssertionError();
			} else if (!pu_boolean && var1.getRenderable() instanceof bc) {
				throw new AssertionError();
			} else if (!pu_boolean && var1.getRenderable() instanceof bt) {
				throw new AssertionError();
			} else if (!pu_boolean && var1.getRenderable() instanceof ev) {
				throw new AssertionError();
			} else if (!pu_boolean && var1.getRenderable() instanceof rq) {
				throw new AssertionError();
			} else {
				int var3 = var1.ay_fld + this.qr_fld;
				int var4 = var1.ar_fld + this.qr_fld;
				int var5 = var1.getPlane();
				client.logger.trace("Game object despawn: {}", var1.getId());
				if (var1.ak_fld instanceof dz) {
					rl17 var6 = this.rx_fld[var3 >> 3][var4 >> 3];
					var6.ol_fld.remove(var1);
				}

				if (this.wy_fld) {
					GameObjectDespawned var7 = new GameObjectDespawned();
					var7.setTile(this.vo_fld[var5][var3][var4]);
					var7.setGameObject(var1);
					og.ci_fld.getCallbacks().post(var7);
				}

				if (this.wy_fld && client.bt_fld != null) {
					client.bt_fld.invalidateZone(this, var3 >> 3, var4 >> 3);
				}
			}
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	void gs(fj var1) {
		int var2 = (int)(var1.az_fld >> 16 & 7L);
		if (var2 == 2) {
			if (!pu_boolean && var1.getRenderable() instanceof da) {
				throw new AssertionError();
			} else if (!pu_boolean && var1.getRenderable() instanceof bc) {
				throw new AssertionError();
			} else if (!pu_boolean && var1.getRenderable() instanceof bt) {
				throw new AssertionError();
			} else if (!pu_boolean && var1.getRenderable() instanceof ev) {
				throw new AssertionError();
			} else if (!pu_boolean && var1.getRenderable() instanceof rq) {
				throw new AssertionError();
			} else {
				int var3 = var1.ah_fld + this.oe_fld;
				int var4 = var1.af_fld + this.qr_fld;
				int var5 = var1.getConfig();
				client.logger.trace("Game object despawn: {}", var1.getPlane());
				if (var1.ak_fld instanceof dz) {
					rl17 var6 = this.rx_fld[var3 >> 3][var4 >> 3];
					var6.xi_fld.remove(var1);
				}

				if (this.wy_fld) {
					GameObjectDespawned var7 = new GameObjectDespawned();
					var7.setTile(this.ky_fld[var5][var3][var4]);
					var7.setGameObject(var1);
					og.ci_fld.getCallbacks().post(var7);
				}

				if (this.wy_fld && client.bt_fld != null) {
					client.bt_fld.invalidateZone(this, var3 >> 3, var4 >> 3);
				}
			}
		}
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lem;IIIIJ)V"
	)
	public void oa(fw var1, em var2, int var3, int var4, int var5, int var6, long var7) {
		try {
			var1.lf(var2, var3, var4, var5, var6, var7);
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIIIIIIII)V"
	)
	public void kw(
		int var1,
		int var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20
	) {
		this.bm(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void gf(int var1, int var2, int var3, int var4) {
		ei var5 = this.bl_fld[var1][var2][var3];
		if (var5 != null) {
			fv var6 = var5.aa_fld;
			if (var6 != null) {
				if (var6.av_fld * -704799827 != 0) {
					var6.ar_fld = (var6.ar_fld * -704799827 < 0 ? -var4 : var4) * -422936539;
				}

				if (var6.au_fld * 56412047 != 0) {
					var6.ay_fld = (var6.ae_fld * 56412047 < 0 ? -var4 : var4) * -455182481;
				}
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIILem;JLem;Lem;I)V"
	)
	public static void kn(ev var0, int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		if (var0 == null) {
			var0.getClass();
		}

		int var11 = var2 + var0.qr_fld;
		int var12 = var3 + var0.qr_fld;
		en var13 = new en();
		var13.ah_fld = var5;
		var13.ag_fld = var2 * 128 + 64;
		var13.az_fld = var3 * 128 + 64;
		var13.ak_fld = var4;
		var13.aw_fld = var6;
		var13.av_fld = var8;
		var13.ae_fld = var9;
		var13.ay_fld = var10;
		var13.oq(var1);
		int var14 = var0.dj(var1, var11, var12);
		if (!var0.hz(var14)) {
			var0.sv(var14, var1, var11, var12);
		}

		if (var0.vo_fld[var1][var11][var12] == null) {
			var0.vo_fld[var1][var11][var12] = new rl10(var0, var14);
			var0.lg(var1, var11, var12);
		}

		rl17 var15 = var0.rx_fld[var11 >> 3][var12 >> 3];
		if ((var0.pg_fld[var14] & 12288) != 0) {
			var15.ol_fld.remove(var0.oy_fld[var14]);
		}

		var0.oy_fld[var14] = var13;
		var0.pg_fld[var14] = var0.pg_fld[var14] & -12289;
		var0.pg_fld[var14] = var0.pg_fld[var14] | (var10 != 0 ? 8192 : 4096);
		var15.ol_fld.add(var13);
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(III)Lfv;"
	)
	public fv hd(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 == null ? null : var4.aa_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bc(int var1, int var2, int var3) {
		var2 += this.pm_fld;
		var3 += this.pm_fld;
		int var4 = this.fh(var1, var2, var3);
		if (this.hz(var4) && (this.fy_fld[var4] & 2048) != 0) {
			ef var5 = this.gk_fld[var4];
			this.gk_fld[var4] = null;
			this.fy_fld[var4] = this.fy_fld[var4] & -2049;
			if (var5.ak_fld instanceof dz) {
				rl17 var6 = this.rx_fld[var2 >> 3][var3 >> 3];
				var6.ol_fld.remove(var5);
			}

			if (this.mf_boolean) {
				GroundObjectDespawned var9 = new GroundObjectDespawned();
				var9.setTile(this.ky_fld[var1][var2][var3]);
				var9.setGroundObject(var5);
				og.ci_fld.getCallbacks().post(var9);
			}

			if (this.wy_fld && client.bt_fld != null) {
				client.bt_fld.invalidateZone(this, var2 >> 3, var3 >> 3);
			}
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfj;"
	)
	public static fj ob(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)V"
	)
	public static void hr(ev var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cu_fld = var1;

		for (int var2 = 0; var2 < var0.dv_fld; var2++) {
			for (int var3 = 0; var3 < var0.dk_fld; var3++) {
				if (var0.bl_fld[var1][var2][var3] == null) {
					var0.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int ip(int var1, int var2, int var3) {
		return (this.cs_fld[var1][var2][var3] + this.cs_fld[var1][var2 + 1][var3] + this.cs_fld[var1][var2][var3 + 1] + this.cv_fld[var1][var2 + 1][var3 + 1]) / 4;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	public void ca(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		var5 += this.mf_int;
		var6 += this.qr_fld;
		int var7 = this.fm(var4, var5, var6);
		if (this.dv(var7)) {
			int var8 = this.pg_fld[var7];
			if ((var8 & 256) != 0) {
				fa var9 = this.of_fld[var7];
				int var10 = var9.ak_fld * 1993988699;
				if (var10 != 0) {
					for (int var11 = 0; var11 < 4; var11++) {
						var1[var2] = var10;
						var1[var2 + 1] = var10;
						var1[var2 + 2] = var10;
						var1[var2 + 3] = var10;
						var2 += var3;
					}
				}
			} else if ((var8 & 1024) != 0) {
				fl var20 = this.lh_fld[var7];
				if (var20 != null) {
					int var21 = var20.ab_fld;
					int var22 = var20.ab_fld;
					int var12 = var20.ap_fld;
					int var13 = var20.ap_fld;
					int[] var14 = da_fld[var21];
					int[] var15 = da_fld[var22];
					int var16 = 0;
					if (var12 != 0) {
						for (int var17 = 0; var17 < 4; var17++) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (int var29 = 0; var29 < 4; var29++) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bw(int var1, int var2, int var3) {
		this.cf_fld = var1;
		this.di_fld = var2;
		this.ds_fld = var3;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void dq(boolean var1) {
		cf(this, var1);
	}

	@ObfuscatedName("buildRoofs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("buildRoofs")
	@Override
	public void buildRoofs() {
		this.eu_ArrArrArrint = new int[this.cf_fld][this.dv_fld][this.dk_fld];
		int var1 = 1;
		this.up_java_util_Map = new HashMap();
		Set[] var2 = new Set[]{new HashSet(), new HashSet(), new HashSet()};

		for (int var3 = this.cf_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.dk_fld; var4++) {
				for (int var5 = 0; var5 < this.dv_fld; var5++) {
					rl10 var6 = this.vo_fld[var3][var5][var4];
					if (var6 != null && this.eu_ArrArrArrint[var3][var5][var4] == 0 && this.ds(var3, var5, var4)) {
						this.ru(var6, var1++, var2);
					}
				}
			}
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void du(fw var1, boolean var2) {
		try {
			this.dh_fld = 0;

			for (int var3 = this.cw_fld; var3 < this.bg_fld; var3++) {
				ei[][] var4 = this.bl_fld[var3];

				for (int var5 = this.cg_fld; var5 < this.db_fld; var5++) {
					for (int var6 = this.cc_fld; var6 < this.eb_fld; var6++) {
						ei var7 = var4[var5][var6];
						if (var7 != null
							&& var7.ad_fld <= this.eq_fld
							&& (
								!var2
									|| this.kl(var5 - this.di_fld + this.cq_fld + this.cw_fld, var6 - this.bu_fld + this.dt_fld + this.bu_fld)
									|| this.cs_fld[var3][var5][var6] - this.du_fld >= 2000
							)) {
							this.lj(var1, var7);
						}
					}
				}
			}

			this.kx();
			fc.ar_fld.au_fld.ae(this.bd_fld);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void em(int var1) {
		this.pg_fld[var1] = 0;
		this.of_fld[var1] = null;
		this.lh_fld[var1] = null;
		this.xv_fld[var1] = null;
		this.pu_Arrfv[var1] = null;
		this.gk_fld[var1] = null;
		this.oy_fld[var1] = null;
		this.pc_fld[var1] = 0;

		for (int var2 = 0; var2 < 5; var2++) {
			this.sd_fld[var1 * 5 + var2] = null;
			this.fm_fld[var1 * 5 + var2] = 0;
		}

		this.kq_Arrbyte[var1] = 0;
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Ldz;)V"
	)
	public void mo(dz var1) {
		try {
			if (var1 != null) {
				var1.hv();
				if (var1.kc_fld > -1 && this.ej_fld != null) {
					this.ej_fld.set(var1.kc_fld);
				}

				if (var1.gt()) {
					var1.fy_fld = true;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;Lrl17;)V"
	)
	public void du(fw var1, fw var2, rl17 var3) {
		try {
			if (this.wo(var1, var3)) {
				int var4 = var3.zb_fld;
				int var5 = var3.bj_fld;

				for (int var6 = this.cu_fld; var6 < this.cf_fld; var6++) {
					for (int var7 = var4 << 3; var7 < var4 + 1 << 3; var7++) {
						for (int var8 = var5 << 3; var8 < var5 + 1 << 3; var8++) {
							int var9 = this.dj(var6, var7, var8);
							if (this.hz(var9)) {
								int var10 = var9 >> this.ph_fld & this.sz_fld;
								int var11 = var9 & this.up_int;
								int var12 = var9 >> this.zc_fld & 3;
								int var13 = this.pg_fld[var9];
								int var14 = this.df(var9);
								int var15 = this.pi(var9);
								int var16 = var10 - this.qr_fld;
								int var17 = var11 - this.qr_fld;
								if (var15 <= this.bw_fld) {
									if ((var13 & 32) != 0) {
										int var18 = this.dj(3, var10, var11);
										int var19 = this.pg_fld[var18];
										if ((var19 & 256) != 0) {
											var1.io(this, this.of_fld[var18], 0, 0, var16, var17);
										} else if ((var19 & 1024) != 0) {
											var1.xo(this, this.lh_fld[var18], 0, var16, var17);
										}
									}

									if ((var13 & 256) != 0) {
										if ((var13 & 512) != 0 || var12 <= this.db_fld) {
											fa var22 = this.of_fld[var9];
											var1.io(this, var22, var15, var14, var16, var17);
										}
									} else if ((var13 & 1024) != 0) {
										var1.xo(this, this.lh_fld[var9], var15, var16, var17);
									}

									if ((var13 & 2048) != 0) {
										ef var23 = this.gk_fld[var9];
										this.fq(var1, var2, var23.ak_fld, 0, var23.ae_fld, var23.av_fld, var23.ah_fld, var23.ag_fld);
									}

									if ((var13 & 16384) != 0) {
										fs var24 = this.xv_fld[var9];
										this.fq(var1, var2, var24.ak_fld, 0, var24.ae_fld, var24.av_fld, var24.ah_fld, var24.az_fld);
										this.fq(var1, var2, var24.ag_fld, 0, var24.ae_fld, var24.av_fld, var24.ah_fld, var24.az_fld);
									}

									if ((var13 & 32768) != 0) {
										fv var25 = this.pu_Arrfv[var9];
										this.fq(var1, var2, var25.ak_fld, 0, var25.ae_fld + var25.as_fld, var25.av_fld, var25.ah_fld + var25.ar_fld, var25.az_fld);
										this.fq(var1, var2, var25.ag_fld, 0, var25.ae_fld + var25.af_fld, var25.av_fld, var25.ah_fld + var25.al_fld, var25.az_fld);
									}

									for (int var26 = 0; var26 < this.pc_fld[var9]; var26++) {
										fj var27 = this.sd_fld[var9 * 5 + var26];
										if (var27.au_fld != this.dh_fld) {
											var27.au_fld = this.dh_fld;
											this.fq(var1, var2, var27.ak_fld, var27.ag_fld, var27.ah_fld, var27.ae_fld, var27.aw_fld, var27.az_fld);
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var21) {
			throw new RuntimeException(var21);
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ic(int var1) {
		int var2 = (var1 << 1) + 1;
		var2 = this.fy_fld[var2];
		var2 <<= 1;
		int var5 = var1 << 1;
		this.fy_fld[var2] = this.fy_fld[var5];
		var2 = var1 << 1;
		var2 = this.fy_fld[var2];
		var2 = (var2 << 1) + 1;
		int var9 = (var1 << 1) + 1;
		this.fy_fld[var2] = this.fy_fld[var9];
		var2 = var1 << 1;
		int var11 = (var1 << 1) + 1;
		this.fy_fld[var2] = this.fy_fld[var11] = this.hs_fld;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)Z"
	)
	public static boolean dz(ev var0, int var1, int var2) {
		if (!var0.co(var0.cp_fld, var0.dj_fld, var1, var2)) {
			return var0.ck(var0.cp_fld, var0.dj_fld, var1, var2);
		} else {
			hb.xu(var0, var0.cp_fld, var0.dj_fld, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; var4++) {
				for (int var5 = -1; var5 <= 1; var5++) {
					if (var0.dt(var0.cp_fld, var0.dj_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (var0.dt(var0.cp_fld, (var0.dj_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (var0.dt(var0.cp_fld + 1, var0.dj_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (var0.dt(var0.cp_fld + 1, (var0.dj_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return var0.cb(var0.cp_fld, var0.dj_fld, var1, var2, var3);
		}
	}

	@ObfuscatedName("removeGameObject")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/GameObject;)V"
	)
	@Export("removeGameObject")
	@Override
	public void removeGameObject(GameObject var1) {
		qp(this, (fj)var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void br(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.av_fld = var5;
		var11.az_fld = var2 * -500082803 + -1213858179;
		var11.ag_fld = var3 * -68472369 + 1375606873;
		var11.az_fld = var4 * 139491910;
		var11.aw_fld = var6;
		var11.av_fld = var8;
		var11.ae_fld = var9;
		var11.az_fld = var10 * 336885059;
		if (this.bl_fld[var1][var2][var3] == null) {
			this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		this.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ku(int var1, int var2, int var3, int var4) {
		return this.ig(var1, var2, var3, var4);
	}

	@ObfuscatedName("getOverrideHue")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Export("getOverrideHue")
	@Override
	public byte getOverrideHue() {
		return this.bm_fld.ag_fld;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean gp(int var1) {
		return (this.pg_fld[var1] & 4) != 0;
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIZ)Z"
	)
	public static boolean mu(ev var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.cj(var0.ew_fld, var1, var2, var3, var4, var5);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dl() {
		return this.bq_fld && this.by_fld != -1;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void do_(int var1, int var2, int var3) {
		this.de_fld = var1;
		this.bn_fld = var2;
		this.bg_fld = var3;
	}
}
