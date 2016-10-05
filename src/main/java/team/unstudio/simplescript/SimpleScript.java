package team.unstudio.simplescript;

import org.bukkit.plugin.java.JavaPlugin;

import team.unstudio.simplescript.command.CommandSBinding;
import team.unstudio.simplescript.command.CommandSScript;

public final class SimpleScript extends JavaPlugin {
	
	public static SimpleScript INSTANCE;
	
	@Override
	public final void onLoad() {
		INSTANCE = this;
	}

	@Override
	public final void onEnable() {
		//Load configuration
		saveDefaultConfig();
		SSConfig.reload();
		
		//Register "sscript" of TabCompleter and CommandExecutor
		CommandSScript commandSScript = new CommandSScript();
		getCommand("sscript").setExecutor(commandSScript);
		getCommand("sscript").setTabCompleter(commandSScript);
		//Register "sbinding" of TabCompleter and CommandExecutor
		CommandSBinding commandSBinding = new CommandSBinding();
		getCommand("sbinding").setExecutor(commandSBinding);
		getCommand("sbinding").setTabCompleter(commandSBinding);
	}

	@Override
	public final void onDisable() {
		// TODO Disable the plugin
	}
}
