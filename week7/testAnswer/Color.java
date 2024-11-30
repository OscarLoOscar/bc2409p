package week7.testAnswer;

public enum Color {
  // Question 4
  RED(1), YELLOW(2), BLACK(3);

  static int counter = 0; // !!!
  int value;
    
  // Constructor goes first or static variable ?
  Color(int i) {
    this.value = i;
    counter++;
  }
//Cannot refer to the static enum field Color.counter within an initializer

public class Quiz2Q8 {
  public static void main(String[] args) { 
    System.out.println(Color.counter);
  }
}
/**
What is the output?
A: Compile error, Cannot refer to the static enum field Color.counter within an initializer
B: 1
C: 3
D: 0
E: Compile error, static field is NOT allowed in enum class
*/
}
