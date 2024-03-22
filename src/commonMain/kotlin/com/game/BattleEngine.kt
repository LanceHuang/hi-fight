package com.game

import com.game.args.BattleArgs
import com.game.report.BattleReport

/**
 * 战斗引擎
 */
expect class BattleEngine {

    /**
     * 计算战斗
     */
    fun fight(battleArgs: BattleArgs): BattleReport?
}