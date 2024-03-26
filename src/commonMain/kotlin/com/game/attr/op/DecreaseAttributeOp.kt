package com.game.attr.op

import com.game.battle.BattleConfigs
import kotlin.math.roundToLong

/**
 * 递减属性算子
 */
class DecreaseAttributeOp : AttributeOp {
    override fun calculate(value1: Long, value2: Long): Long {
        // a + b = 1 - (1 - a) * (1 - b)
        val v1 = (BattleConfigs.ATTR_INC_BASE - value1) / BattleConfigs.ATTR_INC_BASE
        val v2 = (BattleConfigs.ATTR_INC_BASE - value2) / BattleConfigs.ATTR_INC_BASE
        return (BattleConfigs.ATTR_INC_BASE - v1 * v2 * BattleConfigs.ATTR_INC_BASE).roundToLong()
    }
}