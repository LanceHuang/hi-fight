package com.game

import com.game.args.BattleArgs

fun main() {
    // 创建参数
    val battleArgs = BattleArgs()
    // 计算战斗
    val battleReport = BattleEngine.fight(battleArgs)
    // 输出结果
    print(battleReport?.result)
}