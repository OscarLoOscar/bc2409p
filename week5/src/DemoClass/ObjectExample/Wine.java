package DemoClass.ObjectExample;

import java.math.BigDecimal;

public class Wine {
  private String type;
  private double price;
  private String country;
  private int year;

  public Wine(String type, double price, String country, int year) {
    this.type = type;
    this.price = price;
    this.country = country;
    this.year = year;
  }

  public Wine(String type, double price, int year) {
    this.type = type;
    this.price = price;
    this.country = null;
    this.year = year;
  }

  public String getType() {
    return this.type;
  }

  public String getCountry() {
    return this.country;
  }

  public double getPrice() {
    return this.price;
  }

  public int getYear() {
    return this.year;
  }

  public String toString() {
    return "[ type : " + this.type + //
        ", price : " + this.price + //
        ", country : " + this.country + //
        ", year : " + this.year + //
        "]";
  }

  public static void main(String[] args) {
    Wine lafite = new Wine("Red", 10000.0, "France", 2011);
    System.out.println(lafite);
    // without toString() -> DemoClass.ObjectExample.Wine@251a69d7
    System.out.println(lafite.getPrice());

    Wine montrachet = new Wine("White", 9500.0, "France", 2012);
    System.out.println(montrachet);

    Wine[] wineList = new Wine[] {lafite, montrachet};
    double total = 0;

    // we don't use BigDecimal b1 = new BigDecimal(wineList[0].getPrice());
    // use BigDecimal.valueOf
    BigDecimal price = BigDecimal.valueOf(wineList[0].getPrice());
    // same as don't use new String();
    // we use String.valueOf();

    // Approach 1
    Wine itemA = wineList[0];
    double itemAprice = itemA.getPrice();
    BigDecimal convertItemAPrice = BigDecimal.valueOf(itemAprice);

    // Approach 2
    BigDecimal convertItemBPrice = BigDecimal.valueOf(wineList[1].getPrice());
    // BigDecimal + BigDecimal
    total = convertItemAPrice.add(convertItemBPrice).doubleValue();
    System.out.println("hard code count total : $" + total);

    total = 0;
    for (int i = 0; i < wineList.length - 1; i++) {
      BigDecimal result = BigDecimal.ZERO;
      result = BigDecimal.valueOf(wineList[i].getPrice())//
          .add(BigDecimal.valueOf(wineList[i + 1].getPrice()));
      total = result.doubleValue();
    }
    System.out.println("count total by using for-loop : $" + total);


    Wine prosecco = new Wine("sparkling", 200, "Italy", 2023);
    Wine[] wineList2 = new Wine[] {lafite, montrachet, prosecco};
    // count the number occur of "France"
    int count = 0;
    for (int i = 0; i < wineList2.length; i++) {
      // don't do this: wineList2[i].getCountry().equals("France")
      if ("France".equals(wineList2[i].getCountry())) {
        count++;
      }
    }
    System.out.println("counting of country : " + count);

    // NullPointerException example :
    Wine prosecco2 = new Wine("sparkling", 200, 2023);
    System.out.println("prosecco2.getCountry() : " + prosecco2.getCountry());
    // System.out.println(prosecco2.getCountry().equals("France"));//java.lang.NullPointerException
    // ensure String.equals() is valid
    System.out.println("France".equals(prosecco2.getCountry()));

  }

}
