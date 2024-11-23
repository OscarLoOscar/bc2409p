package APIE.Bank;

public class Bank {
  public static void main(String[] args) {
    Account a1 = new PriorityClass("firstName", "lastName", 1000.0);
    System.out.println(a1);
    // without @Override toString() -> object reference only : APIE.Bank.PriorityClass@6b95977
    // after @Override toString() -> [Account Number : nullClient Name : firstName lastNameAccount Type : PriorityClass]
    // Object o1 = new Object();
    // public String toString() {
    // return getClass().getName() + "@" + Integer.toHexString(hashCode());
    // }
    // APIE.Bank.PriorityClass@6b95977

    System.out.println("accountType : " + a1.accountType());
    a1.creditAccount(1000.0);
    a1.debitAccount(999.0);
    System.out.println(a1.getBalance()); // 1001.0
    a1.debitAccount(1002.0);// Debit cannot proceed.
    // 23 - 11 - 2024
    // concept of Polymorphism
    Account a2 = new StandardClass("StandardName", "StandardLastName", 10000.0,
        Long.parseLong("0"));
    System.out.println(a2);// [Account Number : null , Client Name : StandardName StandardLastName , Account Type : StandardClass] , Coupon Number : 0
    StandardClass a4 = (StandardClass) a2;
   // a2.setCoupon(Long.parseLong("10"));// The method setCoupon(long) is undefined for the type Account
   // a4.setCoupon(Long.parseLong("10"));
   
    StandardClass a3 = new StandardClass("StandardName", "StandardLastName",
        10000.0, Long.parseLong("0"));
    System.out.println(a3);// [Account Number : null , Client Name : StandardName StandardLastName , Account Type : StandardClass] , Coupon Number : 0
    a3.setCoupon(Long.parseLong("10"));// The method setCoupon(long) is undefined for the type Account

  }
}
