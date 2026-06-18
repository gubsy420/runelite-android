package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("org/bouncycastle/crypto/tls/TlsClientProtocol")
public class TlsClientProtocol {
	@ObfuscatedName("getOutputStream")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/OutputStream;"
	)
	public OutputStream getOutputStream() {
		return null;
	}

	@ObfuscatedName("getInputStream")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/InputStream;"
	)
	public InputStream getInputStream() {
		return null;
	}

	@ObfuscatedName("close")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void close() {
	}

	@ObfuscatedName("connect")
	@ObfuscatedSignature(
		descriptor = "(Lorg/bouncycastle/crypto/tls/TlsClient;)V"
	)
	public void connect(TlsClient var1) {
	}

	public TlsClientProtocol(InputStream var1, OutputStream var2, SecureRandom var3) throws Exception {
		throw new RuntimeException();
	}
}
