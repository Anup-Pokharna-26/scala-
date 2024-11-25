/*Write a Scala program to merge two sets of integers, and
calculate the sum and product of all integers in the merged set.
Also, display the largest and smallest element from the merged
set.*/

object Slip13 {
	def main(a : Array[String]) {
		var set1 = Set(1,2,3,4);
		var set2 = Set(5,6,7,8);
		var set3 = set1 ++ set2;
		
		println("Sum of Set : "+set3.sum+"\nProduct of Set : "+set3.product);
		println("Max : "+set3.max+"\nMin : "+set3.min); 
		
	}
}
