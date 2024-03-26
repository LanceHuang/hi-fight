package com.game.buff

import com.game.battle.unit.BattleUnit

/**
 * 战斗效果容器
 */
class BattleBuffBox : BuffBox<BattleUnit>() {

    companion object Instance {
        fun create(owner: BattleUnit): BattleBuffBox {
            val buffBox = BattleBuffBox()
            buffBox.owner = owner
            return buffBox
        }
    }
}