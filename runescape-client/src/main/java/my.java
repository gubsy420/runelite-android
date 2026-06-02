import java.io.EOFException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import javax.net.ssl.SSLPeerUnverifiedException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.GrandExchangeSearched;

@ObfuscatedName("my")
public class my {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean ak_fld = false;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/io/File;"
	)
	static File ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Hashtable;"
	)
	static Hashtable az_fld = new Hashtable(16);
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bw_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cz_fld;

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Lql;)I"
	)
	public static int us(ql var0) throws SSLPeerUnverifiedException {
		if (var0 == null) {
			var0.getClass();
		}

		return 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ay() {
		az_fld.clear();
	}

	my() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/io/File;"
	)
	static File av(String var0) {
		if (!ak_fld) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)(File)az_fld.get(var0);
			if (null != var1) {
				return var1;
			} else {
				File var2 = new File(ag_fld, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						az_fld.put(var0, var2);
						return var2;
					}
				} catch (Exception var7) {
					try {
						if (null != var3) {
							var3.close();
							Object var8 = null;
						}
					} catch (Exception var6) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/io/File;"
	)
	static File ae(String var0) {
		if (!ak_fld) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)(File)az_fld.get(var0);
			if (null != var1) {
				return var1;
			} else {
				File var2 = new File(ag_fld, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						az_fld.put(var0, var2);
						return var2;
					}
				} catch (Exception var7) {
					try {
						if (null != var3) {
							var3.close();
							Object var8 = null;
						}
					} catch (Exception var6) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ah() {
		az_fld.clear();
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Z)V"
	)
	static void hb(String var0, boolean var1) throws EOFException {
		GrandExchangeSearched var3 = new GrandExchangeSearched();
		og.ci_fld.getCallbacks().post(var3);
		if (!var3.isConsumed()) {
			boolean var5 = var1;
			int var6 = 607494731;
			String var4 = var0.toLowerCase();
			short[] var7 = new short[16];
			int var8 = 0;
			int var9 = 0;

			while (true) {
				if (var9 >= ob.dz_fld) {
					in.gc_fld = var7;
					tv.go_fld = 0;
					ey.gn_fld = var8;
					String[] var13 = new String[ey.gn_fld];

					for (int var14 = 0; var14 < ey.gn_fld; var14++) {
						var13[var14] = kb.ag(var7[var14], -1752383175).dx_fld;
					}

					gd.ak(var13, in.gc_fld);
					break;
				}

				if (var6 >= 1001980740) {
					break;
				}

				og var10 = kb.ag(var9, -1752383175);
				if ((!var5 || var10.eh_fld) && -1 == var10.eg_fld && var10.dx_fld.toLowerCase().indexOf(var4) != -1) {
					if (var8 >= 250) {
						ey.gn_fld = 1104029899;
						in.gc_fld = null;
						break;
					}

					if (var8 >= var7.length) {
						if (var6 >= 1001980740) {
							break;
						}

						short[] var11 = new short[var7.length * 2];

						for (int var12 = 0; var12 < var8; var12++) {
							var11[var12] = var7[var12];
						}

						var7 = var11;
					}

					var7[var8++] = (short)var9;
				}

				var9++;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/io/File;"
	)
	static File az(String var0) {
		if (!ak_fld) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)(File)az_fld.get(var0);
			if (null != var1) {
				return var1;
			} else {
				File var2 = new File(ag_fld, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						az_fld.put(var0, var2);
						return var2;
					}
				} catch (Exception var7) {
					try {
						if (null != var3) {
							var3.close();
							Object var8 = null;
						}
					} catch (Exception var6) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void aw() {
		az_fld.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxv;II)I"
	)
	static int ag(xv var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			vl var4 = (vl)var0.ak(var1);
			return var4 == null ? var2 : var4.ak_fld;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ak(ub var0) {
		ed.av_fld = var0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ag(int var0) {
		return var0 >>> 4 & yy.av_fld;
	}
}
