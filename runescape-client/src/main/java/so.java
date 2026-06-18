import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("so")
public class so extends ao {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 209066057
	)
	int bk_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljavax/sound/sampled/SourceDataLine;"
	)
	SourceDataLine af_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Ljavax/sound/sampled/AudioFormat;"
	)
	AudioFormat bh_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] bj_fld;

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void bb() {
		if (this.af_fld != null) {
			this.af_fld.close();
			this.af_fld = null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void af(int var1) {
		this.bh_fld = new AudioFormat(22050.0F, 16, jx.al_fld ? 2 : 1, true, false);
		this.bj_fld = new byte[512 << (jx.al_fld ? 2 : 1)];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public void al(int var1, int var2) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.bh_fld, var1 << (jx.al_fld ? 2 : 1));
			this.af_fld = (SourceDataLine)AudioSystem.getLine(var3);
			this.af_fld.open();
			this.af_fld.start();
			this.bk_fld = var1;
		} catch (LineUnavailableException var4) {
			if (hm.ag(var1) != 1) {
				this.al(wp.ay(var1), 597926212);
			} else {
				this.af_fld = null;
				throw var4;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	protected int au(byte var1) {
		return this.bk_fld - (this.af_fld.available() >> (jx.al_fld ? 2 : 1));
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	@Override
	protected void aa(byte var1) {
		this.af_fld.flush();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	protected void an(int var1) {
		if (this.af_fld != null) {
			this.af_fld.close();
			this.af_fld = null;
		}
	}

	so() {
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void bo() {
		this.bh_fld = new AudioFormat(22050.0F, 16, jx.al_fld ? 2 : 1, true, false);
		this.bj_fld = new byte[512 << (jx.al_fld ? 2 : 1)];
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void bp(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.bh_fld, var1 << (jx.al_fld ? 2 : 1));
			this.af_fld = (SourceDataLine)AudioSystem.getLine(var2);
			this.af_fld.open();
			this.af_fld.start();
			this.bk_fld = -356027817 * var1;
		} catch (LineUnavailableException var3) {
			if (hm.ag(var1) != 1) {
				this.al(wp.ay(var1), -1396912507);
			} else {
				this.af_fld = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int bc() {
		return 1946534802 * this.bk_fld - (this.af_fld.available() >> (jx.al_fld ? 2 : 1));
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void bv(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.bh_fld, var1 << (jx.al_fld ? 2 : 1));
			this.af_fld = (SourceDataLine)AudioSystem.getLine(var2);
			this.af_fld.open();
			this.af_fld.start();
			this.bk_fld = -1878265777 * var1;
		} catch (LineUnavailableException var3) {
			if (hm.ag(var1) != 1) {
				this.al(wp.ay(var1), 1459501652);
			} else {
				this.af_fld = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void bu(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.bh_fld, var1 << (jx.al_fld ? 2 : 1));
			this.af_fld = (SourceDataLine)AudioSystem.getLine(var2);
			this.af_fld.open();
			this.af_fld.start();
			this.bk_fld = var1;
		} catch (LineUnavailableException var3) {
			if (hm.ag(var1) != 1) {
				this.al(wp.ay(var1), -1896237077);
			} else {
				this.af_fld = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void bw() {
		short var1 = 512;
		if (jx.al_fld) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.aq_fld[var2];
			if (0 != (8388608 + var3 & 0xFF000000)) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.bj_fld[var2 * 2] = (byte)(var3 >> 8);
			this.bj_fld[1 + 2 * var2] = (byte)(var3 >> 16);
		}

		this.af_fld.write(this.bj_fld, 0, var1 << 1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int bn() {
		return this.bk_fld - (this.af_fld.available() >> (jx.al_fld ? 2 : 1));
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void bi(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.bh_fld, var1 << (jx.al_fld ? 2 : 1));
			this.af_fld = (SourceDataLine)AudioSystem.getLine(var2);
			this.af_fld.open();
			this.af_fld.start();
			this.bk_fld = var1;
		} catch (LineUnavailableException var3) {
			if (hm.ag(var1) != 1) {
				this.al(wp.ay(var1), -1274573428);
			} else {
				this.af_fld = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void cq() {
		this.af_fld.flush();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void ba() {
		int var1 = -1910162534;
		if (jx.al_fld) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.aq_fld[var2];
			if (0 != (-383002983 + var3 & -2087342256)) {
				var3 = -324755525 ^ var3 >> 31;
			}

			this.bj_fld[var2 * 2] = (byte)(var3 >> 8);
			this.bj_fld[1 + 2 * var2] = (byte)(var3 >> 16);
		}

		this.af_fld.write(this.bj_fld, 0, var1 << 1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void bt(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.bh_fld, var1 << (jx.al_fld ? 2 : 1));
			this.af_fld = (SourceDataLine)AudioSystem.getLine(var2);
			this.af_fld.open();
			this.af_fld.start();
			this.bk_fld = var1;
		} catch (LineUnavailableException var3) {
			if (hm.ag(var1) != 1) {
				this.al(wp.ay(var1), 1997793727);
			} else {
				this.af_fld = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void bg() {
		if (this.af_fld != null) {
			this.af_fld.close();
			this.af_fld = null;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void bq() {
		short var1 = 512;
		if (jx.al_fld) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.aq_fld[var2];
			if (0 != (8388608 + var3 & 0xFF000000)) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.bj_fld[var2 * 2] = (byte)(var3 >> 8);
			this.bj_fld[1 + 2 * var2] = (byte)(var3 >> 16);
		}

		this.af_fld.write(this.bj_fld, 0, var1 << 1);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void cd() {
		this.af_fld.flush();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void cc() {
		this.af_fld.flush();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void ax() {
		short var1 = 512;
		if (jx.al_fld) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.aq_fld[var2];
			if (0 != (8388608 + var3 & 0xFF000000)) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.bj_fld[var2 * 2] = (byte)(var3 >> 8);
			this.bj_fld[1 + 2 * var2] = (byte)(var3 >> 16);
		}

		this.af_fld.write(this.bj_fld, 0, var1 << 1);
	}
}
