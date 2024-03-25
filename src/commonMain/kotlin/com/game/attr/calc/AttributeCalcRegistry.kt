package com.game.attr.calc

import com.game.attr.AttributeType

/**
 * 属性注册表
 */
object AttributeCalcRegistry {

    val attributeCalc: MutableMap<AttributeType, AttributeCalc> = mutableMapOf()

    init {
        // 特殊配置
        attributeCalc[AttributeType.ATK] = IncreaseAttributeCalc(
            baseType = AttributeType.ATK, incType = AttributeType.ATK_INCREASE, fixType = AttributeType.ATK_FIX
        )
        attributeCalc[AttributeType.DEF] = IncreaseAttributeCalc(
            baseType = AttributeType.DEF, incType = AttributeType.DEF_INCREASE, fixType = AttributeType.DEF_FIX
        )
        attributeCalc[AttributeType.MAX_HP] = IncreaseAttributeCalc(
            baseType = AttributeType.ATK, incType = AttributeType.ATK_INCREASE, fixType = AttributeType.ATK_FIX
        )

        // 默认配置
        AttributeType.entries.forEach {
            if (attributeCalc[it] == null) attributeCalc[it] = DefaultAttributeCalc(it)
        }

        // todo 依赖树
    }
}