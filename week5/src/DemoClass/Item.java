package DemoClass;

public class Item {
  private String name;
  private double price;

  public String getProductName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setProductName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String toString() {
    return "[name : " + this.name + //
        " , price : " + this.price + "]";
  }
}
