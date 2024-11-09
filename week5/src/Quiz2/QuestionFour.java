package Quiz2;

public class QuestionFour {
  public static class Password {
    private String password;

    public Password(String x) {
      this.password = x;
    }

    public String getPassword() {
      return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }

    public void append(Password password) {
      password.setPassword("XYZ");
      this.password = "BCD";
    }

  }
  public static class Quiz {
    public static void main(String[] args) {


      Password p1 = new Password("ABC");
      Password p2 = new Password("BCD");
      p1.append(p2);
      // p1 => this
      // append ->
      // p2.setPassword("XYZ");
      // p1.password ="BCD";
      System.out.println(p1.getPassword() + p2.getPassword());
    }
  }
}
