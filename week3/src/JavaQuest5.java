import java.util.Scanner;

public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output: We found 3 character c in the String.
   * 
   * When target = 'z', the expected output: Not Found.
   */
  // Count the target of character in a String.

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please input a letter : ");
    String character = input.next();
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    // str = 'W' + 'e' + 'l' ....
    char target = 'c'; // Update this target to test the logic
    // Use a loop to count the target of character in a String.
    // code here
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == character.charAt(0)) { // condition : yes or no
        count++;
      }
    }

    if (count > 0) {
      System.out.println("\nWe found " + count + " character " + character
          + " in the String.\n");
    } else {
      System.out.println("\nNot Found.\n");
    }
  }
  // if found, print "We found 3 character c in the String."
  // if not found, print "Not Found."
  // code here

}
