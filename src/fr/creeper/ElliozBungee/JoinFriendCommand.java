package fr.creeper.ElliozBungee;

import java.io.File;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class JoinFriendCommand extends Command {
	ElliozBungee b;
	Saver SaveFriends;
	public JoinFriendCommand() {
		super("friend","");
	}

	 @SuppressWarnings("deprecation")
	@Override
	  public void execute(CommandSender sender, String[] strings) {
		
	      if(strings.length <= 1) {
	    	  if(sender instanceof ProxiedPlayer) {
	    		  
	    		  ProxiedPlayer senderP = (ProxiedPlayer) sender;
                  ProxiedPlayer requestedP = ProxyServer.getInstance().getPlayer(strings[0]);

	    		  
	    		  SaveFriends = new Saver(new File("playerfriends.properties"));
	    		 //SaveFriends.set(sender.getName(), requestedP.getName());
	    		  
	    		  
	    		  
	    		  
	    		 
	    		  requestedP.sendMessage("[Ellioz Friends] §e" + senderP.getName() + "§r vous invite à être son ami. Vous avez 60 secondes pour l'accepter ou le refuser");
	    		  
	    		  
	    		  TextComponent accept = new TextComponent( "Accepter (/friendaccept)" );
	    		  accept.setColor( net.md_5.bungee.api.ChatColor.GREEN );
	    		  accept.setBold( true );
	    		  accept.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "friendaccept"));
	    		  
	    		  
	    		  
	    		  TextComponent deny = new TextComponent( "Refuser (/friendeny)" );
	    		  deny.setColor( net.md_5.bungee.api.ChatColor.GREEN );
	    		  deny.setBold( true );
	    		  deny.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "friendeny"));
	    		  
	    		 requestedP.sendMessage(accept);
	    		 requestedP.sendMessage(deny);
	    		 
	    		 
	    		b.friends.put(requestedP, senderP);
	    		 
	    		 
	    		  }
	    		  
	    	  }
	      }
	  }

