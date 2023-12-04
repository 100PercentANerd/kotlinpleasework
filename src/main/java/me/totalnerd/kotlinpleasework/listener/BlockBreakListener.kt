package me.totalnerd.kotlinpleasework.listener

import org.bukkit.Material
import org.bukkit.Registry.MATERIAL
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.Material.*

class BlockBreakListener : Listener {
    @EventHandler
    fun onBlockBreak(e: BlockBreakEvent) {
        e.isCancelled = true
        e.player.health = 0.0
    }

    @EventHandler
    fun onPlayerMove(e: PlayerMoveEvent) {
        e.isCancelled = true
    }
}