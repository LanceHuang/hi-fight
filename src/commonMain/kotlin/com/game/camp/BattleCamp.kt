package com.game.camp

import com.game.args.BattleArgsExt
import com.game.unit.BattleUnit

/**
 * 阵营
 */
class BattleCamp {

    /** 阵营信息 */
    val campInfo: BattleCampInfo? = null

    /** 静态战斗单元 */
    val staticMap: Map<Int, BattleUnit> = mapOf()

    /** 动态战斗单元 */
    val dynamicMap: Map<Int, BattleUnit> = mapOf()

    /** 拓展参数 */
    val ext: Map<BattleArgsExt, Any> = mapOf()
}