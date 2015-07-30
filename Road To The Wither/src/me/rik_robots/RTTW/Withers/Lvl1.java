package me.rik_robots.RTTW.Withers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Wither;

public class Lvl1 {

	public static void lvl1(Wither w){
	w.resetMaxHealth();
	w.setCustomName(ChatColor.RED + "[" + ChatColor.GRAY + "LVL: 1" + ChatColor.RED + "]");
	w.setHealth(120.0);
	w.setCustomNameVisible(true);
	}
}
