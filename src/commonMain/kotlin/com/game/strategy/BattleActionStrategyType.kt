package com.game.strategy

/**
 * 行动策略
 */
enum class BattleActionStrategyType(
    /** 描述 */
    desc: String,
    /** 策略 */
    strategy: BattleActionStrategy,
) {

    SPEED_FIRST("速度优先", SpeedFirstActionStrategy())
}