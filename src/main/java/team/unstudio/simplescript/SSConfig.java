package team.unstudio.simplescript;

import org.bukkit.configuration.file.FileConfiguration;

public final class SSConfig {

	private static int AutoSave = 10;

	public static void reload() {
		SimpleScript.INSTANCE.reloadConfig();
		FileConfiguration configuration = SimpleScript.INSTANCE.getConfig();

		AutoSave = configuration.getInt("AutoSave", 10);
	}

	public static int getAutoSave() {
		return AutoSave;
	}
}
