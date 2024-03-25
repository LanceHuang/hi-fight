package com.game.base.unit

import com.game.base.ext.BattleArgsExt

/**
 * 战斗信息（面向业务）
 */
abstract class BattleInfo {

    /** 拓展参数 */
    val ext: MutableMap<BattleArgsExt, Any> = mutableMapOf()

    /**
     * 创建战斗单元
     */
    fun createBattleUnit(): BattleUnit {
        val battleUnit = createUnit()
        initUnit(battleUnit)
        return battleUnit
    }

    /**
     * 创建战斗单元
     */
    abstract fun createUnit(): BattleUnit

    /**
     * 初始化战斗单元
     */
    fun initUnit(battleUnit: BattleUnit) {
        // 拓展参数
        this.ext.forEach {
            it.key.handler.handleExt(battleUnit, it.value)
        }
    }
}