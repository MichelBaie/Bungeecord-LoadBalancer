package fr.creeper.ElliozBungee;

import java.util.HashMap;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;
public class ElliozBungee extends Plugin {
	HashMap<ProxiedPlayer, ProxiedPlayer> friends = new HashMap<ProxiedPlayer, ProxiedPlayer>();
	public void onEnable() {
		System.out.println("Plugin Activé !");
	    getProxy().getPluginManager().registerCommand(this, new TestCommand());
	    getProxy().getPluginManager().registerCommand(this, new CreateCommand());
	    getProxy().getPluginManager().registerCommand(this, new JoinFriendCommand());
	    getProxy().getPluginManager().registerCommand(this, new FriendDeny());
	    getProxy().getPluginManager().registerCommand(this, new FriendAccept());
	}
	public void onDisable() {
		System.out.println("Plugin Désactivé !");
	}

}