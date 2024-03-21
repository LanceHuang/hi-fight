package com.game.handler

import com.game.args.BattleArgs
import com.game.env.BattleEnv

/**
 * 战斗处理器
 */
interface BattleHandler<T : BattleEnv> {

    /** 创建战斗环境 */
    fun createBattle(args: BattleArgs): T

    /** 初始化战斗环境 */
    fun initBattle(env: T)

    /** 开始战斗 */
    fun startBattle(env: T)

    /** 结算战斗 */
    fun settleBattle(env: T)
}