package com.game.attr.op

import com.game.base.BattleConfigs
import kotlin.math.roundToLong

/**
 * 递增属性算子
 */
class IncreaseAttributeOp : AttributeOp {
    override fun calculate(value1: Long, value2: Long): Long {
        // a + b = (1 + a) * (1 + b) - 1
        val v1 = (BattleConfigs.ATTR_INC_BASE + value1) / BattleConfigs.ATTR_INC_BASE
        val v2 = (BattleConfigs.ATTR_INC_BASE + value2) / BattleConfigs.ATTR_INC_BASE
        return (v1 * v2 * BattleConfigs.ATTR_INC_BASE - BattleConfigs.ATTR_INC_BASE).roundToLong()
    }
}