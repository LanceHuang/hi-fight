package com.game.base.ext

import com.game.handler.DefaultTurnBasedBattleEnv

class MaxRingExtHandler : BattleArgsExtHandler() {

    override fun handleExt(target: Any, ext: Any) {
        val env = target as DefaultTurnBasedBattleEnv
        val maxRing = ext as Int
        env.maxRing = maxRing
    }
}