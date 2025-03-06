
package com.homes.commands;

import com.homes.HomesCore;
import com.homes.events.HomeManager;
import com.homes.util.globals.TextKeys;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class SetHomeCommand
{
    private SetHomeCommand()
    {
    }

    public static boolean sethome(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (!(sender instanceof Player player))
        {
            sender.sendMessage(HomesCore.getConfigKeys().get(TextKeys.COMMAND_CONSOLE_BLOCKED));
            return true;
        }

        // /sethome [name]
        if (args.length == 0)
        {
            player.sendMessage(HomesCore.getConfigKeys().get(TextKeys.COMMAND_SETHOME_USAGE));
            return true;
        }

        if (HomeManager.homes.get(player.getUniqueId()).size() > Integer.parseInt(HomesCore.getConfigKeys().get(TextKeys.SETTINGS_MAX_HOMES)))
        {
            player.sendMessage(HomesCore.getConfigKeys().get(TextKeys.COMMAND_SETHOME_TOO_MANY));
            return true;
        }

        String name = args[0].toLowerCase(); // Needs to be lowercase
        if (HomeManager.exists(player, name))
        {
            player.sendMessage(HomesCore.getConfigKeys().get(TextKeys.COMMAND_SETHOME_IN_USE));
            return true;
        }

        HomeManager.addHome(player, name);
        player.sendMessage(HomesCore.getConfigKeys().get(TextKeys.COMMAND_SETHOME_SET).replace("%home%", name));
        return true;
    }
}
