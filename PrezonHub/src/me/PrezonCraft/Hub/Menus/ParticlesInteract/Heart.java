package me.PrezonCraft.Hub.Menus.ParticlesInteract;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.PrezonCraft.Hub.Main;

public class Heart implements Listener{

	@EventHandler
	  public void onClick2f(InventoryClickEvent e)
	  {
         Player p = (Player) e.getWhoClicked();			

	      if (e.getCurrentItem().getItemMeta().getDisplayName()
	    		  .equalsIgnoreCase("&aHeart Trail"
	    		  .replace("&", "�")))
	      {
        Main.flame.remove(p.getUniqueId());
        Main.rainbow.remove(p.getUniqueId());
        Main.enchant.remove(p.getUniqueId());
        Main.bubbel.remove(p.getUniqueId());
        Main.snow.remove(p.getUniqueId());
        Main.redstone.remove(p.getUniqueId());
        Main.happy.remove(p.getUniqueId());
        Main.cloud.remove(p.getUniqueId());
        Main.note.remove(p.getUniqueId());
        Main.heart.add(p.getUniqueId());
        Main.smoke.remove(p.getUniqueId());
        Main.witch.remove(p.getUniqueId());
        Main.sql.setVANITY_PARTICLES_ALL(p);
        Main.sql.setVANITY_PARTICLES(p, 1, "HEART");
	      }
	      
	      if (e.getCurrentItem().getItemMeta().getDisplayName()
	    		  .equalsIgnoreCase("&cHeart Trail"
	    		  .replace("&", "�")))
	      {
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&4&lTrails&f] Je hebt de rank &cvillager &fnodig om dit te kunnen!"));
	      }
	      
	    }
	
}