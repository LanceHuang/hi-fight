package com.game.battle

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
            battleHandler.prepareBattle(battleEnv)
            battleHandler.startBattle(battleEnv)
            return battleEnv
        }
    }
}