package com.game.camp

import com.game.unit.BattleUnit

/**
 * 阵营
 */
class BattleCamp {

    /** 阵营信息 */
    val campInfo: BattleCampInfo? = null

    /** 静态战斗单元 */
    val staticMap: Map<Long, BattleUnit> = mapOf()

    /** 动态战斗单元 */
    val dynamicMap: Map<Long, BattleUnit> = mapOf()

    /** 拓展参数 */
    val ext: Map<String, Any> = mapOf()
}