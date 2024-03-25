package com.game.base

import com.game.report.BattleRecorder
import com.game.report.BattleReport

/**
 * 战斗环境
 */
open class BattleEnv(
    /** 战斗参数 */
    var battleArgs: BattleArgs,
) {

    /** 战斗记录 */
    var battleRecorder: BattleRecorder? = null

    /** 战斗id */
    var id: Long = 0

    /** 战斗阵营 */
    val campMap: MutableMap<Int, BattleCamp> = mutableMapOf()

    /**
     * 初始化
     */
    fun init() {
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
        return battleRecorder?.createReport()
    }
}