package com.game.base

/**
 * 战斗结果（仅针对两方的战斗关系。如果有中立方，则需要另外设计）
 */
enum class BattleResult(
    /** 值 */
    val value: Int,
    /** 描述 */
    var desc: String,
) {
    WIN(1, "胜利"),
    FAIL(-1, "失败"),
    TIE(0, "平局"),
}