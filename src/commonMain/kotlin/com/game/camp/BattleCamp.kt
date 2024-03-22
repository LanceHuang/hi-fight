package com.game.camp

import com.game.args.BattleArgsExt
import com.game.unit.BattleUnit

/**
 * 阵营
 */
class BattleCamp {

    /** 阵营信息 */
    val campInfo: BattleCampInfo? = null

    /** 静态战斗单元 */
    val staticMap: MutableMap<Int, BattleUnit> = mutableMapOf()

    /** 动态战斗单元 */
    val dynamicMap: MutableMap<Int, BattleUnit> = mutableMapOf()

    /** 拓展参数 */
    val ext: MutableMap<BattleArgsExt, Any> = mutableMapOf()

    /** 静态战斗单元站位 */
    var staticIndex: Int = 1

    /** 动态战斗单元站位 */
    var dynamicIndex: Int = 100

    /**
     * 添加静态单元
     */
    fun addStaticUnit(unit: BattleUnit) {
        staticMap[staticIndex] = unit
        staticIndex++
    }

    /**
     * 添加动态单元
     */
    fun addDynamicUnit(unit: BattleUnit) {
        dynamicMap[dynamicIndex] = unit
        dynamicIndex++
    }
}