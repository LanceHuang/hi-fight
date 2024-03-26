package com.game.plugin

import com.game.report.BattleReport

/**
 * 战斗记录
 */
interface BattleRecorder {

    /**
     * 创建战报
     */
    fun createReport(): BattleReport? {
        // todo
        return null
    }
}