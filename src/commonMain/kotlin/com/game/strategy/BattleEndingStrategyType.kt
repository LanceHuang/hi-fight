package com.game.strategy

/**
 * 结束策略
 */
enum class BattleEndingStrategyType(
    /** 描述 */
    desc: String,
    /** 策略 */
    strategy: BattleEndStrategy,
) {

    MAX_RING("回合数限制", MaxRingEndStrategy()),
}