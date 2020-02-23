package fr.creeper.ElliozBungee;

import java.io.File;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class FriendAccept extends Command {
	ElliozBungee p;
	 String playerecoisfriendslot1 = SaveFriendReceveur.get("friendslot1");
	 String playerecoisfriendslot2 = SaveFriendReceveur.get("friendslot2");
	 String playerecoisfriendslot3 = SaveFriendReceveur.get("friendslot3");
	 String playerecoisfriendslot4 = SaveFriendReceveur.get("friendslot3");
	 String playerecoisfriendslot5 = SaveFriendReceveur.get("friendslot5");
		 String playerdemandeurfriendslot1 = SaveFriendDemandeur.get("friendslot1");
		 String playerdemandeurfriendslot2 = SaveFriendDemandeur.get("friendslot2");
		 String playerdemandeurfriendslot3 = SaveFriendDemandeur.get("friendslot3");
		 String playerdemandeurfriendslot4 = SaveFriendDemandeur.get("friendslot4");
		 String playerdemandeurfriendslot5 = SaveFriendDemandeur.get("friendslot5");
		 String playerdemandeurinvitewating = SaveFriendDemandeur.get("invitewaiting");
	 public static Saver SaveFriendDemandeur;
	 public static Saver SaveFriendReceveur;
	 FriendAccept() {
		super("friendaccept");
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	@Override
	public void execute(CommandSender sender, String[] args) {
		if(args.length <= 1) {
			if(sender instanceof ProxiedPlayer) {
				SaveFriendReceveur = new Saver(new File(sender.getName() + "-friends.properties"));
				ProxiedPlayer requestedP = (ProxiedPlayer) sender;
			if(SaveFriendReceveur.get("invitewaiting") != "") {
				ProxiedPlayer senderP = ProxyServer.getInstance().getPlayer(SaveFriendReceveur.get("invitewaiting"));
				SaveFriendDemandeur = new Saver(new File(senderP.getName() + "-friends.properties"));
				senderP.sendMessage("[Ellioz Friends] " + requestedP.getName() + " à accepté votre requête !");
				senderP.sendMessage("[Ellioz Friends] Toi et " + requestedP.getName() + " êtes maitenant amis.");
				requestedP.sendMessage("[Ellioz Friends] Toi et " + senderP.getName() + " êtes maitenant amis.");
				String slotavaitablereceveur = null;
				if(playerecoisfriendslot1 !="") {
					slotavaitablereceveur = "friendslot1";
					
				}
				else if(playerecoisfriendslot1 ==""){
					return;
				}
				if(playerecoisfriendslot2 !="") {
					slotavaitablereceveur = "friendslot2";
					
				}
				else if(playerecoisfriendslot2 ==""){
					return;
				}
				if(playerecoisfriendslot3 !="") {
					slotavaitablereceveur = "friendslot3";
					
				}
				else if(playerecoisfriendslot3 ==""){
					return;
				}
				if(playerecoisfriendslot4 !="") {
					slotavaitablereceveur = "friendslot4";
					
				}
				else if(playerecoisfriendslot4 ==""){
					return;
				}
				if(playerecoisfriendslot5 !="") {
					slotavaitablereceveur = "friendslot5";
					
				}
				else if(playerecoisfriendslot4 ==""){
					return;
				}
				
				
				
				String slotavaitabledemandeur = null;
				if(playerecoisfriendslot1 !="") {
					slotavaitabledemandeur = "friendslot1";
					
				}
				else if(playerecoisfriendslot1 ==""){
					return;
				}
				if(playerecoisfriendslot2 !="") {
					slotavaitabledemandeur = "friendslot2";
					
				}
				else if(playerecoisfriendslot2 ==""){
					return;
				}
				if(playerecoisfriendslot3 !="") {
					slotavaitabledemandeur = "friendslot3";
					
				}
				else if(playerecoisfriendslot3 ==""){
					return;
				}
				if(playerecoisfriendslot4 !="") {
					slotavaitabledemandeur = "friendslot4";
					
				}
				else if(playerecoisfriendslot4 ==""){
					return;
				}
				if(playerecoisfriendslot5 !="") {
					slotavaitabledemandeur = "friendslot5";
					
				}
				else if(playerecoisfriendslot4 ==""){
					return;
				}
				if(slotavaitablereceveur != null) {
					SaveFriendReceveur.set(slotavaitablereceveur, senderP.getName());
					SaveFriendReceveur.set(slotavaitablereceveur, senderP.getName());
				}
			}
			}
		}

	}

}
