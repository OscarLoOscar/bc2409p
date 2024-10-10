public class DemoString2 {
  public static void main(String[] args) {


    String str1 = "";
    String str2 = "oscar";
    String str3 = "oscar@gmail.com";
    String str4 = "你好";
    String str5 = " ";

    str1.equals(str2); // returnType method signature , () -> input parameter
    // returnType methodSignature(inputParameter)

    System.out.println("str1.length() : " + str1.length()); // 0
    System.out.println("str5.length() : " + str5.length()); // 1

    str3.charAt(0); // char & String , '' ,""
    System.out.println("str3.charAt(0) : " + str3.charAt(0));
    // count number , start from 0 ->
    // find the last char
    int str3Length = str3.length();
    // case 1
    System.out.println(str3.charAt(str3Length - 1));
    // case 2
    System.out.println(str3.charAt(str3.length() - 1));
    // error case
    // System.out.println(str3.charAt(str3Length));// StringIndexOutOfBoundsException

    // trim() -> space remove
    String str6 = "     Bootcamp       ";
    System.out.println("before : " + str6);
    System.out.println("after : " + str6.trim());
    String str7 = "     Bootcamp       abc";
    System.out.println("before : " + str7);
    System.out.println("after : " + str7.trim());

    // replace(char oldChar ,char newChar)
    String str8 = "       Diamond Hill       ";
    System.out.println(str8);
    System.out.println(str8.replace('D', 'd').trim());


    // toLowerCase()
    String str9 = "ABCDEFGHIJKLM";
    System.out.println(str9);
    System.out.println("result of toLowerCase" + str9.toLowerCase());
    String str10 = "AbCdEf";
    System.out.println("str10.toLowerCase() : " + str10.toLowerCase());

    System.out
        .println("str10.toUpperCase() : " + str10.toLowerCase().toUpperCase());

    String str11 = "happy";
    String str12 = "new year";
    System.out.println(str11 + str12);
    //concat()
    System.out.println("concat 1: " +str11.concat(str12));
    System.out.println("concat 2: " +str11.concat(" ").concat(str12));
    System.out.println("concat 3: " +str11.concat(" ").concat(str12).replace('y', 'Y'));

    
  }
}
