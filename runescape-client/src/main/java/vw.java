import net.runelite.api.Node;
import net.runelite.api.annotations.Export;
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
	public long hc_long;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	public vw hw_fld;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	public vw hg_fld;

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ge() {
		if (this.hg_fld != null) {
			this.hg_fld.hw_fld = this.hw_fld;
			this.hw_fld.hg_fld = this.hg_fld;
			this.hw_fld = null;
			this.hg_fld = null;
		}
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void pz_void() {
		this.gy();
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hf_void() {
	}

	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "(Lda;Lbb;)V"
	)
	public static void xi(da var0, bb var1) {
		var0.cg_fld.ag(var1);
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public static void mf(uo var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ac_fld = null;
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gy() {
		this.jy();
		if (this.hg_fld != null) {
			this.hg_fld.hw_fld = this.hw_fld;
			this.hw_fld.hg_fld = this.hg_fld;
			this.hw_fld = null;
			this.hg_fld = null;
		}
	}

	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw getNext() {
		return this.hw_fld;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean mc() {
		return this.hg_fld != null;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gz() {
		if (this.hg_fld != null) {
			this.hg_fld.hw_fld = this.hw_fld;
			this.hw_fld.hg_fld = this.hg_fld;
			this.hw_fld = null;
			this.hg_fld = null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)Z"
	)
	public static boolean an(rg var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return 0.01F == var0.ah_fld.az_fld.bi_fld;
		}
	}

	public vw() {
	}

	@ObfuscatedName("getHash")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Export("getHash")
	@Override
	public long getHash() {
		return this.hc_long;
	}

	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw getPrevious() {
		return this.hg_fld;
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gw() {
		if (this.hg_fld != null) {
			this.hg_fld.hw_fld = this.hw_fld;
			this.hw_fld.hg_fld = this.hg_fld;
			this.hw_fld = null;
			this.hg_fld = null;
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void jy() {
		this.hf_void();
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gx() {
		if (this.hg_fld != null) {
			this.hg_fld.hw_fld = this.hw_fld;
			this.hw_fld.hg_fld = this.hg_fld;
			this.hw_fld = null;
			this.hg_fld = null;
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean mi() {
		return this.hg_fld != null;
	}
}
