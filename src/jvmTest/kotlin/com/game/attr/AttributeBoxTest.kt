package com.game.attr

import com.game.common.Module
import com.game.common.ModuleType
import kotlin.test.Test

class AttributeBoxTest {

    @Test
    fun test() {
        val attributeBox = BattleAttributeBox()
        attributeBox.update(Module(ModuleType.BASE), mutableMapOf(AttributeType.ATK to 10))
        attributeBox.update(Module(ModuleType.BUFF), mutableMapOf(AttributeType.MAX_HP to 100))
        attributeBox.compute()

        // 输出
        attributeBox.finalMap.forEach {
            print("${it.key} = ${it.value} ")
        }
    }
}