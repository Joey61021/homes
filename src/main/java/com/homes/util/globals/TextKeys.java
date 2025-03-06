package com.homes.util.globals;

import com.homes.config.keys.TextConfigKey;

import static com.homes.config.DataSupplier.textKey;

public final class TextKeys
{
    private TextKeys()
    {
    }

    public static final TextConfigKey SETTINGS_MAX_HOMES = textKey("settings.max_homes");

    public static final TextConfigKey COMMAND_CONSOLE_BLOCKED = textKey("commands.console_blocked");
    
    public static final TextConfigKey COMMAND_SETHOME_USAGE = textKey("commands.sethome.usage");
    public static final TextConfigKey COMMAND_SETHOME_TOO_MANY = textKey("commands.sethome.too_many");
    public static final TextConfigKey COMMAND_SETHOME_IN_USE = textKey("commands.sethome.in_use");
    public static final TextConfigKey COMMAND_SETHOME_SET = textKey("commands.sethome.set");

    public static final TextConfigKey COMMAND_HOME_AVAILABLE = textKey("commands.home.available");
    public static final TextConfigKey COMMAND_HOME_NO_HOMES = textKey("commands.home.no_homes");
    public static final TextConfigKey COMMAND_HOME_NOT_FOUND = textKey("commands.home.not_found");
    public static final TextConfigKey COMMAND_HOME_TELEPORTING = textKey("commands.home.teleporting");

    public static final TextConfigKey COMMAND_DELHOME_USAGE = textKey("commands.delhome.usage");
    public static final TextConfigKey COMMAND_DELHOME_NOT_FOUND = textKey("commands.delhome.not_found");
    public static final TextConfigKey COMMAND_DELHOME_DELETED = textKey("commands.delhome.deleted");
}
