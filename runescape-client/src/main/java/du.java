import net.runelite.api.Hitsplat;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements({"Hitsplat"})
public class du implements Hitsplat {
	@ObfuscatedGetter(
		intValue = -934135659
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld = -316330685;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	public static du dr_fld;
	@ObfuscatedGetter(
		intValue = -1984447153
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -757309927
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
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

	du() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ak(int var1, int var2, int var3, int var4) {
		this.fc(var1, var2, var3);
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ag(byte var1) {
		return this.ak_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ar() {
		return this.ak_fld;
	}

	@ObfuscatedName("getHitsplatType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHitsplatType() {
		return this.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int az(int var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fc(int var1, int var2, int var3) {
		dr_fld = this;
	}

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZ)Z"
	)
	public static boolean th(sb var0, boolean var1, boolean var2, boolean var3) {
		return var0.aw(var0.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int as() {
		return this.ak_fld;
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

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Ldu;I)I"
	)
	public static int fy(du var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld;
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ay() {
		return this.ak_fld;
	}

	@ObfuscatedName("getAmount")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAmount() {
		return this.ag_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int al() {
		return this.az_fld;
	}

	@ObfuscatedName("getDisappearsOnGameCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getDisappearsOnGameCycle() {
		return this.az_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int af() {
		return this.az_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ak() {
		oz.ak_fld.vh();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int au() {
		return this.az_fld;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int av(int var1) {
		return this.ag_fld;
	}
}
