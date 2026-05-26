package net.runelite.client.plugins.gpugles;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(GpuGlesPluginConfig.GROUP)
public interface GpuGlesPluginConfig extends Config
{
	String GROUP = "gpugles";

	int MAX_DISTANCE = 184;
	int MAX_FOG_DEPTH = 100;

	@Range(max = MAX_DISTANCE)
	@ConfigItem(keyName = "drawDistance", name = "Draw distance", description = "Draw distance in tiles.", position = 1)
	default int drawDistance() { return 50; }

	@Range(max = MAX_FOG_DEPTH)
	@ConfigItem(keyName = "fogDepth", name = "Fog depth", description = "Distance from scene edge fog starts.", position = 2)
	default int fogDepth() { return 0; }

	@Range(max = 5)
	@ConfigItem(keyName = "expandedMapLoadingChunks", name = "Expanded map loading", description = "Extra 8-tile chunks to keep loaded.", position = 3)
	default int expandedMapLoadingZones() { return 3; }

	@ConfigItem(keyName = "smoothBanding", name = "Smooth banding", description = "Remove color banding artifacts.", position = 4)
	default boolean smoothBanding() { return true; }

	@ConfigItem(keyName = "hideUnrelatedMaps", name = "Hide unrelated maps", description = "Filter out invisible region areas.", position = 10)
	default boolean hideUnrelatedMaps() { return true; }

	@ConfigItem(keyName = "brightTextures", name = "Bright textures", description = "Legacy bright texture lighting.", position = 11)
	default boolean brightTextures() { return false; }

	@Range(max = 100)
	@ConfigItem(keyName = "colorBlindIntensity", name = "Color blind intensity", description = "0-100", position = 12)
	default int colorBlindIntensity() { return 100; }

	@Range(max = 16)
	@ConfigItem(keyName = "anisotropicFilteringLevel", name = "Anisotropic filtering", description = "0=off, higher=better quality.", position = 13)
	default int anisotropicFilteringLevel() { return 1; }

	@ConfigItem(keyName = "removeVertexSnapping", name = "Remove vertex snapping", description = "Smooth vertex animation.", position = 5)
	default boolean removeVertexSnapping() { return true; }

	@ConfigItem(keyName = "unlockFps", name = "Unlock FPS", description = "Remove the 50 FPS camera cap.", position = 6)
	default boolean unlockFps() { return true; }

	@Range(min = 1, max = 999)
	@ConfigItem(keyName = "fpsTarget", name = "FPS target", description = "Target FPS when FPS is unlocked.", position = 7)
	default int fpsTarget() { return 60; }

	@Range(max = 100)
	@ConfigItem(keyName = "brightness", name = "Brightness", description = "Scene brightness.", position = 8)
	default int brightness() { return 50; }
}
