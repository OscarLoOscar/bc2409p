package APIE.Student;

public class Student extends Form {
  private String name;
  private Integer age;

  public Student() {}

  public Student(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  void homework() {
    System.out.println("Doing homework");
  }

  @Override
  void activity() {
    System.out.println("Student is running.");
  }

  @Override
  public String toString() {
    if (this.age == null) {
     // this.age = 100;
     // System.out.println("empty age");
    }
    return this.name + " , " + this.age;
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.activity();// Running , after @override : Student is running.
    s1.homework();
    System.out.println(s1.getName());
    s1.setName("TEST name");
    System.out.println(s1.getName());
    System.out.println(s1);// APIE.Student.Student@7344699f
    s1.setAge(10);
    System.out.println(s1.getAge());
    System.out.println(s1);

    Student s2 = new Student("student 2 ", 15);// The constructor Student(String, int) is undefined
    System.out.println(s2);

    Student s3 = new Student("student 3 ");
    System.out.println(s3);// student 3 , null
    s3.setAge(20);
    System.out.println(s3);// student 3 , 20
  }
}
