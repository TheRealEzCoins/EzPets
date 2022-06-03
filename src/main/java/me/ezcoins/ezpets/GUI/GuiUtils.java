package me.ezcoins.ezpets.GUI;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.ezcoins.ezpets.Utils.customItemName;

public class GuiUtils  {

    public static ItemStack menuClose() {
        return customItemName(
                Material.BARRIER,
                "§cClose",
                "",
                "§8Closes the menu.");
    }
}
