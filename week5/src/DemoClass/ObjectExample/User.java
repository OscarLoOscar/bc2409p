package DemoClass.ObjectExample;

public class User {
  private static int code = 0;

  // attribute
  private String userName;
  private String lastName;
  private String firstName;
  // private String fullname;
  private String email;
  private Character sex; // 'M' , 'F'
  private int age;
  private String address;
  private int memberID;
  private Address address2;

  // constructor
  public User(String userName, String fieldB) {
    this.userName = userName;
    this.email = fieldB;
    code++;
    this.memberID = code;
  }

  // setter
  public void lastName(String lastName) {
    this.lastName = lastName;
  }

  // setter
  public void firstName(String firstName) {
    this.firstName = firstName;
  }

  // setter
  public void setAddress(String address) {
    this.address = address;
  }

  // getter
  public String getUserName() {
    return this.userName;
  }

  // getter
  public String getEmail() {
    return this.email;
  }

  // getter
  public int getMemberID() {
    return this.memberID;
  }

  // getter
  public String getAddress() {
    return this.address;
  }

  // instance method
  public String fullname() {
    return this.lastName.concat(this.firstName);
  }

  public static void main(String[] args) {
    User user1 = new User("ABC", "ABC@test.com");
    user1.firstName("abc");
    user1.lastName("xyz");
    System.out.println("fullname : " + user1.fullname());
    System.out.println("user name : " + user1.getUserName());
    System.out.println("email : " + user1.getEmail());

    String[] addressList = new String[] {"Hong Kong Island", "Kowloon", "NT"};

    user1.setAddress(addressList[0]);
    System.out.println("Address : " + user1.getAddress());
    System.out.println("user1's memberID : " + user1.getMemberID());

    User user2 = new User("IJK", "IJK@test.com");
    System.out.println("user2's memberID : " + user2.getMemberID());
  }
}
