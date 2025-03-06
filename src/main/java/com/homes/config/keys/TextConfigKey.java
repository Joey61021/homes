package com.homes.config.keys;

import com.homes.config.Config;
import com.homes.config.DataSupplier;
import org.bukkit.ChatColor;

public class TextConfigKey extends ConfigKey<String>
{
    public TextConfigKey(String path)
    {
        super(DataSupplier.STRING, path);
    }

    @Override
    public String get(Config config)
    {
        String s = super.get(config);

        return ChatColor.translateAlternateColorCodes('&', s == null ? "" : s);
    }
}
