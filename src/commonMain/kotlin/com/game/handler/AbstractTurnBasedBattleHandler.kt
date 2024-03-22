package com.game.handler

import com.game.args.BattleArgs
import com.game.env.TurnBasedBattleEnv

/**
 * 回合制战斗
 */
abstract class AbstractTurnBasedBattleHandler : BattleHandler<TurnBasedBattleEnv> {

    override fun createBattle(args: BattleArgs): TurnBasedBattleEnv {
        val env = TurnBasedBattleEnv()
        env.battleArgs = args
        env.init()
        return env
    }

    override fun initBattle(env: TurnBasedBattleEnv) {
        initBattleCamp(env)
        initBattleExt(env)
    }

    /**
     * 初始化阵营
     */
    private fun initBattleCamp(env: TurnBasedBattleEnv) {
        TODO("Not yet implemented")
    }

    /**
     * 初始化拓展参数
     */
    private fun initBattleExt(env: TurnBasedBattleEnv) {
        TODO("Not yet implemented")
    }

    override fun startBattle(env: TurnBasedBattleEnv) {
        executeBattle(env)
        settleBattle(env)
    }

    /**
     * 执行战斗
     */
    protected fun executeBattle(env: TurnBasedBattleEnv) {
        while (env.needContinueRing()) {
            preRing(env)
            execRing(env)
            postRing(env)
        }
    }

    private fun preRing(env: TurnBasedBattleEnv) {
    }

    /**
     * 执行回合
     */
    protected fun execRing(env: TurnBasedBattleEnv) {
        while (env.needContinueTurn()) {
            preTurn(env)
            execTurn(env)
            postTurn(env)
        }
    }

    private fun postRing(env: TurnBasedBattleEnv) {
    }

    private fun preTurn(env: TurnBasedBattleEnv) {
        TODO("Not yet implemented")
    }

    /**
     * 执行行动
     */
    protected fun execTurn(env: TurnBasedBattleEnv) {
        // todo
    }

    private fun postTurn(env: TurnBasedBattleEnv) {
        TODO("Not yet implemented")
    }

    override fun settleBattle(env: TurnBasedBattleEnv) {
        TODO("Not yet implemented")
    }
}