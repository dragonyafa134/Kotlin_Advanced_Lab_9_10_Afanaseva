class ResourceManager {
    private  val resources = mutableListOf<OutpostResource>()

    fun add(resource: OutpostResource){
        resources.add(resource)
        println("Добавления ресурс ${resource.name}")
    }

    fun get(name: String) : OutpostResource? {
        return resources.find { it.name == name }
    }

    fun printAll(){
        println("Ресурсы базы")
        resources.forEach { println("${it.name} : ${it.amount}") }
    }
}

fun main(){
    val manager = ResourceManager()
    manager.add(OutpostResource(1,"Minerals", 120))
    val generator = EnergyGenerator()
    val lab = ResearchLab()

    generator.performAction(manager)
    lab.performAction(manager)
    println()
    manager.printAll()
}