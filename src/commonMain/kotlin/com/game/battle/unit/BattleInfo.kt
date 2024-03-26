package com.game.battle.unit

import com.game.attr.AttributeSnapshot
import com.game.battle.ext.BattleArgsExt
import com.game.skill.SkillSnapshot

/**
 * 战斗信息（面向业务）
 */
abstract class BattleInfo {

    /** 拓展参数 */
    val extMap: MutableMap<BattleArgsExt, Any> = mutableMapOf()

    /** 属性快照 */
    var attrSnapshot: AttributeSnapshot? = null

    /** 技能快照 */
    var skillSnapshot: SkillSnapshot? = null

    /**
     * 添加拓展参数
     */
    fun addExt(ext: BattleArgsExt, value: Any) {
        this.extMap[ext] = value
    }

    /**
     * 创建战斗单元
     */
    abstract fun createBattleUnit(): BattleUnit
}