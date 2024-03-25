package com.game.handler

import com.game.base.BattleArgs
import com.game.base.BattleEnv

/**
 * 战斗处理器
 */
interface BattleHandler {

    /** 创建战斗环境 */
    fun createBattle(args: BattleArgs): BattleEnv

    /** 初始化战斗环境 */
    fun initBattle(env: BattleEnv)

    /** 开始战斗 */
    fun startBattle(env: BattleEnv)

    /** 结算战斗 */
    fun settleBattle(env: BattleEnv)
}