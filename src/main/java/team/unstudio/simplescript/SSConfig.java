package team.unstudio.simplescript;

import org.bukkit.configuration.file.FileConfiguration;

public final class SSConfig {
	
	public static void reload(){
		SimpleScript.INSTANCE.reloadConfig();
		FileConfiguration configuration = SimpleScript.INSTANCE.getConfig();
	}

}
