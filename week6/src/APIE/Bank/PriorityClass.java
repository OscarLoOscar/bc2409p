package APIE.Bank;

public class PriorityClass extends Account {

  public PriorityClass(String firstName, String lastName, double balance) {
    super(firstName ,lastName ,balance);
  }

  @Override
  public String accountType() {
    return "PriorityClass";
  }

}
