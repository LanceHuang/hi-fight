package com.game.attr.op

import com.game.attr.AttributeType

/**
 * 属性注册表
 */
object AttributeRegistry {

    val attributeOps: MutableMap<AttributeType, AttributeOperator> = mutableMapOf()

    init {
        // 特殊配置
        attributeOps[AttributeType.ATK] = IncreaseAttributeOperator(
            baseType = AttributeType.ATK, incType = AttributeType.ATK_INCREASE, fixType = AttributeType.ATK_FIX
        )
        attributeOps[AttributeType.DEF] = IncreaseAttributeOperator(
            baseType = AttributeType.DEF, incType = AttributeType.DEF_INCREASE, fixType = AttributeType.DEF_FIX
        )
        attributeOps[AttributeType.MAX_HP] = IncreaseAttributeOperator(
            baseType = AttributeType.ATK, incType = AttributeType.ATK_INCREASE, fixType = AttributeType.ATK_FIX
        )

        // 默认配置
        AttributeType.entries.forEach {
            if (attributeOps[it] == null) attributeOps[it] = DefaultAttributeOperator(it)
        }

        // todo 依赖树
    }
}