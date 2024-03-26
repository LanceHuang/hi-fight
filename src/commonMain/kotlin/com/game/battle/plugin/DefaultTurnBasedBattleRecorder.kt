package com.game.battle.plugin

import com.game.battle.report.TurnBasedBattleReport

/**
 * 默认战斗记录
 */
class DefaultTurnBasedBattleRecorder : BattleRecorder {

    /** 战报 */
    val battleRecorder = TurnBasedBattleReport()
}