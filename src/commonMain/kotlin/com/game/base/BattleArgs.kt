package com.game.base

import com.game.base.ext.BattleArgsExt
import com.game.handler.BattleType
import com.game.strategy.BattleActionStrategyType
import com.game.strategy.BattleEndingStrategyType
import com.game.strategy.BattleSettleStrategyType
import kotlin.random.Random

/**
 * 战斗参数
 */
open class BattleArgs(
    /** 战斗id */
    var id: Long,

    /** 战斗类型 */
    var type: Int,

    /** 战场id */
    var mapId: Int,

    /** 随机种子 */
    var seed: Int = Random.nextInt(1, 100),

    /** 创建时间 */
    var createTime: Long,

    /** 记录战报 */
    var report: Boolean = true,
) {

    /** 战斗阵营 */
    val campMap: MutableMap<Int, BattleCamp> = mutableMapOf()

    /** 战斗类型 */
    var battleType: BattleType = BattleType.DEFAULT_TURN_BASED

    /** 行动策略 */
    var actionStrategy: BattleActionStrategyType = BattleActionStrategyType.SPEED_FIRST

    /** 结束策略 */
    var endingStrategy: BattleEndingStrategyType = BattleEndingStrategyType.MAX_RING

    /** 结算策略 */
    var settleStrategy: BattleSettleStrategyType = BattleSettleStrategyType.DEFENDER_FIRST

    /** 拓展参数 */
    val ext: MutableMap<BattleArgsExt, Any> = mutableMapOf()
}