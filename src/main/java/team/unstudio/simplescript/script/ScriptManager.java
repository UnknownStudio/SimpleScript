package team.unstudio.simplescript.script;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import team.unstudio.simplescript.SimpleScript;

public final class ScriptManager {
	
	private static final ScriptManager INSTANCE = new ScriptManager();
	
	public static ScriptManager getInstance() {
		return INSTANCE;
	}

	private final Map<Player,Script> editing = Maps.newHashMap();
	private final List<Script> scripts = Lists.newArrayList();
	
	private ScriptManager() {}
	
	public Map<Player, Script> getEditing() {
		return editing;
	}

	public List<Script> getScripts() {
		return scripts;
	}
	
	@SuppressWarnings("unchecked")
	public synchronized void reload(){
		scripts.clear();
		
		final File file = new File(SimpleScript.INSTANCE.getDataFolder(), "script.yml");
		
		if(!file.getParentFile().exists())file.getParentFile().mkdirs();
		
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		scripts.addAll((List<Script>)config.getList("scripts"));
	}
	
	public synchronized void save(){
		final File file = new File(SimpleScript.INSTANCE.getDataFolder(), "script.yml");
		
		if(!file.getParentFile().exists())file.getParentFile().mkdirs();
		
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		config.set("scripts", scripts);
		try {
			config.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
