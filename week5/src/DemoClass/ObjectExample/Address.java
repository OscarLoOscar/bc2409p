package DemoClass.ObjectExample;

public class Address {
  int postcode;
  String streetName;
  String building;
  String floor;

  public String toString() {
    return this.streetName + this.building + this.floor;
  }

  public static void main(String[] args) {
    Address a1 = new Address();
    System.out.println(a1);
  }
}