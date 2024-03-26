package com.game.battle.handler

import com.game.battle.realtime.RealTimeBattleHandler
import com.game.battle.turnbased.TurnBasedBattleHandler

/**
 * 战斗类型
 */
enum class BattleType(
    /** 描述 */
    val desc: String,
    /** 处理器 */
    val handler: BattleHandler,
) {

    TURN_BASED("回合制战斗", TurnBasedBattleHandler()),
    REAL_TIME("即时制战斗", RealTimeBattleHandler()),
}