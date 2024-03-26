package com.game.battle

import com.game.battle.ext.BattleArgsExt
import com.game.battle.unit.BattleCampInfo
import com.game.battle.handler.BattleType
import com.game.battle.strategy.BattleActionStrategyType
import com.game.battle.strategy.BattleEndingStrategyType
import com.game.battle.strategy.BattleSettleStrategyType
import com.game.battle.unit.BattleInfo
import kotlin.random.Random

/**
 * 战斗参数
 */
open class BattleArgs(
    /** 战斗类型 */
    val type: Int,
    /** 战场id */
    val mapId: Int,
) {
    /** 随机种子 */
    val seed: Int = Random.nextInt(1, 100)

    /** 创建时间 */
    val createTime: Long = BattleConfigs.getTime()

    /** 战斗阵营 */
    val campMap: MutableMap<Int, BattleCampInfo> = mutableMapOf()

    /** 拓展参数 */
    val extMap: MutableMap<BattleArgsExt, Any> = mutableMapOf()

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
    fun addBattleInfo(campId: Int, posId: Int, battleInfo: BattleInfo) {
        if (this.campMap[campId] == null) {
            this.campMap[campId] = BattleCampInfo()
        }
        this.campMap[campId]?.addBattleInfo(posId, battleInfo)
    }

    /**
     * 添加战斗信息
     */
    fun addBattleInfo(campId: Int, infoMap: Map<Int, BattleInfo>) {
        for (entry in infoMap) {
            addBattleInfo(campId, entry.key, entry.value)
        }
    }

    /**
     * 添加拓展参数
     */
    fun addExt(ext: BattleArgsExt, value: Any) {
        this.extMap[ext] = value
    }
}
