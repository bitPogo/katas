package kata.january1625


fun interface ReportAnalyzerContract {
    fun checkSafety(report: IntArray): Boolean
}