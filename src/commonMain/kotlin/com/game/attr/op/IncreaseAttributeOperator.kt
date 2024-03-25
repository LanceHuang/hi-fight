package com.game.attr.op

import com.game.attr.AttributeConfigs
import com.game.attr.AttributeType
import kotlin.math.roundToLong

/**
 * 有加成的属性算子
 */
class IncreaseAttributeOperator(
    private val baseType: AttributeType,
    private val incType: AttributeType? = null,
    private val fixType: AttributeType? = null,
) : AttributeOperator {

    override fun calculate(collectMap: Map<AttributeType, Long>, computeMap: Map<AttributeType, Long>): Long {
        val baseValue = collectMap[baseType] ?: 0
        val incValue = collectMap[incType] ?: 0
        val fixValue = collectMap[fixType] ?: 0
        // todo 前后端四舍五入精度不同，需要搞个ceilToFix3
        return (baseValue * (1 + incValue / AttributeConfigs.INCREASE_BASE) + fixValue).roundToLong()
    }
}