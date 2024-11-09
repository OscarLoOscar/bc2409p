package Quiz2;

public class QuestionTwo {

  public static class Password {
    public static int counter = 2;
    private String password;

    public Password(String x) {
      this.password = x;
      counter++;
    }

    public void setPasswrod(String password) {
      this.password = password;
      counter--;
    }
  }

  public static void main(String[] args) {
    Password p1 = new Password("ABC");
    Password p2 = new Password("ABC");
    Password p3 = new Password("BCD");
    p2.setPasswrod("password");
    Password.counter *= Password.counter;

    System.out.println(Password.counter);

  }
}
