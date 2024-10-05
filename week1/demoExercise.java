package bc2409p;

public class demoExercise {

  /**
   * Expected Output:
   * 
   * I am going to add two numbers together: The first one: 31 The second one: 42 The sum is 73 The subtraction reuslt is 11 The another sum result is 130 The variable varB is false The variable varC is
   * true The variable fnumber is -130.2 The variable dnumber is -20.5 The variable reminder is 1 The variable result is 3
   */
  public static void main(String[] args) {

    int x = 31;
    int y = 42;
    System.out.println("The first one: " + x);
    System.out.println("The second one: " + y);
    int sum = x + y;
    System.out.println(" The sum is " + sum);
    int subtraction = y - x;
    System.out.println(subtraction);
    x = 60;
    y = 70;
    int sum2 = x + y;
    System.out.println("WRONG : The another sum result is " + x + y);// "60" + "70" -> 6070
    System.out.println("RIGHT : The another sum result is " + sum2);// 130

    boolean b1 = true;
    boolean b2 = false;
    System.out.println("The variable varB is " + b2);
    System.out.println("The variable varC is" + b1);

    double fnumber = -130.2;
    double dnumber = -20.5;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);

    // 1
    int reminder1 = 10;
    int reminder2 = 3;
    int ans1 = reminder1 / reminder2;
    int ans2 = reminder1 % reminder2;
    System.out.println("The variable reminder is " + ans2);

    System.out.println("The variable result is " + ans1);

    int a = 3100;
    int b = 300;
    // AND &&
    // OR ||
    if (a > b || 10 < 1) { // Condition , true OR false
      System.out.println("a is  > b : true");
    } else {
      System.out.println("a is not > b : false");
    }

    // Question : Determine whether year n is a leap year.
    /*
     * Definiton of a leap year: If a year is divisible by 4 and not divisible by 100 or divisible by 400, then, it is a leap year.
     */
    // hints : != mean not , == mean is

    int year1 = 2009; // 2020 , 2400

    // && ||
    if (year1 % 4 == 0 && (year1 % 100 != 0 || year1 % 400 == 0)) {
      System.out.println(year1 + " is leap year");
    } else {
      System.out.println(year1 + " is not leap year");
    }


// if(){

// }else if(){

// }else if(){
  
// } else{

// }
System.out.println();

// week 1 : int , double  ,String 
// float , byte , char , long ,short 
  }
}
