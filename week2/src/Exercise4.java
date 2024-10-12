public class Exercise4 {
  /**
   * Expected Output:
   * 
   * The first 10 natural numbers are,
   * 
   * except 6: 1234578910
   */
  // use -> System.out.print();
  public static void main(String[] args) {
    int i;
    System.out.println("The first 10 natural numbers are, except 6:");
    // System.out.println("sentence 2 ");
    // System.out.println("sentence 3 ");
    // System.out.print("sentence 4 ");
    // System.out.print("sentence 5 ");

    // for (int j = 1; j <=10; j++) {
    for (int j = 0; j < 11; j++) {
      if (j == 6)
        continue;
      System.out.print(j);
    }
  }
}
