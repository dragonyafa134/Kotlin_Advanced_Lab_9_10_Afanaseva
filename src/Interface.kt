interface Movable{
    var speed : Int
    val model : String
    val number : String

    fun move()
    fun stop(){
        println("Остановка")
    }
}
class Car(override val model: String, override val number: String) : Movable{
    override var speed = 60
    override fun move(){
        println("Едем на машине. Со скоростью $speed")
    }
}
class Air(override val model: String, override val number: String) : Movable{
    override var speed = 600

    override fun move() {
        println("Летим на самолете/ Cо скроростью $speed")
    }
    override fun stop() = println("Призляется")
}
interface Worker{
    fun work()
}
interface Student{
    fun study()
}
class WorkStudent(val name: String) : Worker, Student{
    override fun work() = println("$name работает")
    override fun study() = println("$name учиться")
}

interface VidioPlayer{
    fun play()
}
interface AudioPlayer{
    fun play()
}
class MediaPlayer : VidioPlayer, AudioPlayer{
    override fun play() = println("Играет аудио и видео")
}
fun main(){

    val player = MediaPlayer()
    player.play()

    val pavel = WorkStudent("Pfvel")
    pavel.study()
    pavel.work()

    val car = Car("Lada", "232hjf")
    val air = Air("Boing","2332")

//    air.move()
//    Air.stop()

//    val car = Car()
//    val a = Air()
//    car.move()
//    a.move()
}
