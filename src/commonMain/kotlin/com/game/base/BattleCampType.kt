package com.game.base

/**
 * 阵营类型
 */
enum class BattleCampType(
    /** id */
    val id: Int,
    /** 描述 */
    val desc: String,
) {

    ATTACKER(1, "进攻方"),
    DEFENDER(2, "防守方"),
    NEUTRAL(3, "中立方"),
}