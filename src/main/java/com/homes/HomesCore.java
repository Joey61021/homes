package com.homes;

import com.homes.commands.DelHomeCommand;
import com.homes.commands.HomeCommand;
import com.homes.commands.SetHomeCommand;
import com.homes.config.Config;
import com.homes.events.HomeManager;
import com.homes.util.EmptyClass;
import com.homes.util.globals.TextKeys;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class HomesCore extends JavaPlugin {

    private static Config config;
    private static Config homes;

    public static Config getConfigKeys()
    {
        return config;
    }

    public static Config getHomes()
    {
        return homes;
    }

    private void registerEvents() {
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(new HomeManager(), this);

    }

    @SuppressWarnings("all")
    private void registerCommands()
    {
        getCommand("sethome").setExecutor(SetHomeCommand::sethome);
        getCommand("home").setExecutor(HomeCommand::home);
        getCommand("delhome").setExecutor(DelHomeCommand::delhome);
    }

    @Override
    public void onEnable()
    {

        config = new Config(this, TextKeys.class, "config.yml");
        homes = new Config(this, EmptyClass.class, "homes.yml");

        registerEvents();
        registerCommands();
    }
}
