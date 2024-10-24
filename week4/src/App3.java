public class App3 {

  public static int finalValueAfterOperations1(String[] operations) {
    int result = 0;

    for (String str : operations) {
      if ("X++".equals(str) || "++X".equals(str))
        result++;
      else
        result--;
    }
    return result;
  }

  public static int finalValueAfterOperations2(String[] operations) {
    int result = 0;

    for (String str : operations) {
      switch (str) {
        case ("X++"):
          result++;
          break;
        case ("++X"):
          result++;
          break;
        case ("X--"):
          result--;
          break;
        case ("--X"):
          result--;
          break;
      }
    }
    return result;
  }

  public static int finalValueAfterOperations3(String[] operations) {
    int result = 0;
    for (String str : operations) {
      if (str.indexOf("+") != -1)
        result++;
      else
        result--;
    }
    return result;
  }


  public static int finalValueAfterOperations4(String[] operations) {
    int result = 0;
    for (String str : operations) {
      if ("+".equals(str.substring(1,2)))
        result++;
      else
        result--;
    }
    return result;
  }


  public static void main(String[] args) {

    // X++
    // ++X
    // --X
    // X--
    // substring() ?
    String[] input = new String[] {"++X", "++X", "X--"};
    System.out.println("Answer 1 : " + App3.finalValueAfterOperations4(input));
    System.out.println("Answer 2 : " + App3.finalValueAfterOperations1(input));
  }
}
