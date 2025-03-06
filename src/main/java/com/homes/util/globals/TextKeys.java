package com.homes.util.globals;

import com.homes.config.keys.TextConfigKey;

import static com.homes.config.DataSupplier.textKey;

public final class TextKeys
{
    private TextKeys()
    {
    }

    public static final TextConfigKey SETTINGS_MAX_HOMES = textKey("settings.max_homes");

    public static final TextConfigKey MESSAGES_CONSOLE_BLOCKED = textKey("messages.console_blocked");
    
    public static final TextConfigKey MESSAGES_SETHOME_USAGE = textKey("messages.sethome.usage");
    public static final TextConfigKey MESSAGES_SETHOME_TOO_MANY = textKey("messages.sethome.too_many");
    public static final TextConfigKey MESSAGES_SETHOME_IN_USE = textKey("messages.sethome.in_use");
    public static final TextConfigKey MESSAGES_SETHOME_SET = textKey("messages.sethome.set");

    public static final TextConfigKey MESSAGES_HOME_AVAILABLE = textKey("messages.home.available");
    public static final TextConfigKey MESSAGES_HOME_NO_HOMES = textKey("messages.home.no_homes");
    public static final TextConfigKey MESSAGES_HOME_NOT_FOUND = textKey("messages.home.not_found");
    public static final TextConfigKey MESSAGES_HOME_TELEPORTING = textKey("messages.home.teleporting");

    public static final TextConfigKey MESSAGES_DELHOME_USAGE = textKey("messages.delhome.usage");
    public static final TextConfigKey MESSAGES_DELHOME_NOT_FOUND = textKey("messages.delhome.not_found");
    public static final TextConfigKey MESSAGES_DELHOME_DELETED = textKey("messages.delhome.deleted");
}
