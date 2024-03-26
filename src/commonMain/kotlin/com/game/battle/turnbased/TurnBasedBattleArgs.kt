package com.game.battle.turnbased

import com.game.battle.BattleArgs
import com.game.battle.BattleConfigs

/**
 * 回合制战斗参数
 */
class TurnBasedBattleArgs(
    /** 战斗类型 */
    type: Int,
    /** 战场id */
    mapId: Int,
    /** 最大回合数 */
    val maxRing: Int = BattleConfigs.DEFAULT_RING,
) : BattleArgs(type = type, mapId = mapId) {}