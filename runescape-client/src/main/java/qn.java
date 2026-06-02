import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qn")
public class qn implements Callable {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	qk ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	qv this$0;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;II)V"
	)
	static void ac(Object[] var0, int var1, int var2) {
		while (var1 < var2) {
			Object var4 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var4;
			var1++;
			var2--;
		}
	}

	@ObfuscatedName("call")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object call() {
		try {
			try {
				while (this.ak_fld.av()) {
					dg.ak(10L);
				}
			} catch (IOException var2) {
				return new qx("Error servicing REST query: " + var2.getMessage());
			}

			return this.ak_fld.ae();
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ak() {
		try {
			try {
				while (this.ak_fld.av()) {
					dg.ak(10L);
				}
			} catch (IOException var3) {
				return new qx("Error servicing REST query: " + var3.getMessage());
			}

			return this.ak_fld.ae();
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	qn(qv var1, qk var2) {
		this.this$0 = var1;
		this.ak_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ag() {
		try {
			try {
				while (this.ak_fld.av()) {
					dg.ak(10L);
				}
			} catch (IOException var3) {
				return new qx("Error servicing REST query: " + var3.getMessage());
			}

			return this.ak_fld.ae();
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}
}
