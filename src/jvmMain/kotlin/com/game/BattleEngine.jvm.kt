package com.game

import com.game.base.BattleArgs
import com.game.report.BattleReport

actual class BattleEngine {

    /**
     * 计算战斗
     */
    actual fun fight(battleArgs: BattleArgs): BattleReport? {
        val battleHandler = battleArgs.battleType.handler
        val battleEnv = battleHandler.createBattle(battleArgs)
        battleHandler.initBattle(battleEnv)
        battleHandler.startBattle(battleEnv)
        return battleEnv.createReport()
    }
}