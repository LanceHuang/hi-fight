package com.game.args

import com.game.camp.BattleCamp
import kotlin.random.Random

/**
 * 战斗参数
 */
class BattleArgs {

    /** 战斗类型 */
    var type: Int = 0

    /** 战斗阵营 */
    var campMap: Map<Int, BattleCamp> = mapOf()

    /** 拓展参数 */
    val ext: Map<String, Any> = mapOf()

    /** 随机种子 */
    var seed: Int = Random.nextInt(1, 100)

    /** 记录战报 */
    var report: Boolean = true

    /** 创建时间 */
    var createTime: Long = 0L
}