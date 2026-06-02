import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vc")
public class vc extends vw {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long fg_fld;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	public vc fn_fld;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	public vc ft_fld;

	public vc() {
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void kv_void() {
		this.mq_void();
	}

	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)V"
	)
	public static void tc(vc var0) {
		if (var0.ft_fld != null) {
			var0.ft_fld.fn_fld = var0.fn_fld;
			var0.fn_fld.ft_fld = var0.ft_fld;
			var0.fn_fld = null;
			var0.ft_fld = null;
		}
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(Lku;)I"
	)
	public static int xn(ku var0) {
		return var0.ad_fld;
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void md() {
		if (this.ft_fld != null) {
			this.ft_fld.fn_fld = this.fn_fld;
			this.fn_fld.ft_fld = this.ft_fld;
			this.fn_fld = null;
			this.ft_fld = null;
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc hx_vc() {
		return this.fn_fld;
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mk() {
		if (this.ft_fld != null) {
			this.ft_fld.fn_fld = this.fn_fld;
			this.fn_fld.ft_fld = this.ft_fld;
			this.fn_fld = null;
			this.ft_fld = null;
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mq_void() {
		if (this.ft_fld != null) {
			this.ft_fld.fn_fld = this.fn_fld;
			this.fn_fld.ft_fld = this.ft_fld;
			this.fn_fld = null;
			this.ft_fld = null;
		}
	}
}
