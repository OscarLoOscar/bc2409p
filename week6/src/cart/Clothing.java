package cart;

public class Clothing extends Item {

  private String size;
  private String material;

  public Clothing(String name, double price, String category,
      String subCategory, String size, String material) {
    super(name, price, size, material);
   // super();
    this.size = size;
    this.material = material;
  }

  public String getSize() {
    return this.size;
  }

  public String getMaterial() {
    return this.material;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public void setMaterial(String material) {
    this.material = material;

  }

  @Override
  public String getProductType() {
    return "Clothing";
  }

  // avoid print object reference , so we Override toString()
  @Override // Override class Object
  public String toString() {
    return super.toString() + //
        "size : " + this.size + //
        " , material : " + this.material;
  }


}
