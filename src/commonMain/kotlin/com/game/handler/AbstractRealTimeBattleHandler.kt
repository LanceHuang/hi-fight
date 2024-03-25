package com.game.handler

import com.game.base.BattleArgs
import com.game.base.BattleEnv

/**
 * 即时制战斗
 */
abstract class AbstractRealTimeBattleHandler : BattleHandler {

    override fun createBattle(args: BattleArgs): BattleEnv {
        TODO("Not yet implemented")
    }

    override fun initBattle(env: BattleEnv) {
        TODO("Not yet implemented")
    }

    override fun startBattle(env: BattleEnv) {
        while (needContinueFrame(env)) {
            execFrame(env)
        }
        settleBattle(env)
    }

    /**
     * 执行一帧
     */
    private fun execFrame(env: BattleEnv) {
        TODO("Not yet implemented")
    }

    override fun settleBattle(env: BattleEnv) {
        TODO("Not yet implemented")
    }

    /**
     * 继续帧
     */
    fun needContinueFrame(env: BattleEnv): Boolean {
        return false
    }
}