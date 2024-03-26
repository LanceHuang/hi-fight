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
    val battleInfo: BattleInfo
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
     * 初始化战斗单元
     */
    fun initUnit() {
        // 容器
        this.attrBox = BattleAttributeBox.create(this)
        this.attrBox?.init(this.battleInfo.attrSnapshot)
        this.skillBox = BattleSkillBox.create(this)
        this.skillBox?.init(this.battleInfo.skillSnapshot)
        this.buffBox = BattleBuffBox.create(this)

        // 拓展参数
        for (entry in this.battleInfo.extMap) {
            entry.key.handler.handleExt(this, entry.value)
        }
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

    /**
     * 获取单元类型
     */
    abstract fun getBattleUnitType(): BattleUnitType
}