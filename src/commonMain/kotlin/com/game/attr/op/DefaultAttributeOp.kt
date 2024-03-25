package com.game.attr.op

/**
 * 默认属性算子
 */
class DefaultAttributeOp : AttributeOp {
    override fun calculate(value1: Long, value2: Long): Long {
        return value1 + value2
    }
}