package com.game.battle.plugin

import com.game.battle.BattleEnv

/**
 * 默认战斗日志
 */
class ConsoleBattleLogger(
    /** 战斗环境 */
    private val env: BattleEnv
) : BattleLogger() {

    override fun logPrepare() {
        // 基础信息
        val args = env.battleArgs
        println("玩法【${args.type}】地图【${args.mapId}】种子【${args.seed}】创建时间【${args.createTime}】")

        // 阵营
        env.campMap.forEach {
            println("阵营${it.key}：")
            it.value.staticMap.forEach { innerIt ->
                println("\t${innerIt.key}号位 ${innerIt.value.getName()}")
            }
        }
    }

    override fun logSettle() {
        val costTime = env.settleTime - env.createTime
        println("战斗结果【${env.result}】耗时【${costTime}ms】")
    }
}