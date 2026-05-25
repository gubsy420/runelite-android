package net.runelite.awt.impl;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;

public final class HeadlessGraphicsDevice extends GraphicsDevice {
    private final GraphicsConfiguration config;

    HeadlessGraphicsDevice(GraphicsConfiguration config) {
        this.config = config;
    }

    @Override public int getType() { return TYPE_RASTER_SCREEN; }
    @Override public String getIDstring() { return "android-headless"; }
    @Override public GraphicsConfiguration[] getConfigurations() { return new GraphicsConfiguration[]{config}; }
    @Override public GraphicsConfiguration getDefaultConfiguration() { return config; }
}
