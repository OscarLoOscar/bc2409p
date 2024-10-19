public class NestedLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 5 - i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    // ***** -> i = 0 , j =5
    // **** -> i = 1 , j = 4
    // *** -> i = 2 , j =3
    // ** -> i = 3 ,j =2
    // * -> i = 4 , j = 1
    // use Nested Loop

    // 19/10 開估
  }
}
