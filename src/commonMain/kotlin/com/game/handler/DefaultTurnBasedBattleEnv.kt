package com.game.handler

import com.game.base.BattleArgs
import com.game.base.BattleEnv
import com.game.buff.BattleConfigs

/**
 * 回合制战斗环境
 */
class DefaultTurnBasedBattleEnv(
    /** 战斗参数 */
    battleArgs: BattleArgs,
) : BattleEnv(battleArgs) {

    /** 最大回合数 */
    var maxRing: Int = BattleConfigs.DEFAULT_RING

    /** 回合数 */
    var ring: Int = 1

    /** 行动数 */
    var turn: Int = 1
}