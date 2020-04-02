class Car(
    private val color: String,
    private val year: String,
    private val manufacturer: String,
    private val wheel: CarWheel
) {
    
    fun turnLeft() {
        // машина передала отбетсвенность нужному объекту(также называется - делегирование задач)
        // әрбір объект тек өзіне ғана тиісті жауапкершілікті алу қажет.Мысалы,көлік бұрылды деген қате ұғым
        // көлік емес,дөңгелек бұрылады.
        wheel.left()
    }

    fun turnRight() {
        wheel.right()
    }
}

class CarWheel {

    fun left() {

    }

    fun right() {

    }
}
