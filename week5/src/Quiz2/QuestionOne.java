package Quiz2;

public class QuestionOne {
  public static class Password {
    private String password;

    public Password(String x) {
      this.password = x;
    }

    public String getPassword() {
      return this.password;
    }

  }

  public static void main(String[] args) {
    Password p1 = new Password("ABC");
    Password p2 = new Password("ABC");
    Password p3 = new Password("BCD");
    String s1 = new String("abc");
    System.out.println(p1 == p2);
    System.out.println(p2 == p3);
    System.out.println(p1.getPassword().equals(p2.getPassword()));
    System.out.println("abc".equals(s1));
  }
}
