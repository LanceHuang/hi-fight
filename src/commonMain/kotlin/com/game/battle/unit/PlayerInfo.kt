package com.game.battle.unit

/**
 * 玩家信息
 */
class PlayerInfo(
    /** 玩家id */
    val playerId: Long,
    /** 玩家名 */
    val playerName: String = ""
) : com.game.battle.unit.BattleInfo() {

    override fun createUnit(): BattleUnit {
        return PlayerUnit(this)
    }
}