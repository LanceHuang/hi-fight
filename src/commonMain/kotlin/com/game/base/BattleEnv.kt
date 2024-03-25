package com.game.base

import com.game.report.BattleRecorder
import com.game.report.BattleReport
import com.game.report.DefaultTurnBasedBattleRecorder
import com.game.report.EmptyBattleRecorder

/**
 * 战斗环境
 */
open class BattleEnv(
    /** 战斗参数 */
    var battleArgs: BattleArgs,
) {

    //====================================== 基础信息 ======================================

    /** 战斗记录 */
    var battleRecorder: BattleRecorder = EmptyBattleRecorder()

    //====================================== 战斗信息 ======================================

    /** 战斗阵营 */
    val campMap: MutableMap<Int, BattleCamp> = mutableMapOf()

    /** 战斗结果 */
    var result: Int = BattleResult.TIE.value

    /**
     * 初始化
     */
    fun init() {
        if (battleArgs.report) {
            battleRecorder = DefaultTurnBasedBattleRecorder()
        }
    }

    /**
     * 继续战斗
     */
    fun needContinue(): Boolean {
        return battleArgs.endingStrategy.strategy.needContinue(this)
    }

    /**
     * 创建战报
     */
    fun createReport(): BattleReport? {
        return battleRecorder.createReport()
    }
}