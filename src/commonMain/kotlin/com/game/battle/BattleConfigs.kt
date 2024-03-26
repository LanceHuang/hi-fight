package com.game.battle

/**
 * 战斗配置
 */
class BattleConfigs {

    companion object Instance {

        //===================================== 通用 ===============================

        /** 版本号 */
        const val VERSION: String = "1.0.0"

        /** 属性加成基础值 */
        const val ATTR_INC_BASE: Double = 10000.0

        /** 最大血量万分比 */
        const val MAX_HP_PERCENT_INT: Int = 10000

        /** 最大血量万分比 */
        const val MAX_HP_PERCENT_DOUBLE: Double = 10000.0

        /** 是否需要记录日志 */
        var NEED_LOG: Boolean = false

        //===================================== 组件 ===============================
        /** id生成 */
        var ID_GEN: BattleId? = null

        /** 时间获取 */
        var TIME_GEN: BattleTime? = null

        //===================================== 回合制 ===============================
        /** 默认战斗回合数 */
        const val DEFAULT_RING: Int = 15

        //===================================== 即时制 ===============================
        /** 默认战斗时长（毫秒） */
        const val DEFAULT_TIME: Long = 60000

        /** 默认战斗帧长（毫秒） */
        const val DEFAULT_FRAME_TIME: Long = 50

        /** 默认战斗帧数 */
        const val DEFAULT_FRAME_COUNT: Long = DEFAULT_TIME / DEFAULT_FRAME_TIME

        //===================================== 函数 ===============================

        /** 生成id */
        fun nextId(): Long {
            return ID_GEN?.nextId() ?: 0
        }

        /** 获取时间 */
        fun getTime(): Long {
            return TIME_GEN?.getTime() ?: 0
        }
    }
}