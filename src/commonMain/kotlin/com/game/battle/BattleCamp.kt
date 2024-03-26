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

        // 初始化
        unit.campId = campId
        unit.posId = staticIndex
        unit.id = createUnitId(unit)
    }

    /**
     * 添加动态单元
     */
    fun addDynamicUnit(unit: BattleUnit) {
        dynamicMap[dynamicIndex] = unit
        dynamicIndex++

        // 初始化
        unit.campId = campId
        unit.posId = dynamicIndex
        unit.id = createUnitId(unit)
    }

    /**
     * 生成单元id
     */
    private fun createUnitId(unit: BattleUnit): Long {
        return unit.campId * 10000L + unit.posId
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