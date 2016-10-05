package team.unstudio.simplescript;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import team.unstudio.simplescript.command.CommandSBinding;
import team.unstudio.simplescript.command.CommandSScript;
import team.unstudio.simplescript.listener.SSListener;
import team.unstudio.simplescript.script.ScriptManager;

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
		
		//Register Listener
		getServer().getPluginManager().registerEvents(new SSListener(), this);
		
		ScriptManager.getInstance().reload();
	}

	@Override
	public final void onDisable() {
		ScriptManager.getInstance().save();
		HandlerList.unregisterAll();
	}
}
