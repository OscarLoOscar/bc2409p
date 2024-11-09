package DemoClass;

public class Dog {
  private String name;
  private int age;

  // Empty Constructor
  public Dog() {

  }

  // Arguement Constructor
  public Dog(String name, int age) {
    this.name = name;
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
    System.out.println(d2.getAge() +" "+ d2.getName());

  }
}
