package APIE.shape;

public class Rectangle extends Shape{

  @Override
  void draw() {
    System.out.println("Drawing a Rectangle.");
  }

  @Override
  void color(){
    System.out.println("This Rectangle has a color.");
  }
  
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.color();//This Shape has a color.
    //after Override , print : This Rectangle has a color.
  }
  
}
