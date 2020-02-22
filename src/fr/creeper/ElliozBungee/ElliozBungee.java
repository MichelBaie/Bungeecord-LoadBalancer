package fr.creeper.ElliozBungee;



import net.md_5.bungee.api.plugin.Plugin;
public class ElliozBungee extends Plugin {
	public void onEnable() {
		System.out.println("Plugin Activé !");
	    getProxy().getPluginManager().registerCommand(this, new TestCommand());
	    getProxy().getPluginManager().registerCommand(this, new CreateCommand());
	    getProxy().getPluginManager().registerCommand(this, new JoinFriendCommand());
	}
	public void onDisable() {
		System.out.println("Plugin Désactivé !");
	}

}
