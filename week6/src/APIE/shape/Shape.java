package APIE.shape;

//Cannot instantiate the type Shape
public abstract class Shape {
  abstract void draw();

  void color() {
    System.out.println("This Shape has a color.");
  }

}