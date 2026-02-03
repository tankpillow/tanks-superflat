package dev.tankpillow.superflat.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import net.md_5.bungee.api.ChatColor;

public class ColorUtils 
{
	/**
	 * Converts legacy color codes (using '&') into Adventure {@link Component} formatting.
	 *
	 * @param message the input string containing legacy color codes
	 * @return a component with legacy colors applied
	 */
	public static TextComponent convertColor(String message)
	{
		String msg = ChatColor.translateAlternateColorCodes('&', message);
		return LegacyComponentSerializer.legacyAmpersand().deserialize(msg);
	}
}
