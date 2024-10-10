package bc2409p;

public class helloworld {
  public static void main(String[] args) {
    // VSCode short cut :
    // ctrl/command + shift + k -> restart
    // ctrl/command + s -> save
    // ctrl/command + shift + f -> code拍齊對位

    String str = "";
    // System.out.println("str : " + str);
    String str1 = " ";
    // System.out.println("str1 : " + str1);

    // int j = 0.0d; // 010101110101001

    double k = 0; // avoid
    double o = 0.0;
    // long l1 = 0.0l;

    //

    int k = 0;
    System.out.println("before : " + k);
    k = 1;
    System.out.println("after : " + k);
    System.out.println("k : " + k); // post-increment
    ++k;
    System.out.println("++k : " + ++k); // pre-increment

    int i = 5;
    int a; // default = 0
    a = i++;
    // a= i -> a = 5
    // i++ -> 5 + 1 -> i = 6
    System.out.println("using i++");
    System.out.println("a = " + a); // 5
    System.out.println("i = " + i);// 6 , before line 32
    i = 5;
    a = ++i;
    System.out.println("using ++i");
    System.out.println("a = " + a);
    System.out.println("i = " + i);

    // % >> 餘數
    // int , double , String
    boolean b1 = true;
    boolean b2 = false;

    // > , < , >= , <=
    boolean r1 = 10 > 3;
    System.out.println("r1 : " + r1);
    boolean r2 = 10 > 11;
    System.out.println("r2 : " + r2);
    boolean r3 = 10 >= 10;
    System.out.println("r3 : " + r3);
    boolean r4 = 10 <= 10;
    System.out.println("r4 : " + r4);

  }
}
