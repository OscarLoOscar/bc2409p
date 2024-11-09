package DemoClass;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class MarkSix {
  private static int[] markSix = new int[6];



  public static boolean contains(int[] arr, int num) {
    for (int i : arr) {
      if (i == num) {
        return true;
      }
    }
    return false;
  }

  public static void result() {
    Random random = new Random();
    int count = 0;
    while (count < 6) {
      int randomNumber = random.nextInt(49) + 1;
      if (!contains(markSix, randomNumber)) {
        markSix[count++] = randomNumber;
      }
    }
    Arrays.sort(markSix);
    System.out.println("The Mark Six result of " + //
        LocalDate.now() + //
        " is " + //
        Arrays.toString(markSix));
  }

  public static void main(String[] args) {
    MarkSix.result();
  }
}
