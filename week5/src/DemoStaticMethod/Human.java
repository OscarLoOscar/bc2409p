package DemoStaticMethod;

public class Human {


  public static void main(String[] args) {
    System.out.println(Calculator.add1(2, 3));

    // Wrong
    // System.out.println(Calculator.add2(2, 3));

    Calculator cal = new Calculator();
    System.out.println(cal.add2(10, 10));
    System.out.println(cal.add2(20, 30));

//    cal.add1(5,5);
  }
}
