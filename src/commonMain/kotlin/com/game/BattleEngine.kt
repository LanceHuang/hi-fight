package com.game

import com.game.args.BattleArgs
import com.game.handler.BattleHandler
import com.game.handler.DefaultTurnBasedBattleHandler
import com.game.report.BattleReport

class BattleEngine {

    companion object Instance {

        /**
         * 计算战斗
         */
        fun fight(battleArgs: BattleArgs): BattleReport? {
            val battleHandler = getHandler(battleArgs.type)
            val battleEnv = battleHandler.createBattle(battleArgs)
            battleHandler.initBattle(battleEnv)
            battleHandler.startBattle(battleEnv)
            return battleEnv.createReport()
        }

        /**
         * 获取处理器
         */
        fun getHandler(type: Int): BattleHandler {
            // todo
            return DefaultTurnBasedBattleHandler()
        }
    }
}