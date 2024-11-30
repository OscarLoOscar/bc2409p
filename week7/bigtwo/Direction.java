package week7.bigtwo;

// what is Enum ?

/**
 * 1. Each Constant is a Singleton
 * 
 * 2. Fixed Set of Constants
 * 
 * 3. Custom Properties and Methods
 * 
 * 4. Type-Safe (no need equals and hashCode)
 * 
 * 5. Enum Constructor private by default
 */

public enum Direction {
  // private String[] directions = {"east" , "south", "west", "north"};
  EAST(1, "TEST1"), //
  SOUTH(2, "TEST2"), //
  WEST(-1, "TEST3"), //
  NORTH(-2, "TEST4"),//
  ;

  private int direction;
  private String testAttribute;

  // why not public ? Illegal modifier for the enum constructor; only private is permitted.
  private Direction(int i) {
    this.direction = i;
  }

  private Direction(int i, String testAttribute) {
    this.direction = i;
    this.testAttribute = testAttribute;
  }

  public int getDirection() {
    return this.direction;
  }

  public String getTestAttribute() {
    return this.testAttribute;
  }

  public boolean isOpposite(Direction inputParam) {
    return this.getDirection() * inputParam.getDirection() == -1;
  }

  public String getDirectionDetails(Direction direction) {
    if (direction == null)
      return "Invalid Value";

    for (Direction dir : Direction.values()) {
      if (dir == direction) {
        return String.format("Direction: %s  , Value: %d , Attributes: %s", //
            dir.name(), dir.getDirection(), dir.getTestAttribute());
      }
    }
    return "Direction not found";

  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.getDirection());
    System.out.println(Direction.SOUTH.getDirection());
    System.out.println(Direction.WEST.getDirection());
    System.out.println(Direction.NORTH.getDirection());

    System.out.println(Direction.EAST.getTestAttribute());
    System.out.println(Direction.SOUTH.getTestAttribute());
    System.out.println(Direction.WEST.getTestAttribute());
    System.out.println(Direction.NORTH.getTestAttribute());

    System.out.println(Direction.EAST.isOpposite(Direction.WEST));// true
    System.out.println(Direction.EAST.isOpposite(Direction.NORTH));// false

    System.out.println(Direction.EAST == Direction.EAST);

    System.out.println(
        Direction.EAST.getDirection() == Direction.WEST.getDirection());

    System.out.println(
        Direction.EAST.getTestAttribute() == Direction.WEST.getTestAttribute());

    System.out.println(Direction.EAST.getTestAttribute()
        .equals(Direction.WEST.getTestAttribute()));

  }
}
