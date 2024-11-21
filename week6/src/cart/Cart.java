package cart;
import java.util.Arrays;

public class Cart { // Cart , 可以new Cart() -> not an abstract class

  private Product[] products; // Cart can has many Product -> so use Product[]
  private int count;

  public Cart() {
    this.products = new Product[0];// Array is fixed length , so we declare the length first
    this.count = 0;
  }

  public void addProduct(Product product) {
    Product[] newCart = Arrays.copyOf(products, products.length + 1);
    if (this.count < newCart.length) {
      newCart[count++] = product;
      this.products = newCart; //array pass by reference
    } else {
      System.out.println("Cart is full , Cannot add more products.");
    }
  }

  public void removeProduct(Product product) {
    for (int i = 0; i < this.products.length; i++) {
      // we dont use == to compare object
      // Approach A , products[i] maybe null
      // if(products[i].equals(product))

      // Approach B , avoid null value
      if (product.equals(this.products[i])) {
        for (int j = i; j < this.count - i; j++) {
          this.products[j] = this.products[j + 1];
        }
        this.products[this.count - 1] = null;
        this.count--;
        return;
      }
    }
  }

  public double calculateTotal() {
    double total = 0.0;
    for (Product product : this.products) {
      total += product.price();
    }
    return total;
  }

  public void showCart() {
    for (int i = 0; i < this.products.length; i++) {
      System.out.println(products[i].name() + //
          " (" + products[i].getProductType() + ") - $ "//
          + this.products[i].price());
    }
  }
  // Cart cartA = new Cart();
  // cartA.removeProduct(product);
}
