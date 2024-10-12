public class NestedLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) { // i = 0,1,2,3,4
      for (int j = 0; j < 5; j++) { // j = 0,1,2,3,4
        // System.out.println(" i : " + i + ", j : " + j);
      }
    }

    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0)
        continue; // skip
      if (i > 7) // 8 , 9 , 10
        break;
      // System.out.println(i);
    }

    // for (byte i = 0; i < 128; i++) { // byte -127 to 128
    // System.out.println(i);
    // }

    for (int i = 0; i < 5; i++) {
      System.out.print("*");
    }
    System.out.println("");

    // ***** -> i = 0
    // **** -> i = 1
    // *** -> i = 2
    // ** -> i = 3
    // * -> i = 4
    // use Nested Loop

    // 19/10 開估

    // Must
    // primitive
    // String
    // String method : length() , substring() , charAt(), equals() , indexOf()

    String str1 = "abc";
    System.out.println("substring A : " + str1.substring(0));// abc
    System.out.println("substring B : " + str1.substring(1));// bc
    System.out.println("substring C : " + str1.substring(0, 2)); // ab , endIndex - 1
    System.out.println("substring D : " + str1.substring(1, 3)); // bc ,endIndex - 1

    String str2 = str1.substring(1); // bc
    String str3 = str1.substring(1, 3); // bc
    System.out.println("equals : " + str2.equals(str3)); // check value
    //System.out.println("don't do that  : " + str2 == str3);

    // if(condition is true ){ // 括號後面無 ;
    // do something
    // }

    // Optional
    // for-loop -> for(int i = 0 ; i < 100 ; i++){ //括號後面無 ;
    // }
    // Nested-loop

  }
}
