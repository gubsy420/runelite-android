import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vz")
public class vz extends ws {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lml;"
	)
	ml az() {
		ml var2 = null;
		Iterator var3 = mb.ag_fld.iterator();

		while (var3.hasNext()) {
			ml var4 = (ml)(ml)var3.next();
			if (null != var4 && (var2 == null || var2.aw_fld > var4.aw_fld || ml.xy(var4, -1865882903) == 0 && var4.ax())) {
				var2 = var4;
			}
		}

		if (var2 != null) {
			var2.aw_fld++;
			if (ml.xy(var2, -303568642) == 0 && var2.ax()) {
				var2.au();
				var2.ar();
				var2.ak(0);
			}
		}

		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		while (!mb.az_fld.isEmpty()) {
			me var2 = (me)(me)mb.az_fld.peek();
			if (null == var2) {
				mb.az_fld.pop();
			} else {
				var2.af_fld = this.az();
				mb.av_fld.add(var2);
				mb.az_fld.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lml;"
	)
	ml ah() {
		ml var1 = null;
		Iterator var2 = mb.ag_fld.iterator();

		while (var2.hasNext()) {
			ml var3 = (ml)(ml)var2.next();
			if (null != var3 && (var1 == null || var1.aw_fld > var3.aw_fld || ml.xy(var3, 164111613) == 0 && var3.ax())) {
				var1 = var3;
			}
		}

		if (var1 != null) {
			var1.aw_fld++;
			if (ml.xy(var1, -1351741125) == 0 && var1.ax()) {
				var1.au();
				var1.ar();
				var1.ak(0);
			}
		}

		return var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lml;"
	)
	ml av() {
		ml var1 = null;
		Iterator var2 = mb.ag_fld.iterator();

		while (var2.hasNext()) {
			ml var3 = (ml)(ml)var2.next();
			if (null != var3 && (var1 == null || var1.aw_fld > var3.aw_fld || ml.xy(var3, 580117055) == 0 && var3.ax())) {
				var1 = var3;
			}
		}

		if (var1 != null) {
			var1.aw_fld++;
			if (ml.xy(var1, 562751336) == 0 && var1.ax()) {
				var1.au();
				var1.ar();
				var1.ak(0);
			}
		}

		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lml;"
	)
	ml aw() {
		ml var1 = null;
		Iterator var2 = mb.ag_fld.iterator();

		while (var2.hasNext()) {
			ml var3 = (ml)(ml)var2.next();
			if (null != var3 && (var1 == null || var1.aw_fld > var3.aw_fld || ml.xy(var3, -976017819) == 0 && var3.ax())) {
				var1 = var3;
			}
		}

		if (var1 != null) {
			var1.aw_fld++;
			if (ml.xy(var1, -1563120789) == 0 && var1.ax()) {
				var1.au();
				var1.ar();
				var1.ak(0);
			}
		}

		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lml;"
	)
	ml ae() {
		ml var1 = null;
		Iterator var2 = mb.ag_fld.iterator();

		while (var2.hasNext()) {
			ml var3 = (ml)(ml)var2.next();
			if (null != var3 && (var1 == null || var1.aw_fld > var3.aw_fld || ml.xy(var3, -1576242336) == 0 && var3.ax())) {
				var1 = var3;
			}
		}

		if (var1 != null) {
			var1.aw_fld++;
			if (ml.xy(var1, 79737841) == 0 && var1.ax()) {
				var1.au();
				var1.ar();
				var1.ak(0);
			}
		}

		return var1;
	}

	public vz(ws var1) {
		super(var1);
		this.aw_fld = "AddRequestTask";
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		while (!mb.az_fld.isEmpty()) {
			me var1 = (me)(me)mb.az_fld.peek();
			if (null == var1) {
				mb.az_fld.pop();
			} else {
				var1.af_fld = this.az();
				mb.av_fld.add(var1);
				mb.az_fld.pop();
			}
		}

		return true;
	}
}
