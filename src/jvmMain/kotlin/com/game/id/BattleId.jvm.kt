package com.game.id

/**
 * 战斗id
 */
actual class BattleId {
    /**
     * 生成id
     */
    actual fun nextId(): Long {
        // todo
        return System.currentTimeMillis()
    }
}