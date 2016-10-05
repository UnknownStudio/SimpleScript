package team.unstudio.simplescript.script;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;

public class ScriptManager {
	
	private static final ScriptManager INSTANCE = new ScriptManager();
	
	public static ScriptManager getInstance() {
		return INSTANCE;
	}

	private final Map<Player,Script> editing = new HashMap<>();
	private final List<Script> scripts = new ArrayList<>();
	
	public Map<Player, Script> getEditing() {
		return editing;
	}

	public List<Script> getScripts() {
		return scripts;
	}
}
