import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("eo")
public class eo extends rz {
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bm_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -43899203
	)
	static int od_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/ScheduledExecutorService;"
	)
	public static ScheduledExecutorService au_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bp_fld;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv hx_fld;

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)Ljava/io/OutputStream;"
	)
	public static OutputStream jk(qf var0) throws IOException {
		return var0.val$tlsClientProtocol.getOutputStream();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	public eo(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int az(rr var1, rr var2) {
		if (client.ch_fld == var1.ae_fld && client.ch_fld == var2.ae_fld) {
			return this.ak_fld ? var1.ah_fld - var2.ah_fld : var2.ah_fld - var1.ah_fld;
		} else {
			return this.as(var1, var2, 327463523);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ag(rr var1, rr var2) {
		if (client.ch_fld == var1.ae_fld && client.ch_fld == var2.ae_fld) {
			return this.ak_fld ? var1.ah_fld - var2.ah_fld : var2.ah_fld - var1.ah_fld;
		} else {
			return this.as(var1, var2, 1655824449);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;I)I"
	)
	int ak(rr var1, rr var2) {
		if (client.ch_fld == var1.ae_fld && client.ch_fld == var2.ae_fld) {
			return this.ak_fld ? var1.ah_fld - var2.ah_fld : var2.ah_fld - var1.ah_fld;
		} else {
			return this.as(var1, var2, 801870248);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIB)V"
	)
	static void ak(lu var0, int var1, int var2) {
		if (0 == var0.bt_fld) {
			var0.bq_fld = -1983503213 * var0.bn_fld;
			var0.ik(-1);
		} else if (var0.bt_fld == 1) {
			var0.bq_fld = var0.bn_fld + (var1 - var0.bb_fld) / 2;
			var0.ik(-1);
		} else if (var0.bt_fld == 2) {
			var0.bq_fld = -491438769 * (var1 - var0.bb_fld - var0.bn_fld);
			var0.ik(-1);
		} else if (var0.bt_fld == 3) {
			var0.bq_fld = -491438769 * (var0.bn_fld * var1 >> 14);
			var0.ik(-1);
		} else if (var0.bt_fld == 4) {
			var0.bq_fld = -491438769 * ((var0.bn_fld * var1 >> 14) + (var1 - var0.bb_fld) / 2);
			var0.ik(-1);
		} else {
			var0.bq_fld = var1 - var0.bb_fld - (var0.bn_fld * var1 >> 14);
			var0.ik(-1);
		}

		if (var0.bv_fld == 0) {
			var0.bg_fld = 531065689 * var0.bc_fld;
			var0.qz(-1);
		} else if (var0.bv_fld == 1) {
			var0.bg_fld = var0.bc_fld + (var2 - var0.cd_fld) / 2;
			var0.qz(-1);
		} else if (2 == var0.bv_fld) {
			var0.bg_fld = -298019711 * (var2 - var0.cd_fld - var0.bc_fld);
			var0.qz(-1);
		} else if (3 == var0.bv_fld) {
			var0.bg_fld = var2 * var0.bc_fld >> 14;
			var0.qz(-1);
		} else if (var0.bv_fld == 4) {
			var0.bg_fld = -298019711 * ((var2 - var0.cd_fld) / 2 + (var0.bc_fld * var2 >> 14));
			var0.qz(-1);
		} else {
			var0.bg_fld = var2 - var0.cd_fld - (var2 * var0.bc_fld >> 14);
			var0.qz(-1);
		}
	}
}
