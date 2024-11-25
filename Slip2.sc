import scala.io.StdIn;
import scala.util.control.Breaks._;
object slip2 {
	def main(a:Array[String]) {
		println("Enter Two Numbers :: ");
		var n1 = StdIn.readInt();
		var n2 = StdIn.readInt();
		var sum=0;
		var c=0;
		//var f=0;
		while(n1 <= n2){
			f=0;
			breakable{
			for(i <- 2 to n1/2) {
				if(n1%i == 0) {
					println("Break");
					//f=1;
					break;
				}
			}
			if(i == (n1/2)+1){
				sum = sum + n1;
				c = c + 1;
				print(n1+" ");
			}
		     }
		     n1 = n1 + 1;
		}
		
		println("Average :: "+ sum / c);
	}
}
