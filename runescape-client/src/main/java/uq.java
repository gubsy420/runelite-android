import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uq")
public class uq {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	public uq ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	public uq av_fld;

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq mn() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		if (this.ae_fld != null) {
			this.ae_fld.av_fld = this.av_fld;
			this.av_fld.ae_fld = this.ae_fld;
			this.av_fld = null;
			this.ae_fld = null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		if (this.ae_fld != null) {
			this.ae_fld.av_fld = this.av_fld;
			this.av_fld.ae_fld = this.ae_fld;
			this.av_fld = null;
			this.ae_fld = null;
		}
	}

	public uq() {
	}

	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq sf() {
		return this.av_fld;
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mr() {
		this.ak();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		if (this.ae_fld != null) {
			this.ae_fld.av_fld = this.av_fld;
			this.av_fld.ae_fld = this.ae_fld;
			this.av_fld = null;
			this.ae_fld = null;
		}
	}
}
