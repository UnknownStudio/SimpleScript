package team.unstudio.simplescript.script;

import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.ConfigurationSerialization;

public class Script implements ConfigurationSerializable {

	static {
		ConfigurationSerialization.registerClass(Script.class);
	}

	public Script(Map<String, Object> map) {
	}

	@Override
	public Map<String, Object> serialize() {
		return null;
	}

	public static Script deserialize(Map<String, Object> map) {
		return new Script(map);
	}

	public static Script valueOf(Map<String, Object> map) {
		return deserialize(map);
	}
}
