package com.game.battle

/**
 * id生成
 */
actual class BattleId {

    /** 自增id */
    private var idGen: Long = 1

    /**
     * 生成id
     */
    actual fun nextId(): Long {
        return idGen++
    }
}