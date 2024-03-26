package com.game.battle

import com.game.battle.turnbased.TurnBasedBattleArgs
import com.game.battle.unit.BattleCampInfo
import com.game.battle.unit.BattleInfo
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
        var playerIdGen: Long = 1
        val battleArgs = TurnBasedBattleArgs(type = 10, mapId = 555)
        battleArgs.addFight(BattleCampType.ATTACKER, 1, PlayerInfo(playerIdGen++, "老六"))
        battleArgs.addFight(BattleCampType.DEFENDER, 1, PlayerInfo(playerIdGen++, "老王"))

        // 计算战斗
        val battleEnv = BattleEngine.performBattle(battleArgs)
        println("战斗结果：${battleEnv.result}")

        // 生成战报
        val battleReport = battleEnv.createReport()
        // todo
    }
}

/**
 * 添加战斗信息（业务相关的接口，通用战斗力可能不止攻守方）
 */
fun BattleArgs.addFight(campType: BattleCampType, posId: Int, battleInfo: BattleInfo) {
    val campInfo = campMap.getOrPut(campType.id) { BattleCampInfo(campType.id) }
    campInfo.addFight(posId, battleInfo)
}
