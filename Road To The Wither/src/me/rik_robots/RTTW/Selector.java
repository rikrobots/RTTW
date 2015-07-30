package me.rik_robots.RTTW;

import java.util.ArrayList;

import net.milkbowl.vault.economy.EconomyResponse;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Selector implements Listener {
	
	@EventHandler
	public void selector(PlayerInteractEvent e){
	Player p = e.getPlayer();
	if(p.getItemInHand().getType() == Material.BOOK){
	if(p.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Shop")){
	if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
	Inventory inv = Bukkit.createInventory(null, 9, ChatColor.RED + "Shop");
	
	ItemStack stack = new ItemStack(Material.STONE_SWORD);
	ItemMeta basicmeta = stack.getItemMeta();
	basicmeta.setDisplayName(ChatColor.RED + "Stone Sword");
	stack.setItemMeta(basicmeta);
	 ArrayList<String> lore = new ArrayList<String>();
	 lore.add(ChatColor.GRAY + "Cost: 50c");
	 basicmeta.setLore(lore);
	 stack.setItemMeta(basicmeta);
	 
		ItemStack stack2 = new ItemStack(Material.IRON_SWORD);
		ItemMeta basicmeta2 = stack2.getItemMeta();
		basicmeta2.setDisplayName(ChatColor.RED + "Iron Sword");
		stack2.setItemMeta(basicmeta2);
		 ArrayList<String> lore2 = new ArrayList<String>();
		 lore2.add(ChatColor.GRAY + "Cost: 100c");
		 basicmeta2.setLore(lore2);
		 stack2.setItemMeta(basicmeta2);
		 
			ItemStack stack3 = new ItemStack(Material.CHAINMAIL_HELMET);
			ItemMeta basicmeta3 = stack3.getItemMeta();
			basicmeta3.setDisplayName(ChatColor.RED + "Chain Armor Kit");
			stack3.setItemMeta(basicmeta3);
			 ArrayList<String> lore3 = new ArrayList<String>();
			 lore3.add(ChatColor.GRAY + "Cost: 150c");
			 basicmeta3.setLore(lore3);
			 stack3.setItemMeta(basicmeta3);
			 
				ItemStack stack4 = new ItemStack(Material.IRON_HELMET);
				ItemMeta basicmeta4 = stack4.getItemMeta();
				basicmeta4.setDisplayName(ChatColor.RED + "Iron Armor");
				stack4.setItemMeta(basicmeta4);
				 ArrayList<String> lore4 = new ArrayList<String>();
				 lore4.add(ChatColor.GRAY + "Cost: 300c");
				 basicmeta4.setLore(lore4);
				 stack4.setItemMeta(basicmeta4);
			 
	     inv.setItem(2, stack3);
		 inv.setItem(1, stack2);
		 inv.setItem(0, stack);
	 p.openInventory(inv);
	}
	}
	}
	}
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if(e.getInventory().getName().equalsIgnoreCase(ChatColor.RED + "Shop")){
			if(e.getSlot() == 0){
				Player p = (Player) e.getWhoClicked();
				e.setCancelled(true);
				String s = p.getName();
				 if(Main.econ.getBalance(s)>=50){
					EconomyResponse er = Main.econ.withdrawPlayer(s, 50);
					if(er.transactionSuccess()){
					p.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
					}
				 } else {
					 p.sendMessage(ChatColor.RED + "You do not have enough money");
				 }
				p.closeInventory();
			}
		}
	}
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick2(InventoryClickEvent e) {
		if(e.getInventory().getName().equalsIgnoreCase(ChatColor.RED + "Shop")){
			if(e.getSlot() == 1){
				Player p = (Player) e.getWhoClicked();
				String s = p.getName();
				 if(Main.econ.getBalance(s)>=100){
					EconomyResponse er = Main.econ.withdrawPlayer(s, 100);
					if(er.transactionSuccess()){
					p.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
					}
				 } else {
					 p.sendMessage(ChatColor.RED + "You do not have enough money");
				 }
				e.setCancelled(true);
				p.closeInventory();
			}
		}
	}/*
	@EventHandler
	public void join(PlayerJoinEvent e){
	Player p = e.getPlayer();
	p.getInventory().clear();
	ItemStack Selector = new ItemStack(Material.BOOK);
	ItemMeta selm = Selector.getItemMeta();
	selm.setDisplayName(ChatColor.RED + "Shop");
	Selector.setItemMeta(selm);
	p.getInventory().addItem(Selector);
	}*/
}
