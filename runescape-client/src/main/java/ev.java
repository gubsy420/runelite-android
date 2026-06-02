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
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int rm_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ad_fld = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ha_fld;
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
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bh_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "Lrl18;"
	)
	public rl18 kb_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld = Math.min(128, 1);
	@ObfuscatedName("ze")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ze_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld = Math.max(383, 520);
	@ObfuscatedName("xc")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] xc_ArrArrArrbyte;
	@ObfuscatedGetter(
		intValue = 3
	)
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int sy_fld;
	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ul_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
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
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int du_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] an_fld = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] vj_fld;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] of_fld;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean sv_fld;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	public long[] fl_fld;
	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int zc_fld;
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
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bp_fld;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] ib_fld;
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
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dj_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aj_fld;
	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ts_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	public fy bm_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bn_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cq_fld;
	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	public BitSet ju_fld;
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float mu_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[Leh;"
	)
	eh[] bb_fld;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int uj_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int be_fld;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bg_fld;
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
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float uv_fld;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int oq_fld;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int rl_fld;
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
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int by_fld;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] mp_fld;
	@ObfuscatedGetter(
		intValue = 1046037205
	)
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ce_fld;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ec_fld;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	public Map gr_fld;
	@ObfuscatedName("zy")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	public fw zy_fld;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean dc_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ca_fld;
	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	public short[][][] yb_fld;
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	public short[][][] rz_ArrArrArrshort;
	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int jq_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bt_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public uy bo_fld;
	@ObfuscatedName("yr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int yr_fld;
	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int nd_fld;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "[Len;"
	)
	public en[] ee_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float bi_fld;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int vn_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bu_fld;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	BitSet ex_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float bc_fld;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "[Lfv;"
	)
	public fv[] ow_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cd_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ba_fld;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bq_fld;
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int vg_fld;
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int me_fld;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int eo_fld;
	@ObfuscatedGetter(
		intValue = -1124760005
	)
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bx_fld;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "[[[Lrl10;"
	)
	public rl10[][][] in_ArrArrArrrl10;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int es_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cc_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bs_fld;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	int[][][] cs_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cf_fld;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	int[][][] cv_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "[[[Lei;"
	)
	public ei[][][] bl_fld;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "[Lef;"
	)
	public ef[] kg_fld;
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] wf_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	public ey pw_fld;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "[[[Lrl10;"
	)
	public rl10[][][] iy_fld;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cn_fld;
	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int lo_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cr_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bz_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cg_fld;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "[Lrl17;"
	)
	public rl17[] ek_fld;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cw_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cx_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cy_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cm_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cz_fld;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ck_fld;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] pl_fld = new int[184];
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float cj_fld;
	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int jh_fld;
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "[[Lrl17;"
	)
	public rl17[][] tb_fld;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int hl_fld;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int co_fld;
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	public fj[] vh_fld;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cu_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ds_fld;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ch_fld;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float td_float;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ct_fld;
	@ObfuscatedGetter(
		intValue = -525480395
	)
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int po_fld;
	@ObfuscatedName("xc")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Set;"
	)
	public Set xc_java_util_Set;
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
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dh_fld;
	@ObfuscatedName("xl")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] xl_fld;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dv_fld;
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "[Lfa;"
	)
	public fa[] oy_fld;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dz_fld;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dt_fld;
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
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int do_fld;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	fn dd_fld;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na dl_fld;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] dp_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	fy bd_fld;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] pr_fld;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean hg_boolean;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cp_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int td_int;
	@ObfuscatedName("xv")
	@ObfuscatedSignature(
		descriptor = "Lrl16;"
	)
	public static rl16 xv_fld = new rl16();
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "[Lfs;"
	)
	public fs[] rs_fld;
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
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cb_fld;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int db_fld;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dg_fld;
	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int jo_fld;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dw_fld;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int di_fld;
	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Deque;"
	)
	public static Deque uz_fld = new ArrayDeque();
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dx_fld;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] in_Arrbyte;
	// $VF: synthetic field
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean qd_fld = !ev.class.desiredAssertionStatus();
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	er dn_fld;
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float um_fld;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int df_fld;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int de_fld;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "[Lfl;"
	)
	public fl[] fr_fld;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] dm_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bv_fld;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float sj_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bw_fld;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ep_fld;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int eb_fld;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	BitSet ed_fld;
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ks_fld;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	BitSet et_fld;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	public dx fj_fld;
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] rz_Arrint = new int[184];
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
	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] la_fld;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dk_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int br_fld;

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean jb(int var1, int var2, int var3, int var4, boolean var5) {
		return this.it(this.et_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)J"
	)
	public static long uc(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var2 += var0.jh_fld;
			var3 += var0.jh_fld;
			int var4 = var0.ra(var1, var2, var3);
			return var0.mx(var4) && var0.ow_fld[var4] != null ? var0.ow_fld[var4].az_fld * 7130385936274174641L : 0L;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILfn;)V"
	)
	public void ag(int var1, fn var2) {
		this.do_fld = var1;
		this.dd_fld = var2;
	}

	@ObfuscatedName("setMinLevel")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setMinLevel(int var1) {
		this.cf_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ah() {
		this.do_fld = -1;
		this.dd_fld = null;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dx(int var1) {
		this.by_fld = var1;
		this.bu_fld = -1;
		this.bn_fld = -1;
		this.bc_fld = -1.0F;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int as() {
		return ay_fld;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ka(int var1, int var2, int var3, int var4) {
		return this.ci(this.ew_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void jp(int var1, int var2) {
		if (var1 < 0) {
			var1 = 0;
		}

		this.eo_fld = var1;
		this.ec_fld = var2;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean mx(int var1) {
		return (this.wf_fld[var1] & 1) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ab() {
		Arrays.fill(this.wf_fld, 0);
		Arrays.fill(this.oy_fld, null);
		Arrays.fill(this.fr_fld, null);
		Arrays.fill(this.rs_fld, null);
		Arrays.fill(this.ow_fld, null);
		Arrays.fill(this.kg_fld, null);
		Arrays.fill(this.ee_fld, null);
		Arrays.fill(this.vh_fld, null);
		Arrays.fill(this.ib_fld, (byte)0);
		Arrays.fill(this.cl_fld, null);

		for (int var1 = 0; var1 < this.cc_fld >> 3; var1++) {
			for (int var2 = 0; var2 < this.cq_fld >> 3; var2++) {
				rl17 var3 = this.tb_fld[var1][var2];
				var3.wu_fld.clear();
				var3.pn_fld.clear();
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void at(int var1, int var2) {
		int var3 = var1 - this.jh_fld;
		int var4 = var2 - this.jh_fld;
		this.kx(this.ra(0, var1, var2), this.ts_fld);

		for (int var5 = 0; var5 < 3; var5++) {
			int var6 = this.ra(var5, var1, var2);
			this.kx(var6 + this.sy_fld, var6);
			if (this.mx(var6)) {
				byte var7 = this.ib_fld[var6];

				for (int var8 = 0; var8 < var7; var8++) {
					fj var9 = this.vh_fld[var6 * 5 + var8];
					long var10 = var9.az_fld;
					int var12 = (int)(var10 >> 16 & 7L);
					if (var12 == 2 && var9.ay_fld == var3 && var9.ar_fld == var4) {
						var9.av_fld = var9.av_fld * 888822967 - 1;
					}
				}

				fs var15 = this.rs_fld[var6];
				if (var15 != null) {
					var15.nc_fld--;
				}

				ef var16 = this.kg_fld[var6];
				if (var16 != null) {
					var16.rh_fld--;
				}

				fv var17 = this.ow_fld[var6];
				if (var17 != null) {
					var17.sy_fld--;
				}
			}
		}

		int var13 = this.ra(0, var1, var2);
		if (!this.mx(var13)) {
			this.ir(var13, 0, var1, var2);
		}

		if (this.iy_fld[0][var1][var2] == null) {
			this.iy_fld[0][var1][var2] = new rl10(this, var13);
			this.nd(0, var1, var2);
		}

		this.wf_fld[var13] = this.wf_fld[var13] | 32;
		int var14 = this.ra(3, var1, var2);
		this.kx(this.ts_fld, var14);
		this.wf_fld[var14] = this.wf_fld[var14] & -2;
		this.ma(this.ts_fld);
		this.iy_fld[3][var1][var2] = null;
		this.nd(3, var2, var2);
		this.iy_fld[0][var1][var2].gx_fld = new rl10(this, var14);
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lev;Ljava/util/BitSet;IIII)Z"
	)
	public static boolean jw(ev var0, BitSet var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1.get(var2 * var0.bk_fld + var3 * var0.bj_fld + var4 * var0.bf_fld + var5);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ap(int var1) {
		this.bl_fld = null;
		this.dy_fld = null;
		this.setMinLevel(var1);

		for (int var2 = 0; var2 < this.cc_fld; var2++) {
			for (int var3 = 0; var3 < this.cq_fld; var3++) {
				int var4 = this.ra(var1, var2, var3);
				if (!this.mx(var4)) {
					this.ir(var4, var1, var2, var3);
				}

				if (this.iy_fld[var1][var2][var3] == null) {
					this.iy_fld[var1][var2][var3] = new rl10(this, var4);
					this.nd(var1, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(III)Lef;"
	)
	public ef gc(int var1, int var2, int var3) {
		return oy(this, var1, var2, var3);
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ZZ)V"
	)
	public void hh(boolean var1, boolean var2) {
		this.ce_fld += 1046037205;
		this.bd_fld.ug(fc.ar_fld.au_fld);
		fc.ar_fld.au_fld.ug(this.bm_fld);
		if (var1) {
			DrawCallbacks var3 = client.fa_fld;
			if (var3 != null && this.aj_fld) {
				gc.aa_fld = 0;
				var3.drawScene(this.mu_fld, this.sj_fld, this.td_float, this.uv_fld, this.um_fld, this.bx_fld);
			}

			int var4 = og.ci_fld.isGpu() ? vg_fld : this.di_fld;
			int var5 = !var2 && this.dn_fld != er.ak_fld ? this.ck_fld : this.cm_fld;
			int var6 = !var2 && this.dn_fld != er.ak_fld ? this.cb_fld : this.cz_fld;
			if (this.aj_fld) {
				this.cn_fld = Math.max(var5 - var4, this.oq_fld + this.jh_fld);
				this.ca_fld = Math.max(var6 - var4, this.zc_fld + this.jh_fld);
				this.cr_fld = Math.min(var5 + var4, this.rm_fld + this.jh_fld);
				this.cg_fld = Math.min(var6 + var4, this.jq_fld + this.jh_fld);
			} else {
				this.cn_fld = 0;
				this.ca_fld = 0;
				this.cr_fld = this.cc_fld;
				this.cg_fld = this.cq_fld;
				var5 = this.cc_fld / 2;
				var6 = this.cq_fld / 2;
				this.di_fld = Math.max(var5, var6);
			}

			this.df_fld = this.cm_fld - var5;
			this.de_fld = this.cz_fld - var6;
			this.cp_fld = 0;
			this.jc();
			boolean var7 = og.ci_fld.isMenuOpen();
			if (!var7) {
				this.ks_fld = this.oq_fld;
				this.td_int = this.zc_fld;
			}

			if ((client.jb_fld & 16) != 0) {
				boolean var8 = this.hl_fld != 0 && this.aj_fld;
				int var9 = var8 ? this.cd_fld - 1 : this.bx_fld;
				client.fa_fld
					.preSceneDraw(
						this, this.mu_fld, this.sj_fld, this.td_float, this.uv_fld, this.um_fld, this.cf_fld, this.fj_fld.ae_fld * -457350413, var9, this.xc_java_util_Set
					);
			}
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ch(int var1, int var2, int var3, int var4) {
		if (!this.df(var1, var2, var3, var4)) {
			return ml.hi(this, var1, var2, var3, var4);
		} else {
			og(this, var1, var2, var3, var4, false);
			int var5 = var1 * 32 + ay_fld;
			int var6 = var2 * 64;
			int var7 = (var3 - this.di_fld - this.df_fld - 1) * 128;
			int var8 = (var4 - this.di_fld - this.de_fld - 1) * 128;

			for (int var9 = -this.dj_fld; var9 <= this.es_fld; var9 += 128) {
				if (ry(this, var7, this.dm_fld[var1] + var9, var8, var5, var6)) {
					return this.ct(var1, var2, var3, var4, true);
				}
			}

			return this.ct(var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JI)V"
	)
	public void fc(int var1, int var2, int var3, int var4, em var5, long var6, int var8) {
		try {
			yo(this, var1, var2, var3, var4, var5, var6, var8);
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIIIIIJI)V"
	)
	public void bs(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13, int var15) {
		try {
			int var16 = var2 + this.jh_fld;
			int var17 = var3 + this.jh_fld;
			if (var5 != null) {
				int var18 = this.ra(var1, var16, var17);
				fv var19 = new fv();
				var19.tc(var13);
				var19.rd(var15);
				var19.so(var2 * 128 + 64);
				var19.er(var3 * 128 + 64);
				var19.oy(var4);
				var19.uq(var5);
				var19.ht(var6);
				var19.my(var7);
				var19.it(var8);
				var19.as_fld = var9;
				var19.ar_fld = var10;
				var19.af_fld = var11;
				var19.al_fld = var12;

				for (int var20 = var1; var20 >= 0; var20--) {
					int var21 = this.ra(var20, var16, var17);
					if (!this.mx(var21)) {
						this.ir(var21, var20, var16, var17);
					}

					if (this.iy_fld[var20][var16][var17] == null) {
						this.iy_fld[var20][var16][var17] = new rl10(this, var21);
						this.nd(var20, var16, var17);
					}
				}

				if (!qd_fld && this.ow_fld[var18] != null) {
					throw new AssertionError();
				}

				this.ow_fld[var18] = var19;
				this.wf_fld[var18] = this.wf_fld[var18] | 32768;
				var19.sy_fld = var1;
				if (var5 instanceof dz || var6 instanceof dz) {
					rl17 var24 = this.tb_fld[var16 >> 3][var17 >> 3];
					var24.wu_fld.add(var19);
					this.lp((dz)var5);
					this.lp((dz)var6);
				}

				this.pd(var5, 0, var19.getX(), var19.getZ(), var19.getY(), var2, var3);
				this.pd(var6, 0, var19.getX(), var19.getZ(), var19.getY(), var2, var3);
				if (this.sv_fld) {
					DecorativeObjectSpawned var25 = new DecorativeObjectSpawned();
					var25.setTile(this.iy_fld[var1][var16][var17]);
					var25.setDecorativeObject(var19);
					og.ci_fld.getCallbacks().post(var25);
				}

				if (this.sv_fld && client.fa_fld != null) {
					client.fa_fld.invalidateZone(this, var16 >> 3, var17 >> 3);
				}
			}
		} catch (Throwable var23) {
			throw new RuntimeException(var23);
		}
	}

	@ObfuscatedName("zs")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIII)Z"
	)
	public static boolean zs(ev var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var2 == var3 && var4 == var5) {
			if (!var0.dn(var1, var2, var4)) {
				return false;
			} else {
				int var13 = var2 << 7;
				int var15 = var4 << 7;
				return var0.dj(var13 + 1, var0.cs_fld[var1][var2][var4] - var6, var15 + 1)
					&& var0.dj(var13 + 128 - 1, var0.cs_fld[var1][var2 + 1][var4] - var6, var15 + 1)
					&& var0.dj(var13 + 128 - 1, var0.cs_fld[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
					&& var0.dj(var13 + 1, var0.cs_fld[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
			}
		} else {
			for (int var7 = var2; var7 <= var3; var7++) {
				for (int var8 = var4; var8 <= var5; var8++) {
					if (var0.cv_fld[var1][var7][var8] == -var0.ce_fld) {
						return false;
					}
				}
			}

			int var12 = (var2 << 7) + 1;
			int var14 = (var4 << 7) + 2;
			int var9 = var0.cs_fld[var1][var2][var4] - var6;
			if (!var0.dj(var12, var9, var14)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!var0.dj(var10, var9, var14)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					return !var0.dj(var12, var9, var11) ? false : var0.dj(var10, var9, var11);
				}
			}
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
				return this.by(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
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
				return this.tr(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;Lrl17;)V"
	)
	public void nt(fw var1, fw var2, rl17 var3) {
		try {
			if (!var3.pn_fld.isEmpty()) {
				rl16.jy_fld = var1;
				var3.pn_fld.sort(xv_fld);

				for (int var4 = 0; var4 < var3.pn_fld.size(); var4++) {
					fj var5 = (fj)(fj)var3.pn_fld.get(var4);
					if (!(var5.ak_fld instanceof ev)) {
						em var6 = var5.ak_fld;

						fn var7;
						try {
							var7 = var6 instanceof fn ? (fn)var6 : var6.getModel();
							if (var7 == null) {
								continue;
							}
						} catch (Exception var10) {
							client.ii_fld.debug("exception drawing game entity", (Throwable)var10);
							continue;
						}

						if (var7 != var6) {
							var6.setModelHeight(var7.getModelHeight());
						}

						int var8 = var6.getAnimationHeightOffset();
						client.fa_fld.drawTemp(var1, this, var5, var7, var5.ag_fld, var5.ah_fld, var5.ae_fld - var8, var5.aw_fld);
						client.iz(var1, var2, var7, var5.ag_fld, var5.ah_fld, var5.ae_fld - var8, var5.aw_fld, var5.az_fld);
					}
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gy(int var1) {
		boolean var2 = this.xc_java_util_Set.add(var1);
		if (var2 && (client.jb_fld & 16) != 0 && this.gr_fld != null) {
			int[] var3 = (int[])this.gr_fld.get(var1);
			if (var3 != null) {
				for (int var7 : var3) {
					this.gy(var7);
				}
			}
		}
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean qc(int var1) {
		return (this.wf_fld[var1] & 4) != 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIIILem;IJIIII)Z"
	)
	public boolean bf(int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		try {
			return var6 == null ? true : this.by(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(III)Lfv;"
	)
	public fv hk(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 == null ? null : var4.aa_fld;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	public static void gc(ev var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var1 = 0; var1 < var0.tb_fld.length; var1++) {
				for (int var2 = 0; var2 < var0.tb_fld[var1].length; var2++) {
					rl17 var3 = var0.tb_fld[var1][var2];

					for (int var4 = 0; var4 < var3.pn_fld.size(); var4++) {
						fj var5 = (fj)(fj)var3.pn_fld.get(var4);
						var0.removeGameObject(var5);
						var5.ak_fld = null;
						uz_fld.addLast(var5);
					}

					var3.pn_fld.clear();
				}
			}
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void nd(int var1, int var2, int var3) {
		if (this.in_ArrArrArrrl10 != null) {
			int var4 = var2 - this.jh_fld;
			int var5 = var3 - this.jh_fld;
			if (var4 >= 0 && var4 < this.in_ArrArrArrrl10[var1].length && var5 >= 0 && var5 < this.in_ArrArrArrrl10[var1][var4].length) {
				this.in_ArrArrArrrl10[var1][var4][var5] = this.iy_fld[var1][var2][var3];
			}
		}
	}

	@ObfuscatedName("zf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	public static void zf(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		ev var7 = hk.mt_fld.az_fld;
		int var8 = var1 + var7.jh_fld;
		int var9 = var2 + var7.jh_fld;
		if (var5 == 2) {
			fj var10 = var7.hi(var0, var1, var2);
			if (var10 != null && var10.ak_fld instanceof dz && !((dz)var10.ak_fld).qc()) {
				return;
			}
		} else if (var5 == 3) {
			ef var11 = var7.gc(var0, var1, var2);
			if (var11 != null && var11.ak_fld instanceof dz && !((dz)var11.ak_fld).qc()) {
				return;
			}
		}

		if (client.fa_fld != null) {
			client.fa_fld.invalidateZone(var7, var8 >> 3, var9 >> 3);
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
			int var9 = (var2 >> 7) + this.jh_fld;
			int var10 = (var3 >> 7) + this.jh_fld;
			if (var9 >= 0 && var10 >= 0 && var9 < this.cc_fld && var10 < this.cq_fld) {
				fj var11 = (fj)(fj)uz_fld.pollLast();
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
				int var12 = this.ra(var1, var9, var10);
				if (!this.mx(var12)) {
					this.ir(var12, var1, var9, var10);
				}

				if (this.iy_fld[var1][var9][var10] == null) {
					this.iy_fld[var1][var9][var10] = new rl10(this, var12);
					this.nd(var1, var9, var10);
				}

				this.wf_fld[var12] = this.wf_fld[var12] | 128;
				rl17 var13 = this.tb_fld[var9 >> 3][var10 >> 3];
				var13.pn_fld.add(var11);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIII)V"
	)
	public void pd(em var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			fn var8 = null;
			int var9 = client.jb_fld >> 7 & 15;
			if (!(var1 instanceof dz) || !((dz)var1).ga_fld && var9 <= 0) {
				if (var1 instanceof fn) {
					var8 = (fn)var1;
				}
			} else {
				var8 = ((dz)var1).il();
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
				int var22 = var6 + this.jh_fld;
				int var23 = var7 + this.jh_fld;
				rl17 var24 = this.tb_fld[var22 >> 3][var23 >> 3];
				var24.yh_fld = Math.min(var24.yh_fld, var16);
				var24.su_fld = Math.min(var24.su_fld, var17);
				var24.ac_fld = Math.min(var24.ac_fld, var18);
				var24.qf_fld = Math.max(var24.qf_fld, var19);
				var24.lp_fld = Math.max(var24.lp_fld, var20);
				var24.el_fld = Math.max(var24.el_fld, var21);
			}
		} catch (Throwable var26) {
			throw new RuntimeException(var26);
		}
	}

	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int tx(int var1) {
		int var2 = var1 >> this.ha_fld & 3;
		return (this.wf_fld[var1] & 64) != 0 ? 0 : var2;
	}

	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void rz() {
		this.fj_fld = null;

		for (int var1 = 0; var1 < this.cc_fld >> 3; var1++) {
			for (int var2 = 0; var2 < this.cq_fld >> 3; var2++) {
				rl17 var3 = this.tb_fld[var1][var2];

				for (int var4 = 0; var4 < 4; var4++) {
					int var5 = this.ra(var4, var1, var2);
					fs var6 = this.rs_fld[var5];
					if (var6 != null) {
						var6.az_fld = -1L;
						var6.ak_fld = var6.ag_fld = null;
					}

					fv var7 = this.ow_fld[var5];
					if (var7 != null) {
						var7.az_fld = -1L;
						var7.ak_fld = var7.ag_fld = null;
					}

					ef var8 = this.kg_fld[var5];
					if (var8 != null) {
						var8.ag_fld = -1L;
						var8.ak_fld = null;
					}

					for (int var9 = 0; var9 < this.ib_fld[var5]; var9++) {
						fj var10 = this.vh_fld[var5 * 5 + var9];
						var10.az_fld = -1L;
						var10.ak_fld = null;
					}
				}

				Iterator var11 = var3.wu_fld.iterator();

				while (var11.hasNext()) {
					TileObject var12 = (TileObject)(TileObject)var11.next();
					if (var12 instanceof fj) {
						fj var13 = (fj)var12;
						dz var17 = (dz)var13.ak_fld;
						if (!qd_fld && var17.ja_fld != this) {
							throw new AssertionError();
						}

						var17.ja_fld = null;
					} else if (var12 instanceof ef) {
						ef var14 = (ef)var12;
						dz var18 = (dz)var14.ak_fld;
						if (!qd_fld && var18.ja_fld != this) {
							throw new AssertionError();
						}

						var18.ja_fld = null;
					} else if (var12 instanceof fs) {
						fs var15 = (fs)var12;
						if (var15.ak_fld instanceof dz) {
							dz var19 = (dz)var15.ak_fld;
							if (!qd_fld && var19.ja_fld != this) {
								throw new AssertionError();
							}

							var19.ja_fld = null;
						}

						if (var15.ag_fld instanceof dz) {
							dz var20 = (dz)var15.ag_fld;
							if (!qd_fld && var20.ja_fld != this) {
								throw new AssertionError();
							}

							var20.ja_fld = null;
						}
					} else if (var12 instanceof fv) {
						fv var16 = (fv)var12;
						if (var16.ak_fld instanceof dz) {
							dz var21 = (dz)var16.ak_fld;
							if (!qd_fld && var21.ja_fld != this) {
								throw new AssertionError();
							}

							var21.ja_fld = null;
						}

						if (var16.ag_fld instanceof dz) {
							dz var22 = (dz)var16.ag_fld;
							if (!qd_fld && var22.ja_fld != this) {
								throw new AssertionError();
							}

							var22.ja_fld = null;
						}
					}
				}
			}
		}

		this.gd();
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
				int var23 = this.ra(var22, var2, var3);
				if (this.iy_fld[var22][var2][var3] == null) {
					this.iy_fld[var22][var2][var3] = new rl10(this, var23);
					this.nd(var22, var2, var3);
				}

				if (!this.mx(var23)) {
					this.ir(var23, var22, var2, var3);
				}
			}

			int var26 = this.ra(var1, var2, var3);
			this.oy_fld[var26] = var21;
			this.wf_fld[var26] = this.wf_fld[var26] | 256 | (var21.az_fld != 12345678 ? 512 : 0);
		} else if (var4 != 1) {
			fl var24 = new fl(
				var4,
				var5,
				var6,
				var2 - this.jh_fld,
				var3 - this.jh_fld,
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
				int var31 = this.ra(var27, var2, var3);
				if (this.iy_fld[var27][var2][var3] == null) {
					this.iy_fld[var27][var2][var3] = new rl10(this, var31);
					this.nd(var27, var2, var3);
				}

				if (!this.mx(var31)) {
					this.ir(var31, var27, var2, var3);
				}
			}

			int var28 = this.ra(var1, var2, var3);
			this.fr_fld[var28] = var24;
			this.wf_fld[var28] = this.wf_fld[var28] | 1024;
		} else {
			fa var25 = new fa(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

			for (int var29 = var1; var29 >= 0; var29--) {
				int var32 = this.ra(var29, var2, var3);
				if (this.iy_fld[var29][var2][var3] == null) {
					this.iy_fld[var29][var2][var3] = new rl10(this, var32);
					this.nd(var29, var2, var3);
				}

				if (!this.mx(var32)) {
					this.ir(var32, var29, var2, var3);
				}
			}

			int var30 = this.ra(var1, var2, var3);
			this.oy_fld[var30] = var25;
			this.wf_fld[var30] = this.wf_fld[var30] | 256 | (var25.az_fld != 12345678 ? 512 : 0);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	void bp(fj var1) {
		for (int var2 = var1.ay_fld; var2 <= var1.as_fld; var2++) {
			int var3 = var2 + this.jh_fld;

			for (int var4 = var1.ar_fld; var4 <= var1.af_fld; var4++) {
				int var5 = var4 + this.jh_fld;
				int var6 = this.ra(var1.av_fld, var3, var5);
				if (this.mx(var6)) {
					byte var7 = this.ib_fld[var6];

					for (int var8 = 0; var8 < var7; var8++) {
						fj var9 = this.vh_fld[var6 * 5 + var8];
						if (var9 == var1) {
							var7 = --this.ib_fld[var6];

							for (int var10 = var8; var10 < var7; var10++) {
								this.vh_fld[var6 * 5 + var10] = this.vh_fld[var6 * 5 + var10 + 1];
								this.in_Arrbyte[var6 * 5 + var10] = this.in_Arrbyte[var6 * 5 + var10 + 1];
							}

							this.vh_fld[var6 * 5 + var7] = null;
							break;
						}
					}

					this.wf_fld[var6] = this.wf_fld[var6] & -129;
					this.vj_fld[var6] = 0;

					for (int var12 = 0; var12 < this.ib_fld[var6]; var12++) {
						this.vj_fld[var6] = (byte)(this.vj_fld[var6] | this.in_Arrbyte[var6 * 5 + var12]);
					}
				}
			}
		}

		this.an(var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIJI)V"
	)
	public void be(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, long var9, int var11) {
		try {
			int var12 = var2 + this.jh_fld;
			int var13 = var3 + this.jh_fld;
			if (var5 != null || var6 != null) {
				int var14 = this.ra(var1, var12, var13);
				fs var15 = new fs();
				var15.kb(var9);
				var15.uz(var11);
				var15.vg(var2 * 128 + 64);
				var15.na(var3 * 128 + 64);
				var15.fw(var4);
				var15.fk(var5);
				var15.zn(var6);
				var15.eq(var7);
				var15.av(var8);

				for (int var16 = var1; var16 >= 0; var16--) {
					int var17 = this.ra(var16, var12, var13);
					if (!this.mx(var17)) {
						this.ir(var17, var16, var12, var13);
					}

					if (this.iy_fld[var16][var12][var13] == null) {
						this.iy_fld[var16][var12][var13] = new rl10(this, var17);
						this.nd(var16, var12, var13);
					}
				}

				if (!qd_fld && this.rs_fld[var14] != null) {
					throw new AssertionError();
				}

				this.rs_fld[var14] = var15;
				this.wf_fld[var14] = this.wf_fld[var14] | 16384;
				this.fl_fld[var14] = this.fl_fld[var14] | 1080863910568919040L;
				if (var5 instanceof dz || var6 instanceof dz) {
					rl17 var22 = this.tb_fld[var12 >> 3][var13 >> 3];
					var22.wu_fld.add(var15);
					this.lp((dz)var5);
					this.lp((dz)var6);
				}

				this.pd(var5, 0, var15.getX(), var15.getZ(), var15.getY(), var2, var3);
				this.pd(var6, 0, var15.getX(), var15.getZ(), var15.getY(), var2, var3);
				var15.nc_fld = var1;
				if (this.sv_fld) {
					WallObjectSpawned var23 = new WallObjectSpawned();
					var23.setTile(this.iy_fld[var1][var12][var13]);
					var23.setWallObject(var15);
					og.ci_fld.getCallbacks().post(var23);
				}

				if (this.sv_fld && client.fa_fld != null) {
					client.fa_fld.invalidateZone(this, var12 >> 3, var13 >> 3);
				}
			}
		} catch (Throwable var21) {
			throw new RuntimeException(var21);
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bn(int var1, int var2, int var3) {
		int var4 = var2 + this.jh_fld;
		int var5 = var3 + this.jh_fld;
		int var6 = this.ra(var1, var4, var5);
		if (this.mx(var6)) {
			byte var7 = this.ib_fld[var6];

			for (int var8 = 0; var8 < var7; var8++) {
				fj var9 = this.vh_fld[var6 * 5 + var8];
				long var10 = var9.az_fld;
				int var12 = (int)(var10 >> 16 & 7L);
				if (var12 == 2 && var2 == var9.ay_fld && var3 == var9.ar_fld) {
					this.removeGameObject(var9);
					return;
				}
			}
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void lm() {
		int var1 = this.dp_fld[this.bx_fld];
		eh[] var2 = this.dq_fld[this.bx_fld];
		this.bg_fld = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			eh var4 = var2[var3];
			if (var4.ae_fld == 1) {
				int var14 = var4.ak_fld - this.cm_fld + this.di_fld;
				if (var14 >= 0 && var14 <= this.di_fld + this.di_fld) {
					int var16 = var4.az_fld - this.cz_fld + this.di_fld;
					if (var16 < 0) {
						var16 = 0;
					}

					int var18 = var4.av_fld - this.cz_fld + this.di_fld;
					if (var18 > this.di_fld + this.di_fld) {
						var18 = this.di_fld + this.di_fld;
					}

					boolean var20 = false;

					while (var16 <= var18) {
						if (dh(this, var14, var16++)) {
							var20 = true;
							break;
						}
					}

					if (var20) {
						int var22 = this.cw_fld - var4.ah_fld;
						if (var22 > 32) {
							var4.al_fld = -462812273;
						} else {
							if (var22 >= -32) {
								continue;
							}

							var4.al_fld = -925624546;
							var22 = -var22;
						}

						var4.an_fld = (var4.ay_fld - this.cy_fld << 8) / var22;
						var4.aa_fld = (var4.as_fld - this.cy_fld << 8) / var22;
						var4.ai_fld = (var4.ar_fld - this.cx_fld << 8) / var22;
						var4.aq_fld = (var4.af_fld - this.cx_fld << 8) / var22;
						this.bb_fld[this.bg_fld++] = var4;
					}
				}
			} else if (var4.ae_fld == 2) {
				int var13 = var4.az_fld - this.cz_fld + this.di_fld;
				if (var13 >= 0 && var13 <= this.di_fld + this.di_fld) {
					int var15 = var4.ak_fld - this.cm_fld + this.di_fld;
					if (var15 < 0) {
						var15 = 0;
					}

					int var17 = var4.ag_fld - this.cm_fld + this.di_fld;
					if (var17 > this.di_fld + this.di_fld) {
						var17 = this.di_fld + this.di_fld;
					}

					boolean var19 = false;

					while (var15 <= var17) {
						if (dh(this, var15++, var13)) {
							var19 = true;
							break;
						}
					}

					if (var19) {
						int var21 = this.cy_fld - var4.ay_fld;
						if (var21 > 32) {
							var4.al_fld = -1388436819;
						} else {
							if (var21 >= -32) {
								continue;
							}

							var4.al_fld = -1851249092;
							var21 = -var21;
						}

						var4.au_fld = (var4.ah_fld - this.cw_fld << 8) / var21;
						var4.ax_fld = (var4.aw_fld - this.cw_fld << 8) / var21;
						var4.ai_fld = (var4.ar_fld - this.cx_fld << 8) / var21;
						var4.aq_fld = (var4.af_fld - this.cx_fld << 8) / var21;
						this.bb_fld[this.bg_fld++] = var4;
					}
				}
			} else if (var4.ae_fld == 4) {
				int var5 = var4.ar_fld - this.cx_fld;
				if (var5 > 128) {
					int var6 = var4.az_fld - this.cz_fld + this.di_fld;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = var4.av_fld - this.cz_fld + this.di_fld;
					if (var7 > this.di_fld + this.di_fld) {
						var7 = this.di_fld + this.di_fld;
					}

					if (var6 <= var7) {
						int var8 = var4.ak_fld - this.cm_fld + this.di_fld;
						if (var8 < 0) {
							var8 = 0;
						}

						int var9 = var4.ag_fld - this.cm_fld + this.di_fld;
						if (var9 > this.di_fld + this.di_fld) {
							var9 = this.di_fld + this.di_fld;
						}

						boolean var10 = false;

						label187:
						for (int var11 = var8; var11 <= var9; var11++) {
							for (int var12 = var6; var12 <= var7; var12++) {
								if (dh(this, var11, var12)) {
									var10 = true;
									break label187;
								}
							}
						}

						if (var10) {
							var4.al_fld = 1980905931;
							var4.au_fld = (var4.ah_fld - this.cw_fld << 8) / var5;
							var4.ax_fld = (var4.aw_fld - this.cw_fld << 8) / var5;
							var4.an_fld = (var4.ay_fld - this.cy_fld << 8) / var5;
							var4.aa_fld = (var4.as_fld - this.cy_fld << 8) / var5;
							this.bb_fld[this.bg_fld++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIIIIIJI)V"
	)
	public void im(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13, int var15) {
		try {
			this.bs(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var15);
		} catch (Throwable var17) {
			throw new RuntimeException(var17);
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void eh(int var1, int var2) {
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

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void kn(boolean var1) {
		if (!this.dl() || var1) {
			this.dc_fld = true;
			this.bq_fld = var1;
			this.bw_fld = -1;
			this.ba_fld = -1;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void hr(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					this.bp(var6);
					return;
				}
			}
		}
	}

	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfv;"
	)
	public static fv xh(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		return var4 == null ? null : var4.aa_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lev;Ljava/util/BitSet;IIII)Z"
	)
	public static boolean aq(ev var0, BitSet var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1.get(var2 * var0.br_fld + var3 * var0.be_fld + var4 * var0.bs_fld + var5);
		}
	}

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void zn(int var1, int var2, int var3) {
		this.cs(var1, var2, var3);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long cd(int var1, int var2, int var3) {
		var2 += this.jh_fld;
		var3 += this.jh_fld;
		int var4 = this.ra(var1, var2, var3);
		return this.mx(var4) && this.rs_fld[var4] != null ? this.rs_fld[var4].az_fld * -4472860599998239529L : 0L;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long cv(int var1, int var2, int var3) {
		var2 += this.jh_fld;
		var3 += this.jh_fld;
		int var4 = this.ra(var1, var2, var3);
		return this.mx(var4) && this.kg_fld[var4] != null ? this.kg_fld[var4].ag_fld * 2728893160458550201L : 0L;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void cs(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.cd_fld; var4++) {
			for (int var5 = 0; var5 < this.cc_fld; var5++) {
				for (int var6 = 0; var6 < this.cq_fld; var6++) {
					int var7 = this.ra(var4, var5, var6);
					if (this.mx(var7)) {
						fs var8 = this.rs_fld[var7];
						if (var8 != null && var8.ak_fld instanceof eg) {
							eg var9 = (eg)var8.ak_fld;
							this.md(var9, var4, var5, var6, 1, 1);
							if (var8.ag_fld instanceof ModelData) {
								eg var10 = (eg)var8.ag_fld;
								this.md(var10, var4, var5, var6, 1, 1);
								eg.ha(var9, var10, 0, 0, 0, false);
								var8.ag_fld = var10.light(var10.bh_fld, var10.bs_fld, var1, var2, var3);
							}

							var8.ak_fld = var9.light(var9.bh_fld, var9.bs_fld, var1, var2, var3);
						}

						byte var13 = this.ib_fld[var7];

						for (int var14 = 0; var14 < var13; var14++) {
							fj var11 = this.vh_fld[var7 * 5 + var14];
							if (var11 != null && var11.ak_fld instanceof eg) {
								eg var12 = (eg)var11.ak_fld;
								this.md(var12, var4, var5, var6, var11.as_fld - var11.ay_fld + 1, var11.af_fld - var11.ar_fld + 1);
								var11.ak_fld = var12.light(var12.bh_fld, var12.bs_fld, var1, var2, var3);
							}
						}

						ef var15 = this.kg_fld[var7];
						if (var15 != null && var15.ak_fld instanceof eg) {
							eg var16 = (eg)var15.ak_fld;
							this.yq(var16, var4, var5, var6);
							var15.ak_fld = var16.light(var16.bh_fld, var16.bs_fld, var1, var2, var3);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfj;II)I"
	)
	public static int tj(ev var0, fj var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = var2 - var1.ay_fld;
		int var5 = var1.as_fld - var2;
		if (var5 > var4) {
			var4 = var5;
		}

		int var6 = var3 - var1.ar_fld;
		int var7 = var1.af_fld - var3;
		return var7 > var6 ? var4 + var7 : var4 + var6;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Leg;III)V"
	)
	void cp(eg var1, int var2, int var3, int var4) {
		int var5 = var3 + 1;
		int var6 = var4 + 1;

		for (int var7 = var3; var7 <= var5; var7++) {
			if (var7 >= 0 && var7 < this.cc_fld) {
				for (int var8 = var4 - 1; var8 <= var6; var8++) {
					if (var8 >= 0 && var8 < this.cq_fld && (var7 >= var5 || var8 >= var6)) {
						int var9 = this.ra(var2, var7, var8);
						if (this.mx(var9)) {
							ef var10 = this.kg_fld[var9];
							if (var10 != null && var10.ak_fld instanceof eg) {
								int var11 = this.mz(var2, var7, var8) - this.mz(var2, var3, var4);
								eg var12 = (eg)var10.ak_fld;
								eg.ha(var1, var12, (var7 - var3) * 128, var11, (var8 - var4) * 128, true);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;Lrl17;)V"
	)
	public void ke(fw var1, fw var2, rl17 var3) {
		try {
			if (this.lk(var1, var3)) {
				int var4 = var3.go_fld;
				int var5 = var3.kq_fld;

				for (int var6 = this.cf_fld; var6 < this.cd_fld; var6++) {
					for (int var7 = var4 << 3; var7 < var4 + 1 << 3; var7++) {
						for (int var8 = var5 << 3; var8 < var5 + 1 << 3; var8++) {
							int var9 = this.ra(var6, var7, var8);
							if (this.mx(var9)) {
								int var10 = var9 >> this.lo_fld & this.rl_fld;
								int var11 = var9 & this.ul_fld;
								int var12 = var9 >> this.ha_fld & 3;
								int var13 = this.wf_fld[var9];
								int var14 = this.ya(var9);
								int var15 = this.tx(var9);
								int var16 = var10 - this.jh_fld;
								int var17 = var11 - this.jh_fld;
								if (var15 <= this.bx_fld) {
									if ((var13 & 32) != 0) {
										int var18 = this.ra(3, var10, var11);
										int var19 = this.wf_fld[var18];
										if ((var19 & 256) != 0) {
											var1.jq(this, this.oy_fld[var18], 0, 0, var16, var17);
										} else if ((var19 & 1024) != 0) {
											var1.za(this, this.fr_fld[var18], 0, var16, var17);
										}
									}

									if ((var13 & 256) != 0) {
										if ((var13 & 512) != 0 || var12 <= this.dh_fld) {
											fa var22 = this.oy_fld[var9];
											var1.jq(this, var22, var15, var14, var16, var17);
										}
									} else if ((var13 & 1024) != 0) {
										var1.za(this, this.fr_fld[var9], var15, var16, var17);
									}

									if ((var13 & 2048) != 0) {
										ef var23 = this.kg_fld[var9];
										this.lz(var1, var2, var23.ak_fld, 0, var23.av_fld, var23.az_fld, var23.ae_fld, var23.ag_fld);
									}

									if ((var13 & 16384) != 0) {
										fs var24 = this.rs_fld[var9];
										this.lz(var1, var2, var24.ak_fld, 0, var24.ae_fld, var24.av_fld, var24.ah_fld, var24.az_fld);
										this.lz(var1, var2, var24.ag_fld, 0, var24.ae_fld, var24.av_fld, var24.ah_fld, var24.az_fld);
									}

									if ((var13 & 32768) != 0) {
										fv var25 = this.ow_fld[var9];
										this.lz(var1, var2, var25.ak_fld, 0, var25.ae_fld + var25.as_fld, var25.av_fld, var25.ah_fld + var25.ar_fld, var25.az_fld);
										this.lz(var1, var2, var25.ag_fld, 0, var25.ae_fld + var25.af_fld, var25.av_fld, var25.ah_fld + var25.al_fld, var25.az_fld);
									}

									for (int var26 = 0; var26 < this.ib_fld[var9]; var26++) {
										fj var27 = this.vh_fld[var9 * 5 + var26];
										if (var27.au_fld != this.ce_fld) {
											var27.au_fld = this.ce_fld;
											this.lz(var1, var2, var27.ak_fld, var27.ag_fld, var27.ah_fld, var27.ae_fld, var27.aw_fld, var27.az_fld);
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
			if (var12 != this.cd_fld) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.cc_fld) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.cq_fld && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
								int var15 = this.ra(var12, var13, var14);
								if (this.mx(var15)) {
									int var16 = this.mz(var12, var13, var14) - this.mz(var2, var3, var4);
									fs var17 = this.rs_fld[var15];
									if (var17 != null) {
										if (var17.ak_fld instanceof eg) {
											eg var18 = (eg)var17.ak_fld;
											eg.ha(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7);
										}

										if (var17.ag_fld instanceof eg) {
											eg var24 = (eg)var17.ag_fld;
											eg.ha(var1, var24, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7);
										}
									}

									byte var25 = this.ib_fld[var15];

									for (int var19 = 0; var19 < var25; var19++) {
										fj var20 = this.vh_fld[var15 * 5 + var19];
										if (var20 != null && var20.ak_fld instanceof eg) {
											eg var21 = (eg)var20.ak_fld;
											int var22 = var20.as_fld - var20.ay_fld + 1;
											int var23 = var20.af_fld - var20.ar_fld + 1;
											eg.ha(
												var1,
												var21,
												(var20.ay_fld + this.jh_fld - var3) * 128 + (var22 - var5) * 64,
												var16,
												(var20.ar_fld + this.jh_fld - var4) * 128 + (var23 - var6) * 64,
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

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void le(int var1, int var2) {
		this.dv(var1, var2);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)I"
	)
	int cn(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.cr(var1, var2, var3) - this.cr(var4, var5, var6);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int cr(int var1, int var2, int var3) {
		return (this.cs_fld[var1][var2][var3] + this.cs_fld[var1][var2 + 1][var3] + this.cs_fld[var1][var2][var3 + 1] + this.cs_fld[var1][var2 + 1][var3 + 1]) / 4;
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
					var7.eu();
					if (var7.ez_fld > var4) {
						var4 = var7.ez_fld;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cg(int var1) {
		this.di_fld = og.al(25, 90, var1);
		fh.ae(this.di_fld);
		if (this.dm_fld != null && this.dm_fld.length > 0) {
			this.js(this.dm_fld, this.dj_fld, this.es_fld, this.ep_fld, this.eb_fld);
		}
	}

	@ObfuscatedName("yc")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Z"
	)
	public static boolean yc(ev var0, int var1, int var2, int var3) {
		int var4 = var0.cv_fld[var1][var2][var3];
		if (var4 == -var0.ce_fld) {
			return false;
		} else if (var4 == var0.ce_fld) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (var0.dj(var5 + 1, var0.cs_fld[var1][var2][var3], var6 + 1)
				&& var0.dj(var5 + 128 - 1, var0.cs_fld[var1][var2 + 1][var3], var6 + 1)
				&& var0.dj(var5 + 128 - 1, var0.cs_fld[var1][var2 + 1][var3 + 1], var6 + 992565491 - 1)
				&& var0.dj(var5 + 1, var0.cs_fld[var1][var2][var3 + 1], var6 + 128 - 1)) {
				var0.cv_fld[var1][var2][var3] = var0.ce_fld;
				return true;
			} else {
				var0.cv_fld[var1][var2][var3] = -var0.ce_fld;
				return false;
			}
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void dv(int var1, int var2) {
		if (var1 < 0) {
			var1 = 0;
		}

		this.eo_fld = var1;
		this.ec_fld = var2;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Ldz;)V"
	)
	public void lp(dz var1) {
		try {
			if (var1 != null) {
				var1.iv();
				if (var1.zs_fld > -1 && this.ju_fld != null) {
					this.ju_fld.set(var1.zs_fld);
				}

				if (var1.qc()) {
					var1.ga_fld = true;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ex() {
		this.do_fld = -1;
		this.dd_fld = null;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean lv(int var1, int var2, int var3, int var4) {
		return aq(this, this.ed_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean cb(int var1, int var2, int var3, int var4, boolean var5) {
		return this.it(this.ed_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("getOverlayIds")
	@ObfuscatedSignature(
		descriptor = "()[[[S"
	)
	@Override
	public short[][][] getOverlayIds() {
		return this.yb_fld;
	}

	@ObfuscatedName("isInstance")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isInstance() {
		return this.hg_boolean;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean cl(int var1, int var2, int var3, int var4) {
		return aq(this, this.et_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void xi(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = 0; var4 < var0.cd_fld; var4++) {
			for (int var5 = 0; var5 < var0.cc_fld; var5++) {
				for (int var6 = 0; var6 < var0.cq_fld; var6++) {
					ei var7 = var0.bl_fld[var4][var5][var6];
					if (var7 != null) {
						fs var8 = var7.an_fld;
						if (var8 != null && var8.ak_fld instanceof eg) {
							eg var9 = (eg)var8.ak_fld;
							var0.ce(var9, var4, var5, var6, 1, 1);
							if (var8.ag_fld instanceof eg) {
								eg var10 = (eg)var8.ag_fld;
								var0.ce(var10, var4, var5, var6, 1, 1);
								eg.ag(var9, var10, 0, 0, 0, false);
								var8.ag_fld = var10.bx(var10.bh_fld, var10.bs_fld, var1, var2, var3);
							}

							var8.ak_fld = var9.bx(var9.bh_fld, var9.bs_fld, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.ah_fld; var12++) {
							fj var14 = var7.aw_fld[var12];
							if (var14 != null && var14.ak_fld instanceof eg) {
								eg var11 = (eg)var14.ak_fld;
								var0.ce(var11, var4, var5, var6, var14.as_fld - var14.ay_fld + 1, var14.af_fld - var14.ar_fld + 1);
								var14.ak_fld = var11.bx(var11.bh_fld, var11.bs_fld, var1, var2, var3);
							}
						}

						ef var13 = var7.ai_fld;
						if (var13 != null && var13.ak_fld instanceof eg) {
							eg var15 = (eg)var13.ak_fld;
							var0.cp(var15, var4, var5, var6);
							var13.ak_fld = var15.bx(var15.bh_fld, var15.bs_fld, var1, var2, var3);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ay() {
		for (int var1 = 0; var1 < this.cd_fld; var1++) {
			for (int var2 = this.jh_fld; var2 < this.cc_fld - this.jh_fld; var2++) {
				for (int var3 = this.jh_fld; var3 < this.cq_fld - this.jh_fld; var3++) {
					rl10 var4 = this.in_ArrArrArrrl10[var1][var2 - this.jh_fld][var3 - this.jh_fld];
					if (var4 != null) {
						this.pi(var4);
						if (var4.getBridge() != null) {
							this.pi(var4.getBridge());
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean cu(int var1, int var2, int var3, int var4, boolean var5) {
		return this.it(this.et_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean ci(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.bk_fld + var3 * this.bj_fld + var4 * this.bf_fld + var5);
	}

	@ObfuscatedName("removeTile")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Tile;)V"
	)
	@Override
	public void removeTile(Tile var1) {
		rl10 var2 = (rl10)var1;
		int var3 = var2.xq_fld;
		int var4 = this.wf_fld[var3];
		int var5 = var3 >> this.lo_fld & this.rl_fld;
		int var6 = var3 & this.ul_fld;
		rl17 var7 = this.tb_fld[var5 >> 3][var6 >> 3];
		if ((var4 & 2048) != 0) {
			var7.wu_fld.remove(this.kg_fld[var3]);
		}

		if ((var4 & 12288) != 0) {
			var7.wu_fld.remove(this.ee_fld[var3]);
		}

		if ((var4 & 16384) != 0) {
			var7.wu_fld.remove(this.rs_fld[var3]);
		}

		if ((var4 & 32768) != 0) {
			var7.wu_fld.remove(this.ow_fld[var3]);
		}

		byte var8 = this.ib_fld[var3];

		for (int var9 = 0; var9 < var8; var9++) {
			fj var10 = this.vh_fld[var3 * 5 + var9];
			var7.wu_fld.remove(var10);
		}

		this.ma(var3);
		var2.gx_fld = null;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean ct(int var1, int var2, int var3, int var4, boolean var5) {
		return rl16.ie(this, this.ew_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean df(int var1, int var2, int var3, int var4) {
		return this.ci(this.ex_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void kj() {
		if (this.dc_fld) {
			this.dc_fld = false;
			this.bw_fld = this.bu_fld;
			this.ba_fld = this.bn_fld;
		}
	}

	@ObfuscatedName("buildRoofs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void buildRoofs() {
		this.pr_fld = new int[this.cd_fld][this.cc_fld][this.cq_fld];
		int var1 = 1;
		this.gr_fld = new HashMap();
		Set[] var2 = new Set[]{new HashSet(), new HashSet(), new HashSet()};

		for (int var3 = this.cd_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.cq_fld; var4++) {
				for (int var5 = 0; var5 < this.cc_fld; var5++) {
					rl10 var6 = this.iy_fld[var3][var5][var4];
					if (var6 != null && this.pr_fld[var3][var5][var4] == 0 && this.ny(var3, var5, var4)) {
						this.hw(var6, var1++, var2);
					}
				}
			}
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

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void lf(fw var1, boolean var2) {
		this.cp_fld = 0;

		for (int var3 = this.cf_fld; var3 < this.cd_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.cn_fld; var5 < this.cr_fld; var5++) {
				for (int var6 = this.ca_fld; var6 < this.cg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null
						&& var7.ad_fld <= this.bx_fld
						&& (
							!var2
								|| dh(this, var5 - this.cm_fld + this.df_fld + this.di_fld, var6 - this.cz_fld + this.de_fld + this.di_fld)
								|| this.cs_fld[var3][var5][var6] - this.cx_fld >= 2000
						)) {
						this.dw(var1, var7);
					}
				}
			}
		}

		this.dr();
		fc.ar_fld.au_fld.ae(this.bd_fld);
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Lev;[IIIIII)V"
	)
	public static void dg(ev var0, int[] var1, int var2, int var3, int var4, int var5, int var6) {
		ei var7 = var0.bl_fld[var4][var5][var6];
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

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void jj(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var2 += var0.jh_fld;
		var3 += var0.jh_fld;
		int var4 = var0.ra(var1, var2, var3);
		if (var0.mx(var4) && (var0.wf_fld[var4] & 32768) != 0) {
			fv var5 = var0.ow_fld[var4];
			var0.ow_fld[var4] = null;
			var0.wf_fld[var4] = var0.wf_fld[var4] & -32769;
			if (var5.ak_fld instanceof dz || var5.ag_fld instanceof dz) {
				rl17 var6 = var0.tb_fld[var2 >> 3][var3 >> 3];
				var6.wu_fld.remove(var5);
			}

			if (var0.sv_fld) {
				DecorativeObjectDespawned var9 = new DecorativeObjectDespawned();
				var9.setTile(var0.iy_fld[var1][var2][var3]);
				var9.setDecorativeObject(var5);
				og.ci_fld.getCallbacks().post(var9);
			}

			if (var0.sv_fld && client.fa_fld != null) {
				client.fa_fld.invalidateZone(var0, var2 >> 3, var3 >> 3);
			}
		}
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "(Leg;III)V"
	)
	public void yq(eg var1, int var2, int var3, int var4) {
		this.cp(var1, var2, var3, var4);
	}

	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void qq() {
		try {
			for (int var1 = 0; var1 < this.cc_fld >> 3; var1++) {
				for (int var2 = 0; var2 < this.cq_fld >> 3; var2++) {
					rl17 var3 = this.tb_fld[var1][var2];
					boolean var4 = false;
					Iterator var5 = var3.wu_fld.iterator();

					while (var5.hasNext()) {
						TileObject var6 = (TileObject)(TileObject)var5.next();
						if (var6 instanceof fj) {
							fj var12 = (fj)var6;
							var4 |= this.is(var12.ak_fld, var12.getOrientation(), var12.getX(), var12.getZ(), var12.getY(), var12.ay_fld, var12.ar_fld);
						} else if (var6 instanceof fs) {
							fs var11 = (fs)var6;
							var4 |= this.is(var11.ak_fld, 0, var11.getX(), var11.getZ(), var11.getY(), var11.getX() >> 7, var11.getY() >> 7)
								|| this.is(var11.ag_fld, 0, var11.getX(), var11.getZ(), var11.getY(), var11.getX() >> 7, var11.getY() >> 7);
						} else if (!(var6 instanceof fv)) {
							if (var6 instanceof ef) {
								ef var10 = (ef)var6;
								var4 |= this.is(var10.ak_fld, 0, var10.getX(), var10.getZ(), var10.getY(), var10.getX() >> 7, var10.getY() >> 7);
							}
						} else {
							fv var7 = (fv)var6;
							var4 |= this.is(var7.ak_fld, 0, var7.getX(), var7.getZ(), var7.getY(), var7.getX() >> 7, var7.getY() >> 7)
								|| this.is(var7.ag_fld, 0, var7.getX(), var7.getZ(), var7.getY(), var7.getX() >> 7, var7.getY() >> 7);
						}
					}

					if (var4 && client.fa_fld != null) {
						client.fa_fld.invalidateZone(this, var3.go_fld, var3.kq_fld);
					}
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean kd() {
		return this.bq_fld && this.bw_fld != -1;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void dd() {
		this.bq_fld = true;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void dr() {
		if (this.dc_fld) {
			this.dc_fld = false;
			this.bw_fld = this.bu_fld;
			this.ba_fld = this.bn_fld;
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void da() {
		this.bw_fld = -1;
		this.bq_fld = false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean ar(ev var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.dn(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return var0.dj(var5 + 1, var0.cs_fld[var1][var2][var3] - var4, var6 + 1)
				&& var0.dj(var5 + 128 - 1, var0.cs_fld[var1][var2 + 1][var3] - var4, var6 + 1)
				&& var0.dj(var5 + 128 - 1, var0.cs_fld[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
				&& var0.dj(var5 + 1, var0.cs_fld[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void jc() {
		boolean var1 = this.hl_fld != 0 && this.aj_fld;
		if (var1) {
			this.xc_java_util_Set.clear();
			cv var2 = og.ci_fld.getLocalPlayer();
			if (var2 != null && (this.hl_fld & 1) != 0) {
				LocalPoint var3 = var2.getLocalLocation();
				if (var3.isInScene()) {
					int var4 = this.pr_fld[this.fj_fld.ae_fld * -457350413][var3.getSceneX() + this.jh_fld][var3.getSceneY() + this.jh_fld];
					this.wh(var4);
				}
			}

			if (this.ks_fld >= this.oq_fld && this.ks_fld < this.rm_fld && this.td_int >= this.zc_fld && this.td_int < this.jq_fld && (this.hl_fld & 2) != 0) {
				int var15 = this.pr_fld[this.fj_fld.ae_fld * -457350413][this.ks_fld + this.jh_fld][this.td_int + this.jh_fld];
				this.wh(var15);
			}

			LocalPoint var16 = og.ci_fld.getLocalDestinationLocation();
			if (var16 != null && var16.isInScene() && (this.hl_fld & 4) != 0) {
				int var17 = this.pr_fld[this.fj_fld.ae_fld * -457350413][var16.getSceneX() + this.jh_fld][var16.getSceneY() + this.jh_fld];
				this.wh(var17);
			}

			if (og.ci_fld.getCameraPitch() < 310 && (this.hl_fld & 8) != 0 && var2 != null) {
				int var18 = var2.iz() >> 7;
				int var5 = var2.sa() >> 7;
				int var6 = og.ci_fld.getCameraX() >> 7;
				int var7 = og.ci_fld.getCameraY() >> 7;
				if (var18 >= this.oq_fld
					&& var5 >= this.zc_fld
					&& var6 >= this.oq_fld
					&& var7 >= this.zc_fld
					&& var18 < this.rm_fld
					&& var5 < this.jq_fld
					&& var6 < this.rm_fld
					&& var7 < this.jq_fld) {
					int var8 = Math.abs(var18 - var6);
					int var9 = Integer.compare(var18, var6);
					int var10 = -Math.abs(var5 - var7);
					int var11 = Integer.compare(var5, var7);
					int var12 = var8 + var10;

					while (var6 != var18 || var7 != var5) {
						if (this.ny(this.fj_fld.ae_fld * -457350413, var6 + this.jh_fld, var7 + this.jh_fld)) {
							int var14 = this.pr_fld[this.fj_fld.ae_fld * -457350413][var6 + this.jh_fld][var7 + this.jh_fld];
							this.wh(var14);
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

			this.xc_java_util_Set.remove(0);
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void kb(int var1) {
		this.ap(var1);
	}

	@ObfuscatedName("getOverrideAmount")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Override
	public byte getOverrideAmount() {
		return this.bm_fld.ae_fld;
	}

	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ts(int var1, int var2, int var3) {
		if (var2 >= 0 && var2 < this.cc_fld && var3 >= 0 && var3 < this.cq_fld) {
			int var4 = this.ra(var1, var2, var3);
			if (this.mx(var4)) {
				this.sd(var4);
			}
		}
	}

	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void wh(int var1) {
		if (var1 != 0 && var1 >> 28 == 0) {
			this.gy(var1);
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void dk(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		try {
			int var10 = client.jb_fld >> 7 & 15;
			rl23.vm(var10);
			client.ft();
			var1 = ke.jd_fld;
			var2 = cs.jy_fld;
			var3 = gk.jc_fld;
			var4 = hu.je_fld;
			var5 = ab.jx_fld;
			boolean var11 = og.ci_fld.isGpu();
			if (!var11 && client.ao_fld != 0) {
				fh.tj(og.ci_fld.getViewportXOffset(), og.ci_fld.getViewportYOffset(), og.ci_fld.getViewportWidth(), og.ci_fld.getViewportHeight(), client.ao_fld);
			}

			this.cw_fld = Ints.constrainToRange(var1, this.oq_fld << 7, (this.rm_fld << 7) - 1);
			this.cx_fld = var2;
			this.cy_fld = Ints.constrainToRange(var3, this.zc_fld << 7, (this.jq_fld << 7) - 1);
			this.mu_fld = Floats.constrainToRange((float)client.jc_fld, this.oq_fld << 7, (this.rm_fld << 7) - 1);
			this.sj_fld = (float)client.uq_double;
			this.td_float = Floats.constrainToRange((float)client.uo_fld, this.zc_fld << 7, (this.jq_fld << 7) - 1);
			this.cm_fld = this.cw_fld >> 7;
			this.cz_fld = this.cy_fld >> 7;
			this.cm_fld = this.cm_fld + this.jh_fld;
			this.cz_fld = this.cz_fld + this.jh_fld;
			this.ck_fld = var7 >> 7;
			this.cb_fld = var8 >> 7;
			this.ck_fld = this.ck_fld + this.jh_fld;
			this.cb_fld = this.cb_fld + this.jh_fld;
			this.bx_fld = var6;
			int var12 = Ints.constrainToRange(var4, 0, 520);
			float var13 = (float)client.is_fld;
			if (!client.pe_fld) {
				var4 = var12;
				var13 = Floats.constrainToRange(var13, (float) (Math.PI / 8), 1.1750293F);
			}

			this.le((var12 - ay_fld) / 32, var5 / 64);
			this.ci_fld = fc.ay_fld[var4];
			this.cj_fld = fc.as_fld[var4];
			this.ch_fld = fc.ay_fld[var5];
			this.ct_fld = fc.as_fld[var5];
			this.uv_fld = var13;
			this.um_fld = (float)client.ik_fld;
			ee var14 = new ee(this.cw_fld, this.cx_fld, this.cy_fld, var4, var5, var7, var8);
			var14.tv_fld = this.mu_fld;
			var14.jz_fld = this.sj_fld;
			var14.ht_fld = this.td_float;
			var14.if_fld = this.uv_fld;
			var14.zv_fld = this.um_fld;
			var14.dc_fld = (float)Math.sin(this.uv_fld);
			var14.hz_fld = (float)Math.cos(this.uv_fld);
			var14.wk_fld = (float)Math.sin(this.um_fld);
			var14.kw_float = (float)Math.cos(this.um_fld);
			this.zy_fld = var14;
			ee.yx_fld = var14;
			if ((client.jb_fld & 16) != 0) {
				this.hh(true, var9);
				this.vh(var14, null);
				fc.ar_fld.au_fld.ug(this.bd_fld);
				this.im(null);
				og.ci_fld.getCallbacks().drawScene();
			} else if (fc.al_fld.sw() && !og.ci_fld.isGpu()) {
				fc.ar_fld.aa_fld = 0;
				this.hh(true, var9);
				this.sg(var14);
				fc.ar_fld.au_fld.ug(this.bd_fld);
				fc.ar_fld.aa_fld = 1;
				this.hh(false, var9);
				this.su(var14);
				fc.ar_fld.au_fld.ug(this.bd_fld);
				fc.ar_fld.aa_fld = 2;
				og.ci_fld.getCallbacks().drawScene();
				if (client.fa_fld != null) {
					client.fa_fld.postDrawScene();
				}
			} else {
				fc.ar_fld.aa_fld = 2;
				this.hh(true, var9);
				this.su(var14);
				fc.ar_fld.au_fld.ug(this.bd_fld);
				og.ci_fld.getCallbacks().drawScene();
				if (client.fa_fld != null) {
					client.fa_fld.postDrawScene();
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void lo(fw var1, boolean var2) {
		this.cp_fld = 0;

		for (int var3 = this.cf_fld; var3 < this.cd_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.cn_fld; var5 < this.cr_fld; var5++) {
				for (int var6 = this.ca_fld; var6 < this.cg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null
						&& var7.ad_fld <= this.bx_fld
						&& (
							!var2
								|| dh(this, var5 - this.cm_fld + this.df_fld + this.di_fld, var6 - this.cz_fld + this.de_fld + this.di_fld)
								|| this.cs_fld[var3][var5][var6] - this.cx_fld >= -816559351
						)) {
						this.dw(var1, var7);
					}
				}
			}
		}

		this.dr();
		fc.ar_fld.au_fld.ae(this.bd_fld);
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void xn(int var1, int var2, int var3) {
		if (var3 == this.fj_fld.ae_fld * -457350413 && !og.ci_fld.isMenuOpen()) {
			this.ks_fld = var1;
			this.td_int = var2;
		}
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void pd(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.dh_fld = var1;
			var0.dv_fld = var2;
			var0.dz_fld = var3;
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(III)Lfj;"
	)
	public fj hi(int var1, int var2, int var3) {
		return cn(this, var1, var2, var3);
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(Lfw;ZZ)V"
	)
	void ds(fw var1, boolean var2, boolean var3) {
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void db(fw var1, boolean var2) {
		this.cp_fld = 0;

		for (int var3 = this.cf_fld; var3 < this.cd_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.cn_fld; var5 < this.cr_fld; var5++) {
				for (int var6 = this.ca_fld; var6 < this.cg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null) {
						if (var7.ad_fld <= this.bx_fld
							&& (
								!var2
									|| dh(this, var5 - this.cm_fld + this.df_fld + this.di_fld, var6 - this.cz_fld + this.de_fld + this.di_fld)
									|| this.cs_fld[var3][var5][var6] - this.cx_fld >= 2000
							)) {
							var7.ao_fld = true;
							var7.ab_fld = true;
							var7.ap_fld = var7.ah_fld > 0 || var7.ag(158942193);
							this.cp_fld++;
						} else {
							var7.ao_fld = false;
							var7.ab_fld = false;
							var7.at_fld = 0;
						}
					}
				}
			}
		}

		int var14 = Math.abs(this.df_fld);
		int var15 = Math.abs(this.de_fld);

		for (int var16 = this.cf_fld; var16 < this.cd_fld; var16++) {
			ei[][] var18 = this.bl_fld[var16];

			for (int var20 = -(this.di_fld + var14); var20 <= 0; var20++) {
				int var8 = this.cm_fld + var20;
				int var9 = this.cm_fld - var20;
				if (var8 >= this.cn_fld || var9 < this.cr_fld) {
					for (int var10 = -(this.di_fld + var15); var10 <= 0; var10++) {
						int var11 = this.cz_fld + var10;
						int var12 = this.cz_fld - var10;
						if (var8 >= this.cn_fld && var8 < this.cr_fld) {
							if (var11 >= this.ca_fld && var11 < this.cg_fld) {
								ei var13 = var18[var8][var11];
								if (var13 != null && var13.ao_fld) {
									this.dg(var1, var13, true);
								}
							}

							if (var12 >= this.ca_fld && var12 < this.cg_fld) {
								ei var27 = var18[var8][var12];
								if (var27 != null && var27.ao_fld) {
									this.dg(var1, var27, true);
								}
							}
						}

						if (var9 >= this.cn_fld && var9 < this.cr_fld) {
							if (var11 >= this.ca_fld && var11 < this.cg_fld) {
								ei var28 = var18[var9][var11];
								if (var28 != null && var28.ao_fld) {
									this.dg(var1, var28, true);
								}
							}

							if (var12 >= this.ca_fld && var12 < this.cg_fld) {
								ei var29 = var18[var9][var12];
								if (var29 != null && var29.ao_fld) {
									this.dg(var1, var29, true);
								}
							}
						}

						if (this.cp_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ae(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		for (int var17 = this.cf_fld; var17 < this.cd_fld; var17++) {
			ei[][] var19 = this.bl_fld[var17];

			for (int var21 = -(this.di_fld + var14); var21 <= 0; var21++) {
				int var22 = this.co_fld + var21;
				int var23 = this.co_fld - var21;
				if (var22 >= this.cn_fld || var23 < this.cr_fld) {
					for (int var24 = -(this.di_fld + var15); var24 <= 0; var24++) {
						int var25 = this.cu_fld + var24;
						int var26 = this.cu_fld - var24;
						if (var22 >= this.cn_fld && var22 < this.cr_fld) {
							if (var25 >= this.ca_fld && var25 < this.cg_fld) {
								ei var30 = var19[var22][var25];
								if (var30 != null && var30.ao_fld) {
									this.dg(var1, var30, false);
								}
							}

							if (var26 >= this.ca_fld && var26 < this.cg_fld) {
								ei var31 = var19[var22][var26];
								if (var31 != null && var31.ao_fld) {
									this.dg(var1, var31, false);
								}
							}
						}

						if (var23 >= this.cn_fld && var23 < this.cr_fld) {
							if (var25 >= this.ca_fld && var25 < this.cg_fld) {
								ei var32 = var19[var23][var25];
								if (var32 != null && var32.ao_fld) {
									this.dg(var1, var32, false);
								}
							}

							if (var26 >= this.ca_fld && var26 < this.cg_fld) {
								ei var33 = var19[var23][var26];
								if (var33 != null && var33.ao_fld) {
									this.dg(var1, var33, false);
								}
							}
						}

						if (this.cp_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ae(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		fc.ar_fld.au_fld.ae(this.bd_fld);
		this.dr();
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
		int var1 = this.dp_fld[this.bx_fld];
		eh[] var2 = this.dq_fld[this.bx_fld];
		this.bg_fld = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			eh var4 = var2[var3];
			if (var4.ae_fld == 1) {
				int var14 = var4.ak_fld - this.cm_fld + this.di_fld;
				if (var14 >= 0 && var14 <= this.di_fld + this.di_fld) {
					int var16 = var4.az_fld - this.cz_fld + this.di_fld;
					if (var16 < 0) {
						var16 = 0;
					}

					int var18 = var4.av_fld - this.cz_fld + this.di_fld;
					if (var18 > this.di_fld + this.di_fld) {
						var18 = this.di_fld + this.di_fld;
					}

					boolean var20 = false;

					while (var16 <= var18) {
						if (dh(this, var14, var16++)) {
							var20 = true;
							break;
						}
					}

					if (var20) {
						int var22 = this.cw_fld - var4.ah_fld;
						if (var22 > 32) {
							var4.al_fld = -462812273;
						} else {
							if (var22 >= -32) {
								continue;
							}

							var4.al_fld = -925624546;
							var22 = -var22;
						}

						var4.an_fld = (var4.ay_fld - this.cy_fld << 8) / var22;
						var4.aa_fld = (var4.as_fld - this.cy_fld << 8) / var22;
						var4.ai_fld = (var4.ar_fld - this.cx_fld << 8) / var22;
						var4.aq_fld = (var4.af_fld - this.cx_fld << 8) / var22;
						this.bb_fld[this.bg_fld++] = var4;
					}
				}
			} else if (var4.ae_fld == 2) {
				int var13 = var4.az_fld - this.cz_fld + this.di_fld;
				if (var13 >= 0 && var13 <= this.di_fld + this.di_fld) {
					int var15 = var4.ak_fld - this.cm_fld + this.di_fld;
					if (var15 < 0) {
						var15 = 0;
					}

					int var17 = var4.ag_fld - this.cm_fld + this.di_fld;
					if (var17 > this.di_fld + this.di_fld) {
						var17 = this.di_fld + this.di_fld;
					}

					boolean var19 = false;

					while (var15 <= var17) {
						if (dh(this, var15++, var13)) {
							var19 = true;
							break;
						}
					}

					if (var19) {
						int var21 = this.cy_fld - var4.ay_fld;
						if (var21 > 32) {
							var4.al_fld = -1388436819;
						} else {
							if (var21 >= -32) {
								continue;
							}

							var4.al_fld = -1851249092;
							var21 = -var21;
						}

						var4.au_fld = (var4.ah_fld - this.cw_fld << 8) / var21;
						var4.ax_fld = (var4.aw_fld - this.cw_fld << 8) / var21;
						var4.ai_fld = (var4.ar_fld - this.cx_fld << 8) / var21;
						var4.aq_fld = (var4.af_fld - this.cx_fld << 8) / var21;
						this.bb_fld[this.bg_fld++] = var4;
					}
				}
			} else if (var4.ae_fld == 4) {
				int var5 = var4.ar_fld - this.cx_fld;
				if (var5 > 128) {
					int var6 = var4.az_fld - this.cz_fld + this.di_fld;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = var4.av_fld - this.cz_fld + this.di_fld;
					if (var7 > this.di_fld + this.di_fld) {
						var7 = this.di_fld + this.di_fld;
					}

					if (var6 <= var7) {
						int var8 = var4.ak_fld - this.cm_fld + this.di_fld;
						if (var8 < 0) {
							var8 = 0;
						}

						int var9 = var4.ag_fld - this.cm_fld + this.di_fld;
						if (var9 > this.di_fld + this.di_fld) {
							var9 = this.di_fld + this.di_fld;
						}

						boolean var10 = false;

						label188:
						for (int var11 = var8; var11 <= var9; var11++) {
							for (int var12 = var6; var12 <= var7; var12++) {
								if (dh(this, var11, var12)) {
									var10 = true;
									break label188;
								}
							}
						}

						if (var10) {
							var4.al_fld = 1980905931;
							var4.au_fld = (var4.ah_fld - this.cw_fld << 8) / var5;
							var4.ax_fld = (var4.aw_fld - this.cw_fld << 8) / var5;
							var4.an_fld = (var4.ay_fld - this.cy_fld << 8) / var5;
							var4.aa_fld = (var4.as_fld - this.cy_fld << 8) / var5;
							this.bb_fld[this.bg_fld++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("getOverrideLuminance")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Override
	public byte getOverrideLuminance() {
		return this.bm_fld.av_fld;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean dn(int var1, int var2, int var3) {
		int var4 = this.cv_fld[var1][var2][var3];
		if (var4 == -this.ce_fld) {
			return false;
		} else if (var4 == this.ce_fld) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.dj(var5 + 1, this.cs_fld[var1][var2][var3], var6 + 1)
				&& this.dj(var5 + 128 - 1, this.cs_fld[var1][var2 + 1][var3], var6 + 1)
				&& this.dj(var5 + 128 - 1, this.cs_fld[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
				&& this.dj(var5 + 1, this.cs_fld[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.cv_fld[var1][var2][var3] = this.ce_fld;
				return true;
			} else {
				this.cv_fld[var1][var2][var3] = -this.ce_fld;
				return false;
			}
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ly(int var1, int var2, int var3, int var4) {
		if (!this.dn(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.cs_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.cw_fld) {
						if (!this.dj(var5, var7, var6)) {
							return false;
						}

						if (!this.dj(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6)) {
							return false;
						}

						if (!this.dj(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6)) {
						return false;
					}

					if (!this.dj(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.cy_fld) {
						if (!this.dj(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.cw_fld) {
						if (!this.dj(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.cy_fld) {
						if (!this.dj(var5, var7, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.dj(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.dj(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.dj(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.dj(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? this.dj(var5, var9, var6) : true;
			}
		}
	}

	@ObfuscatedName("setRoofRemovalMode")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setRoofRemovalMode(int var1) {
		this.hl_fld = var1;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ck(int var1, int var2, int var3, int var4) {
		if (!this.dn(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.dj(var5 + 1, this.cs_fld[var1][var2][var3] - var4, var6 + 1)
				&& this.dj(var5 + 128 - 1, this.cs_fld[var1][var2 + 1][var3] - var4, var6 + 1)
				&& this.dj(var5 + 128 - 1, this.cs_fld[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
				&& this.dj(var5 + 1, this.cs_fld[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)V"
	)
	public static void cg(ev var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1 < 0) {
				var1 = 0;
			}

			var0.eo_fld = var1;
			var0.ec_fld = var2;
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int if_(int var1, int var2, int var3) {
		return (this.cs_fld[var1][var2][var3] + this.cs_fld[var1][var2 + 1][var3] + this.cs_fld[var1][var2][var3 + 1] + this.cs_fld[var1][var2 + 1][var3 + 1]) / 4;
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

	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIILem;JI)V"
	)
	public static void yo(ev var0, int var1, int var2, int var3, int var4, em var5, long var6, int var8) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var9 = var2 + var0.jh_fld;
			int var10 = var3 + var0.jh_fld;
			if (var5 != null) {
				int var11 = var0.ra(var1, var9, var10);
				ef var12 = new ef();
				var12.tq(var5);
				var12.rt(var2 * 128 + 64);
				var12.ft(var3 * 128 + 64);
				var12.sc(var4);
				var12.gs(var6);
				var12.iu(var8);
				rl10 var13 = var0.iy_fld[var1][var9][var10];
				if (var13 == null) {
					var0.iy_fld[var1][var9][var10] = var13 = new rl10(var0, var11);
					var0.nd(var1, var9, var10);
				}

				if (!var0.mx(var11)) {
					var0.ir(var11, var1, var9, var10);
				}

				if (!qd_fld && var0.kg_fld[var11] != null) {
					throw new AssertionError();
				}

				var0.kg_fld[var11] = var12;
				var0.wf_fld[var11] = var0.wf_fld[var11] | 2048;
				var0.fl_fld[var11] = var0.fl_fld[var11] | 1080863910568919040L;
				if (var5 instanceof dz) {
					rl17 var14 = var0.tb_fld[var9 >> 3][var10 >> 3];
					var14.wu_fld.add(var12);
					var0.lp((dz)var5);
				}

				var0.pd(var5, 0, var12.getX(), var12.getZ(), var12.getY(), var2, var3);
				var12.rh_fld = var1;
				if (var0.sv_fld) {
					GroundObjectSpawned var19 = new GroundObjectSpawned();
					var19.setTile(var13);
					var19.setGroundObject(var12);
					og.ci_fld.getCallbacks().post(var19);
				}

				if (var0.sv_fld && client.fa_fld != null) {
					client.fa_fld.invalidateZone(var0, var9 >> 3, var10 >> 3);
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILem;IZJI)Z"
	)
	boolean by(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, em var9, int var10, boolean var11, long var12, int var14) {
		try {
			int var15 = var2 + this.jh_fld;
			int var16 = var3 + this.jh_fld;
			if (var11) {
				boolean var17 = og.ci_fld.getCallbacks().draw(var9, false);
				if (!var17) {
					if ((var6 & 127) == 64 && (var7 & 127) == 64 && var9 instanceof da && ((da)var9).bv_fld * -2106839931 == 1) {
						int var33 = var6 >> 7;
						int var35 = var7 >> 7;
						this.fj_fld.ar_fld[var33][var35] = -1;
					}

					return false;
				}
			}

			for (int var27 = var15; var27 < var15 + var4; var27++) {
				for (int var18 = var16; var18 < var16 + var5; var18++) {
					if (var27 < 0 || var18 < 0 || var27 >= this.cc_fld || var18 >= this.cq_fld) {
						return false;
					}

					int var19 = this.ra(var1, var27, var18);
					if (this.mx(var19) && this.ib_fld[var19] >= 5) {
						return false;
					}
				}
			}

			fj var28;
			if (var11) {
				var28 = (fj)(fj)uz_fld.pollLast();
				if (var28 == null) {
					var28 = new fj();
				}

				var28.au_fld = 0;
				var28.al_fld = 0;
			} else {
				var28 = new fj();
			}

			var28.ug(var12);
			var28.cx(var14);
			var28.hg(var1);
			var28.us(var6);
			var28.yg(var7);
			var28.kr(var8);
			var28.nv(var9);
			var28.de(var10);
			var28.ay_fld = var2;
			var28.ar_fld = var3;
			var28.as_fld = var2 + var4 - 1;
			var28.af_fld = var3 + var5 - 1;
			if (var11) {
				rl17 var29 = this.tb_fld[var15 >> 3][var16 >> 3];
				var29.pn_fld.add(var28);
			} else if (var9 instanceof dz) {
				rl17 var30 = this.tb_fld[var15 >> 3][var16 >> 3];
				var30.wu_fld.add(var28);
				this.lp((dz)var9);
			}

			this.pd(var9, var10, var6, var8, var7, var2, var3);

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
						int var22 = this.ra(var21, var31, var34);
						if (this.iy_fld[var21][var31][var34] == null) {
							this.iy_fld[var21][var31][var34] = new rl10(this, var22);
							this.nd(var21, var31, var34);
						}

						if (!this.mx(var22)) {
							this.ir(var22, var21, var31, var34);
						}
					}

					int var36 = this.ra(var1, var31, var34);
					byte var37 = this.ib_fld[var36];
					this.vh_fld[var36 * 5 + var37] = var28;
					this.in_Arrbyte[var36 * 5 + var37] = (byte)var20;
					this.vj_fld[var36] = (byte)(this.vj_fld[var36] | var20);
					this.ib_fld[var36]++;
				}
			}

			if (!var11 && this.sv_fld) {
				if (!qd_fld && var9 instanceof da) {
					throw new AssertionError();
				}

				if (!qd_fld && var9 instanceof bc) {
					throw new AssertionError();
				}

				if (!qd_fld && var9 instanceof bt) {
					throw new AssertionError();
				}

				if (!qd_fld && var9 instanceof ev) {
					throw new AssertionError();
				}

				client.ii_fld.trace("Game object spawn: {}", var28.getId());
				GameObjectSpawned var32 = new GameObjectSpawned();
				var32.setTile(this.iy_fld[var1][var15][var16]);
				var32.setGameObject(var28);
				og.ci_fld.getCallbacks().post(var32);
				int var24 = this.ra(var1, var2, var3);
				this.fl_fld[var24] = this.fl_fld[var24] | 1080863910568919040L;
			}

			if (this.sv_fld && !var11 && client.fa_fld != null) {
				client.fa_fld.invalidateZone(this, var15 >> 3, var16 >> 3);
			}

			return true;
		} catch (Throwable var26) {
			throw new RuntimeException(var26);
		}
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfw;Z)V"
	)
	public static void vi(ev var0, fw var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cp_fld = 0;

		for (int var3 = var0.cf_fld; var3 < var0.cd_fld; var3++) {
			ei[][] var4 = var0.bl_fld[var3];

			for (int var5 = var0.cn_fld; var5 < var0.cr_fld; var5++) {
				for (int var6 = var0.ca_fld; var6 < var0.cg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null
						&& var7.ad_fld <= var0.bx_fld
						&& (
							!var2
								|| dh(var0, var5 - var0.cm_fld + var0.df_fld + var0.di_fld, var6 - var0.cz_fld + var0.de_fld + var0.di_fld)
								|| var0.cs_fld[var3][var5][var6] - var0.cx_fld >= 76429667
						)) {
						var0.dw(var1, var7);
					}
				}
			}
		}

		var0.dr();
		fc.ar_fld.au_fld.ae(var0.bd_fld);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(IIIIILem;IJZ)V"
	)
	public void dz(int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, boolean var10) {
		try {
			this.bj(var1, var2, var3, var4, var5, var6, var7, var8, var10);
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int es() {
		return this.do_fld;
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ep() {
		return this.do_fld;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "([IIIII)V"
	)
	public void jq(int[] var1, int var2, int var3, int var4, int var5) {
		this.js(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void kx(int var1, int var2) {
		this.wf_fld[var2] = this.wf_fld[var1];
		this.oy_fld[var2] = this.oy_fld[var1];
		this.fr_fld[var2] = this.fr_fld[var1];
		this.rs_fld[var2] = this.rs_fld[var1];
		this.ow_fld[var2] = this.ow_fld[var1];
		this.kg_fld[var2] = this.kg_fld[var1];
		this.ee_fld[var2] = this.ee_fld[var1];
		this.ib_fld[var2] = this.ib_fld[var1];

		for (int var3 = 0; var3 < 5; var3++) {
			this.vh_fld[var2 * 5 + var3] = this.vh_fld[var1 * 5 + var3];
			this.in_Arrbyte[var2 * 5 + var3] = this.in_Arrbyte[var1 * 5 + var3];
		}

		this.vj_fld[var2] = this.vj_fld[var1];
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(ILfn;)V"
	)
	public void eb(int var1, fn var2) {
		this.do_fld = var1;
		this.dd_fld = var2;
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Lrl17;III)V"
	)
	public void on(rl17 var1, int var2, int var3, int var4) {
		var1.su_fld = Math.min(var1.su_fld, var4);
		var1.lp_fld = Math.max(var1.lp_fld, var4);
		boolean var5 = (var2 & 7) == 0 && var2 > 0;
		boolean var6 = (var3 & 7) == 0 && var3 > 0;
		if (var5) {
			rl17 var7 = this.tb_fld[(var2 >> 3) - 1][var3 >> 3];
			var7.su_fld = Math.min(var7.su_fld, var4);
			var7.lp_fld = Math.max(var7.lp_fld, var4);
		}

		if (var6) {
			rl17 var8 = this.tb_fld[var2 >> 3][(var3 >> 3) - 1];
			var8.su_fld = Math.min(var8.su_fld, var4);
			var8.lp_fld = Math.max(var8.lp_fld, var4);
		}

		if (var6 && var5) {
			rl17 var9 = this.tb_fld[(var2 >> 3) - 1][(var3 >> 3) - 1];
			var9.su_fld = Math.min(var9.su_fld, var4);
			var9.lp_fld = Math.max(var9.lp_fld, var4);
		}
	}

	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "(Lfw;)V"
	)
	public void sg(fw var1) {
		try {
			if (!qd_fld && og.ci_fld.isGpu()) {
				throw new AssertionError();
			} else {
				boolean var2 = this.hl_fld != 0 && this.aj_fld;
				this.cp_fld = 0;

				for (int var3 = this.cf_fld; var3 < this.cd_fld; var3++) {
					for (int var4 = this.cn_fld; var4 < this.cr_fld; var4++) {
						for (int var5 = this.ca_fld; var5 < this.cg_fld; var5++) {
							int var6 = this.ra(var3, var4, var5);
							if (this.mx(var6)) {
								int var7 = this.tx(var6);
								int var8 = this.pr_fld[this.fj_fld.ae_fld * -457350413][var4][var5];
								if ((var7 <= this.bx_fld || var2)
									&& (
										!this.aj_fld
											|| this.bs(var4 - this.cm_fld + this.df_fld + this.di_fld, var5 - this.cz_fld + this.de_fld + this.di_fld)
											|| this.cs_fld[var3][var4][var5] - this.cx_fld >= 2000
									)
									&& (!var2 || this.fj_fld.ae_fld * -457350413 >= var7 || var8 == 0 || !this.xc_java_util_Set.contains(var8))) {
									this.zy(var1, var6);
								}
							}
						}
					}
				}

				this.hv();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
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

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)J"
	)
	public static long lg(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		return var4 != null && var4.aa_fld != null ? var4.aa_fld.az_fld * 7130385936274174641L : 0L;
	}

	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;)V"
	)
	public void vh(fw var1, fw var2) {
		try {
			int var3 = this.cm_fld >> 3;
			int var4 = this.cz_fld >> 3;
			int var5 = vg_fld >> 3;
			int var6 = this.cc_fld >> 3;
			int var7 = this.cq_fld >> 3;
			this.uj_fld = 0;

			for (int var8 = -var5; var8 <= var5; var8++) {
				for (int var9 = -var5; var9 <= var5; var9++) {
					int var10 = var3 + var8;
					int var11 = var4 + var9;
					if (var10 >= 0 && var10 < var6 && var11 >= 0 && var11 < var7) {
						rl17 var12 = this.ek_fld[this.uj_fld++] = this.tb_fld[var10][var11];
						var12.ky_fld = false;
					}
				}
			}

			Arrays.sort(this.ek_fld, 0, this.uj_fld, this.kb_fld);
			rl23.qq(var1, this);

			for (int var15 = 0; var15 < this.uj_fld; var15++) {
				rl17 var18 = this.ek_fld[var15];
				if (!this.aj_fld || this.lj(var18, var18.go_fld, var18.kq_fld)) {
					var18.ky_fld = true;
					client.fa_fld.drawZoneOpaque(var2, this, var18.go_fld, var18.kq_fld);
					this.ij(var1, var2, var18, this.xc_java_util_Set);
					this.ke(var1, var2, var18);
				}
			}

			for (int var16 = this.uj_fld - 1; var16 >= 0; var16--) {
				rl17 var19 = this.ek_fld[var16];
				if (var19.ky_fld) {
					this.nt(var1, var2, var19);
				}
			}

			rl23.tv();
			rl23.gw();

			for (int var17 = this.uj_fld - 1; var17 >= 0; var17--) {
				rl17 var20 = this.ek_fld[var17];
				if (var20.ky_fld) {
					this.yk(var1, var20);
				}
			}

			client.fa_fld.drawPass(var2, this, 0);
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(IIIIILem;IJIIII)Z"
	)
	public boolean fz(int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		try {
			return var6 == null ? true : this.by(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("ym")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void ym(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.ai_fld = null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Ldz;Lnet/runelite/api/TileObject;IIIIJ)V"
	)
	public void az(fw var1, dz var2, TileObject var3, int var4, int var5, int var6, int var7, long var8) {
		try {
			if (!qd_fld && var2.ga_fld) {
				throw new AssertionError();
			} else {
				int var10 = client.jb_fld >> 7 & 15;
				if (var10 > 0) {
					var2.uf();
					rl23.ih(var3, var2, var4, var5, var6, var7);
				} else {
					fn var11;
					try {
						var11 = var2.getModel();
					} catch (Exception var14) {
						client.ii_fld.debug("exception drawing dynamic game entity", (Throwable)var14);
						return;
					}

					if (var11 != null) {
						var2.setModelHeight(var11.getModelHeight());
						int var12 = var2.getAnimationHeightOffset();
						client.fa_fld.drawDynamic(-1, var1, this, var3, var2, var11, var4, var5, var6 - var12, var7);
						client.iz(var1, this.pw_fld, var11, var4, var5, var6 - var12, var7, var8);
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lhs;II)I"
	)
	public static int oq(hs var0, int var1, int var2) {
		return var0.ag_fld[var1 + var2 * 64];
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean ih(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5);
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int ec(boolean var0) {
		return var0 ? 1 : -1264245581;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean jz(ev var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.dn(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = var0.cs_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > var0.cw_fld) {
						if (!var0.dj(var5, var7, var6)) {
							return false;
						}

						if (!var0.dj(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!var0.dj(var5, var8, var6)) {
							return false;
						}

						if (!var0.dj(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!var0.dj(var5, var9, var6)) {
						return false;
					}

					if (!var0.dj(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < var0.cy_fld) {
						if (!var0.dj(var5, var7, var6 + 128)) {
							return false;
						}

						if (!var0.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!var0.dj(var5, var8, var6 + 128)) {
							return false;
						}

						if (!var0.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!var0.dj(var5, var9, var6 + 128)) {
						return false;
					}

					if (!var0.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < var0.cw_fld) {
						if (!var0.dj(var5 + 128, var7, var6)) {
							return false;
						}

						if (!var0.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!var0.dj(var5 + 128, var8, var6)) {
							return false;
						}

						if (!var0.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!var0.dj(var5 + 128, var9, var6)) {
						return false;
					}

					if (!var0.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > var0.cy_fld) {
						if (!var0.dj(var5, var7, var6)) {
							return false;
						}

						if (!var0.dj(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!var0.dj(var5, var8, var6)) {
							return false;
						}

						if (!var0.dj(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!var0.dj(var5, var9, var6)) {
						return false;
					}

					if (!var0.dj(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!var0.dj(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return var0.dj(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return var0.dj(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return var0.dj(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? var0.dj(var5, var9, var6) : true;
			}
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int ez(boolean var0) {
		return var0 ? 1 : 128;
	}

	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "(Lfw;)V"
	)
	public void su(fw var1) {
		try {
			boolean var2 = this.hl_fld != 0 && this.aj_fld;
			int var3 = og.ci_fld.isGpu() ? vg_fld : this.di_fld;

			for (int var4 = this.cd_fld - 1; var4 >= this.cf_fld; var4--) {
				boolean var5 = this.zt(this.cw_fld, this.cx_fld, this.cy_fld, var4, this.cd_fld - 1 == var4);

				for (int var6 = this.cn_fld; var6 < this.cr_fld; var6++) {
					int var7 = var5 ? pl_fld[var6] : this.ca_fld;
					int var8 = var5 ? rz_Arrint[var6] : this.cg_fld - 1;

					for (int var9 = var7; var9 <= var8; var9++) {
						int var10 = this.ra(var4, var6, var9);
						if (this.mx(var10)) {
							int var11 = this.tx(var10);
							int var12 = this.pr_fld[this.fj_fld.ae_fld * -457350413][var6][var9];
							if ((var11 <= this.bx_fld || var2)
								&& (
									!this.aj_fld
										|| var5
										|| this.bs(var6 - this.cm_fld + this.df_fld + this.di_fld, var9 - this.cz_fld + this.de_fld + this.di_fld)
										|| this.cs_fld[var4][var6][var9] - this.cx_fld >= 2000
								)
								&& (!var2 || this.fj_fld.ae_fld * -457350413 >= var11 || var12 == 0 || !this.xc_java_util_Set.contains(var12))) {
								int var13 = this.wf_fld[var10];
								var13 |= 6;
								var13 |= this.ib_fld[var10] <= 0 && (var13 & 128) == 0 ? 0 : 8;
								var13 &= -16711697;
								this.wf_fld[var10] = var13;
								this.cp_fld++;
							} else {
								this.wf_fld[var10] = this.wf_fld[var10] & -23;
							}
						}
					}
				}
			}

			int var18 = Math.abs(this.df_fld);
			int var19 = Math.abs(this.de_fld);

			label143:
			for (int var20 = 0; var20 < 2; var20++) {
				boolean var21 = var20 == 0;

				for (int var22 = this.cf_fld; var22 < this.cd_fld; var22++) {
					for (int var23 = -(var18 + var3); var23 <= 0; var23++) {
						int var24 = var23 + this.cm_fld;
						int var25 = this.cm_fld - var23;
						if (var24 >= this.cn_fld || var25 < this.cr_fld) {
							for (int var26 = -(var19 + var3); var26 <= 0; var26++) {
								int var30 = var26 + this.cz_fld;
								int var14 = this.cz_fld - var26;
								if (var24 >= this.cn_fld && var24 < this.cr_fld) {
									if (var30 >= this.ca_fld && var30 < this.cg_fld) {
										int var15 = this.ra(var22, var24, var30);
										if ((this.wf_fld[var15] & 3) == 3) {
											this.nu(var1, var15, var21);
										}
									}

									if (var14 >= this.ca_fld && var14 < this.cg_fld) {
										int var31 = this.ra(var22, var24, var14);
										if ((this.wf_fld[var31] & 3) == 3) {
											this.nu(var1, var31, var21);
										}
									}
								}

								if (var25 >= this.cn_fld && var25 < this.cr_fld) {
									if (var30 >= this.ca_fld && var30 < this.cg_fld) {
										int var32 = this.ra(var22, var25, var30);
										if ((this.wf_fld[var32] & 3) == 3) {
											this.nu(var1, var32, var21);
										}
									}

									if (var14 >= this.ca_fld && var14 < this.cg_fld) {
										int var33 = this.ra(var22, var25, var14);
										if ((this.wf_fld[var33] & 3) == 3) {
											this.nu(var1, var33, var21);
										}
									}
								}

								if (this.cp_fld == 0) {
									break label143;
								}
							}
						}
					}
				}
			}

			this.hv();
		} catch (Throwable var17) {
			throw new RuntimeException(var17);
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int er(boolean var0) {
		return var0 ? 1 : 128;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lrl10;I[Ljava/util/Set;)V"
	)
	public void hw(rl10 var1, int var2, Set[] var3) {
		this.sd(var1.xq_fld);

		int var4;
		while ((var4 = this.bf()) != this.me_fld) {
			int var5 = var4 >> this.lo_fld & this.rl_fld;
			int var6 = var4 & this.ul_fld;
			int var7 = var4 >> this.ha_fld & 3;
			if (this.pr_fld[var7][var5][var6] == 0) {
				if (this.ny(var7, var5, var6)) {
					this.ts(var7, var5 - 1, var6);
					this.ts(var7, var5 + 1, var6);
					this.ts(var7, var5, var6 - 1);
					this.ts(var7, var5, var6 + 1);
					this.ts(var7, var5 - 1, var6 - 1);
					this.ts(var7, var5 + 1, var6 - 1);
					this.ts(var7, var5 - 1, var6 + 1);
					this.ts(var7, var5 + 1, var6 + 1);
				}

				this.pr_fld[var7][var5][var6] = var2;
				int var8 = var7 + 1;

				for (int var9 = 0; var8 < 4; var9++) {
					int var10 = this.pr_fld[var8][var5][var6];
					if (var10 != 0) {
						var3[var9].add(var10);
						break;
					}

					var10 = var2 | var9 + 1 << 28;
					this.pr_fld[var8][var5][var6] = var10;
					var3[var9].add(var10);
					var8++;
				}
			}
		}

		for (int var11 = 0; var11 < 3; var11++) {
			Set var12 = var3[var11];
			if (var12.size() > 0) {
				this.gr_fld.put(var2 | var11 << 28, var12.stream().mapToInt(var0 -> ((Integer)var0).intValue()).toArray());
				var12.clear();
			}
		}
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

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void oa(int var1, int var2) {
		this.at(var1, var2);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean bs(int var1, int var2) {
		return dh(this, var1, var2);
	}

	@ObfuscatedName("getInstanceTemplateChunks")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	@Override
	public int[][][] getInstanceTemplateChunks() {
		return this.xl_fld;
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lef;"
	)
	public static ef oy(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var2 += var0.jh_fld;
			var3 += var0.jh_fld;
			int var4 = var0.ra(var1, var2, var3);
			return var0.mx(var4) ? var0.kg_fld[var4] : null;
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

	@ObfuscatedName("getRoofs")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	@Override
	public int[][][] getRoofs() {
		return this.pr_fld;
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

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean jl(int var1, int var2) {
		if (!this.cl(this.eo_fld, this.ec_fld, var1, var2)) {
			return this.lv(this.eo_fld, this.ec_fld, var1, var2);
		} else {
			this.cu(this.eo_fld, this.ec_fld, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; var4++) {
				for (int var5 = -1; var5 <= 1; var5++) {
					if (this.ch(this.eo_fld, this.ec_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.eo_fld, (this.ec_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.eo_fld + 1, this.ec_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.eo_fld + 1, (this.ec_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.cb(this.eo_fld, this.ec_fld, var1, var2, var3);
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "([IIIII)V"
	)
	public void jh(int[] var1, int var2, int var3, int var4, int var5) {
		this.dm_fld = var1;
		this.dj_fld = var2;
		this.es_fld = var3;
		this.ep_fld = var4;
		this.eb_fld = var5;
		this.ds_fld = 0;
		this.du_fld = 0;
		this.db_fld = var4;
		this.dg_fld = var5;
		this.dk_fld = var4 / 2;
		this.dx_fld = var5 / 2;
		this.et_fld.set(0, this.et_fld.size());
		this.ex_fld.set(0, this.ex_fld.size());
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void em(int var1) {
		this.cf_fld = var1;

		for (int var2 = 0; var2 < this.cc_fld; var2++) {
			for (int var3 = 0; var3 < this.cq_fld; var3++) {
				if (this.bl_fld[var1][var2][var3] == null) {
					this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIZ)Z"
	)
	public static boolean oh(ev var0, int var1, int var2, int var3, int var4, boolean var5) {
		return rl16.ie(var0, var0.ex_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void el(int var1) {
		this.cf_fld = var1;

		for (int var2 = 0; var2 < this.cc_fld; var2++) {
			for (int var3 = 0; var3 < this.cq_fld; var3++) {
				if (this.bl_fld[var1][var2][var3] == null) {
					this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ky(int var1, int var2, int var3, int var4) {
		if (!this.dn(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.cs_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.cw_fld) {
						if (!this.dj(var5, var7, var6)) {
							return false;
						}

						if (!this.dj(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6)) {
							return false;
						}

						if (!this.dj(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6)) {
						return false;
					}

					if (!this.dj(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.cy_fld) {
						if (!this.dj(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.cw_fld) {
						if (!this.dj(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.cy_fld) {
						if (!this.dj(var5, var7, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.dj(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.dj(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.dj(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.dj(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? this.dj(var5, var9, var6) : true;
			}
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void lb(int var1) {
		this.by_fld = var1;
		this.bu_fld = -1;
		this.bn_fld = -1;
		this.bc_fld = -1.0F;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIILem;Lem;IIIIIIJI)V"
	)
	public static void ii(
		ev var0, int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13, int var15
	) {
		if (var0 == null) {
			var0.getClass();
		}

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
				if (var0.bl_fld[var17][var2][var3] == null) {
					var0.bl_fld[var17][var2][var3] = new ei(var17, var2, var3);
				}
			}

			var0.bl_fld[var1][var2][var3].aa_fld = var16;
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
		this.dq_fld[var1][this.dp_fld[var1]++] = var9;
	}

	@ObfuscatedName("getTileHeights")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	@Override
	public int[][][] getTileHeights() {
		return this.cs_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)Lfv;"
	)
	public fv bq(int var1, int var2, int var3) {
		var2 += this.jh_fld;
		var3 += this.jh_fld;
		int var4 = this.ra(var1, var2, var3);
		return this.mx(var4) ? this.ow_fld[var4] : null;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public void fo(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
		this.dq_fld[var1][this.dp_fld[var1]++] = var9;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void iz(int var1, int var2) {
		if (!qd_fld && (var2 & 15) != var2) {
			throw new AssertionError();
		} else {
			this.wf_fld[var1] = this.wf_fld[var1] & -983041;
			this.wf_fld[var1] = this.wf_fld[var1] | var2 << 16;
		}
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

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIIIIIIII)V"
	)
	public void fv(
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

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Z"
	)
	public static boolean nb(ev var0, int var1, int var2, int var3) {
		int var4 = var0.cv_fld[var1][var2][var3];
		if (var4 == -var0.ce_fld) {
			return false;
		} else if (var4 == var0.ce_fld) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (var0.dj(var5 + 1, var0.cs_fld[var1][var2][var3], var6 + 1)
				&& var0.dj(var5 + 128 - 1, var0.cs_fld[var1][var2 + 1][var3], var6 + 1)
				&& var0.dj(var5 + 128 - 1, var0.cs_fld[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
				&& var0.dj(var5 + 1, var0.cs_fld[var1][var2][var3 + 1], var6 + 128 - 1)) {
				var0.cv_fld[var1][var2][var3] = var0.ce_fld;
				return true;
			} else {
				var0.cv_fld[var1][var2][var3] = -var0.ce_fld;
				return false;
			}
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIIIIIIII)V"
	)
	public void fj(
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

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "()[[[Lrl10;"
	)
	public rl10[][][] getTiles() {
		return this.in_ArrArrArrrl10;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfj;II)I"
	)
	public static int ay(ev var0, fj var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = var2 - var1.ay_fld;
		int var5 = var1.as_fld - var2;
		if (var5 > var4) {
			var4 = var5;
		}

		int var6 = var3 - var1.ar_fld;
		int var7 = var1.af_fld - var3;
		return var7 > var6 ? var4 + var7 : var4 + var6;
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean mh(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.bg_fld; var4++) {
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

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIIIII)V"
	)
	public static void or(ev var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var0 == null) {
			var0.getClass();
		}

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
		var0.dq_fld[var1][var0.dp_fld[var1]++] = var9;
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
		this.dq_fld[var1][this.dp_fld[var1]++] = var9;
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
					var7.eu();
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
					var7.eu();
					if (var7.ez_fld > var4) {
						var4 = var7.ez_fld * 749891428;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("yt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void yt(int var0) throws EOFException {
		try {
			dx var1 = bw.dk_fld;
			ev var2 = var1.az_fld;
			if (var2.ju_fld.get(var0)) {
				var2.qq();
			}

			for (int var3 = 0; var3 < var1.am_fld.hs(); var3++) {
				rg var4 = (rg)var1.an_fld.get(var1.am_fld.ah(var3));
				var4.ah_fld.az_fld.qq();
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)V"
	)
	public static void fo(ev var0, int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)J"
	)
	public static long sg(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		return var4 != null && var4.aa_fld != null ? var4.aa_fld.az_fld * 7130385936274174641L : 0L;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void fw(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.av_fld = var5;
		var11.ag_fld = var2 * -500082803 + -1213858179;
		var11.az_fld = var3 * -68472369 + 1375606873;
		var11.ak_fld = var4 * 139491910;
		var11.aw_fld = var6;
		var11.ae_fld = var8;
		var11.ah_fld = var9;
		var11.ay_fld = var10 * 336885059;
		if (this.bl_fld[var1][var2][var3] == null) {
			this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		this.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void mr(int var1, int var2) {
		if (!qd_fld && (var2 & 0xFF) != var2) {
			throw new AssertionError();
		} else {
			this.wf_fld[var1] = this.wf_fld[var1] & 16777215;
			this.wf_fld[var1] = this.wf_fld[var1] | var2 << 24;
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void fn(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.av_fld = var5;
		var11.ag_fld = var2 * -1810046336 + -905023168;
		var11.az_fld = var3 * -1839159424 + 1227903936;
		var11.ak_fld = var4;
		var11.aw_fld = var6;
		var11.ae_fld = var8;
		var11.ah_fld = var9;
		var11.ay_fld = var10;
		if (this.bl_fld[var1][var2][var3] == null) {
			this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		this.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ew() {
		this.do_fld = -1;
		this.dd_fld = null;
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Lfw;IZ)V"
	)
	public void nu(fw var1, int var2, boolean var3) {
		try {
			this.sd(var2);

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
					var4 = this.bf();
					if (var4 == this.me_fld) {
						return;
					}

					if (this.qc(var4)) {
						var5 = var4 >> this.lo_fld & this.rl_fld;
						var6 = var4 & this.ul_fld;
						var7 = var4 >> this.ha_fld & 3;
						var8 = this.ya(var4);
						int var9 = this.tx(var4);
						var10 = var5 - this.jh_fld;
						var11 = var6 - this.jh_fld;
						var12 = this.wf_fld[var4];
						if (!this.vc(var4)) {
							break;
						}

						if (var3) {
							if (var7 > 0) {
								int var13 = var4 - this.sy_fld;
								if (this.mx(var13) && this.qc(var13)) {
									continue;
								}
							}

							if (var5 <= this.cm_fld && var5 > this.cn_fld) {
								int var27 = var4 - this.ze_fld;
								if (this.mx(var27) && this.qc(var27) && (this.vc(var27) || (this.vj_fld[var4] & 1) == 0)) {
									continue;
								}
							}

							if (var5 >= this.cm_fld && var5 < this.cr_fld - 1) {
								int var28 = var4 + this.ze_fld;
								if (this.mx(var28) && this.qc(var28) && (this.vc(var28) || (this.vj_fld[var4] & 4) == 0)) {
									continue;
								}
							}

							if (var6 <= this.cz_fld && var6 > this.ca_fld) {
								int var29 = var4 - this.vn_fld;
								if (this.mx(var29) && this.qc(var29) && (this.vc(var29) || (this.vj_fld[var4] & 8) == 0)) {
									continue;
								}
							}

							if (var6 >= this.cz_fld && var6 < this.cg_fld - 1) {
								int var30 = var4 + this.vn_fld;
								if (this.mx(var30) && this.qc(var30) && (this.vc(var30) || (this.vj_fld[var4] & 2) == 0)) {
									continue;
								}
							}
						} else {
							var3 = true;
						}

						var12 = this.wf_fld[var4] = this.wf_fld[var4] & -3;
						if ((var12 & 32) != 0) {
							int var31 = this.ra(3, var5, var6);
							int var14 = this.wf_fld[var31];
							if ((var14 & 256) != 0) {
								if (!this.to(0, var5, var6)) {
									var1.jq(this, this.oy_fld[var31], 0, 0, var10, var11);
								}
							} else if ((var14 & 1024) != 0 && !this.to(0, var5, var6)) {
								var1.za(this, this.fr_fld[var31], 0, var10, var11);
							}

							if ((var14 & 16384) != 0) {
								fs var15 = this.rs_fld[var31];
								this.rw(var1, var15.ak_fld, 0, var15.ae_fld, var15.av_fld, var15.ah_fld, var15.az_fld);
							}

							for (int var56 = 0; var56 < this.ib_fld[var31]; var56++) {
								fj var16 = this.vh_fld[var31 * 5 + var56];
								if (var16 != null) {
									this.rw(var1, var16.ak_fld, var16.ag_fld, var16.ah_fld, var16.ae_fld, var16.aw_fld, var16.az_fld);
								}
							}
						}

						boolean var32 = false;
						if ((var12 & 256) != 0) {
							if (!this.to(var8, var5, var6)) {
								var32 = true;
								if ((var12 & 512) != 0 || var7 <= this.dh_fld) {
									fa var47 = this.oy_fld[var4];
									var1.jq(this, var47, var9, var8, var10, var11);
								}
							}
						} else if ((var12 & 1024) != 0 && !this.to(var8, var5, var6)) {
							var32 = true;
							var1.za(this, this.fr_fld[var4], var9, var10, var11);
						}

						int var48 = 0;
						int var57 = 0;
						int var63 = 0;
						if ((var12 & 49152) != 0) {
							if (var5 == this.cm_fld) {
								var48++;
							} else if (this.cm_fld < var5) {
								var48 += 2;
							}

							if (var6 == this.cz_fld) {
								var48 += 3;
							} else if (this.cz_fld > var6) {
								var48 += 6;
							}

							var57 = an_fld[var48];
							int var17 = ai_fld[var48];
							this.mr(var4, var17);
							var63 = aa_fld[var48];
							if (!qd_fld && (~(var57 | var17) & 0xFF) != var63) {
								throw new AssertionError();
							}
						}

						if ((var12 & 16384) != 0) {
							fs var70 = this.rs_fld[var4];
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

								this.iz(var4, var18);
								this.xe(var4, var19);
								if (!qd_fld && (var18 ^ var19) != var18 - var19) {
									throw new AssertionError();
								}

								var12 = this.wf_fld[var4] = this.wf_fld[var4] | 16;
							}

							if ((var70.aw_fld & var57) != 0 && !this.uf(var8, var5, var6, var70.aw_fld)) {
								this.rw(var1, var70.ak_fld, 0, var70.ae_fld, var70.av_fld, var70.ah_fld, var70.az_fld);
							}

							if ((var70.ay_fld & var57) != 0 && !this.uf(var8, var5, var6, var70.ay_fld)) {
								this.rw(var1, var70.ag_fld, 0, var70.ae_fld, var70.av_fld, var70.ah_fld, var70.az_fld);
							}
						}

						if ((var12 & 32768) != 0) {
							fv var71 = this.ow_fld[var4];
							if (!this.po(var8, var5, var6, var71.ak_fld.ez_fld * -1271205903)) {
								if ((var71.aw_fld & var57) != 0) {
									this.rw(var1, var71.ak_fld, 0, var71.ae_fld + var71.as_fld, var71.av_fld, var71.ah_fld + var71.ar_fld, var71.az_fld);
								} else if (var71.aw_fld == 256) {
									int var79 = var71.ae_fld - this.cw_fld;
									int var88 = var71.ah_fld - this.cy_fld;
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
										this.rw(var1, var71.ak_fld, 0, var71.ae_fld + var71.as_fld, var71.av_fld, var71.ah_fld + var71.ar_fld, var71.az_fld);
									} else if (var71.ag_fld != null) {
										this.rw(var1, var71.ag_fld, 0, var71.ae_fld + var71.af_fld, var71.av_fld, var71.ah_fld + var71.al_fld, var71.az_fld);
									}
								}
							}
						}

						if (var32) {
							if ((this.wf_fld[var4] & 2048) != 0) {
								ef var72 = this.kg_fld[var4];
								this.rw(var1, var72.ak_fld, 0, var72.av_fld, var72.az_fld, var72.ae_fld, var72.ag_fld);
							}

							if ((this.wf_fld[var4] & 4096) != 0) {
								en var73 = this.ee_fld[var4];
								if (var73.ae_fld != null) {
									this.rw(var1, var73.ae_fld, 0, var73.ag_fld, var73.ak_fld, var73.az_fld, var73.aw_fld);
								}

								if (var73.ah_fld != null) {
									this.rw(var1, var73.ah_fld, 0, var73.ag_fld, var73.ak_fld, var73.az_fld, var73.aw_fld);
								}

								if (var73.av_fld != null) {
									this.rw(var1, var73.av_fld, 0, var73.ag_fld, var73.ak_fld, var73.az_fld, var73.aw_fld);
								}
							}
						}

						byte var74 = this.vj_fld[var4];
						if (var5 < this.cm_fld && var5 >= this.cn_fld && var5 < this.cr_fld - 1 && (var74 & 4) != 0) {
							int var80 = var4 + this.ze_fld;
							if (this.mx(var80) && this.qc(var80)) {
								this.sd(var80);
							}
						}

						if (var6 < this.cz_fld && var6 >= this.ca_fld && var6 < this.cg_fld - 1 && (var74 & 2) != 0) {
							int var81 = var4 + this.vn_fld;
							if (this.mx(var81) && this.qc(var81)) {
								this.sd(var81);
							}
						}

						if (var5 > this.cm_fld && var5 > this.cn_fld && var5 < this.cr_fld && (var74 & 1) != 0) {
							int var82 = var4 - this.ze_fld;
							if (this.mx(var82) && this.qc(var82)) {
								this.sd(var82);
							}
						}

						if (var6 > this.cz_fld && var6 > this.ca_fld && var6 < this.cg_fld && (var74 & 8) != 0) {
							int var83 = var4 - this.vn_fld;
							if (this.mx(var83) && this.qc(var83)) {
								this.sd(var83);
							}
						}
						break;
					}
				}

				if ((var12 & 16) != 0) {
					boolean var33 = true;

					for (int var49 = 0; var49 < this.ib_fld[var4]; var49++) {
						fj var58 = this.vh_fld[var4 * 5 + var49];
						byte var64 = this.in_Arrbyte[var4 * 5 + var49];
						if (var58.au_fld != this.ce_fld && (var64 & this.uo(var4)) == this.og(var4)) {
							var33 = false;
							break;
						}
					}

					if (var33) {
						fs var50 = this.rs_fld[var4];
						if (!this.uf(var8, var5, var6, var50.aw_fld)) {
							this.rw(var1, var50.ak_fld, 0, var50.ae_fld, var50.av_fld, var50.ah_fld, var50.az_fld);
						}

						var12 = this.wf_fld[var4] = this.wf_fld[var4] & -17;
					}
				}

				if ((var12 & 8) != 0) {
					try {
						var12 = this.wf_fld[var4] = this.wf_fld[var4] & -9;
						int var34 = 0;

						label616:
						for (int var51 = 0; var51 < this.ib_fld[var4]; var51++) {
							fj var59 = this.vh_fld[var4 * 5 + var51];
							if (var59.au_fld != this.ce_fld) {
								for (int var65 = var59.ay_fld; var65 <= var59.as_fld; var65++) {
									for (int var75 = var59.ar_fld; var75 <= var59.af_fld; var75++) {
										int var84 = var65 + this.jh_fld;
										int var89 = var75 + this.jh_fld;
										int var92 = this.ra(var7, var84, var89);
										if (this.vc(var92)) {
											var12 = this.wf_fld[var4] = this.wf_fld[var4] | 8;
											continue label616;
										}

										if ((this.wf_fld[var92] & 16) != 0) {
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

											int var98 = this.uo(var4) ^ this.og(var4);
											if ((var95 & this.uo(var92)) == var98) {
												var12 = this.wf_fld[var4] = this.wf_fld[var4] | 8;
												continue label616;
											}
										}
									}
								}

								if (!qd_fld && var34 >= 5) {
									throw new AssertionError();
								}

								this.cl_fld[var34++] = var59;
								var59.al_fld = this.se(var59, this.cm_fld - this.jh_fld, this.cz_fld - this.jh_fld);
							}
						}

						if ((var12 & 128) != 0) {
							rl17 var52 = this.tb_fld[var5 >> 3][var6 >> 3];

							for (int var60 = 0; var60 < var52.pn_fld.size(); var60++) {
								fj var66 = (fj)(fj)var52.pn_fld.get(var60);
								if (var66.ak_fld instanceof rq && var66.au_fld != this.ce_fld && var66.ay_fld == var10 && var66.ar_fld == var11 && var34 < 55) {
									if (!qd_fld && var34 >= 55) {
										throw new AssertionError();
									}

									this.cl_fld[var34++] = var66;
									var66.al_fld = this.se(var66, this.cm_fld - this.jh_fld, this.cz_fld - this.jh_fld);
								}
							}
						}

						while (true) {
							int var53 = -50;
							int var61 = -1;

							for (int var67 = 0; var67 < var34; var67++) {
								fj var76 = this.cl_fld[var67];
								if (var76.au_fld != this.ce_fld) {
									if (var76.al_fld > var53) {
										var53 = var76.al_fld;
										var61 = var67;
									} else if (var53 == var76.al_fld) {
										int var85 = var76.ah_fld - this.cw_fld;
										int var90 = var76.aw_fld - this.cy_fld;
										int var93 = this.cl_fld[var61].ah_fld * -564370133 - this.cw_fld;
										int var96 = this.cl_fld[var61].aw_fld * -502866077 - this.cy_fld;
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
							var68.au_fld = this.ce_fld;
							this.rw(var1, var68.ak_fld, var68.ag_fld, var68.ah_fld, var68.ae_fld, var68.aw_fld, var68.az_fld);

							for (int var77 = var68.ay_fld; var77 <= var68.as_fld; var77++) {
								for (int var86 = var68.ar_fld; var86 <= var68.af_fld; var86++) {
									int var91 = var77 + this.jh_fld;
									int var94 = var86 + this.jh_fld;
									int var97 = this.ra(var7, var91, var94);
									if ((this.wf_fld[var97] & 16) != 0) {
										this.sd(var97);
									} else if ((var91 != var5 || var94 != var6) && this.qc(var97)) {
										this.sd(var97);
									}
								}
							}
						}
					} catch (Exception var24) {
						client.ii_fld.debug("exception drawing game entity", (Throwable)var24);
						var12 = this.wf_fld[var4] = this.wf_fld[var4] & -9;
					}
				}

				if (!this.qc(var4)) {
					if (!qd_fld) {
						throw new AssertionError("tile needs backside draw");
					}
				} else if ((var12 & 16) == 0) {
					if (var5 <= this.cm_fld && var5 > this.cn_fld) {
						int var35 = var4 - this.ze_fld;
						if (this.mx(var35) && this.qc(var35)) {
							continue;
						}
					}

					if (var5 >= this.cm_fld && var5 < this.cr_fld - 1) {
						int var36 = var4 + this.ze_fld;
						if (this.mx(var36) && this.qc(var36)) {
							continue;
						}
					}

					if (var6 <= this.cz_fld && var6 > this.ca_fld) {
						int var37 = var4 - this.vn_fld;
						if (this.mx(var37) && this.qc(var37)) {
							continue;
						}
					}

					if (var6 >= this.cz_fld && var6 < this.cg_fld - 1) {
						int var38 = var4 + this.vn_fld;
						if (this.mx(var38) && this.qc(var38)) {
							continue;
						}
					}

					var12 = this.wf_fld[var4] = this.wf_fld[var4] & -5;
					this.cp_fld--;
					if ((var12 & 8192) != 0) {
						en var39 = this.ee_fld[var4];
						if (var39.ae_fld != null) {
							this.rw(var1, var39.ae_fld, 0, var39.ag_fld, var39.ak_fld - var39.ay_fld, var39.az_fld, var39.aw_fld);
						}

						if (var39.ah_fld != null) {
							this.rw(var1, var39.ah_fld, 0, var39.ag_fld, var39.ak_fld - var39.ay_fld, var39.az_fld, var39.aw_fld);
						}

						if (var39.av_fld != null) {
							this.rw(var1, var39.av_fld, 0, var39.ag_fld, var39.ak_fld - var39.ay_fld, var39.az_fld, var39.aw_fld);
						}
					}

					if ((var12 & 49152) != 0 && this.rj(var4) != 0) {
						if ((var12 & 32768) != 0) {
							fv var40 = this.ow_fld[var4];
							if (!this.po(var8, var5, var6, var40.ak_fld.ez_fld * -1271205903)) {
								if ((var40.aw_fld & this.rj(var4)) != 0) {
									this.rw(var1, var40.ak_fld, 0, var40.ae_fld + var40.as_fld, var40.av_fld, var40.ah_fld + var40.ar_fld, var40.az_fld);
								} else if (var40.aw_fld == 256) {
									int var54 = var40.ae_fld - this.cw_fld;
									int var62 = var40.ah_fld - this.cy_fld;
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
										this.rw(var1, var40.ak_fld, 0, var40.ae_fld + var40.as_fld, var40.av_fld, var40.ah_fld + var40.ar_fld, var40.az_fld);
									} else if (var40.ag_fld != null) {
										this.rw(var1, var40.ag_fld, 0, var40.ae_fld + var40.af_fld, var40.av_fld, var40.ah_fld + var40.al_fld, var40.az_fld);
									}
								}
							}
						}

						if ((var12 & 16384) != 0) {
							fs var41 = this.rs_fld[var4];
							int var55 = this.rj(var4);
							if ((var41.ay_fld & var55) != 0 && !this.uf(var8, var5, var6, var41.ay_fld)) {
								this.rw(var1, var41.ag_fld, 0, var41.ae_fld, var41.av_fld, var41.ah_fld, var41.az_fld);
							}

							if ((var41.aw_fld & var55) != 0 && !this.uf(var8, var5, var6, var41.aw_fld)) {
								this.rw(var1, var41.ak_fld, 0, var41.ae_fld, var41.av_fld, var41.ah_fld, var41.az_fld);
							}
						}
					}

					if (var7 < this.cd_fld - 1) {
						int var42 = var4 + this.sy_fld;
						if (this.mx(var42) && this.qc(var42)) {
							this.sd(var42);
						}
					}

					if (var5 < this.cm_fld && var5 >= this.cn_fld && var5 < this.cr_fld - 1) {
						int var43 = var4 + this.ze_fld;
						if (this.mx(var43) && this.qc(var43)) {
							this.sd(var43);
						}
					}

					if (var6 < this.cz_fld && var6 >= this.ca_fld && var6 < this.cg_fld - 1) {
						int var44 = var4 + this.vn_fld;
						if (this.mx(var44) && this.qc(var44)) {
							this.sd(var44);
						}
					}

					if (var5 > this.cm_fld && var5 > this.cn_fld && var5 < this.cr_fld) {
						int var45 = var4 - this.ze_fld;
						if (this.mx(var45) && this.qc(var45)) {
							this.sd(var45);
						}
					}

					if (var6 > this.cz_fld && var6 > this.ca_fld && var6 < this.cg_fld) {
						int var46 = var4 - this.vn_fld;
						if (this.mx(var46) && this.qc(var46)) {
							this.sd(var46);
						}
					}
				}
			}
		} catch (Throwable var25) {
			throw new RuntimeException(var25);
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	public static void js(ev var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.dw_fld; var1++) {
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

		var0.dw_fld = 0;
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

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfj;"
	)
	public static fj cn(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var4 = var2 + var0.jh_fld;
			int var5 = var3 + var0.jh_fld;
			int var6 = var0.ra(var1, var4, var5);
			if (!var0.mx(var6)) {
				return null;
			} else {
				byte var7 = var0.ib_fld[var6];

				for (int var8 = 0; var8 < var7; var8++) {
					fj var9 = var0.vh_fld[var6 * 5 + var8];
					long var10 = var9.az_fld;
					int var12 = (int)(var10 >> 16 & 7L);
					if (var12 == 2 && var2 == var9.ay_fld && var3 == var9.ar_fld) {
						return var9;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)V"
	)
	public static void di(ev var0, int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void lp(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		try {
			ee var15 = ee.yx_fld;
			float var16 = var15.tv_fld;
			float var17 = var15.jz_fld;
			float var18 = var15.ht_fld;
			ul var19 = ul.sw();
			var19.ak_fld.ov((float)client.vq(var1 & 2047), 0.0F, 0.0F);
			var19.ag_fld.bj(var4, var5, var6);
			ul var20 = ul.sw();
			var20.ag_fld.bj(-(this.cc_fld * 64) - this.bp_fld, this.bt_fld, -(this.cq_fld * 64) - this.bv_fld);
			uy var21 = ((ey)this.zy_fld).ak_fld;
			var21.he(var20);
			uy var22 = uy.bq();
			var22.ya(1.0F, this.bi_fld, 1.0F, 1.0F);
			var21.sa(var22);
			var21.sa(this.bo_fld);
			var22.he(var19);
			var21.sa(var22);
			var22.bz_void(var21);
			var22.cu();
			this.mu_fld = var22.jp(var16, var17, var18);
			this.sj_fld = var22.ay(var16, var17, var18);
			this.td_float = var22.jl(var16, var17, var18);
			this.cw_fld = (int)this.mu_fld;
			this.cx_fld = (int)this.sj_fld;
			this.cy_fld = (int)this.td_float;
			this.cm_fld = this.cw_fld >> 7;
			this.cz_fld = this.cy_fld >> 7;
			this.ck_fld = (int)var22.jp(var12, 0.0F, var13) >> 7;
			this.cb_fld = (int)var22.jl(var12, 0.0F, var13) >> 7;
			var19.ih();
			var20.ih();
			var22.bs();
			this.pw_fld.ak_fld.bz_void(var21);
			uc var23 = uc.zf_fld;
			var23.qb();
			var23.yi(-var15.if_fld);
			var23.ta(-var15.zv_fld);
			var23.zj(var16, var17, var18);
			uy var24 = uy.bq();
			var24.or(var23);
			var24.cu();
			var21.sa(var24);
			var24.bs();
			ej.bk_fld = false;
			((ey)this.zy_fld).az_fld = var10;
			if ((client.jb_fld & 16) != 0) {
				this.hh(true, var14);
				this.vh(this.zy_fld, this.pw_fld);
				fc.ar_fld.au_fld.ug(this.bd_fld);
			} else {
				this.hh(fc.ar_fld.aa_fld != 1, var14);
				if (fc.ar_fld.aa_fld == 0) {
					if (!qd_fld && !fc.al_fld.sw()) {
						throw new AssertionError();
					}

					if (!qd_fld && og.ci_fld.isGpu()) {
						throw new AssertionError();
					}

					this.sg(this.zy_fld);
				} else {
					this.su(this.zy_fld);
				}

				fc.ar_fld.au_fld.ug(this.bd_fld);
				if (client.fa_fld != null) {
					client.fa_fld.postDrawScene();
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

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean jn(int var1, int var2, int var3, int var4) {
		if (!this.df(var1, var2, var3, var4)) {
			return ml.hi(this, var1, var2, var3, var4);
		} else {
			og(this, var1, var2, var3, var4, false);
			int var5 = var1 * 32 + ay_fld;
			int var6 = var2 * 64;
			int var7 = (var3 - this.di_fld - this.df_fld - 1) * 128;
			int var8 = (var4 - this.di_fld - this.de_fld - 1) * 128;

			for (int var9 = -this.dj_fld; var9 <= this.es_fld; var9 += 128) {
				if (ry(this, var7, this.dm_fld[var1] + var9, var8, var5, var6)) {
					return this.ct(var1, var2, var3, var4, true);
				}
			}

			return this.ct(var1, var2, var3, var4, false);
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
				return this.by(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gd() {
		this.ab();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JI)V"
	)
	public void bd(int var1, int var2, int var3, int var4, em var5, long var6, int var8) {
		if (var5 != null) {
			ef var9 = new ef();
			var9.ak_fld = var5;
			var9.av_fld = var2 * -1166307200 + 1564330048;
			var9.ae_fld = var3 * 624443617 + 419027520;
			var9.az_fld = var4;
			var9.ag_fld = var6;
			var9.ag(var8, -448052585);
			if (this.bl_fld[var1][var2][var3] == null) {
				this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
			}

			this.bl_fld[var1][var2][var3].ai_fld = var9;
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IIIIILem;IJIIII)Z"
	)
	public boolean ff(int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		try {
			return var6 == null ? true : this.by(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILem;IZJI)Z"
	)
	boolean gg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, em var9, int var10, boolean var11, long var12, int var14) {
		for (int var15 = var2; var15 < var2 + var4; var15++) {
			for (int var16 = var3; var16 < var3 + var5; var16++) {
				if (var15 < 0 || var16 < 0 || var15 >= this.cc_fld || var16 >= this.cq_fld) {
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
					this.bx(var24);
				}

				var24.aw_fld[var24.ah_fld] = var21;
				var24.aq_fld[var24.ah_fld] = var18;
				var24.am_fld |= var18;
				var24.ah_fld++;
			}
		}

		return true;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lrl17;)Z"
	)
	public boolean lk(fw var1, rl17 var2) {
		int var3 = var2.go_fld;
		int var4 = var2.kq_fld;
		int var5 = ((var3 << 3) - this.jh_fld << 7) + (var2.yh_fld + var2.qf_fld) / 2;
		int var6 = (var2.lp_fld + var2.su_fld) / 2;
		int var7 = ((var4 << 3) - this.jh_fld << 7) + (var2.ac_fld + var2.el_fld) / 2;
		int var8 = (var2.qf_fld - var2.yh_fld + 1) / 2;
		int var9 = (var2.lp_fld - var2.su_fld + 1) / 2;
		int var10 = (var2.el_fld - var2.ac_fld + 1) / 2;
		return client.nm(var1, 0, 0, 0, var5, var6, var7, var8, var9, var10);
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
			if (var9 >= 0 && var10 >= 0 && var9 < this.cc_fld && var10 < this.cq_fld) {
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
					this.bx(var11);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ma(int var1) {
		this.wf_fld[var1] = 0;
		this.oy_fld[var1] = null;
		this.fr_fld[var1] = null;
		this.rs_fld[var1] = null;
		this.ow_fld[var1] = null;
		this.kg_fld[var1] = null;
		this.ee_fld[var1] = null;
		this.ib_fld[var1] = 0;

		for (int var2 = 0; var2 < 5; var2++) {
			this.vh_fld[var1 * 5 + var2] = null;
			this.in_Arrbyte[var1 * 5 + var2] = 0;
		}

		this.vj_fld[var1] = 0;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()[[[Lrl10;"
	)
	public rl10[][][] getExtendedTiles() {
		return this.iy_fld;
	}

	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean vc(int var1) {
		return (this.wf_fld[var1] & 2) != 0;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lei;)Z"
	)
	boolean gh(ei var1) {
		if (var1.as_fld != this.ce_fld) {
			var1.as_fld = this.ce_fld;
			var1.ay_fld = var1.ah_fld;
			if (this.dw_fld >= this.dy_fld.length) {
				this.dy_fld = (ei[])(ei[])Arrays.copyOf(this.dy_fld, this.dy_fld.length * 2);
			}

			this.dy_fld[this.dw_fld++] = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lei;)Z"
	)
	boolean gr(ei var1) {
		if (var1.as_fld != this.ce_fld) {
			var1.as_fld = this.ce_fld;
			var1.ay_fld = var1.ah_fld;
			if (this.dw_fld >= this.dy_fld.length) {
				this.dy_fld = (ei[])(ei[])Arrays.copyOf(this.dy_fld, this.dy_fld.length * 2);
			}

			this.dy_fld[this.dw_fld++] = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)V"
	)
	public static void ux(ev var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var5 = var0.ra(var1, var2, var3);
			if ((var0.la_fld[var1][var2][var3] & 8) != 0) {
				var0.wf_fld[var5] = var0.wf_fld[var5] | 64;
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gj() {
		for (int var1 = 0; var1 < this.dw_fld; var1++) {
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

		this.dw_fld = 0;
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	void gs(fj var1) {
		for (int var2 = var1.ay_fld * 1400629934; var2 <= var1.as_fld; var2++) {
			for (int var3 = var1.ar_fld * 938233720; var3 <= var1.af_fld; var3++) {
				ei var4 = this.bl_fld[var1.av_fld][var2][var3];
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

					this.bt(var4);
				}
			}
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

	@ObfuscatedName("getBaseX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBaseX() {
		return this.yr_fld;
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

	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "(Lfj;II)I"
	)
	public int se(fj var1, int var2, int var3) {
		return this.dy(var1, var2, var3);
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void gm(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int rj(int var1) {
		return this.wf_fld[var1] >> 24 & 0xFF;
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ir(int var1, int var2, int var3, int var4) {
		this.ma(var1);
		this.wf_fld[var1] = 1;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void gd(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.an_fld = null;
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

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "([IIIII)V"
	)
	public void js(int[] var1, int var2, int var3, int var4, int var5) {
		this.dm_fld = var1;
		this.dj_fld = var2;
		this.es_fld = var3;
		this.ep_fld = var4;
		this.eb_fld = var5;
		this.ds_fld = 0;
		this.du_fld = 0;
		this.db_fld = var4;
		this.dg_fld = var5;
		this.dk_fld = var4 / 2;
		this.dx_fld = var5 / 2;
		this.et_fld.set(0, this.et_fld.size());
		this.ex_fld.set(0, this.ex_fld.size());
	}

	@ObfuscatedName("getExtendedTileSettings")
	@ObfuscatedSignature(
		descriptor = "()[[[B"
	)
	@Override
	public byte[][][] getExtendedTileSettings() {
		return this.la_fld;
	}

	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfw;ZZ)V"
	)
	public static void ty(ev var0, fw var1, boolean var2, boolean var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ce_fld += 1046037205;
		var0.bd_fld.ae(fc.ar_fld.au_fld);
		fc.ar_fld.au_fld.ae(var0.bm_fld);
		if (var3) {
			var0.co_fld = !var2 && var0.dn_fld != er.ak_fld ? var0.ck_fld : var0.cm_fld;
			var0.cu_fld = !var2 && var0.dn_fld != er.ak_fld ? var0.cb_fld : var0.cz_fld;
			if (var0.aj_fld) {
				var0.cn_fld = var0.co_fld - var0.di_fld;
				if (var0.cn_fld < 0) {
					var0.cn_fld = 0;
				}

				var0.ca_fld = var0.cu_fld - var0.di_fld;
				if (var0.ca_fld < 0) {
					var0.ca_fld = 0;
				}

				var0.cr_fld = var0.co_fld + var0.di_fld;
				if (var0.cr_fld > var0.cc_fld) {
					var0.cr_fld = var0.cc_fld;
				}

				var0.cg_fld = var0.cu_fld + var0.di_fld;
				if (var0.cg_fld > var0.cq_fld) {
					var0.cg_fld = var0.cq_fld;
				}
			} else {
				var0.cn_fld = 0;
				var0.ca_fld = 0;
				var0.cr_fld = var0.cc_fld;
				var0.cg_fld = var0.cq_fld;
				var0.co_fld = var0.cc_fld / 2;
				var0.cu_fld = var0.cq_fld / 2;
				var0.di_fld = Math.max(var0.co_fld, var0.cu_fld);
			}

			var0.df_fld = var0.cm_fld - var0.co_fld;
			var0.de_fld = var0.cz_fld - var0.cu_fld;
			if (var0.aj_fld) {
				var0.di();
			}
		}

		if (fc.ar_fld.aa_fld == 0) {
			var0.du(var1, var0.aj_fld);
		} else {
			var0.db(var1, var0.aj_fld);
		}
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void on(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var2 += var0.jh_fld;
		var3 += var0.jh_fld;
		int var4 = var0.ra(var1, var2, var3);
		if (var0.mx(var4) && (var0.wf_fld[var4] & 2048) != 0) {
			ef var5 = var0.kg_fld[var4];
			var0.kg_fld[var4] = null;
			var0.wf_fld[var4] = var0.wf_fld[var4] & -2049;
			if (var5.ak_fld instanceof dz) {
				rl17 var6 = var0.tb_fld[var2 >> 3][var3 >> 3];
				var6.wu_fld.remove(var5);
			}

			if (var0.sv_fld) {
				GroundObjectDespawned var9 = new GroundObjectDespawned();
				var9.setTile(var0.iy_fld[var1][var2][var3]);
				var9.setGroundObject(var5);
				og.ci_fld.getCallbacks().post(var9);
			}

			if (var0.sv_fld && client.fa_fld != null) {
				client.fa_fld.invalidateZone(var0, var2 >> 3, var3 >> 3);
			}
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean dj(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.bg_fld; var4++) {
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

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void hb(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.ai_fld = null;
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int mz(int var1, int var2, int var3) {
		return this.cs_fld[var1][var2 + 1][var3 + 1] + this.cs_fld[var1][var2][var3] + this.cs_fld[var1][var2 + 1][var3] + this.cs_fld[var1][var2][var3 + 1] >> 2;
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

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	public void cw(er var1) {
		if (var1 != this.dn_fld) {
			this.dn_fld = var1;
			this.js(this.dm_fld, this.dj_fld, this.es_fld, this.ep_fld, this.eb_fld);
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(III)Lfv;"
	)
	public fv hd(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 == null ? null : var4.aa_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int ay(boolean var0) {
		return var0 ? 520 : 383;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)Lfj;"
	)
	public fj bg(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
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

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void pa() {
		int var1 = this.jo_fld;
		var1 <<= 1;
		this.of_fld[var1] = this.jo_fld;
		var1 = this.jo_fld;
		var1 = (var1 << 1) + 1;
		this.of_fld[var1] = this.jo_fld;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;Lrl17;Ljava/util/Set;)V"
	)
	public void ij(fw var1, fw var2, rl17 var3, Set var4) {
		try {
			for (int var5 = 0; var5 < var3.wu_fld.size(); var5++) {
				TileObject var6 = (TileObject)(TileObject)var3.wu_fld.get(var5);
				if (var6 instanceof fj) {
					fj var7 = (fj)var6;
					if (!qd_fld && !(var7.ak_fld instanceof dz)) {
						throw new AssertionError();
					}

					dz var8 = (dz)var7.ak_fld;
					if (!var8.ga_fld && this.nh(var7.ay_fld, var7.ar_fld, var7.as_fld, var7.af_fld, var7.av_fld, var4)) {
						this.az(var1, var8, var7, var7.ag_fld, var7.ah_fld, var7.ae_fld, var7.aw_fld, var7.az_fld);
					}
				} else if (var6 instanceof ef) {
					ef var14 = (ef)var6;
					if (!qd_fld && !(var14.ak_fld instanceof dz)) {
						throw new AssertionError();
					}

					dz var18 = (dz)var14.ak_fld;
					if (!var18.ga_fld) {
						int var9 = var14.av_fld >> 7;
						int var10 = var14.ae_fld >> 7;
						if (this.nh(var9, var10, var9, var10, var14.rh_fld, var4)) {
							this.az(var1, var18, var14, 0, var14.av_fld, var14.az_fld, var14.ae_fld, var14.ag_fld);
						}
					}
				} else if (var6 instanceof fs) {
					fs var15 = (fs)var6;
					int var19 = var15.ae_fld >> 7;
					int var22 = var15.ah_fld >> 7;
					if (this.nh(var19, var22, var19, var22, var15.nc_fld, var4)) {
						if (var15.ak_fld instanceof dz) {
							dz var25 = (dz)var15.ak_fld;
							if (!var25.ga_fld) {
								this.az(var1, var25, var15, 0, var15.ae_fld, var15.av_fld, var15.ah_fld, var15.az_fld);
							}
						}

						if (var15.ag_fld instanceof dz) {
							dz var26 = (dz)var15.ag_fld;
							if (!var26.ga_fld) {
								this.az(var1, var26, var15, 0, var15.ae_fld, var15.av_fld, var15.ah_fld, var15.az_fld);
							}
						}
					}
				} else if (var6 instanceof fv) {
					fv var16 = (fv)var6;
					int var20 = var16.ae_fld >> 7;
					int var23 = var16.ah_fld >> 7;
					if (this.nh(var20, var23, var20, var23, var16.sy_fld, var4)) {
						if (var16.ak_fld instanceof dz) {
							dz var27 = (dz)var16.ak_fld;
							if (!var27.ga_fld) {
								this.az(var1, var27, var16, 0, var16.ae_fld + var16.as_fld, var16.av_fld, var16.ah_fld + var16.ar_fld, var16.az_fld);
							}
						}

						if (var16.ag_fld instanceof dz) {
							dz var28 = (dz)var16.ag_fld;
							if (!var28.ga_fld) {
								this.az(var1, var28, var16, 0, var16.ae_fld + var16.af_fld, var16.av_fld, var16.ah_fld + var16.al_fld, var16.az_fld);
							}
						}
					}
				} else if (var6 instanceof en) {
					en var17 = (en)var6;
					int var21 = var17.ag_fld >> 7;
					int var24 = var17.az_fld >> 7;
					if (this.nh(var21, var24, var21, var24, var17.mb_fld, var4)) {
						if (var17.ae_fld != null) {
							dw var29 = (dw)var17.ae_fld;
							fn var11 = var29.getModel();
							if (var11 == null) {
								continue;
							}

							var29.setModelHeight(var11.getModelHeight());
							client.fa_fld.drawDynamic(-1, var1, this, var17, var29, var11, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld);
							client.iz(var1, var2, var11, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld, var17.aw_fld);
						}

						if (var17.ah_fld != null) {
							dw var30 = (dw)var17.ah_fld;
							fn var32 = var30.getModel();
							if (var32 == null) {
								continue;
							}

							var30.setModelHeight(var32.getModelHeight());
							client.fa_fld.drawDynamic(-1, var1, this, var17, var30, var32, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld);
							client.iz(var1, var2, var32, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld, var17.aw_fld);
						}

						if (var17.av_fld != null) {
							dw var31 = (dw)var17.av_fld;
							fn var33 = var31.getModel();
							if (var33 != null) {
								var31.setModelHeight(var33.getModelHeight());
								client.fa_fld.drawDynamic(-1, var1, this, var17, var31, var33, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld);
								client.iz(var1, var2, var33, 0, var17.ag_fld, var17.ak_fld - var17.ay_fld, var17.az_fld, var17.aw_fld);
							}
						}
					}
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "(III)Lfj;"
	)
	public fj ti(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
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

	@ObfuscatedName("getOverrideSaturation")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Override
	public byte getOverrideSaturation() {
		return this.bm_fld.az_fld;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III)Lef;"
	)
	public ef hq(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld : null;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void fy(int var1, int var2, int var3, int var4) {
		ux(this, var1, var2, var3, var4);
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

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void ll(fw var1, boolean var2) {
		this.cp_fld = 0;

		for (int var3 = this.cf_fld; var3 < this.cd_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.cn_fld; var5 < this.cr_fld; var5++) {
				for (int var6 = this.ca_fld; var6 < this.cg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null
						&& var7.ad_fld <= this.bx_fld
						&& (
							!var2
								|| dh(this, var5 - this.cm_fld + this.df_fld + this.di_fld, var6 - this.cz_fld + this.de_fld + this.di_fld)
								|| this.cs_fld[var3][var5][var6] - this.cx_fld >= -1202574060
						)) {
						this.dw(var1, var7);
					}
				}
			}
		}

		this.dr();
		fc.ar_fld.au_fld.ae(this.bd_fld);
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long ht(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.aa_fld != null ? var4.aa_fld.az_fld * 7130385936274174641L : 0L;
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
				return this.dj(var13 + 1, this.cs_fld[var1][var2][var4] - var6, var15 + 1)
					&& this.dj(var13 + -1401975648 - 1, this.cs_fld[var1][var2 + 1][var4] - var6, var15 + 1)
					&& this.dj(var13 + 128 - 1, this.cs_fld[var1][var2 + 1][var4 + 1] - var6, var15 + -1621170969 - 1)
					&& this.dj(var13 + 1, this.cs_fld[var1][var2][var4 + 1] - var6, var15 + 184198862 - 1);
			}
		} else {
			for (int var7 = var2; var7 <= var3; var7++) {
				for (int var8 = var4; var8 <= var5; var8++) {
					if (this.cv_fld[var1][var7][var8] == -this.ce_fld) {
						return false;
					}
				}
			}

			int var12 = (var2 << 7) + 1;
			int var14 = (var4 << 7) + 2;
			int var9 = this.cs_fld[var1][var2][var4] - var6;
			if (!this.dj(var12, var9, var14)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.dj(var10, var9, var14)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					return !this.dj(var12, var9, var11) ? false : this.dj(var10, var9, var11);
				}
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Lfw;)V"
	)
	public void im(fw var1) {
		this.bd_fld.ug(fc.ar_fld.au_fld);
		fc.ar_fld.au_fld.ug(this.bm_fld);

		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = this.uj_fld - 1; var3 >= 0; var3--) {
				rl17 var4 = this.ek_fld[var3];
				if (var4.ky_fld) {
					client.fa_fld.drawZoneAlpha(var1, this, var2, var4.go_fld, var4.kq_fld);

					for (int var5 = 0; var5 < var4.pn_fld.size(); var5++) {
						fj var6 = (fj)(fj)var4.pn_fld.get(var5);
						if (var6.av_fld == var2 && var6.ak_fld instanceof ev) {
							ev var7 = (ev)var6.ak_fld;
							var7.im(var7.pw_fld);
						}
					}
				}
			}
		}

		client.fa_fld.drawPass(var1, this, 1);
		client.fa_fld.postSceneDraw(this);
		this.hv();
		fc.ar_fld.au_fld.ug(this.bd_fld);
	}

	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)V"
	)
	public static void sf(ev var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 < 0) {
			var1 = 0;
		}

		var0.eo_fld = var1;
		var0.ec_fld = var2;
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfs;"
	)
	public static fs ay(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var2 += var0.jh_fld;
		var3 += var0.jh_fld;
		int var4 = var0.ra(var1, var2, var3);
		return var0.mx(var4) ? var0.rs_fld[var4] : null;
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

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfw;Lem;IIIIJ)V"
	)
	public void lz(fw var1, fw var2, em var3, int var4, int var5, int var6, int var7, long var8) {
		try {
			if (var3 instanceof fn) {
				fn var10 = (fn)var3;
				var10.calculateBoundsCylinder();
				client.iz(var1, var2, var10, var4, var5, var6, var7, var8);
			} else if (var3 instanceof dz) {
				int var16 = client.jb_fld >> 7 & 15;
				dz var11 = (dz)var3;
				if (var11.ga_fld || var16 > 0) {
					fn var12 = var11.qr(rl21.no_fld);
					if (var12 != null) {
						var12.calculateBoundsCylinder();
						int var13 = var11.getAnimationHeightOffset();
						if (!qd_fld && var11.ga_fld && var13 != 0) {
							throw new AssertionError();
						}

						client.iz(var1, var2, var12, var4, var5, var6 - var13, var7, var8);
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("getOverrideHue")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Override
	public byte getOverrideHue() {
		return this.bm_fld.ag_fld;
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void sd(int var1) {
		int var2 = (var1 << 1) + 1;
		var2 = this.of_fld[var2];
		var2 <<= 1;
		int var5 = var1 << 1;
		this.of_fld[var2] = this.of_fld[var5];
		var2 = var1 << 1;
		var2 = this.of_fld[var2];
		var2 = (var2 << 1) + 1;
		int var9 = (var1 << 1) + 1;
		this.of_fld[var2] = this.of_fld[var9];
		var2 = (var1 << 1) + 1;
		int var11 = this.jo_fld;
		int var12 = (var11 << 1) + 1;
		this.of_fld[var2] = this.of_fld[var12];
		var2 = var1 << 1;
		this.of_fld[var2] = this.jo_fld;
		var2 = (var1 << 1) + 1;
		var2 = this.of_fld[var2];
		var2 <<= 1;
		this.of_fld[var2] = var1;
		var2 = var1 << 1;
		var2 = this.of_fld[var2];
		var2 = (var2 << 1) + 1;
		this.of_fld[var2] = var1;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void kr(int var1, int var2, int var3) {
		this.dh_fld = var1;
		this.dv_fld = var2;
		this.dz_fld = var3;
	}

	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "(Lev;Ler;)V"
	)
	public static void rk(ev var0, er var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != var0.dn_fld) {
			var0.dn_fld = var1;
			var0.js(var0.dm_fld, var0.dj_fld, var0.es_fld, var0.ep_fld, var0.eb_fld);
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIJ)I"
	)
	public static int dk(ev var0, int var1, int var2, int var3, long var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var2 += var0.jh_fld;
		var3 += var0.jh_fld;
		int var6 = var0.ra(var1, var2, var3);
		if (!var0.mx(var6)) {
			return -1;
		} else if (var0.rs_fld[var6] != null && var0.rs_fld[var6].az_fld * -4472860599998239529L == var4) {
			return var0.rs_fld[var6].as_fld * 57097171 & 0xFF;
		} else if (var0.ow_fld[var6] != null && var0.ow_fld[var6].az_fld * 7130385936274174641L == var4) {
			return var0.ow_fld[var6].au_fld * -890468509 & 0xFF;
		} else if (var0.kg_fld[var6] != null && var0.kg_fld[var6].ag_fld * 2728893160458550201L == var4) {
			return var0.kg_fld[var6].ah_fld * 1337340647 & 0xFF;
		} else {
			byte var7 = var0.ib_fld[var6];

			for (int var8 = 0; var8 < var7; var8++) {
				fj var9 = var0.vh_fld[var6 * 5 + var8];
				if (var9.az_fld == var4) {
					return var9.ax_fld & 0xFF;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lei;)V"
	)
	void dw(fw var1, ei var2) {
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int uo(int var1) {
		return this.wf_fld[var1] >> 16 & 15;
	}

	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)V"
	)
	public static void wr(ev var0, int var1, int var2) {
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

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int ip(int var1, int var2, int var3) {
		return (this.cs_fld[var1][var2][var3] + this.cs_fld[var1][var2 + 1][var3] + this.cs_fld[var1][var2][var3 + 1] + this.cs_fld[var1][var2 + 1][var3 + 1]) / 4;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILem;IJI)Z"
	)
	public boolean hk(int var1, int var2, int var3, int var4, int var5, int var6, em var7, int var8, long var9, int var11) {
		try {
			return this.bh(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(ILrl17;Lfn;)V"
	)
	public void en(int var1, rl17 var2, fn var3) {
		var3.calculateBoundsCylinder();
		int var4 = var1 - var3.ez_fld;
		int var5 = var1 + var3.cp_fld;
		if (var4 < var2.su_fld) {
			var2.su_fld = var4;
		}

		if (var5 > var2.lp_fld) {
			var2.lp_fld = var5;
		}
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

	@ObfuscatedName("zg")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void zg(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var2 += var0.jh_fld;
			var3 += var0.jh_fld;
			int var4 = var0.ra(var1, var2, var3);
			if (var0.mx(var4) && (var0.wf_fld[var4] & 16384) != 0) {
				fs var5 = var0.rs_fld[var4];
				var0.rs_fld[var4] = null;
				var0.wf_fld[var4] = var0.wf_fld[var4] & -16385;
				if (var5.ak_fld instanceof dz || var5.ag_fld instanceof dz) {
					rl17 var6 = var0.tb_fld[var2 >> 3][var3 >> 3];
					var6.wu_fld.remove(var5);
				}

				if (var0.sv_fld) {
					WallObjectDespawned var9 = new WallObjectDespawned();
					var9.setTile(var0.iy_fld[var1][var2][var3]);
					var9.setWallObject(var5);
					og.ci_fld.getCallbacks().post(var9);
				}

				if (var0.sv_fld && client.fa_fld != null) {
					client.fa_fld.invalidateZone(var0, var2 >> 3, var3 >> 3);
				}
			}
		}
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

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILem;IZJI)Z"
	)
	public boolean tr(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, em var9, int var10, boolean var11, long var12, int var14) {
		try {
			return this.by(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14);
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void iy(int var1) {
		this.di_fld = og.al(25, 90, var1);
		fh.ae(this.di_fld);
		if (this.dm_fld != null && this.dm_fld.length > 0) {
			this.js(this.dm_fld, this.dj_fld, this.es_fld, this.ep_fld, this.eb_fld);
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ic(int var1) {
		this.di_fld = og.al(25, -342384559, var1);
		fh.ae(this.di_fld);
		if (this.dm_fld != null && this.dm_fld.length > 0) {
			this.js(this.dm_fld, this.dj_fld, this.es_fld, this.ep_fld, this.eb_fld);
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void in(int var1) {
		this.di_fld = og.al(25, 90, var1);
		fh.ae(this.di_fld);
		if (this.dm_fld != null && this.dm_fld.length > 0) {
			this.js(this.dm_fld, this.dj_fld, this.es_fld, this.ep_fld, this.eb_fld);
		}
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(III)Lfv;"
	)
	public fv qf(int var1, int var2, int var3) {
		return this.bq(var1, var2, var3);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	public void ca(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		var5 += this.jh_fld;
		var6 += this.jh_fld;
		int var7 = this.ra(var4, var5, var6);
		if (this.mx(var7)) {
			int var8 = this.wf_fld[var7];
			if ((var8 & 256) != 0) {
				fa var9 = this.oy_fld[var7];
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
				fl var20 = this.fr_fld[var7];
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

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIIIII)V"
	)
	public static void my(ev var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var0 == null) {
			var0.getClass();
		}

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
		var0.dq_fld[var1][var0.dp_fld[var1]++] = var9;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean it(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean id(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5);
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ig(int var1) {
		int var2 = (var1 << 1) + 1;
		var2 = this.of_fld[var2];
		var2 <<= 1;
		int var5 = var1 << 1;
		this.of_fld[var2] = this.of_fld[var5];
		var2 = var1 << 1;
		var2 = this.of_fld[var2];
		var2 = (var2 << 1) + 1;
		int var9 = (var1 << 1) + 1;
		this.of_fld[var2] = this.of_fld[var9];
		var2 = var1 << 1;
		int var11 = (var1 << 1) + 1;
		this.of_fld[var2] = this.of_fld[var11] = this.me_fld;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean lc(int var1, int var2, int var3) {
		int var4 = this.cv_fld[var1][var2][var3];
		if (var4 == -this.ce_fld) {
			return false;
		} else if (var4 == this.ce_fld) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.dj(var5 + 1, this.cs_fld[var1][var2][var3], var6 + 1)
				&& this.dj(var5 + 1091847747 - 1, this.cs_fld[var1][var2 + 1][var3], var6 + 1)
				&& this.dj(var5 + 128 - 1, this.cs_fld[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
				&& this.dj(var5 + 1, this.cs_fld[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.cv_fld[var1][var2][var3] = this.ce_fld;
				return true;
			} else {
				this.cv_fld[var1][var2][var3] = -this.ce_fld;
				return false;
			}
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean ix(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5);
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean iu(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5);
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean ir(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5);
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean jv(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)I"
	)
	public static int av(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var4 = var2 + var0.jh_fld;
			int var5 = var3 + var0.jh_fld;
			int var6 = 0;
			int var7 = var0.ra(var1, var4, var5);
			if (var0.mx(var7)) {
				byte var8 = var0.ib_fld[var7];

				for (int var9 = 0; var9 < var8; var9++) {
					fj var10 = var0.vh_fld[var7 * 5 + var9];
					if ((var10.ax_fld & 256) == 256 && var10.ak_fld instanceof fn) {
						fn var11 = (fn)var10.ak_fld;
						var11.calculateBoundsCylinder();
						if (var11.ez_fld > var6) {
							var6 = var11.ez_fld;
						}
					}
				}
			}

			return var6;
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

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean cj(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean uf(int var1, int var2, int var3, int var4) {
		return this.ly(var1, var2, var3, var4);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bw(int var1, int var2, int var3) {
		var2 += this.jh_fld;
		var3 += this.jh_fld;
		int var4 = this.ra(var1, var2, var3);
		if (this.mx(var4)) {
			en var5 = this.ee_fld[var4];
			this.ee_fld[var4] = null;
			this.wf_fld[var4] = this.wf_fld[var4] & -12289;
			rl17 var6 = this.tb_fld[var2 >> 3][var3 >> 3];
			var6.wu_fld.remove(var5);
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void jf(boolean var1) {
		this.dq(var1);
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Leg;IIIII)V"
	)
	public void md(eg var1, int var2, int var3, int var4, int var5, int var6) {
		this.ce(var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)Z"
	)
	public static boolean dh(ev var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (!var0.cl(var0.eo_fld, var0.ec_fld, var1, var2)) {
			return var0.lv(var0.eo_fld, var0.ec_fld, var1, var2);
		} else {
			var0.cu(var0.eo_fld, var0.ec_fld, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; var4++) {
				for (int var5 = -1; var5 <= 1; var5++) {
					if (var0.ch(var0.eo_fld, var0.ec_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (var0.ch(var0.eo_fld, (var0.ec_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (var0.ch(var0.eo_fld + 1, var0.ec_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (var0.ch(var0.eo_fld + 1, (var0.ec_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return var0.cb(var0.eo_fld, var0.ec_fld, var1, var2, var3);
		}
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfw;Lei;Z)V"
	)
	public static void qd(ev var0, fw var1, ei var2, boolean var3) throws EOFException {
		try {
			var0.dl_fld.av(var2);

			label663:
			while (true) {
				ei var4;
				int var5;
				int var6;
				int var7;
				int var8;
				ei[][] var9;
				while (true) {
					var4 = (ei)var0.dl_fld.ae();
					if (var4 == null) {
						return;
					}

					if (var4.ab_fld) {
						var5 = var4.al_fld;
						var6 = var4.au_fld;
						var7 = var4.af_fld;
						var8 = var4.ax_fld;
						var9 = var0.bl_fld[var7];
						if (!var4.ao_fld) {
							break;
						}

						if (var3) {
							if (var7 > 0) {
								ei var10 = var0.bl_fld[var7 - 1][var5][var6];
								if (var10 != null && var10.ab_fld) {
									continue;
								}
							}

							if (var5 <= var0.cm_fld && var5 > var0.cn_fld) {
								ei var23 = var9[var5 - 1][var6];
								if (var23 != null && var23.ab_fld && (var23.ao_fld || (var4.am_fld & 1) == 0)) {
									continue;
								}
							}

							if (var5 >= var0.cm_fld && var5 < var0.cr_fld - 1) {
								ei var24 = var9[var5 + 1][var6];
								if (var24 != null && var24.ab_fld && (var24.ao_fld || (var4.am_fld & 4) == 0)) {
									continue;
								}
							}

							if (var6 <= var0.cz_fld && var6 > var0.ca_fld) {
								ei var25 = var9[var5][var6 - 1];
								if (var25 != null && var25.ab_fld && (var25.ao_fld || (var4.am_fld & 8) == 0)) {
									continue;
								}
							}

							if (var6 >= var0.cz_fld && var6 < var0.cg_fld - 1) {
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
								if (!var0.dn(0, var5, var6)) {
									var1.ag(var0, var27.az_fld, 0, var5, var6, 104502291);
								}
							} else if (var27.av_fld != null && !var0.dn(0, var5, var6)) {
								var1.az(var0, var27.av_fld, var5, var6, (byte)-23);
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
							if (!var0.dn(var8, var5, var6)) {
								var28 = true;
								if (var4.az_fld.az_fld * -1656357861 != 12345678 || var7 <= var0.dh_fld) {
									var1.ag(var0, var4.az_fld, var8, var5, var6, 1181603903);
								}
							}
						} else if (var4.av_fld != null && !var0.dn(var8, var5, var6)) {
							var28 = true;
							var1.az(var0, var4.av_fld, var5, var6, (byte)60);
						}

						int var36 = 0;
						int var49 = 0;
						fs var56 = var4.an_fld;
						fv var14 = var4.aa_fld;
						if (var56 != null || var14 != null) {
							if (var0.cm_fld == var5) {
								var36++;
							} else if (var0.cm_fld < var5) {
								var36 += 2;
							}

							if (var0.cz_fld == var6) {
								var36 += 3;
							} else if (var0.cz_fld > var6) {
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

							if ((var56.aw_fld & var49) != 0 && !var0.ly(var8, var5, var6, var56.aw_fld)) {
								var1.ak(var56.ak_fld, 0, var56.ae_fld, var56.av_fld, var56.ah_fld, var56.az_fld);
							}

							if ((var56.ay_fld & var49) != 0 && !var0.ly(var8, var5, var6, var56.ay_fld)) {
								var1.ak(var56.ag_fld, 0, var56.ae_fld, var56.av_fld, var56.ah_fld, var56.az_fld);
							}
						}

						if (var14 != null && !var0.ck(var8, var5, var6, var14.ak_fld.ez_fld * -1271205903)) {
							if ((var14.aw_fld & var49) != 0) {
								var1.ak(var14.ak_fld, 0, var14.ae_fld + var14.as_fld, var14.av_fld, var14.ah_fld + var14.ar_fld, var14.az_fld);
							} else if (var14.aw_fld == 256) {
								int var15 = var14.ae_fld - var0.cw_fld;
								int var16 = var14.ah_fld - var0.cy_fld;
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
								var1.ak(var65.ak_fld, 0, var65.av_fld, var65.az_fld, var65.ae_fld, var65.ag_fld);
							}

							en var71 = var4.ae_fld;
							if (var71 != null && var71.ay_fld == 0) {
								if (var71.ae_fld != null) {
									var1.ak(var71.ae_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}

								if (var71.ah_fld != null) {
									var1.ak(var71.ah_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}

								if (var71.av_fld != null) {
									var1.ak(var71.av_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}
							}
						}

						int var66 = var4.am_fld;
						if (var66 != 0) {
							if (var5 < var0.cm_fld && var5 >= var0.cn_fld && var5 < var0.cr_fld - 1 && (var66 & 4) != 0) {
								ei var72 = var9[var5 + 1][var6];
								if (var72 != null && var72.ab_fld) {
									var0.dl_fld.av(var72);
								}
							}

							if (var6 < var0.cz_fld && var6 >= var0.ca_fld && var6 < var0.cg_fld - 1 && (var66 & 2) != 0) {
								ei var73 = var9[var5][var6 + 1];
								if (var73 != null && var73.ab_fld) {
									var0.dl_fld.av(var73);
								}
							}

							if (var5 > var0.cm_fld && var5 > var0.cn_fld && var5 < var0.cr_fld && (var66 & 1) != 0) {
								ei var74 = var9[var5 - 1][var6];
								if (var74 != null && var74.ab_fld) {
									var0.dl_fld.av(var74);
								}
							}

							if (var6 > var0.cz_fld && var6 > var0.ca_fld && var6 < var0.cg_fld && (var66 & 8) != 0) {
								ei var75 = var9[var5][var6 - 1];
								if (var75 != null && var75.ab_fld) {
									var0.dl_fld.av(var75);
								}
							}
						}
						break;
					}
				}

				if (var4.at_fld != 0) {
					boolean var29 = true;

					for (int var37 = 0; var37 < var4.ah_fld; var37++) {
						if (var4.aw_fld[var37].au_fld * 1952704125 != var0.ce_fld && (var4.aq_fld[var37] & var4.at_fld) == var4.ac_fld) {
							var29 = false;
							break;
						}
					}

					if (var29) {
						fs var38 = var4.an_fld;
						if (!var0.ly(var8, var5, var6, var38.aw_fld)) {
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
							if (var50.au_fld != var0.ce_fld) {
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

								var0.cl_fld[var30++] = var50;
								var50.al_fld = var0.dy(var50, var0.cm_fld, var0.cz_fld);
							}
						}

						if (var4.ag(830000886)) {
							for (int var40 = 0; var40 < var4.ar_fld.size(); var40++) {
								fj var51 = (fj)(fj)var4.ar_fld.get(var40);
								if (var51.au_fld != var0.ce_fld) {
									var0.cl_fld[var30++] = var51;
									var51.al_fld = var0.dy(var51, var0.cm_fld, var0.cz_fld);
								}
							}
						}

						while (true) {
							int var41 = -50;
							int var52 = -1;

							for (int var58 = 0; var58 < var30; var58++) {
								fj var62 = var0.cl_fld[var58];
								if (var62.au_fld != var0.ce_fld) {
									if (var62.al_fld > var41) {
										var41 = var62.al_fld;
										var52 = var58;
									} else if (var62.al_fld == var41) {
										int var68 = var62.ah_fld - var0.cw_fld;
										int var77 = var62.aw_fld - var0.cy_fld;
										int var80 = var0.cl_fld[var52].ah_fld * -564370133 - var0.cw_fld;
										int var81 = var0.cl_fld[var52].aw_fld * -502866077 - var0.cy_fld;
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

							fj var59 = var0.cl_fld[var52];
							var59.au_fld = var0.ce_fld;
							if (!zs(var0, var8, var59.ay_fld, var59.as_fld, var59.ar_fld, var59.af_fld, var59.ak_fld.ez_fld * -1271205903)) {
								var1.ak(var59.ak_fld, var59.ag_fld, var59.ah_fld, var59.ae_fld, var59.aw_fld, var59.az_fld);
							}

							for (int var63 = var59.ay_fld; var63 <= var59.as_fld; var63++) {
								for (int var69 = var59.ar_fld; var69 <= var59.af_fld; var69++) {
									ei var78 = var9[var63][var69];
									if (var78.at_fld != 0) {
										var0.dl_fld.av(var78);
									} else if ((var63 != var5 || var69 != var6) && var78.ab_fld) {
										var0.dl_fld.av(var78);
									}
								}
							}
						}
					} catch (Exception var21) {
						var4.ap_fld = false;
					}
				}

				if (var4.ab_fld && var4.at_fld == 0) {
					if (var5 <= var0.cm_fld && var5 > var0.cn_fld) {
						ei var31 = var9[var5 - 1][var6];
						if (var31 != null && var31.ab_fld) {
							continue;
						}
					}

					if (var5 >= var0.cm_fld && var5 < var0.cr_fld - 1) {
						ei var32 = var9[var5 + 1][var6];
						if (var32 != null && var32.ab_fld) {
							continue;
						}
					}

					if (var6 <= var0.cz_fld && var6 > var0.ca_fld) {
						ei var33 = var9[var5][var6 - 1];
						if (var33 != null && var33.ab_fld) {
							continue;
						}
					}

					if (var6 >= var0.cz_fld && var6 < var0.cg_fld - 1) {
						ei var34 = var9[var5][var6 + 1];
						if (var34 != null && var34.ab_fld) {
							continue;
						}
					}

					var4.ab_fld = false;
					var0.cp_fld--;
					en var35 = var4.ae_fld;
					if (var35 != null && var35.ay_fld != 0) {
						if (var35.ae_fld != null) {
							var1.ak(var35.ae_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}

						if (var35.ah_fld != null) {
							var1.ak(var35.ah_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}

						if (var35.av_fld != null) {
							var1.ak(var35.av_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}
					}

					if (var4.bm_fld != 0) {
						fv var42 = var4.aa_fld;
						if (var42 != null && !var0.ck(var8, var5, var6, var42.ak_fld.ez_fld * -1271205903)) {
							if ((var42.aw_fld & var4.bm_fld) != 0) {
								var1.ak(var42.ak_fld, 0, var42.ae_fld + var42.as_fld, var42.av_fld, var42.ah_fld + var42.ar_fld, var42.az_fld);
							} else if (var42.aw_fld == 256) {
								int var53 = var42.ae_fld - var0.cw_fld;
								int var60 = var42.ah_fld - var0.cy_fld;
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
							if ((var54.ay_fld & var4.bm_fld) != 0 && !var0.ly(var8, var5, var6, var54.ay_fld)) {
								var1.ak(var54.ag_fld, 0, var54.ae_fld, var54.av_fld, var54.ah_fld, var54.az_fld);
							}

							if ((var54.aw_fld & var4.bm_fld) != 0 && !var0.ly(var8, var5, var6, var54.aw_fld)) {
								var1.ak(var54.ak_fld, 0, var54.ae_fld, var54.av_fld, var54.ah_fld, var54.az_fld);
							}
						}
					}

					if (var7 < var0.cd_fld - 1) {
						ei var43 = var0.bl_fld[var7 + 1][var5][var6];
						if (var43 != null && var43.ab_fld) {
							var0.dl_fld.av(var43);
						}
					}

					if (var5 < var0.cm_fld && var5 >= var0.cn_fld && var5 < var0.cr_fld - 1) {
						ei var44 = var9[var5 + 1][var6];
						if (var44 != null && var44.ab_fld) {
							var0.dl_fld.av(var44);
						}
					}

					if (var6 < var0.cz_fld && var6 >= var0.ca_fld && var6 < var0.cg_fld - 1) {
						ei var45 = var9[var5][var6 + 1];
						if (var45 != null && var45.ab_fld) {
							var0.dl_fld.av(var45);
						}
					}

					if (var5 > var0.cm_fld && var5 > var0.cn_fld && var5 < var0.cr_fld) {
						ei var46 = var9[var5 - 1][var6];
						if (var46 != null && var46.ab_fld) {
							var0.dl_fld.av(var46);
						}
					}

					if (var6 > var0.cz_fld && var6 > var0.ca_fld && var6 < var0.cg_fld) {
						ei var47 = var9[var5][var6 - 1];
						if (var47 != null && var47.ab_fld) {
							var0.dl_fld.av(var47);
						}
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean dt(int var1, int var2, int var3, int var4) {
		return aq(this, this.et_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void fl(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.av_fld = var5;
		var11.ag_fld = var2 * -1810046336 + 484684255;
		var11.az_fld = var3 * -1839159424 + 163178049;
		var11.ak_fld = var4 * 1081480156;
		var11.aw_fld = var6;
		var11.ae_fld = var8;
		var11.ah_fld = var9;
		var11.ay_fld = var10 * -735456137;
		if (this.bl_fld[var1][var2][var3] == null) {
			this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		this.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean iw(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.bk_fld + var3 * this.bj_fld + var4 * this.bf_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "([IIIII)V"
	)
	public void dh(int[] var1, int var2, int var3, int var4, int var5) {
		this.dm_fld = var1;
		this.dj_fld = var2;
		this.es_fld = var3;
		this.ep_fld = var4;
		this.eb_fld = var5;
		this.ds_fld = 0;
		this.du_fld = 0;
		this.db_fld = var4;
		this.dg_fld = var5;
		this.dk_fld = var4 / 2;
		this.dx_fld = var5 / 2;
		this.et_fld.set(0, this.et_fld.size());
		this.ex_fld.set(0, this.ex_fld.size());
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean ja(int var1, int var2, int var3, int var4, boolean var5) {
		return rl16.ie(this, this.ew_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean jd(int var1, int var2, int var3, int var4, boolean var5) {
		return rl16.ie(this, this.ew_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIII)Z"
	)
	public boolean is(em var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			if (var1 instanceof dz) {
				dz var8 = (dz)var1;
				if (var8.zs_fld != -1 && var8.za_fld != rt.ag_fld[var8.zs_fld]) {
					var8.iv();
					this.pd(var8, var2, var3, var4, var5, var6, var7);
					return var8.ga_fld;
				}
			}

			return false;
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)J"
	)
	public static long pu(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		return var4 != null && var4.an_fld != null ? var4.an_fld.az_fld * -4472860599998239529L : 0L;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void kk() {
		this.bw_fld = -1;
		this.bq_fld = false;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean jx(int var1, int var2, int var3, int var4, boolean var5) {
		return rl16.ie(this, this.ex_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean jf(int var1, int var2, int var3, int var4, boolean var5) {
		return rl16.ie(this, this.ex_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIIIIIIII)V"
	)
	public void wk(
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
			if (var12 != this.cd_fld) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.cc_fld) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.cq_fld && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
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

	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "([IIIII)V"
	)
	public void xb(int[] var1, int var2, int var3, int var4, int var5) {
		this.dm_fld = var1;
		this.dj_fld = var2;
		this.es_fld = var3;
		this.ep_fld = var4;
		this.eb_fld = var5;
		this.ds_fld = 0;
		this.du_fld = 0;
		this.db_fld = var4;
		this.dg_fld = var5;
		this.dk_fld = var4 / 2;
		this.dx_fld = var5 / 2;
		this.et_fld.set(0, this.et_fld.size());
		this.ex_fld.set(0, this.ex_fld.size());
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

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void dq(boolean var1) {
		if (!this.dl() || var1) {
			this.dc_fld = true;
			this.bq_fld = var1;
			this.bw_fld = -1;
			this.ba_fld = -1;
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

		this.eo_fld = var1;
		this.ec_fld = var2;
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean ny(int var1, int var2, int var3) {
		return (this.la_fld[var1][var2][var3] & 4) != 0;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void le(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.cc_fld * 128) {
			var1 = this.cc_fld * 1187576632 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.cq_fld * 128) {
			var3 = this.cq_fld * 128 - 1;
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
		this.dv((var4 - ay_fld) / 1224751986, var5 / 64);
		this.cw_fld = var1;
		this.cx_fld = var2;
		this.cy_fld = var3;
		this.cm_fld = var1 / 128;
		this.cz_fld = var3 / 128;
		this.ck_fld = var7 / -454243004;
		this.cb_fld = var8 / 128;
		this.bx_fld = var6;
		ee var10 = new ee(var1, var2, var3, var4, var5, var7, var8);
		if (this.dd_fld != null) {
			this.dd_fld.cn(fk.ae_fld);
			this.dd_fld.bu(0, var4, var5, 0, 0, 0, -1L);
		}

		if (fc.an()) {
			fc.ar_fld.aa_fld = 0;
			this.ds(var10, var9, true);
			fc.ar_fld.aa_fld = 1;
			this.ds(var10, var9, false);
			fc.ar_fld.aa_fld = 2;
		} else {
			fc.ar_fld.aa_fld = 2;
			this.ds(var10, var9, true);
		}
	}

	@ObfuscatedName("getMinLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMinLevel() {
		return this.cf_fld;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/util/Set;)Z"
	)
	public boolean nh(int var1, int var2, int var3, int var4, int var5, Set var6) {
		boolean var7 = false;
		int var8 = var5 + ((this.la_fld[1][var1 + this.jh_fld][var2 + this.jh_fld] & 2) >> 1) & 3;

		for (int var9 = var1; var9 <= var3; var9++) {
			for (int var10 = var2; var10 <= var4; var10++) {
				var7 |= (this.la_fld[var8][var9 + this.jh_fld][var10 + this.jh_fld] & 8) != 0;
			}
		}

		var5 = var7 ? 0 : var5;
		boolean var14 = this.hl_fld != 0 && this.aj_fld;
		if (var5 >= this.cf_fld && (var14 || var5 <= this.bx_fld)) {
			if (var5 > this.fj_fld.ae_fld * -457350413 && !var6.isEmpty()) {
				for (int var15 = var1; var15 <= var3; var15++) {
					for (int var11 = var2; var11 <= var4; var11++) {
						int var12 = this.pr_fld[var5][var15 + this.jh_fld][var11 + this.jh_fld];
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

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean kl(int var1, int var2) {
		if (!this.cl(this.eo_fld, this.ec_fld, var1, var2)) {
			return this.lv(this.eo_fld, this.ec_fld, var1, var2);
		} else {
			this.cu(this.eo_fld, this.ec_fld, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; var4++) {
				for (int var5 = -1; var5 <= 1; var5++) {
					if (this.ch(this.eo_fld, this.ec_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.eo_fld, (this.ec_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.eo_fld + 1, this.ec_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.eo_fld + 1, (this.ec_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.cb(this.eo_fld, this.ec_fld, var1, var2, var3);
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ko(int var1, int var2) {
		if (!this.cl(this.eo_fld, this.ec_fld, var1, var2)) {
			return this.lv(this.eo_fld, this.ec_fld, var1, var2);
		} else {
			this.cu(this.eo_fld, this.ec_fld, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; var4++) {
				for (int var5 = -1; var5 <= 1; var5++) {
					if (this.ch(this.eo_fld, this.ec_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.eo_fld, (this.ec_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.eo_fld + 1, this.ec_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.eo_fld + 1, (this.ec_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.cb(this.eo_fld, this.ec_fld, var1, var2, var3);
		}
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean mt(int var1, int var2, int var3, int var4) {
		if (!this.df(var1, var2, var3, var4)) {
			return ml.hi(this, var1, var2, var3, var4);
		} else {
			og(this, var1, var2, var3, var4, false);
			int var5 = var1 * 32 + ay_fld;
			int var6 = var2 * 64;
			int var7 = (var3 - this.di_fld - this.df_fld - 1) * 128;
			int var8 = (var4 - this.di_fld - this.de_fld - 1) * 128;

			for (int var9 = -this.dj_fld; var9 <= this.es_fld; var9 += 128) {
				if (ry(this, var7, this.dm_fld[var1] + var9, var8, var5, var6)) {
					return this.ct(var1, var2, var3, var4, true);
				}
			}

			return this.ct(var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void uz() {
		try {
			if ((client.jb_fld & 16) != 0) {
				for (int var1 = 0; var1 < this.cc_fld >> 3; var1++) {
					for (int var2 = 0; var2 < this.cq_fld >> 3; var2++) {
						rl17 var3 = this.tb_fld[var1][var2];
						if (var3 != null) {
							boolean var4 = false;

							for (int var5 = 0; var5 < var3.wu_fld.size(); var5++) {
								TileObject var6 = (TileObject)(TileObject)var3.wu_fld.get(var5);
								if (var6 instanceof fj) {
									fj var7 = (fj)var6;
									if (!qd_fld && !(var7.ak_fld instanceof dz)) {
										throw new AssertionError();
									}

									dz var8 = (dz)var7.ak_fld;
									if (!var8.ga_fld && var8.qc()) {
										var8.iv();
										var8.ga_fld = true;
										var4 = true;
									}
								} else if (var6 instanceof ef) {
									ef var11 = (ef)var6;
									if (!qd_fld && !(var11.ak_fld instanceof dz)) {
										throw new AssertionError();
									}

									dz var14 = (dz)var11.ak_fld;
									if (!var14.ga_fld && var14.qc()) {
										var14.iv();
										var14.ga_fld = true;
										var4 = true;
									}
								} else if (var6 instanceof fs) {
									fs var12 = (fs)var6;
									if (var12.ak_fld instanceof dz) {
										dz var15 = (dz)var12.ak_fld;
										if (!var15.ga_fld && var15.qc()) {
											var15.iv();
											var15.ga_fld = true;
											var4 = true;
										}
									}

									if (var12.ag_fld instanceof dz) {
										dz var16 = (dz)var12.ag_fld;
										if (!var16.ga_fld && var16.qc()) {
											var16.iv();
											var16.ga_fld = true;
											var4 = true;
										}
									}
								} else if (var6 instanceof fv) {
									fv var13 = (fv)var6;
									if (var13.ak_fld instanceof dz) {
										dz var17 = (dz)var13.ak_fld;
										if (!var17.ga_fld && var17.qc()) {
											var17.iv();
											var17.ga_fld = true;
											var4 = true;
										}
									}

									if (var13.ag_fld instanceof dz) {
										dz var18 = (dz)var13.ag_fld;
										if (!var18.ga_fld && var18.qc()) {
											var18.iv();
											var18.ga_fld = true;
											var4 = true;
										}
									}
								}
							}

							if (var4) {
								client.fa_fld.invalidateZone(this, var3.go_fld, var3.kq_fld);
							}
						}
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	public void io(er var1) {
		if (var1 != this.dn_fld) {
			this.dn_fld = var1;
			this.js(this.dm_fld, this.dj_fld, this.es_fld, this.ep_fld, this.eb_fld);
		}
	}

	public ev(boolean var1, int var2, int var3, int var4, int var5, er var6, int[][][] var7) {
		ev var8 = this;
		this.hl_fld = 0;
		this.gr_fld = null;
		this.ks_fld = -1;
		this.td_int = -1;
		this.kb_fld = new rl18(this);
		this.iy_fld = new rl10[var2][var3][var4];
		this.pr_fld = new int[var2][var3][var4];
		int var16 = 32 - Integer.numberOfLeadingZeros(var3 + 3);
		int var17 = 32 - Integer.numberOfLeadingZeros(var4 + 3);
		int var18 = 4 * (1 << var16) * (1 << var17);
		int var19 = var18 << 1;
		this.lo_fld = var17;
		this.ha_fld = var16 + var17;
		this.rl_fld = (1 << var16) - 1;
		this.ul_fld = (1 << var17) - 1;
		this.sy_fld = 1 << var16 + var17;
		this.ze_fld = 1 << var17;
		this.vn_fld = 1;
		this.me_fld = var18 - 1;
		this.jo_fld = var18 - 2;
		this.ts_fld = var18 - 3;
		this.wf_fld = new int[var18];
		this.oy_fld = new fa[var18];
		this.fr_fld = new fl[var18];
		this.rs_fld = new fs[var18];
		this.ow_fld = new fv[var18];
		this.kg_fld = new ef[var18];
		this.ee_fld = new en[var18];
		this.ib_fld = new byte[var18];
		this.vh_fld = new fj[var18 * 5];
		this.in_Arrbyte = new byte[var18 * 5];
		this.vj_fld = new byte[var18];
		this.fl_fld = new long[var18];
		this.of_fld = new int[var19];
		Arrays.fill(this.of_fld, this.me_fld);
		this.pa();
		int var20 = var3 >> 3;
		int var21 = var4 >> 3;
		this.tb_fld = new rl17[var20][var21];
		this.ek_fld = new rl17[var20 * var21];

		for (int var22 = 0; var22 < var20; var22++) {
			int var23 = 0;

			while (var23 < var21) {
				rl17 var24 = var8.tb_fld[var22][var23] = new rl17();
				var24.go_fld = var22;
				var24.kq_fld = var23++;
			}
		}

		if (var1) {
			var8.ju_fld = rt.ag_fld != null ? new BitSet(rt.ag_fld.length) : null;
			var8.xc_java_util_Set = new HashSet();
		} else {
			var8.ju_fld = null;
			var8.zy_fld = new ey(new uy());
			var8.pw_fld = new ey(new uy());
			var8.xc_java_util_Set = Collections.emptySet();
		}

		this.bm_fld = new fy();
		this.bd_fld = new fy();
		this.bx_fld = 0;
		this.bo_fld = new uy();
		this.bp_fld = 0;
		this.bt_fld = 0;
		this.bv_fld = 0;
		this.bi_fld = 1.0F;
		this.bu_fld = -1;
		this.bn_fld = -1;
		this.bc_fld = -1.0F;
		this.bw_fld = -1;
		this.ba_fld = -1;
		this.bq_fld = false;
		this.cf_fld = 0;
		this.cp_fld = 0;
		this.ce_fld = -1;
		this.cl_fld = new fj[55];
		this.dc_fld = false;
		this.dh_fld = 0;
		this.dv_fld = 0;
		this.dz_fld = 0;
		this.dt_fld = 4;
		this.do_fld = -1;
		this.dl_fld = new na();
		this.dw_fld = 0;
		this.dy_fld = new ei[32];
		this.di_fld = 0;
		this.dn_fld = er.ak_fld;
		this.df_fld = 0;
		this.de_fld = 0;
		this.dm_fld = new int[9];
		this.cd_fld = var2;
		this.cc_fld = var3;
		this.cq_fld = var4;
		this.bl_fld = new ei[var2][var3][var4];
		this.cv_fld = new int[var2][var3 + 1][var4 + 1];
		this.cs_fld = var7;
		this.di_fld = var5;
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
			this.dp_fld = new int[this.dt_fld];
			this.dq_fld = new eh[this.dt_fld][500];
			this.bb_fld = new eh[500];
		}

		fh.ae(var5);
		this.ab();
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	public static void jt(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		ev var7 = hk.mt_fld.az_fld;
		int var8 = var1 + var7.jh_fld;
		int var9 = var2 + var7.jh_fld;
		rl17 var10 = var7.tb_fld[var8 >> 3][var9 >> 3];
		if (var5 == 0) {
			fs var11 = var7.wl(var0, var1, var2);
			if (var11 != null && (var11.ak_fld instanceof dz || var11.ag_fld instanceof dz) && !var10.wu_fld.contains(var11)) {
				var10.wu_fld.add(var11);
			}
		} else if (var5 == 1) {
			fv var12 = var7.qf(var0, var1, var2);
			if (var12 != null && (var12.ak_fld instanceof dz || var12.ag_fld instanceof dz) && !var10.wu_fld.contains(var12)) {
				var10.wu_fld.add(var12);
			}
		} else if (var5 == 2) {
			fj var13 = var7.hi(var0, var1, var2);
			if (var13 != null && var13.ak_fld instanceof dz && !var10.wu_fld.contains(var13)) {
				var10.wu_fld.add(var13);
			}
		} else if (var5 == 3) {
			ef var14 = var7.gc(var0, var1, var2);
			if (var14 != null && var14.ak_fld instanceof dz && !var10.wu_fld.contains(var14)) {
				var10.wu_fld.add(var14);
			}
		}
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
			int var16 = this.dk_fld + var12 * 128 / var14;
			int var17 = this.dx_fld + var15 * 301288381 / var14;
			return var16 >= this.ds_fld && var16 <= this.db_fld && var17 >= this.du_fld && var17 <= this.dg_fld;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void ft(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.av_fld = var5;
		var11.ag_fld = var2 * -1810046336 + -905023168;
		var11.az_fld = var3 * -1839159424 + 1227903936;
		var11.ak_fld = var4;
		var11.aw_fld = var6;
		var11.ae_fld = var8;
		var11.ah_fld = var9;
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
		if (!this.dl() || var1) {
			this.dc_fld = true;
			this.bq_fld = var1;
			this.bw_fld = -1;
			this.ba_fld = -1;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void kz(boolean var1) {
		if (!this.dl() || var1) {
			this.dc_fld = true;
			this.bq_fld = var1;
			this.bw_fld = -1;
			this.ba_fld = -1;
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void kw(int var1, int var2, int var3) {
		this.dh_fld = var1;
		this.dv_fld = var2;
		this.dz_fld = var3;
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void kh(int var1, int var2, int var3) {
		this.dh_fld = var1;
		this.dv_fld = var2;
		this.dz_fld = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfw;Z)V"
	)
	public static void ah(ev var0, fw var1, boolean var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.cp_fld = 0;

				for (int var3 = var0.cf_fld; var3 < var0.cd_fld; var3++) {
					ei[][] var4 = var0.bl_fld[var3];

					for (int var5 = var0.cn_fld; var5 < var0.cr_fld; var5++) {
						for (int var6 = var0.ca_fld; var6 < var0.cg_fld; var6++) {
							ei var7 = var4[var5][var6];
							if (var7 != null
								&& var7.ad_fld <= var0.bx_fld
								&& (
									!var2
										|| dh(var0, var5 - var0.cm_fld + var0.df_fld + var0.di_fld, var6 - var0.cz_fld + var0.de_fld + var0.di_fld)
										|| var0.cs_fld[var3][var5][var6] - var0.cx_fld >= 2000
								)) {
								var0.dw(var1, var7);
							}
						}
					}
				}

				var0.dr();
				fc.ar_fld.au_fld.ae(var0.bd_fld);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long hu(int var1, int var2, int var3) {
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

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIILem;IJ)Z"
	)
	public static boolean lk(ev var0, int var1, int var2, int var3, int var4, em var5, int var6, long var7) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var5 == null) {
			return false;
		} else {
			int var9 = var2 / 128;
			int var10 = var3 / 128;
			if (var9 >= 0 && var10 >= 0 && var9 < var0.cc_fld && var10 < var0.cq_fld) {
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
					var0.bx(var11);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ki() {
		this.bq_fld = true;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ke() {
		this.bq_fld = true;
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(Lrl10;)V"
	)
	public void pi(rl10 var1) {
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
				if (var10 == var1.ne() && var11 == var1.kj() && var9.as_fld < 104 && var9.af_fld < 104) {
					GameObjectSpawned var12 = new GameObjectSpawned();
					var12.setTile(var1);
					var12.setGameObject(var9);
					var2.post(var12);
				}
			}
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void et() {
		this.do_fld = -1;
		this.dd_fld = null;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void mj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		uy var15 = kv.ak();
		ul var16 = uv.ak();
		var16.ak_fld.ar(of.ak(var1), 0.0F, 0.0F);
		tu.md(var16.ag_fld, var4, var5, var6, (byte)-77);
		ul var17 = uv.ak();
		tu.md(var17.ag_fld, -(this.cc_fld * 64) - this.bp_fld, this.bt_fld, -(this.cq_fld * 64) - this.bv_fld, (byte)-49);
		uy var18 = kv.ak();
		var18.ax(var17);
		uy.tm(var15, 1.0F, this.bi_fld, 1.0F, 1.0F, -1493870889);
		var18.al(var15);
		var18.al(this.bo_fld);
		var15.ax(var16);
		var18.al(var15);
		uy.nf(var15, var18, (byte)13);
		var15.aq();
		this.cw_fld = (int)var15.at(var7, var8, var9);
		this.cx_fld = (int)var15.ap(var7, var8, var9);
		this.cy_fld = (int)var15.ab(var7, var8, var9);
		this.cm_fld = this.cw_fld / 128;
		this.cz_fld = this.cy_fld / 128;
		this.ck_fld = (int)var15.at(var12, 0.0F, var13) / 128;
		this.cb_fld = (int)var15.ab(var12, 0.0F, var13) / 128;
		uc var19 = new uc();
		uy var20 = kv.ak();
		var19.ag(of.ak(-var2));
		var19.az(of.ak(-var3));
		uc.nz(var19, var7, var8, var9, -405011595);
		var20.aa(var19);
		var20.aq();
		ul.ln(var16, (byte)-16);
		ul.ln(var17, (byte)-103);
		var15.az();
		var18.al(var20);
		ey var21 = new ey(var18);
		var21.as(var10);
		ej.bk_fld = false;
		this.ds(var21, var14, fc.ar_fld.aa_fld != 1);
		ej.bk_fld = false;
		var20.az();
		var18.az();
	}

	@ObfuscatedName("getRoofRemovalMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRoofRemovalMode() {
		return this.hl_fld;
	}

	@ObfuscatedName("removeGameObject")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/GameObject;)V"
	)
	@Override
	public void removeGameObject(GameObject var1) {
		this.bp((fj)var1);
	}

	@ObfuscatedName("getMapRegions")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getMapRegions() {
		return this.mp_fld;
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean kp() {
		return this.bq_fld && this.bw_fld != -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIILem;IJ)Z"
	)
	public static boolean af(ev var0, int var1, int var2, int var3, int var4, em var5, int var6, long var7) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var5 == null) {
			return false;
		} else {
			int var9 = var2 / 128;
			int var10 = var3 / 128;
			if (var9 >= 0 && var10 >= 0 && var9 < var0.cc_fld && var10 < var0.cq_fld) {
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
					var0.bx(var11);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lem;Z)Z"
	)
	public static boolean jb(em var0, boolean var1) {
		return og.ci_fld.getCallbacks().draw(var0, var1);
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void fg(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		en var11 = new en();
		var11.av_fld = var5;
		var11.ag_fld = var2 * -1810046336 + -905023168;
		var11.az_fld = var3 * -1839159424 + 1227903936;
		var11.ak_fld = var4;
		var11.aw_fld = var6;
		var11.ae_fld = var8;
		var11.ah_fld = var9;
		var11.ay_fld = var10;
		if (this.bl_fld[var1][var2][var3] == null) {
			this.bl_fld[var1][var2][var3] = new ei(var1, var2, var3);
		}

		this.bl_fld[var1][var2][var3].ae_fld = var11;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void kx() {
		if (this.dc_fld) {
			this.dc_fld = false;
			this.bw_fld = this.bu_fld;
			this.ba_fld = this.bn_fld;
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	public void ij(er var1) {
		if (var1 != this.dn_fld) {
			this.dn_fld = var1;
			this.js(this.dm_fld, this.dj_fld, this.es_fld, this.ep_fld, this.eb_fld);
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void kg() {
		this.bw_fld = -1;
		this.bq_fld = false;
	}

	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "(III)Lfs;"
	)
	public fs wl(int var1, int var2, int var3) {
		return ay(this, var1, var2, var3);
	}

	@ObfuscatedName("getUnderlayIds")
	@ObfuscatedSignature(
		descriptor = "()[[[S"
	)
	@Override
	public short[][][] getUnderlayIds() {
		return this.rz_ArrArrArrshort;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hv() {
		this.dr();
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void lw(int var1) {
		this.by_fld = var1;
		this.bu_fld = -1;
		this.bn_fld = -1;
		this.bc_fld = -1.0F;
	}

	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void vn() {
		for (int var1 = 0; var1 < 4; var1++) {
			for (int var2 = 0; var2 < this.cc_fld; var2++) {
				for (int var3 = 0; var3 < this.cq_fld; var3++) {
					int var4 = this.ra(var1, var2, var3);
					if (this.mx(var4)) {
						int var5 = var2 >> 3;
						int var6 = var3 >> 3;
						rl17 var7 = this.tb_fld[var5][var6];
						if ((this.wf_fld[var4] & 32) != 0) {
							if (!qd_fld && var1 != 0) {
								throw new AssertionError();
							}

							int var8 = this.cs_fld[0][var2][var3];
							this.on(var7, var2, var3, var8);
						}

						int var14 = (this.la_fld[1][var2][var3] & 2) >> 1;
						int var9 = var1 + var14;
						int var10 = this.cs_fld[var9][var2][var3];
						this.on(var7, var2, var3, var10);
						int var11 = this.wf_fld[var4];
						if ((var11 & 2048) != 0) {
							ef var12 = this.kg_fld[var4];
							if (var12.ak_fld instanceof fn) {
								this.en(var10, var7, (fn)var12.ak_fld);
							}
						}

						if ((var11 & 16384) != 0) {
							fs var15 = this.rs_fld[var4];
							if (var15.ak_fld instanceof fn) {
								this.en(var10, var7, (fn)var15.ak_fld);
							}

							if (var15.ag_fld instanceof fn) {
								this.en(var10, var7, (fn)var15.ag_fld);
							}
						}

						if ((var11 & 32768) != 0) {
							fv var16 = this.ow_fld[var4];
							if (var16.ak_fld instanceof fn) {
								this.en(var10, var7, (fn)var16.ak_fld);
							}

							if (var16.ag_fld instanceof fn) {
								this.en(var10, var7, (fn)var16.ag_fld);
							}
						}

						for (int var17 = 0; var17 < this.ib_fld[var4]; var17++) {
							fj var13 = this.vh_fld[var4 * 5 + var17];
							if (var13.ak_fld instanceof fn) {
								this.en(var10, var7, (fn)var13.ak_fld);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void kb(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.cc_fld) {
			var1 = this.cc_fld * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.cq_fld) {
			var3 = this.cq_fld * 128 - 1;
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
		this.dv((var4 - ay_fld) / 32, var5 / 64);
		this.cw_fld = var1;
		this.cx_fld = var2;
		this.cy_fld = var3;
		this.cm_fld = var1 / -1212970143;
		this.cz_fld = var3 / 128;
		this.ck_fld = var7 / 128;
		this.cb_fld = var8 / -1268382879;
		this.bx_fld = var6;
		ee var10 = new ee(var1, var2, var3, var4, var5, var7, var8);
		if (this.dd_fld != null) {
			this.dd_fld.cn(fk.ae_fld);
			this.dd_fld.bu(0, var4, var5, 0, 0, 0, -1L);
		}

		if (fc.an()) {
			fc.ar_fld.aa_fld = 0;
			this.ds(var10, var9, true);
			fc.ar_fld.aa_fld = 1;
			this.ds(var10, var9, false);
			fc.ar_fld.aa_fld = 2;
		} else {
			fc.ar_fld.aa_fld = 2;
			this.ds(var10, var9, true);
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)V"
	)
	public static void ls(ev var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var2 += var0.jh_fld;
		var3 += var0.jh_fld;
		int var5 = var0.ra(var1, var2, var3);
		if (var0.mx(var5)) {
			fv var6 = var0.ow_fld[var5];
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

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void li(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.cc_fld * -673334556) {
			var1 = this.cc_fld * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.cq_fld * 186029136) {
			var3 = this.cq_fld * 24273364 - 1;
		}

		if (var4 < 1) {
			var4 = 1;
		} else if (var4 > 520) {
			var4 = 128194161;
		}

		this.ci_fld = fc.ay_fld[var4];
		this.cj_fld = fc.as_fld[var4];
		this.ch_fld = fc.ay_fld[var5];
		this.ct_fld = fc.as_fld[var5];
		this.dv((var4 - ay_fld) / -1776315892, var5 / 670569146);
		this.cw_fld = var1;
		this.cx_fld = var2;
		this.cy_fld = var3;
		this.cm_fld = var1 / 128;
		this.cz_fld = var3 / 1731906337;
		this.ck_fld = var7 / 1407211653;
		this.cb_fld = var8 / 128;
		this.bx_fld = var6;
		ee var10 = new ee(var1, var2, var3, var4, var5, var7, var8);
		if (this.dd_fld != null) {
			this.dd_fld.cn(fk.ae_fld);
			this.dd_fld.bu(0, var4, var5, 0, 0, 0, -1L);
		}

		if (fc.an()) {
			fc.ar_fld.aa_fld = 0;
			this.ds(var10, var9, true);
			fc.ar_fld.aa_fld = 1;
			this.ds(var10, var9, false);
			fc.ar_fld.aa_fld = 2;
		} else {
			fc.ar_fld.aa_fld = 2;
			this.ds(var10, var9, true);
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void du(fw var1, boolean var2) {
		this.cp_fld = 0;

		for (int var3 = this.cf_fld; var3 < this.cd_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.cn_fld; var5 < this.cr_fld; var5++) {
				for (int var6 = this.ca_fld; var6 < this.cg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null
						&& var7.ad_fld <= this.bx_fld
						&& (
							!var2
								|| dh(this, var5 - this.cm_fld + this.df_fld + this.di_fld, var6 - this.cz_fld + this.de_fld + this.di_fld)
								|| this.cs_fld[var3][var5][var6] - this.cx_fld >= 2000
						)) {
						this.dw(var1, var7);
					}
				}
			}
		}

		this.dr();
		fc.ar_fld.au_fld.ae(this.bd_fld);
	}

	@ObfuscatedName("getDrawDistance")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getDrawDistance() {
		return vg_fld;
	}

	@ObfuscatedName("zy")
	@ObfuscatedSignature(
		descriptor = "(Lfw;I)V"
	)
	public void zy(fw var1, int var2) {
		try {
			int var3 = this.wf_fld[var2];
			if ((var3 & 32) != 0) {
				int var4 = 3 << this.ha_fld | var2;
				this.zy(var1, var4);
			}

			int var19 = var2 >> this.lo_fld & this.rl_fld;
			int var5 = var2 & this.ul_fld;
			int var6 = var2 >> this.ha_fld & 3;
			int var7 = this.ya(var2);
			int var8 = this.tx(var2);
			int var9 = var19 - this.jh_fld;
			int var10 = var5 - this.jh_fld;
			if ((var3 & 256) != 0) {
				if (!this.to(var7, var19, var5) && ((var3 & 512) != 0 || var6 <= this.dh_fld)) {
					fa var11 = this.oy_fld[var2];
					var1.jq(this, var11, var8, var7, var9, var10);
				}
			} else if ((var3 & 1024) != 0 && !this.to(var7, var19, var5)) {
				var1.za(this, this.fr_fld[var2], var8, var9, var10);
			}

			if ((var3 & 16384) != 0) {
				fs var20 = this.rs_fld[var2];
				if (var20.ak_fld != null && !this.uf(var7, var19, var5, var20.aw_fld)) {
					this.rw(var1, var20.ak_fld, 0, var20.ae_fld, var20.av_fld, var20.ah_fld, var20.az_fld);
				}

				if (var20.ag_fld != null && !this.uf(var7, var19, var5, var20.aw_fld)) {
					this.rw(var1, var20.ag_fld, 0, var20.ae_fld, var20.av_fld, var20.ah_fld, var20.az_fld);
				}
			}

			if ((var3 & 32768) != 0) {
				fv var21 = this.ow_fld[var2];
				if (!this.po(var7, var19, var5, var21.ak_fld.ez_fld * -1271205903)) {
					if (var21.aw_fld == 256) {
						this.rw(var1, var21.ak_fld, 0, var21.ae_fld + var21.as_fld, var21.av_fld, var21.ah_fld + var21.ar_fld, var21.az_fld);
						if (var21.ag_fld != null) {
							this.rw(var1, var21.ag_fld, 0, var21.ae_fld + var21.af_fld, var21.av_fld, var21.ah_fld + var21.al_fld, var21.az_fld);
						}
					} else {
						this.rw(var1, var21.ak_fld, 0, var21.ae_fld + var21.as_fld, var21.av_fld, var21.ah_fld + var21.ar_fld, var21.az_fld);
					}
				}
			}

			if ((var3 & 2048) != 0) {
				ef var22 = this.kg_fld[var2];
				this.rw(var1, var22.ak_fld, 0, var22.av_fld, var22.az_fld, var22.ae_fld, var22.ag_fld);
			}

			if ((this.wf_fld[var2] & 12288) != 0) {
				en var23 = this.ee_fld[var2];
				if (var23.ae_fld != null) {
					this.rw(var1, var23.ae_fld, 0, var23.ag_fld, var23.ak_fld - var23.ay_fld, var23.az_fld, var23.aw_fld);
				}

				if (var23.ah_fld != null) {
					this.rw(var1, var23.ah_fld, 0, var23.ag_fld, var23.ak_fld - var23.ay_fld, var23.az_fld, var23.aw_fld);
				}

				if (var23.av_fld != null) {
					this.rw(var1, var23.av_fld, 0, var23.ag_fld, var23.ak_fld - var23.ay_fld, var23.az_fld, var23.aw_fld);
				}
			}

			for (int var24 = 0; var24 < this.ib_fld[var2]; var24++) {
				fj var12 = this.vh_fld[var2 * 5 + var24];
				var12.au_fld = this.ce_fld;
				if (var9 == var12.ay_fld && var10 == var12.ar_fld) {
					try {
						this.rw(var1, var12.ak_fld, var12.ag_fld, var12.ah_fld, var12.ae_fld, var12.aw_fld, var12.az_fld);
					} catch (Exception var17) {
						client.ii_fld.debug("exception drawing game entity", (Throwable)var17);
					}
				}
			}

			if ((var3 & 128) != 0) {
				rl17 var25 = this.tb_fld[var19 >> 3][var5 >> 3];

				for (int var26 = 0; var26 < var25.pn_fld.size(); var26++) {
					fj var13 = (fj)(fj)var25.pn_fld.get(var26);
					if (var13.ak_fld instanceof rq && var13.ay_fld == var9 && var13.ar_fld == var10) {
						var13.au_fld = this.ce_fld;

						try {
							this.rw(var1, var13.ak_fld, var13.ag_fld, var13.ah_fld, var13.ae_fld, var13.aw_fld, var13.az_fld);
						} catch (Exception var16) {
							client.ii_fld.debug("exception drawing game entity", (Throwable)var16);
						}
					}
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lei;)Z"
	)
	boolean bx(ei var1) {
		if (var1.as_fld != this.ce_fld) {
			var1.as_fld = this.ce_fld;
			var1.ay_fld = var1.ah_fld;
			if (this.dw_fld >= this.dy_fld.length) {
				this.dy_fld = (ei[])(ei[])Arrays.copyOf(this.dy_fld, this.dy_fld.length * 2);
			}

			this.dy_fld[this.dw_fld++] = var1;
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

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long hm(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld.ag_fld * 2728893160458550201L : 0L;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JLem;Lem;I)V"
	)
	public void br(int var1, int var2, int var3, int var4, em var5, long var6, em var8, em var9, int var10) {
		int var11 = var2 + this.jh_fld;
		int var12 = var3 + this.jh_fld;
		en var13 = new en();
		var13.av_fld = var5;
		var13.ag_fld = var2 * 128 + 64;
		var13.az_fld = var3 * 128 + 64;
		var13.ak_fld = var4;
		var13.aw_fld = var6;
		var13.ae_fld = var8;
		var13.ah_fld = var9;
		var13.ay_fld = var10;
		var13.oq(var1);
		int var14 = this.ra(var1, var11, var12);
		if (!this.mx(var14)) {
			this.ir(var14, var1, var11, var12);
		}

		if (this.iy_fld[var1][var11][var12] == null) {
			this.iy_fld[var1][var11][var12] = new rl10(this, var14);
			this.nd(var1, var11, var12);
		}

		rl17 var15 = this.tb_fld[var11 >> 3][var12 >> 3];
		if ((this.wf_fld[var14] & 12288) != 0) {
			var15.wu_fld.remove(this.ee_fld[var14]);
		}

		this.ee_fld[var14] = var13;
		this.wf_fld[var14] = this.wf_fld[var14] & -12289;
		this.wf_fld[var14] = this.wf_fld[var14] | (var10 != 0 ? 8192 : 4096);
		var15.wu_fld.add(var13);
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean to(int var1, int var2, int var3) {
		return this.dn(var1, var2, var3);
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ev() {
		for (int var1 = 0; var1 < this.cd_fld; var1++) {
			for (int var2 = 0; var2 < this.cc_fld; var2++) {
				for (int var3 = 0; var3 < this.cq_fld; var3++) {
					this.bl_fld[var1][var2][var3] = null;
				}
			}
		}

		if (this.dp_fld != null) {
			for (int var4 = 0; var4 < this.dt_fld; var4++) {
				for (int var7 = 0; var7 < this.dp_fld[var4]; var7++) {
					this.dq_fld[var4][var7] = null;
				}

				this.dp_fld[var4] = 0;
			}
		}

		if (this.bb_fld != null) {
			Arrays.fill(this.bb_fld, null);
		}

		this.bg_fld = 0;

		for (int var5 = 0; var5 < this.dw_fld; var5++) {
			this.dy_fld[var5] = null;
		}

		this.dw_fld = 0;

		for (int var6 = 0; var6 < this.cl_fld.length; var6++) {
			this.cl_fld[var6] = null;
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void lu(fw var1, boolean var2) {
		this.cp_fld = 0;

		for (int var3 = this.cf_fld; var3 < this.cd_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.cn_fld; var5 < this.cr_fld; var5++) {
				for (int var6 = this.ca_fld; var6 < this.cg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null) {
						if (var7.ad_fld <= this.bx_fld
							&& (
								!var2
									|| dh(this, var5 - this.cm_fld + this.df_fld + this.di_fld, var6 - this.cz_fld + this.de_fld + this.di_fld)
									|| this.cs_fld[var3][var5][var6] - this.cx_fld >= 2000
							)) {
							var7.ao_fld = true;
							var7.ab_fld = true;
							var7.ap_fld = var7.ah_fld * 1029554399 > 0 || var7.ag(-534903355);
							this.cp_fld++;
						} else {
							var7.ao_fld = false;
							var7.ab_fld = false;
							var7.at_fld = 0;
						}
					}
				}
			}
		}

		int var14 = Math.abs(this.df_fld);
		int var15 = Math.abs(this.de_fld);

		for (int var16 = this.cf_fld; var16 < this.cd_fld; var16++) {
			ei[][] var18 = this.bl_fld[var16];

			for (int var20 = -(this.di_fld + var14); var20 <= 0; var20++) {
				int var8 = this.cm_fld + var20;
				int var9 = this.cm_fld - var20;
				if (var8 >= this.cn_fld || var9 < this.cr_fld) {
					for (int var10 = -(this.di_fld + var15); var10 <= 0; var10++) {
						int var11 = this.cz_fld + var10;
						int var12 = this.cz_fld - var10;
						if (var8 >= this.cn_fld && var8 < this.cr_fld) {
							if (var11 >= this.ca_fld && var11 < this.cg_fld) {
								ei var13 = var18[var8][var11];
								if (var13 != null && var13.ao_fld) {
									this.dg(var1, var13, true);
								}
							}

							if (var12 >= this.ca_fld && var12 < this.cg_fld) {
								ei var27 = var18[var8][var12];
								if (var27 != null && var27.ao_fld) {
									this.dg(var1, var27, true);
								}
							}
						}

						if (var9 >= this.cn_fld && var9 < this.cr_fld) {
							if (var11 >= this.ca_fld && var11 < this.cg_fld) {
								ei var28 = var18[var9][var11];
								if (var28 != null && var28.ao_fld) {
									this.dg(var1, var28, true);
								}
							}

							if (var12 >= this.ca_fld && var12 < this.cg_fld) {
								ei var29 = var18[var9][var12];
								if (var29 != null && var29.ao_fld) {
									this.dg(var1, var29, true);
								}
							}
						}

						if (this.cp_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ae(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		for (int var17 = this.cf_fld; var17 < this.cd_fld; var17++) {
			ei[][] var19 = this.bl_fld[var17];

			for (int var21 = -(this.di_fld + var14); var21 <= 0; var21++) {
				int var22 = this.co_fld + var21;
				int var23 = this.co_fld - var21;
				if (var22 >= this.cn_fld || var23 < this.cr_fld) {
					for (int var24 = -(this.di_fld + var15); var24 <= 0; var24++) {
						int var25 = this.cu_fld + var24;
						int var26 = this.cu_fld - var24;
						if (var22 >= this.cn_fld && var22 < this.cr_fld) {
							if (var25 >= this.ca_fld && var25 < this.cg_fld) {
								ei var30 = var19[var22][var25];
								if (var30 != null && var30.ao_fld) {
									this.dg(var1, var30, false);
								}
							}

							if (var26 >= this.ca_fld && var26 < this.cg_fld) {
								ei var31 = var19[var22][var26];
								if (var31 != null && var31.ao_fld) {
									this.dg(var1, var31, false);
								}
							}
						}

						if (var23 >= this.cn_fld && var23 < this.cr_fld) {
							if (var25 >= this.ca_fld && var25 < this.cg_fld) {
								ei var32 = var19[var23][var25];
								if (var32 != null && var32.ao_fld) {
									this.dg(var1, var32, false);
								}
							}

							if (var26 >= this.ca_fld && var26 < this.cg_fld) {
								ei var33 = var19[var23][var26];
								if (var33 != null && var33.ao_fld) {
									this.dg(var1, var33, false);
								}
							}
						}

						if (this.cp_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ae(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		fc.ar_fld.au_fld.ae(this.bd_fld);
		this.dr();
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Z)V"
	)
	void lt(fw var1, boolean var2) {
		this.cp_fld = 0;

		for (int var3 = this.cf_fld; var3 < this.cd_fld; var3++) {
			ei[][] var4 = this.bl_fld[var3];

			for (int var5 = this.cn_fld; var5 < this.cr_fld; var5++) {
				for (int var6 = this.ca_fld; var6 < this.cg_fld; var6++) {
					ei var7 = var4[var5][var6];
					if (var7 != null) {
						if (var7.ad_fld <= this.bx_fld
							&& (
								!var2
									|| dh(this, var5 - this.cm_fld + this.df_fld + this.di_fld, var6 - this.cz_fld + this.de_fld + this.di_fld)
									|| this.cs_fld[var3][var5][var6] - this.cx_fld >= 1701727096
							)) {
							var7.ao_fld = true;
							var7.ab_fld = true;
							var7.ap_fld = var7.ah_fld > 0 || var7.ag(-374388801);
							this.cp_fld++;
						} else {
							var7.ao_fld = false;
							var7.ab_fld = false;
							var7.at_fld = 0;
						}
					}
				}
			}
		}

		int var14 = Math.abs(this.df_fld);
		int var15 = Math.abs(this.de_fld);

		for (int var16 = this.cf_fld; var16 < this.cd_fld; var16++) {
			ei[][] var18 = this.bl_fld[var16];

			for (int var20 = -(this.di_fld + var14); var20 <= 0; var20++) {
				int var8 = this.cm_fld + var20;
				int var9 = this.cm_fld - var20;
				if (var8 >= this.cn_fld || var9 < this.cr_fld) {
					for (int var10 = -(this.di_fld + var15); var10 <= 0; var10++) {
						int var11 = this.cz_fld + var10;
						int var12 = this.cz_fld - var10;
						if (var8 >= this.cn_fld && var8 < this.cr_fld) {
							if (var11 >= this.ca_fld && var11 < this.cg_fld) {
								ei var13 = var18[var8][var11];
								if (var13 != null && var13.ao_fld) {
									this.dg(var1, var13, true);
								}
							}

							if (var12 >= this.ca_fld && var12 < this.cg_fld) {
								ei var27 = var18[var8][var12];
								if (var27 != null && var27.ao_fld) {
									this.dg(var1, var27, true);
								}
							}
						}

						if (var9 >= this.cn_fld && var9 < this.cr_fld) {
							if (var11 >= this.ca_fld && var11 < this.cg_fld) {
								ei var28 = var18[var9][var11];
								if (var28 != null && var28.ao_fld) {
									this.dg(var1, var28, true);
								}
							}

							if (var12 >= this.ca_fld && var12 < this.cg_fld) {
								ei var29 = var18[var9][var12];
								if (var29 != null && var29.ao_fld) {
									this.dg(var1, var29, true);
								}
							}
						}

						if (this.cp_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ae(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		for (int var17 = this.cf_fld; var17 < this.cd_fld; var17++) {
			ei[][] var19 = this.bl_fld[var17];

			for (int var21 = -(this.di_fld + var14); var21 <= 0; var21++) {
				int var22 = this.co_fld + var21;
				int var23 = this.co_fld - var21;
				if (var22 >= this.cn_fld || var23 < this.cr_fld) {
					for (int var24 = -(this.di_fld + var15); var24 <= 0; var24++) {
						int var25 = this.cu_fld + var24;
						int var26 = this.cu_fld - var24;
						if (var22 >= this.cn_fld && var22 < this.cr_fld) {
							if (var25 >= this.ca_fld && var25 < this.cg_fld) {
								ei var30 = var19[var22][var25];
								if (var30 != null && var30.ao_fld) {
									this.dg(var1, var30, false);
								}
							}

							if (var26 >= this.ca_fld && var26 < this.cg_fld) {
								ei var31 = var19[var22][var26];
								if (var31 != null && var31.ao_fld) {
									this.dg(var1, var31, false);
								}
							}
						}

						if (var23 >= this.cn_fld && var23 < this.cr_fld) {
							if (var25 >= this.ca_fld && var25 < this.cg_fld) {
								ei var32 = var19[var23][var25];
								if (var32 != null && var32.ao_fld) {
									this.dg(var1, var32, false);
								}
							}

							if (var26 >= this.ca_fld && var26 < this.cg_fld) {
								ei var33 = var19[var23][var26];
								if (var33 != null && var33.ao_fld) {
									this.dg(var1, var33, false);
								}
							}
						}

						if (this.cp_fld == 0) {
							this.dr();
							fc.ar_fld.au_fld.ae(this.bd_fld);
							return;
						}
					}
				}
			}
		}

		fc.ar_fld.au_fld.ae(this.bd_fld);
		this.dr();
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lrl17;II)Z"
	)
	public boolean lj(rl17 var1, int var2, int var3) {
		if ((client.jb_fld & 32) != 0) {
			return client.fa_fld.zoneInFrustum(var2, var3, var1.lp_fld, var1.su_fld);
		} else {
			int var4 = var1.lp_fld;
			int var5 = -var1.su_fld;
			int var6 = ((var2 << 3) - this.jh_fld << 7) + 512 - this.cw_fld;
			int var7 = ((var3 << 3) - this.jh_fld << 7) + 512 - this.cy_fld;
			int var8 = var4 - this.cx_fld;
			short var9 = 724;
			int var10 = fc.ar_fld.ej();
			int var11 = fc.ar_fld.lf();
			int var12 = fc.ar_fld.yg();
			int var13 = fc.ar_fld.mw();
			int var14 = fc.ar_fld.ki();
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IIIJ)I"
	)
	public int cx(int var1, int var2, int var3, long var4) {
		ei var6 = this.bl_fld[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.an_fld != null && var6.an_fld.az_fld * -4472860599998239529L == var4) {
			return var6.an_fld.as_fld * 57097171 & 0xFF;
		} else if (var6.aa_fld != null && var6.aa_fld.az_fld * 7130385936274174641L == var4) {
			return var6.aa_fld.au_fld * 1463326926 & 0xFF;
		} else if (var6.ai_fld != null && var6.ai_fld.ag_fld * 2728893160458550201L == var4) {
			return ef.pp(var6.ai_fld, -91466746) & 0xFF;
		} else {
			for (int var7 = 0; var7 < var6.ah_fld; var7++) {
				if (var6.aw_fld[var7].az_fld * 2121558925630479837L == var4) {
					return var6.aw_fld[var7].ax_fld * -1613956585 & 1057028374;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lei;Z)V"
	)
	void lx(fw var1, ei var2, boolean var3) {
		try {
			this.dl_fld.av(var2);

			label663:
			while (true) {
				ei var4;
				int var5;
				int var6;
				int var7;
				int var8;
				ei[][] var9;
				while (true) {
					var4 = (ei)this.dl_fld.ae();
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

							if (var5 <= this.cm_fld && var5 > this.cn_fld) {
								ei var23 = var9[var5 - 1][var6];
								if (var23 != null && var23.ab_fld && (var23.ao_fld || (var4.am_fld & 1) == 0)) {
									continue;
								}
							}

							if (var5 >= this.cm_fld && var5 < this.cr_fld - 1) {
								ei var24 = var9[var5 + 1][var6];
								if (var24 != null && var24.ab_fld && (var24.ao_fld || (var4.am_fld & 4) == 0)) {
									continue;
								}
							}

							if (var6 <= this.cz_fld && var6 > this.ca_fld) {
								ei var25 = var9[var5][var6 - 1];
								if (var25 != null && var25.ab_fld && (var25.ao_fld || (var4.am_fld & 8) == 0)) {
									continue;
								}
							}

							if (var6 >= this.cz_fld && var6 < this.cg_fld - 1) {
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
								if (!this.dn(0, var5, var6)) {
									var1.ag(this, var27.az_fld, 0, var5, var6, 1070004095);
								}
							} else if (var27.av_fld != null && !this.dn(0, var5, var6)) {
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
							if (!this.dn(var8, var5, var6)) {
								var28 = true;
								if (var4.az_fld.az_fld * -1656357861 != 12345678 || var7 <= this.dh_fld) {
									var1.ag(this, var4.az_fld, var8, var5, var6, 1425591655);
								}
							}
						} else if (var4.av_fld != null && !this.dn(var8, var5, var6)) {
							var28 = true;
							var1.az(this, var4.av_fld, var5, var6, (byte)-125);
						}

						int var36 = 0;
						int var49 = 0;
						fs var56 = var4.an_fld;
						fv var14 = var4.aa_fld;
						if (var56 != null || var14 != null) {
							if (this.cm_fld == var5) {
								var36++;
							} else if (this.cm_fld < var5) {
								var36 += 2;
							}

							if (this.cz_fld == var6) {
								var36 += 3;
							} else if (this.cz_fld > var6) {
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

							if ((var56.aw_fld & var49) != 0 && !this.ly(var8, var5, var6, var56.aw_fld)) {
								var1.ak(var56.ak_fld, 0, var56.ae_fld, var56.av_fld, var56.ah_fld, var56.az_fld);
							}

							if ((var56.ay_fld & var49) != 0 && !this.ly(var8, var5, var6, var56.ay_fld)) {
								var1.ak(var56.ag_fld, 0, var56.ae_fld, var56.av_fld, var56.ah_fld, var56.az_fld);
							}
						}

						if (var14 != null && !this.ck(var8, var5, var6, var14.ak_fld.ez_fld * -1271205903)) {
							if ((var14.aw_fld & var49) != 0) {
								var1.ak(var14.ak_fld, 0, var14.ae_fld + var14.as_fld, var14.av_fld, var14.ah_fld + var14.ar_fld, var14.az_fld);
							} else if (var14.aw_fld == 256) {
								int var15 = var14.ae_fld - this.cw_fld;
								int var16 = var14.ah_fld - this.cy_fld;
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
								var1.ak(var65.ak_fld, 0, var65.av_fld, var65.az_fld, var65.ae_fld, var65.ag_fld);
							}

							en var71 = var4.ae_fld;
							if (var71 != null && var71.ay_fld == 0) {
								if (var71.ae_fld != null) {
									var1.ak(var71.ae_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}

								if (var71.ah_fld != null) {
									var1.ak(var71.ah_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}

								if (var71.av_fld != null) {
									var1.ak(var71.av_fld, 0, var71.ag_fld, var71.ak_fld, var71.az_fld, var71.aw_fld);
								}
							}
						}

						int var66 = var4.am_fld;
						if (var66 != 0) {
							if (var5 < this.cm_fld && var5 >= this.cn_fld && var5 < this.cr_fld - 1 && (var66 & 4) != 0) {
								ei var72 = var9[var5 + 1][var6];
								if (var72 != null && var72.ab_fld) {
									this.dl_fld.av(var72);
								}
							}

							if (var6 < this.cz_fld && var6 >= this.ca_fld && var6 < this.cg_fld - 1 && (var66 & 2) != 0) {
								ei var73 = var9[var5][var6 + 1];
								if (var73 != null && var73.ab_fld) {
									this.dl_fld.av(var73);
								}
							}

							if (var5 > this.cm_fld && var5 > this.cn_fld && var5 < this.cr_fld && (var66 & 1) != 0) {
								ei var74 = var9[var5 - 1][var6];
								if (var74 != null && var74.ab_fld) {
									this.dl_fld.av(var74);
								}
							}

							if (var6 > this.cz_fld && var6 > this.ca_fld && var6 < this.cg_fld && (var66 & 8) != 0) {
								ei var75 = var9[var5][var6 - 1];
								if (var75 != null && var75.ab_fld) {
									this.dl_fld.av(var75);
								}
							}
						}
						break;
					}
				}

				if (var4.at_fld != 0) {
					boolean var29 = true;

					for (int var37 = 0; var37 < var4.ah_fld; var37++) {
						if (var4.aw_fld[var37].au_fld * 1952704125 != this.ce_fld && (var4.aq_fld[var37] & var4.at_fld) == var4.ac_fld) {
							var29 = false;
							break;
						}
					}

					if (var29) {
						fs var38 = var4.an_fld;
						if (!this.ly(var8, var5, var6, var38.aw_fld)) {
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
							if (var50.au_fld != this.ce_fld) {
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
								var50.al_fld = this.dy(var50, this.cm_fld, this.cz_fld);
							}
						}

						if (var4.ag(339136532)) {
							for (int var40 = 0; var40 < var4.ar_fld.size(); var40++) {
								fj var51 = (fj)(fj)var4.ar_fld.get(var40);
								if (var51.au_fld != this.ce_fld) {
									this.cl_fld[var30++] = var51;
									var51.al_fld = this.dy(var51, this.cm_fld, this.cz_fld);
								}
							}
						}

						while (true) {
							int var41 = -50;
							int var52 = -1;

							for (int var58 = 0; var58 < var30; var58++) {
								fj var62 = this.cl_fld[var58];
								if (var62.au_fld != this.ce_fld) {
									if (var62.al_fld > var41) {
										var41 = var62.al_fld;
										var52 = var58;
									} else if (var62.al_fld == var41) {
										int var68 = var62.ah_fld - this.cw_fld;
										int var77 = var62.aw_fld - this.cy_fld;
										int var80 = this.cl_fld[var52].ah_fld * -564370133 - this.cw_fld;
										int var81 = this.cl_fld[var52].aw_fld * -502866077 - this.cy_fld;
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
							var59.au_fld = this.ce_fld;
							if (!zs(this, var8, var59.ay_fld, var59.as_fld, var59.ar_fld, var59.af_fld, var59.ak_fld.ez_fld * -1271205903)) {
								var1.ak(var59.ak_fld, var59.ag_fld, var59.ah_fld, var59.ae_fld, var59.aw_fld, var59.az_fld);
							}

							for (int var63 = var59.ay_fld; var63 <= var59.as_fld; var63++) {
								for (int var69 = var59.ar_fld; var69 <= var59.af_fld; var69++) {
									ei var78 = var9[var63][var69];
									if (var78.at_fld != 0) {
										this.dl_fld.av(var78);
									} else if ((var63 != var5 || var69 != var6) && var78.ab_fld) {
										this.dl_fld.av(var78);
									}
								}
							}
						}
					} catch (Exception var21) {
						var4.ap_fld = false;
					}
				}

				if (var4.ab_fld && var4.at_fld == 0) {
					if (var5 <= this.cm_fld && var5 > this.cn_fld) {
						ei var31 = var9[var5 - 1][var6];
						if (var31 != null && var31.ab_fld) {
							continue;
						}
					}

					if (var5 >= this.cm_fld && var5 < this.cr_fld - 1) {
						ei var32 = var9[var5 + 1][var6];
						if (var32 != null && var32.ab_fld) {
							continue;
						}
					}

					if (var6 <= this.cz_fld && var6 > this.ca_fld) {
						ei var33 = var9[var5][var6 - 1];
						if (var33 != null && var33.ab_fld) {
							continue;
						}
					}

					if (var6 >= this.cz_fld && var6 < this.cg_fld - 1) {
						ei var34 = var9[var5][var6 + 1];
						if (var34 != null && var34.ab_fld) {
							continue;
						}
					}

					var4.ab_fld = false;
					this.cp_fld--;
					en var35 = var4.ae_fld;
					if (var35 != null && var35.ay_fld != 0) {
						if (var35.ae_fld != null) {
							var1.ak(var35.ae_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}

						if (var35.ah_fld != null) {
							var1.ak(var35.ah_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}

						if (var35.av_fld != null) {
							var1.ak(var35.av_fld, 0, var35.ag_fld, var35.ak_fld - var35.ay_fld, var35.az_fld, var35.aw_fld);
						}
					}

					if (var4.bm_fld != 0) {
						fv var42 = var4.aa_fld;
						if (var42 != null && !this.ck(var8, var5, var6, var42.ak_fld.ez_fld * -1271205903)) {
							if ((var42.aw_fld & var4.bm_fld) != 0) {
								var1.ak(var42.ak_fld, 0, var42.ae_fld + var42.as_fld, var42.av_fld, var42.ah_fld + var42.ar_fld, var42.az_fld);
							} else if (var42.aw_fld == 256) {
								int var53 = var42.ae_fld - this.cw_fld;
								int var60 = var42.ah_fld - this.cy_fld;
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
							if ((var54.ay_fld & var4.bm_fld) != 0 && !this.ly(var8, var5, var6, var54.ay_fld)) {
								var1.ak(var54.ag_fld, 0, var54.ae_fld, var54.av_fld, var54.ah_fld, var54.az_fld);
							}

							if ((var54.aw_fld & var4.bm_fld) != 0 && !this.ly(var8, var5, var6, var54.aw_fld)) {
								var1.ak(var54.ak_fld, 0, var54.ae_fld, var54.av_fld, var54.ah_fld, var54.az_fld);
							}
						}
					}

					if (var7 < this.cd_fld - 1) {
						ei var43 = this.bl_fld[var7 + 1][var5][var6];
						if (var43 != null && var43.ab_fld) {
							this.dl_fld.av(var43);
						}
					}

					if (var5 < this.cm_fld && var5 >= this.cn_fld && var5 < this.cr_fld - 1) {
						ei var44 = var9[var5 + 1][var6];
						if (var44 != null && var44.ab_fld) {
							this.dl_fld.av(var44);
						}
					}

					if (var6 < this.cz_fld && var6 >= this.ca_fld && var6 < this.cg_fld - 1) {
						ei var45 = var9[var5][var6 + 1];
						if (var45 != null && var45.ab_fld) {
							this.dl_fld.av(var45);
						}
					}

					if (var5 > this.cm_fld && var5 > this.cn_fld && var5 < this.cr_fld) {
						ei var46 = var9[var5 - 1][var6];
						if (var46 != null && var46.ab_fld) {
							this.dl_fld.av(var46);
						}
					}

					if (var6 > this.cz_fld && var6 > this.ca_fld && var6 < this.cg_fld) {
						ei var47 = var9[var5][var6 - 1];
						if (var47 != null && var47.ab_fld) {
							this.dl_fld.av(var47);
						}
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("xe")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void xe(int var1, int var2) {
		if (!qd_fld && (var2 & 15) != var2) {
			throw new AssertionError();
		} else {
			this.wf_fld[var1] = this.wf_fld[var1] & -15728641;
			this.wf_fld[var1] = this.wf_fld[var1] | var2 << 20;
		}
	}

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIIILem;IJI)Z"
	)
	public static boolean ri(ev var0, int var1, int var2, int var3, int var4, int var5, int var6, em var7, int var8, long var9, int var11) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var7 == null) {
				return true;
			} else {
				int var12 = var2 * 128 + 64 * var5;
				int var13 = var3 * 128 + 64 * var6;
				return var0.by(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
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
					if (!this.dn(var6, var3, var4) && (var2.az_fld.az_fld * -1996943778 != 12345678 || var5 <= this.dh_fld)) {
						var1.ag(this, var2.az_fld, var6, var3, var4, 1814363428);
					}
				} else if (var2.av_fld != null && !this.dn(var6, var3, var4)) {
					var1.az(this, var2.av_fld, var3, var4, (byte)-111);
				}

				fs var7 = var2.an_fld;
				if (var7 != null) {
					if (var7.ak_fld != null && !this.ly(var6, var3, var4, var7.aw_fld * 1620546755)) {
						var1.ak(var7.ak_fld, 0, var7.ae_fld, var7.av_fld, var7.ah_fld, var7.az_fld);
					}

					if (var7.ag_fld != null && !this.ly(var6, var3, var4, var7.ay_fld * 832960368)) {
						var1.ak(var7.ag_fld, 0, var7.ae_fld * 2069066814, var7.av_fld * -645299925, var7.ah_fld * 1398193545, var7.az_fld);
					}
				}

				fv var8 = var2.aa_fld;
				if (var8 != null && !this.ck(var6, var3, var4, var8.ak_fld.ez_fld * -1271205903)) {
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
					var1.ak(var9.ak_fld, 0, var9.av_fld * -1420064736, var9.az_fld, var9.ae_fld, var9.ag_fld);
				}

				en var10 = var2.ae_fld;
				if (var10 != null) {
					if (var10.ae_fld != null) {
						var1.ak(var10.ae_fld, 0, var10.ag_fld * -1329456708, var10.ak_fld - var10.ay_fld, var10.az_fld, var10.aw_fld);
					}

					if (var10.ah_fld != null) {
						var1.ak(var10.ah_fld, 0, var10.ag_fld * 167580324, var10.ak_fld - var10.ay_fld, var10.az_fld * -1652776856, var10.aw_fld);
					}

					if (var10.av_fld != null) {
						var1.ak(var10.av_fld, 0, var10.ag_fld, var10.ak_fld - var10.ay_fld, var10.az_fld, var10.aw_fld);
					}
				}

				for (int var11 = 0; var11 < var2.ah_fld; var11++) {
					fj var12 = var2.aw_fld[var11];
					var12.au_fld = this.ce_fld * -439268463;
					if (var12.ay_fld == var2.al_fld
						&& var12.ar_fld == var2.au_fld
						&& !zs(this, var6, var12.ay_fld * -473322276, var12.as_fld, var12.ar_fld * -608337963, var12.af_fld * -675889490, var12.ak_fld.ez_fld * -1113141377)) {
						try {
							var1.ak(var12.ak_fld, var12.ag_fld, var12.ah_fld, var12.ae_fld * -828754752, var12.aw_fld, var12.az_fld);
						} catch (Exception var16) {
						}
					}
				}

				if (var2.ag(-221309821)) {
					for (int var18 = 0; var18 < var2.ar_fld.size(); var18++) {
						fj var19 = (fj)(fj)var2.ar_fld.get(var18);
						var19.au_fld = this.ce_fld * 1724089629;
						if (!zs(this, var6, var2.al_fld * -1825981336, var2.al_fld, var2.au_fld, var2.au_fld * -179370268, var19.ak_fld.ez_fld * -1731035669)) {
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

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Z"
	)
	public static boolean da(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = 0; var4 < var0.bg_fld; var4++) {
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

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(Lpw;)V"
	)
	public static void qy(pw var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Z)I"
	)
	public static int ef(boolean var0) {
		return var0 ? 520 : -83780963;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean jo(int var1, int var2, int var3, int var4) {
		if (!this.df(var1, var2, var3, var4)) {
			return ml.hi(this, var1, var2, var3, var4);
		} else {
			og(this, var1, var2, var3, var4, false);
			int var5 = var1 * 32 + ay_fld;
			int var6 = var2 * 64;
			int var7 = (var3 - this.di_fld - this.df_fld - 1) * 128;
			int var8 = (var4 - this.di_fld - this.de_fld - 1) * 128;

			for (int var9 = -this.dj_fld; var9 <= this.es_fld; var9 += 128) {
				if (ry(this, var7, this.dm_fld[var1] + var9, var8, var5, var6)) {
					return this.ct(var1, var2, var3, var4, true);
				}
			}

			return this.ct(var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dl() {
		return this.bq_fld && this.bw_fld != -1;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ks() {
		this.bw_fld = -1;
		this.bq_fld = false;
	}

	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIII)Z"
	)
	public static boolean ry(ev var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

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
			int var16 = var0.dk_fld + var12 * 128 / var14;
			int var17 = var0.dx_fld + var15 * 128 / var14;
			return var16 >= var0.ds_fld && var16 <= var0.db_fld && var17 >= var0.du_fld && var17 <= var0.dg_fld;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int ra(int var1, int var2, int var3) {
		if (qd_fld || var1 >= 0 && var1 <= 3) {
			if (qd_fld || var2 >= 0 && var2 < this.cc_fld) {
				if (qd_fld || var3 >= 0 && var3 < this.cq_fld) {
					return var1 << this.ha_fld | var2 << this.lo_fld | var3;
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bf() {
		int var2 = this.jo_fld;
		var2 <<= 1;
		int var1 = this.of_fld[var2];
		if (var1 >= this.jo_fld) {
			return this.me_fld;
		} else {
			this.ig(var1);
			return var1;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;Lem;IIJI)V"
	)
	public void hr(int var1, int var2, int var3, int var4, em var5, em var6, int var7, int var8, long var9, int var11) {
		try {
			this.be(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean de(int var1, int var2, int var3, int var4) {
		if (!this.dn(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.cs_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.cw_fld) {
						if (!this.dj(var5, var7, var6)) {
							return false;
						}

						if (!this.dj(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6)) {
							return false;
						}

						if (!this.dj(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6)) {
						return false;
					}

					if (!this.dj(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.cy_fld) {
						if (!this.dj(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.cw_fld) {
						if (!this.dj(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.cy_fld) {
						if (!this.dj(var5, var7, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.dj(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.dj(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.dj(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.dj(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? this.dj(var5, var9, var6) : true;
			}
		}
	}

	@ObfuscatedName("getBaseY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBaseY() {
		return this.nd_fld;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ku(int var1, int var2, int var3, int var4) {
		if (!this.dn(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.cs_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.cw_fld) {
						if (!this.dj(var5, var7, var6)) {
							return false;
						}

						if (!this.dj(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6)) {
							return false;
						}

						if (!this.dj(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6)) {
						return false;
					}

					if (!this.dj(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.cy_fld) {
						if (!this.dj(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.cw_fld) {
						if (!this.dj(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.dj(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.cy_fld) {
						if (!this.dj(var5, var7, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.dj(var5, var8, var6)) {
							return false;
						}

						if (!this.dj(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.dj(var5, var9, var6)) {
						return false;
					}

					if (!this.dj(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.dj(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.dj(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.dj(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.dj(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? this.dj(var5, var9, var6) : true;
			}
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int fp(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean po(int var1, int var2, int var3, int var4) {
		return this.ck(var1, var2, var3, var4);
	}

	@ObfuscatedName("getWorldViewId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWorldViewId() {
		return this.po_fld;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean co(int var1, int var2, int var3, int var4) {
		if (!this.dn(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.dj(var5 + 1, this.cs_fld[var1][var2][var3] - var4, var6 + 1)
				&& this.dj(var5 + 128 - 1, this.cs_fld[var1][var2 + 1][var3] - var4, var6 + 1)
				&& this.dj(var5 + 128 - 1, this.cs_fld[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
				&& this.dj(var5 + 1, this.cs_fld[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)J"
	)
	public static long nj(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld.ag_fld * 2728893160458550201L : 0L;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void mb(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					var0.bp(var6);
					return;
				}
			}
		}
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIJ)I"
	)
	public static int us(ev var0, int var1, int var2, int var3, long var4) {
		ei var6 = var0.bl_fld[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.an_fld != null && var6.an_fld.az_fld * -4472860599998239529L == var4) {
			return var6.an_fld.as_fld * -2088485856 & 0xFF;
		} else if (var6.aa_fld != null && var6.aa_fld.az_fld * 7130385936274174641L == var4) {
			return var6.aa_fld.au_fld * -890468509 & 0xFF;
		} else if (var6.ai_fld != null && var6.ai_fld.ag_fld * 2728893160458550201L == var4) {
			return ef.pp(var6.ai_fld, 834095326) & 0xFF;
		} else {
			for (int var7 = 0; var7 < var6.ah_fld; var7++) {
				if (var6.aw_fld[var7].az_fld * 2121558925630479837L == var4) {
					return var6.aw_fld[var7].ax_fld * 239029509 & 0xFF;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void rh(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.dh_fld = var1;
			var0.dv_fld = var2;
			var0.dz_fld = var3;
		}
	}

	@ObfuscatedName("yk")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lrl17;)V"
	)
	public void yk(fw var1, rl17 var2) {
		try {
			for (int var3 = 0; var3 < var2.pn_fld.size(); var3++) {
				fj var4 = (fj)(fj)var2.pn_fld.get(var3);
				if (var4.ak_fld instanceof ev) {
					var1.ai(var4.ak_fld, var4.ag_fld, var4.ah_fld, var4.ae_fld, var4.aw_fld, var4.az_fld);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(IIF)V"
	)
	public void oj(int var1, int var2, float var3) {
		int var4 = var1;
		int var5 = var2;
		cv var6 = cl.aj_fld;
		if (this.aj_fld && var6 != null && var6.getWorldView().isTopLevel()) {
			int var7 = var6.bo_fld >> 7;
			int var8 = var6.bp_fld >> 7;
			byte var11 = 70;
			int var12 = (int)Math.hypot(var7 - var1, var8 - var2) - 70;
			if (var12 > 0) {
				var4 = (70 * var1 + var12 * var7) / (70 + var12);
				var5 = (70 * var2 + var12 * var8) / (70 + var12);
			}
		}

		this.bu_fld = var4;
		this.bn_fld = var5;
		this.bc_fld = var3;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(III)Lef;"
	)
	public ef hw(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld : null;
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void mm(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		uy var15 = kv.ak();
		ul var16 = uv.ak();
		var16.ak_fld.ar(of.ak(var1), 0.0F, 0.0F);
		tu.md(var16.ag_fld, var4, var5, var6, (byte)-12);
		ul var17 = uv.ak();
		tu.md(var17.ag_fld, -(this.cc_fld * 64) - this.bp_fld, this.bt_fld, -(this.cq_fld * 471006537) - this.bv_fld, (byte)73);
		uy var18 = kv.ak();
		var18.ax(var17);
		uy.tm(var15, 1.0F, this.bi_fld, 1.0F, 1.0F, 287667574);
		var18.al(var15);
		var18.al(this.bo_fld);
		var15.ax(var16);
		var18.al(var15);
		uy.nf(var15, var18, (byte)-116);
		var15.aq();
		this.cw_fld = (int)var15.at(var7, var8, var9);
		this.cx_fld = (int)var15.ap(var7, var8, var9);
		this.cy_fld = (int)var15.ab(var7, var8, var9);
		this.cm_fld = this.cw_fld / 128;
		this.cz_fld = this.cy_fld / 682993848;
		this.ck_fld = (int)var15.at(var12, 0.0F, var13) / 128;
		this.cb_fld = (int)var15.ab(var12, 0.0F, var13) / 128;
		uc var19 = new uc();
		uy var20 = kv.ak();
		var19.ag(of.ak(-var2));
		var19.az(of.ak(-var3));
		uc.nz(var19, var7, var8, var9, -405011595);
		var20.aa(var19);
		var20.aq();
		ul.ln(var16, (byte)-22);
		ul.ln(var17, (byte)-88);
		var15.az();
		var18.al(var20);
		ey var21 = new ey(var18);
		var21.as(var10);
		ej.bk_fld = false;
		this.ds(var21, var14, fc.ar_fld.aa_fld != 1);
		ej.bk_fld = false;
		var20.az();
		var18.az();
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean na(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		return af(var0, var1, var2, var3, var4, var5, var6, var7);
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Lev;ILfn;)V"
	)
	public static void el(ev var0, int var1, fn var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.do_fld = var1;
		var0.dd_fld = var2;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void mx(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		uy var15 = kv.ak();
		ul var16 = uv.ak();
		var16.ak_fld.ar(of.ak(var1), 0.0F, 0.0F);
		tu.md(var16.ag_fld, var4, var5, var6, (byte)12);
		ul var17 = uv.ak();
		tu.md(var17.ag_fld, -(this.cc_fld * -979250146) - this.bp_fld, this.bt_fld, -(this.cq_fld * -1773465042) - this.bv_fld, (byte)42);
		uy var18 = kv.ak();
		var18.ax(var17);
		uy.tm(var15, 1.0F, this.bi_fld, 1.0F, 1.0F, 2088242313);
		var18.al(var15);
		var18.al(this.bo_fld);
		var15.ax(var16);
		var18.al(var15);
		uy.nf(var15, var18, (byte)-24);
		var15.aq();
		this.cw_fld = (int)var15.at(var7, var8, var9);
		this.cx_fld = (int)var15.ap(var7, var8, var9);
		this.cy_fld = (int)var15.ab(var7, var8, var9);
		this.cm_fld = this.cw_fld / 2018427147;
		this.cz_fld = this.cy_fld / -1724321723;
		this.ck_fld = (int)var15.at(var12, 0.0F, var13) / 128;
		this.cb_fld = (int)var15.ab(var12, 0.0F, var13) / 128;
		uc var19 = new uc();
		uy var20 = kv.ak();
		var19.ag(of.ak(-var2));
		var19.az(of.ak(-var3));
		uc.nz(var19, var7, var8, var9, -405011595);
		var20.aa(var19);
		var20.aq();
		ul.ln(var16, (byte)-2);
		ul.ln(var17, (byte)-59);
		var15.az();
		var18.al(var20);
		ey var21 = new ey(var18);
		var21.as(var10);
		ej.bk_fld = false;
		this.ds(var21, var14, fc.ar_fld.aa_fld != 1);
		ej.bk_fld = false;
		var20.az();
		var18.az();
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void do_(int var1, int var2, int var3) {
		this.dh_fld = var1;
		this.dv_fld = var2;
		this.dz_fld = var3;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	boolean dc(int var1, int var2, int var3, int var4, boolean var5) {
		return rl16.ie(this, this.ed_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public void ac(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		eh var9 = new eh();
		var9.al_fld = var3 / 128 * 1910341793;
		var9.ak_fld = var4 / 128 * -92276353;
		var9.af_fld = var5 / 128 * 589391903;
		var9.af_fld = var6 / 128 * -533939309;
		var9.ak_fld = var2 * -139089515;
		var9.ay_fld = var3 * -1433563909;
		var9.as_fld = var4 * 1545529577;
		var9.ai_fld = var5 * -1684906885;
		var9.az_fld = var6 * -1864950081;
		var9.al_fld = var7 * -89005759;
		var9.aw_fld = var8 * 214746989;
		this.dq_fld[var1][this.dp_fld[var1]++] = var9;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)V"
	)
	public void an(fj var1) {
		int var2 = (int)(var1.az_fld >> 16 & 7L);
		if (var2 == 2) {
			if (!qd_fld && var1.getRenderable() instanceof da) {
				throw new AssertionError();
			} else if (!qd_fld && var1.getRenderable() instanceof bc) {
				throw new AssertionError();
			} else if (!qd_fld && var1.getRenderable() instanceof bt) {
				throw new AssertionError();
			} else if (!qd_fld && var1.getRenderable() instanceof ev) {
				throw new AssertionError();
			} else if (!qd_fld && var1.getRenderable() instanceof rq) {
				throw new AssertionError();
			} else {
				int var3 = var1.ay_fld + this.jh_fld;
				int var4 = var1.ar_fld + this.jh_fld;
				int var5 = var1.getPlane();
				client.ii_fld.trace("Game object despawn: {}", var1.getId());
				if (var1.ak_fld instanceof dz) {
					rl17 var6 = this.tb_fld[var3 >> 3][var4 >> 3];
					var6.wu_fld.remove(var1);
				}

				if (this.sv_fld) {
					GameObjectDespawned var7 = new GameObjectDespawned();
					var7.setTile(this.iy_fld[var5][var3][var4]);
					var7.setGameObject(var1);
					og.ci_fld.getCallbacks().post(var7);
				}

				if (this.sv_fld && client.fa_fld != null) {
					client.fa_fld.invalidateZone(this, var3 >> 3, var4 >> 3);
				}
			}
		}
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(IIIILem;JI)V"
	)
	public void vm(int var1, int var2, int var3, int var4, em var5, long var6, int var8) {
		try {
			yo(this, var1, var2, var3, var4, var5, var6, var8);
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int bz(int var1, int var2, int var3) {
		int var4 = var2 + this.po_fld;
		int var5 = var3 + this.ks_fld;
		int var6 = 0;
		int var7 = this.mz(var1, var4, var5);
		if (this.vc(var7)) {
			byte var8 = this.in_Arrbyte[var7];

			for (int var9 = 0; var9 < var8; var9++) {
				fj var10 = this.vh_fld[var7 * 5 + var9];
				if ((var10.ar_fld & 256) == 256 && var10.ak_fld instanceof fn) {
					fn var11 = (fn)var10.ak_fld;
					var11.by();
					if (var11.ez_fld > var6) {
						var6 = var11.ez_fld;
					}
				}
			}
		}

		return var6;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long cc(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.ax_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.as_fld == var2 && var6.ae_fld == var3) {
					return var6.az_fld;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bo() {
		this.kk();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bv(int var1, int var2, int var3, int var4) {
		var2 += this.jq_fld;
		var3 += this.bv_fld;
		int var5 = this.bz(var1, var2, var3);
		if (this.mx(var5)) {
			fv var6 = this.ow_fld[var5];
			if (var6 != null) {
				if (var6.ay_fld * -704799827 != 0) {
					var6.ae_fld = (var6.ae_fld * -704799827 < 0 ? -var4 : var4) * -422936539;
				}

				if (var6.ae_fld * 56412047 != 0) {
					var6.as_fld = (var6.as_fld * 56412047 < 0 ? -var4 : var4) * -455182481;
				}
			}
		}
	}

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void rl(int var1, int var2, int var3, int var4) {
		ls(this, var1, var2, var3, var4);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bi(int var1, int var2, int var3) {
		this.dw_fld = var1;
		this.cg_fld = var2;
		this.dx_fld = var3;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bu(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.aa_fld = null;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)Lfs;"
	)
	public fs ba(int var1, int var2, int var3) {
		var2 += this.yr_fld;
		var3 += this.uj_fld;
		int var4 = this.mz(var1, var2, var3);
		return this.mx(var4) ? this.rs_fld[var4] : null;
	}

	@ObfuscatedName("zt")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)Z"
	)
	public boolean zt(int var1, int var2, int var3, int var4, boolean var5) {
		DrawCallbacks var6 = client.fa_fld;
		if (og.ci_fld.isGpu() && var6 != null && this.aj_fld) {
			for (int var7 = this.cn_fld; var7 < this.cr_fld; var7++) {
				int var8 = this.cq_fld;
				int var9 = 0;

				for (int var10 = this.ca_fld; var10 < this.cg_fld; var10++) {
					int var11 = this.ra(var4, var7, var10);
					if (this.mx(var11) && var6.tileInFrustum(this, this.ci_fld, this.cj_fld, this.ch_fld, this.ct_fld, var1, var2, var3, var4, var7, var10)) {
						var8 = Math.min(var8, var10);
						var9 = Math.max(var9, var10);
					}
				}

				if (var5) {
					pl_fld[var7] = var8;
					rz_Arrint[var7] = var9;
				} else {
					pl_fld[var7] = Math.min(pl_fld[var7], var8);
					rz_Arrint[var7] = Math.max(rz_Arrint[var7], var9);
				}
			}

			for (int var12 = this.cn_fld + 1; var12 < this.cr_fld - 1; var12++) {
				pl_fld[var12] = Math.min(pl_fld[var12], Math.max(pl_fld[var12 - 1], pl_fld[var12 + 1]));
				rz_Arrint[var12] = Math.max(rz_Arrint[var12], Math.min(rz_Arrint[var12 - 1], rz_Arrint[var12 + 1]));
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ak() {
		return vg_fld;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIIJ)I"
	)
	public int ie(int var1, int var2, int var3, long var4) {
		var2 += this.rm_fld;
		var3 += this.jq_fld;
		int var6 = this.bz(var1, var2, var3);
		if (!this.mx(var6)) {
			return -1;
		} else if (this.rs_fld[var6] != null && this.rs_fld[var6].az_fld * -4472860599998239529L == var4) {
			return this.rs_fld[var6].ae_fld * 57097171 & 0xFF;
		} else if (this.ow_fld[var6] != null && this.ow_fld[var6].az_fld * 7130385936274174641L == var4) {
			return this.ow_fld[var6].aw_fld * -890468509 & 0xFF;
		} else if (this.kg_fld[var6] != null && this.kg_fld[var6].ag_fld * 2728893160458550201L == var4) {
			return this.kg_fld[var6].ah_fld * 1337340647 & 0xFF;
		} else {
			byte var7 = this.vj_fld[var6];

			for (int var8 = 0; var8 < var7; var8++) {
				fj var9 = this.vh_fld[var6 * 5 + var8];
				if (var9.az_fld == var4) {
					return var9.av_fld & 0xFF;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean cm(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.br_fld + var3 * this.be_fld + var4 * this.bs_fld + var5);
	}

	@ObfuscatedName("getTileShapes")
	@ObfuscatedSignature(
		descriptor = "()[[[B"
	)
	@Override
	public byte[][][] getTileShapes() {
		return this.xc_ArrArrArrbyte;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIIIZ)Z"
	)
	boolean ii(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var2 * this.bz_fld + var3 * this.bh_fld + var4 * this.bh_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIZ)Z"
	)
	public static boolean og(ev var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var0 == null) {
			var0.getClass();
		}

		return rl16.ie(var0, var0.ex_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean la(int var1, int var2, int var3, int var4) {
		return this.ix(this.ed_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)J"
	)
	public static long ml(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var4 = var2 + var0.jh_fld;
			int var5 = var3 + var0.jh_fld;
			int var6 = var0.ra(var1, var4, var5);
			if (!var0.mx(var6)) {
				return 0L;
			} else {
				byte var7 = var0.ib_fld[var6];

				for (int var8 = 0; var8 < var7; var8++) {
					fj var9 = var0.vh_fld[var6 * 5 + var8];
					long var10 = var9.az_fld;
					int var12 = (int)(var10 >> 16 & 7L);
					if (var12 == 2 && var2 == var9.ay_fld && var3 == var9.ar_fld) {
						return var9.az_fld;
					}
				}

				return 0L;
			}
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean dz(int var1, int var2) {
		if (!this.jo(this.cn_fld, this.ec_fld, var1, var2)) {
			return this.ku(this.di_fld, this.bg_fld, var1, var2);
		} else {
			this.jx(this.dt_fld, this.ca_fld, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; var4++) {
				for (int var5 = -1; var5 <= 1; var5++) {
					if (this.de(this.cp_fld, this.df_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ky(this.eo_fld, (this.ec_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.ch(this.cb_fld + 1, this.df_fld, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.dt(this.cq_fld + 1, (this.dg_fld + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.cu(this.cx_fld, this.ds_fld, var1, var2, var3);
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z"
	)
	boolean dm(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = fc.az_fld;
		int[] var7 = fc.ah_fld;
		int var8 = var6[var4];
		int var9 = var7[var4];
		int var10 = var6[var5];
		int var11 = var7[var5];
		int var12 = var3 * var10 + var1 * var11 >> 16;
		int var13 = var3 * var11 - var1 * var10 >> 16;
		int var14 = var2 * var8 + var13 * var9 >> 16;
		int var15 = var2 * var9 - var13 * var8 >> 16;
		if (var14 >= 50 && var14 <= fh.az()) {
			int var16 = this.dg_fld + var12 * 128 / var14;
			int var17 = this.dt_fld + var15 * 128 / var14;
			return var16 >= this.dw_fld && var16 <= this.bn_fld && var17 >= this.ep_fld && var17 <= this.dx_fld;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIII)Z"
	)
	public static boolean ia(ev var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

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
			int var16 = var0.dk_fld + var12 * -222619243 / var14;
			int var17 = var0.dx_fld + var15 * 117073947 / var14;
			return var16 >= var0.ds_fld && var16 <= var0.db_fld && var17 >= var0.du_fld && var17 <= var0.dg_fld;
		} else {
			return false;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(III)Lfj;"
	)
	public fj hn(int var1, int var2, int var3) {
		int var4 = var2 + this.ks_fld;
		int var5 = var3 + this.po_fld;
		int var6 = this.fm(var1, var4, var5);
		if (!this.mx(var6)) {
			return null;
		} else {
			byte var7 = this.in_Arrbyte[var6];

			for (int var8 = 0; var8 < var7; var8++) {
				fj var9 = this.vh_fld[var6 * 5 + var8];
				long var10 = var9.az_fld;
				int var12 = (int)(var10 >> 16 & 7L);
				if (var12 == 2 && var2 == var9.ar_fld && var3 == var9.ah_fld) {
					return var9;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	boolean mv(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 == var3 && var4 == var5) {
			if (!this.dj(var1, var2, var4)) {
				return false;
			} else {
				int var13 = var2 << 7;
				int var15 = var4 << 7;
				return this.dn(var13 + 1, this.cv_fld[var1][var2][var4] - var6, var15 + 1)
					&& this.lc(var13 + -1401975648 - 1, this.cs_fld[var1][var2 + 1][var4] - var6, var15 + 1)
					&& this.dn(var13 + 128 - 1, this.cv_fld[var1][var2 + 1][var4 + 1] - var6, var15 + -1621170969 - 1)
					&& this.dj(var13 + 1, this.cv_fld[var1][var2][var4 + 1] - var6, var15 + 184198862 - 1);
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
			int var9 = this.cs_fld[var1][var2][var4] - var6;
			if (!this.dj(var12, var9, var14)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.dj(var10, var9, var14)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					return !this.mh(var12, var9, var11) ? false : this.dj(var10, var9, var11);
				}
			}
		}
	}

	@ObfuscatedName("setDrawDistance")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setDrawDistance(int var1) {
		vg_fld = var1;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	public long cq(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.aa_fld != null ? var4.aa_fld.az_fld * 7130385936274174641L : 0L;
	}

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lem;IIIIJ)V"
	)
	public void rw(fw var1, em var2, int var3, int var4, int var5, int var6, long var7) {
		try {
			var1.ai(var2, var3, var4, var5, var6, var7);
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ey() {
		for (int var1 = 0; var1 < this.bn_fld; var1++) {
			for (int var2 = 0; var2 < this.cx_fld; var2++) {
				for (int var3 = 0; var3 < this.du_fld; var3++) {
					this.bl_fld[var1][var2][var3] = null;
				}
			}
		}

		if (this.dp_fld != null) {
			for (int var4 = 0; var4 < this.ec_fld; var4++) {
				for (int var7 = 0; var7 < this.dp_fld[var4]; var7++) {
					this.dq_fld[var4][var7] = null;
				}

				this.dp_fld[var4] = 0;
			}
		}

		if (this.bb_fld != null) {
			Arrays.fill(this.bb_fld, null);
		}

		this.cx_fld = 0;

		for (int var5 = 0; var5 < this.db_fld; var5++) {
			this.dy_fld[var5] = null;
		}

		this.cq_fld = 0;

		for (int var6 = 0; var6 < this.cl_fld.length; var6++) {
			this.cl_fld[var6] = null;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)Lef;"
	)
	public ef bb(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld : null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bc(int var1, int var2, int var3) {
		ei var4 = this.bl_fld[var1][var2][var3];
		if (var4 != null) {
			var4.aa_fld = null;
		}
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int og(int var1) {
		return this.wf_fld[var1] >> 20 & 15;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/BitSet;IIII)Z"
	)
	boolean jw(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var2 * this.bz_fld + var3 * this.bs_fld + var4 * this.bf_fld + var5);
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ya(int var1) {
		int var2 = var1 >> this.ha_fld & 3;
		return var2 + (this.wf_fld[var1 & this.sy_fld - 1] >> 5 & 1) & 3;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void kc(int var1, int var2, int var3) {
		this.cq_fld = var1;
		this.cw_fld = var2;
		this.cg_fld = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void aj(int var1, int var2, int var3, int var4) {
		int var5 = this.fm(var1, var2, var3);
		if ((this.xc_ArrArrArrbyte[var1][var2][var3] & 8) != 0) {
			this.wf_fld[var5] = this.wf_fld[var5] | 64;
		}
	}
}
