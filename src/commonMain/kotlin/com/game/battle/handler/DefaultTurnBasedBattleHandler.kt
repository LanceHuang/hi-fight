package com.game.battle.handler

import com.game.battle.BattleArgs
import com.game.battle.BattleConfigs
import com.game.battle.BattleEnv

/**
 * 回合制战斗
 */
open class DefaultTurnBasedBattleHandler : BattleHandler {

    override fun createBattle(args: BattleArgs): BattleEnv {
        val env = com.game.battle.handler.DefaultTurnBasedBattleEnv(args)
        env.init()
        return env
    }

    override fun prepareBattle(env: BattleEnv) {
        env.battleLogger?.logPrepare()
    }

    override fun startBattle(env: BattleEnv) {
        executeBattle(env)
        settleBattle(env)
    }

    /**
     * 执行战斗
     */
    protected fun executeBattle(env: BattleEnv) {
        while (needContinueRing(env)) {
            preRing(env)
            execRing(env)
            postRing(env)
        }
    }

    private fun preRing(env: BattleEnv) {
    }

    /**
     * 执行回合
     */
    protected fun execRing(env: BattleEnv) {
        while (needContinueTurn(env)) {
            preTurn(env)
            execTurn(env)
            postTurn(env)
        }
    }

    private fun postRing(env: BattleEnv) {
    }

    private fun preTurn(env: BattleEnv) {
        TODO("Not yet implemented")
    }

    /**
     * 执行行动
     */
    protected fun execTurn(env: BattleEnv) {
        // todo
    }

    private fun postTurn(env: BattleEnv) {
        TODO("Not yet implemented")
    }

    override fun settleBattle(env: BattleEnv) {
        env.settleTime = BattleConfigs.TIME_GEN?.getTime() ?: 0
        env.battleLogger?.logSettle()
    }

    /**
     * 继续回合
     */
    fun needContinueRing(env: BattleEnv): Boolean {
        return false
    }

    /**
     * 继续行动
     */
    fun needContinueTurn(env: BattleEnv): Boolean {
        return false
    }
}