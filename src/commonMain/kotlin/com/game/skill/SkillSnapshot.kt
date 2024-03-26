package com.game.skill

/**
 * 技能快照
 */
class SkillSnapshot {

    /** 技能id - 技能等级 */
    var skillMap: Map<Int, Double> = mutableMapOf()

    companion object Instance {

        fun create(skillBox: SkillBox<Any>): SkillSnapshot {
            TODO()
        }
    }
}