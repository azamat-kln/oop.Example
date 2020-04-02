fun main() {

    val monitor = Monitor()
    val hdMonitor = HdMonitor()
    val remote = Remote()

    val mutableList = mutableListOf<SamsungTv>()

    val myHdTv = SamsungTv("samsung t3", "gray", hdMonitor, remote)
    val myOldTv = SamsungTv("samsung 1", "black", monitor, remote)

    mutableList.add(myHdTv)
    mutableList.add(myOldTv)

    mutableList.forEach { tv ->
        tv.turnOn()
        tv.show()
        tv.turnOff()
    }
}