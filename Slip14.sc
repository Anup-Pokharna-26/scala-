import scala.collection.mutable.ListBuffer

object Slip14 {
  def main(a: Array[String]): Unit = {
    val list1 = List.range(1, 101)
    val list2 = ListBuffer[Int]() // Mutable list

    for (i <- 1 to 100) {
      if (i * i <= 100) {
        list2 += i*i
      }
    }
    
    println(list2.toList) // Convert ListBuffer back to immutable List for output
  }
}
	
