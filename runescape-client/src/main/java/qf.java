import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("qf")
class qf extends SSLSocket {
	// $VF: synthetic field
	@ObfuscatedName("val$host")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String val$host;
	// $VF: synthetic field
	@ObfuscatedName("val$tlsClientProtocol")
	@ObfuscatedSignature(
		descriptor = "Lorg/bouncycastle/crypto/tls/TlsClientProtocol;"
	)
	TlsClientProtocol val$tlsClientProtocol;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Ljava/security/cert/Certificate;"
	)
	Certificate[] ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	qz this$0;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void am(boolean var1) {
	}

	@ObfuscatedName("getInputStream")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/InputStream;"
	)
	@Export("getInputStream")
	@Override
	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@ObfuscatedName("getOutputStream")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/OutputStream;"
	)
	@Export("getOutputStream")
	@Override
	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@ObfuscatedName("close")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("close")
	@Override
	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	qf(qz var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	@ObfuscatedName("getEnableSessionCreation")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("getEnableSessionCreation")
	@Override
	public boolean getEnableSessionCreation() {
		return false;
	}

	@ObfuscatedName("setEnableSessionCreation")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setEnableSessionCreation")
	@Override
	public void setEnableSessionCreation(boolean var1) {
	}

	@ObfuscatedName("getEnabledCipherSuites")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getEnabledCipherSuites")
	@Override
	public String[] getEnabledCipherSuites() {
		return null;
	}

	@ObfuscatedName("setEnabledCipherSuites")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	@Export("setEnabledCipherSuites")
	@Override
	public void setEnabledCipherSuites(String[] var1) {
	}

	@ObfuscatedName("getWantClientAuth")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("getWantClientAuth")
	@Override
	public boolean getWantClientAuth() {
		return false;
	}

	@ObfuscatedName("setUseClientMode")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setUseClientMode")
	@Override
	public void setUseClientMode(boolean var1) {
	}

	@ObfuscatedName("getNeedClientAuth")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("getNeedClientAuth")
	@Override
	public boolean getNeedClientAuth() {
		return false;
	}

	@ObfuscatedName("setNeedClientAuth")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setNeedClientAuth")
	@Override
	public void setNeedClientAuth(boolean var1) {
	}

	@ObfuscatedName("getSession")
	@ObfuscatedSignature(
		descriptor = "()Ljavax/net/ssl/SSLSession;"
	)
	@Export("getSession")
	@Override
	public SSLSession getSession() {
		return new ql(this);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] at() {
		return null;
	}

	@ObfuscatedName("getSupportedCipherSuites")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getSupportedCipherSuites")
	@Override
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@ObfuscatedName("getUseClientMode")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("getUseClientMode")
	@Override
	public boolean getUseClientMode() {
		return false;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bd() {
		return false;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] bl() {
		return null;
	}

	@ObfuscatedName("getSupportedProtocols")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getSupportedProtocols")
	@Override
	public String[] getSupportedProtocols() {
		return null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean an() {
		return false;
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	public static void ll(qf var0) throws IOException, Exception {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.val$tlsClientProtocol.connect(new qi(var0));
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("startHandshake")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("startHandshake")
	@Override
	public void startHandshake() throws IOException {
		try {
			this.val$tlsClientProtocol.connect(new qi(this));
		} catch (Throwable var1) {
			throw new RuntimeException(var1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/OutputStream;"
	)
	public OutputStream av() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	public static void nc(qf var0) throws IOException, Exception {
		try {
			var0.val$tlsClientProtocol.connect(new qi(var0));
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/OutputStream;"
	)
	public OutputStream ae() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public synchronized void ah() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public synchronized void aw() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void be(boolean var1) {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void as(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("removeHandshakeCompletedListener")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	@Export("removeHandshakeCompletedListener")
	@Override
	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void al(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void au(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/WindowEvent;)V"
	)
	public static void fq(tf var0, WindowEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bn() {
		return false;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] bj() {
		return null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void ai(boolean var1) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void aq(boolean var1) {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] ad() {
		return null;
	}

	@ObfuscatedName("setEnabledProtocols")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	@Export("setEnabledProtocols")
	@Override
	public void setEnabledProtocols(String[] var1) {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void ar(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("getEnabledProtocols")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getEnabledProtocols")
	@Override
	public String[] getEnabledProtocols() {
		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	public void aj(String[] var1) {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aa() {
		return false;
	}

	@ObfuscatedName("setWantClientAuth")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setWantClientAuth")
	@Override
	public void setWantClientAuth(boolean var1) {
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bz() {
		return false;
	}

	@ObfuscatedName("addHandshakeCompletedListener")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	@Export("addHandshakeCompletedListener")
	@Override
	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Ljavax/net/ssl/SSLSession;"
	)
	public SSLSession bh() {
		return new ql(this);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] bk() {
		return null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bx() {
		return false;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] bf() {
		return null;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] by() {
		return null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] ao() {
		return null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void af(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bo() {
		return false;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void bp(boolean var1) {
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void bt(boolean var1) {
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void bv(boolean var1) {
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bi() {
		return false;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bu() {
		return false;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void ba(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void bc(boolean var1) {
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)Ljavax/net/ssl/SSLSession;"
	)
	public static SSLSession fv(qf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return new ql(var0);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void bw(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bb() throws IOException {
		try {
			this.val$tlsClientProtocol.connect(new qi(this));
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bg() throws IOException {
		try {
			this.val$tlsClientProtocol.connect(new qi(this));
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bm() {
		return false;
	}
}
