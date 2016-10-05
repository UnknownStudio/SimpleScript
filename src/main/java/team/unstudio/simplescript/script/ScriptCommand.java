package team.unstudio.simplescript.script;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;

import com.google.common.collect.Maps;

public abstract class ScriptCommand implements ConfigurationSerializable{
	
	private String[] args = new String[0];
	
	public abstract boolean execute(Player player,Location location);
	
	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}
	
	@Override
	public Map<String, Object> serialize() {
		Map<String,Object> map = Maps.newHashMap();
		map.put("operator", getOperator(this));
		map.put("args", Arrays.asList(args));
		return map;
	}
	
	@SuppressWarnings("unchecked")
	public static ScriptCommand deserialize(Map<String, Object> map) {
		return newScriptCommand((String)map.get("operator"), (List<String>)map.get("args"));
	}

	public static ScriptCommand valueOf(Map<String, Object> map) {
		return deserialize(map);
	}
	
	private static final Map<String,Class<? extends ScriptCommand>> commands = new HashMap<>();
	
	public static void registerScriptCommand(String operator,Class<? extends ScriptCommand> clazz){
		if(commands.containsKey(operator)) throw new IllegalArgumentException();
		commands.put(operator, clazz);
	}
	
	public static ScriptCommand newScriptCommand(String operator,String ...args){
		if(!commands.containsKey(operator)) return null;
		ScriptCommand command = null;
		try {
			command = commands.get(operator).newInstance();
			command.setArgs(args);
		} catch (InstantiationException | IllegalAccessException e) {}
		return command;
	}
	
	public static ScriptCommand newScriptCommand(String operator,List<String> args){
		return newScriptCommand(operator, args.toArray(new String[0]));
	}
	
	public static String getOperator(ScriptCommand obj){
		return getOperator(obj.getClass());
	}
	
	public static String getOperator(Class<? extends ScriptCommand> clazz){
		for(String key:commands.keySet()) if(commands.get(key).equals(clazz)) return key;
		return null;
	}
}
