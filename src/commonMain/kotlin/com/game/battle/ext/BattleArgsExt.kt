package com.game.battle.ext

/**
 * 拓展参数
 */
enum class BattleArgsExt(
    /** 描述 */
    val desc: String,
    /** 处理器 */
    val handler: BattleArgsExtHandler,
) {

    HP_PERCENT("开场血量万分比", HpPercentExtHandler()),
}