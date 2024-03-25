package com.game.base.unit

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
}