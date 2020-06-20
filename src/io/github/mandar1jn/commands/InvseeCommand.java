package io.github.mandar1jn.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class InvseeCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        final Player player = (Player)sender;
        if (!player.hasPermission("commands.invsee")) {
            player.sendMessage(ChatColor.RED + "You don't have the permission to do that!");
            return false;
        }
        if (args.length != 1) {
            player.sendMessage(ChatColor.RED + "Please also input a target player!");
            return false;
        }
        final Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            player.sendMessage("That player is offline or doesn't exist!");
            return false;
        }
        player.openInventory((Inventory)target.getInventory());
        return false;
    }
}
