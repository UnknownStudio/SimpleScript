package team.unstudio.simplescript.command;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import team.unstudio.simplescript.script.Script;
import team.unstudio.simplescript.script.ScriptManager;

public final class CommandSScript implements CommandExecutor,TabCompleter{

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
		
		return null;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("");
			return true;
		}
		if(args.length==0){
			
		}
		switch (args[0].toLowerCase()) {
		case "create":
			if(!sender.hasPermission("simplescript.script.create")) {
				sender.sendMessage("");
				break;
			}
			
			if(args.length!=2) {
				sender.sendMessage("");
				break;
			}
			
			ScriptManager.getInstance().getEditing().put((Player) sender, new Script(args[1]));
			sender.sendMessage("");
			break;
		case "add":
			if(!sender.hasPermission("simplescript.script.add")) {
				sender.sendMessage("");
				break;
			}
			
			break;
		case "remove":
			if(!sender.hasPermission("simplescript.script.remove")) {
				sender.sendMessage("");
				break;
			}
			
			break;
		case "delete":
			if(!sender.hasPermission("simplescript.script.delete")) {
				sender.sendMessage("");
				break;
			}
			
			break;
		case "save":
			if(!sender.hasPermission("simplescript.script.save")) {
				sender.sendMessage("");
				break;
			}
			
			break;
		case "edit":			
			if(!sender.hasPermission("simplescript.script.edit")) {
			sender.sendMessage("");
			break;
			}
			
			break;
		case "view":
			if(!sender.hasPermission("simplescript.script.view")) {
				sender.sendMessage("");
				break;
			}
			
			break;
		case "reload":
			if(!sender.hasPermission("simplescript.reload")) {
				sender.sendMessage("");
				break;
			}
			
			break;
		case "help":
		default:
			if(!sender.hasPermission("simplescript.script.help")) {
				sender.sendMessage("");
				break;
			}
			break;
		}
		return true;
	}
}
