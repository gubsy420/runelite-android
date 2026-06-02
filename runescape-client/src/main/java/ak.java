import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ak")
public class ak implements az {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lxi;"
	)
	@Override
	public xi av(xi var1) {
		xi var2 = new xi(100);
		this.ag(var1, var2);
		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lxi;"
	)
	@Override
	public xi ak(xi var1) {
		xi var2 = new xi(100);
		this.ag(var1, var2);
		return var2;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)V"
	)
	public static void cd(bt var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.jl(var1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;)V"
	)
	void ag(xi var1, xi var2) {
		as var3 = new as(var1);
		ae var4 = new ae(var3);
		long var5 = 0L;

		while (!var4.az(var3.ag(), as.oj(var3), var5)) {
			var5++;
		}

		var2.fn(var5);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lxi;"
	)
	@Override
	public xi az(xi var1) {
		xi var2 = new xi(100);
		this.ag(var1, var2);
		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;)V"
	)
	void ah(xi var1, xi var2) {
		as var3 = new as(var1);
		ae var4 = new ae(var3);
		long var5 = 0L;

		while (!var4.az(var3.ag(), as.oj(var3), var5)) {
			var5++;
		}

		var2.fn(var5);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;)V"
	)
	void ae(xi var1, xi var2) {
		as var3 = new as(var1);
		ae var4 = new ae(var3);
		long var5 = 0L;

		while (!var4.az(var3.ag(), as.oj(var3), var5)) {
			var5++;
		}

		var2.fn(var5);
	}

	public ak() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;)V"
	)
	void aw(xi var1, xi var2) {
		as var3 = new as(var1);
		ae var4 = new ae(var3);
		long var5 = 0L;

		while (!var4.az(var3.ag(), as.oj(var3), var5)) {
			var5++;
		}

		var2.fn(var5);
	}
}
