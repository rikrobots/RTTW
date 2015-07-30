package me.rik_robots.RTTW;

import java.util.ArrayList;
import java.util.HashMap;

import me.rik_robots.RTTW.Withers.Lvl1;
import me.rik_robots.RTTW.Withers.Lvl2;
import me.rik_robots.RTTW.Withers.Lvl3;
import me.rik_robots.RTTW.Withers.Lvl4;
import me.rik_robots.RTTW.Withers.Lvl5;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wither;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {

	//Int List
	static int c = 0;
	static int run2 = 30 * 25;
	static int wd = 0;
	static int r2 = 10 * 25;
	static int r3 = 10 * 25;
	static int r4 = 10 * 25;
	static int r5 = 10 * 25;
	static int as2 = 0; 
	static int as3 = 0; 
	static int as4 = 0; 
	static int as5 = 0; 
	static int min = 25 * 60;
	
	//Boolean
	
	public static boolean sw = false;
	public static boolean play = false;
	public static boolean start = false;
	
	//Hashmaps / ArrayLists
	
	final ArrayList<Integer> in = new ArrayList<Integer>();
	
	public static final HashMap<String, Integer> coins = new HashMap<String, Integer>();
	
	//Strings
	
	static String rr = ChatColor.GOLD + "[" + ChatColor.RED + "RTTW" + ChatColor.GOLD + "] ";
	
	//Counting Players
	@EventHandler
	public void Counting(PlayerJoinEvent e){
	final Player p = e.getPlayer();
	if(play == true){
	p.kickPlayer(ChatColor.RED + "This game has already started!");
	}
	if(c >= 17 || start == true){
	p.kickPlayer(ChatColor.RED + "Im sorry the server is full.");
	}
	p.teleport(p.getWorld().getSpawnLocation());
	if(!(c > 1)){
	c++;
	e.setJoinMessage(rr + ChatColor.RED + e.getPlayer().getName() + ChatColor.YELLOW +
	" Heeft Road To The Wither gejoined (" + c + "/16)");
	}
	if((c > 0) && (c <= 16) || start == true){
	Bukkit.broadcastMessage(rr +  ChatColor.YELLOW + "Survival Starts in 30 seconds");
	Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
		//Game Start
		@SuppressWarnings("deprecation")
		@Override
		public void run() {
			run2++;
			if(wd == 2){
			as2++;
			}
			if(wd == 4){
			as3++;
			}
			if(wd == 6){
			as4++;
			}
			if(wd == 8){
			as5++;
			}
			if(wd == 10){
			Bukkit.broadcastMessage(ChatColor.GREEN + "The withers are defeated congratulationz!");
			}
			if(run2 > 1) {
			if(run2 == 25 * 1 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 10 seconds");
			}
			if(run2 == 25 * 2 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 9 seconds");
			}
			if(run2 == 25 * 3 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 8 seconds");
			}
			if(run2 == 25 * 4 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 7 seconds");
			}
			if(run2 == 25 * 5 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 6 seconds");
			}
			if(run2 == 25 * 6 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 5 seconds");
			}
			if(run2 == 25 * 7 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 4 seconds");
			}
			if(run2 == 25 * 8 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 3 seconds");
			}
			if(run2 == 25 * 9 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 2 seconds");
			}
			if(run2 == 25 * 10 + 30 * 25){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Survival Starts in 1 seconds");
			Player[] players = Bukkit.getServer().getOnlinePlayers();
            for(Player receiver : players) {
			World world = p.getWorld();
			Location loc = new Location(world, 242, 56, 1348);
			receiver.teleport(loc);
			receiver.sendMessage(ChatColor.GRAY + "Teleporting..");
			play = true;
            }
            if(run2 == 25 * 15){
    			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Game Starts in 20 minutes");
            }
			}
			if(run2 == min * 19){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Game Starts in 1 minute");
			}
			if(run2 == min * 15){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Game Starts in 5 minutes");
			}
			if(run2 == min * 10){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Game Starts in 10 minutes");
			}
			if(run2 == min * 5){
			Bukkit.broadcastMessage(rr + ChatColor.YELLOW + "Game Starts in 15 minutes");
			}
			if(run2 == min * 20){
			Bukkit.broadcastMessage(ChatColor.RED + "Game Starting");
			Player[] players = Bukkit.getServer().getOnlinePlayers();
            for(Player receiver : players) {
			World world = p.getWorld();
			Location loc = new Location(world, 242, 56, 1348);
			receiver.teleport(loc);
			receiver.sendMessage(ChatColor.GRAY + "Teleporting..");
			sw = true;
            }
			}
			if(sw = true)
			if(run2 == 25 * 1 + min * 20){
			Bukkit.broadcastMessage(ChatColor.RED + "Wither Spawns in 5 seconds");
			}
			if(sw = true)
			if(run2 == 25 * 2 + min * 20){
			Bukkit.broadcastMessage(ChatColor.RED + "Wither Spawns in 4 seconds");
			}
			if(sw = true)
			if(run2 == 25 * 3 + min * 20){
			Bukkit.broadcastMessage(ChatColor.RED + "Wither Spawns in 3 seconds");
			}
			if(sw = true)
			if(run2 == 25 * 4 + min * 20){
			Bukkit.broadcastMessage(ChatColor.RED + "Wither Spawns in 2 seconds");
			}
			if(sw = true)
			if(run2 == 25 * 5 + min * 20){
			Bukkit.broadcastMessage(ChatColor.RED + "Wither Spawns in 1 seconds");
			}
			if(sw = true)
			if(run2 == 25 * 5 + min * 20){
			Bukkit.broadcastMessage(ChatColor.RED + "Spawned: 2 Wither Class 1's");
			World world = p.getWorld();
			Location loc1 = new Location(world, -90, 83, 129);
			Location loc2 = new Location(world, -90, 83, 129);
			Wither w = (Wither) p.getWorld().spawn(loc1, Wither.class);
			Lvl1.lvl1(w);
			Wither w2 = (Wither) p.getWorld().spawn(loc2, Wither.class);
			Lvl1.lvl1(w2);
			}
	    }
			if(sw = true)
			if(as2 == 1){
			Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
				//Game Start
				@Override
				public void run() {
					r2--;
					if(r2 > 1) {
						if(r2 == 25 * 10){
						Bukkit.broadcastMessage(ChatColor.YELLOW + "10 seconds until the next round starts");
						}
						if(r2 == 25 * 5){
						Bukkit.broadcastMessage(ChatColor.RED + "5 seconds until the next round starts");
						}
						if(r2 == 25 * 4){
						Bukkit.broadcastMessage(ChatColor.RED + "4 seconds until the next round starts");
						}
						if(r2 == 25 * 3){
						Bukkit.broadcastMessage(ChatColor.RED + "3 seconds until the next round starts");
						}
						if(r2 == 25 * 2){
						Bukkit.broadcastMessage(ChatColor.RED + "2 seconds until the next round starts");
						}
						if(r2 == 25){
						Bukkit.broadcastMessage(ChatColor.RED + "1 seconds until the next round starts");
						}
						if(r2 == 2){
						Bukkit.broadcastMessage(ChatColor.RED + "Spawned: 2 Wither Class 2's");
						World world = p.getWorld();
						Location loc3 = new Location(world, -90, 83, 129);
						Location loc4 = new Location(world, -90, 83, 129);
						Wither w3 = (Wither) p.getWorld().spawn(loc3, Wither.class);
						Lvl2.lvl2(w3);
						Wither w4 = (Wither) p.getWorld().spawn(loc4, Wither.class);
						Lvl2.lvl2(w4);
						}
					}
				}
			}, 0L, 0L);
	  }
			if(as3 == 1){
				Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
					//Game Start
					@Override
					public void run() {
						r3--;
						if(r3 > 1) {
							if(r3 == 25 * 10){
							Bukkit.broadcastMessage(ChatColor.YELLOW + "10 seconds until the next round starts");
							}
							if(r3 == 25 * 5){
							Bukkit.broadcastMessage(ChatColor.RED + "5 seconds until the next round starts");
							}
							if(r3 == 25 * 4){
							Bukkit.broadcastMessage(ChatColor.RED + "4 seconds until the next round starts");
							}
							if(r3 == 25 * 3){
							Bukkit.broadcastMessage(ChatColor.RED + "3 seconds until the next round starts");
							}
							if(r3 == 25 * 2){
							Bukkit.broadcastMessage(ChatColor.RED + "2 seconds until the next round starts");
							}
							if(r3 == 25){
							Bukkit.broadcastMessage(ChatColor.RED + "1 seconds until the next round starts");
							}
							if(r3 == 2){
							Bukkit.broadcastMessage(ChatColor.RED + "Spawned: 2 Wither Class 3's");
							World world = p.getWorld();
							Location loc3 = new Location(world, -90, 83, 129);
							Location loc4 = new Location(world, -90, 83, 129);
							Wither w3 = (Wither) p.getWorld().spawn(loc3, Wither.class);
							Lvl3.lvl3(w3);
							Wither w4 = (Wither) p.getWorld().spawn(loc4, Wither.class);
							Lvl3.lvl3(w4);
							}
						}
					}
				}, 0L, 0L);
		  }
			if(as4 == 1){
				Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
					//Game Start
					@Override
					public void run() {
						r4--;
						if(r4 > 1) {
							if(r4 == 25 * 10){
							Bukkit.broadcastMessage(ChatColor.YELLOW + "10 seconds until the next round starts");
							}
							if(r4 == 25 * 5){
							Bukkit.broadcastMessage(ChatColor.RED + "5 seconds until the next round starts");
							}
							if(r4 == 25 * 4){
							Bukkit.broadcastMessage(ChatColor.RED + "4 seconds until the next round starts");
							}
							if(r4 == 25 * 3){
							Bukkit.broadcastMessage(ChatColor.RED + "3 seconds until the next round starts");
							}
							if(r4 == 25 * 2){
							Bukkit.broadcastMessage(ChatColor.RED + "2 seconds until the next round starts");
							}
							if(r4 == 25){
							Bukkit.broadcastMessage(ChatColor.RED + "1 seconds until the next round starts");
							}
							if(r4 == 2){
							Bukkit.broadcastMessage(ChatColor.RED + "Spawned: 2 Wither Class 4's");
							World world = p.getWorld();
							Location loc3 = new Location(world, -90, 83, 129);
							Location loc4 = new Location(world, -90, 83, 129);
							Wither w3 = (Wither) p.getWorld().spawn(loc3, Wither.class);
							Lvl4.lvl4(w3);
							Wither w4 = (Wither) p.getWorld().spawn(loc4, Wither.class);
							Lvl4.lvl4(w4);
							}
						}
					}
				}, 0L, 0L);
		  }
			if(as5 == 1){
				Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
					//Game Start
					@Override
					public void run() {
						r5--;
						if(r5 > 1) {
							if(r5 == 25 * 10){
							Bukkit.broadcastMessage(ChatColor.YELLOW + "10 seconds until the next round starts");
							}
							if(r5 == 25 * 5){
							Bukkit.broadcastMessage(ChatColor.RED + "5 seconds until the next round starts");
							}
							if(r5 == 25 * 4){
							Bukkit.broadcastMessage(ChatColor.RED + "4 seconds until the next round starts");
							}
							if(r5 == 25 * 3){
							Bukkit.broadcastMessage(ChatColor.RED + "3 seconds until the next round starts");
							}
							if(r5 == 25 * 2){
							Bukkit.broadcastMessage(ChatColor.RED + "2 seconds until the next round starts");
							}
							if(r5 == 25){
							Bukkit.broadcastMessage(ChatColor.RED + "1 seconds until the next round starts");
							}
							if(r5 == 2){
							Bukkit.broadcastMessage(ChatColor.RED + "Spawned: 2 Wither Class 5's");
							World world = p.getWorld();
							Location loc3 = new Location(world, -90, 83, 129);
							Location loc4 = new Location(world, -90, 83, 129);
							Wither w3 = (Wither) p.getWorld().spawn(loc3, Wither.class);
							Lvl5.lvl5(w3);
							Wither w4 = (Wither) p.getWorld().spawn(loc4, Wither.class);
							Lvl5.lvl5(w4);
							}
						}
					}
				}, 0L, 0L);
		  }
			
		}
    }, 0L, 0L);
  }
}
	@EventHandler
	public void DisCounting(PlayerQuitEvent e){
	if(!(c < 1)){
	c--;
	  }
   }
	@EventHandler
	public void WitherDeathEvent(EntityDeathEvent e){
	if(e.getEntityType().equals(EntityType.WITHER)){
	wd++;
	}
	}
	@EventHandler
	public void PlayerDeathEvent(PlayerDeathEvent e){
	Player p = (Player) e.getEntity();
	p.kickPlayer(ChatColor.RED + "You died");
	}
	
}
