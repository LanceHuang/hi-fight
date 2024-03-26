package com.game.battle.unit

import com.game.battle.ext.BattleArgsExt

/**
 * 阵营信息
 */
class BattleCampInfo {

    /** 战斗信息 */
    val baseMap: MutableMap<Int, BattleInfo> = mutableMapOf()

    /** 拓展参数 */
    val extMap: MutableMap<BattleArgsExt, Any> = mutableMapOf()

    /**
     * 添加战斗信息
     */
    fun addBattleInfo(posId: Int, battleInfo: BattleInfo) {
        this.baseMap[posId] = battleInfo
    }

    /**
     * 添加拓展参数
     */
    fun addExt(ext: BattleArgsExt, value: Any) {
        this.extMap[ext] = value
    }
}