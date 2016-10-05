package team.unstudio.simplescript.command;

import java.util.Arrays;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import team.unstudio.simplescript.script.Script;
import team.unstudio.simplescript.script.ScriptManager;

import com.google.common.collect.Lists;

public final class CommandSScript implements CommandExecutor, TabCompleter {

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
		List<String> tabList;
		switch (args.length) {
		case 0:
			tabList = Arrays.asList("help", "create", "add", "remove", "delete", "save", "edit", "view", "reload");
			break;
		default:
			tabList = Lists.newArrayList();
			break;
		}
		return tabList;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("");
		} else if (args.length == 0) {
			//
		} else {
			switch (args[0].toLowerCase()) {
			case "create":
				if (!sender.hasPermission("simplescript.script.create")) {
					sender.sendMessage("");
				} else if (args.length < 2) {
					sender.sendMessage("");
				} else {
					ScriptManager.getInstance().getEditing().put((Player) sender, new Script(args[1]));
					sender.sendMessage("");
				}
				break;
			case "add":
				if (sender.hasPermission("simplescript.script.add")) {
					//
				} else {
					sender.sendMessage("");
				}
				break;
			case "remove":
				if (sender.hasPermission("simplescript.script.remove")) {
					//
				} else {
					sender.sendMessage("");
				}
				break;
			case "delete":
				if (sender.hasPermission("simplescript.script.delete")) {
					//
				} else {
					sender.sendMessage("");
				}
				break;
			case "save":
				if (sender.hasPermission("simplescript.script.save")) {
					//
				} else {
					sender.sendMessage("");
				}
				break;
			case "edit":
				if (sender.hasPermission("simplescript.script.edit")) {
					//
				} else {
					sender.sendMessage("");
				}
				break;
			case "view":
				if (sender.hasPermission("simplescript.script.view")) {
					//
				} else {
					sender.sendMessage("");
				}
				break;
			case "reload":
				if (sender.hasPermission("simplescript.reload")) {
					//
				} else {
					sender.sendMessage("");
				}
				break;
			//"default" is including "help" 
			default:
				if (sender.hasPermission("simplescript.script.help")) {
					//
				} else {
					sender.sendMessage("");
				}
				break;
			}
		}
		return true;
	}
}
