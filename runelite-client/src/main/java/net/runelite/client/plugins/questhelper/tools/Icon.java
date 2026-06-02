/*
 *
 *  * Copyright (c) 2021, Senmori
 *  * All rights reserved.
 *  *
 *  * Redistribution and use in source and binary forms, with or without
 *  * modification, are permitted provided that the following conditions are met:
 *  *
 *  * 1. Redistributions of source code must retain the above copyright notice, this
 *  *    list of conditions and the following disclaimer.
 *  * 2. Redistributions in binary form must reproduce the above copyright notice,
 *  *    this list of conditions and the following disclaimer in the documentation
 *  *    and/or other materials provided with the distribution.
 *  *
 *  * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *  * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 *  * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package net.runelite.client.plugins.questhelper.tools;

import net.runelite.client.plugins.questhelper.QuestHelperPlugin;
import net.runelite.client.util.ImageUtil;

import javax.annotation.Nonnull;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.function.UnaryOperator;

public enum Icon
{
	CLOSE("/net/runelite/client/plugins/questhelper/close.png"),
	COLLAPSED("/net/runelite/client/plugins/questhelper/collapsed.png"),
	DISCORD("/net/runelite/client/plugins/questhelper/discord.png"),
	PATREON("/net/runelite/client/plugins/questhelper/patreon.png"),
	GITHUB("/net/runelite/client/plugins/questhelper/github.png"),
	SETTINGS("/net/runelite/client/plugins/questhelper/settings_icon.png"),
	EXPANDED("/net/runelite/client/plugins/questhelper/expanded.png"),
	ICON_BACKGROUND("/net/runelite/client/plugins/questhelper/icon_background.png"),
	INFO_ICON("/net/runelite/client/plugins/questhelper/info_icon.png"),
	QUEST_ICON("/net/runelite/client/plugins/questhelper/quest_icon.png"),
	QUEST_STEP_ARROW("/net/runelite/client/plugins/questhelper/quest_step_arrow.png"),
	QUEST_STEP_ARROW_45("/net/runelite/client/plugins/questhelper/quest_step_arrow_45.png"),
	QUEST_STEP_ARROW_90("/net/runelite/client/plugins/questhelper/quest_step_arrow_90.png"),
	QUEST_STEP_ARROW_135("/net/runelite/client/plugins/questhelper/quest_step_arrow_135.png"),
	QUEST_STEP_ARROW_180("/net/runelite/client/plugins/questhelper/quest_step_arrow_180.png"),
	QUEST_STEP_ARROW_225("/net/runelite/client/plugins/questhelper/quest_step_arrow_225.png"),
	QUEST_STEP_ARROW_270("/net/runelite/client/plugins/questhelper/quest_step_arrow_270.png"),
	QUEST_STEP_ARROW_315("/net/runelite/client/plugins/questhelper/quest_step_arrow_315.png"),
	START("/net/runelite/client/plugins/questhelper/start.png"),
	MAX_HITSPLAT("/net/runelite/client/plugins/questhelper/maxHitsplat.png"),
	BLUE_HITSPLAT("/net/runelite/client/plugins/questhelper/blueHitsplat.png"),
	;

	private final String file;
	Icon(String file)
	{
		this.file = file;
	}

	/**
	 * Get the raw {@link BufferedImage} of this icon.
	 * @return {@link BufferedImage} of the icon
	 */
	public BufferedImage getImage()
	{
		return ImageUtil.loadImageResource(QuestHelperPlugin.class, file);
	}

	/**
	 * @return the {@link ImageIcon} with no modifications. Equivalent to {@code getIcon(UnaryOperator.identity())}
	 */
	public ImageIcon getIcon()
	{
		return getIcon(UnaryOperator.identity());
	}

	/**
	 * Return this icon.
	 * <br>
	 * The {@link UnaryOperator} is applied to the {@link BufferedImage}. The {@link ImageIcon}
	 * is then created using that modified image.
	 *
	 * @param func the {@link UnaryOperator} to apply to the image
	 * @return the modified {@link ImageIcon}
	 */
	public ImageIcon getIcon(@Nonnull UnaryOperator<BufferedImage> func)
	{
		BufferedImage img = func.apply(getImage());
		return new ImageIcon(img);
	}
}
