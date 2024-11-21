package cart;

public class Electronics extends Item {

  private int warrantyPeriod;
  // empty constructor
  // public Electronics(){ //constructor -> new隻object既方法->所以方法可以有好多
  //
  // }

  public Electronics(String name, double price, String category,
      String subCategory, int warrantyPeriod) {
    super(name, price, category, subCategory);
    // 用parent class既 constructor
    this.warrantyPeriod = warrantyPeriod;
  }

  public int getWarrantyPeriod() {
    return this.warrantyPeriod;
  }

  public void setWarrantyPeriod(int warrantyPeriod) {
    this.warrantyPeriod = warrantyPeriod;
  }

  @Override // 比compiler知 ，重新定義呢個method點用
  public String getProductType() {
    return "Electronics";
  } // extends used to Inheritance with abstract class Product

  @Override // Override class Object
  public String toString() {
    return super.toString() + "warrantyPeriod : " + //
        warrantyPeriod;
  }
}
