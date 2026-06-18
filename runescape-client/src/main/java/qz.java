import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("qz")
public class qz extends SSLSocketFactory {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	static qz ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/security/SecureRandom;"
	)
	SecureRandom ag_fld = new SecureRandom();

	@ObfuscatedName("getSupportedCipherSuites")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getSupportedCipherSuites")
	@Override
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;)Ljavax/net/ssl/SSLSocket;"
	)
	SSLSocket aj(String var1, TlsClientProtocol var2) {
		return new qf(this, var2, var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/InetAddress;I)Ljava/net/Socket;"
	)
	public Socket ai(InetAddress var1, int var2) throws IOException {
		return null;
	}

	@ObfuscatedName("getDefaultCipherSuites")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getDefaultCipherSuites")
	@Override
	public String[] getDefaultCipherSuites() {
		return null;
	}

	qz() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] au() {
		return null;
	}

	@ObfuscatedName("createSocket")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/InetAddress;I)Ljava/net/Socket;"
	)
	@Export("createSocket")
	@Override
	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;"
	)
	public Socket at(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	@ObfuscatedName("createSocket")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;"
	)
	@Export("createSocket")
	@Override
	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;B)Ljavax/net/ssl/SSLSocket;"
	)
	SSLSocket ag(String var1, TlsClientProtocol var2, byte var3) {
		return new qf(this, var2, var1);
	}

	@ObfuscatedName("createSocket")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;"
	)
	@Export("createSocket")
	@Override
	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lqz;"
	)
	public static qz az() {
		if (null == ak_fld) {
			ak_fld = new qz();
		}

		return ak_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lqz;"
	)
	public static qz av() {
		if (null == ak_fld) {
			ak_fld = new qz();
		}

		return ak_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lqz;"
	)
	public static qz ae() {
		if (null == ak_fld) {
			ak_fld = new qz();
		}

		return ak_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lqz;"
	)
	public static qz ah() {
		if (null == ak_fld) {
			ak_fld = new qz();
		}

		return ak_fld;
	}

	@ObfuscatedName("createSocket")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;"
	)
	@Export("createSocket")
	@Override
	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		try {
			if (var1 == null) {
				var1 = new Socket();
			}

			if (!var1.isConnected()) {
				var1.connect(new InetSocketAddress(var2, var3));
			}

			TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.ag_fld);
			return this.ag(var2, var5, (byte)-99);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;"
	)
	public Socket ay(Socket var1, String var2, int var3, boolean var4) throws IOException {
		try {
			if (var1 == null) {
				var1 = new Socket();
			}

			if (!var1.isConnected()) {
				var1.connect(new InetSocketAddress(var2, var3));
			}

			TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.ag_fld);
			return this.ag(var2, var5, (byte)-57);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;"
	)
	public Socket as(Socket var1, String var2, int var3, boolean var4) throws IOException {
		try {
			if (var1 == null) {
				var1 = new Socket();
			}

			if (!var1.isConnected()) {
				var1.connect(new InetSocketAddress(var2, var3));
			}

			TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.ag_fld);
			return this.ag(var2, var5, (byte)-69);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;"
	)
	public Socket ad(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] af() {
		return null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] al() {
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lqz;"
	)
	public static qz aw() {
		if (null == ak_fld) {
			ak_fld = new qz();
		}

		return ak_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] ax() {
		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lqz;"
	)
	public static qz ak() {
		if (null == ak_fld) {
			ak_fld = new qz();
		}

		return ak_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;"
	)
	public Socket an(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] ar() {
		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/InetAddress;I)Ljava/net/Socket;"
	)
	public Socket aq(InetAddress var1, int var2) throws IOException {
		return null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;)Ljavax/net/ssl/SSLSocket;"
	)
	SSLSocket ac(String var1, TlsClientProtocol var2) {
		return new qf(this, var2, var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;"
	)
	public Socket ap(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;"
	)
	public Socket ao(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;"
	)
	public Socket ab(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	@ObfuscatedName("createSocket")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;"
	)
	@Export("createSocket")
	@Override
	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;)Ljavax/net/ssl/SSLSocket;"
	)
	SSLSocket bm(String var1, TlsClientProtocol var2) {
		return new qf(this, var2, var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/InetAddress;I)Ljava/net/Socket;"
	)
	public Socket am(InetAddress var1, int var2) throws IOException {
		return null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;)Ljavax/net/ssl/SSLSocket;"
	)
	SSLSocket bd(String var1, TlsClientProtocol var2) {
		return new qf(this, var2, var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;"
	)
	public Socket aa(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}
}
