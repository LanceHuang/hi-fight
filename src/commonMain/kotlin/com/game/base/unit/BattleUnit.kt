package com.game.base.unit

import com.game.attr.AttributeType
import com.game.attr.BattleAttributeBox
import com.game.buff.BattleBuffBox
import com.game.skill.BattleSkillBox

/**
 * 战斗单元
 */
abstract class BattleUnit(
    /** 战斗信息 */
    val battleInfo: BattleInfo
) {

    //====================== 基础信息 =======================

    /** 单元id */
    var id: Long = 0L

    //====================== 战斗信息 =======================

    /** 属性容器 */
    val attributeBox = BattleAttributeBox()

    /** 技能容器 */
    val skillBox = BattleSkillBox()

    /** 效果容器 */
    val buffBox = BattleBuffBox()

    //====================== 状态信息 =======================

    /** 生命值 */
    var hp: Long = 0L

    /**
     * 获取最大血量
     */
    fun getMaxHp(): Long {
        return attributeBox.getFinalAttr(AttributeType.MAX_HP)
    }

    /**
     * 判断是否死亡
     */
    fun isDead(): Boolean {
        // todo 有时，血量清零还可以复活
        return hp <= 0L
    }

    /**
     * 获取名称
     */
    abstract fun getName(): String
}