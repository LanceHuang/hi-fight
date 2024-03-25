package com.game.base

import com.game.report.BattleRecorder
import com.game.report.BattleReport

/**
 * 战斗环境
 */
class BattleEnv {

    /** 战斗记录 */
    var battleRecorder: BattleRecorder? = null

    /** 战斗参数 */
    var battleArgs: BattleArgs? = null

    /** 战斗id */
    var id: Long = 0

    /**
     * 初始化
     */
    fun init() {
    }

    /**
     * 继续战斗
     */
    fun needContinue(): Boolean {
        return false
    }

    /**
     * 创建战报
     */
    fun createReport(): BattleReport? {
        return battleRecorder?.createReport()
    }
}