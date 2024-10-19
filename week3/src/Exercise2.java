import java.util.Scanner;

public class Exercise2 {
  /**
   * Question : Write a Java program that reads a string from the user
   * 
   * and checks if it is a palindrome.
   * 
   * A palindrome is a string that reads the same forward and backward,
   * 
   * ignoring spaces and case.
   * 
   * Example 1 : Racecar -> "Racecar" is a palindrome.
   * 
   * Example 2 : Hello -> "Hello" is not a palindrome. since "olleh"
   * 
   * Example 3 : A man a plan a canal Panama- > "A man a plan a canal Panama" is a palindrome.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input : ");
    String input = scanner.nextLine().trim().toLowerCase();
    boolean palindrome = false;

    for (int i = 0; i < input.length() / 2; i++) {
      // example : Racecar
      // i =0 -> R
      // input.length() - i - 1 -> input.length() -1 -> 7 - 6 -> 6 -> charAt(6) = r
      // i = 1 -> a
      // input.length() - 1 - 1 -> 5 -> charAt(5) = a
      // i = 2 -> c
      // input.length() - 2 - 1 -> 4 -> charAt(4) = c
      if (input.charAt(i) == input.charAt(input.length() - i - 1)) {
        palindrome = true;
        break;
      }
    }

    if (!palindrome) {
      System.out.println(input + " is not a palindrome.");
    } else {
      System.out.println(input + " is a palindrome.");
    }

  }
}
