/*Write a Scala program to create a MAP with empname and  deptname. Print details of all employees working in the same
department, as “Mr. Joshi”.
*/

import scala.io.StdIn;
object slip1 {
	def main(a:Array[String]) {	
		//creating a map
		var empdept = Map[String,String]();
		//limit
		println("Enter Limit :: ");
		var n = StdIn.readInt();
		
		var empName = "";
		var deptName ="";
		var joshiDept = "";
		
		for(i <- 0 until n ) {
			//accept name
			println("Enter Employee Name :: ");
			empName = StdIn.readLine();
			println("Enter Department Name :: ");
			deptName = StdIn.readLine();
			
			//adding in map
			empdept += (empName -> deptName);

			//getting dept name of joshi 
			if(empName == "joshi") {
				joshiDept = deptName;
				//println(joshiDept); 
			}
		}
		//for accessing key-value
		for((emp,dept) <- empdept) {
		//checking dept
			if(dept == joshiDept && emp!="joshi") {
				println(emp);
			}
		}
	}
}
