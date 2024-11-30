package week7.testAnswer;

public class Quiz {
  interface Secret {
    void show();

    void hide();
  }

  class Password implements Secret {
    private String password;

    Password(String x) {
      this.password = x;
    }

    @Override
    public void show() {
      System.out.println("123");
    }

    @Override
    public void hide() {

    }
  }

  public static void main(String[] args) {
    Password p1 = new Password("Start");
    p1.show();
  }

}
