package com.game.attr

import com.game.common.Module

/**
 * 属性容器
 */
open class AttributeBox<T> {

    /** 归属 */
    var owner: T? = null

    /** 模块汇总 */
    var moduleMap: MutableMap<Module, Map<AttributeType, Long>> = mutableMapOf()

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
    fun updateAndCompute(module: Module, attrMap: Map<AttributeType, Long>) {
        this.moduleMap[module] = attrMap

        compute()
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
    fun removeAndCompute(module: Module) {
        this.moduleMap.remove(module)

        compute()
    }

    /**
     * 计算属性
     */
    fun compute() {
        val collectResult = collect()
        this.baseMap = collectResult
        this.finalMap = collectResult
    }

    /**
     * 收集属性
     */
    fun collect(): Map<AttributeType, Long> {
        val result: Map<AttributeType, Long> = mutableMapOf()
        this.moduleMap.forEach { entry ->
            entry.value.forEach { innerEntry ->
                // todo 如果不存在的话，需要添加
                result[innerEntry.key]?.plus(innerEntry.value)
            }
        }
        return result
    }
}