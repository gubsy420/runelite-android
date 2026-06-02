import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ql")
class ql implements SSLSession {
	// $VF: synthetic field
	@ObfuscatedName("this$1")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	qf this$1;

	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "(Lga;IILhi;Lhs;)I"
	)
	public static int tu(ga var0, int var1, int var2, hi var3, hs var4) {
		if (var0 == null) {
			var0.getClass();
		}

		return 0 == var3.ae_fld[0][var1][var2] ? var0.al_fld : var4.ak(var1, var2);
	}

	@ObfuscatedName("getApplicationBufferSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getApplicationBufferSize() {
		return 0;
	}

	@ObfuscatedName("getCipherSuite")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getCreationTime")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Override
	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bu() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()Ljavax/net/ssl/SSLSessionContext;"
	)
	public SSLSessionContext bl() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("xd")
	@ObfuscatedSignature(
		descriptor = "(Lql;Ljava/lang/String;)V"
	)
	public static void xd(ql var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lql;)Ljava/lang/String;"
	)
	public static String kn(ql var0) throws SSLPeerUnverifiedException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			throw new UnsupportedOperationException();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getSessionContext")
	@ObfuscatedSignature(
		descriptor = "()Ljavax/net/ssl/SSLSessionContext;"
	)
	@Override
	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getPacketBufferSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Lql;)Ljava/security/Principal;"
	)
	public static Principal oz(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getPeerCertificateChain")
	@ObfuscatedSignature(
		descriptor = "()[Ljavax/security/cert/X509Certificate;"
	)
	@Override
	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	public static void py(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()Ljavax/net/ssl/SSLSessionContext;"
	)
	public SSLSessionContext bx() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getPeerHost")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long an() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getPeerPort")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPeerPort() {
		return 0;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(Lql;Ljava/lang/String;)Ljava/lang/Object;"
	)
	public static Object ds(ql var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getProtocol")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getPeerPrincipal")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/Principal;"
	)
	@Override
	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ag() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "(Lql;)Ljava/lang/String;"
	)
	public static String rn(ql var0) throws SSLPeerUnverifiedException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			throw new UnsupportedOperationException();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getValueNames")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Override
	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/Principal;"
	)
	public Principal bk() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Object;)V"
	)
	public void bc(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("removeValue")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Override
	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ap() {
		return 0;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Lql;Ljava/lang/String;)Ljava/lang/Object;"
	)
	public static Object do_(ql var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void bw(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "(Lql;)I"
	)
	public static int uz(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bs() {
		return 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ae() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ah() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long aw() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long as() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] af() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] al() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] ar() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long au() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getValue")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/Object;"
	)
	@Override
	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String be() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("putValue")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Object;)V"
	)
	@Override
	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/Principal;"
	)
	public Principal ad() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/security/cert/Certificate;"
	)
	public Certificate[] bm() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Lql;)Ljava/lang/String;"
	)
	public static String dl(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ab() {
		return 0;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lql;)[Ljava/security/cert/Certificate;"
	)
	public static Certificate[] il(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()[Ljavax/security/cert/X509Certificate;"
	)
	public X509Certificate[] at() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()[Ljavax/security/cert/X509Certificate;"
	)
	public X509Certificate[] ac() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/security/cert/Certificate;"
	)
	public Certificate[] bz() throws SSLPeerUnverifiedException {
		return this.this$1.ak_fld;
	}

	@ObfuscatedName("isValid")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getLastAccessedTime")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Override
	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	ql(qf var1) {
		this.this$1 = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/security/cert/Certificate;"
	)
	public Certificate[] aa() throws SSLPeerUnverifiedException {
		return this.this$1.ak_fld;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lql;)Ljava/security/Principal;"
	)
	public static Principal cb(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("invalidate")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/Principal;"
	)
	public Principal bj() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfuscatedName("getLocalCertificates")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/security/cert/Certificate;"
	)
	@Override
	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	public static void xy(ql var0) throws SSLPeerUnverifiedException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			throw new UnsupportedOperationException();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/Object;"
	)
	public Object bp(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long ax() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getLocalPrincipal")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/Principal;"
	)
	@Override
	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Object;)V"
	)
	public void bn(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long ay() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getPeerCertificates")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/security/cert/Certificate;"
	)
	@Override
	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.ak_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void ba(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void bg(String var1) {
		throw new UnsupportedOperationException();
	}
}
