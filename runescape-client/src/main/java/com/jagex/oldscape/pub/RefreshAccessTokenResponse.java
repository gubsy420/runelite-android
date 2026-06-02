package com.jagex.oldscape.pub;

import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("com/jagex/oldscape/pub/RefreshAccessTokenResponse")
public interface RefreshAccessTokenResponse {
	@ObfuscatedName("getAccessToken")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String getAccessToken();

	@ObfuscatedName("isSuccess")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean isSuccess();

	@ObfuscatedName("getRefreshToken")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String getRefreshToken();
}
