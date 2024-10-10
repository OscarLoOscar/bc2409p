public class Exercise1 {

  /**
   * Expected Output:
   * 
   * The first one: 31 The second one: 42 The sum is 73 The subtraction result is 11 The another sum result is 130 The variable varB is false The variable varC is true The variable fnumber is -130.2 The
   * variable dnumber is -20.5 The variable reminder is 1 The variable result is 3
   */
  public static void main(String[] args) {
    // int , double , String , System.out.println()
    int x = 31;
    System.out.println("The first one:" + x);
    int y = 42;

    System.out.println("The second one:" + y);
    int z = x + y;
    System.out.println(x + y);
    System.out.println("WRONG : The sum is :" + x + y); // "31" + "42" , String + int/double / Other datatype = String
    System.out.println("RIGHT : The sum is :" + z);
    int aa = y - x;
    System.out.println("The subtraction result is " + aa);
    int bb = 60;
    int cc = 70;
    int dd = bb + cc;
    System.out.println("The another sum result is " + dd);
    boolean varB = false;
    boolean varC = true;
    System.out.println("The variable varB is" + varB);
    System.out.println("The variable varC is" + varC);
    double fnumber = -130.2;
    double dnumber = -20.5;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);

    int num4 = 10;
    int num5 = 3;
    int reminder = num4 / num5; // 3.33333333 -> 3
    int result = num4 % num5;
    System.out.println();
    System.out.println();
    // 36.010000000000005 精度損失
    double d1 = 10.48; // 10.48 -> 010101010101010011101010
    double d2 = 25.53;
    System.out.println(d1 + d2);
    System.out.println();
    System.out.println();
    System.out.println("The variable reminder is " + reminder);
    System.out.println("The variable result is " + result);
    //
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    // AND -> &&
    // OR -> ||
    int a = 3;
    int b = 10;
    if (a > b) {
      // if true
      System.out.println(a + ">" + b);
    } else {
      // if false
      System.out.println(a + "<" + b);
    }

    int c = 200;

    if (a > b) { // condition A
      // if condition A true
      System.out.println();
      System.out.println(a + ">" + b);
    } else if (c > a) {// condition B
      // if condition B true
      System.out.println();
      System.out.println(c + ">" + a);
    } else {
      System.out.println("nothing");

    }
    a = 10;
    b = 100;
    c = 200;

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    if (c > b && c > a) { // true && true
      System.out.println("Condition 1 : c > b && c > a");
    }

    if (c > b && a > c) { // true && false -> false
      System.out.println("Condition 2 : c > b && a > c");
    }
    if (c > b || a > c) { // true && false -> false
      System.out.println("Condition 3 : c > b || a > c");
    }

    if (c > b && c > a || a > b) {
      System.out.println("Condition 4 : c > b && c > a || a>b");
    }
    System.out.println();


    if ((c > b && a > c) || a > b) {
      System.out.println("Condition 5 : (c > b && a > c) || a > b");
    }
    System.out.println();

    if (c > b && (a > c || b > a)) {
      System.out.println("Condition 6 : c > b && (a > c || b > a)");
    }


    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    // Question : Determine whether year n is a leap year.
    /*
     * Definition of a leap year:
     * 
     * If a year is divisible by 4 and not divisible by 100 or divisible by 400, then, it is a leap year.
     */
    // hints : != mean not , == mean is

    int year = 2000;

    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }

    // primitive type : int , double , boolean , Class : String
    // &&, ||, ==, != , > ,< , >= , <= , + , - , * ,/ , %
    // if(){}else{}

  }
}
