/*Write a Scala program to read two strings. Find the occurrences of [12]
the second string in the first string. Change the case of each
occurrence in the string and display the resultant string.*/

import scala.io.StdIn._

object Slip11 {
  def main(a: Array[String]): Unit = {
    // Reading input strings
    println("Enter Input String :: ")
    var s1 = readLine(); 
    println("Enter String to check :: ")
    var check = readLine();
     
    var s2 = ""  // Resultant string after case conversion
    val arr = s1.split(" ")  // Split the input string by spaces
    
    // Iterate through each word in the split string
    for (i <- 0 until arr.length) {
      val x = arr(i)  // Current word to check

      // Check if the word is equal to the 'check' string
      if (x == check) {
        // If the word is uppercase, convert it to lowercase
        if (x == x.toUpperCase) {
          s2 += " " + x.toLowerCase
        } else {
          // Otherwise, convert it to uppercase
          s2 += " " + x.toUpperCase
        }
      } else {
        // If the word is not the 'check' string, keep it unchanged
        s2 += " " + x
      }
    }
    
    println(s2.trim)  // Remove the leading space and print the result
  }
}

