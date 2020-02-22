package fr.creeper.ElliozBungee;

import java.io.File;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.YamlConfiguration;

public class JoinFriendCommand extends Command {
	ElliozBungee b;
	Saver SaveFriends;
	public static Saver SaveFriendDemandeur;
	public static Saver SaveFriendReceveur;
	public JoinFriendCommand() {
		super("friend","");
	}

	 @SuppressWarnings("deprecation")
	@Override
	  public void execute(CommandSender sender, String[] strings) {
	    	  if(sender instanceof ProxiedPlayer) {
	    		  CommandSender playerdemandeur = sender;
	    		  String playerecois = strings[0];
	    		  SaveFriendDemandeur = new Saver(new File(playerdemandeur + "-friends.properties"));
	    		  SaveFriendReceveur = new Saver(new File(playerdemandeur + "-friends.properties"));
	    		  
	    		  ProxiedPlayer player = ProxyServer.getInstance().getPlayer(playerecois);
	    		  if (player == null)
	    		  {
	    		      System.out.println("Le joueur (" + playerecois + ") n'est pas en ligne !");
	    		  } else {
	    			  System.out.println("Le joueur (" + playerecois + ") est en ligne !");
	    		  }
	    		  String playerdemandeurfriendslot1 = SaveFriendDemandeur.get("friendslot1");
	    		  String playerdemandeurfriendslot2 = SaveFriendDemandeur.get("friendslot2");
	    		  String playerdemandeurfriendslot3 = SaveFriendDemandeur.get("friendslot3");
	    		  String playerdemandeurfriendslot4 = SaveFriendDemandeur.get("friendslot4");
	    		  String playerdemandeurfriendslot5 = SaveFriendDemandeur.get("friendslot5");
	    		  
	    		  if(playerdemandeurfriendslot1 == null) {
	    			 System.out.println("Slot 1 de " + playerdemandeur + " : Pas définit, mise en place.");
	    			 SaveFriendDemandeur.set("friendslot1", "");
	    			 System.out.println("Slot 1 de " + playerdemandeur + " : Définit !.");
	    		  }
	    		  //SaveFriend.set("Test", "cc");
	    		  //SaveFriend.set("Test", "coc");
	    		  //if(b.getProxy().getPlayer(strings[0]).isConnected() != false) {
	    		  //ProxiedPlayer senderP = (ProxiedPlayer) sender;
	    		  //ProxiedPlayer requestedP = b.getProxy().getPlayer(strings[0]);
	    		  //SaveFriends = new Saver(new File("playerfriends.properties"));		
	      //if(strings.length <= 1) {
	    	  //if(sender instanceof ProxiedPlayer) {
	    		  
	    		  //ProxiedPlayer senderP = (ProxiedPlayer) sender;
                  //ProxiedPlayer requestedP = ProxyServer.getInstance().getPlayer(strings[0]);

	    		  
	    		  //SaveFriends = new Saver(new File("playerfriends.properties"));
	    		 //SaveFriends.set(sender.getName(), requestedP.getName());
	    		  
	    		  
	    		  
	    		  
	    		 
	    		  //requestedP.sendMessage("[Ellioz Friends] §e" + senderP.getName() + "§r vous invite à être son ami. Vous avez 60 secondes pour l'accepter ou le refuser");
	    		  
	    		  
	    		  //TextComponent accept = new TextComponent( "Accepter (/friendaccept)" );
	    		  //accept.setColor( net.md_5.bungee.api.ChatColor.GREEN );
	    		  //accept.setBold( true );
	    		  //accept.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "friendaccept"));
	    		  
	    		  
	    		  
	    		  //TextComponent deny = new TextComponent( "Refuser (/friendeny)" );
	    		  //deny.setColor( net.md_5.bungee.api.ChatColor.GREEN );
	    		  //deny.setBold( true );
	    		  //deny.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "friendeny"));
	    		  
	    		 //requestedP.sendMessage(accept);
	    		 //requestedP.sendMessage(deny);
	    		 
	    		 
	    		//b.friends.put(requestedP, senderP);
	    		 
	    		 
	    		  //}
	    		  
	    	  }
	  }

}