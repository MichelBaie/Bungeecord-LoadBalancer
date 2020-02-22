package fr.creeper.ElliozBungee;

import java.io.File;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class JoinFriendCommand extends Command {
	
	Saver SaveFriends;
	public JoinFriendCommand() {
		super("friend","");
	}

	 @Override
	  public void execute(CommandSender sender, String[] strings) {
	      if(strings.length <= 1) {
	    	  if(sender instanceof ProxiedPlayer) {
	    		  ProxiedPlayer p = (ProxiedPlayer) sender;
	    		  SaveFriends = new Saver(new File("playerfriends.properties"));
	    		 
	    		  p.sendMessage(new ComponentBuilder("You are already connected to the Hub!").create());
	    		  
	    	  }
	      }
	  }
}
