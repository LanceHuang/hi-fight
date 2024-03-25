package com.game

import com.game.base.BattleArgs
import com.game.base.BattleCampType
import com.game.base.unit.PlayerInfo
import kotlin.test.Test

class BattleEngineTest {

    @Test
    fun fight() {
        // 创建参数
        val battleArgs = BattleArgs(
            id = System.currentTimeMillis(),
            type = 10,
            mapId = 555,
            createTime = System.currentTimeMillis(),
        )

        // 添加战斗信息
        var playerIdGen: Long = 1
        battleArgs.addFight(BattleCampType.ATTACKER.id, 1, PlayerInfo(playerIdGen++))
        battleArgs.addFight(BattleCampType.DEFENDER.id, 2, PlayerInfo(playerIdGen++))

        // 计算战斗
        val battleEngine = BattleEngine()
        val battleReport = battleEngine.fight(battleArgs)

        // 输出结果
        print("战斗结果：${battleReport?.result}")
    }
}