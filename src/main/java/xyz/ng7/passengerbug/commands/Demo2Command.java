package xyz.ng7.passengerbug.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class Demo2Command implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player && ((Player) commandSender).isInsideVehicle()) {
            Player player = (Player) commandSender;
            Entity vehicle = player.getVehicle();

            Location destination = player.getLocation();
            destination.add(destination.getDirection().multiply(10));
            destination.setY(player.getWorld().getHighestBlockYAt(destination) + 2);

            vehicle.teleport(destination);
            return true;
        } else {
            commandSender.sendMessage("This command can only be used by a player in a vehicle.");
            return false;
        }
    }
}
