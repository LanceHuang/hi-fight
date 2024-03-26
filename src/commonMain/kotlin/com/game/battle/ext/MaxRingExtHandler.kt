package com.game.battle.ext

import com.game.battle.handler.DefaultTurnBasedBattleEnv

class MaxRingExtHandler : BattleArgsExtHandler() {

    override fun handleExt(target: Any, ext: Any) {
        val env = target as com.game.battle.handler.DefaultTurnBasedBattleEnv
        val maxRing = ext as Int
        env.maxRing = maxRing
    }
}