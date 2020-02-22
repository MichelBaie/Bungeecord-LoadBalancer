package fr.creeper.ElliozBungee;

import net.md_5.bungee.api.CommandSender;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class FriendAccept extends Command {
	ElliozBungee p;
	public FriendAccept() {
		super("friendaccept");
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	@Override
	public void execute(CommandSender sender, String[] args) {
		if(args.length <= 1) {
			if(sender instanceof ProxiedPlayer) {
				ProxiedPlayer requestedP = (ProxiedPlayer) sender;
			if(p.friends.get(requestedP) != null) {
				ProxiedPlayer senderP = p.friends.get(requestedP);
				senderP.sendMessage("[Ellioz Friends] " + requestedP.getName() + " à accepté votre requête !");
				senderP.sendMessage("[Ellioz Friends] Toi et " + requestedP.getName() + " êtes maitenant amis.");
				requestedP.sendMessage("[Ellioz Friends] Toi et " + senderP.getName() + " êtes maitenant amis.");
			}
			}
		}

	}

}
