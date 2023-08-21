package nl.matthijspc.HomeMadeRecipeSurvival;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin
{
PluginDescriptionFile pdf = this.getDescription();
public final Logger logger = Logger.getLogger("Minecraft");
public void onEnable()
{
	this.logger.info("[HomeMadeRecipeSurvival] Plugin is enabled! Developed by " + pdf.getAuthors());

  ShapedRecipe saddle = new ShapedRecipe(new ItemStack(Material.SADDLE));
  saddle.shape(new String[] { "###", "#$#", "$ $" }).setIngredient('#', Material.LEATHER).setIngredient('$', Material.IRON_INGOT);
  Bukkit.getServer().addRecipe(saddle);
  
  ShapedRecipe diamond_barding = new ShapedRecipe(new ItemStack(Material.DIAMOND_BARDING));
  diamond_barding.shape(new String[] { "  %", "%€%", "%%%" }).setIngredient('%', Material.DIAMOND).setIngredient('€', Material.LEATHER);
  Bukkit.getServer().addRecipe(diamond_barding);
  
  ShapedRecipe gold_barding = new ShapedRecipe(new ItemStack(Material.GOLD_BARDING));
  gold_barding.shape(new String[] { "  ^", "^&^", "^^^" }).setIngredient('^', Material.GOLD_INGOT).setIngredient('&', Material.LEATHER);
  Bukkit.getServer().addRecipe(gold_barding);
  
  ShapedRecipe iron_barding = new ShapedRecipe(new ItemStack(Material.IRON_BARDING));
  iron_barding.shape(new String[] { "  *", "*(*", "***" }).setIngredient('*', Material.IRON_INGOT).setIngredient('(', Material.LEATHER);
  Bukkit.getServer().addRecipe(iron_barding);
  
  ShapedRecipe web = new ShapedRecipe (new ItemStack(Material.WEB));
  web.shape(new String[] { "   ", " **", " **"}).setIngredient('*', Material.STRING);
  Bukkit.getServer().addRecipe(web);
}

public void onDisable()
{
	this.logger.info("[HomeMadeRecipeSurvival] Plugin is disabled! Developed by " + pdf.getAuthors());
  Bukkit.getServer().clearRecipes();
}

public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args)
{
	if(cmd.getName().equalsIgnoreCase("hmrs")) {
	sender.sendMessage(ChatColor.AQUA + "[HomeMadeRecipeSurvival] " + ChatColor.WHITE + "You are running version " + pdf.getVersion());
	}
	return true;
}
}