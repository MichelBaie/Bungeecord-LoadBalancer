package fr.creeper.ElliozBungee;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
public class ElliozBungee extends Plugin {
	//String fileName = "playerfriends";
	//Configuration config = getConfig();
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
	/*public void createFile(){
        if(!getDataFolder().exists()){
            getDataFolder().mkdir();
        }
 
        File file = new File(getDataFolder(), fileName + ".yml");
 
        if(!file.exists()){
            try {
                file.createNewFile();
 
                //if(fileName.equals("mysql")){
                //    Configuration config = getConfig(fileName);
                //    config.set("mysql.host", "localhost");
                //
                //    saveConfig(config, fileName);
                //}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	
	public void savePlayerData(String[] string, String[] string){
        config.set(strings[0], strings[1]);
		saveConfig(config);
    }
    public Configuration getConfig(){
        try {
            return ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(getDataFolder(), fileName + ".yml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
 
    public void saveConfig(Configuration config){
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(config, new File(getDataFolder(), fileName + ".yml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    } */
}