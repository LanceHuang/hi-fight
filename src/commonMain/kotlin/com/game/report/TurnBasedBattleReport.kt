package com.game.report

/**
 * 回合制战报
 */
class TurnBasedBattleReport : BattleReport() {

    /** 易变部分 */
    var mutableData: MutableBattleReport = MutableBattleReport()

    /** 不易变部分 */
    var immutableData: ImmutableBattleReport = ImmutableBattleReport()
}