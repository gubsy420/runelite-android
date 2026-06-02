import java.io.IOException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("df")
public class df {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	jv an_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	jv au_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lyk;"
	)
	public yk av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	no ak_fld = new no();
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lxj;"
	)
	xj ae_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	jv ax_fld;
	@ObfuscatedGetter(
		intValue = 1590269635
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;
	@ObfuscatedGetter(
		intValue = -1296356215
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = 1375883479
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld = 0;
	@ObfuscatedGetter(
		intValue = -1945812529
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -1981682415
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = 1329156629
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi az_fld = new xi(5000);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	jv ah_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	ua aa_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bd_fld;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	static ua hi_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void ay() {
		this.ak_fld.ag();
		this.af_fld = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljm;)V"
	)
	public final void az(jm var1) {
		this.ak_fld.az(var1);
		var1.as_fld = 1481414135 * var1.ay_fld.au_fld;
		var1.ay_fld.au_fld = 0;
		this.af_fld = this.af_fld + var1.as_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ae() {
		if (this.aa_fld != null) {
			this.aa_fld.ah((byte)86);
			this.aa_fld = null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void av() {
		this.aa_fld = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
	)
	void aw(ua var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void af() {
		this.ak_fld.ag();
		this.af_fld = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
		this.aa_fld = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void as() throws IOException {
		if (null != this.aa_fld && this.af_fld > 0) {
			this.az_fld.au_fld = 0;

			while (true) {
				jm var1 = (jm)this.ak_fld.ah();
				if (var1 == null || var1.as_fld > this.az_fld.al_fld.length - -661977895 * this.az_fld.au_fld) {
					this.aa_fld.ae(this.az_fld.al_fld, 0, -661977895 * this.az_fld.au_fld, (byte)-35);
					this.ag_fld = 0;
					break;
				}

				xi.pm(this.az_fld, var1.ay_fld.al_fld, 0, var1.as_fld);
				this.af_fld = this.af_fld - var1.as_fld;
				var1.gy_void();
				var1.ay_fld.ak(-1569172296);
				var1.az();
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljm;)V"
	)
	public final void al(jm var1) {
		this.ak_fld.az(var1);
		var1.as_fld = 1481414135 * var1.ay_fld.au_fld;
		var1.ay_fld.au_fld = 0;
		this.af_fld = this.af_fld + var1.as_fld;
	}

	df() {
		this.ae_fld = new xj(40000);
		this.ax_fld = null;
		this.ar_fld = 0;
		this.ay_fld = true;
		this.al_fld = 0;
		this.ag_fld = 0;
		this.as_fld = 0;
	}

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)Laax;"
	)
	public static aax zc(rl var0) {
		return var0.az_fld;
	}

	@ObfuscatedName("yf")
	@ObfuscatedSignature(
		descriptor = "(Ldf;B)V"
	)
	public static void yf(df var0, byte var1) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var0.aa_fld && var0.af_fld > 0) {
			var0.az_fld.au_fld = 0;

			while (true) {
				jm var2 = (jm)var0.ak_fld.ah();
				if (var2 == null) {
					break;
				}

				if (var2.as_fld > var0.az_fld.al_fld.length - -661977895 * var0.az_fld.au_fld) {
					if (var1 <= 7) {
						return;
					}
					break;
				}

				xi.pm(var0.az_fld, var2.ay_fld.al_fld, 0, var2.as_fld);
				var0.af_fld = var0.af_fld - var2.as_fld;
				var2.gy_void();
				var2.ay_fld.ak(-1569172296);
				var2.az();
			}

			var0.aa_fld.ae(var0.az_fld.al_fld, 0, -661977895 * var0.az_fld.au_fld, (byte)-81);
			var0.ag_fld = 0;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
	)
	void ao(ua var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aa() {
		this.aa_fld = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void an() {
		if (this.aa_fld != null) {
			this.aa_fld.ah((byte)70);
			this.aa_fld = null;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		this.aa_fld = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void am() {
		this.aa_fld = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lua;"
	)
	ua ad() {
		return this.aa_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljm;)V"
	)
	public final void au(jm var1) {
		this.ak_fld.az(var1);
		var1.as_fld = 1481414135 * var1.ay_fld.au_fld;
		var1.ay_fld.au_fld = 0;
		this.af_fld = this.af_fld + var1.as_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
	)
	void ab(ua var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
	)
	void ap(ua var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("xd")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V"
	)
	public static void xd(df var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld.ag();
		var0.af_fld = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljt;"
	)
	public static jt[] ak_Arrjt(int var0) {
		return new jt[]{
			jt.ak_fld, jt.ag_fld, jt.az_fld, jt.av_fld, jt.ae_fld, jt.ah_fld, jt.aw_fld, jt.ay_fld, jt.as_fld, jt.ar_fld, jt.af_fld, jt.al_fld, jt.au_fld
		};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ak(int var1) {
		if (this.aa_fld != null) {
			this.aa_fld.ah((byte)86);
			this.aa_fld = null;
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ldf;)V"
	)
	public static void ky(df var0) {
		if (var0.aa_fld != null) {
			var0.aa_fld.ah((byte)112);
			var0.aa_fld = null;
		}
	}

	@ObfuscatedName("xl")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)Lua;"
	)
	public static ua xl(df var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aa_fld;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	final void ag(byte var1) throws IOException {
		if (null != this.aa_fld && 1375883479 * this.as_fld > 0) {
			this.az_fld.au_fld = 0;

			while (true) {
				jm var2 = (jm)this.ak_fld.at();
				if (var2 == null) {
					break;
				}

				if (var2.as_fld > this.az_fld.al_fld.length - -661977895 * this.az_fld.au_fld) {
					if (var1 <= 7) {
						return;
					}
					break;
				}

				xi.pm(this.az_fld, var2.ay_fld.al_fld, 0, var2.as_fld);
				this.ar_fld = this.aw_fld - var2.as_fld;
				var2.gx();
				var2.ay_fld.gl(-1569172296);
				var2.az();
			}

			this.aa_fld.ae(this.az_fld.al_fld, 0, -661977895 * this.az_fld.au_fld, (byte)-81);
			this.ar_fld = 0;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lua;"
	)
	ua ah(int var1) {
		return this.aa_fld;
	}
}
