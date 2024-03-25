package com.game.base

import com.game.base.ext.BattleArgsExt
import com.game.base.unit.BattleUnit

/**
 * 阵营
 */
class BattleCamp {

    // todo 阵营卡片？
//    /** 阵营信息 */
//    val campInfo: BattleCampInfo? = null

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