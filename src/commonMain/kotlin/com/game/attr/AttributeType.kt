package com.game.attr

/**
 * 属性类型
 */
enum class AttributeType(
    /** 属性id */
    val id: Int,
    /** 属性描述*/
    val desc: String,
) {

    ATK(1, "攻击"),
    DEF(10, "防御"),
    MAX_HP(20, "最大血量"),
}