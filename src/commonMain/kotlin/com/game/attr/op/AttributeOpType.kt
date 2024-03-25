package com.game.attr.op

/**
 * 属性算子类型
 */
enum class AttributeOpType(
    /** 属性描述*/
    val desc: String,
    /** 属性算子 */
    val op: AttributeOp,
) {

    DEFAULT("1+1=2", DefaultAttributeOp()),
    INCREASE("1+1>2", IncreaseAttributeOp()),
    DECREASE("1+1<2", DecreaseAttributeOp()), ;

    fun calculate(value1: Long, value2: Long): Long {
        return op.calculate(value1, value2)
    }
}