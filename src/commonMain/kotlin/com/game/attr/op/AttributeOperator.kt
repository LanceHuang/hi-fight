package com.game.attr.op

import com.game.attr.AttributeType

/**
 * 属性算子
 */
interface AttributeOperator {

    /**
     * 计算属性值
     */
    fun calculate(collectMap: Map<AttributeType, Long>, computeMap: Map<AttributeType, Long>): Long
}