import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vz")
public class vz extends ws {
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
				var2.af_fld = hb(this, -690644250);
				mb.av_fld.add(var2);
				mb.az_fld.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "(Lvz;)Lml;"
	)
	public static ml wj(vz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		ml var1 = null;
		Iterator var2 = mb.ag_fld.iterator();

		while (var2.hasNext()) {
			ml var3 = (ml)(ml)var2.next();
			if (null != var3 && (var1 == null || var1.aw_fld > var3.aw_fld || var3.ag() == 0 && ml.dc(var3, -594661717))) {
				var1 = var3;
			}
		}

		if (var1 != null) {
			var1.aw_fld++;
			if (var1.ag() == 0 && ml.dc(var1, 661021983)) {
				var1.av();
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
			if (null != var3 && (var1 == null || var1.aw_fld > var3.aw_fld || var3.ag() == 0 && ml.dc(var3, -1563663))) {
				var1 = var3;
			}
		}

		if (var1 != null) {
			var1.aw_fld++;
			if (var1.ag() == 0 && ml.dc(var1, -704866554)) {
				var1.av();
				var1.ar();
				var1.ak(0);
			}
		}

		return var1;
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lvz;)Lml;"
	)
	public static ml oa(vz var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			ml var1 = null;
			Iterator var2 = mb.ag_fld.iterator();

			while (var2.hasNext()) {
				ml var3 = (ml)(ml)var2.next();
				if (null != var3 && (var1 == null || var1.aw_fld > var3.aw_fld || var3.ag() == 0 && ml.dc(var3, -2134143975))) {
					var1 = var3;
				}
			}

			if (var1 != null) {
				var1.aw_fld++;
				if (var1.ag() == 0 && ml.dc(var1, -45355261)) {
					var1.av();
					var1.ar();
					var1.ak(0);
				}
			}

			return var1;
		}
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
			if (null != var3 && (var1 == null || var1.aw_fld > var3.aw_fld || var3.ag() == 0 && ml.dc(var3, -374716366))) {
				var1 = var3;
			}
		}

		if (var1 != null) {
			var1.aw_fld++;
			if (var1.ag() == 0 && ml.dc(var1, -1157780993)) {
				var1.av();
				var1.ar();
				var1.ak(0);
			}
		}

		return var1;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lvz;I)Lml;"
	)
	public static ml hb(vz var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			ml var2 = null;
			Iterator var3 = mb.ag_fld.iterator();

			while (var3.hasNext()) {
				ml var4 = (ml)(ml)var3.next();
				if (null != var4 && (var2 == null || var2.aw_fld > var4.aw_fld || var4.ag() == 0 && ml.dc(var4, -540157437))) {
					var2 = var4;
				}
			}

			if (var2 != null) {
				var2.aw_fld++;
				if (var2.ag() == 0 && ml.dc(var2, -656207979)) {
					var2.av();
					var2.ar();
					var2.ak(0);
				}
			}

			return var2;
		}
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
				var1.af_fld = hb(this, -690644250);
				mb.av_fld.add(var1);
				mb.az_fld.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lml;"
	)
	ml az(int var1) {
		ml var2 = null;
		Iterator var3 = mb.av_fld.iterator();

		while (var3.hasNext()) {
			ml var4 = (ml)(ml)var3.next();
			if (null != var4 && (var2 == null || var2.aw_fld > var4.aw_fld || var4.ag() == 0 && ml.dc(var4, -540157437))) {
				var2 = var4;
			}
		}

		if (var2 != null) {
			var2.aw_fld++;
			if (var2.ag() == 0 && ml.dc(var2, -656207979)) {
				var2.au();
				var2.bb(-488474872);
				var2.ak(0);
			}
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lml;"
	)
	ml ah() {
		ml var1 = null;
		Iterator var2 = mb.av_fld.iterator();

		while (var2.hasNext()) {
			ml var3 = (ml)(ml)var2.next();
			if (null != var3 && (var1 == null || var1.aw_fld > var3.aw_fld || var3.ag() == 0 && ml.dc(var3, -374716366))) {
				var1 = var3;
			}
		}

		if (var1 != null) {
			var1.aw_fld++;
			if (var1.ag() == 0 && ml.dc(var1, -1157780993)) {
				var1.ae((byte)-115);
				var1.bq(-488474872);
				var1.ak(0);
			}
		}

		return var1;
	}
}
