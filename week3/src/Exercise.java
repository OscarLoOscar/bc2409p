public class Exercise {
  /*
   * use for-loop reversed the String
   * 
   */
  public static void main(String[] args) {
    String original = "Programming";
    String reversed = "";
    // expect output = gnimmargorP
    // charAt()
    // String + char = String
    // start at i = 0 ? i = original.length()-1 ?
    for (int i = original.length() - 1; i >= 0; i--) {
      char ch = original.charAt(i);
      reversed += ch;
      // round 1 : "" + g = g
      // round 2 : g + n = gn
      // round 3 : gn + i = gni
      // round 4 : gni + m = gnim
      // looping...
    }
    System.out.println("original String : " + original);
    System.out.println("reversed String : " + reversed);
  }
}
