import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ax")
public class ax {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ah_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld = 2;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;

	ax() {
		this.ae_fld = new int[2];
		this.ah_fld = new int[2];
		this.ae_fld[0] = 0;
		this.ae_fld[1] = 65535;
		this.ah_fld[0] = 0;
		this.ah_fld[1] = 65535;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	final int ai(int var1) {
		if (this.af_fld >= this.aw_fld) {
			this.ar_fld = this.ah_fld[this.ay_fld++] << 15;
			if (this.ay_fld >= this.av_fld) {
				this.ay_fld = this.av_fld - 1;
			}

			this.aw_fld = (int)(this.ae_fld[this.ay_fld] / 65536.0 * var1);
			if (this.aw_fld > this.af_fld) {
				this.as_fld = ((this.ah_fld[this.ay_fld] << 15) - this.ar_fld) / (this.aw_fld - this.af_fld);
			}
		}

		this.ar_fld = this.ar_fld + this.as_fld;
		this.af_fld++;
		return this.ar_fld - this.as_fld >> 15;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	final int an(int var1) {
		if (this.af_fld >= this.aw_fld) {
			this.ar_fld = this.ah_fld[this.ay_fld++] << 15;
			if (this.ay_fld >= this.av_fld) {
				this.ay_fld = this.av_fld - 1;
			}

			this.aw_fld = (int)(this.ae_fld[this.ay_fld] / 65536.0 * var1);
			if (this.aw_fld > this.af_fld) {
				this.as_fld = ((this.ah_fld[this.ay_fld] << 15) - this.ar_fld) / (this.aw_fld - this.af_fld);
			}
		}

		this.ar_fld = this.ar_fld + this.as_fld;
		this.af_fld++;
		return this.ar_fld - this.as_fld >> 15;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lax;Lxi;)V"
	)
	public static void jj(ax var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = var1.cg();
		var0.ae_fld = new int[var0.av_fld];
		var0.ah_fld = new int[var0.av_fld];

		for (int var2 = 0; var2 < var0.av_fld; var2++) {
			var0.ae_fld[var2] = xi.tx(var1, 2103363263);
			var0.ah_fld[var2] = xi.tx(var1, 485075583);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void az() {
		this.aw_fld = 0;
		this.ay_fld = 0;
		this.as_fld = 0;
		this.ar_fld = 0;
		this.af_fld = 0;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Lax;Lxi;)V"
	)
	public static void fc(ax var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld = var1.cg();
			var0.ae_fld = new int[var0.av_fld];
			var0.ah_fld = new int[var0.av_fld];

			for (int var2 = 0; var2 < var0.av_fld; var2++) {
				var0.ae_fld[var2] = xi.tx(var1, 1697176982);
				var0.ah_fld[var2] = xi.tx(var1, 1696490726);
			}
		}
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(Lax;I)I"
	)
	public static int wq(ax var0, int var1) {
		if (var0.af_fld >= var0.aw_fld) {
			var0.ar_fld = var0.ah_fld[var0.ay_fld++] << 15;
			if (var0.ay_fld >= var0.av_fld) {
				var0.ay_fld = var0.av_fld - 1;
			}

			var0.aw_fld = (int)(var0.ae_fld[var0.ay_fld] / 65536.0 * var1);
			if (var0.aw_fld > var0.af_fld) {
				var0.as_fld = ((var0.ah_fld[var0.ay_fld] << 15) - var0.ar_fld) / (var0.aw_fld - var0.af_fld);
			}
		}

		var0.ar_fld = var0.ar_fld + var0.as_fld;
		var0.af_fld++;
		return var0.ar_fld - var0.as_fld >> 15;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	final int av(int var1) {
		if (this.af_fld >= this.aw_fld) {
			this.ar_fld = this.ah_fld[this.ay_fld++] << 15;
			if (this.ay_fld >= this.av_fld) {
				this.ay_fld = this.av_fld - 1;
			}

			this.aw_fld = (int)(this.ae_fld[this.ay_fld] / 65536.0 * var1);
			if (this.aw_fld > this.af_fld) {
				this.as_fld = ((this.ah_fld[this.ay_fld] << 15) - this.ar_fld) / (this.aw_fld - this.af_fld);
			}
		}

		this.ar_fld = this.ar_fld + this.as_fld;
		this.af_fld++;
		return this.ar_fld - this.as_fld >> 15;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void ak(xi var1) {
		this.az_fld = var1.cg();
		this.ak_fld = var1.co();
		this.ag_fld = var1.co();
		this.ae(var1);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lax;Lxi;)V"
	)
	public static void bz(ax var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld = var1.cg();
			var0.ae_fld = new int[var0.av_fld];
			var0.ah_fld = new int[var0.av_fld];

			for (int var2 = 0; var2 < var0.av_fld; var2++) {
				var0.ae_fld[var2] = xi.tx(var1, 2076795166);
				var0.ah_fld[var2] = xi.tx(var1, 1782205730);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void ag(xi var1) {
		this.az_fld = var1.cg();
		this.ak_fld = var1.co();
		this.ag_fld = var1.co();
		this.ae(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void ah(xi var1) {
		this.av_fld = var1.cg();
		this.ae_fld = new int[this.av_fld];
		this.ah_fld = new int[this.av_fld];

		for (int var2 = 0; var2 < this.av_fld; var2++) {
			this.ae_fld[var2] = xi.tx(var1, 1542840078);
			this.ah_fld[var2] = xi.tx(var1, 1326172423);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void aw(xi var1) {
		this.av_fld = var1.cg();
		this.ae_fld = new int[this.av_fld];
		this.ah_fld = new int[this.av_fld];

		for (int var2 = 0; var2 < this.av_fld; var2++) {
			this.ae_fld[var2] = xi.tx(var1, 1413763190);
			this.ah_fld[var2] = xi.tx(var1, 442283038);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void al() {
		this.aw_fld = 0;
		this.ay_fld = 0;
		this.as_fld = 0;
		this.ar_fld = 0;
		this.af_fld = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void au() {
		this.aw_fld = 0;
		this.ay_fld = 0;
		this.as_fld = 0;
		this.ar_fld = 0;
		this.af_fld = 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	final int ax(int var1) {
		if (this.af_fld >= this.aw_fld) {
			this.ar_fld = this.ah_fld[this.ay_fld++] << 15;
			if (this.ay_fld >= this.av_fld) {
				this.ay_fld = this.av_fld - 1;
			}

			this.aw_fld = (int)(this.ae_fld[this.ay_fld] / 65536.0 * var1);
			if (this.aw_fld > this.af_fld) {
				this.as_fld = ((this.ah_fld[this.ay_fld] << 15) - this.ar_fld) / (this.aw_fld - this.af_fld);
			}
		}

		this.ar_fld = this.ar_fld + this.as_fld;
		this.af_fld++;
		return this.ar_fld - this.as_fld >> 15;
	}

	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILjava/lang/Object;)V"
	)
	public static void yb(sl var0, int var1, Object var2) {
		if (var0.ag_fld == yq.ak_fld) {
			var0.aw_fld[var1] = (Integer)var2;
		} else if (var0.ag_fld == yq.ag_fld) {
			var0.ay_fld[var1] = (Long)var2;
		} else {
			var0.as_fld[var1] = var2;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void af(xi var1) {
		this.az_fld = var1.cg();
		this.ak_fld = var1.co();
		this.ag_fld = var1.co();
		this.ae(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void ae(xi var1) {
		this.av_fld = var1.cg();
		this.ae_fld = new int[this.av_fld];
		this.ah_fld = new int[this.av_fld];

		for (int var2 = 0; var2 < this.av_fld; var2++) {
			this.ae_fld[var2] = xi.tx(var1, 1025431798);
			this.ah_fld[var2] = xi.tx(var1, 1902875992);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void as(xi var1) {
		this.ak_fld = var1.em();
		this.ah_fld = new int[this.ay_fld];
		this.ah_fld = new int[this.ag_fld];

		for (int var2 = 0; var2 < this.av_fld; var2++) {
			this.ae_fld[var2] = xi.tx(var1, 2103363263);
			this.ae_fld[var2] = xi.tx(var1, 485075583);
		}
	}
}
