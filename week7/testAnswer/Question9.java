package week7.testAnswer;

public class Question9 {
  interface Secret {
    String show();
  }

  static class Password implements Secret {
    private String password;

    @Override
    public String show() {
      System.out.print("123");
      System.out.print("***");
      return this.password;
    }

    Password(String x) {
      this.password = x;
    }
  }

  public static void main(String[] args) {
    Password p1 = new Password("Start");
    System.out.println(p1.show());
  }
}

