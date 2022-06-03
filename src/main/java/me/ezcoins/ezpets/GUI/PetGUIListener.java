package me.ezcoins.ezpets.GUI;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PetGUIListener implements Listener {
        @EventHandler
        public void onClick(InventoryClickEvent e) {
            Player player = (Player)e.getWhoClicked();
            if (e.getView().getTitle().equalsIgnoreCase("Pets")) {
                e.setCancelled(true);
                if (e.getCurrentItem() != null) {
                      if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                        player.closeInventory();
                    }
                }
            }
        }
}
