package team.unstudio.simplescript.support;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

import net.milkbowl.vault.economy.Economy;

public class Vault {
	public static final Economy economy = setupEconomy();
	
	private static Economy setupEconomy() {
		//Compressed from
		/*
		if (Bukkit.getServer().getPluginManager().getPlugin("Vault") == null) {
			return null;
		}
		RegisteredServiceProvider<Economy> rsp = Bukkit.getServer().getServicesManager().getRegistration(Economy.class);
		if (rsp == null) {
			return null;
		}
		return rsp.getProvider();
		*/
		return Bukkit.getServer().getPluginManager().getPlugin("Vault") == null
				&& Bukkit.getServer().getServicesManager().getRegistration(Economy.class) == null ? null
						: Bukkit.getServer().getServicesManager().getRegistration(Economy.class).getProvider();
	}
}
