package kata.feb0225

object InputReader {
    private val NL: String = System.lineSeparator()

    private fun parseLookupTable(rawLookup: String): Map<Int, List<Int>> {
        val lookupTable = mutableMapOf<Int, MutableList<Int>>()

        rawLookup.lines().forEach { line ->
            val (value, key) = line.split("|")
            lookupTable.getOrPut(key.toInt()) { mutableListOf() }
                .add(value.toInt())
        }

        return lookupTable
    }

    private fun parseUpdate(rawUpdate: String): List<List<Int>> {
        return rawUpdate.lines().map { line ->
            line.split(",").map { it.toInt() }
        }
    }

    fun parse(input: String): Pair<Map<Int, List<Int>>, List<List<Int>>> {
        val (rawLookup, rawUpdates) = input.split(NL + NL)

        return parseLookupTable(rawLookup) to parseUpdate(rawUpdates)
    }
}