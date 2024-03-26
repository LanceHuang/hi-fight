package com.game.battle.handler

import com.game.battle.BattleArgs
import com.game.battle.BattleEnv

/**
 * 战斗处理器
 */
interface BattleHandler {

    /** 创建战斗环境 */
    fun createBattle(args: BattleArgs): BattleEnv

    /** 准备战斗 */
    fun prepareBattle(env: BattleEnv)

    /** 开始战斗 */
    fun startBattle(env: BattleEnv)

    /** 结算战斗 */
    fun settleBattle(env: BattleEnv)
}