package com.mathmaniarobotics.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NumberCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		if (args[0].equalsIgnoreCase("1")) {
			player.sendMessage("one");
		} else if (args[0].equalsIgnoreCase("2")) {
			player.sendMessage("two");
		} else {
			player.sendMessage("Invalid");
		}
		
		return false;
	}

}
