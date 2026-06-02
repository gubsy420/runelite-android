import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ui")
public class ui {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ak_fld;
	@ObfuscatedGetter(
		intValue = 966695779
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld = 0;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[Lyv;"
	)
	static yv[] do_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean ag(lu var1) {
		return this.ak_fld == var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		if (this.ag_fld != null) {
			if (this.az_fld < 50) {
				this.az_fld++;
			}
		} else if (this.az_fld > 0) {
			this.az_fld--;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aw() {
		if (this.ag_fld != null) {
			if (this.az_fld < 1814775742) {
				this.az_fld++;
			}
		} else if (1205617376 * this.az_fld > 0) {
			this.az_fld--;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void az(lu var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ah() {
		if (this.ag_fld != null) {
			if (this.az_fld < 50) {
				this.az_fld++;
			}
		} else if (this.az_fld > 0) {
			this.az_fld--;
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Lui;Llu;I)V"
	)
	public static void nu(ui var0, lu var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1;
	}

	ui() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean as(lu var1) {
		return this.ak_fld == var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean au(lu var1) {
		return this.ak_fld == var1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lui;Llu;)Z"
	)
	public static boolean cx(ui var0, lu var1) {
		return var1 == var0.ag_fld && 50 == var0.az_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void af(lu var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void al(lu var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean ay(lu var1) {
		return var1 == this.ag_fld && 50 == this.az_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void aa(lu var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void ai(lu var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lui;Llu;B)Z"
	)
	public static boolean in(ui var0, lu var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 == var0.ag_fld && 50 == var0.az_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	public void ae(lu var1, int var2) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)Z"
	)
	public boolean av(lu var1, byte var2) {
		return var1 == this.ak_fld && 50 == this.az_fld;
	}
}
