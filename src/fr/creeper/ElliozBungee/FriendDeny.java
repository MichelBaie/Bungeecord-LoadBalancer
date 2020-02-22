package fr.creeper.ElliozBungee;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class FriendDeny extends Command {
	ElliozBungee p;
	public FriendDeny() {
		super("friendeny");
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	@Override
	public void execute(CommandSender sender, String[] arg1) {
		
			if(sender instanceof ProxiedPlayer) {
				ProxiedPlayer requestedP = (ProxiedPlayer) sender;
			if(p.friends.get(requestedP) != null) {
				ProxiedPlayer senderP = p.friends.get(requestedP);
				senderP.sendMessage("[Ellioz Friends] " + requestedP.getName() + " à refusé(e) votre demande d'amitié.");
				requestedP.sendMessage("[Ellioz Friends] La demande de " + senderP.getName() + " à bien été refusée.");
				p.friends.remove(requestedP);
				
			}
			}
		


	}

}
