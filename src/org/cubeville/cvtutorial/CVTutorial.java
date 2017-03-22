package org.cubeville.cvtutorial;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CVTutorial extends JavaPlugin {

	@Override
	public void onEnable() {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// use \" to escape a quote
		Player player = (Player) sender;
		if (label.equalsIgnoreCase("help")) {
			if (args.length == 0 || (args.length == 1 && args[0].equalsIgnoreCase("1"))) {
				player.sendMessage(ChatColor.RED + "Help 1 of 4 - Cubeville Commands:");
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
				player.sendMessage(ChatColor.GOLD + "     " + ChatColor.DARK_RED + "SADMINs " + ChatColor.GOLD+ "are the server managers");
				player.sendMessage(ChatColor.GOLD + "8) \"/mumble register\" to complete Mumble registration.");
				
				return true;
			} else if (args.length == 1 && args[0].equalsIgnoreCase("2")) {
				player.sendMessage(ChatColor.RED + "Help 2 of 4 - Chat Commands:");

				player.sendMessage(ChatColor.GOLD + "1) \"/y <message>\" will send your message to all players.");
				player.sendMessage(ChatColor.GOLD + "2) Typing without \"/\" will send your message to players within 50 blocks of you.");
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
			} else if (args.length == 1 && (args[0].equalsIgnoreCase("we") || args[0].equalsIgnoreCase("worldguard") || args[0].equalsIgnoreCase("3"))) {

				player.sendMessage(ChatColor.RED + "Help 3 of 4 - WorldGuard Commands:");
				player.sendMessage(ChatColor.GOLD + "1) \"/rg i\" to show the data for the region you are in.");
				player.sendMessage(ChatColor.GOLD + "2) \"/rg flag <region name> <flag type> [flag parameters]\" to add a flag to a region.");
				player.sendMessage(ChatColor.GOLD + "     ex: \"/rg flag tutorial greeting Hello World!\" sets flag greeting: \"Hello World!\" to region \"tutorial\"");
				player.sendMessage(ChatColor.GOLD + "3) \"/rg addmember <region name> <username>\" to add a member to your region.");
				player.sendMessage(ChatColor.GOLD + "     ex: \"/rg addmember tutorial RandomRob13\" will add RandomRob13 as a member to your region.");
				player.sendMessage(ChatColor.GOLD + "4) \"//size\" will show you the size of your selected region after using \"//wand\"");
				return true;
			} else if (args.length == 2 && ((args[0].equalsIgnoreCase("we") || args[0].equalsIgnoreCase("worldguard") || args[0].equalsIgnoreCase("3")) && (args[1].equalsIgnoreCase("2") || args[1].equalsIgnoreCase("tut") || args[1].equalsIgnoreCase("tutorial")))) {
				String playerName = player.getName().toString();

				player.sendMessage(ChatColor.RED + "Automatic Worldguard Region:");
				player.sendMessage(ChatColor.GOLD + "1) \"/claimhere\" to automatically claim a 30x30x256 region.");
				player.sendMessage(ChatColor.GOLD + "     Be sure to stay AT LEAST 40 blocks away from all builds and 100 blocks away from CV Towns & Villages!");
				player.sendMessage(ChatColor.GOLD + "     The region will be named home_" + playerName + ".");
				player.sendMessage(ChatColor.GOLD + "     \"/rg addmember home_" + playerName + " <username>\" to add a member to your region.");

				player.sendMessage("");

				player.sendMessage(ChatColor.RED + "Custom Worldguard Region:");
				player.sendMessage(ChatColor.GOLD + "1) Be sure to stay AT LEAST 40 blocks away from all builds and 100 blocks away from CV Towns & Villages!");
				player.sendMessage(ChatColor.GOLD + "2) \"//wand\" to give yourself a worldguard wand.");
				player.sendMessage(ChatColor.GOLD + "3) Right click one corner of your build, and left click the opposite corner.");
				player.sendMessage(ChatColor.GOLD + "4) \"//expand vert\" to expand your region vertically");
				player.sendMessage(ChatColor.GOLD + "5) \"/rg claim <region name>\" to claim your region.");
				player.sendMessage(ChatColor.GOLD + "6) \"/rg addmember <reigon name> <username>\" to add a user to your region.");

				return true;
			} else if (args.length == 1 && (args[0].equalsIgnoreCase("lwc") || args[0].equalsIgnoreCase("4"))) {
				player.sendMessage(ChatColor.RED + "Help 4 of 4 - LWC Commands:");

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
		
		if (label.equalsIgnoreCase("faq")) {
			if (args.length == 0 || (args.length == 1 && args[0].equalsIgnoreCase("1"))) {
				player.sendMessage(ChatColor.RED + "FAQ Page 1 of 2:");
				
				player.sendMessage(ChatColor.GOLD + "1) Players are chosen to be staff through honesty, politeness, and being mature.");
				player.sendMessage(ChatColor.GOLD + "     We will not select players to be staff if they ask.");
				player.sendMessage(ChatColor.GOLD + "2) Earn cubes by voting for the server or selling items.");
				player.sendMessage(ChatColor.GOLD + "     Vote for cubes at www.cubeville.org/vote/.");
				player.sendMessage(ChatColor.GOLD + "3) Build AT LEAST 40 blocks away from all builds and 100 blocks away from CV Towns & Villages!");
				player.sendMessage(ChatColor.GOLD + "     Only build closer with permission from other players/");
				player.sendMessage(ChatColor.GOLD + "4) Staff will not spawn items for you.");
				player.sendMessage(ChatColor.GOLD + "5) Staff will not teleport you by request.");
				player.sendMessage(ChatColor.GOLD + "6) Staff will not sell spawned items.");
				
				return true;
			} else if (args.length == 1 && args[0].equalsIgnoreCase("2")) {
				player.sendMessage(ChatColor.RED + "FAQ Page 2 of 2:");
				
				player.sendMessage(ChatColor.RED + "Instaday, Instanight, Instastorm, and Instasun all cost cubes!");
				player.sendMessage(ChatColor.GOLD + "1) Use \"/instaday\" and \"/instanight\" to change between day and night.");
				player.sendMessage(ChatColor.GOLD + "2) Use \"/instasun\" and \"/instastorm\" to change between sun and storm.");
				player.sendMessage(ChatColor.GOLD + "3) PvP is disabled everywhere except the PvP Arenas.");
				player.sendMessage(ChatColor.GOLD + "4) You can join channels with \"/ch j <channel name>\".");
				player.sendMessage(ChatColor.GOLD + "     \"/ch j market\" to join market chat.");
				player.sendMessage(ChatColor.GOLD + "     \"/mch <message>\" to type in market chat.");
				player.sendMessage(ChatColor.GOLD + "     \"/ch j pvp\" to join pvp chat.");
				player.sendMessage(ChatColor.GOLD + "     \"/pvp <message>\" to type in pvp chat.");
				
				return true;
			} else {
				player.sendMessage(ChatColor.RED + "Those are not valid parameters!");
				
				return true;
			}
		}
		
		if (label.equalsIgnoreCase("rules")) {
			if (args.length == 0 || (args.length == 1 && args[0].equalsIgnoreCase("1"))) {
				player.sendMessage(ChatColor.RED + "Rules Page 1 of 2:");
				player.sendMessage(ChatColor.DARK_RED + "THESE RULES ARE NOT NEGOTIABLE");
				player.sendMessage(ChatColor.DARK_RED + "THE FULL RULES ARE ON CUBEVILLE.ORG");
				
				player.sendMessage(ChatColor.GOLD + "1) Do as the staff say. We know best. We can help you if you cooperate.");
				player.sendMessage(ChatColor.GOLD + "2) Do not grief a build for" + ChatColor.BOLD + "ANY" + ChatColor.RESET + "" + ChatColor.GOLD + "reason.");
				player.sendMessage(ChatColor.GOLD + "3) No stealing. Give back items you accidentally pick up.");
				player.sendMessage(ChatColor.GOLD + "4) No hacking. No hacking clients. No hacking codes.");
				player.sendMessage(ChatColor.GOLD + "5) No XRaying of any form, including resource packs, mods, glitches, etc.");
				player.sendMessage(ChatColor.GOLD + "6) No swearing, this includes acronyms.");
				player.sendMessage(ChatColor.GOLD + "7) No vulgar/offensive behavior. Chat, skins, signs, builds.");
				
				return true;
			} else if (args.length == 1 && args [0].equalsIgnoreCase("2")) {
				player.sendMessage(ChatColor.RED + "Rules Page 2 of 2:");
				
				player.sendMessage(ChatColor.GOLD + "8) No exploiting glitches.");
				player.sendMessage(ChatColor.GOLD + "9) No unconsented PvP. This means any damage to players.");
				player.sendMessage(ChatColor.GOLD + "10) No advertising other servers.");
				player.sendMessage(ChatColor.GOLD + "11) Report any violations you see to staff.");
				player.sendMessage(ChatColor.GOLD + "12) Do not post offensive/vulgar links in chat.");
				player.sendMessage(ChatColor.GOLD + "13) Do not trick players into /kill'ing themselves.");
				player.sendMessage(ChatColor.GOLD + "14) Do not create excessive lag on the server.");
				
				return true;
			} else {
				player.sendMessage(ChatColor.RED + "Those are not valid parameters!");
				
				return true;
			}
		}
		
		if (label.equalsIgnoreCase("finish")) {
			player.teleport(new Location(Bukkit.getWorld("world"), -984, 70, -836));
			
			return true;
		}

		return false;
	}
}