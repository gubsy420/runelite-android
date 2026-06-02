import net.runelite.api.MenuAction;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

// $VF: synthetic class
@ObfuscatedName("rl3")
class rl3 {
	// $VF: synthetic field
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] pm_fld = new int[MenuAction.values().length];

	static {
		try {
			pm_fld[MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.ordinal()] = 1;
		} catch (NoSuchFieldError var14) {
		}

		try {
			pm_fld[MenuAction.GAME_OBJECT_FIRST_OPTION.ordinal()] = 2;
		} catch (NoSuchFieldError var13) {
		}

		try {
			pm_fld[MenuAction.GAME_OBJECT_SECOND_OPTION.ordinal()] = 3;
		} catch (NoSuchFieldError var12) {
		}

		try {
			pm_fld[MenuAction.GAME_OBJECT_THIRD_OPTION.ordinal()] = 4;
		} catch (NoSuchFieldError var11) {
		}

		try {
			pm_fld[MenuAction.GAME_OBJECT_FOURTH_OPTION.ordinal()] = 5;
		} catch (NoSuchFieldError var10) {
		}

		try {
			pm_fld[MenuAction.GAME_OBJECT_FIFTH_OPTION.ordinal()] = 6;
		} catch (NoSuchFieldError var9) {
		}

		try {
			pm_fld[MenuAction.EXAMINE_OBJECT.ordinal()] = 7;
		} catch (NoSuchFieldError var8) {
		}

		try {
			pm_fld[MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.ordinal()] = 8;
		} catch (NoSuchFieldError var7) {
		}

		try {
			pm_fld[MenuAction.GROUND_ITEM_FIRST_OPTION.ordinal()] = 9;
		} catch (NoSuchFieldError var6) {
		}

		try {
			pm_fld[MenuAction.GROUND_ITEM_SECOND_OPTION.ordinal()] = 10;
		} catch (NoSuchFieldError var5) {
		}

		try {
			pm_fld[MenuAction.GROUND_ITEM_THIRD_OPTION.ordinal()] = 11;
		} catch (NoSuchFieldError var4) {
		}

		try {
			pm_fld[MenuAction.GROUND_ITEM_FOURTH_OPTION.ordinal()] = 12;
		} catch (NoSuchFieldError var3) {
		}

		try {
			pm_fld[MenuAction.GROUND_ITEM_FIFTH_OPTION.ordinal()] = 13;
		} catch (NoSuchFieldError var2) {
		}

		try {
			pm_fld[MenuAction.EXAMINE_ITEM_GROUND.ordinal()] = 14;
		} catch (NoSuchFieldError var1) {
		}
	}
}
