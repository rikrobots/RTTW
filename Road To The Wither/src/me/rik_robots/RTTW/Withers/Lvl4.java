package me.rik_robots.RTTW.Withers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Wither;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Lvl4 {
	public static void lvl4(Wither w2){
	w2.resetMaxHealth();
	w2.setCustomName(ChatColor.RED + "[" + ChatColor.GRAY + "LVL: 4" + ChatColor.RED + "]");
	w2.setHealth(250.0);
	w2.setCustomNameVisible(true);
	w2.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 25 * 2 * 10000, 2));
	}
}
