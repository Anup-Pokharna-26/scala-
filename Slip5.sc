/*Write a Scala program to create two sets of strings and find [12]
common strings between them. Merge sets after removing
common strings. Display the resultant set.*/

object Slip5 {
	def main(a : Array[String]) {
		val set1 = Set("abc","xyz","pqr");
		val set2 = Set("ads","xyz","zcx","abc");
		
		val commonElement = set1.intersect(set2);
		
		val newSet = (set1 -- commonElement) ++ (set2 -- commonElement);
		
		println("Common Element is : "+ commonElement);
		println("New Set :\n"+newSet);
	}
}
