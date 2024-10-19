public class JavaQuest4 {
  /**
   * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3 (Search it from 0)
   * 
   * Expected Output: 6 12 18 24 30 36 42 48 54 60
   */
  // break , continue , for() , while() ,if() , %==0 , %!=0
  public static void main(String[] args) {
    // Print the first 10 numbers from 0:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0
    System.out.println();
    int count = 0;
    System.out.print("Output : ");

    for (int i = 0; i < 100; i++) { // You cannot change this line
      if (i % 2 == 0 && i % 3 == 0 && i > 0) {
        System.out.print(i + " ");
        count++;
      }
      if (count == 10)
        break;
    }
    System.out.println();
  }
}
