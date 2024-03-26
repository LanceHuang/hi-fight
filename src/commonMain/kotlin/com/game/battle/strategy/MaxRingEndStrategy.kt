package com.game.battle.strategy

import com.game.base.BattleEnv
import com.game.battle.handler.DefaultTurnBasedBattleEnv

class MaxRingEndStrategy : BattleEndStrategy() {

    override fun needContinue(env: BattleEnv): Boolean {
        if (!super.needContinue(env)) {
            return false
        }

        // 判断回合数
        val turnEnv: com.game.battle.handler.DefaultTurnBasedBattleEnv = env as com.game.battle.handler.DefaultTurnBasedBattleEnv
        return turnEnv.ring >= turnEnv.maxRing
    }
}