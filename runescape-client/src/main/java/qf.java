import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
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

	@ObfuscatedName("getInputStream")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/InputStream;"
	)
	@Override
	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@ObfuscatedName("getOutputStream")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/OutputStream;"
	)
	@Override
	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@ObfuscatedName("close")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
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
	@Override
	public boolean getEnableSessionCreation() {
		return false;
	}

	@ObfuscatedName("setEnableSessionCreation")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setEnableSessionCreation(boolean var1) {
	}

	@ObfuscatedName("getEnabledCipherSuites")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Override
	public String[] getEnabledCipherSuites() {
		return null;
	}

	@ObfuscatedName("setEnabledCipherSuites")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	@Override
	public void setEnabledCipherSuites(String[] var1) {
	}

	@ObfuscatedName("getWantClientAuth")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean getWantClientAuth() {
		return false;
	}

	@ObfuscatedName("setUseClientMode")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setUseClientMode(boolean var1) {
	}

	@ObfuscatedName("getNeedClientAuth")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean getNeedClientAuth() {
		return false;
	}

	@ObfuscatedName("setNeedClientAuth")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setNeedClientAuth(boolean var1) {
	}

	@ObfuscatedName("getSession")
	@ObfuscatedSignature(
		descriptor = "()Ljavax/net/ssl/SSLSession;"
	)
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
	@Override
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@ObfuscatedName("getUseClientMode")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
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

	@ObfuscatedName("getSupportedProtocols")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
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

	@ObfuscatedName("startHandshake")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void startHandshake() throws IOException {
		try {
			this.val$tlsClientProtocol.connect(new qi(this));
		} catch (Throwable var1) {
			throw new RuntimeException(var1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/InputStream;"
	)
	public InputStream ag() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/InputStream;"
	)
	public InputStream ak() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/OutputStream;"
	)
	public OutputStream az() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/OutputStream;"
	)
	public OutputStream av() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
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

	@ObfuscatedName("removeHandshakeCompletedListener")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	@Override
	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void au(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax() {
		return false;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void aq(boolean var1) {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] ap() {
		return null;
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
	@Override
	public void setEnabledProtocols(String[] var1) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	public void ab(String[] var1) {
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
	@Override
	public String[] getEnabledProtocols() {
		return null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] ac() {
		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	public void aj(String[] var1) {
	}

	@ObfuscatedName("zd")
	@ObfuscatedSignature(
		descriptor = "(Lpn;)Lwn;"
	)
	public static wn zd(pn var0) {
		return var0.as_fld;
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void br(boolean var1) {
	}

	@ObfuscatedName("addHandshakeCompletedListener")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	@Override
	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Ljavax/net/ssl/SSLSession;"
	)
	public SSLSession bs() {
		return new ql(this);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	public static void ae(qf var0) throws IOException, Exception {
		try {
			var0.val$tlsClientProtocol.connect(new qi(var0));
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void bw(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bq() throws IOException {
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cd() throws IOException {
		try {
			this.val$tlsClientProtocol.connect(new qi(this));
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] ao() {
		return null;
	}
}
