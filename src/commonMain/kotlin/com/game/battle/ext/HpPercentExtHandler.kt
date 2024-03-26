package com.game.battle.ext

import com.game.base.unit.BattleUnit
import com.game.base.BattleConfigs
import kotlin.math.roundToLong

class HpPercentExtHandler : BattleArgsExtHandler() {

    override fun handleExt(target: Any, ext: Any) {
        val unit = target as BattleUnit
        val hpPercent = ext as Int
        unit.hp = (unit.getMaxHp() * (hpPercent / BattleConfigs.MAX_HP_PERCENT_DOUBLE)).roundToLong()
    }
}