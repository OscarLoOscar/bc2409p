import java.util.Scanner;

public class Homework1 {

  /**
   * 
   * Input number of row :5 1 12 123 1234 12345
   * 
   */
  public static void main(String[] args) {
    int k;
    System.out.println("Input number of rows : ");
    Scanner scanner = new Scanner(System.in);
    k = scanner.nextInt();
    for (int i = 0; i <= k; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    scanner.close();
  }
}
