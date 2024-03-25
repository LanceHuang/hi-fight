package com.game.strategy

import com.game.base.BattleEnv
import com.game.handler.DefaultTurnBasedBattleEnv

class MaxRingEndStrategy : BattleEndStrategy() {

    override fun needContinue(env: BattleEnv): Boolean {
        if (!super.needContinue(env)) {
            return false
        }

        // 判断回合数
        val turnEnv: DefaultTurnBasedBattleEnv = env as DefaultTurnBasedBattleEnv
        return turnEnv.ring >= turnEnv.maxRing
    }
}