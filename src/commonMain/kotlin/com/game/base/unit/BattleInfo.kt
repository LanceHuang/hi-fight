package com.game.base.unit

import com.game.base.ext.BattleArgsExt

/**
 * 战斗信息（面向业务）
 */
abstract class BattleInfo {

    /** 拓展参数 */
    val ext: MutableMap<BattleArgsExt, Any> = mutableMapOf()

    /**
     * 生成战斗单元
     */
    abstract fun createBattleUnit(): BattleUnit
}