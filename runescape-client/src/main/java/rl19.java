import java.security.Principal;
import javax.net.ssl.SSLPeerUnverifiedException;
import net.runelite.api.MenuAction;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

// $VF: synthetic class
@ObfuscatedName("rl19")
class rl19 {
	// $VF: synthetic field
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] wp_fld = new int[MenuAction.values().length];

	@ObfuscatedName("xa")
	@ObfuscatedSignature(
		descriptor = "(Lql;)Ljava/security/Principal;"
	)
	public static Principal xa(ql var0) throws SSLPeerUnverifiedException {
		if (var0 == null) {
			var0.getClass();
		}

		return null;
	}

	static {
		try {
			wp_fld[MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.ordinal()] = 1;
		} catch (NoSuchFieldError var27) {
		}

		try {
			wp_fld[MenuAction.GAME_OBJECT_FIRST_OPTION.ordinal()] = 2;
		} catch (NoSuchFieldError var26) {
		}

		try {
			wp_fld[MenuAction.GAME_OBJECT_SECOND_OPTION.ordinal()] = 3;
		} catch (NoSuchFieldError var25) {
		}

		try {
			wp_fld[MenuAction.GAME_OBJECT_THIRD_OPTION.ordinal()] = 4;
		} catch (NoSuchFieldError var24) {
		}

		try {
			wp_fld[MenuAction.GAME_OBJECT_FOURTH_OPTION.ordinal()] = 5;
		} catch (NoSuchFieldError var23) {
		}

		try {
			wp_fld[MenuAction.GAME_OBJECT_FIFTH_OPTION.ordinal()] = 6;
		} catch (NoSuchFieldError var22) {
		}

		try {
			wp_fld[MenuAction.WIDGET_TARGET_ON_NPC.ordinal()] = 7;
		} catch (NoSuchFieldError var21) {
		}

		try {
			wp_fld[MenuAction.NPC_FIRST_OPTION.ordinal()] = 8;
		} catch (NoSuchFieldError var20) {
		}

		try {
			wp_fld[MenuAction.NPC_SECOND_OPTION.ordinal()] = 9;
		} catch (NoSuchFieldError var19) {
		}

		try {
			wp_fld[MenuAction.NPC_THIRD_OPTION.ordinal()] = 10;
		} catch (NoSuchFieldError var18) {
		}

		try {
			wp_fld[MenuAction.NPC_FOURTH_OPTION.ordinal()] = 11;
		} catch (NoSuchFieldError var17) {
		}

		try {
			wp_fld[MenuAction.NPC_FIFTH_OPTION.ordinal()] = 12;
		} catch (NoSuchFieldError var16) {
		}

		try {
			wp_fld[MenuAction.WIDGET_TARGET_ON_PLAYER.ordinal()] = 13;
		} catch (NoSuchFieldError var15) {
		}

		try {
			wp_fld[MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.ordinal()] = 14;
		} catch (NoSuchFieldError var14) {
		}

		try {
			wp_fld[MenuAction.GROUND_ITEM_FIRST_OPTION.ordinal()] = 15;
		} catch (NoSuchFieldError var13) {
		}

		try {
			wp_fld[MenuAction.GROUND_ITEM_SECOND_OPTION.ordinal()] = 16;
		} catch (NoSuchFieldError var12) {
		}

		try {
			wp_fld[MenuAction.GROUND_ITEM_THIRD_OPTION.ordinal()] = 17;
		} catch (NoSuchFieldError var11) {
		}

		try {
			wp_fld[MenuAction.GROUND_ITEM_FOURTH_OPTION.ordinal()] = 18;
		} catch (NoSuchFieldError var10) {
		}

		try {
			wp_fld[MenuAction.GROUND_ITEM_FIFTH_OPTION.ordinal()] = 19;
		} catch (NoSuchFieldError var9) {
		}

		try {
			wp_fld[MenuAction.PLAYER_FIRST_OPTION.ordinal()] = 20;
		} catch (NoSuchFieldError var8) {
		}

		try {
			wp_fld[MenuAction.PLAYER_SECOND_OPTION.ordinal()] = 21;
		} catch (NoSuchFieldError var7) {
		}

		try {
			wp_fld[MenuAction.PLAYER_THIRD_OPTION.ordinal()] = 22;
		} catch (NoSuchFieldError var6) {
		}

		try {
			wp_fld[MenuAction.PLAYER_FOURTH_OPTION.ordinal()] = 23;
		} catch (NoSuchFieldError var5) {
		}

		try {
			wp_fld[MenuAction.PLAYER_FIFTH_OPTION.ordinal()] = 24;
		} catch (NoSuchFieldError var4) {
		}

		try {
			wp_fld[MenuAction.PLAYER_SIXTH_OPTION.ordinal()] = 25;
		} catch (NoSuchFieldError var3) {
		}

		try {
			wp_fld[MenuAction.PLAYER_SEVENTH_OPTION.ordinal()] = 26;
		} catch (NoSuchFieldError var2) {
		}

		try {
			wp_fld[MenuAction.PLAYER_EIGHTH_OPTION.ordinal()] = 27;
		} catch (NoSuchFieldError var1) {
		}
	}
}
