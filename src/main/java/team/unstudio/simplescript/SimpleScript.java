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
		saveDefaultConfig();
		SSConfig.reload();
		
		CommandSScript commandSScript = new CommandSScript();
		getCommand("sscript").setExecutor(commandSScript);
		getCommand("sscript").setTabCompleter(commandSScript);
		
		CommandSBinding commandSBinding = new CommandSBinding();
		getCommand("sbinding").setExecutor(commandSBinding);
		getCommand("sbinding").setTabCompleter(commandSBinding);
	}

	@Override
	public final void onDisable() {

	}
}
