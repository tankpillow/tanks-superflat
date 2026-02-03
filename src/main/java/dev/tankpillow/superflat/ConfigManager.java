package dev.tankpillow.superflat;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager 
{
	private static ConfigManager singleton;
	
	private FileConfiguration config;
	private TanksSuperflat plugin;
	
	// --- Static Methods --- //
	public static ConfigManager getSingleton()
	{
		if(ConfigManager.singleton == null) {
			ConfigManager.singleton = new ConfigManager();
		}
		
		return ConfigManager.singleton;
	}
	
	// --- Constructor --- //
	private ConfigManager()
	{
		this.plugin = TanksSuperflat.getSingleton();
		this.config = this.plugin.getConfig();
		this.plugin.saveDefaultConfig();
	}
	
	// --- Getter Methods --- //
	public static String getChatPrefix()
	{
		ConfigManager self = ConfigManager.getSingleton();
		return self.config.getString("chat-settings.prefix");
	}
}
