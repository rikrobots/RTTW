package me.rik_robots.RTTW;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Strings,
			String[] string) {
	final Player p = (Player) sender;
	if(cmd.getName().equalsIgnoreCase("setlobby")){
	if(p.hasPermission("RTTW.setlobby"));
	p.getWorld().setSpawnLocation(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ());
	}
	
	if(cmd.getName().equalsIgnoreCase("tlc")){
	if(p.hasPermission("RTTW.tlc")){
	p.teleport(p.getWorld().getSpawnLocation());
	p.sendMessage(ChatColor.GRAY + "Teleported to lobby");
	}
	}
	
	if(cmd.getName().equalsIgnoreCase("skip")){
	if(p.hasPermission("RTTW.skip")){
	Events.run2 = 25 * 60 * 19 + 25 * 55;
	Events.start = true;
	p.sendMessage(ChatColor.GREEN + "You skipped the survival time!");
	} else {
		p.sendMessage(ChatColor.RED + "I'm Sorry you do not have the power to do that!");
	}
	}
	
	if(cmd.getName().equalsIgnoreCase("cdw")){
	p.sendMessage(ChatColor.RED + "Death withers: " + Events.wd);
	}
	
	if(cmd.getName().equalsIgnoreCase("reset")){
	if(p.hasPermission("RTTW.reset")){
	Events.wd = 0;
	p.sendMessage(ChatColor.RED + "RTTW Reseted!");
	}
	}
	
		return false;
	}
}
