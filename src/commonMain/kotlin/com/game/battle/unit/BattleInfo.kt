package com.game.battle.unit

import com.game.attr.AttributeSnapshot
import com.game.attr.BattleAttributeBox
import com.game.battle.ext.BattleArgsExt
import com.game.buff.BattleBuffBox
import com.game.skill.BattleSkillBox
import com.game.skill.SkillSnapshot

/**
 * 战斗信息（面向业务）
 */
abstract class BattleInfo {

    /** 属性快照 */
    var attrSnapshot: AttributeSnapshot? = null

    /** 技能快照 */
    var skillSnapshot: SkillSnapshot? = null

    /** 拓展参数 */
    val ext: MutableMap<BattleArgsExt, Any> = mutableMapOf()

    /**
     * 创建战斗单元
     */
    fun createBattleUnit(): BattleUnit {
        val battleUnit = createUnit()
        initUnit(battleUnit)
        return battleUnit
    }

    /**
     * 创建战斗单元
     */
    abstract fun createUnit(): BattleUnit

    /**
     * 初始化战斗单元
     */
    fun initUnit(battleUnit: BattleUnit) {
        // 容器
        // todo id
        battleUnit.attrBox = BattleAttributeBox.create(battleUnit)
        battleUnit.attrBox?.init(this.attrSnapshot)
        battleUnit.skillBox = BattleSkillBox.create(battleUnit)
        battleUnit.skillBox?.init(this.skillSnapshot)
        battleUnit.buffBox = BattleBuffBox.create(battleUnit)

        // 拓展参数
        this.ext.forEach {
            it.key.handler.handleExt(battleUnit, it.value)
        }
    }
}