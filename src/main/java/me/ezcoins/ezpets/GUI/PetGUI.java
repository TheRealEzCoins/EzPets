package me.ezcoins.ezpets.GUI;

import me.ezcoins.ezpets.EzPets;
import me.ezcoins.ezpets.Pets;
import me.ezcoins.ezpets.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.persistence.PersistentDataType;

public class PetGUI {

    public static Inventory PetGUI(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 54, "Pets");
        GuiUtils.fillBorder(inventory);

        inventory.setItem(49, GuiUtils.menuClose());

        if(Utils.hasPet(player, Pets.TESTPET)) {
            inventory.setItem(10, Utils.customItemName(Material.PLAYER_HEAD, "§c"));
        }

        return inventory;
    }
}
