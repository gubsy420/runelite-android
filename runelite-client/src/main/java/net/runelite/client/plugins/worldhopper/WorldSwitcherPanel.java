/*
 * Copyright (c) 2018, Psikoi <https://github.com/Psikoi>
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
package net.runelite.client.plugins.worldhopper;

import com.google.common.collect.Ordering;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.EnumComposition;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.PluginPanel;
import net.runelite.http.api.worlds.World;
import net.runelite.http.api.worlds.WorldType;

@Slf4j
class WorldSwitcherPanel extends PluginPanel
{
	private static final Color ODD_ROW = new Color(44, 44, 44);

	private static final int WORLD_COLUMN_WIDTH = 60;
	private static final int PLAYERS_COLUMN_WIDTH = 40;
	private static final int PING_COLUMN_WIDTH = 47;

	private final JPanel listContainer = new JPanel();

	@Getter(AccessLevel.PACKAGE)
	private boolean active;

	private WorldTableHeader worldHeader;
	private WorldTableHeader playersHeader;
	private WorldTableHeader activityHeader;
	private WorldTableHeader pingHeader;

	private WorldOrder orderIndex = WorldOrder.WORLD;
	private boolean ascendingOrder = true;

	private final ArrayList<WorldTableRow> rows = new ArrayList<>();
	private final WorldHopperPlugin plugin;
	@Setter(AccessLevel.PACKAGE)
	private SubscriptionFilterMode subscriptionFilterMode;
	@Setter(AccessLevel.PACKAGE)
	private Set<RegionFilterMode> regionFilterMode;
	@Setter(AccessLevel.PACKAGE)
	private Set<WorldTypeFilter> worldTypeFilters;

	WorldSwitcherPanel(WorldHopperPlugin plugin)
	{
		this.plugin = plugin;

		setBorder(null);
		setLayout(new DynamicGridLayout(0, 1));

		JPanel headerContainer = buildHeader();

		listContainer.setLayout(new GridLayout(0, 1));

		add(headerContainer);
		add(listContainer);
	}

	@Override
	public void onActivate()
	{
		active = true;
		updateList();
	}

	@Override
	public void onDeactivate()
	{
		active = false;
	}

	void switchCurrentHighlight(int newWorld, int lastWorld)
	{
		for (WorldTableRow row : rows)
		{
			if (row.getWorld().getId() == newWorld)
			{
				row.recolour(true);
			}
			else if (row.getWorld().getId() == lastWorld)
			{
				row.recolour(false);
			}
		}
	}

	void updateListData(Map<Integer, Integer> worldData)
	{
		for (WorldTableRow worldTableRow : rows)
		{
			World world = worldTableRow.getWorld();
			Integer playerCount = worldData.get(world.getId());
			if (playerCount != null)
			{
				worldTableRow.updatePlayerCount(playerCount);
			}
		}

		// If the list is being ordered by player count, then it has to be re-painted
		// to properly display the new data
		if (orderIndex == WorldOrder.PLAYERS)
		{
			updateList();
		}
	}

	void updatePing(int world, int ping)
	{
		for (WorldTableRow worldTableRow : rows)
		{
			if (worldTableRow.getWorld().getId() == world)
			{
				worldTableRow.setPing(ping);

				// If the panel is sorted by ping, re-sort it
				if (orderIndex == WorldOrder.PING)
				{
					updateList();
				}
				break;
			}
		}
	}

	void hidePing()
	{
		for (WorldTableRow worldTableRow : rows)
		{
			worldTableRow.hidePing();
		}
	}

	void showPing()
	{
		for (WorldTableRow worldTableRow : rows)
		{
			worldTableRow.showPing();
		}
	}

	void updateList()
	{
		// rows is mutated by the WorldHopper ping/refresh background thread (populate)
		// and read here on the AWT dispatch thread. Sort on a snapshot under a brief
		// lock so ArrayList.sort can't observe a concurrent structural modification
		// and throw CME mid-sort.
		List<WorldTableRow> snapshot;
		synchronized (rows)
		{
			snapshot = new ArrayList<>(rows);
		}

		snapshot.sort((r1, r2) ->
		{
			switch (orderIndex)
			{
				case PING:
					// Leave worlds with unknown ping at the bottom
					return getCompareValue(r1, r2, row ->
					{
						int ping = row.getPing();
						return ping > 0 ? ping : null;
					});
				case WORLD:
					return getCompareValue(r1, r2, row -> row.getWorld().getId());
				case PLAYERS:
					return getCompareValue(r1, r2, WorldTableRow::getPlayerCount);
				case ACTIVITY:
					// Leave empty activity worlds on the bottom of the list
					return getCompareValue(r1, r2, row ->
					{
						String activity = row.getWorld().getActivity();
						return !activity.equals("-") ? activity : null;
					});
				default:
					return 0;
			}
		});

		snapshot.sort((r1, r2) ->
		{
			boolean b1 = plugin.isFavorite(r1.getWorld());
			boolean b2 = plugin.isFavorite(r2.getWorld());
			return Boolean.compare(b2, b1);
		});

		synchronized (rows)
		{
			rows.clear();
			rows.addAll(snapshot);
		}

		listContainer.removeAll();

		for (int i = 0; i < snapshot.size(); i++)
		{
			WorldTableRow row = snapshot.get(i);
			row.setBackground(i % 2 == 0 ? ODD_ROW : ColorScheme.DARK_GRAY_COLOR);
			listContainer.add(row);
		}

		listContainer.revalidate();
		listContainer.repaint();
	}

	private int getCompareValue(WorldTableRow row1, WorldTableRow row2, Function<WorldTableRow, Comparable> compareByFn)
	{
		Ordering<Comparable> ordering = Ordering.natural();
		if (!ascendingOrder)
		{
			ordering = ordering.reverse();
		}
		ordering = ordering.nullsLast();
		return ordering.compare(compareByFn.apply(row1), compareByFn.apply(row2));
	}

	void updateFavoriteMenu(int world, boolean favorite)
	{
		for (WorldTableRow row : rows)
		{
			if (row.getWorld().getId() == world)
			{
				row.setFavoriteMenu(favorite);
			}
		}
	}

	void populate(List<World> worlds, @Nullable EnumComposition worldLocations)
	{
		rows.clear();

		// One-shot visibility into what activity / player-count the worlds API is feeding us.
		// If the field is null for every world here the issue is upstream (HTTP / JSON parse);
		// if it's populated but missing on screen the issue is in WorldTableRow rendering.
		if (!worlds.isEmpty())
		{
			World w0 = worlds.get(0);
			log.info("worldhopper populate: {} worlds, sample id={} activity='{}' players={}",
				worlds.size(), w0.getId(), w0.getActivity(), w0.getPlayers());
		}

		for (int i = 0; i < worlds.size(); i++)
		{
			World world = worlds.get(i);

			switch (subscriptionFilterMode)
			{
				case FREE:
					if (world.getTypes().contains(WorldType.MEMBERS))
					{
						continue;
					}
					break;
				case MEMBERS:
					if (!world.getTypes().contains(WorldType.MEMBERS))
					{
						continue;
					}
					break;
			}

			if (!regionFilterMode.isEmpty() && world.getRegion() != null && !regionFilterMode.contains(RegionFilterMode.of(world.getRegion())))
			{
				continue;
			}

			if (!worldTypeFilters.isEmpty())
			{
				boolean matches = false;
				for (WorldTypeFilter worldTypeFilter : worldTypeFilters)
				{
					matches |= worldTypeFilter.matches(world.getTypes());
				}
				if (!matches)
				{
					continue;
				}
			}

			rows.add(buildRow(world, i % 2 == 0,
				world.getId() == plugin.getCurrentWorld() && plugin.getLastWorld() != 0,
				plugin.isFavorite(world),
				worldLocations != null ? worldLocations.getIntValue(world.getId()) : -1));
		}

		updateList();
	}

	private void orderBy(WorldOrder order)
	{
		pingHeader.highlight(false, ascendingOrder);
		worldHeader.highlight(false, ascendingOrder);
		playersHeader.highlight(false, ascendingOrder);
		activityHeader.highlight(false, ascendingOrder);

		switch (order)
		{
			case PING:
				pingHeader.highlight(true, ascendingOrder);
				break;
			case WORLD:
				worldHeader.highlight(true, ascendingOrder);
				break;
			case PLAYERS:
				playersHeader.highlight(true, ascendingOrder);
				break;
			case ACTIVITY:
				activityHeader.highlight(true, ascendingOrder);
				break;
		}

		orderIndex = order;
		updateList();
	}

	/**
	 * Builds the entire table header.
	 */
	private JPanel buildHeader()
	{
		JPanel header = new JPanel(new BorderLayout());
		JPanel leftSide = new JPanel(new BorderLayout());
		JPanel rightSide = new JPanel(new BorderLayout());

		pingHeader = new WorldTableHeader("Ping", orderIndex == WorldOrder.PING, ascendingOrder, plugin::refresh);
		pingHeader.setPreferredSize(new Dimension(PING_COLUMN_WIDTH, 0));
		pingHeader.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent mouseEvent)
			{
				if (SwingUtilities.isRightMouseButton(mouseEvent))
				{
					return;
				}
				ascendingOrder = orderIndex != WorldOrder.PING || !ascendingOrder;
				orderBy(WorldOrder.PING);
			}
		});

		worldHeader = new WorldTableHeader("World", orderIndex == WorldOrder.WORLD, ascendingOrder, plugin::refresh);
		worldHeader.setPreferredSize(new Dimension(WORLD_COLUMN_WIDTH, 0));
		worldHeader.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent mouseEvent)
			{
				if (SwingUtilities.isRightMouseButton(mouseEvent))
				{
					return;
				}
				ascendingOrder = orderIndex != WorldOrder.WORLD || !ascendingOrder;
				orderBy(WorldOrder.WORLD);
			}
		});

		playersHeader = new WorldTableHeader("#", orderIndex == WorldOrder.PLAYERS, ascendingOrder, plugin::refresh);
		playersHeader.setPreferredSize(new Dimension(PLAYERS_COLUMN_WIDTH, 0));
		playersHeader.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent mouseEvent)
			{
				if (SwingUtilities.isRightMouseButton(mouseEvent))
				{
					return;
				}
				ascendingOrder = orderIndex != WorldOrder.PLAYERS || !ascendingOrder;
				orderBy(WorldOrder.PLAYERS);
			}
		});

		activityHeader = new WorldTableHeader("Activity", orderIndex == WorldOrder.ACTIVITY, ascendingOrder, plugin::refresh);
		activityHeader.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent mouseEvent)
			{
				if (SwingUtilities.isRightMouseButton(mouseEvent))
				{
					return;
				}
				ascendingOrder = orderIndex != WorldOrder.ACTIVITY || !ascendingOrder;
				orderBy(WorldOrder.ACTIVITY);
			}
		});

		leftSide.add(worldHeader, BorderLayout.WEST);
		leftSide.add(playersHeader, BorderLayout.CENTER);

		rightSide.add(activityHeader, BorderLayout.CENTER);
		rightSide.add(pingHeader, BorderLayout.EAST);

		header.add(leftSide, BorderLayout.WEST);
		header.add(rightSide, BorderLayout.CENTER);

		return header;
	}

	/**
	 * Builds a table row, that displays the world's information.
	 */
	private WorldTableRow buildRow(World world, boolean stripe, boolean current, boolean favorite, int worldLocation)
	{
		WorldTableRow row = new WorldTableRow(world, current, favorite, plugin.getStoredPing(world),
			plugin::hopTo,
			(w, add) ->
			{
				if (add)
				{
					plugin.addToFavorites(w);
				}
				else
				{
					plugin.removeFromFavorites(w);
				}

				updateList();
			},
			worldLocation
		);
		row.setBackground(stripe ? ODD_ROW : ColorScheme.DARK_GRAY_COLOR);
		return row;
	}

	/**
	 * Enumerates the multiple ordering options for the world list.
	 */
	private enum WorldOrder
	{
		WORLD,
		PLAYERS,
		ACTIVITY,
		PING
	}
}
