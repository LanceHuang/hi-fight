package com.game.battle.strategy

import com.game.battle.BattleEnv
import com.game.battle.handler.DefaultTurnBasedBattleEnv

class MaxRingEndStrategy : BattleEndStrategy() {

    override fun needContinue(env: BattleEnv): Boolean {
        if (!super.needContinue(env)) {
            return false
        }

        // 判断回合数
        val turnEnv: DefaultTurnBasedBattleEnv = env as com.game.battle.handler.DefaultTurnBasedBattleEnv
        return turnEnv.ring >= turnEnv.maxRing
    }
}