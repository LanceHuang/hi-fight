package com.game.common

/**
 * 模块类型
 */
enum class ModuleType(
    /** 描述 */
    val desc: String,
    /** 是否PVP模块 */
    val pvp: Boolean = false,
) {

    //============================ PVP ========================
    BASE("养成"),

    //============================ PVP ========================
    BUFF("战斗效果", true),
}