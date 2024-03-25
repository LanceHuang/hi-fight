package com.game.buff

/**
 * 战斗配置
 */
class BattleConfigs {

    companion object Instance {

        //===================================== 通用 ===============================
        /** 属性加成基础值 */
        const val ATTR_INC_BASE: Double = 10000.0

        /** 最大血量万分比 */
        const val MAX_HP_PERCENT_INT: Int = 10000

        /** 最大血量万分比 */
        const val MAX_HP_PERCENT_DOUBLE: Double = 10000.0

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
    }
}