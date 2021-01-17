package org.hurricanegames.autokeyboardlayout;

import java.util.Map;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoKeyboardLayoutPlugin extends JavaPlugin implements Listener {

	//TODO: multiple layouts
	private final KeyboardLayout layout = RuQWERTYKeyboardLayout.INSTANCE;

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
	private void onCommandPreprocess(PlayerCommandPreprocessEvent event) {
		String command = event.getMessage().substring(1);
		if (command.isEmpty()) {
			return;
		}
		Map<String, Command> knownCommands = getServer().getCommandMap().getKnownCommands();
		String commandName = command.split(" ")[0];
		if (!knownCommands.containsKey(commandName) && knownCommands.containsKey(layout.invert(commandName))) {
			event.setMessage("/" + layout.invert(command));
		}
	}


	@EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
	public void onAsyncChat(AsyncPlayerChatEvent event) {
		String message = event.getMessage();
		if (message.isEmpty()) {
			return;
		}
		if (layout.isSlash(message.codePointAt(0))) {
			String command = message.substring(1);
			if (getServer().getCommandMap().getKnownCommands().containsKey(layout.invert(command.split(" ")[0]))) {
				event.setCancelled(true);
				Player player = event.getPlayer();
				getServer().getScheduler().scheduleSyncDelayedTask(this, () -> {
					if (player.isOnline()) {
						player.chat("/" + layout.invert(command));
					}
				});
			}
		}
	}

}
