class BigBen {
    companion object Bonger {
        fun getBongs(nTimes	:Int) {
            for (i in 1 .. nTimes) {
                print("BONG")
                print("! ")
            }
        }
    }
}

fun main () {
    BigBen.getBongs(2024)
}
