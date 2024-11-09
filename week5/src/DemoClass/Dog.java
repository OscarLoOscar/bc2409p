package DemoClass;

public class Dog {
  private String name;
  private int age;

  // Empty Constructor
  public Dog() {

  }

  // All Argument Constructor
  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Argument Constructor
  public Dog(String name) {
    this.name = name;
    this.age = 1;
  }

  // Argument Constructor
  public Dog(int age) {
    this.name = "null";
    // this.name = null;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    // before 9/11
    Dog d1 = new Dog();
    d1.setAge(5);
    d1.setName("ABC");

    Dog d2 = new Dog("BCD", 2);
    // System.out.println(d2.getAge() +" "+ d2.getName());

    Dog d3 = new Dog(10);
    System.out.println(d3.getName().toUpperCase()); // null.toUpperCase() -> Exception
  }
}
