package modules

import resources.ResourceManager

abstract class OutpostModule (
    val name: String,
    var level: Int = 1
) {
    fun upgrape(){
        level++
        println("$name улучшения до уровня $name")
    }
    abstract fun performAction(manager: ResourceManager)
}