/*Write a Scala program to create an abstract class Shape with abstract [12]
functions volume() and display(). Extend two classes Cube and
Cylinder from it. Create object of Cube and Cylinder. Calculate the
volume of each and display it.*/

abstract class Shape {
	def volume();
	def display();
}
class Cube extends Shape {
	var side = 0;
	var vol = 0;
	 
	def accept() {
		println("Enter side of Cube :: ");
		side = readInt();
	}
	
	override def volume() {
		vol = side * side * side;		
	}	
	
	override def display() {
		println("Volume of Cube :: "+vol);
	}
}

class Cylinder extends Shape {
	var radius = 0;
	var h = 0;
	var vol : Double = 0.0;
	
	def accept() {
		println("Enter radius of Cylinder :: ");
		radius = readInt();
		println("Enter height of Cylinder :: ");
		h = readInt();
	}	
	
	override def volume() {
		vol = 3.14*radius*radius*h;		
	}	
	
	override def display() {
		println("Volume of Cylinder :: "+vol);
	}
}

object Slip10 {
	def main(a : Array[String]) {
		var cubeObj = new Cube();
		
		var cylinderObj = new Cylinder();
		
		cubeObj.accept();
		cubeObj.volume();
		cubeObj.display();
		
		cylinderObj.accept();
		cylinderObj.volume();
		cylinderObj.display();
	}
}


