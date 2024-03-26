package com.game

import com.game.base.BattleArgs
import com.game.base.BattleEnv
import com.game.report.BattleReport

/**
 * 战斗引擎
 */
class BattleEngine {

    companion object Instance {

        /**
         * 战斗
         */
        fun fight(battleArgs: BattleArgs): BattleEnv {
            val battleHandler = battleArgs.battleType.handler
            val battleEnv = battleHandler.createBattle(battleArgs)
            battleHandler.initBattle(battleEnv)
            battleHandler.startBattle(battleEnv)
            return battleEnv
        }
    }
}