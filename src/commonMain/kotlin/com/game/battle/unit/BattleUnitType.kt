package com.game.battle.unit

/**
 * 战斗单元类型
 */
enum class BattleUnitType(
    /** 单元id */
    val id: Int,
    /** 属性描述 */
    var desc: String,
) {

    PLAYER(1, "玩家"),
    MONSTER(2, "怪物"),
}