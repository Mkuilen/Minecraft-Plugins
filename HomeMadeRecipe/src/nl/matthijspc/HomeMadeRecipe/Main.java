 package nl.matthijspc.HomeMadeRecipe;
 
 import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
 
 public class Main extends JavaPlugin
 {
	 
	 public final Logger logger = Logger.getLogger("Minecraft");
	 PluginDescriptionFile pdf = this.getDescription();
   public void onEnable()
   {
	   this.logger.info("[HomeMadeRecipe] version " + pdf.getVersion() + " is now enabled! Developed by " + pdf.getAuthors());
      ShapedRecipe lava_bucket = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.LAVA_BUCKET));
      lava_bucket.shape(new String[] { "!!!", "!@!", "!!!" }).setIngredient('!', Material.STONE).setIngredient('@', Material.BUCKET);
      Bukkit.getServer().addRecipe(lava_bucket);
     
      ShapedRecipe dirt = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.DIRT));
      ShapedRecipe dirt2 = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.DIRT));
      ShapedRecipe dirt3 = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.DIRT));
      ShapedRecipe dirt4 = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.DIRT));
      ShapedRecipe dirt5 = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.DIRT));
      ShapedRecipe dirt6 = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.DIRT));
      ShapedRecipe dirt7 = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.DIRT));
      ShapedRecipe dirt8 = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.DIRT));
      ShapedRecipe dirt9 = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.DIRT));
      dirt.shape(new String[] { "#  ", "   ", "   " }).setIngredient('#', Material.COBBLESTONE);
      dirt2.shape(new String[] { " # ", "   ", "   " }).setIngredient('#', Material.COBBLESTONE); 
      dirt3.shape(new String[] { "  #", "   ", "   " }).setIngredient('#', Material.COBBLESTONE);      
      dirt4.shape(new String[] { "   ", "#  ", "   " }).setIngredient('#', Material.COBBLESTONE);     
      dirt5.shape(new String[] { "   ", " # ", "   " }).setIngredient('#', Material.COBBLESTONE);
      dirt6.shape(new String[] { "   ", "  #", "   " }).setIngredient('#', Material.COBBLESTONE);
      dirt7.shape(new String[] { "   ", "   ", "#  " }).setIngredient('#', Material.COBBLESTONE);
      dirt8.shape(new String[] { "   ", "   ", " # " }).setIngredient('#', Material.COBBLESTONE);
      dirt9.shape(new String[] { "   ", "   ", "  #" }).setIngredient('#', Material.COBBLESTONE);
      Bukkit.getServer().addRecipe(dirt);
      Bukkit.getServer().addRecipe(dirt2);
      Bukkit.getServer().addRecipe(dirt3);
      Bukkit.getServer().addRecipe(dirt4);
      Bukkit.getServer().addRecipe(dirt5);
      Bukkit.getServer().addRecipe(dirt6);
      Bukkit.getServer().addRecipe(dirt7);
      Bukkit.getServer().addRecipe(dirt8);
      Bukkit.getServer().addRecipe(dirt9);
     
     ShapedRecipe sand = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.SAND));
     sand.shape(new String[] { "   ", "   ", "  $" }).setIngredient('$', Material.DIRT);
     Bukkit.getServer().addRecipe(sand);
     
     ShapedRecipe gravel = new ShapedRecipe(new org.bukkit.inventory.ItemStack(Material.GRAVEL));
     gravel.shape(new String[] { "   ", "   ", "  €" }).setIngredient('€', Material.SAND);
     Bukkit.getServer().addRecipe(gravel);
   }
   
   public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args)
   {
	   if(cmd.getName().equalsIgnoreCase("hmr")){
		   sender.sendMessage(ChatColor.DARK_AQUA + "[HomeMadeRecipe] " + ChatColor.WHITE + "You are running version " + pdf.getVersion() + " coded by " + pdf.getAuthors());
	   }
	return true;
	   
   }
   
   public void onDisable() {
     Bukkit.getServer().clearRecipes();
     this.logger.info("[HomeMadeRecipe] version " + pdf.getVersion() + " is now disabled! Developed by " + pdf.getAuthors());
   }
}