import net.runelite.api.Node;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vw")
@Implements({"Node"})
public class vw implements Node {
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long hc_fld;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	public vw hg_vw;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	public vw hw_fld;

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ge_void() {
		if (this.hw_fld != null) {
			this.hw_fld.hg_vw = this.hg_vw;
			this.hg_vw.hw_fld = this.hw_fld;
			this.hg_vw = null;
			this.hw_fld = null;
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Z"
	)
	public static boolean kb(vw var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.hw_fld != null;
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void xp_void() {
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw getNext() {
		return this.hg_vw;
	}

	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void xh() {
		this.gy_void();
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gy_void() {
		this.fo_void();
		if (this.hw_fld != null) {
			this.hw_fld.hg_vw = this.hg_vw;
			this.hg_vw.hw_fld = this.hw_fld;
			this.hg_vw = null;
			this.hw_fld = null;
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gz() {
		if (this.hw_fld != null) {
			this.hw_fld.hg_vw = this.hg_vw;
			this.hg_vw.hw_fld = this.hw_fld;
			this.hg_vw = null;
			this.hw_fld = null;
		}
	}

	@ObfuscatedName("getHash")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Override
	public long getHash() {
		return this.hc_fld;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw getPrevious() {
		return this.hw_fld;
	}

	public vw() {
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fo_void() {
		this.xp_void();
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gw() {
		if (this.hw_fld != null) {
			this.hw_fld.hg_vw = this.hg_vw;
			this.hg_vw.hw_fld = this.hw_fld;
			this.hg_vw = null;
			this.hw_fld = null;
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gx() {
		if (this.hw_fld != null) {
			this.hw_fld.hg_vw = this.hg_vw;
			this.hg_vw.hw_fld = this.hw_fld;
			this.hg_vw = null;
			this.hw_fld = null;
		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean mc_boolean() {
		return this.hg_vw != null;
	}
}
