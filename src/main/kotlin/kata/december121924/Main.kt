package kata.december121924

fun main() {
   val (list1, list2) = ResourceLoader.load("/Day1")
   val (sortedList1, sortedList2) = sort(list1, list2)
   val distance = calculateDistance(sortedList1, sortedList2)
   println("The distance is : $distance")
}

