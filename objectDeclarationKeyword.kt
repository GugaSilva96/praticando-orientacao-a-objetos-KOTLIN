object DoAuth {
    fun takeParams(username: String, password: String) {
        println("Input Auth parameters = $username:$password")
    }
}

fun main () { 
	DoAuth.takeParams("Guga", "HelloWorld")
}
