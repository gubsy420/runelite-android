package net.runelite.client.plugins.gpugles;

/** Mirrors net.runelite.client.plugins.gpu.GLBuffer — field names kept identical
 *  (glBufferId, size) so ported call sites copy verbatim. */
final class GlesBuffer
{
	String name;
	int glBufferId = -1;
	int size = -1;

	GlesBuffer(String name) { this.name = name; }
}
