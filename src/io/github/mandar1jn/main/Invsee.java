package io.github.mandar1jn.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.mandar1jn.commands.InvseeCommand;

public class Invsee extends JavaPlugin
{

    public void onEnable() {
        this.registerCommands();
    }
    
    public void onDisable() {
    }
    
    public void registerCommands() {
        this.getCommand("invsee").setExecutor((CommandExecutor)new InvseeCommand());
    }
}
