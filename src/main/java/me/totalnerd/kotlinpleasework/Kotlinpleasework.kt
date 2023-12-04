package me.totalnerd.kotlinpleasework

import me.totalnerd.kotlinpleasework.listener.BlockBreakListener
import org.bukkit.plugin.java.JavaPlugin

class Kotlinpleasework : JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(BlockBreakListener(), this)
    }
    override fun onDisable() {
        // Plugin shutdown logic
    }
}
