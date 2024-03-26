package com.game.base

import com.game.base.ext.BattleArgsExt
import com.game.base.unit.BattleCampInfo
import com.game.base.unit.BattleInfo
import com.game.handler.BattleType
import com.game.strategy.BattleActionStrategyType
import com.game.strategy.BattleEndingStrategyType
import com.game.strategy.BattleSettleStrategyType
import kotlin.random.Random

/**
 * 战斗参数
 */
open class BattleArgs(
    /** 战斗类型 */
    var type: Int,

    /** 战场id */
    var mapId: Int,
) {
    /** 随机种子 */
    var seed: Int = Random.nextInt(1, 100)

    /** 创建时间 */
    var createTime: Long = BattleConfigs.TIME_GEN?.getTime() ?: 0

    /** 战斗阵营 */
    val campMap: MutableMap<Int, BattleCampInfo> = mutableMapOf()

    /** 拓展参数 */
    val ext: MutableMap<BattleArgsExt, Any> = mutableMapOf()

    /** 战斗类型 */
    var battleType: BattleType = BattleType.TURN_BASED

    /** 行动策略 */
    var actionStrategy: BattleActionStrategyType = BattleActionStrategyType.SPEED_FIRST

    /** 结束策略 */
    var endingStrategy: BattleEndingStrategyType = BattleEndingStrategyType.MAX_RING

    /** 结算策略 */
    var settleStrategy: BattleSettleStrategyType = BattleSettleStrategyType.DEFENDER_FIRST

    /** 记录战报 */
    var report: Boolean = true

    /**
     * 添加战斗信息
     */
    fun addFight(campId: Int, posId: Int, battleInfo: BattleInfo) {
        if (this.campMap[campId] == null) {
            this.campMap[campId] = BattleCampInfo(campId)
        }
        this.campMap[campId]?.addFight(posId, battleInfo)
    }
}