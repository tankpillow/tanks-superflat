package dev.tankpillow.superflat.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import net.kyori.adventure.text.TextComponent;

public class Wrapper {

	public static void broadcastMessage(String message)
	{
		for(Player player : Bukkit.getOnlinePlayers()) {
			playerMessage(player, message);
		}
	}
	
	public static void playerMessage(Player player, String message)
	{
		TextComponent msg = ColorUtils.convertColor(message);
		player.sendMessage(msg);
	}
	
	public static void consoleMessage(String message) 
	{
		TextComponent msg = ColorUtils.convertColor(message);
		Bukkit.getConsoleSender().sendMessage(msg);
	}
	
}
