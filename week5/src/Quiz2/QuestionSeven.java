package Quiz2;

public class QuestionSeven {
  public static class Simple {
    int x;
    double y;
    String z;

    void add(double c, double d) {
      this.y = c + d + 1.0;
    }

    void add(int a, int b) {
      this.x = a + b;
    }

    void add(String e, String f) {
      this.z = e + f;
    }

    public static void main(String args[]) {
      Simple simple = new Simple();
      simple.add(2, 2); // simple.x -> 4
      simple.add(3.2d, 3.2d); // simple.y -> 7.4
      simple.add("5", "3.2"); // simply.z -> "53.2"
      System.out.println(simple.x + " , " + simple.y + " , " + simple.z);
    }
  }
}
