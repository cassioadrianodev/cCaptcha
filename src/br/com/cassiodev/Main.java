package br.com.cassiodev;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

/**
 * 
 * @author CassioDev
 * Classe principal do projeto, aonde carrega todas as estruturas do plugin.
 * Criado na data: 05/04/2020 00:14
 */

@SuppressWarnings("all")
public class Main {

	private PluginManager pluginManager = Bukkit.getPluginManager();
	
	public void onEnable() {
		
	}

	public void onDisable() {
		HandlerList.unregisterAll();
		
		for (Player player : Bukkit.getOnlinePlayers()) {
			player.kickPlayer("§cServidor reiniciado/ou fechado.");
		}
	}
	
	public void registerCommands() {
		
	}
	
	public void registerEvents() {
		
	}
}
