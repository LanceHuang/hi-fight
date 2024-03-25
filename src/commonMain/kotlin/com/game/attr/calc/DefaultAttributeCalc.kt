package com.game.attr.calc

import com.game.attr.AttributeType

class DefaultAttributeCalc(
    private val attributeType: AttributeType,
) : AttributeCalc {

    override fun calculate(collectMap: Map<AttributeType, Long>, computeMap: Map<AttributeType, Long>): Long {
        return collectMap[attributeType] ?: 0
    }
}