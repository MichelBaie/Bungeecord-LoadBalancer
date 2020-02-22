package fr.creeper.ElliozBungee;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class JoinFriendCommand extends Command {
	public JoinFriendCommand() {
		super("friend","");
	}

	@Override
	public void execute(CommandSender arg0, String[] arg1) {
		System.out.println(arg1);
		
	}
}
