public class ExerciseDemoString2 {
  /*
   * 
   * Expect Result : 1. VENTURENIXLAB,
   * 
   * JAVA 2. venturenixlab, java
   * 
   * 3. V*NTUR*NIXLAB, JAVA!!!
   */
  public static void main(String[] args) {
    String str1 = "VenturenixLAB, Coding";
    System.out.println();
    String str2 = str1.replace("Coding", "JAVA");
    System.out.println("str2 :" + str2);
    System.out.println("str1 :" + str1);

    System.out
        .println("case1 : " + str1.toUpperCase().replace("Coding", "JAVA")); // step1 : toUpperCase() first , then replace()
    System.out
        .println("case2 : " + str1.replace("Coding", "JAVA").toUpperCase());

    System.out
        .println("case 3 : " + str1.toLowerCase().replace("coding", "java"));
    System.out
        .println("case 4 : " + str1.replace("Coding", "JAVA").toLowerCase());

        System.out.println("case 5 : " + str1.replace("Coding", "java").toUpperCase().replace("E", "*").concat("!!!"));
        System.out.println("case 6 : " + str1.replace("Coding", "java").toUpperCase().replace("E", "*")+ "!!!");

        System.out.println();



  }
}
