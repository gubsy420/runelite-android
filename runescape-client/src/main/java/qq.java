import java.io.ByteArrayInputStream;
import java.io.EOFException;
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

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)Lko;"
	)
	public static ko fc(rg var0) {
		return var0.af_fld;
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

	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "(Lai;)Lal;"
	)
	public static al vv(ai var0) {
		if (null != var0.ak_fld) {
			var0.ak_fld.az_fld.lock();

			al var1;
			try {
				var1 = var0.av();
			} finally {
				var0.ak_fld.az_fld.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	qq(qi var1) {
		this.this$2 = var1;
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(Lgc;ILuo;I)V"
	)
	public static void ft(gc var0, int var1, uo var2, int var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2.az(var1)) {
			var0.al(var2.aw_fld[var1], 0, var2.aw_fld[var1].length - 1, -1, -1, var2, var3, -844182513);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;"
	)
	public TlsCredentials ah(CertificateRequest var1) throws IOException {
		return null;
	}
}
