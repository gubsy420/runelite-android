import java.io.EOFException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qv")
public class qv {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	ThreadPoolExecutor az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/ThreadFactory;"
	)
	ThreadFactory ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -131271695
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ak_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lyc;"
	)
	static yc cx_fld;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ar() {
		try {
			this.az_fld.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	final ThreadPoolExecutor ak(int var1) {
		return new ThreadPoolExecutor(0, var1, 2L, TimeUnit.MINUTES, new ArrayBlockingQueue<>(this.av_fld), this.ag_fld);
	}

	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "(Lqv;)V"
	)
	public static void vt(qv var0) {
		try {
			var0.az_fld.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	static void cs(int var0, int var1, int var2, int var3, byte var4) throws EOFException {
		client.no_fld = var0;
		client.np_fld = var1;
		client.mi_fld++;
		bw.dk_fld.az_fld.qe(client.dv_fld);
		if (client.qk_fld != -1 && bw.dk_fld.az_fld.ak() != client.qk_fld) {
			if (var4 != 0) {
				return;
			}

			eg var5 = eg.ak(ab.hu_fld, client.qk_fld, 0);
			if (var5 != null) {
				bw.dk_fld.az_fld.ag(client.qk_fld, var5.bo());
			}
		}

		label104: {
			cv var10 = ot.ef();
			if (var10 != null) {
				if (var10.bi_fld >> 7 != client.oq_fld || var10.dm_fld >> 7 != client.or_fld) {
					break label104;
				}

				if (var4 != 0) {
					return;
				}
			}

			client.oq_fld = 0;
			client.or_fld = 0;
		}

		ie.cr(bw.dk_fld);
		dx var11 = bw.dk_fld;
		int var6 = client.nr_fld.ot_fld - 1;
		if (null != cb.mz_fld && bw.dk_fld == var11 && var6 >= 0 && 60 == client.nr_fld.ae_fld[var6]) {
			if (var4 != 0) {
				return;
			}

			if (client.oz_fld > 0 && client.nr_fld.ah_fld[var6] == client.op_fld) {
				if (var4 != 0) {
					return;
				}
			} else {
				int var8 = client.nr_fld.ah_fld[var6] * 128;
				ud.ca(var11, var8, cb.mz_fld);
			}
		}

		dx var12 = bw.dk_fld;
		if (client.ec_fld) {
			hb.cw(var12, client.dj_fld, false, (byte)30);
		}

		dx var7 = bw.dk_fld;
		if (client.nq_fld >= 0 && var7.au_fld.ae(client.nq_fld) != null) {
			hb.cw(var7, client.nq_fld, false, (byte)22);
		}

		dx var13 = bw.dk_fld;
		rg var9 = (rg)var13.an_fld.ak(client.es_fld);
		if (var9 != null) {
			rb.cz(var13, var9, false, (byte)57);
		}

		cb.ck(bw.dk_fld, ko.az_fld, (byte)-39);
		cb.ck(bw.dk_fld, ko.ak_fld, (byte)-58);
		bu.cm(bw.dk_fld, or.ak_fld, -1684716873);
		hd.cg(bw.dk_fld, -2133804539);
		bu.cm(bw.dk_fld, or.ag_fld, -407351239);
		bu.cm(bw.dk_fld, or.az_fld, -2026407175);
		hn.ci();
		bj.cj(bw.dk_fld, (byte)51);
		cb.ck(bw.dk_fld, ko.ag_fld, (byte)-35);
		gd.ce(var0, var1, var2, var3, (byte)4);
		bj.cp();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqk;)Lqw;"
	)
	public qw ay(qk var1) {
		if (this.az_fld.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.az_fld.getCorePoolSize() + " Queue capacity " + this.av_fld);
			return new qw("Queue full");
		} else {
			return new qw(this.az_fld.submit(new qn(this, var1)));
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqk;I)Lqw;"
	)
	public qw ag(qk var1) {
		if (this.az_fld.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.az_fld.getCorePoolSize() + " Queue capacity " + this.av_fld);
			return new qw("Queue full");
		} else {
			return new qw(this.az_fld.submit(new qn(this, var1)));
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lqv;)V"
	)
	public static void lf(qv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		try {
			var0.az_fld.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	final ThreadPoolExecutor ae(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(this.av_fld), this.ag_fld);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	final ThreadPoolExecutor ah(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(this.av_fld), this.ag_fld);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	final ThreadPoolExecutor aw(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(this.av_fld), this.ag_fld);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public final void az() {
		try {
			this.az_fld.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void al() {
		try {
			this.az_fld.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpp;)Lpp;"
	)
	public static pp av(pp var0) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = -1;
		if (var0.di_fld != -1) {
			var1 = dv.ag(var0.di_fld, (byte)97);
		} else if (-1 != var0.dn_fld) {
			var1 = rt.ag_fld[var0.dn_fld];
		}

		int var2;
		if (var1 >= 0 && var1 < var0.dy_fld.length - 1) {
			var2 = var0.dy_fld[var1];
		} else {
			var2 = var0.dy_fld[var0.dy_fld.length - 1];
		}

		return var2 != -1 ? ca.az(var2) : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	final ThreadPoolExecutor av(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(this.av_fld), this.ag_fld);
	}

	public qv(String var1, int var2, int var3) {
		this.ak_fld = var1;
		this.av_fld = var2;
		this.ag_fld = new qb(this);
		this.az_fld = this.ak(var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;III)I"
	)
	public static int av(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		int var5 = 0;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var6 = var0.ak();
			int var7 = (Integer)var1;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var7 == var6[var8]) {
					var5++;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var10 = sl.ob(var0, -1407986911);
			long var12 = (Long)var1;

			for (int var9 = var2; var9 < var3; var9++) {
				if (var10[var9] == var12) {
					var5++;
				}
			}
		} else {
			Object[] var11 = (Object[])var0.az();

			for (int var13 = var2; var13 < var3; var13++) {
				if (var1 == var11[var13] || var11[var13] != null && var11[var13].equals(var1)) {
					var5++;
				}
			}
		}

		return var5;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void af() {
		try {
			this.az_fld.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}
	}
}
