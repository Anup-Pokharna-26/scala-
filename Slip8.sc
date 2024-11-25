/*Write a Scala program to create array of strings. Read a string from [12]
the user and display all the strings from the array that contain the
given string.*/
import scala.io.StdIn._
object Slip8 {
	def main(a : Array[String]){
		var arr = new Array[String](5);
		for(i <- 0 until arr.length) {
			println("Enter String :: ");
			arr(i) = readLine();
		}
		
		println("Enter String to check :: ");
		var check = readLine();
		
		for(i <- 0 until arr.length) {
			if(arr(i).contains(check)) {
				//println("afds");
				println(arr(i));
			}
		}
	}
}
