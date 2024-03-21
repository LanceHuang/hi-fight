package com.game.handler

import com.game.args.BattleArgs
import com.game.env.BattleEnv
import com.game.env.RealTimeBattleEnv

/**
 * 即时制战斗
 */
abstract class AbstractRealTimeBattleHandler : BattleHandler<RealTimeBattleEnv> {

    override fun createBattle(args: BattleArgs): RealTimeBattleEnv {
        TODO("Not yet implemented")
    }

    override fun initBattle(env: RealTimeBattleEnv) {
        TODO("Not yet implemented")
    }

    override fun startBattle(env: RealTimeBattleEnv) {
        while (env.needContinueFrame()) {
            execFrame(env)
        }
        settleBattle(env)
    }

    /**
     * 执行一帧
     */
    private fun execFrame(env: RealTimeBattleEnv) {
        TODO("Not yet implemented")
    }

    override fun settleBattle(env: RealTimeBattleEnv) {
        TODO("Not yet implemented")
    }
}