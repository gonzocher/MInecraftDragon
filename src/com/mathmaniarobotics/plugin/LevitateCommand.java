package com.mathmaniarobotics.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LevitateCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;
		player.sendMessage("You will rise!");
	    player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 60, 1));
		return false;
	}
}
