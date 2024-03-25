package com.game.base.unit

import com.game.base.BattleCamp
import com.game.base.ext.BattleArgsExt

/**
 * 阵营信息
 */
class BattleCampInfo {

    /** 战斗信息 */
    val baseMap: MutableMap<Int, BattleInfo> = mutableMapOf()

    // todo 阵营卡片？
    /** 拓展参数 */
    val ext: MutableMap<BattleArgsExt, Any> = mutableMapOf()

    /**
     * 添加战斗信息
     */
    fun addFight(posId: Int, battleInfo: BattleInfo) {
        this.baseMap[posId] = battleInfo
    }

    /**
     * 创建阵营
     */
    fun createCamp(): BattleCamp {
        // 创建
        val battleCamp = BattleCamp()
        this.baseMap.forEach {
            battleCamp.dynamicMap[it.key] = it.value.createBattleUnit()
        }
        // 拓展参数
        this.ext.forEach {
            it.key.handler.handleExt(battleCamp, it.value)
        }
        return battleCamp
    }
}