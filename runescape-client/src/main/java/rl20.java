import com.google.common.collect.Iterators;
import java.util.Iterator;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl20")
@Implements({"IndexedObjectSet"})
class rl20 implements IndexedObjectSet {
	// $VF: synthetic field
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	public dx dw_fld;

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)V"
	)
	public static void dx(zg var0) {
		var0.bf(0, var0.ap_fld.size(), -1630173044);
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return Iterators.transform(this.dw_fld.an_fld.iterator(), var0 -> ((rg)var0).ah_fld);
	}

	@ObfuscatedName("zf")
	@ObfuscatedSignature(
		descriptor = "(I)Ldx;"
	)
	public dx byIndex(int var1) {
		rg var2 = (rg)this.dw_fld.an_fld.byIndex(var1);
		return var2 == null ? null : var2.ah_fld;
	}

	public rl20(dx var1) {
		this.dw_fld = var1;
	}
}
