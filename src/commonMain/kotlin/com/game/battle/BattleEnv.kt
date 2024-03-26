package com.game.battle

import com.game.battle.plugin.*
import com.game.battle.report.BattleReport

/**
 * 战斗环境
 */
open class BattleEnv(
    /** 战斗参数 */
    val battleArgs: BattleArgs,
) {

    //====================================== 插件 ======================================
    /** 战斗记录 */
    var battleRecorder: BattleRecorder? = null

    /** 战斗日志 */
    var battleLogger: BattleLogger? = null

    /** 战斗统计 */
    var battleStat: BattleStat? = null

    //====================================== 基础信息 ======================================
    /** 战斗id */
    val id: Long = BattleConfigs.nextId()

    /** 战斗结果 */
    var result: Int = BattleResult.TIE.value

    /** 创建时间 */
    val createTime: Long = BattleConfigs.getTime()

    /** 结算时间 */
    var settleTime: Long = 0L

    //====================================== 战斗信息 ======================================
    /** 战斗阵营 */
    val campMap: MutableMap<Int, BattleCamp> = mutableMapOf()

    /**
     * 初始化
     */
    open fun init() {
        initBattlePlugins()
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
            this.battleLogger = ConsoleBattleLogger(this)
        } else {
            this.battleLogger = EmptyBattleLogger()
        }

        // 战斗统计
        this.battleStat = DefaultBattleStat()
    }

    /**
     * 初始化阵营
     */
    private fun initBattleCamp() {
        for (entry in this.battleArgs.campMap) {
            // 初始化
            val battleCamp = BattleCamp(entry.key)
            for (innerEntry in entry.value.baseMap) {
                val battleUnit = innerEntry.value.createBattleUnit()
                battleUnit.initUnit()
                battleCamp.addStaticUnit(innerEntry.key, battleUnit)
            }

            // 拓展参数
            for (innerEntry in entry.value.extMap) {
                innerEntry.key.handler.handleExt(battleCamp, innerEntry.value)
            }
            this.campMap[entry.key] = battleCamp
        }
    }

    /**
     * 初始化拓展参数
     */
    private fun initBattleExt() {
        this.battleArgs.extMap.forEach {
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