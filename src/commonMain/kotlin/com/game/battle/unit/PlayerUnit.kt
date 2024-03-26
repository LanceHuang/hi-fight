package com.game.battle.unit

/**
 * 玩家单元
 */
class PlayerUnit(
    /** 玩家信息 */
    val playerInfo: PlayerInfo
) : BattleUnit(playerInfo) {

    override fun getName(): String {
        return playerInfo.playerName
    }
}