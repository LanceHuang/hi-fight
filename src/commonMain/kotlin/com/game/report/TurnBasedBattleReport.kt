package com.game.report

/**
 * 回合制战报
 */
class TurnBasedBattleReport : BattleReport() {

    /** 易变部分 */
    val mutableData: MutableBattleReport = MutableBattleReport()

    /** 不易变部分 */
    val immutableData: ImmutableBattleReport = ImmutableBattleReport()
}