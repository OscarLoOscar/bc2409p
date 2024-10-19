import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
  /*
   * 
   * Number Guessing Game
   * 
   * Write a Java program where the user tries to guess a randomly generated number
   * 
   * between 1 and 100. The program should:
   * 
   * 1. Randomly generate a number between 1 and 100.
   * 
   * 2. Prompt the user to guess the number.
   * 
   * 3. Indicate whether the guess is too high, too low, or correct.
   * 
   * 4. Continue asking for guesses until the user guesses the correct number.
   * 
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int targetNumber = random.nextInt(100) + 1; // nextInt(100) , start form 0 -99 ,so =1 make it 1-100

    int guess = 0;
    int lowerBound = 0;
    int higherBond = 100;

    // do-while loop
    do {
      System.out.println(
          "Guess a number between " + lowerBound + " and " + higherBond + ".");
      guess = scanner.nextInt();

      if (guess > targetNumber) {
        higherBond = guess;
        System.out.println("Too high , Try a number between " + lowerBound
            + " and " + higherBond);
      } else if (guess < targetNumber) {
        lowerBound = guess;
        System.out.println("Too high , Try a number between " + lowerBound
            + " and " + higherBond);
      } else {
        System.out.println("Correct! The number is " + targetNumber);
      }
    } while (guess != targetNumber);
    
    scanner.close();
  }
}
