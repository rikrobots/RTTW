package me.rik_robots.RTTW.Withers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Wither;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Lvl2 {
	
	public static void lvl2(Wither w2){
	w2.resetMaxHealth();
	w2.setCustomName(ChatColor.RED + "[" + ChatColor.GRAY + "LVL: 2" + ChatColor.RED + "]");
	w2.setHealth(150.0);
	w2.setCustomNameVisible(true);
	w2.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 25 * 2 * 10000, 1));
	}
}
