package com.game.attr

import com.game.attr.op.AttributeRegistry
import com.game.common.Module

/**
 * 属性容器
 */
open class AttributeBox<T> {

    /** 归属 */
    var owner: T? = null

    /** 模块汇总 */
    var moduleMap: MutableMap<Module, Map<AttributeType, Long>> = mutableMapOf() // todo 并发安全

    /** 原始属性 */
    var baseMap: Map<AttributeType, Long> = mutableMapOf()

    /** 最终属性 */
    var finalMap: Map<AttributeType, Long> = mutableMapOf()

    /**
     * 更新模块
     */
    fun update(module: Module, attrMap: Map<AttributeType, Long>) {
        this.moduleMap[module] = attrMap
    }

    /**
     * 更新模块
     */
    fun updateAndCalc(module: Module, attrMap: Map<AttributeType, Long>) {
        if (this.moduleMap[module] == null && attrMap.isEmpty()) {
            return
        }

        this.moduleMap[module] = attrMap
        calculate()
    }

    /**
     * 删除模块
     */
    fun remove(module: Module) {
        this.moduleMap.remove(module)
    }

    /**
     * 删除模块
     */
    fun removeAndCalc(module: Module) {
        if (this.moduleMap[module] != null) {
            return
        }

        this.moduleMap.remove(module)
        calculate()
    }

    /**
     * 计算属性
     */
    fun calculate() {
        // 收集属性
        val collectMap = collect()

        // 分层计算
        val computeMap: MutableMap<AttributeType, Long> = mutableMapOf()
        AttributeRegistry.attributeOps.forEach {
            val result = it.value.calculate(collectMap, computeMap)
            computeMap[it.key] = result
        }

        // 更新
        this.baseMap = collectMap
        this.finalMap = computeMap
    }

    /**
     * 收集属性
     */
    fun collect(): Map<AttributeType, Long> {
        val attributeMap: MutableMap<AttributeType, Long> = mutableMapOf()
        this.moduleMap.values.forEach {
            attributeMap += it
        }
        return attributeMap
    }
}