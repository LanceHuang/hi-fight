package com.game.attr

import com.game.battle.unit.BattleUnit

/**
 * 战斗属性容器
 */
class BattleAttributeBox : AttributeBox<BattleUnit>() {

    /**
     * 初始化
     */
    fun init(snapshot: AttributeSnapshot?) {
        TODO("Not yet implemented")
    }

    companion object Instance {
        fun create(owner: BattleUnit): BattleAttributeBox {
            val attributeBox = BattleAttributeBox()
            attributeBox.owner = owner
            return attributeBox
        }
    }
}