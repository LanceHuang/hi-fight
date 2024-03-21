package com.game.env

/**
 * 回合制
 */
class TurnBasedBattleEnv : BattleEnv() {

    /**
     * 继续回合
     */
    fun needContinueRing(): Boolean {
        return false
    }

    /**
     * 继续行动
     */
    fun needContinueTurn(): Boolean {
        return false
    }
}