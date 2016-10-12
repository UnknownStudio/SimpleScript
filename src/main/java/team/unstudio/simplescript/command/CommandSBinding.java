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

package team.unstudio.simplescript.command;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import com.google.common.collect.ImmutableList;

public final class CommandSBinding implements CommandExecutor, TabCompleter {

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
		List<String> tabList;
		switch (args.length) {
		case 0:
			tabList = ImmutableList.<String>of("help", "block", "item");
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
		} else if (!sender.hasPermission("simplescript.script.binding")) {
			sender.sendMessage("");
		} else if (args.length == 0) {
			displayHelp(sender);
		} else {
			switch (args[0].toLowerCase()) {
			case "block":
				if (sender.hasPermission("simplescript.script.binding.block")) {
					// TODO block
				} else {
					sender.sendMessage("");
				}
				break;
			case "item":
				if (sender.hasPermission("simplescript.script.binding.item")) {
					// TODO item
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
		if (sender.hasPermission("simplescript.script.binding.help")) {
			// TODO display help
		} else {
			sender.sendMessage("");
		}
	}

}
