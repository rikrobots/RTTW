package me.rik_robots.RTTW;

import java.util.logging.Logger;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	  static Logger Logg = Logger.getLogger("Minecraft");
	  static Plugin plugin;
	  public static Economy econ = null;
  
		private boolean setupEconomy() {
	        if (getServer().getPluginManager().getPlugin("Vault") == null) {
	            return false;
	        }
	        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
	        if (rsp == null) {
	            return false;
	        }
	        econ = rsp.getProvider();
	        return econ != null;
	    }
	  
	  public void onEnable() {
		  Main.plugin = this;
		    // Event list begin //
		    PluginManager pm = getServer().getPluginManager();
		    pm.registerEvents(new Events(), this);
		    pm.registerEvents(new Selector(), this);
		    // Event list end
		    
		    // Command list begin //
		    getCommand("setlobby").setExecutor(new Commands());
		    getCommand("tlc").setExecutor(new Commands());
		    getCommand("cdw").setExecutor(new Commands());
		    getCommand("reset").setExecutor(new Commands());
		    getCommand("skip").setExecutor(new Commands());
		    // Command list end //
		    
		    // Enconomy Setup begin //
			  if(!setupEconomy()){
				  Logg.severe("[RTTW] This plugin will not run without vault");
				  Bukkit.getPluginManager().disablePlugin(this);
				  }
			  // Enconomy Setup end //
	  }
	  public static Plugin getInstance(){
		  return plugin;
	  }
	  
	  public static void log(String msg){
	    Logg.info("[RTTW] " + msg);
	  }
	  }