import java.lang.reflect.Array;
import java.util.Arrays;

public class MondayExercise {
  public static void main(String[] args) {
    // Exercise 1
    String inputString = "programming";
    char targetChar = 'm'; // char -> ASCII -> int

    int count = 0;
    // Objective : Practice : indexOf() , while-loop

    // Task: Write a program that takes a string and a character as input,
    // and counts how many times the character occurs in the string using indexOf()
    // and a while-loop. Make sure to handle cases where
    // the character is not found.

    int index = inputString.indexOf(targetChar); // find the index of the input int/char
    // return -1 : if the character does not occur.
    // if i print index , output -> 5
    while (index != -1) {
      count++;
      index = inputString.indexOf(targetChar, index + 1);
    }

    System.out.println(
        "The character '" + targetChar + "' appears " + count + " times.");



    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= 5; j++) {
    // System.out.print(i * j + " ");
    // }
    // System.out.println();
    // }



    // Exercise 2
    // Print Vowels in a String

    // Objective: Practice for-loop, charAt() , if-else, and String manipulation
    // Task: Write a program that takes a string input from the user
    // and prints all the vowels (a, e, i, o, u) present in the string using a for-loop
    // and if-else. Ensure both uppercase and lowercase
    // vowels are considered.

    // Example: Input string: "Java Programming". Output: a a o a i

    String inpuString2 = "Java Programming";

    for (int i = 0; i < inpuString2.length(); i++) { // 幫我地重覆做野
      char ch = inpuString2.charAt(i); // String 尋找目標
      if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
          || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // 條件
        System.out.print(ch + " ");
      }
    }
    System.out.println();

    // System.out.print(""); // without ln ,print in same line
    // Approach 2
    char[] vowels =
        new char[] {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
    System.out.println("Approach 2 : ");
    for (int i = 0; i < inpuString2.length(); i++) {
      for (int j = 0; j < vowels.length; j++) {
        if (inpuString2.charAt(i) == vowels[j]) {
          System.out.print(inpuString2.charAt(i) + " ");
        }
      }
    }
    System.out.println();

    // Approach 3
    System.out.println("Approach 3 : ");
    String vowelsStr = "aeiou";
    for (int i = 0; i < inpuString2.length(); i++) {
      for (int j = 0; j < vowelsStr.length(); j++) {
        if (inpuString2.charAt(i) == vowelsStr.charAt(j)
            || inpuString2.charAt(i) == vowelsStr.toUpperCase().charAt(j)) {
          System.out.print(inpuString2.charAt(i) + " ");
        }
      }
    }
    System.out.println();
    System.out.println();
    System.out.println();

    // Exercise 3
    String inpuString3 = "I am a boy.";
    // substring()
    // target : am
    System.out.println("1,3 " + inpuString3.substring(1, 3)); // 1,3
    System.out.println("2,4 " + inpuString3.substring(2, 4));// 2,4
    "".trim(); // cut走頭尾既space


    // Exercise 4
    // charAt() , indexOf()
    String inpuString4 = "Java , Python , javaScript, ,typeScript";
    char target = 'a';

    // example using charAt() :
    for (int i = 0; i < inpuString4.length(); i++) {
      if (inpuString4.charAt(i) == target)
        System.out.println("charAt() : " + i);
    }

    // example using indexOf() : (find the first occur index , can use indexOf())
    System.out.println("indexOf() : " + inpuString4.indexOf(target));

    // Exercise 5 : Print Multiplication Table
    // Nested Loop
    // 1 2 3 4 5
    // 2 4 6 8 10
    // 3 6 9 12 15
    // 4 8 12 16 20
    // 5 10 15 20 25
    System.out.println("Exercise 5 : ");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print(i * j + " ");
        // i = 1 , j =1 => 1 ,
        // i = 1, j = 2 => 2 ,
        // i = 1, j = 3 => 3 ,
        // i = 1, j = 4 => 4 ,
        // i = 1, j = 5 => 5 ,
        // i = 2, j = 1 => 2 ,
        // i = 2, j = 2 => 4 ,
        // ....
        // i = 5 , j = 4 => 20
        // i = 5 , j = 5 => 25
      }
      System.out.println(); // outside of the inner loop
    }
    // Exercise 6
    int[] intArr = new int[4]; // 0 ,1,2,3
    int a = 1;
    int b = 3;
    int c = 5;
    int d = 7;
    intArr[0] = a;
    intArr[1] = b;
    intArr[2] = c;
    intArr[3] = d;
    System.out.println("print Array " + intArr); // [I@5c647e05
    System.out.println("print Array " + Arrays.toString(intArr)); // import java.util.Arrays;

    for (int i = 0; i < intArr.length; i++) { // no () , not like String.length()
      System.out.println("looping array : " + intArr[i]); // use for-loop to print element
    }

    // String[] strArr = {"ele1", "ele2"}; // not suggest
    // String[] strArr = new String[] {"ele1", "ele2"}; Approach 1 : assign element when new Array
    // String[] strArr = new String[3]; Approach 2: define the length of the Array

    // Exercise 7 : put the arr2 element into arr1
    String[] arr1 = new String[4];
    String[] arr2 = new String[] {"a", "b", "c", "d"};
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = arr2[i];
    }
    System.out.println("Exercise 7.1 : " + Arrays.toString(arr1));

    // Exercise 7.2 , expect output : arr1 = [d,c,b,a]
    // length -i -1
    // arr1 [0] = arr2[3]
    // arr1 [1] = arr2[2]
    // arr1 [2] = arr2[1]
    // arr1 [3] = arr2[0]
    for (int i = 0; i < arr2.length; i++) {
      arr1[i] = arr2[arr2.length - i - 1];
      // when i = 0 , arr2[arr2.length - i - 1] = arr2[4 - 0 - 1] = arr2[3]
      // when i =1 , arr2 [4-1-1] = arr2[2]
      // when i =2 , arr2 [4-2-1] = arr2[1]
      // when i =3 , arr2 [4-3-1] = arr2[0]
    }
    System.out.println("Exercise 7.2 : " + Arrays.toString(arr1));

    // Exercise 8
    String[] arr3 = new String[] {"abc你好", "def+_{}}{:>}", "ghi987", "xyzabc"};
    // arr3[0] is type of String , so that we can use String method
    System.out.println("Exercise 8 : " + arr3[0].charAt(0));

    // Exercise 9
    // expect output : a b c d e f i j k x y z
    String[] arr4 = new String[] {"abc", "def", "ijk", "xyz"};
    for (int i = 0; i < arr4.length; i++) {
      String str = arr4[i];
      // for (int j = 0; j < str.length(); j++) { << Approach 1
      for (int j = 0; j < arr4[i].length(); j++) { // << Approach 2
        System.out.println(" Exercise 9 : " + arr4[i].charAt(j));
      }
    }

    // a b c
    // d e f
    for (int i = 0; i < arr4.length; i++) {
      System.out.println(arr4[i]);
    }

    // Exercise 10
    String[] arr5 = new String[] {"abc", "def", "ijk", "xyz"};
    // swap , expect output : "xyz" , "ijk" , "def","abc"
    // seems like Exercise 7
    // ** can we swap without new an Array ? **
    // 24/10 開估
    String[] arr6 = new String[arr5.length];
    for (int i = 0; i < arr5.length; i++) {
      arr6[i] = arr5[arr5.length - i - 1];
    }
    System.out.println("Exercise 10 : " + Arrays.toString(arr6));

    // Approach 2 of Exercise 10
    for (int i = 0; i < arr5.length / 2; i++) {
      String temp = arr5[i];
      arr5[i] = arr5[arr5.length - i - 1];
      arr5[arr5.length - i - 1] = temp;
    }
    System.out.println("Approach 2 of Exercise 10 : " + Arrays.toString(arr5));
  }
}
