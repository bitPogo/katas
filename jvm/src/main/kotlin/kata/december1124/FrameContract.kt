package kata.december1124

interface FrameContract {
    val pinsRolled: List<Int>

    fun add(pins: Int)
    fun score(): Int
}