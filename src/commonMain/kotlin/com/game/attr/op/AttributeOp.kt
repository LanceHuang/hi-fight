package com.game.attr.op

/**
 * 属性算子
 */
interface AttributeOp {

    /**
     * 属性计算
     */
    fun calculate(value1: Long, value2: Long): Long
}