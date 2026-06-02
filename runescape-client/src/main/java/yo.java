import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yo")
public class yo extends vc {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	List ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lyq;"
	)
	yq[] av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	public static byte[][] as_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/util/List;"
	)
	public List az(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var4 = (Map)(Map)this.ae_fld.get(var2);
		return (List)(List)var4.get(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ah() {
		return null != this.av_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ag(xi var1, int var2) {
		int var3 = var1.dr();
		this.av_fld = new yq[var3];
		this.ae_fld = new ArrayList(var3);

		for (int var4 = 0; var4 < var3; var4++) {
			this.av_fld[var4] = (yq)ka.ak(yq.ak(), var1.cg());
			int var5 = var1.dr();
			HashMap var6 = new HashMap(var5);

			while (var5-- > 0) {
				Object var7 = this.av_fld[var4].as(var1);
				int var8 = var1.dr();
				ArrayList var9 = new ArrayList();

				while (var8-- > 0) {
					if (var2 != 1612726368) {
						return;
					}

					int var10 = var1.dr();
					var9.add(var10);
				}

				var6.put(var7, var9);
			}

			this.ae_fld.add(var4, var6);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean av() {
		return null != this.av_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ae() {
		return null != this.av_fld;
	}

	@ObfuscatedName("zb")
	@ObfuscatedSignature(
		descriptor = "(I)Lyo;"
	)
	public static yo zb(int var0) throws EOFException {
		try {
			return bu.hv(var0);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lyo;S)Z"
	)
	public static boolean ms(yo var0, short var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return null != var0.av_fld;
	}

	public yo(ub var1, int var2) throws EOFException {
		byte[] var3 = var1.bb(var2, 0, 584982574);
		if (var3 != null) {
			this.ag(new xi(var3), 1612726368);
		}
	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(I)Lyo;"
	)
	public static yo ql(int var0) throws EOFException {
		try {
			return me.ha(var0);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	public yo(ub var1, int var2, int var3) throws EOFException {
		byte[] var4 = var1.bb(var2, 1 + var3, 584982574);
		if (var4 != null) {
			this.ag(new xi(var4), 1612726368);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ay(xi var1) {
		int var2 = var1.dr();
		this.av_fld = new yq[var2];
		this.ae_fld = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; var3++) {
			this.av_fld[var3] = (yq)ka.ak(yq.ak(), var1.cg());
			int var4 = var1.dr();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.av_fld[var3].as(var1);
				int var7 = var1.dr();
				ArrayList var8 = new ArrayList();

				while (var7-- > 0) {
					int var9 = var1.dr();
					var8.add(var9);
				}

				var5.put(var6, var8);
			}

			this.ae_fld.add(var3, var5);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aw(xi var1) {
		int var2 = var1.dr();
		this.av_fld = new yq[var2];
		this.ae_fld = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; var3++) {
			this.av_fld[var3] = (yq)ka.ak(yq.ak(), var1.cg());
			int var4 = var1.dr();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.av_fld[var3].as(var1);
				int var7 = var1.dr();
				ArrayList var8 = new ArrayList();

				while (var7-- > 0) {
					int var9 = var1.dr();
					var8.add(var9);
				}

				var5.put(var6, var8);
			}

			this.ae_fld.add(var3, var5);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/util/List;"
	)
	public List as(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)(Map)this.ae_fld.get(var2);
		return (List)(List)var3.get(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/util/List;"
	)
	public List ar(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)(Map)this.ae_fld.get(var2);
		return (List)(List)var3.get(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	public boolean ak(short var1) {
		return null != this.av_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/util/List;"
	)
	public List af(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)(Map)this.ae_fld.get(var2);
		return (List)(List)var3.get(var1);
	}
}
