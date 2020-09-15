package fr.creeper.ElliozBungee;

import java.io.File;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class CreateCommand extends Command {


	

	public CreateCommand(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static Saver SavePlayerWorld;

	public static int Srv;

	@Override
	public void execute(CommandSender sender, String[] args) {

		if (!(sender instanceof ProxiedPlayer)) {
			sender.sendMessage(
					new ComponentBuilder("This command can only be run by a player!").color(ChatColor.RED).create());
			return;
		}

		System.out.println("Commande !");
		// On get le nombre de joueurs
		int Dev01J = ProxyServer.getInstance().getServerInfo("Dev1").getPlayers().size();
		int Dev02J = ProxyServer.getInstance().getServerInfo("Dev2").getPlayers().size();
		int Dev03J = ProxyServer.getInstance().getServerInfo("Dev3").getPlayers().size();

		if (Dev01J <= Dev02J && Dev01J <= Dev03J) {
			Srv = 1;
			CreateCommand.createworld(sender, args);
		} else if (Dev02J <= Dev01J && Dev02J <= Dev02J) {
			Srv = 2;
			CreateCommand.createworld(sender, args);
		} else if (Dev03J <= Dev01J && Dev03J <= Dev02J) {
			Srv = 3;
			CreateCommand.createworld(sender, args);
		}
		// On trie les serveurs
		// ArrayList srvvide = new ArrayList();
		// srvvide.add(Dev01J);
		// srvvide.add(Dev02J);
		// Collections.sort(srvvide, Collections.reverseOrder());
		// ServerInfo target = ProxyServer.getInstance().getServerInfo("Dev2");
		// int nbjoueur = ProxyServer.getInstance().getServerInfo("Dev1").get
		// Players().size();
		// System.out.println(nbjoueur);
		// player.connect(target);
	}

	public static void createworld(CommandSender sender, String[] args) {
		SavePlayerWorld = new Saver(new File("worldplayer.properties"));
		ProxiedPlayer player = (ProxiedPlayer) sender;
		ServerInfo target = ProxyServer.getInstance().getServerInfo(SavePlayerWorld.get(player.getDisplayName()));
		
		File file = new File("worldplayer.properties");

		if (file.exists()) {
			if(target == null) {
				// Le Joueur N'a Pas Encore Eu De Monde
				SavePlayerWorld.set(player.getDisplayName(), "Dev" + Srv);
				target = ProxyServer.getInstance().getServerInfo(SavePlayerWorld.get(player.getDisplayName()));
				player.connect(target);
			} else {
				// Le Joueur A Un Monde
				target = ProxyServer.getInstance().getServerInfo(SavePlayerWorld.get(player.getDisplayName()));
				player.connect(target);
			}
		} else {
			// Le Fichier Vient Juste D'�tre Cr��
			SavePlayerWorld.set(player.getDisplayName(), "Dev" + Srv);
			target = ProxyServer.getInstance().getServerInfo(SavePlayerWorld.get(player.getDisplayName()));
			player.connect(target);

		}

	}
}
