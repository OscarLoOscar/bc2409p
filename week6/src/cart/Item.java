package cart;

public abstract class Item extends Category {
  private String subCategory;

  public Item(String name, double price, String category, String subCategory) {
    super(subCategory, 0, subCategory);
    this.subCategory = subCategory;
  }

  public String getSubCategory() {
    return this.subCategory;
  }
}
