package com.game.battle

/**
 * 战斗引擎
 */
class BattleEngine {

    companion object Instance {

        /**
         * 执行战斗
         */
        fun performBattle(args: BattleArgs): BattleEnv {
            val handler = args.battleType.handler
            val env = handler.createBattle(args)
            handler.prepareBattle(env)
            handler.startBattle(env)
            return env
        }
    }
}