import java.util.Arrays;

public class Prep {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;
    int num3 = 3;

    // Approach 1 how to new an Array
    // int[] intArray0 = new int[]; is error
    // declare intArray with size 3
    int[] intArray = new int[3]; // array.length = 3
    intArray[0] = num1;
    intArray[1] = num2;
    intArray[2] = num3;

    // Approach 2 how to new an Array
    // declare intArray with size 3 and assign values
    int[] intArr2 = new int[] {1, 2, 3};
    // intArr2[3] = 4; //Index 3 out of bounds for length 3
    // you can not redeclare the length of array after "new"

    String[] strArr = new String[10];
    strArr[0] = "";
    strArr[2] = "example 2";
    strArr[5] = "example 3";
    System.out.println();
    System.out.println("print arr : " + Arrays.toString(strArr));
    // System.out.println("print arr : " + strArr);

    System.out.println();


    // primitive array
    byte[] byteArr = new byte[3];
    short[] shortArr = new short[3];
    int[] intArr = new int[3];
    long[] longArr = new long[3];
    float[] floatArr = new float[3]; // 10.0 , 11.0
    double[] doubleArr = new double[3]; // 10.0 , 11.0
    boolean[] booleanArr = new boolean[3]; // true , false , true
    String[] strArr2 = new String[3];


    char[] charArr = new char[3]; // 0,1,2
    charArr[0] = 'a';
    System.out.println("1. : " + charArr[0]);
    charArr[0] = 'c';
    System.out.println("2. : " + charArr[0]);
    // System.out.println("3. : " + charArr[3]);// Index 3 out of bounds for length 3

    String str = "example";
    char[] convertTocharArr = str.toCharArray(); // define the char[] by this method ,no need define the length yourself
    System.out.println("checking str : " + str);
    System.out
        .println("checking char[] : " + Arrays.toString(convertTocharArr));// [e, x, a, m, p, l, e]
    System.out.println("checking char[] : " + convertTocharArr);// [C@7344699f

    for (int i = 0; i < convertTocharArr.length; i++) {
      System.out.println("loop : " + convertTocharArr[i]);
    }

    double[] doubleArr2 = new double[] {1, 'c', 10.0, -127.129876};
    int[] intArr3 = new int[] {1, 10, 'a'};

    // String[] strArr3 = new String[] {1, "a", 'c', "123.123", 123.123};

    String[] strArr3 = new String[] {"1", "a", "c", "123.123", "123.123"};
    System.out.println("strArr3[0] : " + strArr3[0]);
    System.out.println("strArr3[1] : " + strArr3[1]);
    System.out.println("strArr3[2] : " + strArr3[2]);
    System.out.println("strArr3[3] : " + strArr3[3]);
    System.out.println("strArr3[4] : " + strArr3[4]);
    // System.out.println(strArr3[5]);
    boolean[] booleanArr2 = new boolean[] {true, false, true, true, false};
    System.out.println(Arrays.toString(booleanArr2));


    char[] example = new char[] {'a', 'p', 'p', 'l', 'e'};
    System.out.println("using char[] : " + Arrays.toString(example));
    String str1 = String.valueOf(example);
    System.out.println("using valueOf : " + str1);
  }

}
