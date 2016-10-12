/*
 * Copyright (c) 2016, Unknown Domain. All rights reserved.
 * GUN GPLv3. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package team.unstudio.simplescript.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public final class SSListener implements Listener {
	
	@EventHandler(priority = EventPriority.MONITOR)
	public final void onPlayerMove(PlayerMoveEvent evt) {
		
	}
	
	@EventHandler(priority = EventPriority.MONITOR)
	public final void onPlayerClick() {
		
	}

}
