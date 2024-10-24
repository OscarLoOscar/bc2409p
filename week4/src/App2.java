import java.util.Arrays;

public class App2 {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    for (int i : arr) {

      if (i % 2 == 0) {
        System.out.println(i + " is even number");
      }
      System.out.println(i + " is odd number");
    }

    String str = "Java , Python , JavaScript , TypeScript , R , C++ , C#";
    // Exercise 1
    // swap : expect output : String arr = [C#,C++,R,TypeScript,JavaScript,Python,Java];
    String[] strArr = str.split(",");
    for (int i = 0; i < strArr.length / 2; i++) {
      String temp = strArr[i];
      strArr[i] = strArr[strArr.length - 1 - i];
      strArr[strArr.length - 1 - i] = temp;
    }
    System.out.println("Exercise 1 : " + Arrays.toString(strArr));
    // Exercise 2
    // expect output : String str1 = "Java,Python,JavaScript,TypeScript,R,C++,C#";
    String str1 = str.replace(" ", "");
    System.out.println("Exercise 2 : " + str1);
    // Exercise 3
    // expect output : ava,ython,avacript,ypecript,++,#
    // toCharArray()
    char[] charArr = str.toCharArray();
    // System.out.println("Exercise 3 , step 1 : " + Arrays.toString(charArr));
    // [J, a, v, a, , ,, , P, y, t, h, o, n, , ,, , J, a, v, a, S, c, r, i, p, t, , ,, , T, y, p, e, S, c, r, i, p, t, , ,, , R, , ,, , C, +, +, , ,, , C, #]
    char[] charArr2 = str.replace(" ", "").toCharArray();
    // System.out.println("Exercise 3 , step 1 : " + Arrays.toString(charArr2));

    // if( == 'J' || == 'P' )....
    String result = "";
    for (int i = 0; i < charArr2.length; i++) {
      if (charArr2[i] >= 'A' && charArr2[i] <= 'Z') {
        continue;
      }
      result += charArr2[i];
    }
    System.out.println("Exercise 3 : " + result);

  }
}
