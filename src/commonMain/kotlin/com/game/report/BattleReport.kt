package com.game.report

/**
 * 战报
 */
open class BattleReport {

    /** 战斗id */
    var id: Long = 0

    /** 战斗类型 */
    var type: Int = 0

    /** 战斗结果 */
    var result: Int = 0

    /** 战斗耗时 */
    var costTime: Long = 0
}