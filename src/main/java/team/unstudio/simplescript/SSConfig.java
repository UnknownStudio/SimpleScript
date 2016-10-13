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

package team.unstudio.simplescript;

import org.bukkit.configuration.file.FileConfiguration;

public final class SSConfig {

	private static int AutoSave = 10;
	private static String Language = "zh_CN";

	public static void reload() {
		SimpleScript.INSTANCE.reloadConfig();
		FileConfiguration configuration = SimpleScript.INSTANCE.getConfig();

		AutoSave = configuration.getInt("AutoSave", 10);
		Language= configuration.getString("Language", "zh_CN");
	}

	public static int getAutoSave() {
		return AutoSave;
	}

	public static String getLanguage() {
		return Language;
	}
}
