package com.game.attr

/**
 * 属性类型
 */
enum class AttributeType(
    /** 属性id */
    val id: Int,
    /** 属性描述*/
    val desc: String,
    /**  关联属性 */
    val ref: Array<AttributeType> = emptyArray(),
) {

    // 1-99：基础属性
    ATK(1, "攻击"),
    ATK_INCREASE(2, "攻击加成", arrayOf(ATK)),
    ATK_FIX(3, "攻击固定值", arrayOf(ATK)),

    DEF(11, "防御"),
    DEF_INCREASE(12, "防御加成", arrayOf(DEF)),
    DEF_FIX(13, "防御固定值", arrayOf(DEF)),

    MAX_HP(21, "最大血量"),
    MAX_HP_INCREASE(22, "最大血量加成", arrayOf(MAX_HP)),
    MAX_HP_FIX(23, "最大血量固定值", arrayOf(MAX_HP)),

    // 100-：特殊属性
}