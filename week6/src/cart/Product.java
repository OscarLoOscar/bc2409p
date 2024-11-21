package cart;
// Big Parent class 
public abstract class Product { // Product 是抽象的名詞 ，所以用abstract class形容-> 無得new Porduct()
  // attribute
  private String name;
  private double price; // Encapsulation

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  // getter , setter
  public String name() {
    return this.name; // instance method , this 代表call呢個method個隻object
  }

  public double price() {
    return this.price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // abstract method , 呢個method得個名 ,無內容，內容由extends佢既class定義
  public abstract String getProductType(); // Abstraction
  // 留筆遺產比你，點用自己決左,
  // so we have line 22-25 in public class Electronics ,
  // and line 29-31 in public class Clothing

  @Override // Override class Object
  public String toString() {
    return "[name : " + this.name + //
        " , price : " + this.price + "]";
  }
}
