package com.game.attr.calc

import com.game.attr.AttributeType
import com.game.base.BattleConfigs
import kotlin.math.roundToLong

/**
 * 加成属性计算
 */
class IncreaseAttributeCalc(
    private val baseType: AttributeType,
    private val incType: AttributeType? = null,
    private val fixType: AttributeType? = null,
) : AttributeCalc {

    override fun calculate(collectMap: Map<AttributeType, Long>, computeMap: Map<AttributeType, Long>): Long {
        val baseValue = collectMap[baseType] ?: 0
        val incValue = collectMap[incType] ?: 0
        val fixValue = collectMap[fixType] ?: 0
        // todo 前后端四舍五入精度不同，需要搞个ceilToFix3
        return (baseValue * (1 + incValue / BattleConfigs.ATTR_INC_BASE) + fixValue).roundToLong()
    }
}