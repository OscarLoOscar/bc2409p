package cart;
public class ECommerceApp {
    public static void main(String[] args) throws Exception {
        Electronics macBookPro = new Electronics("macBookPro", 499, 5);
        Clothing shirt = new Clothing("shirt", 10, "L", "Cotton");

        // System.out.println("macBookPro " + macBookPro);
        // System.out.println("shirt " + shirt);

        Cart cartA = new Cart();
        cartA.addProduct(shirt);
        cartA.addProduct(shirt);
        cartA.addProduct(macBookPro);
        cartA.showCart();
        System.out.println(cartA.calculateTotal());
    }
}
