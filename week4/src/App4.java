public class App4 {
  public static void main(String[] args) {

    //  * 0 , 1
    // *** 1 , 3 , i%2 !=0 i+2
    //  * 2 , 1, i%2 ==0
    // for (int i = 0; i < 3; i++) {
    // if (i % 2 != 0) {
    // System.out.println("***");
    // } else {
    // System.out.println(" *");
    // }
    // }
    //
    for (int i = 0; i < 3; i++) {
      System.out.println("0");
      for (int j = i; j >=0; j--) {
          System.out.print("*");
        }
      }

    }
    //                   *
    //  ********************
    //                   *

  //    *
  //   ***
  //  *****
  //   ***
  //    *

  
  }
