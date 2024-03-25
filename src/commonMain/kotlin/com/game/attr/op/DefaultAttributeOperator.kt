package com.game.attr.op

import com.game.attr.AttributeType

/**
 * 默认属性算子
 */
class DefaultAttributeOperator(
    private val attributeType: AttributeType,
) : AttributeOperator {

    override fun calculate(collectMap: Map<AttributeType, Long>, computeMap: Map<AttributeType, Long>): Long {
        return collectMap[attributeType] ?: 0
    }
}