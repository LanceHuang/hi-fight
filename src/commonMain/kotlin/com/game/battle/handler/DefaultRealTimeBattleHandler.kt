package com.game.battle.handler

import com.game.battle.BattleArgs
import com.game.battle.BattleEnv

/**
 * 即时制战斗
 */
open class DefaultRealTimeBattleHandler : BattleHandler {

    override fun createBattle(args: BattleArgs): BattleEnv {
        TODO("Not yet implemented")
    }

    override fun prepareBattle(env: BattleEnv) {
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