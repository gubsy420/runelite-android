import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ko")
public class ko implements xm {
	@ObfuscatedGetter(
		intValue = 968075377
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	public static ko ak_fld = new ko(0, 0);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	public static ko ag_fld = new ko(1, 1);
	@ObfuscatedGetter(
		intValue = -1292139797
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	public static ko az_fld = new ko(2, 2);
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ao_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ae_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Loe;"
	)
	public static oe az(int var0) throws EOFException {
		synchronized (oe.cq_fld) {
			int var5 = 239270537;
			oe var6 = (oe)oe.cq_fld.ak(var0);
			oe var10000;
			if (var6 != null) {
				var10000 = var6;
			} else {
				byte[] var7 = if_.cf_fld.bb(6, var0, 584982574);
				var6 = new oe();
				var6.cn_fld = var0;
				if (var7 != null) {
					var6.ah(new xi(var7), 1347458768);
				}

				var6.ae(-2056921320);
				if (var6.ct_fld) {
					var6.cu_fld = 0;
					var6.ci_fld = false;
				}

				oe.cq_fld.az(var6, var0);
				var10000 = var6;
			}

			return var10000;
		}
	}

	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "(Lcl;[Ljava/lang/String;)V"
	)
	public static void xo(cl var0, String[] var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);

		for (int var2 = 0; var2 < var0.ak_fld.size(); var2++) {
			((cv)var0.ak_fld.get(var2)).aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lko;"
	)
	public static ko[] az() {
		return new ko[]{ak_fld, ag_fld, az_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lko;"
	)
	public static ko[] aw() {
		return new ko[]{ak_fld, ag_fld, az_fld};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[Lko;"
	)
	public static ko[] ay() {
		return new ko[]{ak_fld, ag_fld, az_fld};
	}

	ko(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}
}
