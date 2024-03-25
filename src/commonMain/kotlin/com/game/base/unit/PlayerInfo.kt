package com.game.base.unit

/**
 * 玩家信息
 */
class PlayerInfo(
    /** 玩家id */
    val playerId: Long
) : BattleInfo() {

    override fun createUnit(): BattleUnit {
        return FightUnit(this)
    }
}