package io.github.keirenw.dugsfundamentals;

import io.github.keirenw.dugsfundamentals.commands.misc.CommandPing;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class DugsFundamentals extends JavaPlugin {

    /**
     * Startup
     */
    @Override
    public void onEnable() {
        getLogger().info("Starting...");

        File cfg = new File(getDataFolder(), "config.yml");

        if (cfg.exists()) {
            getLogger().info("config.yml found, initialising...");
            saveConfig();
        }
        else {
            getLogger().info("config.yml not found, generating");
            saveDefaultConfig();
        }

          ///////////////////////
         // REGISTER COMMANDS //
        ///////////////////////
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Destroying DugFundamentals...");
    }
}
