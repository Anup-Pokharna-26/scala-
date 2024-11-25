import scala.io.StdIn

class Transpose {

  // Creating a 2x2 matrix for demonstration
  val arr = Array.ofDim[Int](2, 2)

  // Method to accept user input for the matrix
  def accept() {
    for (i <- 0 until arr.length) {
      for (j <- 0 until arr(i).length) {
        println(s"Enter number at position ($i, $j): ")
        arr(i)(j) = StdIn.readInt()
      }
    }
  }

  // Method to display the matrix
  def display(){
    println("Original Matrix:")
    for (i <- 0 until arr.length) {
      for (j <- 0 until arr(i).length) {
        print(arr(i)(j) + " ")
      }
      println()  // For a new line after each row
    }
  }

  // Method to calculate the transpose of the matrix
  def transpose(): Array[Array[Int]] = {
    // Create a new matrix for the transpose
    val transposed = Array.ofDim[Int](arr.length, arr.length)
    for (i <- 0 until arr.length) {
      for (j <- 0 until arr(i).length) {
        transposed(j)(i) = arr(i)(j)  // Swap rows and columns
      }
    }
    transposed
  }
}

object Slip4 {
  def main(args: Array[String]) {
    val obj = new Transpose()
    
    // Accept the matrix input
    obj.accept()
    
    // Display the original matrix
    obj.display()
    
    // Calculate and display the transpose
    val transposedMatrix = obj.transpose()
    println("Transpose of the matrix:")
    for (i <- 0 until transposedMatrix.length) {
      for (j <- 0 until transposedMatrix(i).length) {
        print(transposedMatrix(i)(j) + " ")
      }
      println()
    }
  }
}

