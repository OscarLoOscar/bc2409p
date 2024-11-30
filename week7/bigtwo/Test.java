package week7.bigtwo;

public class Test {
  public static void main(String[] args) {
    Card c1 = new Card('A', 'D');
    Card c2 = new Card('A', 'D');
    System.out.println(c1.equals(c2)); // true

    System.out.println(c1.hashCode()); // 3044 (calculated by rank & suit)
    System.out.println(c2.hashCode()); // 3044 (calculated by rank & suit)

  }
}