package com.game.report

/**
 * 默认战斗记录
 */
class DefaultTurnBasedBattleRecorder : BattleRecorder {

    /** 战报 */
    val battleRecorder = TurnBasedBattleReport()
}