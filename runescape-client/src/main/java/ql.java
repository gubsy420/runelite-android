import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.api.annotations.Export;
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/security/cert/Certificate;"
	)
	public Certificate[] ai() throws SSLPeerUnverifiedException {
		return this.this$1.ak_fld;
	}

	@ObfuscatedName("getApplicationBufferSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getApplicationBufferSize")
	@Override
	public int getApplicationBufferSize() {
		return 0;
	}

	@ObfuscatedName("getCipherSuite")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getCipherSuite")
	@Override
	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getCreationTime")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Export("getCreationTime")
	@Override
	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Export("getId")
	@Override
	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lql;)Ljava/lang/String;"
	)
	public static String hi(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

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

	@ObfuscatedName("getSessionContext")
	@ObfuscatedSignature(
		descriptor = "()Ljavax/net/ssl/SSLSessionContext;"
	)
	@Export("getSessionContext")
	@Override
	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getPacketBufferSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPacketBufferSize")
	@Override
	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Lql;)Ljava/lang/String;"
	)
	public static String er(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getPeerCertificateChain")
	@ObfuscatedSignature(
		descriptor = "()[Ljavax/security/cert/X509Certificate;"
	)
	@Export("getPeerCertificateChain")
	@Override
	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
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
	@Export("getPeerHost")
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
	@Export("getPeerPort")
	@Override
	public int getPeerPort() {
		return 0;
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lql;Ljava/lang/String;)Ljava/lang/Object;"
	)
	public static Object nr(ql var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getProtocol")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getProtocol")
	@Override
	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getPeerPrincipal")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/Principal;"
	)
	@Export("getPeerPrincipal")
	@Override
	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ab() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getValueNames")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getValueNames")
	@Override
	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int az() {
		return 0;
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
	@Export("removeValue")
	@Override
	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ak() {
		return 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ag() {
		return 0;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void bw(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "(Lql;)I"
	)
	public static int yo(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		return 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long aw() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Lql;)J"
	)
	public static long fs(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] ar() {
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

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lqc;)I"
	)
	public static int nd(qc var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ag_fld;
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lql;)Ljava/security/Principal;"
	)
	public static Principal kx(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getValue")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/Object;"
	)
	@Export("getValue")
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

	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "(Lql;)[Ljava/security/cert/Certificate;"
	)
	public static Certificate[] zo(ql var0) throws SSLPeerUnverifiedException {
		return var0.this$1.ak_fld;
	}

	@ObfuscatedName("putValue")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Object;)V"
	)
	@Export("putValue")
	@Override
	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/security/cert/Certificate;"
	)
	public Certificate[] bz() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/Principal;"
	)
	public Principal aq() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/Principal;"
	)
	public Principal am() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ao() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/security/cert/Certificate;"
	)
	public Certificate[] bd() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()[Ljavax/security/cert/X509Certificate;"
	)
	public X509Certificate[] ac() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfuscatedName("isValid")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isValid")
	@Override
	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getLastAccessedTime")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Export("getLastAccessedTime")
	@Override
	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String br() {
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

	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "(Lql;)J"
	)
	public static long ty(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bh() {
		return 0;
	}

	@ObfuscatedName("invalidate")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bf() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String by() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bi() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("getLocalCertificates")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/security/cert/Certificate;"
	)
	@Export("getLocalCertificates")
	@Override
	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/Object;"
	)
	public Object bp(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/Object;"
	)
	public Object bt(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lql;)I"
	)
	public static int dv(ql var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return 0;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bv() {
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
	@Export("getLocalPrincipal")
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
	@Export("getPeerCertificates")
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void bq(String var1) {
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
