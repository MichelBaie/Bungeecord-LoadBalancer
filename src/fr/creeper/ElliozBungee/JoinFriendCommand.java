package fr.creeper.ElliozBungee;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.plugin.Command;

public class JoinFriendCommand extends Command {
	public JoinFriendCommand() {
		super("friend","");
	}

	 @Override
	  public void execute(CommandSender commandSender, String[] strings) {
	      commandSender.sendMessage(new ComponentBuilder("Hello world!" + strings[0]).color(ChatColor.GREEN).create());
	  }
}
