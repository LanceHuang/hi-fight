package com.game.battle.plugin

import com.game.battle.report.BattleReport

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