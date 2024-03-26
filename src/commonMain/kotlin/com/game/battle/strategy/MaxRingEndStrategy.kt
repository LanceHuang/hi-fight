package com.game.battle.strategy

import com.game.battle.BattleEnv
import com.game.battle.turnbased.TurnBasedBattleArgs
import com.game.battle.turnbased.TurnBasedBattleEnv

class MaxRingEndStrategy : BattleEndStrategy() {

    override fun needContinue(env: BattleEnv): Boolean {
        if (!super.needContinue(env)) {
            return false
        }

        // 判断回合数
        return (env as TurnBasedBattleEnv).ring >= (env.battleArgs as TurnBasedBattleArgs).maxRing
    }
}