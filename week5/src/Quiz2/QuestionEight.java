package Quiz2;

public class QuestionEight {
  public static class SuperBuilder {
    public static void main(String[] args) {
      StringBuilder s = new StringBuilder("abc");
      boolean bool = s.append("def").startsWith("def"); // updated 29 Jul 23
      System.out.println(bool);
    }
  }
}
