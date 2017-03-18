package org.cubeville.cvtutorial;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CVTutorial extends JavaPlugin {
	List<String> help;

	@Override
	public void onEnable() {
		help = getConfig().getConfigurationSection("commands").getStringList("help");
	}
//a
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// use \" to escape a quote
		Player player = (Player) sender;
		
		if (label.equalsIgnoreCase("help")) {
			if (args.length == 0 || (args.length == 1 && args[0].equalsIgnoreCase("1"))) {
				player.sendMessage(ChatColor.RED + "Help 1 of 4 - Cubeville Commands");
				// player.sendMessage(ChatColor.RED + "< > represents required parameters. [ ] represents optional ones.");

				player.sendMessage(ChatColor.GOLD + "1) \"/modreq <message>\" to request staff assistance.");
				player.sendMessage(ChatColor.GOLD + "2) \"/spawn\" to teleport to spawn.");
				player.sendMessage(ChatColor.GOLD + "3) \"/hub\" to teleport to the teleport hub");
				player.sendMessage(ChatColor.GOLD + "4) \"/spleef tp\" to teleport to the spleef arena");
				player.sendMessage(ChatColor.GOLD + "5) \"/sethome\" to set your home.");
				player.sendMessage(ChatColor.GOLD + "     \"/home\" to teleport to your home.");
				player.sendMessage(ChatColor.GOLD + "6) \"/money\" to see your cube balance.");
				player.sendMessage(ChatColor.GOLD + "     \"/money pay <username> <amount>\" to pay someone in cubes.");
				player.sendMessage(ChatColor.GOLD + "7) \"/modlist\" to see currently online staff.");
				player.sendMessage(ChatColor.GOLD + "     " + ChatColor.GREEN + "MODs " + ChatColor.GOLD + "can handle general questions and chat issues");
				player.sendMessage(ChatColor.GOLD + "     " + ChatColor.LIGHT_PURPLE + "SMODs " + ChatColor.GOLD + "can handle griefings");
				player.sendMessage(ChatColor.GOLD + "     " + ChatColor.AQUA + "ADMINs " + ChatColor.GOLD + "can handle most issues");
				player.sendMessage(ChatColor.GOLD + "     " + ChatColor.DARK_RED + "SADMINs " + ChatColor.GOLD + "are the server managers");
				player.sendMessage(ChatColor.GOLD + "8) \"/mumble register\" to complete Mumble registration.");
				return true;
			} else if (args.length == 1 && args[0].equalsIgnoreCase("2")) {
				player.sendMessage(ChatColor.RED + "Help 2 of 4 - Chat Commands");
				
				player.sendMessage(ChatColor.GOLD + "1) \"/y <message>\" will send your message to all players.");
				player.sendMessage(ChatColor.GOLD + "2) Typing without \"/\" will send your message to players near you.");
				player.sendMessage(ChatColor.GOLD + "3) \"/ch list\" shows you channels available to you.");
				player.sendMessage(ChatColor.GOLD + "     \"/ch j <channel name>\" to join a channel.");
				player.sendMessage(ChatColor.GOLD + "     \"/ch l <channel name>\" to leave a channel.");
				player.sendMessage(ChatColor.GOLD + "5) \"/msg <username> <message>\" to send a private message to a user.");
				player.sendMessage(ChatColor.GOLD + "6) \"/group invite <username>\" to invite a user to your group.");
				player.sendMessage(ChatColor.GOLD + "     \"/group join <username>\" to join a user's group.");
				player.sendMessage(ChatColor.GOLD + "     \"/p <message>\" to send a message to your group.");
				player.sendMessage(ChatColor.GOLD + "     \"/group leave\" to leave your group.");
				player.sendMessage(ChatColor.GOLD + "7) Be sure to follow all rules when chatting.");
				
				return true;
			} else if (args.length == 1 && (args[0].equalsIgnoreCase("we") || args[0].equalsIgnoreCase("worldguard"))) {
				
				player.sendMessage(ChatColor.RED + "Help 3 of 4 - WorldGuard Commands");
				player.sendMessage(ChatColor.GOLD + "1) \"/rg i\" to show the data for the region you are in.");
				player.sendMessage(ChatColor.GOLD + "2) \"/rg flag <region name> <flag type> [flag parameters]\" to add a flag to a region.");
				player.sendMessage(ChatColor.GOLD + "     ex: \"/rg flag tutorial greeting Hello World!\" sets flag greeting: \"Hello World!\" to region \"tutorial\"");
				player.sendMessage(ChatColor.GOLD + "3) \"/rg addmember <region name> <username>\" to add a member to your region.");
				player.sendMessage(ChatColor.GOLD + "     ex: \"/rg addmember tutorial RandomRob13\" will add RandomRob13 as a member to your region.");
				player.sendMessage(ChatColor.GOLD + "4) \"//size\" will show you the size of your selected region after using \"//wand\"");
				return true;
			} else if (args.length == 2 && ((args[0].equalsIgnoreCase("we") || args[0].equalsIgnoreCase("worldguard")) && (args[1].equalsIgnoreCase("2") || args[1].equalsIgnoreCase("tut") || args[1].equalsIgnoreCase("tutorial")))) {
				String playerName = player.getName().toString();
				
				player.sendMessage(ChatColor.RED + "Automatic Worldguard Region");
				player.sendMessage(ChatColor.GOLD + "1) \"/claimhere\" to automatically claim a 30x30x256 region.");
				player.sendMessage(ChatColor.GOLD + "     Be sure to stay AT LEAST 40 blocks away from all builds and 100 blocks away from CV Towns & Villages!");
				player.sendMessage(ChatColor.GOLD + "     The region will be named home_" + playerName + ".");
				player.sendMessage(ChatColor.GOLD + "     \"/rg addmember home_" + playerName + " <username>\" to add a member to your region.");
				
				player.sendMessage("");
				
				player.sendMessage(ChatColor.RED + "Custom Worldguard Region");
				player.sendMessage(ChatColor.GOLD + "1) Be sure to stay AT LEAST 40 blocks away from all builds and 100 blocks away from CV Towns & Villages!"); 
				player.sendMessage(ChatColor.GOLD + "2) \"//wand\" to give yourself a worldguard wand.");
				player.sendMessage(ChatColor.GOLD + "3) Right click one corner of your build, and left click the opposite corner.");
				player.sendMessage(ChatColor.GOLD + "4) \"//expand vert\" to expand your region vertically");
				player.sendMessage(ChatColor.GOLD + "5) \"/rg claim <region name>\" to claim your region.");
				player.sendMessage(ChatColor.GOLD + "6) \"/rg addmember <reigon name> <username>\" to add a user to your region.");
				
				return true;
			} else if (args.length == 1 && (args[0].equalsIgnoreCase("lwc") || args[0].equalsIgnoreCase("4"))) {
				player.sendMessage(ChatColor.RED + "Help 4 of 4 - LWC Commands");
				
				player.sendMessage(ChatColor.GOLD + "1) \"/cprivate\" to lock a chest, door, furnace, etc.");
				player.sendMessage(ChatColor.GOLD + "2) \"/cmodify <username>\" to allow a user to use your locked item.");
				player.sendMessage(ChatColor.GOLD + "     \"/cmodify -<username>\" to disallow a user to use your locked item.");
				player.sendMessage(ChatColor.GOLD + "     \"/cmodify @<username>\" to add someone to your lock as an admin");
				player.sendMessage(ChatColor.GOLD + "3) \"/cpersist\" to allow locking/modifying multiple items without typing command.");
				player.sendMessage(ChatColor.GOLD + "4) \"/cremove\" to remove a lock from a chest, door, furnace, etc.");
				player.sendMessage(ChatColor.GOLD + "5) \"/cpublic\" to allow anyone to access your chest but not break it.");
				player.sendMessage(ChatColor.GOLD + "6) \"/cdonation\" to allow anyone to add to your chest but not take from or break it.");
				player.sendMessage(ChatColor.GOLD + "7) \"/cpassword <password>\" to allow anyone with a password to access your locked item.");
				player.sendMessage(ChatColor.GOLD + "     \"/cunlock <password>\" to unlock a locked item with a passcode for you.");
				player.sendMessage(ChatColor.GOLD + "8) \"/lwc flag <flag> <on/off>\" to apply a flag to a locked item.");
				player.sendMessage(ChatColor.GOLD + "     ex: \"/lwc flag autoclose on\" will apply a flag that autocloses a door after being opened.");
				
				return true;
			} else {
				player.sendMessage(ChatColor.RED + "Those are not valid parameters!");
				return true;
			}
		}
		

	if(label.equalsIgnoreCase("finish")) {
		player.teleport(new Location(Bukkit.getWorld("world"), -984, 70, -836));
		player.sendMessage(ChatColor.AQUA + "[CVTutorial] Teleporting you to spawn...");
	}

	return false;
}
}
