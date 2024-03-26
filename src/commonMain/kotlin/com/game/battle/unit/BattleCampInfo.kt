package com.game.battle.unit

import com.game.base.ext.BattleArgsExt

/**
 * 阵营信息
 */
class BattleCampInfo(
    /** 阵营id */
    val campId: Int
) {
    /** 战斗信息 */
    val baseMap: MutableMap<Int, com.game.battle.unit.BattleInfo> = mutableMapOf()

    /** 拓展参数 */
    val ext: MutableMap<BattleArgsExt, Any> = mutableMapOf()

    /**
     * 添加战斗信息
     */
    fun addFight(posId: Int, battleInfo: com.game.battle.unit.BattleInfo) {
        this.baseMap[posId] = battleInfo
    }
}