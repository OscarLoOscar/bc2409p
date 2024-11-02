package DemoClass;

import java.util.Arrays;

public class Receipt {
  private Order[] orders;

  public Order[] getOrders() {
    return this.orders;
  }

  public void setOrders(Order[] orders) {
    this.orders = orders;
  }

  public double getTotalPrice() {
    double totalPrice = 0.0;
    // int count = 0;

    for (Order order : this.orders) {
      // System.out.println(count++);
      totalPrice += order.getOrderTotal();
    }

    // for(int i = 0 ; i < this.orders.length ; i++){
    // System.out.println(count++);
    // totalPrice += orders[i].getOrderTotal();
    // }
    return totalPrice;
  }

  public void addOrder(Order order) {
    Order[] newOderList = new Order[this.orders.length + 1];
    for(int i = 0 ;  i <  this.orders.length ; i++){
      newOderList[i] =  this.orders[i];
    }
    newOderList[newOderList.length -1] = order;
    this.orders = newOderList ;
  }

  public static void main(String[] args) {

    Item apple = new Item();
    apple.setProductName("Apple");
    apple.setPrice(10.5);

    Item orange = new Item();
    orange.setProductName("Orange");
    orange.setPrice(11.8);

    Item banana = new Item();
    banana.setProductName("Banana");
    banana.setPrice(5);

    Order order1 = new Order();
    order1.setProduct(apple);
    order1.setQuantity(2);
    System.out.println("order1 total price : " + order1.getOrderTotal());

    Order order2 = new Order();
    order2.setProduct(orange);
    order2.setQuantity(5);
    System.out.println("order1 total price : " + order2.getOrderTotal());

    Order order3 = new Order();
    order3.setProduct(banana);
    order3.setQuantity(5);


    // Order[] orderList = new Order[] {order1, order2, order3, order1, order1};
    Order[] orderList = new Order[5];

    Receipt receipt1 = new Receipt();
    receipt1.setOrders(orderList);
    receipt1.addOrder(order1);

   // System.out.println("Receipt Total price " + receipt1.getTotalPrice());
  }

}
