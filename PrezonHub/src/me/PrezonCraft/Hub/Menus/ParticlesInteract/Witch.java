package me.PrezonCraft.Hub.Menus.ParticlesInteract;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.PrezonCraft.Hub.Main;

public class Witch implements Listener{
	
	@EventHandler
	  public void onClick2f(InventoryClickEvent e)
	  {
           Player p = (Player) e.getWhoClicked();			
 
	      if (e.getCurrentItem().getItemMeta().getDisplayName()
	    		  .equalsIgnoreCase("&aWitch Trail"
	    		  .replace("&", "�")))
	      {
          Main.flame.remove(p.getUniqueId());
          Main.snow.remove(p.getUniqueId());
          Main.note.remove(p.getUniqueId());
          Main.happy.remove(p.getUniqueId());
          Main.rainbow.remove(p.getUniqueId());
          Main.smoke.remove(p.getUniqueId());
          Main.redstone.remove(p.getUniqueId());
          Main.bubbel.remove(p.getUniqueId());
          Main.cloud.remove(p.getUniqueId());
          Main.heart.remove(p.getUniqueId());
          Main.witch.add(p.getUniqueId());
          Main.slime.remove(p.getUniqueId());
          Main.enchant.remove(p.getUniqueId());
          Main.sql.setVANITY_PARTICLES_ALL(p);
          Main.sql.setVANITY_PARTICLES(p, 1, "WITCH");
	      }
	      
	      if (e.getCurrentItem().getItemMeta().getDisplayName()
	    		  .equalsIgnoreCase("&cWitch Trail"
	    		  .replace("&", "�")))
	      {
          p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&4&lTrails&f] Je hebt de rank &cchicken &fnodig om dit te kunnen!"));
	      }
	      
	    }

}
