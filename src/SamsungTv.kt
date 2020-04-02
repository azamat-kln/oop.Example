abstract class Tv {
    abstract val nameTv: String
    abstract val color: String
}

class SamsungTv(
    override val nameTv: String,
    override val color: String,
    private val monitor: MonitorInterface,
    private val controller: Remote
) : Tv() {

    // In fact,turning on/off is job/task of remote(пульт)
    fun turnOn() {
        // delegation of task.
        controller.on(nameTv)
    }

    fun show() {
        // So,we just have to watch tv(we just have to call)
        // and how is it implemented is not important for tv
        monitor.display(nameTv)
    }

    fun turnOff() {
        controller.off()
    }

}

class Remote {
    fun on(name: String) {
        println("$name tv is turned on")
    }

    fun off() {
        println("tv is turned off")
    }
}

class Monitor : MonitorInterface {
    override fun display(nameTv: String) {
        println("a monitor of $nameTv is displaying")
    }
}

class HdMonitor : MonitorInterface {
    override fun display(nameTv: String) {
        println("hd monitor of $nameTv is displaying now")
    }
}

interface MonitorInterface {
    fun display(nameTv: String)
}