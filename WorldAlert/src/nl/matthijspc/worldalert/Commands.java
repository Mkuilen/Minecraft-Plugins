package nl.matthijspc.worldalert;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
	  if ((!cmd.getName().equalsIgnoreCase("alert")) || 
	    (sender.hasPermission("WorldAlert.send"))) {
	    if (args.length < 1)
	    {
	      sender.sendMessage(ChatColor.RED + "[WorldAlert] " + ChatColor.WHITE + "No text found");
	    }
	    else
	    {
	      {
	    if(sender.hasPermission("WorldAlert.receive")){
	    	String text = "";
	    	for (int i1 = 0; i1 < args.length; i1++) {
	    		text += args[i1] + " ";
	    	}
	        Bukkit.broadcastMessage(ChatColor.RED + "[ALERT] " + ChatColor.WHITE + text);
	    	}
	      }
	    }
	  } else {
	    sender.sendMessage(ChatColor.RED + "[WorldAlert] " + ChatColor.WHITE + "You don't have permission to do this!");
	  }
	  return true;
	}

}
