package com.game.base.ext

/**
 * 拓展参数
 */
enum class BattleArgsExt(
    /** 描述 */
    desc: String,
    /** 处理器 */
    handler: BattleArgsExtHandler,
) {

    HP_PERCENT("开场血量万分比", HpPercentExtHandler())
}