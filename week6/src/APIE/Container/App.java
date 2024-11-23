package APIE.Container;

public class App {
  public static void main(String[] args) {
    Color[] colors =
       new Color[] {new Color("RED"), new Color("WHITE"), new Color("BLUE")};

   Bottle b1 = new Bottle();
   System.out.println(b1);
   // APIE.Container.Bottle@7344699f
   // so we need to @override toString()
   // after @Override toString()
   // [Model : null , capacity : null , Color ; null]
   // because we don't set the value into each attribute , so String and Wrapper Class Double default value is null

   b1.setColor(colors,new Color("rED"));// the color input not in Color List
   // after @override equals()
   // "RED" , "red" , "Red" , "rED"

   b1.setColor(colors,new Color("black"));//the color input not in Color List

   b1.setCapacity(1000.0);
   b1.setModel("XY");
   System.out.println(b1);// [Model : XY , capacity : 1000.0 , Color ; RED]'
 }
}
