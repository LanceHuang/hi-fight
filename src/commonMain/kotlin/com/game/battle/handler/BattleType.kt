package com.game.battle.handler

/**
 * 战斗类型
 */
enum class BattleType(
    /** 描述 */
    val desc: String,
    /** 处理器 */
    val handler: com.game.battle.handler.BattleHandler,
) {

    TURN_BASED("回合制战斗", com.game.battle.handler.DefaultTurnBasedBattleHandler()),
    REAL_TIME("即时制战斗", com.game.battle.handler.DefaultRealTimeBattleHandler()),
}