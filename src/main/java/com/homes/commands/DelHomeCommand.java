
package com.homes.commands;

import com.homes.HomesCore;
import com.homes.events.HomeManager;
import com.homes.util.globals.TextKeys;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class DelHomeCommand
{
    private DelHomeCommand()
    {
    }

    public static boolean delhome(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (!(sender instanceof Player player))
        {
            sender.sendMessage(HomesCore.getConfigKeys().get(TextKeys.COMMAND_CONSOLE_BLOCKED));
            return true;
        }

        // /sethome [name]
        if (args.length == 0)
        {
            player.sendMessage(HomesCore.getConfigKeys().get(TextKeys.COMMAND_DELHOME_USAGE));
            return true;
        }

        String name = args[0].toLowerCase(); // Must be lowercase
        if (!HomeManager.exists(player, name))
        {
            player.sendMessage(HomesCore.getConfigKeys().get(TextKeys.COMMAND_DELHOME_NOT_FOUND));
            return true;
        }

        HomeManager.delHome(player, name);
        player.sendMessage(HomesCore.getConfigKeys().get(TextKeys.COMMAND_DELHOME_DELETED));
        return true;
    }
}
