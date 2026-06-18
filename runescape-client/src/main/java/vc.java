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
	public vc fn_vc;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	public vc ft_fld;

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void me() {
		this.vi();
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)V"
	)
	public static void io(vc var0) {
		if (var0.ft_fld != null) {
			var0.ft_fld.fn_vc = var0.fn_vc;
			var0.fn_vc.ft_fld = var0.ft_fld;
			var0.fn_vc = null;
			var0.ft_fld = null;
		}
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)V"
	)
	public static void ye(vc var0) {
		if (var0.ft_fld != null) {
			var0.ft_fld.fn_vc = var0.fn_vc;
			var0.fn_vc.ft_fld = var0.ft_fld;
			var0.fn_vc = null;
			var0.ft_fld = null;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc kd_vc() {
		return this.fn_vc;
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mq_void() {
		if (this.ft_fld != null) {
			this.ft_fld.fn_vc = this.fn_vc;
			this.fn_vc.ft_fld = this.ft_fld;
			this.fn_vc = null;
			this.ft_fld = null;
		}
	}

	public vc() {
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void vi() {
		if (this.ft_fld != null) {
			this.ft_fld.fn_vc = this.fn_vc;
			this.fn_vc.ft_fld = this.ft_fld;
			this.fn_vc = null;
			this.ft_fld = null;
		}
	}
}
