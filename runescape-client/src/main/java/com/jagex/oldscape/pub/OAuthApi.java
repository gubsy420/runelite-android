package com.jagex.oldscape.pub;

import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("com/jagex/oldscape/pub/OAuthApi")
public interface OAuthApi {
	@ObfuscatedName("acr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void acr(int var1);

	@ObfuscatedName("acv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean acv();

	@ObfuscatedName("isOnLoginScreen")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean isOnLoginScreen();

	@ObfuscatedName("acw")
	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	void acw(RefreshAccessTokenRequester var1);

	@ObfuscatedName("ace")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ace(int var1);

	@ObfuscatedName("getAccountHash")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	long getAccountHash();

	@ObfuscatedName("aco")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aco(int var1);

	@ObfuscatedName("acz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean acz();

	@ObfuscatedName("acd")
	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	void acd(OtlTokenRequester var1);

	@ObfuscatedName("acs")
	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	void acs(OtlTokenRequester var1);

	@ObfuscatedName("ach")
	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	void ach(OtlTokenRequester var1);

	@ObfuscatedName("acj")
	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	void acj(OtlTokenRequester var1);

	@ObfuscatedName("setClient")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void setClient(int var1);

	@ObfuscatedName("acn")
	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	void acn(RefreshAccessTokenRequester var1);

	@ObfuscatedName("setOtlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	void setOtlTokenRequester(OtlTokenRequester var1);

	@ObfuscatedName("setRefreshTokenRequester")
	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

	@ObfuscatedName("acy")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	long acy();
}
