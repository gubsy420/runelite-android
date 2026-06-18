import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("qq")
class qq implements TlsAuthentication {
	// $VF: synthetic field
	@ObfuscatedName("this$2")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	qi this$2;

	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)I"
	)
	public static int sr(rg var0) {
		return var0.ah_fld.ah_fld * 491640768 + var0.aw_fld.as(-654080199);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;"
	)
	public TlsCredentials ae(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("notifyServerCertificate")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/Certificate;)V"
	)
	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; var5++) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.ak_fld = (java.security.cert.Certificate[])(java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]);
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@ObfuscatedName("getClientCredentials")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;"
	)
	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/Certificate;)V"
	)
	public void ak(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; var5++) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.ak_fld = (java.security.cert.Certificate[])(java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]);
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/Certificate;)V"
	)
	public void ag(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; var5++) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.ak_fld = (java.security.cert.Certificate[])(java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]);
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/Certificate;)V"
	)
	public void az(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; var5++) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.ak_fld = (java.security.cert.Certificate[])(java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]);
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/Certificate;)V"
	)
	public void av(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; var5++) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.ak_fld = (java.security.cert.Certificate[])(java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]);
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	qq(qi var1) {
		this.this$2 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;"
	)
	public TlsCredentials ah(CertificateRequest var1) throws IOException {
		return null;
	}
}
