
public class JavaQuest6 {
  /**
   * Expected output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int count = 0;
    int firstNumber = 0;
    int secondNumber = 1;
    // System.out.println();
    // System.out.print(firstNumber + " " + secondNumber + " ");

    for (int i = 0; i < 500; i++) {
      int thirdNumber = firstNumber + secondNumber;
      // System.out.print(thirdNumber + " ");
      firstNumber = secondNumber;
      secondNumber = thirdNumber;
      count++;
      if (count > 15)
        break;
    }
    // System.out.println();


    // Approach 2
    // while loop to print first 15 numbers in Fibonacci Sequence
    count = 15;
    firstNumber = 0;
    secondNumber = 1;
    int i = 0;
    System.out.println();
    System.out.print(firstNumber + " " + secondNumber + " ");
    while (i < 13) {
      int thirdNumber = firstNumber + secondNumber;
      System.out.print(thirdNumber + " ");
      firstNumber = secondNumber;
      secondNumber = thirdNumber;
      i++; // when i =14 ,  while loop is finish
    }
  }
}
