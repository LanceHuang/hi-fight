package com.game.battle

import com.game.battle.unit.PlayerInfo
import kotlin.test.Test

class BattleEngineTest {

    @Test
    fun fight() {
        // 初始化环境
        BattleConfigs.ID_GEN = BattleId()
        BattleConfigs.TIME_GEN = BattleTime()
        BattleConfigs.NEED_LOG = true

        // 创建参数
        val battleArgs = BattleArgs(type = 10, mapId = 555)

        // 添加战斗信息
        var playerIdGen: Long = 1
        battleArgs.addFight(BattleCampType.ATTACKER.id, 1, PlayerInfo(playerIdGen++, "老六"))
        battleArgs.addFight(BattleCampType.DEFENDER.id, 2, PlayerInfo(playerIdGen++, "老王"))

        // 计算战斗
        val battleEnv = BattleEngine.fight(battleArgs)
        println("战斗结果：${battleEnv.result}")

        // 生成战报
        val battleReport = battleEnv.createReport()
        // todo 处理
    }
}