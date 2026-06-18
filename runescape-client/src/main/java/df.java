import java.io.IOException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("df")
public class df {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	jv au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	jv ax_fld;
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
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	jv ah_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1590269635
	)
	int af_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1296356215
	)
	int as_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1375883479
	)
	int ag_fld = 0;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1945812529
	)
	int ar_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1981682415
	)
	int al_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1329156629
	)
	int aw_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi az_fld = new xi(5000);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	jv an_fld;
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void af() {
		this.ak_fld.ag();
		this.ag_fld = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ak(int var1) {
		this.ak_fld.ag();
		this.ag_fld = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	final void ag(byte var1) throws IOException {
		if (null != this.aa_fld && this.ag_fld > 0) {
			this.az_fld.au_fld = 0;

			while (true) {
				jm var2 = (jm)this.ak_fld.ah();
				if (var2 == null) {
					break;
				}

				if (var2.as_fld > this.az_fld.al_fld.length - -661977895 * this.az_fld.au_fld) {
					if (var1 <= 7) {
						return;
					}
					break;
				}

				this.az_fld.cy(var2.ay_fld.al_fld, 0, 1810843567 * var2.as_fld);
				this.ag_fld = this.ag_fld - var2.as_fld;
				var2.gy();
				var2.ay_fld.ak(-1569172296);
				jm.ga(var2, -1028140513);
			}

			this.aa_fld.ae(this.az_fld.al_fld, 0, -661977895 * this.az_fld.au_fld, (byte)-81);
			this.ar_fld = 0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V"
	)
	public final void az(jm var1) {
		no.dx(this.ak_fld, var1);
		var1.as_fld = 1481414135 * var1.ay_fld.au_fld;
		var1.ay_fld.au_fld = 0;
		this.ag_fld = this.ag_fld + var1.as_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae() {
		if (this.aa_fld != null) {
			this.aa_fld.ah((byte)86);
			this.aa_fld = null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void av() {
		this.aa_fld = null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lua;"
	)
	ua ah() {
		return this.aa_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V"
	)
	void aw(ua var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void as() {
		this.ak_fld.ag();
		this.ag_fld = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
		this.aa_fld = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void ay() throws IOException {
		if (null != this.aa_fld && this.ag_fld > 0) {
			this.az_fld.au_fld = 0;

			while (true) {
				jm var1 = (jm)this.ak_fld.ah();
				if (var1 == null || var1.as_fld > this.az_fld.al_fld.length - -661977895 * this.az_fld.au_fld) {
					this.aa_fld.ae(this.az_fld.al_fld, 0, -661977895 * this.az_fld.au_fld, (byte)-35);
					this.ar_fld = 0;
					break;
				}

				this.az_fld.cy(var1.ay_fld.al_fld, 0, 1810843567 * var1.as_fld);
				this.ag_fld = this.ag_fld - var1.as_fld;
				var1.gy();
				var1.ay_fld.ak(-1569172296);
				jm.ga(var1, 264569260);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljm;)V"
	)
	public final void al(jm var1) {
		no.dx(this.ak_fld, var1);
		var1.as_fld = 1481414135 * var1.ay_fld.au_fld;
		var1.ay_fld.au_fld = 0;
		this.ag_fld = this.ag_fld + var1.as_fld;
	}

	df() {
		this.ae_fld = new xj(40000);
		this.ah_fld = null;
		this.aw_fld = 0;
		this.ay_fld = true;
		this.as_fld = 0;
		this.ar_fld = 0;
		this.af_fld = 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ax() {
		if (this.aa_fld != null) {
			this.aa_fld.ah((byte)112);
			this.aa_fld = null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
	)
	void ao(ua var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "(Ldf;)V"
	)
	public static void rm(df var0) {
		var0.ak_fld.ag();
		var0.ag_fld = 0;
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
		no.dx(this.ak_fld, var1);
		var1.as_fld = 1481414135 * var1.ay_fld.au_fld;
		var1.ay_fld.au_fld = 0;
		this.ag_fld = this.ag_fld + var1.as_fld;
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljt;"
	)
	public static jt[] ak_Arrjt(int var0) {
		return new jt[]{
			jt.ak_fld, jt.ag_fld, jt.az_fld, jt.av_fld, jt.ae_fld, jt.ah_fld, jt.aw_fld, jt.ay_fld, jt.as_fld, jt.ar_fld, jt.af_fld, jt.al_fld, jt.au_fld
		};
	}
}
