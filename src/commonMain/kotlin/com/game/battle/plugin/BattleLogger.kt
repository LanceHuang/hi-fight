package com.game.battle.plugin

import com.game.battle.BattleEnv

/**
 * 战斗日志
 */
open class BattleLogger {

    /**
     * 记录准备
     */
    open fun logPrepare(env: BattleEnv) {
    }

    /**
     * 记录结算
     */
    open fun logSettle(env: BattleEnv) {
    }
}