package team.unstudio.simplescript;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleScript extends JavaPlugin {
	@Override
	public final void onLoad() {

	}

	@Override
	public final void onEnable() {

	}

	@Override
	public final void onDisable() {

	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			switch (label.toLowerCase()) {
			case "sbinteract":
				if (player.hasPermission("sb.sbinteract")) {
					getLogger().info("§atest");
				} else {
					getLogger().info("§c你没有这样做的权限!");
				}
				break;
			case "sbwalk":
				if (player.hasPermission("sb.sbwalk")) {
					getLogger().info("§atest");
				} else {
					getLogger().info("§c你没有这样做的权限!");
				}
				break;

			default:
				break;
			}
		} else {
			getLogger().info("§4该命令只能玩家执行");
		}
		return true;
	}
}
