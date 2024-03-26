package com.game.battle

import com.game.plugin.*
import com.game.report.BattleReport

/**
 * 战斗环境
 */
open class BattleEnv(
    /** 战斗参数 */
    val battleArgs: com.game.battle.base.BattleArgs,
) {

    //====================================== 插件 ======================================
    /** 战斗记录 */
    var battleRecorder: com.game.battle.plugin.BattleRecorder? = null

    /** 战斗日志 */
    var battleLogger: com.game.battle.plugin.BattleLogger? = null

    /** 战斗统计 */
    var battleStat: com.game.battle.plugin.BattleStat? = null

    //====================================== 基础信息 ======================================
    /** 战斗id */
    var id: Long = 0L

    /** 战斗结果 */
    var result: Int = BattleResult.TIE.value

    /** 创建时间 */
    var createTime: Long = 0L

    /** 结算时间 */
    var settleTime: Long = 0L

    //====================================== 战斗信息 ======================================
    /** 战斗阵营 */
    val campMap: MutableMap<Int, com.game.battle.base.BattleCamp> = mutableMapOf()

    /**
     * 初始化
     */
    fun init() {
        initBattlePlugins()
        initBattleBase()
        initBattleCamp()
        initBattleExt()
    }

    /**
     * 初始化插件
     */
    private fun initBattlePlugins() {
        // 战斗记录
        if (this.battleArgs.report) {
            this.battleRecorder = DefaultTurnBasedBattleRecorder()
        } else {
            this.battleRecorder = EmptyBattleRecorder()
        }

        // 战斗日志
        if (BattleConfigs.NEED_LOG) {
            this.battleLogger = com.game.battle.plugin.ConsoleBattleLogger(this)
        } else {
            this.battleLogger = EmptyBattleLogger()
        }

        // 战斗统计
        this.battleStat = DefaultBattleStat()
    }

    /**
     * 初始化基础
     */
    private fun initBattleBase() {
        this.id = BattleConfigs.ID_GEN?.nextId() ?: 0
        this.createTime = BattleConfigs.TIME_GEN?.getTime() ?: 0
    }

    /**
     * 初始化阵营
     */
    private fun initBattleCamp() {
        this.battleArgs.campMap.forEach {
            this.campMap[it.key] = com.game.battle.base.BattleCamp.create(it.value)
        }
    }


    /**
     * 初始化拓展参数
     */
    private fun initBattleExt() {
        this.battleArgs.ext.forEach {
            it.key.handler.handleExt(this, it.value)
        }
    }


    /**
     * 继续战斗
     */
    fun needContinue(): Boolean {
        return battleArgs.endingStrategy.strategy.needContinue(this)
    }

    /**
     * 创建战报
     */
    fun createReport(): BattleReport? {
        return battleRecorder?.createReport()
    }

}