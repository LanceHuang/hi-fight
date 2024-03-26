package com.game.battle.report

import com.game.battle.BattleConfigs
import com.game.battle.BattleResult

/**
 * 战报
 */
open class BattleReport {

    /** 版本号 */
    var version: String = BattleConfigs.VERSION

    /** 战斗id */
    var id: Long = 0

    /** 战斗类型 */
    var type: Int = 0

    /** 战场id */
    var mapId: Int = 0

    /** 战斗结果 */
    var result: Int = BattleResult.TIE.value

    /** 战斗耗时 */
    var costTime: Long = 0
}