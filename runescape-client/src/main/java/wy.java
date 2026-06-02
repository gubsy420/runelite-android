import java.io.EOFException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wy")
public class wy implements wr {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Laaj;"
	)
	aaj ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map ag_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int az(int var1) throws EOFException {
		if (this.ag_fld != null) {
			aaq var2 = (aaq)(aaq)this.ag_fld.get(var1);
			if (null != var2) {
				return (Integer)var2.ag_fld;
			}
		}

		return (Integer)this.ak_fld.az(var1, 1811117369);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V"
	)
	@Override
	public void ag(int var1, Object var2, int var3) {
		if (this.ag_fld == null) {
			if (var3 >= -1167715809) {
				return;
			}

			this.ag_fld = new HashMap();
			this.ag_fld.put(var1, new aaq(var1, var2));
		} else {
			aaq var4 = (aaq)(aaq)this.ag_fld.get(var1);
			if (var4 == null) {
				this.ag_fld.put(var1, new aaq(var1, var2));
			} else {
				var4.ag_fld = var2;
			}
		}
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return null == this.ag_fld ? Collections.emptyList().iterator() : this.ag_fld.values().iterator();
	}

	public wy(aaj var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cc() {
		return null == this.ag_fld ? Collections.emptyList().iterator() : this.ag_fld.values().iterator();
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(Lwy;)Ljava/util/Iterator;"
	)
	public static Iterator pz(wy var0) {
		return null == var0.ag_fld ? Collections.emptyList().iterator() : var0.ag_fld.values().iterator();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	@Override
	public int ak(int var1, byte var2) throws EOFException {
		if (this.ag_fld != null) {
			aaq var3 = (aaq)(aaq)this.ag_fld.get(var1);
			if (null != var3) {
				return (Integer)var3.ag_fld;
			}
		}

		return (Integer)this.ak_fld.az(var1, 1268913925);
	}

	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "(Lfn;III)V"
	)
	public static void wy(fn var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.yk_fld = new float[var1];
		var0.vr_fld = new float[var1];
		var0.qo_fld = new float[var1];
		var0.ba_fld = new int[var2];
		var0.bq_fld = new int[var2];
		var0.bg_fld = new int[var2];
		var0.bb_fld = new int[var2];
		var0.cd_fld = new int[var2];
		var0.cc_fld = new int[var2];
		if (var3 > 0) {
			var0.ce_fld = new int[var3];
			var0.cn_fld = new int[var3];
			var0.cr_fld = new int[var3];
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	@Override
	public void av(int var1, Object var2) {
		if (this.ag_fld == null) {
			this.ag_fld = new HashMap();
			this.ag_fld.put(var1, new aaq(var1, var2));
		} else {
			aaq var3 = (aaq)(aaq)this.ag_fld.get(var1);
			if (var3 == null) {
				this.ag_fld.put(var1, new aaq(var1, var2));
			} else {
				var3.ag_fld = var2;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	@Override
	public void ae(int var1, Object var2) {
		if (this.ag_fld == null) {
			this.ag_fld = new HashMap();
			this.ag_fld.put(var1, new aaq(var1, var2));
		} else {
			aaq var3 = (aaq)(aaq)this.ag_fld.get(var1);
			if (var3 == null) {
				this.ag_fld.put(var1, new aaq(var1, var2));
			} else {
				var3.ag_fld = var2;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	@Override
	public void ah(int var1, Object var2) {
		if (this.ag_fld == null) {
			this.ag_fld = new HashMap();
			this.ag_fld.put(var1, new aaq(var1, var2));
		} else {
			aaq var3 = (aaq)(aaq)this.ag_fld.get(var1);
			if (var3 == null) {
				this.ag_fld.put(var1, new aaq(var1, var2));
			} else {
				var3.ag_fld = var2;
			}
		}
	}
}
