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
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld = 50;
	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1915749819
	)
	public int ve_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1957496973
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

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void kd(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.az(var1, var2, var3, var4, var5, var6, var7, var8, var9, -2082201116);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V"
	)
	public void ak(int var1, int var2, int var3) {
		if (this.av_fld.ah((byte)15) != 0 && var2 != 0) {
			this.az(0, var1, 0, 0, 0, 0, var2, var3, false, -2082201116);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V"
	)
	public void az(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10) {
		this.sg(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		if (this.ag_fld >= 50) {
			this.mq(var1, var2, var3, var4, var5, var6, var7, var8, var9);
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
					this.mq(var1, var2, var3, var4, var5, var6, var7, var8, var9);
					return;
				}

				if (var10 >= -1481585721) {
					this.mq(var1, var2, var3, var4, var5, var6, var7, var8, var9);
					return;
				}
			}

			this.mq(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lrs;IIIIIIIII)V"
	)
	public static void bg(rs var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.av_fld.ae(-1165491038) != 0) {
			if (var9 == 2054105620) {
				return;
			}

			if (var7 > 0) {
				var0.az(var1, var2, var3, var4, var5, var6, var7, var8, false, -1878741494);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void av(int var1) {
		this.ag_fld--;

		for (int var3 = var1; var3 < this.ag_fld; var3++) {
			rj.oa(this.az_fld[var3], this.az_fld[1 + var3], 1482267716);
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ah() {
		return this.ag_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ad() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)V"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		return this.ag_fld;
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aa(int var1) {
		this.ag_fld -= -1644461153;

		for (int var2 = var1; var2 < this.ag_fld; var2++) {
			rj.oa(this.az_fld[var2], this.az_fld[1 + var2], -544954472);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean aw() {
		return this.ag_fld >= 50;
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void mq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (this.ve_fld + 1 == this.ag_fld) {
			boolean var10;
			if (var3 == 0 && var4 == 0 && var5 == 0) {
				SoundEffectPlayed var12 = new SoundEffectPlayed(da.om_fld);
				var12.setSoundId(var2);
				var12.setDelay(var8);
				og.ci_fld.getCallbacks().post(var12);
				var10 = var12.isConsumed();
			} else {
				AreaSoundEffectPlayed var11 = new AreaSoundEffectPlayed(da.om_fld);
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ai(int var1) {
		this.ag_fld--;

		for (int var2 = var1; var2 < this.ag_fld; var2++) {
			rj.oa(this.az_fld[var2], this.az_fld[1 + var2], 803030571);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aq() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void sg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.ve_fld = this.ag_fld;
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
		descriptor = "(II)Lrj;"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	public void ax(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (this.ag_fld < 50) {
			if ((var5 <= 0 || this.av_fld.ae(1118328275) != 0) && (0 != var5 || this.av_fld.ah((byte)82) != 0)) {
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ap() {
		return this.ag_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ac() {
		return this.ag_fld >= 480020528;
	}

	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void rh(int var1) {
		this.av(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lrj;"
	)
	rj aj(int var1) {
		return this.az_fld[var1];
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean at() {
		return this.ag_fld >= 50;
	}
}
