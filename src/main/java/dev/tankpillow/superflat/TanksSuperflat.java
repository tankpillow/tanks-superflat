package dev.tankpillow.superflat;

import org.bukkit.plugin.java.JavaPlugin;

public class TanksSuperflat extends JavaPlugin
{
	private static TanksSuperflat singleton;
	
	public static TanksSuperflat getSingleton()
	{
		return TanksSuperflat.singleton;
	}
	
	@Override
	public void onEnable()
	{
		TanksSuperflat.singleton = this;
		
	}
	
	@Override
	public void onDisable()
	{
		
	}
}
