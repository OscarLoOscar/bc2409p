public class DemoForLoop {
  public static void main(String[] args) {
    // Approach 1
    for (int i = 0; i < 11; i++) { // 0 1 2 3 4 5 6 7 8 9 10 -> 11 times
      if (i % 2 == 1) {
        System.out.println("Approach 1 : " + i);
      }
    }
    System.out.println();
    // Approach 2
    for (int i = 10; i > 0; i--) {
      if (i % 2 == 1) {
        System.out.println("Approach 2 : " + i);
      }
    }
    //
    String str1 = "ABCDEFGHIJKLM";
    char ch1 = 'F';
    int index = 0;
    System.out.println("str1.length() " + str1.length());
    System.out.println("str1.charAt() " + str1.charAt(5));

    // find the index of 'F' within str1
    // Step 1 : i = 0
    // Step 2 : charAt(0)
    // Step 3: charAt(0) = A
    // condition : find 'F'
    // Step 4 : A !=F
    // i++ -> i+1
    // Step 5 : i=1
    // Step 6 : charAt(1)
    // Step 7: charAt(1) = B
    // i++ => i = 2
    // Step 8 : charAt(2)
    // Step 9: charAt(2) = C
    // keep looping
    // Step 11: i =5
    // Step 12 : charAt(5) = F
    // str1.charAt(5) == F
    // str1.charAt(i) == ch1
    // index = i
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) == ch1) {
        index = i;
        System.out.println("i : " + i);

      }
    }
    System.out.println("index : " + index);

    // Example : counting
    // 1 -100
    // how many numbers can be divided by 3 or divided by 4 ?
    int count = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 4 == 0) {
        count++;
        // count = count + 1
        // i += 1 ;
        // i = i+1;
        // eg : i *=2
        // i = i*2
        // += , -= ,*= , /= redeclare itself
        // i+=1 => i = i+1 , if case is add 1 , you can use i++ or ++i
        // i-=1 => i = i-1 , if case is subtract 1 , you can use i-- or --i
        // i*=2 => i = i*2
        // i/=2 => i = i/2
      }
    }
    System.out.println("result : " + count);

    // Example 2 :
    // 1 - 50
    // Find the total number , which sum all odd number and subtract all even number
    int total = 0;
    for (int i = 1; i < 51; i++) {
      // Approach 1
      if (i % 2 != 0) {
      total += i;
      } else { // if(i%2 == 0)
      total -= i;
      }

      // Approach 2
      // if (i % 2 != 0) {
      //   total += i;
      // }
      // if (i % 2 == 0)
      //   total -= i;
    }
    System.out.println("total = " + total);
  }
}
