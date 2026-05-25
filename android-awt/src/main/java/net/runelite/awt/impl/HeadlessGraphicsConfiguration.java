package net.runelite.awt.impl;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;

public final class HeadlessGraphicsConfiguration extends GraphicsConfiguration {
    public static final HeadlessGraphicsConfiguration INSTANCE = new HeadlessGraphicsConfiguration();

    private final GraphicsDevice device = new HeadlessGraphicsDevice(this);

    private HeadlessGraphicsConfiguration() {}

    @Override public GraphicsDevice getDevice() { return device; }
    @Override public Rectangle getBounds() { return new Rectangle(0, 0, 1920, 1080); }
}
