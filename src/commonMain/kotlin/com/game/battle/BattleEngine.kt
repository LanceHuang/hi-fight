package com.game.battle

import com.game.battle.base.BattleArgs
import com.game.base.BattleEnv

/**
 * 战斗引擎
 */
class BattleEngine {

    companion object Instance {

        /**
         * 战斗
         */
        fun fight(battleArgs: com.game.battle.base.BattleArgs): BattleEnv {
            val battleHandler = battleArgs.battleType.handler
            val battleEnv = battleHandler.createBattle(battleArgs)
            battleHandler.prepareBattle(battleEnv)
            battleHandler.startBattle(battleEnv)
            return battleEnv
        }
    }
}