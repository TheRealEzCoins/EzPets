package me.ezcoins.ezpets.GUI;

import me.ezcoins.ezpets.Pets;
import me.ezcoins.ezpets.Utils;
import me.ezplugin.Utils.GuiUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static me.ezcoins.ezpets.Utils.customItemName;

public class PetGUI {

    private static final ItemStack blackglass = customItemName(Material.BLACK_STAINED_GLASS_PANE, " ");

    private static final int[] black_border = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            17, 18, 26, 27, 35, 36, 44, 46, 47, 48, 50,
            51, 52, 53};

    public static Inventory PetGUI(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 54, "Pets");

        inventory.setItem(49, GuiUtils.menuClose());

        if(Utils.hasPet(player, Pets.TESTPET)) {
            inventory.setItem(10, customItemName(Material.PLAYER_HEAD, "§c"));
        }

        for (int slot : black_border)
            inventory.setItem(slot, blackglass);
        return inventory;

    }
}
