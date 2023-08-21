package nl.matthijspc.worldalert;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
public final Logger logger = Logger.getLogger("Minecraft");
PluginDescriptionFile pdf = this.getDescription();
static Plugin plugin;

public void onEnable()
{
  this.logger.info("[WorldAlert] Plugin is now enabled! Developed by " + pdf.getAuthors());
  plugin = this;
  getCommand("alert").setExecutor(new Commands());
}

public void onDisable()
{
  this.logger.info("[WorldAlert] Plugin is now disabled! Develop by " + pdf.getAuthors());
  plugin = null;
}
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
{
	if(cmd.getName().equalsIgnoreCase("worldalert")) {
	if(sender.hasPermission("WorldAlert.version")){
		sender.sendMessage(ChatColor.RED + "[WorldAlert] " + ChatColor.WHITE + "You are running version " + pdf.getVersion() + " coded by " + pdf.getAuthors());
	}else{
		sender.sendMessage(ChatColor.RED + "[WorldAlert] " + ChatColor.WHITE + "You don't have permission to do this!");
	}
}
	return true;
}
}


