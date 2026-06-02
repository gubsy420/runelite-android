package com.jagex.oldscape.pub;

import java.net.URL;
import java.util.Map;
import java.util.concurrent.Future;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("com/jagex/oldscape/pub/RefreshAccessTokenRequester")
public interface RefreshAccessTokenRequester {
	@ObfuscatedName("request")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/net/URL;Ljava/util/Map;Ljava/lang/String;)Ljava/util/concurrent/Future;"
	)
	Future request(String var1, URL var2, Map var3, String var4);
}
