package week7.testAnswer;

public class Question6 {
  class Animal {
    void eat() {
      System.out.println("[Animal] eating something ...");
    }
  }

  class Cow extends Animal {
    void eat(String food) {
      System.out.println("[Cow] eating " + food + " ...");
    }
  }

  class AnimalFarm {

    public static void main(String[] args) {
       Animal cow = new Cow();
      //Cow cow = new Cow();
      //cow.eat
      cow.eat("something");

      Animal cow2 = new Animal();
      cow2.eat("something");
    }
  }
  /**
   * What is the result or output? A: [Cow] eating something ... [Cow] eating something ... B: [Cow] eating something ... [Animal] eating something ... C: Compile error, both line 18 & line 21 have
   * error D: Compile error, both line 21 have error E: Compile error, both line 18 have error
   */
}
