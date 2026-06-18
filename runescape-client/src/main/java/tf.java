import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import net.runelite.api.ClientConfiguration;
import net.runelite.api.Constants;
import net.runelite.api.GameEngine;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.FocusChanged;

@ObfuscatedName("tf")
@Implements({"GameEngine"})
public abstract class tf extends Panel implements Runnable, FocusListener, WindowListener, rl0, GameEngine {
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1232417371
	)
	protected int rs_fld;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1366203475
	)
	public static int ql_fld;
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	static tf qs_fld;
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 7842594969102404023L
	)
	static long qu_fld;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 4719824817221764435L
	)
	volatile long sf_fld;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean qo_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ad_fld;
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -131307881
	)
	static int re_fld;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	static long[] ro_Arrlong;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	volatile boolean se_fld;
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -506856113
	)
	static int rd_fld;
	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/Semaphore;"
	)
	public Semaphore ln_java_util_concurrent_Semaphore;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/event/ComponentListener;"
	)
	public ComponentListener ea_fld = new rl12(this);
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/EventQueue;"
	)
	EventQueue rm_fld;
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/Dimension;"
	)
	public Dimension qm_java_awt_Dimension;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static volatile boolean rl_fld;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -5042111273304058441L
	)
	static long rr_fld;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1695537575
	)
	int rq_fld;
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean rg_boolean;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1616709241
	)
	protected int rj_fld;
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	static long[] rz_fld;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	protected boolean rv_fld;
	// $VF: synthetic field
	@ObfuscatedName("$assertionsDisabled")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean $assertionsDisabled;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -2614904480533837289L
	)
	static long ru_fld;
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -148886077
	)
	static int qd_fld;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2043439031
	)
	int ri_int;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 459846409
	)
	int rx_fld;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -600652215
	)
	int ra_fld;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 340239319
	)
	protected static int qb_fld;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1427563321
	)
	int rk_fld;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/Frame;"
	)
	Frame sj_fld;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/Canvas;"
	)
	Canvas sa_fld;
	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1663796099
	)
	int rn_fld;
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean sg_fld;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Thread;"
	)
	public Thread so_fld;
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	volatile boolean si_fld;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	static tl rc_fld;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	tg sx_fld;
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/datatransfer/Clipboard;"
	)
	Clipboard sh_java_awt_datatransfer_Clipboard;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Lnet/runelite/api/ClientConfiguration;"
	)
	public ClientConfiguration kp_net_runelite_api_ClientConfiguration;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lyv;"
	)
	static yv[] al_Arryv;

	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void rh() {
		this.ip(2030597597);
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Ltf;IIII)V"
	)
	public static void ow(tf var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			try {
				if (null != qs_fld) {
					qd_fld++;
					if (qd_fld >= 3) {
						var0.ahe("alreadyloaded", 2009745202);
						return;
					}

					var0.wu().jq(var0.vw(), "_self");
					return;
				}

				qs_fld = var0;
				pf.qw_fld = var1;
				bc.qx_fld = var2;
				aak.az_fld = var3;
				zj.av_fld = var4;
				aak.ak_fld = var0.bi();
				if (fw.qz_fld == null) {
					fw.qz_fld = new la();
				}

				fw.qz_fld.ay(var0, 1, (byte)-29);
			} catch (Exception var6) {
				gl.ak(null, var6);
				var0.ahe("crash", -206520647);
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void kw(int var1) {
		this.rk_fld = var1;
	}

	@ObfuscatedName("aky")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void aky(WindowEvent var1) {
	}

	@ObfuscatedName("akn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akn(WindowEvent var1) {
	}

	@ObfuscatedName("agg")
	@ObfuscatedSignature(
		descriptor = "(B)Llh;"
	)
	protected lh agg(byte var1) {
		if (null == this.sx_fld) {
			this.sx_fld = new tg();
			this.sx_fld.ah(this.sa_fld, (byte)-12);
		}

		return this.sx_fld;
	}

	@ObfuscatedName("afi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void afi(FocusEvent var1) {
		rl_fld = true;
		this.si_fld = true;
	}

	@ObfuscatedName("agj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	protected void agj(String var1, int var2) {
		this.sh_java_awt_datatransfer_Clipboard.setContents(new StringSelection(var1), null);
	}

	@ObfuscatedName("windowIconified")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	@Export("windowIconified")
	@Override
	public final void windowIconified(WindowEvent var1) {
	}

	@ObfuscatedName("zq")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)Z"
	)
	public static boolean zq(tf var0) {
		return null != var0.sj_fld;
	}

	@ObfuscatedName("unblockStartup")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("unblockStartup")
	@Override
	public void unblockStartup() {
		if (this.ln_java_util_concurrent_Semaphore != null) {
			this.ln_java_util_concurrent_Semaphore.release();
		}
	}

	@ObfuscatedName("ahi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected final void ahi(int var1) {
		pw.ak();
		rc_fld.av(this.sa_fld, -1278095678);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ay() {
		rd_fld = 0;
	}

	@ObfuscatedName("ahd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected static int ahd() {
		int var0 = 0;
		if (null == bg.rt_fld || !bg.rt_fld.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)(GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						bg.rt_fld = var2;
						ru_fld = -480692785040575911L;
						rr_fld = -560329468120651783L;
					}
				}
			} catch (Throwable var9) {
			}
		}

		if (bg.rt_fld != null) {
			long var10 = lz.ak();
			long var3 = bg.rt_fld.getCollectionTime();
			if (rr_fld != -1L) {
				long var5 = var3 - rr_fld;
				long var7 = var10 - ru_fld;
				if (0L != var7) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			rr_fld = var3;
			ru_fld = var10;
		}

		return var0;
	}

	@ObfuscatedName("akv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akv(WindowEvent var1) {
	}

	@ObfuscatedName("agf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected final void agf(int var1) {
		mg.ak(this.sa_fld);
	}

	@ObfuscatedName("ahp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ahp(int var1) {
		try {
			this.go();
			Container var2 = this.ahc(-2011949320);
			if (var2 == null) {
				this.yq_void();
			} else {
				uf var3 = this.aho(1518472330);
				this.rj_fld = Math.max(var3.ah_fld, this.rx_fld);
				this.rs_fld = Math.max(var3.aw_fld, this.rn_fld);
				if (this.rj_fld <= 0) {
					if (var1 == 1052689) {
						this.yq_void();
						return;
					}

					this.rj_fld = -274105289;
				}

				if (this.rs_fld <= 0) {
					if (var1 == 1052689) {
						this.yq_void();
						return;
					}

					this.rs_fld = -1038045741;
				}

				pf.qw_fld = Math.min(this.rj_fld, this.ra_fld);
				client.qk();
				bc.qx_fld = Math.min(this.rs_fld, this.rk_fld);
				client.tr(-1);
				this.rq_fld = (this.rj_fld - pf.qw_fld) / 2;
				this.ri_int = 0;
				this.sa_fld.setSize(pf.qw_fld, bc.qx_fld);
				et.qj_fld = new te(pf.qw_fld, bc.qx_fld, this.sa_fld, this.rv_fld);
				if (this.sj_fld == var2) {
					Insets var4 = this.sj_fld.getInsets();
					this.sa_fld.setLocation(this.rq_fld + var4.left, var4.top + this.ri_int);
				} else {
					this.sa_fld.setLocation(this.rq_fld, this.ri_int);
				}

				this.si_fld = true;
				this.ih(-934045265);
				this.yq_void();
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected abstract void ih(int var1) throws EOFException;

	@ObfuscatedName("ago")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ago(int var1) {
		int var2 = this.rq_fld;
		int var3 = this.ri_int;
		int var4 = this.rj_fld - pf.qw_fld - var2;
		int var5 = this.rs_fld - bc.qx_fld - var3;
		if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
			try {
				Container var6 = this.ahc(-865963672);
				int var7 = 0;
				int var8 = 0;
				if (var6 == this.sj_fld) {
					Insets var9 = this.sj_fld.getInsets();
					var7 = var9.left;
					var8 = var9.top;
				}

				Graphics var11 = var6.getGraphics();
				var11.setColor(Color.black);
				if (var2 > 0) {
					var11.fillRect(var7, var8, var2, this.rs_fld);
				}

				if (var3 > 0) {
					var11.fillRect(var7, var8, this.rj_fld, var3);
				}

				if (var4 > 0) {
					if (var1 != -742729613) {
						return;
					}

					var11.fillRect(this.rj_fld + var7 - var4, var8, var4, this.rs_fld);
				}

				if (var5 > 0) {
					var11.fillRect(var7, this.rs_fld + var8 - var5, this.rj_fld, var5);
				}
			} catch (Exception var10) {
			}
		}
	}

	@ObfuscatedName("alc")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZ)V"
	)
	protected final void alc(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.sa_fld.getGraphics();
			if (pk.rp_fld == null) {
				pk.rp_fld = new Font("Helvetica", 1, 13);
				on.bf_fld = this.sa_fld.getFontMetrics(pk.rp_fld);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, pf.qw_fld, bc.qx_fld);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (rz.rb_fld == null) {
					rz.rb_fld = this.sa_fld.createImage(304, 34);
				}

				Graphics var7 = rz.rb_fld.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
				var7.setFont(pk.rp_fld);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - on.bf_fld.stringWidth(var2)) / 2, 22);
				var5.drawImage(rz.rb_fld, pf.qw_fld / 2 - 152, (var4 ? 50 : -18) + bc.qx_fld / 2, null);
			} catch (Exception var10) {
				int var8 = pf.qw_fld / 2 - 152;
				int var9 = bc.qx_fld / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(2 + var8, 2 + var9, 3 * var1, 30);
				var5.setColor(Color.black);
				var5.drawRect(1 + var8, var9 + 1, 301, 31);
				var5.fillRect(2 + var8 + 3 * var1, 2 + var9, 300 - var1 * 3, 30);
				var5.setFont(pk.rp_fld);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - on.bf_fld.stringWidth(var2)) / 2, 22 + var9);
			}
		} catch (Exception var11) {
			this.sa_fld.repaint();
		}
	}

	@ObfuscatedName("agn")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final synchronized void agn(int var1) {
		this.hk();
		Container var2 = this.ahc(-2064226163);
		if (null != this.sa_fld) {
			this.sa_fld.removeFocusListener(this);
			var2.remove(this.sa_fld);
		}

		pf.qw_fld = Math.max(var2.getWidth(), this.rx_fld);
		client.qk();
		bc.qx_fld = Math.max(var2.getHeight(), this.rn_fld);
		client.tr(-1);
		if (this.sj_fld != null) {
			Insets var3 = this.sj_fld.getInsets();
			pf.qw_fld = pf.qw_fld - 771473187 * (var3.right + var3.left);
			client.qk();
			bc.qx_fld = bc.qx_fld - (var3.top + var3.bottom) * 1567573247;
			client.tr(-1);
		}

		this.sa_fld = new tb(this);
		var2.setBackground(Color.BLACK);
		var2.setLayout(null);
		var2.add(this.sa_fld);
		this.sa_fld.setSize(pf.qw_fld, bc.qx_fld);
		this.sa_fld.setVisible(true);
		this.sa_fld.setBackground(Color.BLACK);
		if (this.sj_fld == var2) {
			Insets var4 = this.sj_fld.getInsets();
			this.sa_fld.setLocation(this.rq_fld + var4.left, var4.top + this.ri_int);
		} else {
			this.sa_fld.setLocation(this.rq_fld, this.ri_int);
		}

		this.sa_fld.addFocusListener(this);
		this.sa_fld.requestFocus();
		this.si_fld = true;
		if (null != et.qj_fld && pf.qw_fld == et.qj_fld.av_fld && et.qj_fld.ae_fld == bc.qx_fld) {
			((te)et.qj_fld).ak(this.sa_fld, (byte)2);
			et.qj_fld.ag(0, 0, -1645123966);
		} else {
			et.qj_fld = new te(pf.qw_fld, bc.qx_fld, this.sa_fld, this.rv_fld);
		}

		this.se_fld = false;
		this.sf_fld = lz.ak();
		this.zw();
	}

	@ObfuscatedName("ags")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	protected void ags(boolean var1, int var2) {
		if (this.rv_fld != var1) {
			this.rv_fld = var1;
			var1 &= !og.ci_fld.isGpu();
			et.qj_fld.hn(var1);
			et.qj_fld.lt();
		}
	}

	@ObfuscatedName("ahw")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	protected final boolean ahw(byte var1) {
		String var2 = this.vw().getHost().toLowerCase();
		if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
			return true;
		} else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
			return true;
		} else if (var2.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (!var2.isEmpty() && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
				var2 = var2.substring(0, var2.length() - 1);
			}

			if (var2.endsWith("192.168.1.")) {
				return true;
			} else {
				this.ahe("invalidhost", 694273235);
				return false;
			}
		}
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("run")
	@Override
	public void run() {
		this.so_fld = Thread.currentThread();
		this.so_fld.setName("Client");
		this.so_fld.setUncaughtExceptionHandler((var0, var1x) -> ua(null, var1x));

		try {
			this.setFocusCycleRoot(true);
			this.rr();
			this.rh();
			bl.rf_fld = new mt();
			if (Boolean.getBoolean("runelite.delaystart")) {
				this.ln_java_util_concurrent_Semaphore = new Semaphore(0);
				this.ln_java_util_concurrent_Semaphore.acquire();
			}

			while (0L == qu_fld) {
				lq.ry_fld = bl.rf_fld.me(20, 1);

				for (int var1 = 0; var1 < lq.ry_fld; var1++) {
					this.bh();
				}

				if (mt.bo_fld) {
					this.wm();
					this.ma(this.sa_fld);
				}
			}
		} catch (Exception var2) {
			ua(null, var2);
			this.dl("crash");
		}

		this.hg();
	}

	@ObfuscatedName("agl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final void agl(Graphics var1) {
		if (!this.ad_fld) {
			this.ad_fld = true;
			var1.clearRect(0, 0, this.getWidth(), this.getHeight());
		}
	}

	@ObfuscatedName("ahj")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ahj(byte var1) {
		try {
			long var2 = lz.ak();
			long var4 = rz_fld[fg.rw_fld];
			rz_fld[fg.rw_fld] = var2;
			fg.rw_fld = 1046942219 * (1 + fg.rw_fld & 31);
			if (var4 != 0L && var2 > var4) {
			}

			synchronized (this) {
				hd.qt_fld = rl_fld;
			}

			this.il(-1610457314);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ahu")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ahu(byte var1) {
		try {
			this.ay();
			Container var2 = this.ahc(-1438042400);
			long var3 = lz.ak();
			long var5 = ro_Arrlong[ty.rh_fld];
			ro_Arrlong[ty.rh_fld] = var3;
			ty.rh_fld = ty.rh_fld + 1 & 31;
			if (var5 != 0L && var3 > var5) {
				int var7 = (int)(var3 - var5);
				ql_fld = -1010698203 * (((var7 >> 1) + 32000) / var7);
			}

			if ((rd_fld += -1185482321) * -506856113 - 1 > 50) {
				if (var1 != 1) {
					return;
				}

				rd_fld -= 50;
				this.si_fld = true;
				this.sa_fld.setSize(pf.qw_fld, bc.qx_fld);
				this.sa_fld.setVisible(true);
				if (this.sj_fld == var2) {
					Insets var9 = this.sj_fld.getInsets();
					this.sa_fld.setLocation(this.rq_fld + var9.left, this.ri_int + var9.top);
				} else {
					this.sa_fld.setLocation(this.rq_fld, this.ri_int);
				}
			}

			if (this.se_fld) {
				gn.uj(this, 469877158);
			}

			this.ahx(203987159);
			this.ia(this.si_fld, 1136789389);
			if (this.si_fld) {
				this.ago(-742729613);
			}

			this.si_fld = false;
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("als")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected final void als() {
		rz.rb_fld = null;
		pk.rp_fld = null;
		on.bf_fld = null;
	}

	@ObfuscatedName("agx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void agx(int var1) {
		this.sg_fld = true;
	}

	@ObfuscatedName("ack")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public abstract void ack();

	@ObfuscatedName("isClientThread")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isClientThread")
	@Override
	public boolean isClientThread() {
		return this.so_fld == Thread.currentThread();
	}

	@ObfuscatedName("afe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void afe(FocusEvent var1) {
		rl_fld = true;
		this.si_fld = true;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	protected abstract void ia(boolean var1, int var2) throws EOFException;

	@ObfuscatedName("destroy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void destroy() {
		if (qs_fld == this && !qo_fld) {
			qu_fld = lz.ak();
			dg.ak(5000L);
			this.aha((byte)26);
		}
	}

	@ObfuscatedName("resizeCanvas")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("resizeCanvas")
	@Override
	public void resizeCanvas() {
		try {
			this.ahp(-256112452);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("update")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	@Export("update")
	@Override
	public final void update(Graphics var1) {
		this.paint(var1);
	}

	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public static void tp(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		try {
			if (null != la.av_fld) {
				String var1 = la.av_fld.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = la.ae_fld;
					if (var2.equals("1.1")
						|| var2.startsWith("1.1.")
						|| var2.equals("1.2")
						|| var2.startsWith("1.2.")
						|| var2.equals("1.3")
						|| var2.startsWith("1.3.")
						|| var2.equals("1.4")
						|| var2.startsWith("1.4.")
						|| var2.equals("1.5")
						|| var2.startsWith("1.5.")
						|| var2.equals("1.6.0")) {
						var0.ahe("wrongjava", 1590467884);
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3 = 6;

						while (var3 < var2.length() && jw.al(var2.charAt(var3))) {
							var3++;
						}

						String var4 = var2.substring(6, var3);
						if (dz.ag(var4) && av(var4) < 10) {
							var0.ahe("wrongjava", 1065148108);
							return;
						}
					}

					re_fld = -122613662;
				}
			}

			var0.setFocusCycleRoot(true);
			var0.agn(-1923935564);
			var0.ip(2030597597);
			bl.rf_fld = ca.ar();

			while (0L == qu_fld || lz.ak() < qu_fld) {
				lq.ry_fld = bl.rf_fld.ag(qb_fld, re_fld, 1099094056) * -835812681;

				for (int var6 = 0; var6 < lq.ry_fld; var6++) {
					var0.ahj((byte)18);
				}

				var0.ahu((byte)1);
				var0.agd(var0.sa_fld, (short)-7573);
			}
		} catch (Exception var5) {
			gl.ak(null, var5);
			var0.ahe("crash", 2076244291);
		}

		var0.aha((byte)121);
	}

	@ObfuscatedName("paint")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	@Export("paint")
	@Override
	public final synchronized void paint(Graphics var1) {
		this.agl(var1);
		if (this == qs_fld && !qo_fld) {
			this.si_fld = true;
			if (lz.ak() - this.sf_fld > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= pf.qw_fld && var2.height >= bc.qx_fld) {
					this.se_fld = true;
				}
			}
		}
	}

	@ObfuscatedName("ajr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void ajr() {
		try {
			uf var1 = this.aho(1594273958);
			if (this.rj_fld != var1.ah_fld || var1.aw_fld != this.rs_fld || this.sg_fld) {
				this.ahp(692698339);
				this.sg_fld = false;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("stop")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void stop() {
		if (qs_fld == this && !qo_fld) {
			qu_fld = lz.ak() + 4000L;
		}
	}

	@ObfuscatedName("windowActivated")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	@Export("windowActivated")
	@Override
	public final void windowActivated(WindowEvent var1) {
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public String uo(String var1) {
		return this.kp_net_runelite_api_ClientConfiguration.getParameter(var1);
	}

	@ObfuscatedName("windowClosed")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	@Export("windowClosed")
	@Override
	public final void windowClosed(WindowEvent var1) {
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ltf;B)V"
	)
	public static void lg(tf var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.sh_java_awt_datatransfer_Clipboard = var0.getToolkit().getSystemClipboard();
	}

	static {
		try {
			qb_fld = -973865460;
			ql_fld = 0;
			qs_fld = null;
			qd_fld = 0;
			qu_fld = 0L;
			qo_fld = false;
			re_fld = 1343846695;
			ro_Arrlong = new long[32];
			rz_fld = new long[32];
			rd_fld = -35673652;
			rl_fld = true;
			rc_fld = new tl();
			rr_fld = -560329468120651783L;
			ru_fld = -480692785040575911L;
			$assertionsDisabled = !tf.class.desiredAssertionStatus();
		} catch (Throwable var1) {
			throw new RuntimeException(var1);
		}
	}

	@ObfuscatedName("windowDeactivated")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	@Export("windowDeactivated")
	@Override
	public final void windowDeactivated(WindowEvent var1) {
	}

	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean sc() {
		return this.se_fld;
	}

	@ObfuscatedName("windowDeiconified")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	@Export("windowDeiconified")
	@Override
	public final void windowDeiconified(WindowEvent var1) {
	}

	@ObfuscatedName("ajz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ajz() {
		try {
			long var1 = lz.ak();
			long var3 = rz_fld[395280667 * fg.rw_fld];
			rz_fld[-381080163 * fg.rw_fld] = var1;
			fg.rw_fld = -853959484 * (1 + fg.rw_fld & 31);
			if (var3 != 0L && var1 > var3) {
			}

			synchronized (this) {
				hd.qt_fld = rl_fld;
			}

			this.il(-1599176057);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("windowOpened")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	@Export("windowOpened")
	@Override
	public final void windowOpened(WindowEvent var1) {
	}

	protected tf() {
		this.ad_fld = false;
		this.rv_fld = true;
		this.rg_boolean = false;
		this.rq_fld = 0;
		this.ri_int = 0;
		this.si_fld = true;
		this.sg_fld = false;
		this.se_fld = false;
		this.sf_fld = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var4) {
		}

		this.rm_fld = var1;
		tw var2 = new tw();
		dz.aa_fld = var2;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected abstract void il(int var1) throws ExecutionException, FileNotFoundException, InterruptedException, EOFException, UnsupportedEncodingException;

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public void ri(FocusEvent var1) {
		FocusChanged var2 = new FocusChanged();
		var2.setFocused(true);
		og.ci_fld.getCallbacks().post(var2);
	}

	@ObfuscatedName("ale")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZ)V"
	)
	protected final void ale(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.sa_fld.getGraphics();
			if (pk.rp_fld == null) {
				pk.rp_fld = new Font("Helvetica", 1, 13);
				on.bf_fld = this.sa_fld.getFontMetrics(pk.rp_fld);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, pf.qw_fld, bc.qx_fld);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (rz.rb_fld == null) {
					rz.rb_fld = this.sa_fld.createImage(304, 34);
				}

				Graphics var7 = rz.rb_fld.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
				var7.setFont(pk.rp_fld);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - on.bf_fld.stringWidth(var2)) / 2, 22);
				var5.drawImage(rz.rb_fld, pf.qw_fld / 2 - 152, (var4 ? 50 : -18) + bc.qx_fld / 2, null);
			} catch (Exception var10) {
				int var8 = pf.qw_fld / 2 - 152;
				int var9 = bc.qx_fld / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(2 + var8, 2 + var9, 3 * var1, 30);
				var5.setColor(Color.black);
				var5.drawRect(1 + var8, var9 + 1, 301, 31);
				var5.fillRect(2 + var8 + 3 * var1, 2 + var9, 300 - var1 * 3, 30);
				var5.setFont(pk.rp_fld);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - on.bf_fld.stringWidth(var2)) / 2, 22 + var9);
			}
		} catch (Exception var11) {
			this.sa_fld.repaint();
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void dl(String var1) {
		this.ahe(var1, 461672238);
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	protected abstract void iq(byte var1) throws FileNotFoundException;

	@ObfuscatedName("ahs")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZB)V"
	)
	protected final void ahs(int var1, String var2, boolean var3, boolean var4, byte var5) {
		try {
			Graphics var6 = this.sa_fld.getGraphics();
			if (pk.rp_fld == null) {
				pk.rp_fld = new Font("Helvetica", 1, 13);
				on.bf_fld = this.sa_fld.getFontMetrics(pk.rp_fld);
			}

			if (var3 && !var4) {
				var6.setColor(Color.black);
				var6.fillRect(0, 0, pf.qw_fld, bc.qx_fld);
			}

			Color var7 = new Color(140, 17, 17);

			try {
				if (rz.rb_fld == null) {
					rz.rb_fld = this.sa_fld.createImage(304, 34);
				}

				Graphics var8 = rz.rb_fld.getGraphics();
				var8.setColor(var7);
				var8.drawRect(0, 0, 303, 33);
				var8.fillRect(2, 2, var1 * 3, 30);
				var8.setColor(Color.black);
				var8.drawRect(1, 1, 301, 31);
				var8.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
				var8.setFont(pk.rp_fld);
				var8.setColor(Color.white);
				var8.drawString(var2, (304 - on.bf_fld.stringWidth(var2)) / 2, 22);
				var6.drawImage(rz.rb_fld, pf.qw_fld / 2 - 152, (var4 ? 50 : -18) + bc.qx_fld / 2, null);
			} catch (Exception var11) {
				int var9 = pf.qw_fld / 2 - 152;
				int var10 = bc.qx_fld / 2 - 18;
				var6.setColor(var7);
				var6.drawRect(var9, var10, 303, 33);
				var6.fillRect(2 + var9, 2 + var10, 3 * var1, 30);
				var6.setColor(Color.black);
				var6.drawRect(1 + var9, var10 + 1, 301, 31);
				var6.fillRect(2 + var9 + 3 * var1, 2 + var10, 300 - var1 * 3, 30);
				var6.setFont(pk.rp_fld);
				var6.setColor(Color.white);
				var6.drawString(var2, var9 + (304 - on.bf_fld.stringWidth(var2)) / 2, 22 + var10);
			}
		} catch (Exception var12) {
			this.sa_fld.repaint();
		}
	}

	@ObfuscatedName("ajh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ajh() {
		int var1 = this.rq_fld;
		int var2 = this.ri_int;
		int var3 = this.rj_fld - pf.qw_fld - var1;
		int var4 = this.rs_fld - bc.qx_fld - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = this.ahc(-1162193568);
				int var6 = 0;
				int var7 = 0;
				if (var5 == this.sj_fld) {
					Insets var8 = this.sj_fld.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.rs_fld);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, this.rj_fld, var2);
				}

				if (var3 > 0) {
					var10.fillRect(this.rj_fld + var6 - var3, var7, var3, this.rs_fld);
				}

				if (var4 > 0) {
					var10.fillRect(var6, this.rs_fld + var7 - var4, this.rj_fld, var4);
				}
			} catch (Exception var9) {
			}
		}
	}

	@ObfuscatedName("ahc")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;"
	)
	Container ahc(int var1) {
		return (Container)(null != this.sj_fld ? this.sj_fld : this);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/net/URL;"
	)
	public URL bi() {
		return this.kp_net_runelite_api_ClientConfiguration.getCodeBase();
	}

	@ObfuscatedName("aho")
	@ObfuscatedSignature(
		descriptor = "(I)Luf;"
	)
	uf aho(int var1) {
		Container var2 = this.ahc(-197884505);
		int var3 = Math.max(var2.getWidth(), this.rx_fld);
		int var4 = Math.max(var2.getHeight(), this.rn_fld);
		if (null != this.sj_fld) {
			Insets var5 = this.sj_fld.getInsets();
			var3 -= var5.left + var5.right;
			var4 -= var5.top + var5.bottom;
		}

		return new uf(var3, var4);
	}

	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)Z"
	)
	public static boolean qn(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		String var1 = var0.vw().getHost().toLowerCase();
		if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
			return true;
		} else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
			return true;
		} else if (var1.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (!var1.isEmpty() && var1.charAt(var1.length() - 1) >= -1675494001 && var1.charAt(var1.length() - 1) <= -1567314657) {
				var1 = var1.substring(0, var1.length() - 1);
			}

			if (var1.endsWith("192.168.1.")) {
				return true;
			} else {
				var0.ahe("invalidhost", 712573453);
				return false;
			}
		}
	}

	@ObfuscatedName("aht")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	protected final boolean aht(int var1) {
		return null != this.sj_fld;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected abstract void hz(int var1);

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hg() {
		this.aha((byte)60);
	}

	@ObfuscatedName("ais")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/datatransfer/Clipboard;"
	)
	protected Clipboard ais() {
		return this.sh_java_awt_datatransfer_Clipboard;
	}

	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void wm() {
		try {
			this.ahu((byte)1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		try {
			if (null != la.av_fld) {
				String var1 = la.av_fld.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = la.ae_fld;
					if (var2.equals("1.1")
						|| var2.startsWith("1.1.")
						|| var2.equals("1.2")
						|| var2.startsWith("1.2.")
						|| var2.equals("1.3")
						|| var2.startsWith("1.3.")
						|| var2.equals("1.4")
						|| var2.startsWith("1.4.")
						|| var2.equals("1.5")
						|| var2.startsWith("1.5.")
						|| var2.equals("1.6.0")) {
						this.ahe("wrongjava", 493187018);
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3 = 6;

						while (var3 < var2.length() && jw.al(var2.charAt(var3))) {
							var3++;
						}

						String var4 = var2.substring(6, var3);
						if (dz.ag(var4) && av(var4) < 10) {
							this.ahe("wrongjava", 153682347);
							return;
						}
					}

					re_fld = -1870701117;
				}
			}

			this.setFocusCycleRoot(true);
			this.agn(-1901838242);
			this.ip(2030597597);
			bl.rf_fld = ca.ar();

			while (0L == qu_fld || lz.ak() < qu_fld) {
				lq.ry_fld = bl.rf_fld.ag(qb_fld, re_fld, 1099094056) * 289138323;

				for (int var6 = 0; var6 < lq.ry_fld; var6++) {
					this.ahj((byte)27);
				}

				this.ahu((byte)1);
				this.agd(this.sa_fld, (short)-12422);
			}
		} catch (Exception var5) {
			gl.ak(null, var5);
			this.ahe("crash", 1581195192);
		}

		this.aha((byte)108);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		try {
			if (null != la.av_fld) {
				String var1 = la.av_fld.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = la.ae_fld;
					if (var2.equals("1.1")
						|| var2.startsWith("1.1.")
						|| var2.equals("1.2")
						|| var2.startsWith("1.2.")
						|| var2.equals("1.3")
						|| var2.startsWith("1.3.")
						|| var2.equals("1.4")
						|| var2.startsWith("1.4.")
						|| var2.equals("1.5")
						|| var2.startsWith("1.5.")
						|| var2.equals("1.6.0")) {
						this.ahe("wrongjava", 1879794832);
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3 = 6;

						while (var3 < var2.length() && jw.al(var2.charAt(var3))) {
							var3++;
						}

						String var4 = var2.substring(6, var3);
						if (dz.ag(var4) && av(var4) < 10) {
							this.ahe("wrongjava", 1223021325);
							return;
						}
					}

					re_fld = -1870701117;
				}
			}

			this.setFocusCycleRoot(true);
			this.agn(-11640286);
			this.ip(2030597597);
			bl.rf_fld = ca.ar();

			while (0L == qu_fld || lz.ak() < qu_fld) {
				lq.ry_fld = bl.rf_fld.ag(qb_fld, re_fld, 1099094056);

				for (int var6 = 0; var6 < lq.ry_fld; var6++) {
					this.ahj((byte)3);
				}

				this.ahu((byte)1);
				this.agd(this.sa_fld, (short)8339);
			}
		} catch (Exception var5) {
			gl.ak(null, var5);
			this.ahe("crash", 999134976);
		}

		this.aha((byte)80);
	}

	@ObfuscatedName("getCanvas")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Canvas;"
	)
	@Export("getCanvas")
	@Override
	public Canvas getCanvas() {
		return this.sa_fld;
	}

	@ObfuscatedName("ahx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ahx(int var1) {
		try {
			uf var2 = this.aho(-678743536);
			if (this.rj_fld != var2.ah_fld || var2.aw_fld != this.rs_fld || this.sg_fld) {
				this.ahp(-256112452);
				this.sg_fld = false;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av_void() {
		try {
			if (null != la.av_fld) {
				String var1 = la.av_fld.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = la.ae_fld;
					if (var2.equals("1.1")
						|| var2.startsWith("1.1.")
						|| var2.equals("1.2")
						|| var2.startsWith("1.2.")
						|| var2.equals("1.3")
						|| var2.startsWith("1.3.")
						|| var2.equals("1.4")
						|| var2.startsWith("1.4.")
						|| var2.equals("1.5")
						|| var2.startsWith("1.5.")
						|| var2.equals("1.6.0")) {
						this.ahe("wrongjava", 490391143);
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3 = 6;

						while (var3 < var2.length() && jw.al(var2.charAt(var3))) {
							var3++;
						}

						String var4 = var2.substring(6, var3);
						if (dz.ag(var4) && av(var4) < 10) {
							this.ahe("wrongjava", 1566814926);
							return;
						}
					}

					re_fld = -1870701117;
				}
			}

			this.setFocusCycleRoot(true);
			this.agn(-1371024061);
			this.ip(2030597597);
			bl.rf_fld = ca.ar();

			while (0L == qu_fld || lz.ak() < qu_fld) {
				lq.ry_fld = bl.rf_fld.ag(qb_fld, re_fld, 1099094056);

				for (int var6 = 0; var6 < lq.ry_fld; var6++) {
					this.ahj((byte)68);
				}

				this.ahu((byte)1);
				this.agd(this.sa_fld, (short)13873);
			}
		} catch (Exception var5) {
			gl.ak(null, var5);
			this.ahe("crash", 2101820949);
		}

		this.aha((byte)69);
	}

	@ObfuscatedName("aju")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected final void aju() {
		this.si_fld = true;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void go() {
		if (og.ci_fld.isStretchedEnabled()) {
			og.ci_fld.invalidateStretching(false);
			if (og.ci_fld.isResized()) {
				Dimension var1 = og.ci_fld.getRealDimensions();
				this.kb(var1.width);
				this.kw(var1.height);
			}
		}
	}

	@ObfuscatedName("akd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void akd() {
		if (qs_fld == this && !qo_fld) {
			qu_fld = 0L;
		}
	}

	@ObfuscatedName("acp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public abstract void acp();

	@ObfuscatedName("alj")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Container;"
	)
	Container alj() {
		return (Container)(null != this.sj_fld ? this.sj_fld : this);
	}

	@ObfuscatedName("adj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void adj() throws ExecutionException, FileNotFoundException, InterruptedException, EOFException, UnsupportedEncodingException;

	@ObfuscatedName("ajj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	protected final boolean ajj() {
		String var1 = this.vw().getHost().toLowerCase();
		if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
			return true;
		} else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
			return true;
		} else if (var1.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (!var1.isEmpty() && var1.charAt(var1.length() - 1) >= 1012133235 && var1.charAt(var1.length() - 1) <= '9') {
				var1 = var1.substring(0, var1.length() - 1);
			}

			if (var1.endsWith("192.168.1.")) {
				return true;
			} else {
				this.ahe("invalidhost", 2057883898);
				return false;
			}
		}
	}

	@ObfuscatedName("adq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	protected abstract void adq(boolean var1) throws EOFException;

	@ObfuscatedName("focusLost")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	@Export("focusLost")
	@Override
	public final void focusLost(FocusEvent var1) {
		rl_fld = false;
	}

	@ObfuscatedName("adt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void adt() throws FileNotFoundException;

	@ObfuscatedName("ael")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void ael() throws EOFException;

	@ObfuscatedName("aed")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void aed() throws EOFException;

	@ObfuscatedName("aer")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void aer() throws EOFException;

	@ObfuscatedName("aex")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void aex() throws EOFException;

	@ObfuscatedName("aes")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void aes() throws EOFException;

	@ObfuscatedName("aeg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void aeg() throws EOFException;

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)Ljava/awt/datatransfer/Clipboard;"
	)
	public static Clipboard ld(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.sh_java_awt_datatransfer_Clipboard;
	}

	@ObfuscatedName("alp")
	@ObfuscatedSignature(
		descriptor = "()Luf;"
	)
	uf alp() {
		Container var1 = this.ahc(-49321334);
		int var2 = Math.max(var1.getWidth(), this.rx_fld);
		int var3 = Math.max(var1.getHeight(), this.rn_fld);
		if (null != this.sj_fld) {
			Insets var4 = this.sj_fld.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new uf(var2, var3);
	}

	@ObfuscatedName("afo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void afo(FocusEvent var1) {
		rl_fld = false;
	}

	@ObfuscatedName("zw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void zw() {
		this.sa_fld.addComponentListener(this.ea_fld);
		this.qm_java_awt_Dimension = this.sa_fld.getSize();
	}

	@ObfuscatedName("afr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void afr(FocusEvent var1) {
		rl_fld = false;
	}

	@ObfuscatedName("afl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void afl(FocusEvent var1) {
		rl_fld = false;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public static void cu(tf var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else if (qs_fld == var0 && !qo_fld) {
				qu_fld = 0L;
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("afn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void afn(FocusEvent var1) {
		rl_fld = false;
	}

	@ObfuscatedName("adi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void adi();

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public static void vl(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (qs_fld == var0 && !qo_fld) {
			qu_fld = 0L;
		}
	}

	@ObfuscatedName("initialize")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void initialize() {
		this.setSize(Constants.GAME_FIXED_SIZE);
		this.init();
		this.start();
	}

	@ObfuscatedName("agk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final synchronized void agk(Graphics var1) {
		if (this == qs_fld && !qo_fld) {
			this.si_fld = true;
			if (lz.ak() - this.sf_fld > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= pf.qw_fld && var2.height >= bc.qx_fld) {
					this.se_fld = true;
				}
			}
		}
	}

	@ObfuscatedName("agb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final synchronized void agb(Graphics var1) {
		if (this == qs_fld && !qo_fld) {
			this.si_fld = true;
			if (lz.ak() - this.sf_fld > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= pf.qw_fld && var2.height >= bc.qx_fld) {
					this.se_fld = true;
				}
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bh() {
		try {
			this.ahj((byte)-41);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("setConfiguration")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/ClientConfiguration;)V"
	)
	@Export("setConfiguration")
	@Override
	public void setConfiguration(ClientConfiguration var1) {
		this.kp_net_runelite_api_ClientConfiguration = var1;
	}

	@ObfuscatedName("agt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final synchronized void agt(Graphics var1) {
		if (this == qs_fld && !qo_fld) {
			this.si_fld = true;
			if (lz.ak() - this.sf_fld > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= pf.qw_fld && var2.height >= bc.qx_fld) {
					this.se_fld = true;
				}
			}
		}
	}

	@ObfuscatedName("agc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final synchronized void agc(Graphics var1) {
		if (this == qs_fld && !qo_fld) {
			this.si_fld = true;
			if (lz.ak() - this.sf_fld > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= pf.qw_fld && var2.height >= bc.qx_fld) {
					this.se_fld = true;
				}
			}
		}
	}

	@ObfuscatedName("agw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final synchronized void agw(Graphics var1) {
		if (this == qs_fld && !qo_fld) {
			this.si_fld = true;
			if (lz.ak() - this.sf_fld > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= pf.qw_fld && var2.height >= bc.qx_fld) {
					this.se_fld = true;
				}
			}
		}
	}

	@ObfuscatedName("ahz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected static final int ahz() {
		return rc_fld.ag(1121056365);
	}

	@ObfuscatedName("ahn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected static final void ahn() {
		bl.rf_fld.ak((byte)0);

		for (int var0 = 0; var0 < 1386825203; var0++) {
			ro_Arrlong[var0] = 0L;
		}

		for (int var1 = 0; var1 < 1090842686; var1++) {
			rz_fld[var1] = 0L;
		}

		lq.ry_fld = 0;
	}

	@ObfuscatedName("ahh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected static final void ahh() {
		bl.rf_fld.ak((byte)0);

		for (int var0 = 0; var0 < 32; var0++) {
			ro_Arrlong[var0] = 0L;
		}

		for (int var1 = 0; var1 < 32; var1++) {
			rz_fld[var1] = 0L;
		}

		lq.ry_fld = 0;
	}

	@ObfuscatedName("aif")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void aif() {
		try {
			Container var1 = this.ahc(-532357143);
			if (var1 != null) {
				uf var2 = this.aho(782431860);
				this.rj_fld = Math.max(var2.ah_fld * -1111746701, this.rx_fld) * 1891122796;
				this.rs_fld = Math.max(var2.aw_fld * -1113795857, -613649336 * this.rn_fld) * -651401588;
				if (this.rj_fld <= 0) {
					this.rj_fld = -1226295103;
				}

				if (this.rs_fld * 1020990421 <= 0) {
					this.rs_fld = 746429800;
				}

				pf.qw_fld = Math.min(-352198258 * this.rj_fld, this.ra_fld * -1568016866) * 1161811472;
				bc.qx_fld = Math.min(this.rs_fld, this.rk_fld);
				this.rq_fld = (this.rj_fld - pf.qw_fld) / 2 * -1053132156;
				this.ri_int = 0;
				this.sa_fld.setSize(pf.qw_fld, bc.qx_fld);
				et.qj_fld = new te(1494275354 * pf.qw_fld, bc.qx_fld, this.sa_fld, this.rv_fld);
				if (this.sj_fld == var1) {
					Insets var3 = this.sj_fld.getInsets();
					this.sa_fld.setLocation(this.rq_fld + var3.left, var3.top + this.ri_int);
				} else {
					this.sa_fld.setLocation(-795200610 * this.rq_fld, this.ri_int);
				}

				this.si_fld = true;
				this.ih(-278377491);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("aig")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	protected void aig(String var1) {
		this.sh_java_awt_datatransfer_Clipboard.setContents(new StringSelection(var1), null);
	}

	@ObfuscatedName("ahk")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	protected final void ahk(int var1, int var2) {
		if (var1 != this.ra_fld || var2 != this.rk_fld) {
			this.agx(1037678006);
		}

		this.ra_fld = var1;
		this.rk_fld = var2;
	}

	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V"
	)
	public static void ua(String var0, Throwable var1) {
		gl.ak(var0, var1);
	}

	@ObfuscatedName("ahm")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	protected final void ahm(int var1, int var2) {
		if (var1 != this.ra_fld || var2 != this.rk_fld) {
			this.agx(1905601550);
		}

		this.ra_fld = var1;
		this.rk_fld = -1267743513 * var2;
	}

	@ObfuscatedName("ade")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void ade() throws ExecutionException, FileNotFoundException, InterruptedException, EOFException, UnsupportedEncodingException;

	@ObfuscatedName("ahf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	final void ahf(Object var1) {
		if (null != this.rm_fld) {
			for (int var2 = 0; var2 < 50 && this.rm_fld.peekEvent() != null; var2++) {
				dg.ak(1L);
			}

			if (var1 != null) {
				this.rm_fld.postEvent(new ActionEvent(var1, -1591945200, "dummy"));
			}
		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void md(boolean var1) {
		this.sg_fld = var1;
	}

	@ObfuscatedName("ahv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	final void ahv(Object var1) {
		if (null != this.rm_fld) {
			for (int var2 = 0; var2 < 50 && this.rm_fld.peekEvent() != null; var2++) {
				dg.ak(1L);
			}

			if (var1 != null) {
				this.rm_fld.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}
		}
	}

	@ObfuscatedName("abw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public abstract void abw();

	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Lts;I)V"
	)
	public static void wb(tf var0, ts var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		rc_fld.ak(var1, var2, 929982887);
	}

	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "(Ltf;B)V"
	)
	public static void vj(tf var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		rc_fld.ah((byte)-97);
	}

	@ObfuscatedName("agh")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	protected final void agh(int var1, int var2, byte var3) {
		if (og.ci_fld.isStretchedEnabled() && og.ci_fld.isResized()) {
			Dimension var4 = og.ci_fld.getRealDimensions();
			var1 = var4.width;
			var2 = var4.height;
		}

		label26: {
			boolean var8 = false;
			if (var1 == this.ra_fld) {
				if (var8) {
					return;
				}

				if (var2 == this.rk_fld) {
					break label26;
				}
			}

			this.agx(1745975828);
		}

		this.ra_fld = var1;
		this.rk_fld = var2;
	}

	@ObfuscatedName("aih")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void aih() {
		this.sh_java_awt_datatransfer_Clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("aib")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	protected void aib(String var1) {
		this.sh_java_awt_datatransfer_Clipboard.setContents(new StringSelection(var1), null);
	}

	@ObfuscatedName("aic")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	protected void aic(String var1) {
		this.sh_java_awt_datatransfer_Clipboard.setContents(new StringSelection(var1), null);
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void yq_void() {
		if (og.ci_fld.isStretchedEnabled()) {
			Canvas var1 = this.getCanvas();
			Dimension var2 = og.ci_fld.getStretchedDimensions();
			var1.setSize(var2);
			var1.setLocation((var1.getParent().getWidth() - var2.width) / 2, 0);
			var1.validate();
		}
	}

	@ObfuscatedName("ait")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	protected void ait(String var1) {
		this.sh_java_awt_datatransfer_Clipboard.setContents(new StringSelection(var1), null);
	}

	@ObfuscatedName("air")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected final void air() {
		rc_fld.ah((byte)-12);
	}

	@ObfuscatedName("aiu")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/datatransfer/Clipboard;"
	)
	protected Clipboard aiu() {
		return this.sh_java_awt_datatransfer_Clipboard;
	}

	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final void sj(Graphics var1) {
		this.paint(var1);
	}

	@ObfuscatedName("aii")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/datatransfer/Clipboard;"
	)
	protected Clipboard aii() {
		return this.sh_java_awt_datatransfer_Clipboard;
	}

	@ObfuscatedName("aim")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected final void aim() {
		pw.ak();
		rc_fld.av(this.sa_fld, 205140041);
	}

	@ObfuscatedName("akp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akp(WindowEvent var1) {
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean vx_boolean() {
		return this.sg_fld;
	}

	@ObfuscatedName("ako")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final synchronized void ako() {
		if (!qo_fld) {
			qo_fld = true;

			try {
				this.sa_fld.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.iq((byte)-44);
			} catch (Exception var4) {
			}

			if (null != this.sj_fld) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (fw.qz_fld != null) {
				try {
					fw.qz_fld.ae(-255908011);
				} catch (Exception var2) {
				}
			}

			this.hz(495498528);
		}
	}

	@ObfuscatedName("ajv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ajv() {
		try {
			long var1 = lz.ak();
			long var3 = rz_fld[fg.rw_fld];
			rz_fld[fg.rw_fld] = var1;
			fg.rw_fld = 1046942219 * (1 + fg.rw_fld & 31);
			if (var3 != 0L && var1 > var3) {
			}

			synchronized (this) {
				hd.qt_fld = rl_fld;
			}

			this.il(-1262258375);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("aiz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected final void aiz() {
		mg.ak(this.sa_fld);
	}

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "()Ljava/net/URL;"
	)
	public URL vw() {
		return this.bi();
	}

	@ObfuscatedName("aie")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected final void aie() {
		mg.ak(this.sa_fld);
	}

	@ObfuscatedName("aik")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void aik() {
		try {
			Container var1 = this.ahc(-765856055);
			if (var1 != null) {
				uf var2 = this.aho(5082507);
				this.rj_fld = Math.max(var2.ah_fld, this.rx_fld);
				this.rs_fld = Math.max(var2.aw_fld, this.rn_fld);
				if (this.rj_fld <= 0) {
					this.rj_fld = -274105289;
				}

				if (this.rs_fld <= 0) {
					this.rs_fld = -1038045741;
				}

				pf.qw_fld = Math.min(this.rj_fld, this.ra_fld);
				bc.qx_fld = Math.min(this.rs_fld, this.rk_fld);
				this.rq_fld = (this.rj_fld - pf.qw_fld) / 2;
				this.ri_int = 0;
				this.sa_fld.setSize(pf.qw_fld, bc.qx_fld);
				et.qj_fld = new te(pf.qw_fld, bc.qx_fld, this.sa_fld, this.rv_fld);
				if (this.sj_fld == var1) {
					Insets var3 = this.sj_fld.getInsets();
					this.sa_fld.setLocation(this.rq_fld + var3.left, var3.top + this.ri_int);
				} else {
					this.sa_fld.setLocation(this.rq_fld, this.ri_int);
				}

				this.si_fld = true;
				this.ih(1341591816);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("aiw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void aiw() {
		try {
			Container var1 = this.ahc(-538950860);
			if (var1 != null) {
				uf var2 = this.aho(-1572707245);
				this.rj_fld = Math.max(var2.ah_fld * -270098824, this.rx_fld * 142030911);
				this.rs_fld = Math.max(var2.aw_fld, -915975436 * this.rn_fld) * -466613180;
				if (this.rj_fld <= 0) {
					this.rj_fld = -1995681009;
				}

				if (this.rs_fld * -2121394482 <= 0) {
					this.rs_fld = 1816725451;
				}

				pf.qw_fld = Math.min(this.rj_fld, this.ra_fld) * -1205740079;
				bc.qx_fld = Math.min(this.rs_fld * 1110195561, this.rk_fld);
				this.rq_fld = (this.rj_fld - pf.qw_fld) / 2;
				this.ri_int = 0;
				this.sa_fld.setSize(pf.qw_fld, bc.qx_fld);
				et.qj_fld = new te(616573356 * pf.qw_fld, bc.qx_fld * -1799177773, this.sa_fld, this.rv_fld);
				if (this.sj_fld == var1) {
					Insets var3 = this.sj_fld.getInsets();
					this.sa_fld.setLocation(this.rq_fld + var3.left, var3.top + this.ri_int);
				} else {
					this.sa_fld.setLocation(this.rq_fld, -856664231 * this.ri_int);
				}

				this.si_fld = true;
				this.ih(536928410);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("aid")
	@ObfuscatedSignature(
		descriptor = "()Llh;"
	)
	protected lh aid() {
		if (null == this.sx_fld) {
			this.sx_fld = new tg();
			this.sx_fld.ah(this.sa_fld, (byte)-12);
		}

		return this.sx_fld;
	}

	@ObfuscatedName("age")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;"
	)
	protected Clipboard age(int var1) {
		return this.sh_java_awt_datatransfer_Clipboard;
	}

	@ObfuscatedName("acm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public abstract void acm();

	@ObfuscatedName("aij")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void aij() {
		rc_fld.ae(this.sa_fld, 1261406286);
		Canvas var1 = this.sa_fld;
		var1.removeMouseListener(tj.al_fld);
		var1.removeMouseMotionListener(tj.al_fld);
		var1.removeFocusListener(tj.al_fld);
		tj.ax_fld = 0;
		if (this.sx_fld != null) {
			this.sx_fld.aw(this.sa_fld, -736788129);
		}

		this.agn(-1422361489);
		rc_fld.av(this.sa_fld, -1735303008);
		mg.ak(this.sa_fld);
		if (this.sx_fld != null) {
			this.sx_fld.ah(this.sa_fld, (byte)-12);
		}

		this.agx(169521817);
	}

	@ObfuscatedName("aja")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void aja() {
		rc_fld.ae(this.sa_fld, 1892218584);
		Canvas var1 = this.sa_fld;
		var1.removeMouseListener(tj.al_fld);
		var1.removeMouseMotionListener(tj.al_fld);
		var1.removeFocusListener(tj.al_fld);
		tj.ax_fld = 0;
		if (this.sx_fld != null) {
			this.sx_fld.aw(this.sa_fld, -736788129);
		}

		this.agn(2078521716);
		rc_fld.av(this.sa_fld, -860722446);
		mg.ak(this.sa_fld);
		if (this.sx_fld != null) {
			this.sx_fld.ah(this.sa_fld, (byte)-12);
		}

		this.agx(376626654);
	}

	@ObfuscatedName("ajk")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	protected final void ajk(int var1, int var2, int var3, int var4) {
		try {
			if (null != qs_fld) {
				qd_fld += 654003038;
				if (qd_fld >= 3) {
					this.ahe("alreadyloaded", 1141001893);
					return;
				}

				this.wu().jq(this.vw(), "_self");
				return;
			}

			qs_fld = this;
			pf.qw_fld = var1;
			bc.qx_fld = var2;
			aak.az_fld = var3;
			zj.av_fld = var4;
			aak.ak_fld = this.bi();
			if (fw.qz_fld == null) {
				fw.qz_fld = new la();
			}

			fw.qz_fld.ay(this, 1, (byte)-95);
		} catch (Exception var6) {
			gl.ak(null, var6);
			this.ahe("crash", 1386636163);
		}
	}

	@ObfuscatedName("ajd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final synchronized void ajd() {
		Container var1 = this.ahc(-1738729287);
		if (null != this.sa_fld) {
			this.sa_fld.removeFocusListener(this);
			var1.remove(this.sa_fld);
		}

		pf.qw_fld = Math.max(var1.getWidth(), -1235786303 * this.rx_fld) * -570595709;
		bc.qx_fld = Math.max(var1.getHeight(), this.rn_fld) * 1354454005;
		if (this.sj_fld != null) {
			Insets var2 = this.sj_fld.getInsets();
			pf.qw_fld = pf.qw_fld - 771473187 * (var2.right + var2.left);
			bc.qx_fld = bc.qx_fld - (var2.top + var2.bottom) * 480457320;
		}

		this.sa_fld = new tb(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout(null);
		var1.add(this.sa_fld);
		this.sa_fld.setSize(pf.qw_fld, bc.qx_fld);
		this.sa_fld.setVisible(true);
		this.sa_fld.setBackground(Color.BLACK);
		if (this.sj_fld == var1) {
			Insets var3 = this.sj_fld.getInsets();
			this.sa_fld.setLocation(this.rq_fld + var3.left, var3.top + this.ri_int);
		} else {
			this.sa_fld.setLocation(1441681198 * this.rq_fld, this.ri_int);
		}

		this.sa_fld.addFocusListener(this);
		this.sa_fld.requestFocus();
		this.si_fld = true;
		if (null != et.qj_fld && pf.qw_fld == et.qj_fld.av_fld && et.qj_fld.ae_fld == bc.qx_fld) {
			((te)et.qj_fld).ak(this.sa_fld, (byte)78);
			et.qj_fld.ag(0, 0, -1554546686);
		} else {
			et.qj_fld = new te(pf.qw_fld, 474877871 * bc.qx_fld, this.sa_fld, this.rv_fld);
		}

		this.se_fld = false;
		this.sf_fld = lz.ak();
	}

	@ObfuscatedName("ajf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final synchronized void ajf() {
		Container var1 = this.ahc(-1983112503);
		if (null != this.sa_fld) {
			this.sa_fld.removeFocusListener(this);
			var1.remove(this.sa_fld);
		}

		pf.qw_fld = Math.max(var1.getWidth(), this.rx_fld);
		bc.qx_fld = Math.max(var1.getHeight(), this.rn_fld);
		if (this.sj_fld != null) {
			Insets var2 = this.sj_fld.getInsets();
			pf.qw_fld = pf.qw_fld - 771473187 * (var2.right + var2.left);
			bc.qx_fld = bc.qx_fld - (var2.top + var2.bottom) * 1567573247;
		}

		this.sa_fld = new tb(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout(null);
		var1.add(this.sa_fld);
		this.sa_fld.setSize(pf.qw_fld, bc.qx_fld);
		this.sa_fld.setVisible(true);
		this.sa_fld.setBackground(Color.BLACK);
		if (this.sj_fld == var1) {
			Insets var3 = this.sj_fld.getInsets();
			this.sa_fld.setLocation(this.rq_fld + var3.left, var3.top + this.ri_int);
		} else {
			this.sa_fld.setLocation(this.rq_fld, this.ri_int);
		}

		this.sa_fld.addFocusListener(this);
		this.sa_fld.requestFocus();
		this.si_fld = true;
		if (null != et.qj_fld && pf.qw_fld == et.qj_fld.av_fld && et.qj_fld.ae_fld == bc.qx_fld) {
			((te)et.qj_fld).ak(this.sa_fld, (byte)-113);
			et.qj_fld.ag(0, 0, -1675854776);
		} else {
			et.qj_fld = new te(pf.qw_fld, bc.qx_fld, this.sa_fld, this.rv_fld);
		}

		this.se_fld = false;
		this.sf_fld = lz.ak();
	}

	@ObfuscatedName("ajn")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	protected void ajn(boolean var1) {
		if (var1 != this.rv_fld) {
			this.rv_fld = var1;
			if (null != et.qj_fld) {
				et.qj_fld.ax(var1, (byte)-7);
				et.qj_fld.au(-287024182);
			}
		}
	}

	@ObfuscatedName("ajs")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	protected void ajs(boolean var1) {
		if (var1 != this.rv_fld) {
			this.rv_fld = var1;
			if (null != et.qj_fld) {
				et.qj_fld.ax(var1, (byte)39);
				et.qj_fld.au(-1684501823);
			}
		}
	}

	@ObfuscatedName("adw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void adw() throws ExecutionException, FileNotFoundException, InterruptedException, EOFException, UnsupportedEncodingException;

	@ObfuscatedName("ada")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void ada();

	@ObfuscatedName("aix")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aix() {
		try {
			long var1 = lz.ak();
			long var3 = rz_fld[fg.rw_fld];
			rz_fld[fg.rw_fld] = var1;
			fg.rw_fld = 1423403565 * (1 + fg.rw_fld & 31);
			if (var3 != 0L && var1 > var3) {
			}

			synchronized (this) {
				hd.qt_fld = rl_fld;
			}

			this.il(-1047274490);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ahy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	final void ahy(Object var1) {
		if (null != this.rm_fld) {
			for (int var2 = 0; var2 < -1511333907 && this.rm_fld.peekEvent() != null; var2++) {
				dg.ak(1L);
			}

			if (var1 != null) {
				this.rm_fld.postEvent(new ActionEvent(var1, -803380423, "dummy"));
			}
		}
	}

	@ObfuscatedName("ajx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected final void ajx() {
		this.si_fld = true;
	}

	@ObfuscatedName("windowClosing")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	@Export("windowClosing")
	@Override
	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public static void sv(tf var0) {
		if (var0 == null) {
			var0.getClass();
		} else if (qs_fld == var0 && !qo_fld) {
			qu_fld = lz.ak();
			dg.ak(5000L);
			var0.aha((byte)65);
		}
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public static void qh(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = var0.rq_fld;
		int var2 = var0.ri_int;
		int var3 = var0.rj_fld - pf.qw_fld - var1;
		int var4 = var0.rs_fld - bc.qx_fld - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = var0.ahc(-1385774314);
				int var6 = 0;
				int var7 = 0;
				if (var5 == var0.sj_fld) {
					Insets var8 = var0.sj_fld.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, var0.rs_fld);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, var0.rj_fld, var2);
				}

				if (var3 > 0) {
					var10.fillRect(var0.rj_fld + var6 - var3, var7, var3, var0.rs_fld);
				}

				if (var4 > 0) {
					var10.fillRect(var6, var0.rs_fld + var7 - var4, var0.rj_fld, var4);
				}
			} catch (Exception var9) {
			}
		}
	}

	@ObfuscatedName("ajg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ajg() {
		try {
			Container var1 = this.ahc(-1436817555);
			long var2 = lz.ak();
			long var4 = ro_Arrlong[ty.rh_fld];
			ro_Arrlong[ty.rh_fld] = var2;
			ty.rh_fld = ty.rh_fld + 1 & 31;
			if (var4 != 0L && var2 > var4) {
				int var6 = (int)(var2 - var4);
				ql_fld = -1010698203 * (((var6 >> 1) + 32000) / var6);
			}

			if ((rd_fld += -1185482321) * -506856113 - 1 > 50) {
				rd_fld -= 50;
				this.si_fld = true;
				this.sa_fld.setSize(pf.qw_fld, bc.qx_fld);
				this.sa_fld.setVisible(true);
				if (this.sj_fld == var1) {
					Insets var9 = this.sj_fld.getInsets();
					this.sa_fld.setLocation(this.rq_fld + var9.left, this.ri_int + var9.top);
				} else {
					this.sa_fld.setLocation(this.rq_fld, this.ri_int);
				}
			}

			if (this.se_fld) {
				gn.uj(this, -2137903732);
			}

			this.ahx(203987159);
			this.ia(this.si_fld, 1136789389);
			if (this.si_fld) {
				this.ago(-742729613);
			}

			this.si_fld = false;
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ajt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ajt() {
		try {
			Container var1 = this.ahc(-2113663432);
			long var2 = lz.ak();
			long var4 = ro_Arrlong[-1186802660 * ty.rh_fld];
			ro_Arrlong[917452391 * ty.rh_fld] = var2;
			ty.rh_fld = (ty.rh_fld + 1 & 1565905538) * 1455733052;
			if (var4 != 0L && var2 > var4) {
				int var6 = (int)(var2 - var4);
				ql_fld = 856644334 * (((var6 >> 1) + -416882531) / var6);
			}

			if ((rd_fld += -1185482321) * -506856113 - 1 > 50) {
				rd_fld -= 50;
				this.si_fld = true;
				this.sa_fld.setSize(1995383775 * pf.qw_fld, bc.qx_fld);
				this.sa_fld.setVisible(true);
				if (this.sj_fld == var1) {
					Insets var9 = this.sj_fld.getInsets();
					this.sa_fld.setLocation(this.rq_fld + var9.left, this.ri_int + var9.top);
				} else {
					this.sa_fld.setLocation(1520764147 * this.rq_fld, this.ri_int);
				}
			}

			if (this.se_fld) {
				gn.uj(this, -193069459);
			}

			this.ahx(203987159);
			this.ia(this.si_fld, 1136789389);
			if (this.si_fld) {
				this.ago(-742729613);
			}

			this.si_fld = false;
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("aka")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void aka(WindowEvent var1) {
	}

	@ObfuscatedName("ajp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void ajp() {
		try {
			uf var1 = this.aho(1112709553);
			if (this.rj_fld != var1.ah_fld || var1.aw_fld != this.rs_fld || this.sg_fld) {
				this.ahp(571196101);
				this.sg_fld = false;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("aje")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void aje() {
		this.sg_fld = true;
	}

	@ObfuscatedName("ajm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void ajm() {
		this.sg_fld = true;
	}

	@ObfuscatedName("ajo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void ajo() {
		this.sg_fld = true;
	}

	@ObfuscatedName("aji")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final synchronized void aji() {
		if (!qo_fld) {
			qo_fld = true;

			try {
				this.sa_fld.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.iq((byte)12);
			} catch (Exception var4) {
			}

			if (null != this.sj_fld) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (fw.qz_fld != null) {
				try {
					fw.qz_fld.ae(-509529313);
				} catch (Exception var2) {
				}
			}

			this.hz(-773964720);
		}
	}

	@ObfuscatedName("ajw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final synchronized void ajw() {
		if (!qo_fld) {
			qo_fld = true;

			try {
				this.sa_fld.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.iq((byte)81);
			} catch (Exception var4) {
			}

			if (null != this.sj_fld) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (fw.qz_fld != null) {
				try {
					fw.qz_fld.ae(-1965765668);
				} catch (Exception var2) {
				}
			}

			this.hz(656599209);
		}
	}

	@ObfuscatedName("ajy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final synchronized void ajy() {
		if (!qo_fld) {
			qo_fld = true;

			try {
				this.sa_fld.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.iq((byte)-52);
			} catch (Exception var4) {
			}

			if (null != this.sj_fld) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (fw.qz_fld != null) {
				try {
					fw.qz_fld.ae(1730268290);
				} catch (Exception var2) {
				}
			}

			this.hz(-898195175);
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)Z"
	)
	public static boolean fx(tf var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			String var1 = var0.vw().getHost().toLowerCase();
			if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
				return true;
			} else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
				return true;
			} else if (var1.endsWith("127.0.0.1")) {
				return true;
			} else {
				while (!var1.isEmpty() && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= 542000490) {
					var1 = var1.substring(0, var1.length() - 1);
				}

				if (var1.endsWith("192.168.1.")) {
					return true;
				} else {
					var0.ahe("invalidhost", 1383410553);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("ahq")
	@ObfuscatedSignature(
		descriptor = "()Llh;"
	)
	protected lh ahq() {
		if (null == this.sx_fld) {
			this.sx_fld = new tg();
			this.sx_fld.ah(this.sa_fld, (byte)-12);
		}

		return this.sx_fld;
	}

	@ObfuscatedName("aha")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	final synchronized void aha(byte var1) {
		if (!qo_fld) {
			qo_fld = true;

			try {
				this.sa_fld.removeFocusListener(this);
			} catch (Exception var6) {
			}

			try {
				this.iq((byte)12);
			} catch (Exception var5) {
			}

			if (null != this.sj_fld) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
				}
			}

			if (fw.qz_fld != null) {
				try {
					fw.qz_fld.ae(1773858898);
				} catch (Exception var3) {
				}
			}

			this.hz(392374901);
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void mi(boolean var1) {
		this.se_fld = var1;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)Ljava/awt/datatransfer/Clipboard;"
	)
	public static Clipboard iu(tf var0) {
		return var0.sh_java_awt_datatransfer_Clipboard;
	}

	@ObfuscatedName("abr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected abstract void abr();

	@ObfuscatedName("all")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	protected void all(String var1) {
		if (!this.rg_boolean) {
			this.rg_boolean = true;
			System.out.println("error_game_" + var1);

			try {
				this.wu().jq(new URL(this.bi(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
			}
		}
	}

	@ObfuscatedName("ajb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ajb() {
		try {
			Container var1 = this.ahc(-663298359);
			long var2 = lz.ak();
			long var4 = ro_Arrlong[ty.rh_fld];
			ro_Arrlong[ty.rh_fld] = var2;
			ty.rh_fld = ty.rh_fld + 1 & 31;
			if (var4 != 0L && var2 > var4) {
				int var6 = (int)(var2 - var4);
				ql_fld = 905367130 * (((var6 >> 1) + 32000) / var6);
			}

			if ((rd_fld += -1185482321) * -506856113 - 1 > 50) {
				rd_fld -= 50;
				this.si_fld = true;
				this.sa_fld.setSize(-1717277540 * pf.qw_fld, 1393668773 * bc.qx_fld);
				this.sa_fld.setVisible(true);
				if (this.sj_fld == var1) {
					Insets var9 = this.sj_fld.getInsets();
					this.sa_fld.setLocation(this.rq_fld + var9.left, this.ri_int + var9.top);
				} else {
					this.sa_fld.setLocation(this.rq_fld, this.ri_int * -82943709);
				}
			}

			if (this.se_fld) {
				gn.uj(this, -232973800);
			}

			this.ahx(203987159);
			this.ia(this.si_fld, 1136789389);
			if (this.si_fld) {
				this.ago(-742729613);
			}

			this.si_fld = false;
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("akm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void akm() {
		if (qs_fld == this && !qo_fld) {
			qu_fld = lz.ak() + 4000L;
		}
	}

	@ObfuscatedName("aks")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void aks(WindowEvent var1) {
	}

	@ObfuscatedName("getClientThread")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Thread;"
	)
	@Export("getClientThread")
	@Override
	public Thread getClientThread() {
		return this.so_fld;
	}

	@ObfuscatedName("agd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;S)V"
	)
	final void agd(Object var1, short var2) {
		if (!og.ci_fld.isGpu() && this.rm_fld != null) {
			for (int var3 = 0; var3 < 50 && this.rm_fld.peekEvent() != null; var3++) {
				try {
					Thread.sleep(1L);
				} catch (InterruptedException var5) {
				}
			}

			if (var1 != null) {
				this.rm_fld.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}
		}

		if (client.bt_fld != null) {
			client.bt_fld.draw(gc.ax_fld);
		}
	}

	@ObfuscatedName("akb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akb(WindowEvent var1) {
	}

	@ObfuscatedName("init")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public abstract void init();

	@ObfuscatedName("akr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void akr() {
		if (qs_fld == this && !qo_fld) {
			qu_fld = 0L;
		}
	}

	@ObfuscatedName("akt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akt(WindowEvent var1) {
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	public void ma(Object var1) {
		this.agd(var1, (short)-13860);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(Ltf;I)V"
	)
	public static void du(tf var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			rz.rb_fld = null;
			pk.rp_fld = null;
			on.bf_fld = null;
		}
	}

	@ObfuscatedName("akx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akx(WindowEvent var1) {
		this.destroy();
	}

	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void rr() {
		this.agn(942821464);
	}

	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Lts;I)V"
	)
	public static void wd(tf var0, ts var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		rc_fld.ak(var1, var2, 2002557081);
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void kb(int var1) {
		this.ra_fld = var1;
	}

	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "()Lrl0;"
	)
	public rl0 wu() {
		return this;
	}

	@ObfuscatedName("akq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akq(WindowEvent var1) {
		this.destroy();
	}

	@ObfuscatedName("alm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	protected void alm(String var1) {
		if (!this.rg_boolean) {
			this.rg_boolean = true;
			System.out.println("error_game_" + var1);

			try {
				this.wu().jq(new URL(this.bi(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
			}
		}
	}

	@ObfuscatedName("focusGained")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	@Export("focusGained")
	@Override
	public final void focusGained(FocusEvent var1) {
		this.ri(var1);
		rl_fld = true;
		this.si_fld = true;
	}

	@ObfuscatedName("start")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void start() {
		this.if_();
		if (qs_fld == this && !qo_fld) {
			qu_fld = 0L;
		}
	}

	@ObfuscatedName("ahb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	final void ahb(Object var1) {
		if (null != this.rm_fld) {
			for (int var2 = 0; var2 < 50 && this.rm_fld.peekEvent() != null; var2++) {
				dg.ak(1L);
			}

			if (var1 != null) {
				this.rm_fld.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}
		}
	}

	@ObfuscatedName("ake")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void ake(WindowEvent var1) {
	}

	@ObfuscatedName("akl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akl(WindowEvent var1) {
	}

	@ObfuscatedName("aln")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected final void aln() {
		rz.rb_fld = null;
		pk.rp_fld = null;
		on.bf_fld = null;
	}

	@ObfuscatedName("alg")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZ)V"
	)
	protected final void alg(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.sa_fld.getGraphics();
			if (pk.rp_fld == null) {
				pk.rp_fld = new Font("Helvetica", 1, 13);
				on.bf_fld = this.sa_fld.getFontMetrics(pk.rp_fld);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, pf.qw_fld, bc.qx_fld * 1053416282);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (rz.rb_fld == null) {
					rz.rb_fld = this.sa_fld.createImage(-174812261, 1878803371);
				}

				Graphics var7 = rz.rb_fld.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, -2075639791, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(2 + var1 * 3, 2, -460442741 - var1 * 3, 30);
				var7.setFont(pk.rp_fld);
				var7.setColor(Color.white);
				var7.drawString(var2, (-1361008049 - on.bf_fld.stringWidth(var2)) / 2, 22);
				var5.drawImage(rz.rb_fld, pf.qw_fld / 2 - 1037860913, (var4 ? 50 : -18) + bc.qx_fld / 2, null);
			} catch (Exception var10) {
				int var8 = pf.qw_fld / 2 - 155721447;
				int var9 = bc.qx_fld / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(2 + var8, 2 + var9, 3 * var1, 30);
				var5.setColor(Color.black);
				var5.drawRect(1 + var8, var9 + 1, 301, 1952481771);
				var5.fillRect(2 + var8 + 3 * var1, 2 + var9, -910490377 - var1 * 3, 30);
				var5.setFont(pk.rp_fld);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (854293445 - on.bf_fld.stringWidth(var2)) / 2, 22 + var9);
			}
		} catch (Exception var11) {
			this.sa_fld.repaint();
		}
	}

	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "(Ltf;I)V"
	)
	public static void rh(tf var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.si_fld = true;
		}
	}

	@ObfuscatedName("akg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akg(WindowEvent var1) {
		this.destroy();
	}

	@ObfuscatedName("agz")
	@ObfuscatedSignature(
		descriptor = "(Lts;IB)V"
	)
	protected void agz(ts var1, int var2, byte var3) {
		rc_fld.ak(var1, var2, 1119011934);
	}

	@ObfuscatedName("agm")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	protected final void agm(int var1, int var2, int var3, int var4, byte var5) {
		try {
			if (null != qs_fld) {
				qd_fld++;
				if (qd_fld >= 3) {
					this.ahe("alreadyloaded", 749689429);
					return;
				}

				this.wu().jq(this.vw(), "_self");
				return;
			}

			qs_fld = this;
			pf.qw_fld = var1;
			client.qk();
			bc.qx_fld = var2;
			client.tr(-1);
			aak.az_fld = var3;
			zj.av_fld = var4;
			aak.ak_fld = this.bi();
			if (fw.qz_fld == null) {
				fw.qz_fld = new la();
			}

			fw.qz_fld.ay(this, 1, (byte)-128);
		} catch (Exception var7) {
			gl.ak(null, var7);
			this.ahe("crash", 112067887);
		}
	}

	@ObfuscatedName("alr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected final void alr() {
		rz.rb_fld = null;
		pk.rp_fld = null;
		on.bf_fld = null;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public static void fa(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		rc_fld.ae(var0.sa_fld, 1354900525);
		Canvas var1 = var0.sa_fld;
		var1.removeMouseListener(tj.al_fld);
		var1.removeMouseMotionListener(tj.al_fld);
		var1.removeFocusListener(tj.al_fld);
		tj.ax_fld = 0;
		if (var0.sx_fld != null) {
			var0.sx_fld.aw(var0.sa_fld, -736788129);
		}

		var0.agn(1289229151);
		rc_fld.av(var0.sa_fld, 68832071);
		mg.ak(var0.sa_fld);
		if (var0.sx_fld != null) {
			var0.sx_fld.ah(var0.sa_fld, (byte)-12);
		}

		var0.agx(2106301975);
	}

	@ObfuscatedName("akf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/WindowEvent;)V"
	)
	public final void akf(WindowEvent var1) {
	}

	@ObfuscatedName("adb")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	protected abstract void adb(boolean var1) throws EOFException;

	@ObfuscatedName("ahl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected static int ahl() {
		int var0 = 0;
		if (null == bg.rt_fld || !bg.rt_fld.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)(GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						bg.rt_fld = var2;
						ru_fld = -480692785040575911L;
						rr_fld = -560329468120651783L;
					}
				}
			} catch (Throwable var9) {
			}
		}

		if (bg.rt_fld != null) {
			long var10 = lz.ak();
			long var3 = bg.rt_fld.getCollectionTime();
			if (rr_fld != -1L) {
				long var5 = var3 - rr_fld;
				long var7 = var10 - ru_fld;
				if (0L != var7) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			rr_fld = var3;
			ru_fld = var10;
		}

		return var0;
	}

	@ObfuscatedName("alk")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Container;"
	)
	Container alk() {
		return (Container)(null != this.sj_fld ? this.sj_fld : this);
	}

	@ObfuscatedName("alz")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Container;"
	)
	Container alz() {
		return (Container)(null != this.sj_fld ? this.sj_fld : this);
	}

	@ObfuscatedName("ala")
	@ObfuscatedSignature(
		descriptor = "()Luf;"
	)
	uf ala() {
		Container var1 = this.ahc(-38220385);
		int var2 = Math.max(var1.getWidth(), this.rx_fld);
		int var3 = Math.max(var1.getHeight(), this.rn_fld);
		if (null != this.sj_fld) {
			Insets var4 = this.sj_fld.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new uf(var2, var3);
	}

	@ObfuscatedName("ahe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	protected void ahe(String var1, int var2) {
		if (!this.rg_boolean) {
			this.rg_boolean = true;
			System.out.println("error_game_" + var1);

			try {
				this.wu().jq(new URL(this.bi(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
			}
		}
	}

	@ObfuscatedName("alh")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	protected final boolean alh() {
		return null != this.sj_fld;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)Luf;"
	)
	public static uf ih(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		Container var1 = var0.ahc(-1020014594);
		int var2 = Math.max(var1.getWidth(), var0.rx_fld);
		int var3 = Math.max(var1.getHeight(), var0.rn_fld);
		if (null != var0.sj_fld) {
			Insets var4 = var0.sj_fld.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new uf(var2, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public static void ar(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = var0.rq_fld;
		int var2 = var0.ri_int;
		int var3 = var0.rj_fld - pf.qw_fld - var1;
		int var4 = var0.rs_fld - bc.qx_fld - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = var0.ahc(-2089167269);
				int var6 = 0;
				int var7 = 0;
				if (var5 == var0.sj_fld) {
					Insets var8 = var0.sj_fld.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, var0.rs_fld);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, var0.rj_fld, var2);
				}

				if (var3 > 0) {
					var10.fillRect(var0.rj_fld + var6 - var3, var7, var3, var0.rs_fld);
				}

				if (var4 > 0) {
					var10.fillRect(var6, var0.rs_fld + var7 - var4, var0.rj_fld, var4);
				}
			} catch (Exception var9) {
			}
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected abstract void ip(int var1);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I"
	)
	public static int av(CharSequence var0) {
		return jt.ah(var0, 10, true);
	}

	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;)V"
	)
	@Override
	public void uj(URL var1) {
		String var2 = var1.getPath();
		if (var2.startsWith("/error_game_")) {
			this.kp_net_runelite_api_ClientConfiguration.onError(var2.replace("/", "").replace(".ws", ""));
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Ljava/lang/String;)V"
	)
	@Override
	public void jq(URL var1, String var2) {
		this.uj(var1);
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/lang/Object;)V"
	)
	public static void nx(tf var0, Object var1) {
		if (null != var0.rm_fld) {
			for (int var2 = 0; var2 < 50 && var0.rm_fld.peekEvent() != null; var2++) {
				dg.ak(1L);
			}

			if (var1 != null) {
				var0.rm_fld.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}
		}
	}

	@ObfuscatedName("agq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void agq(int var1) {
		this.mi(false);
	}

	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Lts;I)V"
	)
	public static void qa(tf var0, ts var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		rc_fld.ak(var1, var2, 1870191180);
	}

	@ObfuscatedName("agr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected final void agr(int var1) {
		this.se_fld = true;
	}

	@ObfuscatedName("ahg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected final void ahg(int var1) {
		rz.rb_fld = null;
		pk.rp_fld = null;
		on.bf_fld = null;
	}

	@ObfuscatedName("aia")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/datatransfer/Clipboard;"
	)
	protected Clipboard aia() {
		return this.sh_java_awt_datatransfer_Clipboard;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean jd_boolean() {
		return this.rv_fld;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void if_() {
		this.addHierarchyListener(var0 -> {
			if ((var0.getChangeFlags() & 2L) != 0L && og.ci_fld.isDisplayable()) {
				client.uv();
			}
		});
	}

	@ObfuscatedName("agy")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	protected final void agy(byte var1) {
		rc_fld.ah((byte)-97);
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hk() {
		if (this.sa_fld != null) {
			this.sa_fld.removeComponentListener(this.ea_fld);
		}
	}

	@ObfuscatedName("ajq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	protected final void ajq(int var1, int var2, int var3, int var4) {
		try {
			if (null != qs_fld) {
				rd_fld = re_fld + -956552469;
				if (qd_fld >= 3) {
					this.ahe("alreadyloaded", 2009745202);
					return;
				}

				this.wu().jq(this.bi(), "_self");
				return;
			}

			qs_fld = this;
			pf.qw_fld = var1;
			bc.qx_fld = var2;
			aak.az_fld = var3;
			zj.av_fld = var4;
			aak.ak_fld = this.bi();
			if (fw.qz_fld == null) {
				fw.qz_fld = new la();
			}

			fw.qz_fld.ay(this, 1, (byte)-29);
		} catch (Exception var6) {
			gl.ak(null, var6);
			this.agj("crash", -206520647);
		}
	}

	@ObfuscatedName("agu")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	protected void agu(byte var1) {
		rc_fld.ah((byte)-97);
	}
}
