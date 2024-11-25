// Define a class
class Employee(val name: String, val id: Int) {
  // Method to display employee details
  def display(): Unit = {
    println(s"Employee ID: $id, Name: $name")
  }
}

object Slip17 {
  def main(args: Array[String]): Unit = {
    // Create an array of Employee objects
    val employees = new Array[Employee](3);

    // Initialize each element of the array
    employees(0) = new Employee("Alice", 101)
    employees(1) = new Employee("Bob", 102)
    employees(2) = new Employee("Charlie", 103)

    // Access and display employee details
    for (employee <- employees) {
      employee.display()
    }
  }
}

