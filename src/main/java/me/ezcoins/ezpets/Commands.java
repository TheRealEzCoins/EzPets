package me.ezcoins.ezpets;

import me.ezcoins.ezpets.GUI.PetGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player player = (Player) sender;
        if (!(sender instanceof Player)) {
            sender.sendMessage("No");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("Pets") && sender instanceof Player) {
            player.openInventory(PetGUI.PetGUI(player));
        } else if(cmd.getName().equalsIgnoreCase("GivePet")) {
            if(!(Utils.hasPet(player, Pets.TESTPET))) {
                Utils.givePet(player, Pets.TESTPET);
                player.sendMessage(Pets.TESTPET + " Added.");
            } else {
                Utils.RemovePet(player, Pets.TESTPET);
                player.sendMessage(Pets.TESTPET + " Removed.");
            }

        }
        return true;
    }
}
