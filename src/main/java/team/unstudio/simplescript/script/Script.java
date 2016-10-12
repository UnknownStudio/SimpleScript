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

import java.util.List;
import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

public class Script implements ConfigurationSerializable {

	@Override
	public Map<String, Object> serialize() {
		return ImmutableMap.<String, Object>of("name", name, "commands", script);
	}

	public static Script deserialize(Map<String, Object> map) {
		return new Script(map);
	}

	public static Script valueOf(Map<String, Object> map) {
		return deserialize(map);
	}

	private String name;
	private List<String> script = Lists.newArrayList();

	@SuppressWarnings("unchecked")
	public Script(Map<String, Object> map) {
		name = (String) map.get("name");
		if (map.containsKey("script"))
			script.addAll((List<String>) map.get("script"));
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

	public List<String> getScriptLines() {
		return script;
	}
}
