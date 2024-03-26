package com.game.battle

import com.game.battle.unit.BattleUnit

/**
 * 阵营
 */
class BattleCamp(
    /** 阵营id */
    val campId: Int
) {
    /** 静态战斗单元 */
    val staticMap: MutableMap<Int, BattleUnit> = mutableMapOf()

    /** 动态战斗单元 */
    val dynamicMap: MutableMap<Int, BattleUnit> = mutableMapOf()

    /** 动态战斗单元站位 */
    var dynamicIndex: Int = 100

    /**
     * 添加静态单元
     */
    fun addStaticUnit(staticIndex: Int, unit: BattleUnit) {
        staticMap[staticIndex] = unit
        staticMap[staticIndex]?.init(campId, staticIndex)
    }

    /**
     * 添加动态单元
     */
    fun addDynamicUnit(unit: BattleUnit) {
        dynamicMap[dynamicIndex] = unit
        dynamicMap[dynamicIndex]?.init(campId, dynamicIndex)
        dynamicIndex++
    }

    /**
     * 判断是否全部阵亡
     */
    fun isAllDead(): Boolean {
        for (entry in staticMap) {
            if (!entry.value.isDead()) {
                return false
            }
        }
        return true
    }
}