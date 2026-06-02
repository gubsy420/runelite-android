import java.io.IOException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.AreaSoundEffectPlayed;
import net.runelite.api.events.SoundEffectPlayed;

@ObfuscatedName("rs")
public class rs {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	rm av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lrj;"
	)
	rj[] az_fld;
	@ObfuscatedGetter(
		intValue = -1915749819
	)
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cl_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld = 50;
	@ObfuscatedGetter(
		intValue = 1957496973
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld = 0;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ar(int var1, int var2, int var3) {
		if (this.av_fld.ah((byte)44) != 0 && var2 != 0) {
			this.az(0, var1, 0, 0, 0, 0, var2, var3, false, -1885837590);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ak(int var1, int var2, int var3) {
		if (this.av_fld.ah((byte)15) != 0 && var2 != 0) {
			this.az(0, var1, 0, 0, 0, 0, var2, var3, false, -2082201116);
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void jf(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (this.cl_fld + 1 == this.ag_fld) {
			boolean var10;
			if (var3 == 0 && var4 == 0 && var5 == 0) {
				SoundEffectPlayed var12 = new SoundEffectPlayed(da.vt_fld);
				var12.setSoundId(var2);
				var12.setDelay(var8);
				og.ci_fld.getCallbacks().post(var12);
				var10 = var12.isConsumed();
			} else {
				AreaSoundEffectPlayed var11 = new AreaSoundEffectPlayed(da.vt_fld);
				var11.setSoundId(var2);
				var11.setSceneX(var3);
				var11.setSceneY(var4);
				var11.setRange(var5);
				var11.setDelay(var8);
				og.ci_fld.getCallbacks().post(var11);
				var10 = var11.isConsumed();
			}

			if (var10) {
				this.ag_fld = this.ag_fld * 1957496973 - 1;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V"
	)
	public void ag(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		if (this.av_fld.ae(-1165491038) != 0) {
			if (var9 == 2054105620) {
				return;
			}

			if (var7 > 0) {
				this.az(var1, var2, var3, var4, var5, var6, var7, var8, false, -1878741494);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V"
	)
	public void az(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10) {
		this.qw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		if (this.ag_fld >= 50) {
			this.jf(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		} else {
			if (var5 <= 0 || this.av_fld.ae(-1896910984) != 0) {
				if (0 != var5 || this.av_fld.ah((byte)-6) != 0) {
					this.az_fld[this.ag_fld].az_fld = var1;
					this.az_fld[this.ag_fld].ak_fld = null;
					this.az_fld[this.ag_fld].av_fld = var5 + (var3 << 16) + (var4 << 8);
					this.az_fld[this.ag_fld].aw_fld = var2;
					this.az_fld[this.ag_fld].ah_fld = var7;
					this.az_fld[this.ag_fld].ae_fld = var8;
					this.az_fld[this.ag_fld].ag_fld = var6;
					this.az_fld[this.ag_fld].ay_fld = var9;
					this.ag_fld++;
					this.jf(var1, var2, var3, var4, var5, var6, var7, var8, var9);
					return;
				}

				if (var10 >= -1481585721) {
					this.jf(var1, var2, var3, var4, var5, var6, var7, var8, var9);
					return;
				}
			}

			this.jf(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void av(int var1) {
		this.ag_fld--;

		for (int var3 = var1; var3 < this.ag_fld; var3++) {
			this.az_fld[var3].ak(this.az_fld[1 + var3]);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void an(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (this.ag_fld < 50) {
			if ((var5 <= 0 || this.av_fld.ae(1105347692) != 0) && (0 != var5 || this.av_fld.ah((byte)-48) != 0)) {
				this.az_fld[this.ag_fld].az_fld = var1;
				this.az_fld[this.ag_fld].ak_fld = null;
				this.az_fld[this.ag_fld].av_fld = var5 + (var3 << 16) + (var4 << 8);
				this.az_fld[this.ag_fld].aw_fld = var2;
				this.az_fld[this.ag_fld].ah_fld = var7;
				this.az_fld[this.ag_fld].ae_fld = var8;
				this.az_fld[this.ag_fld].ag_fld = var6;
				this.az_fld[this.ag_fld].ay_fld = var9;
				this.ag_fld++;
			}
		}
	}

	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "(Lzb;)V"
	)
	public static void up(zb var0) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ae(false);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ah() {
		return this.ag_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ae() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void as(int var1, int var2, int var3) {
		if (this.av_fld.ah((byte)80) != 0 && var2 != 0) {
			this.az(0, var1, 0, 0, 0, 0, var2, var3, false, -1951990127);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		return this.ag_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void af(int var1, int var2, int var3) {
		if (this.av_fld.ah((byte)117) != 0 && var2 != 0) {
			this.az(0, var1, 0, 0, 0, 0, var2, var3, false, -2096524090);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
		return this.ag_fld;
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void vi(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.az(var1, var2, var3, var4, var5, var6, var7, var8, var9, -2082201116);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public void au(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.av_fld.ae(734229821) != 0 && var7 > 0) {
			this.az(var1, var2, var3, var4, var5, var6, var7, var8, false, -1963554237);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public void al(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.av_fld.ae(396833523) != 0 && var7 > 0) {
			this.az(var1, var2, var3, var4, var5, var6, var7, var8, false, -1540271787);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ai(int var1) {
		this.ag_fld -= -1644461153;

		for (int var2 = var1; var2 < this.ag_fld; var2++) {
			this.az_fld[var2].ak(this.az_fld[1 + var2]);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aw() {
		return this.ag_fld >= 50;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aa(int var1) {
		this.ag_fld--;

		for (int var2 = var1; var2 < this.ag_fld; var2++) {
			this.az_fld[var2].ak(this.az_fld[1 + var2]);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aq() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void am() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lrj;"
	)
	rj ay(int var1) {
		return this.az_fld[var1];
	}

	public rs(rm var1) {
		this.az_fld = new rj[50];
		this.av_fld = var1;

		for (int var2 = 0; var2 < 50; var2++) {
			this.az_fld[var2] = new rj();
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void li(int var1) {
		this.av(var1);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lrs;IIIIIIIIZ)V"
	)
	public static void bb(rs var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (var0.ag_fld < 50) {
			if ((var5 <= 0 || var0.av_fld.ae(1118328275) != 0) && (0 != var5 || var0.av_fld.ah((byte)82) != 0)) {
				var0.az_fld[var0.ag_fld].az_fld = var1;
				var0.az_fld[var0.ag_fld].ak_fld = null;
				var0.az_fld[var0.ag_fld].av_fld = var5 + (var3 << 16) + (var4 << 8);
				var0.az_fld[var0.ag_fld].aw_fld = var2;
				var0.az_fld[var0.ag_fld].ah_fld = var7;
				var0.az_fld[var0.ag_fld].ae_fld = var8;
				var0.az_fld[var0.ag_fld].ag_fld = var6;
				var0.az_fld[var0.ag_fld].ay_fld = var9;
				var0.ag_fld++;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean at() {
		return this.ag_fld >= 50;
	}

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void qw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.cl_fld = this.ag_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ac() {
		return this.ag_fld >= 480020528;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Lzg;CII)Lzw;"
	)
	public static zw do_(zg var0, char var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.au(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lrj;"
	)
	rj aj(int var1) {
		return this.az_fld[var1];
	}
}
