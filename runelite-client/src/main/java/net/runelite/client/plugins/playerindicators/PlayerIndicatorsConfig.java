/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.playerindicators;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(
	keyName = "playerindicators",
	name = "Player Indicators",
	description = "Configuration for the player indicators plugin"
)
public interface PlayerIndicatorsConfig extends Config
{
	@ConfigItem(
		keyName = "drawOwnName",
		name = "Draw own name",
		description = "Configures whether or not own name should be drawn"
	)
	default boolean drawOwnName()
	{
		return false;
	}

	@ConfigItem(
		keyName = "drawFriendNames",
		name = "Draw friend names",
		description = "Configures whether or not names of player friends should be drawn"
	)
	default boolean drawFriendNames()
	{
		return true;
	}

	@ConfigItem(
		keyName = "drawClanMemberNames",
		name = "Draw clan member names",
		description = "Configures whether or not names of player's clan members should be drawn"
	)
	default boolean drawClanMemberNames()
	{
		return true;
	}

	@ConfigItem(
		keyName = "drawNonClanMemberNames",
		name = "Draw non-clan member names",
		description = "Configures whether or not names of non-clan members should be drawn"
	)
	default boolean drawNonClanMemberNames()
	{
		return false;
	}

	@ConfigItem(
		keyName = "drawPlayerTiles",
		name = "Draw tiles",
		description = "Configures whether or not tiles under players with rendered names should be drawn"
	)
	default boolean drawTiles()
	{
		return false;
	}
}
