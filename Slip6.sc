/*Write a Scala program to read a character and a string from user and remove first and last occurrence of that character from the string. Display the resultant string after changing its case.*/

import scala.io.StdIn._
import scala.util.control.Breaks._
object Slip6 {
	def main(a : Array[String] ) {
		println("Enter String :: ");
		val string1 = readLine();
		println("Enter character to remove :: ");
		val char = readChar();
		println(string1 + "\n"+ char);
		var string2 : String = "";
		var string3 : String = "";
		var count=0;
		//--
		for( i <- 0 until string1.length() ) {
			if(string1.charAt(i) == char && count<1){
				println(string1.charAt(i));
				string2 = string2 + "";
				count = count + 1;
			}else{
				string2 = string2 + string1.charAt(i);
			}		
		}
		count = 0;
		for(i <- string2.length()-1 to 0 by -1) {
			if(string2.charAt(i) == char && count<1) {
				println(string2.charAt(i))
				string3 = string3 + "";
				count = count + 1;
			}
			else {
				string3 = string3 + string2.charAt(i);
			}
		}
		println(string3.reverse);
	}
}

