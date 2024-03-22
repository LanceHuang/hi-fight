package com.game.unit

import com.game.attr.BattleAttributeBox
import com.game.buff.BattleBuffBox
import com.game.skill.BattleSkillBox

/**
 * 战斗单元
 */
abstract class BattleUnit {

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
}