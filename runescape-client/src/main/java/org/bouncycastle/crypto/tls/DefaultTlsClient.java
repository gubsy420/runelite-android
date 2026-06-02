package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("org/bouncycastle/crypto/tls/DefaultTlsClient")
public abstract class DefaultTlsClient implements TlsClient {
	@ObfuscatedName("getClientExtensions")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Hashtable;"
	)
	public Hashtable getClientExtensions() throws IOException {
		return null;
	}

	public DefaultTlsClient() throws Exception {
		throw new RuntimeException();
	}
}
