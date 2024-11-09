package Quiz2;

public class QuestionSix {
  public static class Password {
    private String password;

    public static String concat(String x) {
      return x;
    }

    public Password(String x) {
      this.password = x;
    }

    public String concat(String x, String y) {
      return y.toLowerCase().toUpperCase();
    }
  }
  public static class Quiz {
    public static void main(String[] args) {
      int counter = 0;
      Password p1 = new Password("Start ");
      System.out.println(p1.concat("XYZ", "abc"));
    }
  }
}
