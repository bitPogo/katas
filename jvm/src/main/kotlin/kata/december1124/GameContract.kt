package kata.december1124

interface GameContract {
    val frames: List<FrameContract>
    val totalScore: Int
    val isOver: Boolean

    fun addRoll(pins: Int)
}