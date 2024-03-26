package com.game.battle.plugin

import com.game.report.TurnBasedBattleReport

/**
 * 默认战斗记录
 */
class DefaultTurnBasedBattleRecorder : com.game.battle.plugin.BattleRecorder {

    /** 战报 */
    val battleRecorder = TurnBasedBattleReport()
}