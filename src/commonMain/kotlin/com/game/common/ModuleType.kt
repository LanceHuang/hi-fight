package com.game.common

/**
 * 模块类型
 */
enum class ModuleType(
    /** 描述 */
    val desc: String,
    /** 是否战斗模块 */
    val fight: Boolean = false,
) {

    //============================ 养成 ========================
    CULTIVATION("养成"),

    //============================ 战斗 ========================
    BUFF("战斗效果", true),
}