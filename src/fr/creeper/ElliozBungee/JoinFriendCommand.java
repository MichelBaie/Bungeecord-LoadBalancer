package fr.creeper.ElliozBungee;

import java.io.File;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class JoinFriendCommand extends Command {
	public JoinFriendCommand(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	ElliozBungee b;
	Saver SaveFriends;
	public static Saver SaveFriendDemandeur;
	public static Saver SaveFriendReceveur;
	public String playerdemandeurfriendslot1 = SaveFriendDemandeur.get("friendslot1");
	public String playerdemandeurfriendslot2 = SaveFriendDemandeur.get("friendslot2");
	public String playerdemandeurfriendslot3 = SaveFriendDemandeur.get("friendslot3");
	public String playerdemandeurfriendslot4 = SaveFriendDemandeur.get("friendslot4");
	public String playerdemandeurfriendslot5 = SaveFriendDemandeur.get("friendslot5");
	public String playerdemandeurinvitewating = SaveFriendDemandeur.get("invitewaiting");
	public String playerecoisfriendslot1 = SaveFriendReceveur.get("friendslot1");
	public String playerecoisfriendslot2 = SaveFriendReceveur.get("friendslot2");
	public String playerecoisfriendslot3 = SaveFriendReceveur.get("friendslot3");
	public String playerecoisfriendslot4 = SaveFriendReceveur.get("friendslot4");
	public String playerecoisfriendslot5 = SaveFriendReceveur.get("friendslot5");
	public String playerecoisinvitewaiting = SaveFriendReceveur.get("invitewaiting");
	

	 @SuppressWarnings("deprecation")
	@Override
	  public void execute(CommandSender sender, String[] strings) {
		  
	    	  if(sender instanceof ProxiedPlayer) {
	    		  String playerecoisonline = "null";
	    		  CommandSender playerdemandeur = sender;
	    		  String playerecois = strings[0];
	    		  SaveFriendDemandeur = new Saver(new File(playerdemandeur + "-friends.properties"));
	    		  SaveFriendReceveur = new Saver(new File(playerecois + "-friends.properties"));
	    		  
	    		  
	    		  ProxiedPlayer player = ProxyServer.getInstance().getPlayer(playerecois);
	    		  if (player == null)
	    		  {
	    		      System.out.println("Le joueur (" + playerecois + ") n'est pas en ligne !");
	    		      playerecoisonline = "false";
	    		  } else {
	    			  System.out.println("Le joueur (" + playerecois + ") est en ligne !");
	    			  playerecoisonline = "true";
	    		  }
	    		  
	    		  //
	    		  // On Initialise les Amis de l'Envoyeur
	    		  //
	    		  if(playerdemandeurfriendslot1 == null) {
	    			 System.out.println("Slot 1 de " + playerdemandeur + " : Pas définit, mise en place.");
	    			 SaveFriendDemandeur.set("friendslot1", "");
	    			 System.out.println("Slot 1 de " + playerdemandeur + " : Définit !.");
	    		  }
	    		  if(playerdemandeurfriendslot2 == null) {
		    			 System.out.println("Slot 2 de " + playerdemandeur + " : Pas définit, mise en place.");
		    			 SaveFriendDemandeur.set("friendslot2", "");
		    			 System.out.println("Slot 2 de " + playerdemandeur + " : Définit !.");
		    		  }
	    		  if(playerdemandeurfriendslot3 == null) {
		    			 System.out.println("Slot 3 de " + playerdemandeur + " : Pas définit, mise en place.");
		    			 SaveFriendDemandeur.set("friendslot3", "");
		    			 System.out.println("Slot 3 de " + playerdemandeur + " : Définit !.");
		    		  }
	    		  if(playerdemandeurfriendslot4 == null) {
		    			 System.out.println("Slot 4 de " + playerdemandeur + " : Pas définit, mise en place.");
		    			 SaveFriendDemandeur.set("friendslot4", "");
		    			 System.out.println("Slot 4 de " + playerdemandeur + " : Définit !.");
		    		  }
	    		  if(playerdemandeurfriendslot5 == null) {
		    			 System.out.println("Slot 5 de " + playerdemandeur + " : Pas définit, mise en place.");
		    			 SaveFriendDemandeur.set("friendslot5", "");
		    			 System.out.println("Slot 5 de " + playerdemandeur + " : Définit !.");
		    		  }
	    		  if(playerdemandeurinvitewating == null) {
		    			 System.out.println("Le joueur " + playerdemandeur + " n'a pas d'invitation en attente, mise en place.");
		    			 SaveFriendDemandeur.set("invitewaiting", "");
		    		  }
	    		  //
	    		  // On initialise les Amis du receveur
	    		  //
	    		  if(playerecoisfriendslot1 == null) {
		    			 System.out.println("Slot 1 de " + playerecois + " : Pas définit, mise en place.");
		    			 SaveFriendReceveur.set("friendslot1", "");
		    			 System.out.println("Slot 1 de " + playerecois + " : Définit !.");
		    		  }
		    		  if(playerecoisfriendslot2 == null) {
			    			 System.out.println("Slot 2 de " + playerecois + " : Pas définit, mise en place.");
			    			 SaveFriendReceveur.set("friendslot2", "");
			    			 System.out.println("Slot 2 de " + playerecois + " : Définit !.");
			    		  }
		    		  if(playerecoisfriendslot3 == null) {
			    			 System.out.println("Slot 3 de " + playerecois + " : Pas définit, mise en place.");
			    			 SaveFriendReceveur.set("friendslot3", "");
			    			 System.out.println("Slot 3 de " + playerecois + " : Définit !.");
			    		  }
		    		  if(playerecoisfriendslot4 == null) {
			    			 System.out.println("Slot 4 de " + playerecois + " : Pas définit, mise en place.");
			    			 SaveFriendReceveur.set("friendslot4", "");
			    			 System.out.println("Slot 4 de " + playerecois + " : Définit !.");
			    		  }
		    		  if(playerecoisfriendslot5 == null) {
			    			 System.out.println("Slot 5 de " + playerecois + " : Pas définit, mise en place.");
			    			 SaveFriendReceveur.set("friendslot5", "");
			    			 System.out.println("Slot 5 de " + playerecois + " : Définit !.");
			    		  }
		    		  if(playerecoisinvitewaiting == null) {
			    			 System.out.println("Le joueur " + playerecois + " n'a pas d'invitation en attente, mise en place.");
			    			 SaveFriendReceveur.set("invitewaiting", playerdemandeur.getName());
			    		  }
	    		  
	    		  
	    		  
	    		  //SaveFriend.set("Test", "cc");
	    		  //SaveFriend.set("Test", "coc");
	    		  if (playerecoisonline == "false")
	    			  
	    		  {
	    		      ProxiedPlayer senderP = (ProxiedPlayer) sender;
	    			  senderP.sendMessage("Le joueur " + playerecois + " n'est pas en ligne actuellement !");
	    			  return;
	    		  } else {
	    			  System.out.println("Le joueur (" + playerecois + ") est en ligne !");
	    		  }
	    		  
	    		  if(sender instanceof ProxiedPlayer) {
	    			  
	    			  ProxiedPlayer senderP = (ProxiedPlayer) sender;
	    			  ProxiedPlayer requestedP = ProxyServer.getInstance().getPlayer(strings[0]);
	    		  
	    			  requestedP.sendMessage("[Ellioz Friends] §e" + senderP.getName() + "§r vous invite à être son ami. Vous avez 60 secondes pour l'accepter ou le refuser");
	    		  
	    		  
	    			  TextComponent accept = new TextComponent( "Accepter (/friendaccept)" );
	    			  accept.setColor( net.md_5.bungee.api.ChatColor.GREEN );
	    			  accept.setBold( true );
	    			  accept.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/friendaccept"));
	    		  
	    		  
	    		  
	    			  TextComponent deny = new TextComponent( "Refuser (/friendeny)" );
	    			  deny.setColor( net.md_5.bungee.api.ChatColor.GREEN );
	    			  deny.setBold( true );
	    			  deny.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/friendeny"));
	    		  
	    			  requestedP.sendMessage(accept);
	    			  requestedP.sendMessage(deny);
	    		 
	    		  }
	    		  
	    	  }
	  }

}