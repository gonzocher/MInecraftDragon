package com.mathmaniarobotics.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReleaseCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		//set currentPlayer = get args[0];
		
		Player player = (Player) sender;
		if (args[0].equalsIgnoreCase("rynoxious")) {
			player.sendMessage(ChatColor.AQUA + player.getName() + ", you are freed from the Deep Freeze.  You're welcome.");
		} else if (args[0].equalsIgnoreCase("gonzocher")) {
			player.sendMessage(ChatColor.AQUA + player.getName() + ", you are freed from the Deep Freeze.  You're welcome.");
		} else {
			player.sendMessage("Invalid");
		}
		
		return false;
	}

}
