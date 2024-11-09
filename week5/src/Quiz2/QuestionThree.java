package Quiz2;

public class QuestionThree {
  public static class Quiz {
    static int counter = 10;

    public static void main(String[] args) {
      for (byte i = 0; i < 128; i--) {
        counter++;
      }
      System.out.println(counter);
    }
  }
}
