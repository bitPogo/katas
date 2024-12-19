package kata.december121924


object ResourceLoader {
    fun load(path: String): Pair<List<Int>, List<Int>> {
        val loadedResource = ResourceLoader::class.java.getResource(path).readText()
        val list1: MutableList<Int> = mutableListOf()
        val list2: MutableList<Int> = mutableListOf()
        loadedResource.split("\n").forEach { line ->
            val (number1, number2) = line.split("   ")
            list1.add(number1.toInt())
            list2.add(number2.toInt())
        }

        return Pair(list1, list2)
    }
}
