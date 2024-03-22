package com.game.id

/**
 * 战斗id
 */
expect class BattleId {

    /**
     * 生成id
     */
    fun nextId(): Long
}