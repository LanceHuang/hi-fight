package com.game.attr.calc

import com.game.attr.AttributeType

/**
 * 属性计算
 */
interface AttributeCalc {

    /**
     * 计算属性值
     */
    fun calculate(collectMap: Map<AttributeType, Long>, computeMap: Map<AttributeType, Long>): Long
}