package me.ezcoins.ezpets;

import com.jeff_media.morepersistentdatatypes.DataType;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Arrays;

public class Utils {

    public static ItemStack makeItem(Material material, String displayName, int amount, int durability, String... lore){
        ItemStack item = new ItemStack(material, amount, (short) durability);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayName);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack customItemName(Material mat, String name, String... lore){
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);
        return item;
    }

    public static void givePet(Player player, Pets pet) {
        PersistentDataContainer getData = player.getPersistentDataContainer();
        getData.set(new NamespacedKey(EzPets.getPlugin(), pet.name()), DataType.BOOLEAN, Boolean.TRUE);

    }

    public static void RemovePet(Player player, Pets pet) {
        PersistentDataContainer getData = player.getPersistentDataContainer();
        getData.set(new NamespacedKey(EzPets.getPlugin(), pet.name()), DataType.BOOLEAN, Boolean.FALSE);

    }

    public static boolean hasPet(Player player, Pets pet) {
        PersistentDataContainer getData = player.getPersistentDataContainer();
        Boolean getPet = getData.get(new NamespacedKey(EzPets.getPlugin(), pet.name()), DataType.BOOLEAN);

        return Boolean.TRUE.equals(getPet);
    }
}
