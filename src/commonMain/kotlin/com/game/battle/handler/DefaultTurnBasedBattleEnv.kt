package com.game.battle.handler

import com.game.battle.BattleArgs
import com.game.battle.BattleEnv
import com.game.battle.BattleConfigs

/**
 * 回合制战斗环境
 */
class DefaultTurnBasedBattleEnv(
    /** 战斗参数 */
    battleArgs: BattleArgs,
) : BattleEnv(battleArgs) {

    // todo 初始化
    /** 最大回合数 */
    var maxRing: Int = BattleConfigs.DEFAULT_RING

    /** 回合数 */
    var ring: Int = 1

    /** 行动数 */
    var turn: Int = 1

    /**
     * 增加回合数
     */
    fun increaseRing() {
        this.ring++
    }

    /**
     * 增加行动数
     */
    fun increaseTurn() {
        this.turn++
    }
}