package team.unstudio.simplescript.command;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class CommandSBinding implements CommandExecutor,TabCompleter{

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO 自动生成的方法存根
		return false;
	}

}
