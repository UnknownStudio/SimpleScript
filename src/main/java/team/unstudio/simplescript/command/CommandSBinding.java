package team.unstudio.simplescript.command;

import java.util.Arrays;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

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
		// TODO 自动生成的方法存根
		return true;
	}

}
