package com.jagex.oldscape.pub;

import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("com/jagex/oldscape/pub/OtlTokenResponse")
public interface OtlTokenResponse {
	@ObfuscatedName("getToken")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String getToken();

	@ObfuscatedName("isSuccess")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean isSuccess();
}
