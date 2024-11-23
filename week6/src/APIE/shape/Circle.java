package APIE.shape;

public class Circle extends Shape {

  @Override
  void draw() {
    System.out.println("Drawing a Circle.");
  }

  @Override
  void color(){
    System.out.println("This Circle has a color.");
  }

  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.draw();
    c1.color();
    // without Override : This Shape has a color.
    // When Override : This Circle has a color.
  }
}
