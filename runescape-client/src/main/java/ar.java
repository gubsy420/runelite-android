import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ar")
public class ar extends aj {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na ag_fld = new na();
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lbr;)V"
	)
	void av(vw var1, br var2) {
		while (var1 != this.ak_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hw_fld;
		}

		na.ak(var2, var1);
		this.av_fld = ((br)this.ak_fld.ak_fld.hw_fld).ak_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ak(aj var1) {
		this.ag_fld.av(var1);
	}

	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "(Lar;)V"
	)
	public static void rk(ar var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.az_fld > 0) {
				for (br var1 = (br)var0.ak_fld.aw(); var1 != null; var1 = (br)na.iy(var0.ak_fld)) {
					var1.ak_fld = var1.ak_fld - var0.az_fld;
				}

				var0.av_fld = var0.av_fld - var0.az_fld;
				var0.az_fld = 0;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		if (this.az_fld > 0) {
			for (br var1 = (br)this.ak_fld.aw(); var1 != null; var1 = (br)na.iy(this.ak_fld)) {
				var1.ak_fld = var1.ak_fld - this.az_fld;
			}

			this.av_fld = this.av_fld - this.az_fld;
			this.az_fld = 0;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj be() {
		return (aj)(aj)na.iy(this.ag_fld);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void al(int var1) {
		for (aj var2 = (aj)this.ag_fld.aw(); var2 != null; var2 = (aj)na.iy(this.ag_fld)) {
			var2.af(var1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj ah() {
		return (aj)(aj)this.ag_fld.aw();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj aw() {
		return (aj)(aj)na.iy(this.ag_fld);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	void aj(br var1) {
		var1.gy();
		var1.ak();
		vw var2 = this.ak_fld.ak_fld.hw_fld;
		if (var2 == this.ak_fld.ak_fld) {
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
				this.ar(var1, var2, var3);
				return;
			}

			int var4 = this.av_fld - this.az_fld;
			this.ar(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.az_fld += var4;
			rk(this);
			br var5 = (br)this.ak_fld.aw();
			synchronized (var5) {
				int var7 = var5.ag(this);
				if (var7 < 0) {
					var5.ak_fld = 0;
					this.aj(var5);
				} else {
					var5.ak_fld = var7;
					this.av(var5.hw_fld, var5);
				}
			}

			if (var3 == 0) {
				return;
			}
		}

		this.ar(var1, var2, var3);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bs() {
		return (aj)(aj)na.iy(this.ag_fld);
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
			rk(this);
			br var3 = (br)this.ak_fld.aw();
			synchronized (var3) {
				int var5 = var3.ag(this);
				if (var5 < 0) {
					var3.ak_fld = 0;
					this.aj(var3);
				} else {
					var3.ak_fld = var5;
					this.av(var3.hw_fld, var3);
				}
			}

			if (var1 == 0) {
				return;
			}
		}

		this.al(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	void ar(int[] var1, int var2, int var3) {
		for (aj var4 = (aj)this.ag_fld.aw(); var4 != null; var4 = (aj)na.iy(this.ag_fld)) {
			aj.vl(var4, var1, var2, var3);
		}
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
			rk(this);
			br var3 = (br)this.ak_fld.aw();
			synchronized (var3) {
				int var5 = var3.ag(this);
				if (var5 < 0) {
					var3.ak_fld = 0;
					this.aj(var3);
				} else {
					var3.ak_fld = var5;
					this.av(var3.hw_fld, var3);
				}
			}

			if (var1 == 0) {
				return;
			}
		}

		this.al(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ax(aj var1) {
		this.ag_fld.av(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void an(aj var1) {
		var1.gy();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void aa(aj var1) {
		var1.gy();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ai(aj var1) {
		var1.gy();
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "()Lna;"
	)
	public na fe() {
		return this.ag_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bo(int var1) {
		for (aj var2 = (aj)this.ag_fld.aw(); var2 != null; var2 = (aj)na.iy(this.ag_fld)) {
			var2.af(var1);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void am() {
		if (this.az_fld > 0) {
			for (br var1 = (br)this.ak_fld.aw(); var1 != null; var1 = (br)na.iy(this.ak_fld)) {
				var1.ak_fld = var1.ak_fld - this.az_fld;
			}

			this.av_fld = this.av_fld - this.az_fld;
			this.az_fld = 0;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ad() {
		if (this.az_fld > 0) {
			for (br var1 = (br)this.ak_fld.aw(); var1 != null; var1 = (br)na.iy(this.ak_fld)) {
				var1.ak_fld = var1.ak_fld - this.az_fld;
			}

			this.av_fld = this.av_fld - this.az_fld;
			this.az_fld = 0;
		}
	}

	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public void tg(aj var1) {
		this.ak(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lbr;)V"
	)
	void ao(vw var1, br var2) {
		while (var1 != this.ak_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hw_fld;
		}

		na.ak(var2, var1);
		this.av_fld = ((br)this.ak_fld.ak_fld.hw_fld).ak_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lbr;)V"
	)
	void ab(vw var1, br var2) {
		while (var1 != this.ak_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hw_fld;
		}

		na.ak(var2, var1);
		this.av_fld = ((br)this.ak_fld.ak_fld.hw_fld).ak_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lbr;)V"
	)
	void ap(vw var1, br var2) {
		while (var1 != this.ak_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hw_fld;
		}

		na.ak(var2, var1);
		this.av_fld = ((br)this.ak_fld.ak_fld.hw_fld).ak_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lbr;)V"
	)
	void at(vw var1, br var2) {
		while (var1 != this.ak_fld.ak_fld && ((br)var1).ak_fld <= var2.ak_fld) {
			var1 = var1.hw_fld;
		}

		na.ak(var2, var1);
		this.av_fld = ((br)this.ak_fld.ak_fld.hw_fld).ak_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj br() {
		return (aj)(aj)na.iy(this.ag_fld);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	void bm(br var1) {
		var1.gy();
		var1.ak();
		vw var2 = this.ak_fld.ak_fld.hw_fld;
		if (var2 == this.ak_fld.ak_fld) {
			this.av_fld = -1;
		} else {
			this.av_fld = ((br)var2).ak_fld;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	void ae(br var1) {
		var1.gy();
		var1.ak();
		vw var2 = this.ak_fld.ak_fld.hw_fld;
		if (var2 == this.ak_fld.ak_fld) {
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
		return (aj)(aj)this.ag_fld.aw();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bz() {
		return (aj)(aj)this.ag_fld.aw();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ag(aj var1) {
		var1.gy();
	}

	public ar() {
		this.ak_fld = new na();
		this.az_fld = 0;
		this.av_fld = -1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int bk() {
		return 0;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bh() {
		return (aj)(aj)na.iy(this.ag_fld);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void au(aj var1) {
		this.ag_fld.av(var1);
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
				this.ar(var1, var2, var3);
				return;
			}

			int var4 = this.av_fld - this.az_fld;
			this.ar(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.az_fld += var4;
			rk(this);
			br var5 = (br)this.ak_fld.aw();
			synchronized (var5) {
				int var7 = var5.ag(this);
				if (var7 < 0) {
					var5.ak_fld = 0;
					this.aj(var5);
				} else {
					var5.ak_fld = var7;
					this.av(var5.hw_fld, var5);
				}
			}

			if (var3 == 0) {
				return;
			}
		}

		this.ar(var1, var2, var3);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	void bf(int[] var1, int var2, int var3) {
		for (aj var4 = (aj)this.ag_fld.aw(); var4 != null; var4 = (aj)na.iy(this.ag_fld)) {
			aj.vl(var4, var1, var2, var3);
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
			rk(this);
			br var3 = (br)this.ak_fld.aw();
			synchronized (var3) {
				int var5 = var3.ag(this);
				if (var5 < 0) {
					var3.ak_fld = 0;
					this.aj(var3);
				} else {
					var3.ak_fld = var5;
					this.av(var3.hw_fld, var3);
				}
			}

			if (var1 == 0) {
				return;
			}
		}

		this.al(var1);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bx(int var1) {
		for (aj var2 = (aj)this.ag_fld.aw(); var2 != null; var2 = (aj)na.iy(this.ag_fld)) {
			var2.af(var1);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ay() {
		return 0;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bp(int var1) {
		for (aj var2 = (aj)this.ag_fld.aw(); var2 != null; var2 = (aj)na.iy(this.ag_fld)) {
			var2.af(var1);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bt(int var1) {
		for (aj var2 = (aj)this.ag_fld.aw(); var2 != null; var2 = (aj)na.iy(this.ag_fld)) {
			var2.af(var1);
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lar;Lbr;)V"
	)
	public static void fq(ar var0, br var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.gy();
		var1.ak();
		vw var2 = var0.ak_fld.ak_fld.hw_fld;
		if (var2 == var0.ak_fld.ak_fld) {
			var0.av_fld = -1;
		} else {
			var0.av_fld = ((br)var2).ak_fld;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void az() {
		if (this.av_fld > 0) {
			for (br var1 = (br)this.ag_fld.dj(); var1 != null; var1 = (br)na.iy(this.ag_fld)) {
				var1.ak_fld = var1.ak_fld - this.av_fld;
			}

			this.av_fld = this.az_fld - this.av_fld;
			this.az_fld = 0;
		}
	}
}
