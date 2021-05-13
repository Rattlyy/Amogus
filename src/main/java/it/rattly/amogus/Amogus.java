package it.rattly.amogus;

import it.rattly.amogus.commands.AmogusCommand;
import it.rattly.amogus.listeners.SussyListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Amogus extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new SussyListener(), this);
        getCommand("amogus").setExecutor(new AmogusCommand());
    }
}
