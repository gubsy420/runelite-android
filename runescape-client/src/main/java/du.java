import java.awt.Graphics;
import net.runelite.api.Hitsplat;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements({"Hitsplat"})
public class du implements Hitsplat {
	@ObfuscatedName("xd")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	public static du xd_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -934135659
	)
	int ak_fld = -316330685;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1984447153
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -757309927
	)
	int az_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bl_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ao_fld;
	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static lv lk_fld;

	@ObfuscatedName("getHitsplatType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHitsplatType")
	@Override
	public int getHitsplatType() {
		return this.ak_fld;
	}

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "(Lte;Ljava/awt/Graphics;II)V"
	)
	public static void th(te var0, Graphics var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		try {
			var1.drawImage(var0.ak_fld, var2, var3, var0.ag_fld);
		} catch (Exception var5) {
			var0.ag_fld.repaint();
		}
	}

	du() {
	}

	@ObfuscatedName("getDisappearsOnGameCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getDisappearsOnGameCycle")
	@Override
	public int getDisappearsOnGameCycle() {
		return this.az_fld;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ldu;)I"
	)
	public static int lj(du var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lml;)I"
	)
	public static int cu(ml var0) {
		return var0.al_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ak(int var1, int var2, int var3, int var4) {
		this.yh(var1, var2, var3);
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int an() {
		return this.ak_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int av(int var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ah(int var1, int var2, int var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void aw(int var1, int var2, int var3) {
		this.ak_fld = var1 * 1769002398;
		this.ag_fld = var2;
		this.az_fld = var3 * -1627157748;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int al() {
		return this.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int az(int var1) {
		return this.az_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void ak() {
		oz.ak_fld.av();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ar() {
		return this.az_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ay() {
		return this.ag_fld;
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(Ldu;B)I"
	)
	public static int zu(du var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld;
	}

	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void sq(int var1, int var2, int var3) {
		this.ak(var1, var2, var3, -1045138312);
	}

	@ObfuscatedName("yh")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void yh(int var1, int var2, int var3) {
		xd_fld = this;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ax() {
		return this.ag_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ae(int var1, int var2, int var3) {
		this.ak_fld = var1 * -521031706;
		this.ag_fld = -289185854 * var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("getAmount")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAmount")
	@Override
	public int getAmount() {
		return this.ag_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ag(byte var1) {
		return this.az_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int au() {
		return this.ag_fld;
	}
}
