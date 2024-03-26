package com.game.skill

import com.game.battle.unit.BattleUnit

/**
 * 战斗技能容器
 */
class BattleSkillBox : SkillBox<BattleUnit>() {

    /**
     * 初始化
     */
    fun init(snapshot: SkillSnapshot?) {
    }

    companion object Instance {
        fun create(owner: BattleUnit): BattleSkillBox {
            val skillBox = BattleSkillBox()
            skillBox.owner = owner
            return skillBox
        }
    }
}