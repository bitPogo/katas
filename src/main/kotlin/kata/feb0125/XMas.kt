package kata.feb0125

object XMas {
    fun countXmas(letters: String): Int {
        val word = "XMAS"
        //val wordInLetters = mapOf('X' to 0, )
        //find xmas in a line
        //find xmas in a column
        var count = 0
        letters.split("\n").forEach {
            if(it.contains(word) || it.contains(word.reversed()))
                count+=1
        }
        return count
    }
}