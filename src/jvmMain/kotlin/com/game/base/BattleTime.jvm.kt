package com.game.base

/**
 * 时间生成
 */
actual class BattleTime {
    /**
     * 获取时间戳
     */
    actual fun getTime(): Long {
        return System.currentTimeMillis()
    }
}