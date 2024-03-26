package com.game.battle.unit

/**
 * 玩家信息
 */
class PlayerInfo(
    /** 玩家id */
    val playerId: Long,
    /** 玩家名 */
    val playerName: String = ""
) : BattleInfo() {

    override fun createBattleUnit(): BattleUnit = PlayerUnit(this)
}