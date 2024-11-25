object ListCreationExample {
  def main(args: Array[String]): Unit = {
    // 1. Creating a list using List() constructor
    val list1 = List(1, 2, 3, 4, 5)
    
    // 2. Creating a list using the `::` (cons) operator
    val list2 = 6 :: 7 :: 8 :: 9 :: Nil

    // 3. Creating a list using List.fill
    val list3 = List.fill(5)("Scala")

    // 4. Creating a list using List.tabulate
    val list4 = List.tabulate(5)(n => n * n) // Squares: 0, 1, 4, 9, 16

    // 5. Creating a list using a range
    val list5 = (10 to 20).toList

    // Displaying the lists
    println("List created using List() constructor: " + list1)
    println("List created using :: operator: " + list2)
    println("List created using List.fill: " + list3)
    println("List created using List.tabulate: " + list4)
    println("List created using a range: " + list5)
  }
}

