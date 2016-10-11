package team.unstudio.simplescript.support;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.RegisteredServiceProvider;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;

public class Vault {
	public static final Economy economy = setupEconomy();
	public static final Permission permission = setupPermission();

	private static Economy setupEconomy() {
		Server server = Bukkit.getServer();
		RegisteredServiceProvider<Economy> rsp = server.getServicesManager().getRegistration(Economy.class);
		return server.getPluginManager().getPlugin("Vault") == null && rsp == null ? null : rsp.getProvider();
	}
	
	private static Permission setupPermission() {
		Server server = Bukkit.getServer();
		RegisteredServiceProvider<Permission> rsp = server.getServicesManager().getRegistration(Permission.class);
		return server.getPluginManager().getPlugin("Vault") == null && rsp == null ? null : rsp.getProvider();
	}
}
