package com.game.attr.op

import com.game.attr.AttributeConfigs
import kotlin.math.roundToLong

/**
 * 递减属性算子
 */
class DecreaseAttributeOp : AttributeOp {
    override fun calculate(value1: Long, value2: Long): Long {
        // a + b = 1 - (1 - a) * (1 - b)
        val v1 = (AttributeConfigs.INCREASE_BASE - value1) / AttributeConfigs.INCREASE_BASE
        val v2 = (AttributeConfigs.INCREASE_BASE - value2) / AttributeConfigs.INCREASE_BASE
        return (AttributeConfigs.INCREASE_BASE - v1 * v2 * AttributeConfigs.INCREASE_BASE).roundToLong()
    }
}