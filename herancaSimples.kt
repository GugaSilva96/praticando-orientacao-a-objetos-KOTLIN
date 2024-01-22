open class Dog {
    open fun sayHello() {
    	println("WOLF! WOLF!")
    }
}

class Yorkshire: Dog() {
    override fun sayHello() {
        println("AU! AU! AU!")
    }    
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}
