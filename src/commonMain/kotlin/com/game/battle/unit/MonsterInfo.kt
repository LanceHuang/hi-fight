package com.game.battle.unit

/**
 * 怪物信息
 */
class MonsterInfo(
    /** 怪物名 */
    val monsterName: String = ""
) : BattleInfo() {
    override fun createUnit(): BattleUnit {
        return MonsterUnit(this)
    }
}