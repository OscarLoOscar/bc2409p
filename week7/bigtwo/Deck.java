package week7.bigtwo;

public class Deck implements CardOperations {
  private Card[] cards;

  public Deck() {
    this.cards = new Card[52]; //
    int idx = 0;
    // for-each
    for (char suit : Card.SUITS) { // suit
      for (char rank : Card.RANKS) { // rank
        this.cards[idx] = new Card(rank, suit);
        idx++;
      }
    }
  }

  public int size() {
    return this.cards.length;
  }

  // Instance method, deck object to control this card[] object
  @Override
  public void shuffle() {
    // 0 - 25 first half
    // 26 - 51 second half
    int half = this.cards.length / 2; // 52 / 2 = 26
    // Local Variable
    Card[] newCards = new Card[this.cards.length];
    int idx = 0;
    for (int i = 0; i < this.cards.length / 2; i++) {
      newCards[idx++] = this.cards[i]; // 0 1 ... 25
      newCards[idx++] = this.cards[i + half]; // 26 27 ... 51
    }
    this.cards = newCards;

  }


  @Override
  public String toString() {
    String value = "Deck[cards=";
    for (Card card : this.cards) {
      value += card.toString() + ",";
    }
    value = value.substring(0, value.length() - 1) + "]"; // return new string object
    return value;
  }

  @Override
  public void wash() {
    Deck freshDeck = new Deck();
    freshDeck.shuffle();
    this.cards = freshDeck.cards;
  }

  public static void main(String[] args) {
    Deck deck = new Deck(); // empty constructor -> 52 cards
    // System.out.println(deck); // print 52 cards

    System.out.println(deck.size()); // 52
    // System.out.println("before : " + deck); // before shuffle
    deck.shuffle();
    // System.out.println("after : " + deck); // after shuffle
    deck.wash();
    System.out.println("after wash : " + deck);
  }
}
