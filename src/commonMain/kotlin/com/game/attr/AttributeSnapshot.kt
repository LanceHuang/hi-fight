package com.game.attr

/**
 * 属性快照
 */
class AttributeSnapshot {

    /** 属性类型-属性值 */
    var baseMap: Map<AttributeType, Long> = mutableMapOf()

    companion object Instance {

        fun create(attributeBox: AttributeBox<Any>): AttributeSnapshot {
            val snapshot = AttributeSnapshot()
            snapshot.baseMap += attributeBox.baseMap
            return snapshot
        }
    }
}