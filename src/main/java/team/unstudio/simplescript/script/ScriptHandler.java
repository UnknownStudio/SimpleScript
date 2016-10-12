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

package team.unstudio.simplescript.script;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class ScriptHandler {

	private final Player player;
	private final Location location;
	private final Script script;

	private int scriptLineIndex = 0;

	private ScriptHandler(Script script, Player player, Location location) {
		this.script = script;
		this.player = player;
		this.location = location;
	}

	public Player getPlayer() {
		return player;
	}

	public Location getLocation() {
		return location;
	}

	public Script getScript() {
		return script;
	}

	public int getScriptLineIndex() {
		return scriptLineIndex;
	}

	public String getScriptLine() {
		return script.getScriptLines().get(scriptLineIndex);
	}

	public boolean execute() {
		for (; scriptLineIndex < script.getScriptLines().size(); scriptLineIndex++) {

		}
		return true;
	}
}
