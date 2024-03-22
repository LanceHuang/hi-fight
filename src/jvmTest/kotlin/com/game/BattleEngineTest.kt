package com.game

import com.game.args.BattleArgs
import kotlin.test.Test

class BattleEngineTest {

    @Test
    fun fight() {
        // 创建参数
        val battleArgs = BattleArgs(
            id = System.currentTimeMillis(),
            type = 10,
            mapId = 555,
            createTime = System.currentTimeMillis()
        )

        // 计算战斗
        val battleEngine = BattleEngine()
        val battleReport = battleEngine.fight(battleArgs)

        // 输出结果
        print("战斗结果：${battleReport?.result}")
    }
}