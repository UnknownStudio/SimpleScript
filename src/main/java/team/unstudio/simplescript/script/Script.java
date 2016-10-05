package team.unstudio.simplescript.script;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.ConfigurationSerialization;
import org.bukkit.entity.Player;

public class Script implements ConfigurationSerializable {

	static {
		ConfigurationSerialization.registerClass(Script.class);
	}
	
	@Override
	public Map<String, Object> serialize() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("commands", commands);
		return map;
	}

	public static Script deserialize(Map<String, Object> map) {
		return new Script(map);
	}

	public static Script valueOf(Map<String, Object> map) {
		return deserialize(map);
	}
	
	private String name;
	private List<ScriptCommand> commands;
	private boolean editing = false;

	@SuppressWarnings("unchecked")
	public Script(Map<String, Object> map) {
		name = (String) map.get("name");
		commands.addAll((List<? extends ScriptCommand>) map.get("commands"));
	}
	
	public Script(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean execute(Player player,Location location){
		for(ScriptCommand command:commands) if(!command.execute(player, location)) return false;
		return true;
	}

	public boolean isEditing() {
		return editing;
	}

	public void setEditing(boolean editing) {
		this.editing = editing;
	}
}
