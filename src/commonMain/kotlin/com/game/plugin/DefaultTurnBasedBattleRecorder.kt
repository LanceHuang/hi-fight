package com.game.plugin

import com.game.report.TurnBasedBattleReport

/**
 * 默认战斗记录
 */
class DefaultTurnBasedBattleRecorder : BattleRecorder {

    /** 战报 */
    val battleRecorder = TurnBasedBattleReport()
}