import java.awt.event.WindowEvent;
import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lo")
public class lo {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[S"
	)
	public static short[][] av_fld = new short[][]{
		{
				6554,
				115,
				10304,
				28,
				5702,
				7756,
				5681,
				4510,
				-31835,
				22437,
				2859,
				-11339,
				16,
				5157,
				10446,
				3658,
				-27314,
				-21965,
				472,
				580,
				784,
				21966,
				28950,
				-15697,
				-14002,
				-22116,
				945,
				8144,
				-13414,
				30389
		},
		{
				9104,
				10275,
				7595,
				3610,
				7975,
				8526,
				918,
				-26734,
				24466,
				10145,
				-6882,
				5027,
				1457,
				16565,
				-30545,
				25486,
				24,
				5392,
				10429,
				3673,
				-27335,
				-21957,
				192,
				687,
				412,
				21821,
				28835,
				-15460,
				-14019
		},
		new short[0],
		new short[0],
		new short[0]
	};
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[S"
	)
	public static short[][] ag_fld = new short[][]{
		{
				6798,
				107,
				10283,
				16,
				4797,
				7744,
				5799,
				4634,
				-31839,
				22433,
				2983,
				-11343,
				8,
				5281,
				10438,
				3650,
				-27322,
				-21845,
				200,
				571,
				908,
				21830,
				28946,
				-15701,
				-14010,
				-22122,
				937,
				8130,
				-13422,
				30385
		},
		{
				8741,
				12,
				-1506,
				-22374,
				7735,
				8404,
				1701,
				-27106,
				24094,
				10153,
				-8915,
				4783,
				1341,
				16578,
				-30533,
				25239,
				8,
				5281,
				10438,
				3650,
				-27322,
				-21845,
				200,
				571,
				908,
				21830,
				28946,
				-15701,
				-14010
		},
		{
				25238,
				8742,
				12,
				-1506,
				-22374,
				7735,
				8404,
				1701,
				-27106,
				24094,
				10153,
				-8915,
				4783,
				1341,
				16578,
				-30533,
				8,
				5281,
				10438,
				3650,
				-27322,
				-21845,
				200,
				571,
				908,
				21830,
				28946,
				-15701,
				-14010
		},
		{4626, 11146, 6439, 12, 4758, 10270},
		{4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991, 918}
	};
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	public static short[] az_fld = new short[]{-10304, 9104, -1, -1, -1};
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	public static short[] ak_fld = new short[]{6798, 8741, 25238, 4626, 4550};

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvu;"
	)
	static vu ae() {
		return kg.ps_fld;
	}

	lo() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/WindowEvent;)V"
	)
	public static void ur(tf var0, WindowEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	static boolean ag(int var0, int var1) {
		return 4 != var0 || var1 < 8;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/io/File;"
	)
	static File ak(String var0) {
		if (!my.ak_fld) {
			throw new RuntimeException("");
		} else {
			File var2 = (File)(File)my.az_fld.get(var0);
			if (null != var2) {
				return var2;
			} else {
				File var3 = new File(my.ag_fld, var0);
				RandomAccessFile var4 = null;

				try {
					File var5 = new File(var3.getParent());
					if (!var5.exists()) {
						throw new RuntimeException("");
					} else {
						var4 = new RandomAccessFile(var3, "rw");
						int var6 = var4.read();
						var4.seek(0L);
						var4.write(var6);
						var4.seek(0L);
						var4.close();
						my.az_fld.put(var0, var3);
						return var3;
					}
				} catch (Exception var8) {
					try {
						if (null != var4) {
							var4.close();
							Object var9 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}
}
