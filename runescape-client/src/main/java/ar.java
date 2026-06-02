import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ar")
public class ar extends aj {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na ak_fld = new na();
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lbr;)V"
	)
	void ao(vw var1, br var2) {
		while (var1 != this.ag_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hg_vw;
		}

		na.ak(var2, var1);
		this.av_fld = ((br)this.ag_fld.ak_fld.hg_vw).ak_fld;
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Lar;I)V"
	)
	public static void mh(ar var0, int var1) {
		for (aj var2 = (aj)var0.ak_fld.aw(); var2 != null; var2 = (aj)var0.ak_fld.as()) {
			var2.af(var1);
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public void ou(aj var1) {
		this.ax(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ax(aj var1) {
		this.ak_fld.ai(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		if (this.az_fld > 0) {
			for (br var1 = (br)this.ag_fld.aw(); var1 != null; var1 = (br)this.ag_fld.as()) {
				var1.ak_fld = var1.ak_fld - this.az_fld;
			}

			this.av_fld = this.av_fld - this.az_fld;
			this.az_fld = 0;
		}
	}

	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "(Lar;)V"
	)
	public static void xg(ar var0) {
		if (var0.az_fld > 0) {
			for (br var1 = (br)var0.ag_fld.aw(); var1 != null; var1 = (br)var0.ag_fld.as()) {
				var1.ak_fld = var1.ak_fld - var0.az_fld;
			}

			var0.av_fld = var0.av_fld - var0.az_fld;
			var0.az_fld = 0;
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lar;)V"
	)
	public static void hm(ar var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.az_fld > 0) {
			for (br var1 = (br)var0.ag_fld.aw(); var1 != null; var1 = (br)var0.ag_fld.as()) {
				var1.ak_fld = var1.ak_fld - var0.az_fld;
			}

			var0.av_fld = var0.av_fld - var0.az_fld;
			var0.az_fld = 0;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj be() {
		return (aj)(aj)this.ak_fld.as();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void al(int var1) {
		for (aj var2 = (aj)this.ak_fld.aw(); var2 != null; var2 = (aj)this.ak_fld.as()) {
			var2.af(var1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj ah() {
		return (aj)(aj)this.ak_fld.aw();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj aw() {
		return (aj)(aj)this.ak_fld.as();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxt;Lrl;Lrl;)I"
	)
	public static int ax(xt var0, rl var1, rl var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld ? var1.ad(var2, -607953307) : var2.ad(var1, -2061136989);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	void ae(br var1) {
		var1.gy_void();
		var1.ak();
		vw var2 = this.ag_fld.ak_fld.hg_vw;
		if (var2 == this.ag_fld.ak_fld) {
			this.av_fld = -1;
		} else {
			this.av_fld = ((br)var2).ak_fld;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	@Override
	public final synchronized void as(int[] var1, int var2, int var3) {
		while (this.av_fld >= 0) {
			if (this.az_fld + var3 < this.av_fld) {
				this.az_fld += var3;
				ee(this, var1, var2, var3);
				return;
			}

			int var4 = this.av_fld - this.az_fld;
			ee(this, var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.az_fld += var4;
			hm(this);
			br var5 = (br)this.ag_fld.aw();
			synchronized (var5) {
				int var7 = var5.ag(this);
				if (var7 < 0) {
					var5.ak_fld = 0;
					this.ae(var5);
				} else {
					var5.ak_fld = var7;
					this.ao(var5.hg_vw, var5);
				}
			}

			if (var3 == 0) {
				return;
			}
		}

		ee(this, var1, var2, var3);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bs() {
		return (aj)(aj)this.ak_fld.as();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public final synchronized void af(int var1) {
		while (this.av_fld >= 0) {
			if (this.az_fld + var1 < this.av_fld) {
				this.az_fld += var1;
				this.al(var1);
				return;
			}

			int var2 = this.av_fld - this.az_fld;
			this.al(var2);
			var1 -= var2;
			this.az_fld += var2;
			hm(this);
			br var3 = (br)this.ag_fld.aw();
			synchronized (var3) {
				int var5 = var3.ag(this);
				if (var5 < 0) {
					var3.ak_fld = 0;
					this.ae(var3);
				} else {
					var3.ak_fld = var5;
					this.ao(var3.hg_vw, var3);
				}
			}

			if (var1 == 0) {
				return;
			}
		}

		this.al(var1);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public final synchronized void by(int var1) {
		while (this.av_fld >= 0) {
			if (this.az_fld + var1 < this.av_fld) {
				this.az_fld += var1;
				this.al(var1);
				return;
			}

			int var2 = this.av_fld - this.az_fld;
			this.al(var2);
			var1 -= var2;
			this.az_fld += var2;
			hm(this);
			br var3 = (br)this.ag_fld.aw();
			synchronized (var3) {
				int var5 = var3.ag(this);
				if (var5 < 0) {
					var3.ak_fld = 0;
					this.ae(var3);
				} else {
					var3.ak_fld = var5;
					this.ao(var3.hg_vw, var3);
				}
			}

			if (var1 == 0) {
				return;
			}
		}

		this.al(var1);
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(Lar;Lvw;Lbr;)V"
	)
	public static void vr(ar var0, vw var1, br var2) {
		while (var1 != var0.ag_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hg_vw;
		}

		na.ak(var2, var1);
		var0.av_fld = ((br)var0.ag_fld.ak_fld.hg_vw).ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ag(aj var1) {
		this.ak_fld.ai(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void aa(aj var1) {
		var1.gy_void();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ai(aj var1) {
		var1.gy_void();
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lar;[III)V"
	)
	public static void cj(ar var0, int[] var1, int var2, int var3) {
		for (aj var4 = (aj)var0.ak_fld.aw(); var4 != null; var4 = (aj)var0.ak_fld.as()) {
			aj.di(var4, var1, var2, var3);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ak(aj var1) {
		var1.gy_void();
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "()Lna;"
	)
	public na jr() {
		return this.ak_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bo(int var1) {
		for (aj var2 = (aj)this.ak_fld.aw(); var2 != null; var2 = (aj)this.ak_fld.as()) {
			var2.af(var1);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void am() {
		if (this.az_fld > 0) {
			for (br var1 = (br)this.ag_fld.aw(); var1 != null; var1 = (br)this.ag_fld.as()) {
				var1.ak_fld = var1.ak_fld - this.az_fld;
			}

			this.av_fld = this.av_fld - this.az_fld;
			this.az_fld = 0;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lbr;)V"
	)
	void at(vw var1, br var2) {
		while (var1 != this.ag_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hg_vw;
		}

		na.ak(var2, var1);
		this.av_fld = ((br)this.ag_fld.ak_fld.hg_vw).ak_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lbr;)V"
	)
	void ap(vw var1, br var2) {
		while (var1 != this.ag_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hg_vw;
		}

		na.ak(var2, var1);
		this.av_fld = ((br)this.ag_fld.ak_fld.hg_vw).ak_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj br() {
		return (aj)(aj)this.ak_fld.as();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	void aj(br var1) {
		var1.gy_void();
		var1.ak();
		vw var2 = this.ag_fld.ak_fld.hg_vw;
		if (var2 == this.ag_fld.ak_fld) {
			this.av_fld = -1;
		} else {
			this.av_fld = ((br)var2).ak_fld;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	void bm(br var1) {
		var1.gy_void();
		var1.ak();
		vw var2 = this.ag_fld.ak_fld.hg_vw;
		if (var2 == this.ag_fld.ak_fld) {
			this.av_fld = -1;
		} else {
			this.av_fld = ((br)var2).ak_fld;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bd() {
		return (aj)(aj)this.ak_fld.aw();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bz() {
		return (aj)(aj)this.ak_fld.aw();
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(Lar;[III)V"
	)
	public static void ee(ar var0, int[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (aj var4 = (aj)var0.ak_fld.aw(); var4 != null; var4 = (aj)var0.ak_fld.as()) {
			aj.di(var4, var1, var2, var3);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void au(aj var1) {
		var1.gy_void();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lar;I)V"
	)
	public static void bi(ar var0, int var1) {
		for (aj var2 = (aj)var0.ak_fld.aw(); var2 != null; var2 = (aj)var0.ak_fld.as()) {
			var2.af(var1);
		}
	}

	public ar() {
		this.ag_fld = new na();
		this.az_fld = 0;
		this.av_fld = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ay() {
		return 0;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bh() {
		return (aj)(aj)this.ak_fld.as();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void an(aj var1) {
		this.ak_fld.ai(var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	@Override
	public final synchronized void bj(int[] var1, int var2, int var3) {
		while (this.av_fld >= 0) {
			if (this.az_fld + var3 < this.av_fld) {
				this.az_fld += var3;
				ee(this, var1, var2, var3);
				return;
			}

			int var4 = this.av_fld - this.az_fld;
			ee(this, var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.az_fld += var4;
			hm(this);
			br var5 = (br)this.ag_fld.aw();
			synchronized (var5) {
				int var7 = var5.ag(this);
				if (var7 < 0) {
					var5.ak_fld = 0;
					this.ae(var5);
				} else {
					var5.ak_fld = var7;
					this.ao(var5.hg_vw, var5);
				}
			}

			if (var3 == 0) {
				return;
			}
		}

		ee(this, var1, var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	void ac(br var1) {
		var1.gy_void();
		var1.ak();
		vw var2 = this.ag_fld.ak_fld.hg_vw;
		if (var2 == this.ag_fld.ak_fld) {
			this.av_fld = -1;
		} else {
			this.av_fld = ((br)var2).ak_fld;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public final synchronized void bl(int var1) {
		while (this.av_fld >= 0) {
			if (this.az_fld + var1 < this.av_fld) {
				this.az_fld += var1;
				this.al(var1);
				return;
			}

			int var2 = this.av_fld - this.az_fld;
			this.al(var2);
			var1 -= var2;
			this.az_fld += var2;
			hm(this);
			br var3 = (br)this.ag_fld.aw();
			synchronized (var3) {
				int var5 = var3.ag(this);
				if (var5 < 0) {
					var3.ak_fld = 0;
					this.ae(var3);
				} else {
					var3.ak_fld = var5;
					this.ao(var3.hg_vw, var3);
				}
			}

			if (var1 == 0) {
				return;
			}
		}

		this.al(var1);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int bk() {
		return 0;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bt(int var1) {
		for (aj var2 = (aj)this.ak_fld.aw(); var2 != null; var2 = (aj)this.ak_fld.as()) {
			var2.af(var1);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void az() {
		if (this.az_fld > 0) {
			for (br var1 = (br)this.ag_fld.aw(); var1 != null; var1 = (br)this.ag_fld.bz()) {
				var1.ak_fld = var1.ak_fld - this.av_fld;
			}

			this.az_fld = this.av_fld - this.az_fld;
			this.av_fld = 0;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	void ar(int[] var1, int var2, int var3) {
		while (this.az_fld >= 0) {
			if (this.az_fld + var3 < this.az_fld) {
				this.az_fld = this.av_fld + var3;
				ee(this, var1, var2, var3);
				return;
			}

			int var4 = this.av_fld - this.av_fld;
			ee(this, var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.av_fld += var4;
			hm(this);
			br var5 = (br)this.ag_fld.fc();
			synchronized (var5) {
				int var7 = var5.av(this);
				if (var7 < 0) {
					var5.ak_fld = 0;
					this.ac(var5);
				} else {
					var5.ak_fld = var7;
					this.ao(var5.hw_fld, var5);
				}
			}

			if (var3 == 0) {
				return;
			}
		}

		ee(this, var1, var2, var3);
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lar;Lvw;Lbr;)V"
	)
	public static void lk(ar var0, vw var1, br var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			while (var1 != var0.ag_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
				var1 = var1.hg_vw;
			}

			na.ak(var2, var1);
			var0.av_fld = ((br)var0.ag_fld.ak_fld.hg_vw).ak_fld;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lbr;)V"
	)
	void av(vw var1, br var2) {
		while (var1 != this.ag_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hg_vw;
		}

		na.ak(var2, var1);
		this.az_fld = ((br)this.ag_fld.ak_fld.hw_fld).ak_fld;
	}
}
