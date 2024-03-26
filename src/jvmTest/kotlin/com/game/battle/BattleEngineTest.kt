package com.game.battle

import com.game.battle.turnbased.TurnBasedBattleArgs
import com.game.battle.unit.PlayerInfo
import kotlin.test.Test

class BattleEngineTest {

    @Test
    fun fight() {
        // 初始化环境
        BattleConfigs.ID_GEN = BattleId()
        BattleConfigs.TIME_GEN = BattleTime()
        BattleConfigs.NEED_LOG = true

        // 添加参战人员
        var playerId: Long = 1
        val attackerMap: MutableMap<Int, PlayerInfo> = mutableMapOf()
        val defenderMap: MutableMap<Int, PlayerInfo> = mutableMapOf()
        for (i in 1..10) {
            attackerMap[i] = PlayerInfo(playerId++, "老六$i")
            defenderMap[i] = PlayerInfo(playerId++, "老王$i")
        }

        // 创建参数
        val battleArgs = TurnBasedBattleArgs(type = 10, mapId = 555)
        battleArgs.addBattleInfo(BattleCampType.ATTACKER.id, attackerMap)
        battleArgs.addBattleInfo(BattleCampType.DEFENDER.id, defenderMap)
//        battleArgs.campMap[BattleCampType.ATTACKER.id]?.baseMap[1]?.addExt(BattleArgsExt.HP_PERCENT, 5000)
//        battleArgs.campMap[BattleCampType.DEFENDER.id]?.baseMap[1]?.addExt(BattleArgsExt.HP_PERCENT, 8000)

        // 计算战斗
        val battleEnv = BattleEngine.performBattle(battleArgs)
        println("战斗结果：${battleEnv.result}")

        // 生成战报
        val battleReport = battleEnv.createReport()
        // todo
    }
}