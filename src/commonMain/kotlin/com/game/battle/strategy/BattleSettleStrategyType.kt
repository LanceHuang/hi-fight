package com.game.battle.strategy

/**
 * 结算策略
 */
enum class BattleSettleStrategyType(
    /** 描述 */
    desc: String,
    /** 策略 */
    strategy: BattleSettleStrategy,
) {

    ATTACKER_FIRST("进攻方优先", AttackerFirstSettleStrategy()),
    DEFENDER_FIRST("防守方优先", DefenderFirstSettleStrategy()),
}