class OutpostWorker (val name: String) {
    var maxEnerge: Int = 100
        private set

    var energy: Int = maxEnerge
        set(value){
            field = value.coerceIn(0,maxEnerge)
        }

    var mood: Int = 50
        get() = field + (energy / 10)

    var level: Int = 1
        private set

    fun work(){
        println("$name выполняет работу...")
        energy -= 15
        if(energy < 20) println("$name устал")
    }

    fun rest() {
        println("$name отдыхает")
        energy += 20
    }

    fun levelUp() {
        level++
        maxEnerge += 20
        energy = maxEnerge
        println("$name повышает уровень $level")
        println("$name повышает уровень $maxEnerge")
    }
}

fun main(){
    val worker = OutpostWorker("Алексей")
    println("Энергия ${worker.energy}")
    println("Настроения ${worker.mood}")
    worker.work()
    worker.work()
    worker.work()
    println("Энергия ${worker.energy}")
    println("Настроения ${worker.mood}")
    worker.rest()
    worker.energy = 150
    worker.levelUp()
}