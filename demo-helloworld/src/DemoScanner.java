// import case 1 , Quick fix
// import case 2 , command / ctrl + shift + o -> auto import

import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please input a number : ");
    int number = input.nextInt();
    // System.out.println("number is " + number);

    if (number > 100)
    System.out.println("number is > 100");
    if (number < 100)
    System.out.println("number is < 100");
    if (number == 100)
    System.out.println("number is 100");

    switch (number) {
      case 100:
        System.out.println("number is  100");
        break;
      case 101:
        System.out.println("number is " + number);
        break;
      case 99:
        System.out.println("number is " + number);
        break;
      default:
        System.out.println("number is not 100 / 101 /99 ");
        break;
    }
  }
}
