package team.unstudio.simplescript.script;

import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.ConfigurationSerialization;

public class Script implements ConfigurationSerializable{
	
	static{
		ConfigurationSerialization.registerClass(Script.class);
	}

	@Override
	public Map<String, Object> serialize() {
		return null;
	}

}
