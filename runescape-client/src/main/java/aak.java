import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aak")
public class aak extends RuntimeException {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/net/URL;"
	)
	public static URL ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ag_fld;
	@ObfuscatedGetter(
		intValue = -1324909115
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Throwable;"
	)
	Throwable aw_fld;

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lqw;)Ljava/lang/String;"
	)
	public static String of(qw var0) {
		return var0.ag_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V"
	)
	public static void az(String var0, Throwable var1) {
		try {
			String var2 = "";
			if (null != var1) {
				Throwable var4 = var1;
				String var5;
				if (var1 instanceof aak) {
					aak var6 = (aak)var1;
					var5 = var6.ah_fld + " | ";
					var4 = var6.aw_fld;
				} else {
					var5 = "";
				}

				StringWriter var23 = new StringWriter();
				PrintWriter var7 = new PrintWriter(var23);
				var4.printStackTrace(var7);
				var7.close();
				String var8 = var23.toString();
				BufferedReader var9 = new BufferedReader(new StringReader(var8));
				String var10 = var9.readLine();

				while (true) {
					String var11 = var9.readLine();
					if (null == var11) {
						var5 = var5 + "| " + var10;
						var2 = var5;
						break;
					}

					int var12 = var11.indexOf(40);
					int var13 = var11.indexOf(41, 1 + var12);
					if (var12 >= 0 && var13 >= 0) {
						String var14 = var11.substring(1 + var12, var13);
						int var15 = var14.indexOf(".java:");
						if (var15 >= 0) {
							var14 = var14.substring(0, var15) + var14.substring(5 + var15);
							var5 = var5 + var14 + ' ';
							continue;
						}

						var11 = var11.substring(0, var12);
					}

					var11 = var11.trim();
					var11 = var11.substring(var11.lastIndexOf(32) + 1);
					var11 = var11.substring(var11.lastIndexOf(9) + 1);
					var5 = var5 + var11 + ' ';
				}
			}

			if (null != var0) {
				if (null != var1) {
					var2 = var2 + " | ";
				}

				var2 = var2 + var0;
			}

			System.out.println("Error: " + var2);
			var2 = var2.replace(':', '.');
			var2 = var2.replace('@', '_');
			var2 = var2.replace('&', '_');
			var2 = var2.replace('#', '_');
			if (ak_fld == null) {
				return;
			}

			URL var3 = new URL(
				ak_fld,
				"clienterror.ws?cv="
					+ az_fld
					+ "&cs="
					+ zj.av_fld
					+ "&u="
					+ ag_fld
					+ "&v1="
					+ la.av_fld
					+ "&v2="
					+ la.ae_fld
					+ "&ct="
					+ -1283073411 * wf.ae_fld
					+ "&e="
					+ var2
			);
			DataInputStream var21 = new DataInputStream(var3.openStream());
			var21.read();
			var21.close();
		} catch (Exception var16) {
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V"
	)
	public static void av(String var0, Throwable var1) {
		try {
			String var2 = "";
			if (null != var1) {
				Throwable var4 = var1;
				String var5;
				if (var1 instanceof aak) {
					aak var6 = (aak)var1;
					var5 = var6.ah_fld + " | ";
					var4 = var6.aw_fld;
				} else {
					var5 = "";
				}

				StringWriter var23 = new StringWriter();
				PrintWriter var7 = new PrintWriter(var23);
				var4.printStackTrace(var7);
				var7.close();
				String var8 = var23.toString();
				BufferedReader var9 = new BufferedReader(new StringReader(var8));
				String var10 = var9.readLine();

				while (true) {
					String var11 = var9.readLine();
					if (null == var11) {
						var5 = var5 + "| " + var10;
						var2 = var5;
						break;
					}

					int var12 = var11.indexOf(40);
					int var13 = var11.indexOf(41, 1 + var12);
					if (var12 >= 0 && var13 >= 0) {
						String var14 = var11.substring(1 + var12, var13);
						int var15 = var14.indexOf(".java:");
						if (var15 >= 0) {
							var14 = var14.substring(0, var15) + var14.substring(5 + var15);
							var5 = var5 + var14 + ' ';
							continue;
						}

						var11 = var11.substring(0, var12);
					}

					var11 = var11.trim();
					var11 = var11.substring(var11.lastIndexOf(32) + 1);
					var11 = var11.substring(var11.lastIndexOf(9) + 1);
					var5 = var5 + var11 + ' ';
				}
			}

			if (null != var0) {
				if (null != var1) {
					var2 = var2 + " | ";
				}

				var2 = var2 + var0;
			}

			System.out.println("Error: " + var2);
			var2 = var2.replace(':', '.');
			var2 = var2.replace('@', '_');
			var2 = var2.replace('&', '_');
			var2 = var2.replace('#', '_');
			if (ak_fld == null) {
				return;
			}

			URL var3 = new URL(
				ak_fld,
				"clienterror.ws?cv="
					+ az_fld
					+ "&cs="
					+ zj.av_fld
					+ "&u="
					+ ag_fld
					+ "&v1="
					+ la.av_fld
					+ "&v2="
					+ la.ae_fld
					+ "&ct="
					+ -1283073411 * wf.ae_fld
					+ "&e="
					+ var2
			);
			DataInputStream var21 = new DataInputStream(var3.openStream());
			var21.read();
			var21.close();
		} catch (Exception var16) {
		}
	}

	aak(Throwable var1, String var2) {
		this.ah_fld = var2;
		this.aw_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laak;"
	)
	public static aak ae(Throwable var0, String var1) {
		aak var2;
		if (var0 instanceof aak) {
			var2 = (aak)var0;
			var2.ah_fld = var2.ah_fld + 1058755250 + var1;
		} else {
			var2 = new aak(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("getCause")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Throwable;"
	)
	@Override
	public Throwable getCause() {
		return this.aw_fld;
	}

	@ObfuscatedName("getMessage")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getMessage() {
		return this.ah_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laak;"
	)
	public static aak ah(Throwable var0, String var1) {
		aak var2;
		if (var0 instanceof aak) {
			var2 = (aak)var0;
			var2.ah_fld = var2.ah_fld + ' ' + var1;
		} else {
			var2 = new aak(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laak;"
	)
	public static aak aw(Throwable var0, String var1) {
		aak var2;
		if (var0 instanceof aak) {
			var2 = (aak)var0;
			var2.ah_fld = var2.ah_fld + -406244884 + var1;
		} else {
			var2 = new aak(var0, var1);
		}

		return var2;
	}
}
