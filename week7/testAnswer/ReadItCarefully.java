package week7.testAnswer;

public class ReadItCarefully {
  static final String string = "IamFinalString";
  private static char c = 'C';
  private char d = 'D';

  static {
    char[] chars = string.toCharArray();
    c = chars[2];
    System.out.println("inner static block");
  }

  {
    char[] chars = string.toCharArray();
    d = chars[3];
    System.out.println("inner non-static block");
  }

  public static void main(String[] args) {
    ReadItCarefully readItCarefully = new ReadItCarefully();
    // inner static block
    // inner non-static block
    // System.out.println(readItCarefully.c);
    // System.out.println(readItCarefully.d);
  }
}
