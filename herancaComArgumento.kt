open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the Lion from $origin says: AWNHÊ!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "Madagascar")

fun main() {
    val lion: Lion = Asiatic("Alex")
    lion.sayHello()
}
