package kata.december1124

class Frame: FrameContract {
    private val _pinsRolled: MutableList<Int> = mutableListOf()
    override val pinsRolled: List<Int>
        get() = _pinsRolled.toList()

    override fun add(pins: Int) {
        _pinsRolled.add(pins)
    }

    override fun score(): Int {
        TODO("Not yet implemented")
    }
}