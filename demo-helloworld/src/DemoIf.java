public class DemoIf {
  public static void main(String[] args) {
    System.out.println();
    char gender = 'M';
    // char gender2 = 'MC'; // wrong
    String gender3 = "M";
    String gender4 = "MC";

    int age = 18;
    boolean isAdult = age >= 18;
    System.out.println("isAdult : " + isAdult);
    // == only use for primitive -> byte , short , int , long , float , double , boolean , char
    String str1 = new String("");
    String str2 = new String("");
    System.out.println();
    System.out.println("case 1 : " + str1.equals(str2));
    System.out.println("case 2 : " + (str1 == str2));
    // 10/10/2024s
    System.out.println();
    boolean isMale = gender == 'M';
    System.out.println("isMale : " + isMale);
    // !=
    if (!isMale && isAdult) {
      System.out.println("!isMale && isAdult");
    } else {
      System.out.println("isMale && isAdult");
    }

    String str3 = "str3";
    String str4 = "str3";

    if (str3.equals(str4)) {
      System.out.println("we are equals");
    } else {

    }

    if (str3.equals(str4)) {
      System.out.println("we are equals");
    }
    String str5 = "happy";
    String str6 = "happy";
    String str7 = "new";
    String str8 = "year";

    str3.compareTo(str4); // result will have 3 cases : + / - / 0
    // String.compareTo()
    System.out.println("case 5 : " + str5.compareTo(str5));
    System.out.println("case 6 : " + str5.compareTo(str6));
    System.out.println("case 7 : " + str5.compareTo(str7));// -6 -> why ?
    System.out.println("case 8 : " + str5.compareTo(str8));// -17 -> why?
    System.out.println("case 9 : " + str8.compareTo(str5));// 17 -> why?

    // ASCII
    System.out.println((char) 48);
    System.out.println((char) 65);
    System.out.println((char) 97);

    // substring(int beginIndex)
    // substring(int beginIndex, int endIndex)
    String str9 = "Diamond Hill";
    System.out.println("case 1 : " + str9.substring(5));// output : nd Hill
    System.out.println("Case 2 : " + str9.substring(3, 10));// output : mond Hi -> endIndex - 1

    // chain method
    System.out.println("case 3 : " + str9.substring(3, 10).equals("mond"));
    System.out.println("case 4 :  " + str9.substring(3, 10).equals("mond Hi"));
    System.out.println();
    System.out.println("case 5 :  " + (str9.charAt(3) == 'C'));// str9.charAt(3)='m'
    System.out.println("case 6 :  " + (str9.charAt(3) == 'm'));
    System.out.println("case 7 :  " + (str9.charAt(3) == 'M'));
    System.out.println();
    String str10 = "";
    String str11 = " ";
    System.out.println("str10.isEmpty() : " + str10.isEmpty());
    System.out.println("str11.isEmpty() : " + str11.isEmpty());
    System.out.println();
    String str12 = ".";
    System.out.println("str10.isBlank() : " + str10.isBlank());
    System.out.println("str11.isBlank() : " + str11.isBlank());
    System.out.println("str12.isBlank() : " + str12.isBlank());

    String password = " ";
    if (password.trim().isBlank()) {
      System.out.println("password is blank");
    }
    System.out.println();
    str9 = "Diamond Hill";
    // startsWith(String prefix)
    System.out.println("startsWith case 1 : " + str9.startsWith("D"));
    // startsWith(String prefix, int toffset)
    System.out.println("startsWith case 2 : " + str9.startsWith("D", 0));// true
    System.out.println("startsWith case 3 : " + str9.startsWith("D", 1));// false
    // endsWith
    System.out.println("endsWith : " + str9.endsWith("D"));
    System.out.println("endsWith : " + str9.endsWith("l"));
    System.out.println();
    // Condition
    char grade = 'B';

    switch (grade) {
      case 'A':
        System.out.println("grade is A ");
        break;
      case 'B':
        System.out.println("grade is B ");
        break;
      case 'C':
        System.out.println("grade is C ");
        break;
      default:
        System.out.println("grade is D ");
        break;
    }

    if (grade == 'A')
      System.out.println("grade is A ");
    else if (grade == 'B')
      System.out.println("grade is B ");
    else if (grade == 'C')
      System.out.println("grade is C ");
    else
      System.out.println("grade is D ");

    // && 優先次序 先過 ||
    if (grade == 'A' || grade == 'B' || grade == 'C')
      System.out.println("Passing");
  }
}
