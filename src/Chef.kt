class Footballer(private val name: String, private val ball: Ball) {

    fun play() {
        ball.kick(name)
    }

}

class Ball {

    fun kick(name: String) {
        println("$name footballer has kicked ball")
    }

}
