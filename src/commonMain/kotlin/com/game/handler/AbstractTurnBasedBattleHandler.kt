package com.game.handler

import com.game.base.BattleArgs
import com.game.base.BattleEnv

/**
 * 回合制战斗
 */
abstract class AbstractTurnBasedBattleHandler : BattleHandler {

    override fun createBattle(args: BattleArgs): BattleEnv {
        val env = BattleEnv()
        env.battleArgs = args
        env.init()
        return env
    }

    override fun initBattle(env: BattleEnv) {
        initBattleCamp(env)
        initBattleExt(env)
    }

    /**
     * 初始化阵营
     */
    private fun initBattleCamp(env: BattleEnv) {
        TODO("Not yet implemented")
    }

    /**
     * 初始化拓展参数
     */
    private fun initBattleExt(env: BattleEnv) {
        TODO("Not yet implemented")
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
        TODO("Not yet implemented")
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