package xyz.ng7.passengerbug;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.ng7.passengerbug.commands.Demo2Command;
import xyz.ng7.passengerbug.commands.DemoCommand;

public class PassengerBug extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("demo").setExecutor(new DemoCommand());
        this.getCommand("demo2").setExecutor(new Demo2Command());
    }
}
