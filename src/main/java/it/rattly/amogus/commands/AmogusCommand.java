package it.rattly.amogus.commands;

import it.rattly.amogus.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@SuppressWarnings("NullableProblems")
public class AmogusCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cYou must be a player to use this.");
            return false;
        }

        Player player = (Player) sender;
        player.getInventory().addItem(Utils.getAmogus());

        player.sendMessage("§cAn imposter was found in your inventory...");
        return false;
    }
}
