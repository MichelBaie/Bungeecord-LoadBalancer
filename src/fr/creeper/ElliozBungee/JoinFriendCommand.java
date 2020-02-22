package fr.creeper.ElliozBungee;

import java.io.File;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
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
	    		  if(b.getProxy().getPlayer(strings[0]) != null) {
	    		  ProxiedPlayer senderP = (ProxiedPlayer) sender;
	    		  ProxiedPlayer requestedP = b.getProxy().getPlayer(strings[0]);
	    		  SaveFriends = new Saver(new File("playerfriends.properties"));
	    		 //SaveFriends.set(sender.getName(), requestedP.getName());
	    		  requestedP.sendMessage("[Ellioz Friends] §e" + senderP.getName() + "§r vous invite à être son ami. Vous avez 60 secondes pour l'accepter ou le refuser");
	    		  requestedP.sendMessage("§a Accepter");
	    		  requestedP.sendMessage("§c Refuser");
	    		  senderP.sendMessage(new ComponentBuilder("You are already connected to the Hub!").create());
	    		  }
	    		  
	    	  }
	      }
	  }
}
