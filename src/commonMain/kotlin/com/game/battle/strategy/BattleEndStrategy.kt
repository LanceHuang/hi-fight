package com.game.battle.strategy

import com.game.battle.BattleEnv

/**
 * 结束策略
 */
abstract class BattleEndStrategy {

    /**
     * 判断是否继续
     */
    open fun needContinue(env: BattleEnv): Boolean {
        env.campMap.values.forEach {
            if (it.isAllDead()) return false
        }
        return true
    }
}