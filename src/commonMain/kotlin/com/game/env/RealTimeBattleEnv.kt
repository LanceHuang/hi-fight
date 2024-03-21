package com.game.env

/**
 * 即时制
 */
class RealTimeBattleEnv : BattleEnv() {

    /**
     * 继续帧
     */
    fun needContinueFrame(): Boolean {
        return false
    }
}