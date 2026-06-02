import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ae")
public class ae implements aw {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/security/MessageDigest;"
	)
	MessageDigest ag_fld = xw.ak(this);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([B)I"
	)
	static int aw(byte[] var0) {
		int var1 = 0;
		byte[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; var3++) {
			byte var4 = var2[var3];
			int var5 = ag(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([B)I"
	)
	static int ak(byte[] var0) {
		int var1 = 0;
		byte[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; var3++) {
			byte var4 = var2[var3];
			int var5 = ag(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	static int ag(byte var0) {
		int var1 = 0;
		if (var0 == 0) {
			var1 = 8;
		} else {
			for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;J)Z"
	)
	boolean az(int var1, String var2, long var3) {
		byte[] var5 = zu(this, var2, var3);
		return ak(var5) >= var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([B)I"
	)
	static int ah(byte[] var0) {
		int var1 = 0;
		byte[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; var3++) {
			byte var4 = var2[var3];
			int var5 = ag(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;J)Z"
	)
	boolean au(int var1, String var2, long var3) {
		byte[] var5 = zu(this, var2, var3);
		return ak(var5) >= var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	static int al(byte var0) {
		int var1 = 0;
		if (var0 == 0) {
			var1 = 8;
		} else {
			for (int var2 = var0 & 255; (var2 & -1940572270) == 0; var2 <<= 1) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "(Lae;ILjava/lang/String;J)Z"
	)
	public static boolean zc(ae var0, int var1, String var2, long var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte[] var5 = zu(var0, var2, var3);
			return ak(var5) >= var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([B)I"
	)
	static int ay(byte[] var0) {
		int var1 = 0;
		byte[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; var3++) {
			byte var4 = var2[var3];
			int var5 = ag(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([B)I"
	)
	static int as(byte[] var0) {
		int var1 = 0;
		byte[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; var3++) {
			byte var4 = var2[var3];
			int var5 = ag(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([B)I"
	)
	static int ar(byte[] var0) {
		int var1 = 0;
		byte[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; var3++) {
			byte var4 = var2[var3];
			int var5 = ag(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	static int af(byte var0) {
		int var1 = 0;
		if (var0 == 0) {
			var1 = 8;
		} else {
			for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;J)[B"
	)
	byte[] aq(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.ag_fld.reset();

		try {
			this.ag_fld.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return this.ag_fld.digest();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/MessageDigest;"
	)
	MessageDigest ao() {
		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/MessageDigest;"
	)
	MessageDigest ad() {
		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;J)[B"
	)
	byte[] av(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.ag_fld.reset();

		try {
			this.ag_fld.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return this.ag_fld.digest();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;J)[B"
	)
	byte[] am(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.ag_fld.reset();

		try {
			this.ag_fld.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return this.ag_fld.digest();
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(Lae;Ljava/lang/String;J)[B"
	)
	public static byte[] zu(ae var0, String var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		}

		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		var0.ag_fld.reset();

		try {
			var0.ag_fld.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return var0.ag_fld.digest();
	}

	ae(as var1) {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;J)[B"
	)
	byte[] aa(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.ag_fld.reset();

		try {
			this.ag_fld.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return this.ag_fld.digest();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;J)Z"
	)
	boolean an(int var1, String var2, long var3) {
		byte[] var5 = zu(this, var2, var3);
		return ak(var5) >= var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;J)[B"
	)
	byte[] ai(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.ag_fld.reset();

		try {
			this.ag_fld.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return this.ag_fld.digest();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;J)Z"
	)
	boolean ax(int var1, String var2, long var3) {
		byte[] var5 = zu(this, var2, var3);
		return ar(var5) >= var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/MessageDigest;"
	)
	MessageDigest ae() {
		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			return null;
		}
	}
}
