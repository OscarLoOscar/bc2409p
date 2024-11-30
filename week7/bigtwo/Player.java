package week7.bigtwo;

public class Player {
  private static Integer IdCounter;

  private int id;
  private String name;
  private Card[] card;

  public Player(String name) {
    ++IdCounter;
    this.id = IdCounter;
    this.name = name;
    this.card = new Card[13];
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Card[] getCard() {
    return this.card;
  }
}
