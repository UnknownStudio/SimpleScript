package team.unstudio.simplescript.script;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface ScriptCommand {
	
	public boolean execute(Player player,Location location);

}
