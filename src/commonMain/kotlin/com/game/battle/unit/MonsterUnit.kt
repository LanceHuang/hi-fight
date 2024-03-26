package com.game.battle.unit

/**
 * 怪物单元
 */
class MonsterUnit(
    /** 怪物信息 */
    val monsterInfo: MonsterInfo
) : BattleUnit(monsterInfo) {

    override fun getName(): String {
        return monsterInfo.monsterName
    }
}