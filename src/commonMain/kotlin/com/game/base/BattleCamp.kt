package com.game.base

import com.game.base.unit.BattleUnit

/**
 * 阵营
 */
class BattleCamp {

    /** 静态战斗单元 */
    val staticMap: MutableMap<Int, BattleUnit> = mutableMapOf()

    /** 动态战斗单元 */
    val dynamicMap: MutableMap<Int, BattleUnit> = mutableMapOf()

//    /** 静态战斗单元站位 */
//    var staticIndex: Int = 1

    /** 动态战斗单元站位 */
    var dynamicIndex: Int = 100

    /**
     * 添加静态单元
     */
    fun addStaticUnit(staticIndex: Int, unit: BattleUnit) {
        staticMap[staticIndex] = unit
    }

    /**
     * 添加动态单元
     */
    fun addDynamicUnit(unit: BattleUnit) {
        dynamicMap[dynamicIndex] = unit
        dynamicIndex++
    }

    /**
     * 判断是否全部阵亡
     */
    fun isAllDead(): Boolean {
        staticMap.values.forEach {
            if (!it.isDead()) return false
        }
        return true
    }
}