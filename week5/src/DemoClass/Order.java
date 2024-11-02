package DemoClass;

public class Order {
  private Item item;
  private int quantity;

  public void setProduct(Item product) {
    this.item = product;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Item getProduct() {
    return this.item ;
  }

  public int getQuantity(int quantity) {
   return  this.quantity ;
  }

  public double getOrderTotal(){
    return this.quantity * this.item.getPrice();
  }
  
  public String toString() {
    return "[Product : " + this.item + //
        " , quantity : " + this.quantity + "]";
  }

}
