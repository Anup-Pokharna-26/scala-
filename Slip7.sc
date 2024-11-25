/*Write a Scala program to create a list of integers from 1 to 50. From [12]
this list create another list containing only those numbers which are
divisible by 3. Display the resultant list.*/

object Slip7 {
	def main(a : Array[String]) {
		var list1 = List.range(1,51);
		/*var list2 = List[Int]();
		
		for(i <- list1) {
			if(i%3 == 0) {
				list2 = list2 :+ i; //
			}
		}
		*/
		val list2 = list1.filter(_%3 == 0);
		println(list2);
	}
}
