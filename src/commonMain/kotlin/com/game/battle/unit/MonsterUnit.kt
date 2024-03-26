package com.game.battle.unit

/**
 * 怪物单元
 */
class MonsterUnit(
    /** 怪物信息 */
    val monsterInfo: MonsterInfo
) : BattleUnit(monsterInfo) {

    override fun getBattleUnitType(): BattleUnitType {
        return BattleUnitType.MONSTER
    }

    override fun getName(): String {
        return monsterInfo.monsterName
    }
}