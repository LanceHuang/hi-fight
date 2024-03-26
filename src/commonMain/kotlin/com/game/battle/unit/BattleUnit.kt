package com.game.battle.unit

import com.game.attr.AttributeType
import com.game.attr.BattleAttributeBox
import com.game.buff.BattleBuffBox
import com.game.skill.BattleSkillBox

/**
 * 战斗单元
 */
abstract class BattleUnit(
    /** 战斗信息 */
    val battleInfo: com.game.battle.unit.BattleInfo
) {

    //====================== 基础信息 =======================

    /** 阵营id */
    var campId: Int = 0

    /** 站位id */
    var posId: Int = 0

    /** 单元id */
    var id: Long = 0L

    //====================== 战斗信息 =======================

    /** 属性容器 */
    var attrBox: BattleAttributeBox? = null

    /** 技能容器 */
    var skillBox: BattleSkillBox? = null

    /** 效果容器 */
    var buffBox: BattleBuffBox? = null

    //====================== 状态信息 =======================

    /** 生命值 */
    var hp: Long = 0L

    /**
     * 初始化
     */
    fun prepare() {
        TODO("Not yet implemented")
    }

    /**
     * 获取最大血量
     */
    fun getMaxHp(): Long {
        return attrBox?.getFinalAttr(AttributeType.MAX_HP) ?: 0
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