abstract class Order(val id: Int, val description: String) {
  def display();
}

class PurchaseOrder(id: Int, description: String, supplierDetails: String)
  extends Order(id, description) {
 
  override def display() {
    println("Purchase Order Details:")
    println("Order Id: " + id)
    println("Order Description: " + description)
    println("Supplier Details: " + supplierDetails)
  }
}

class SalesOrder(id: Int, description: String, customerDetails: String)
  extends Order(id, description) {
  
  override def display() {
    println("Sales Order Details:")
    println("Order Id: " + id)
    println("Order Description: " + description)
    println("Customer Details: " + customerDetails)
  }
}

object Slip3 {
  def main(args: Array[String]) {
    val purchaseOrder = new PurchaseOrder(101, "Laptop", "ABC Supplier");
    val salesOrder = new SalesOrder(203, "Laptop", "XYZ PQR");
    
    purchaseOrder.display()
    salesOrder.display()
  }
}

