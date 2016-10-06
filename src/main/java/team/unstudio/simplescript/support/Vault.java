package team.unstudio.simplescript.support;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

import net.milkbowl.vault.economy.Economy;

public class Vault {
	@SuppressWarnings("unused")
	private boolean setupEconomy() {
		boolean vault;
		if (Bukkit.getServer().getPluginManager().getPlugin("Vault") == null) {
			vault = false;
		} else {
			RegisteredServiceProvider<Economy> rsp = Bukkit.getServer().getServicesManager()
					.getRegistration(Economy.class);
			if (rsp == null) {
				vault = false;
			} else if (rsp.getProvider() == null) {
				vault = false;
			} else {
				vault = true;
			}
		}
		return vault;
	}
}
