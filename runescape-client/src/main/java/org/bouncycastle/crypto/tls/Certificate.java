package org.bouncycastle.crypto.tls;

import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("org/bouncycastle/crypto/tls/Certificate")
public class Certificate {
	@ObfuscatedName("getCertificateList")
	@ObfuscatedSignature(
		descriptor = "()[Lorg/bouncycastle/asn1/x509/Certificate;"
	)
	public org.bouncycastle.asn1.x509.Certificate[] getCertificateList() {
		return null;
	}

	private Certificate() throws Exception {
		throw new RuntimeException();
	}
}
