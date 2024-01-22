open class Tiger(val origin: String) {
    fun sayHello() {
        println("A Tiger from $origin says: grrrrhhhh!!!")
    }
}

class SiberianTiger : Tiger(origin = "Siberia")

fun main() {
    val tiger: Tiger = SiberianTiger()
        tiger.sayHello()
}
