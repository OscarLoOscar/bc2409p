package APIE.Bank;

import java.math.BigDecimal;

public abstract class Account {

  private Long accountNumber; // encapsulation
  private String firstName;// encapsulation
  private String lastName;// encapsulation
  // private String fullName;
  private Double balance;

  public Account(String firstName, String lastName, double balance) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
  }

  abstract String accountType();

  public Long getAccountNumber() {
    return this.accountNumber;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getFullName() {
    return this.firstName.concat(" ").concat(this.lastName);
  }

  public Double getBalance() {
    return this.balance;
  }

  public void creditAccount(double amount) {
    // BigDecimal
    this.balance = BigDecimal.valueOf(this.balance) // 避免精度損失 -> 用BigDecimal
        .add(BigDecimal.valueOf(amount)).doubleValue();
  }

  public boolean debitAccount(double amount) {
    if (amount > this.balance) {
      System.out.println("Debit cannot proceed.");
      return false;
    }

    this.balance = BigDecimal.valueOf(this.balance)
        .subtract(BigDecimal.valueOf(amount)).doubleValue();
    return true;
  }

  @Override
  public String toString() {
    return "[Account Number : " + this.accountNumber + //
        " , Client Name : " + this.getFullName() + //
        " , Account Type : " + this.accountType() + "]";
  }
}
