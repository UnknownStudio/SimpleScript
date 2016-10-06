package team.unstudio.simplescript.command;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import com.google.common.collect.ImmutableList;

public final class CommandSScript implements CommandExecutor, TabCompleter {

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
		List<String> tabList;
		switch (args.length) {
		case 0:
			tabList = ImmutableList.<String>of("help", "create", "add", "remove", "delete", "save", "edit", "view", "reload");
			break;
		default:
			tabList = ImmutableList.<String>of();
			break;
		}
		return tabList;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("");
		} else if (!sender.hasPermission("simplescript.script")) {
			sender.sendMessage("");
		} else if (args.length == 0) {
			displayHelp(sender);
		} else {
			switch (args[0].toLowerCase()) {
			case "create":
				if (sender.hasPermission("simplescript.script.create")) {
					// TODO create
				} else {
					sender.sendMessage("");
				}
				break;
			case "add":
				if (sender.hasPermission("simplescript.script.add")) {
					// TODO add
				} else {
					sender.sendMessage("");
				}
				break;
			case "remove":
				if (sender.hasPermission("simplescript.script.remove")) {
					// TODO remove
				} else {
					sender.sendMessage("");
				}
				break;
			case "delete":
				if (sender.hasPermission("simplescript.script.delete")) {
					// TODO delete
				} else {
					sender.sendMessage("");
				}
				break;
			case "save":
				if (sender.hasPermission("simplescript.script.save")) {
					// TODO save
				} else {
					sender.sendMessage("");
				}
				break;
			case "edit":
				if (sender.hasPermission("simplescript.script.edit")) {
					// TODO edit
				} else {
					sender.sendMessage("");
				}
				break;
			case "view":
				if (sender.hasPermission("simplescript.script.view")) {
					// TODO view
				} else {
					sender.sendMessage("");
				}
				break;
			case "reload":
				if (sender.hasPermission("simplescript.reload")) {
					// TODO reload
				} else {
					sender.sendMessage("");
				}
				break;
			// "default" is including "help"
			default:
				displayHelp(sender);
				break;
			}
		}
		return true;
	}

	public void displayHelp(CommandSender sender) {
		if (sender.hasPermission("simplescript.script.help")) {
			// TODO display help
		} else {
			sender.sendMessage("");
		}
	}
}