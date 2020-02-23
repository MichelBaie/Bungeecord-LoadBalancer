package fr.creeper.ElliozBungee;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class TestCommand extends Command {
	public TestCommand(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}




	ElliozBungee p;
	
	

	
	@Override
    public void execute(CommandSender sender, String[] args) {
		 
		if (!(sender instanceof ProxiedPlayer)) {
		        sender.sendMessage(new ComponentBuilder("This command can only be run by a player!").color(ChatColor.RED).create());
		        return;
		    }
		    ProxiedPlayer player = (ProxiedPlayer) sender;
		    if (player.getServer().getInfo().getName().equalsIgnoreCase("hub")) {
		        player.sendMessage(new ComponentBuilder("You are already connected to the Hub!").color(ChatColor.RED).create());
		        return;
		    }
		    System.out.println("Commande !");
		    //On get le nombre de joueurs
		    int Dev01J = ProxyServer.getInstance().getServerInfo("Dev1").getPlayers().size();
		    int Dev02J = ProxyServer.getInstance().getServerInfo("Dev2").getPlayers().size();
		    
		    
		    if (Dev01J <= Dev02J) {
		    	ServerInfo target = ProxyServer.getInstance().getServerInfo("Dev1");
		    	player.connect(target);
		    }
		    else if (Dev02J <= Dev01J) {
		    	ServerInfo target = ProxyServer.getInstance().getServerInfo("Dev2");
		    	player.connect(target);
		    }
		    //On trie les serveurs
		    //ArrayList srvvide = new ArrayList();
		    //srvvide.add(Dev01J);
		    //srvvide.add(Dev02J);
		    //Collections.sort(srvvide, Collections.reverseOrder());
		    //ServerInfo target = ProxyServer.getInstance().getServerInfo("Dev2");
		    //int nbjoueur = ProxyServer.getInstance().getServerInfo("Dev1").getPlayers().size();
		    //System.out.println(nbjoueur);
		    //player.connect(target);
    }
	

}
