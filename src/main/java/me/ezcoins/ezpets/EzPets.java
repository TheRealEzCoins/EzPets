package me.ezcoins.ezpets;

import me.ezcoins.ezpets.GUI.PetGUIListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EzPets extends JavaPlugin {

    public static EzPets plugin;

    @Override
    public void onEnable() {

        getCommand("GivePet").setExecutor(new Commands());
        getCommand("Pets").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new PetGUIListener(), this);

        plugin = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static EzPets getPlugin(){
        return plugin;
    }
}
