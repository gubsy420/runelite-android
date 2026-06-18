import com.google.common.collect.Iterators;
import java.util.Iterator;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl20")
@Implements({"IndexedObjectSet"})
class rl20 implements IndexedObjectSet {
	// $VF: synthetic field
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	public dx qh_fld;

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
	@Override
	public Iterator iterator() {
		return Iterators.transform(this.qh_fld.an_fld.iterator(), var0 -> ((rg)var0).ah_fld);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)Ldx;"
	)
	public dx byIndex(int var1) {
		rg var2 = (rg)this.qh_fld.an_fld.byIndex(var1);
		return var2 == null ? null : var2.ah_fld;
	}

	public rl20(dx var1) {
		this.qh_fld = var1;
	}
}
