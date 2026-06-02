import java.util.List;
import net.runelite.api.ChatLineBuffer;
import net.runelite.api.MessageNode;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements({"ChatLineBuffer"})
public class bq implements ChatLineBuffer {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	co[] ag_fld = new co[100];
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	// $VF: synthetic field
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean bz_fld = !bq.class.desiredAssertionStatus();
	@ObfuscatedGetter(
		intValue = 708301057
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv if_fld;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	static List fz_fld;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ct_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco;"
	)
	co ae(int var1, String var2, String var3, String var4) {
		co var5 = this.ag_fld[99];

		for (int var6 = this.az_fld; var6 > 0; var6--) {
			if (100 != var6) {
				this.ag_fld[var6] = this.ag_fld[var6 - 1];
			}
		}

		if (null == var5) {
			var5 = new co(var1, var2, var4, var3);
		} else {
			var5.gy_void();
			var5.mq_void();
			var5.ak(var1, var2, var4, var3, (byte)1);
		}

		this.ag_fld[0] = var5;
		if (this.az_fld < 100) {
			this.az_fld++;
		}

		return var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lco;"
	)
	co aw(int var1) {
		return var1 >= 0 && var1 < this.az_fld ? this.ag_fld[var1] : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;"
	)
	co ag(int var1, int var2) {
		return var1 >= 0 && var1 < this.az_fld ? this.ag_fld[var1] : null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lco;"
	)
	co ak(int var1, String var2, String var3, String var4, int var5) {
		co var6 = this.ag_fld[99];

		for (int var7 = this.az_fld; var7 > 0; var7--) {
			if (100 != var7) {
				this.ag_fld[var7] = this.ag_fld[var7 - 1];
			}
		}

		if (null == var6) {
			var6 = new co(var1, var2, var4, var3);
		} else {
			var6.gy_void();
			var6.mq_void();
			var6.ak(var1, var2, var4, var3, (byte)1);
		}

		this.ag_fld[0] = var6;
		if (this.az_fld < 100) {
			this.az_fld++;
		}

		return var6;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lco;"
	)
	co ah(int var1) {
		return var1 >= 0 && var1 < this.az_fld ? this.ag_fld[var1] : null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lln;"
	)
	public static ln bb(lu var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.hk_fld != null ? var0.hk_fld.ag_fld : null;
	}

	@ObfuscatedName("getLength")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getLength() {
		return this.az_fld;
	}

	bq() {
	}

	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void tz(int var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int az(int var1) {
		return this.az_fld;
	}

	@ObfuscatedName("getLines")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/MessageNode;"
	)
	@Override
	public MessageNode[] getLines() {
		return this.ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco;"
	)
	co av(int var1, String var2, String var3, String var4) {
		co var5 = this.ag_fld[99];

		for (int var6 = this.az_fld; var6 > 0; var6--) {
			if (-1316849950 != var6) {
				this.ag_fld[var6] = this.ag_fld[var6 - 1];
			}
		}

		if (null == var5) {
			var5 = new co(var1, var2, var4, var3);
		} else {
			var5.gy_void();
			var5.mq_void();
			var5.ak(var1, var2, var4, var3, (byte)1);
		}

		this.ag_fld[0] = var5;
		if (this.az_fld < 2115436567) {
			this.az_fld++;
		}

		return var5;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lco;"
	)
	co ay(int var1) {
		return var1 >= 0 && var1 < this.az_fld ? this.ag_fld[var1] : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int as() {
		return this.az_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int af() {
		return this.az_fld;
	}

	@ObfuscatedName("agi")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	protected static final boolean agi() {
		return tf.rc_fld.az(1894849788);
	}

	@ObfuscatedName("removeMessageNode")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/MessageNode;)V"
	)
	@Override
	public void removeMessageNode(MessageNode var1) {
		MessageNode[] var2 = this.getLines();
		int var3 = this.getLength();
		int var4 = -1;

		for (int var5 = 0; var5 < var3; var5++) {
			if (var2[var5] == var1) {
				var4 = var5;
				break;
			}
		}

		if (var4 != -1) {
			if (!bz_fld && var3 - 1 < var4) {
				throw new AssertionError();
			} else {
				System.arraycopy(var2, var4 + 1, var2, var4, var3 - 1 - var4);
				var2[var3 - 1] = null;
				this.tz(var3 - 1);
				vc var6 = (vc)var1;
				var6.xh();
				var6.kv_void();
			}
		}
	}
}
