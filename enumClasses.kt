fun main() {
    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "It's IDLE"
        State.RUNNING -> "It's Running!"
        State.FINISHED -> "It's Finished"
    }
    println(message)
}
