package DemoClass;
// String str1 = book2.name;//private , The field Book.name is not visible

public class Book {
  private String name;
  private String author;
  private Double price;

  // getter , setter -> 查詢 ，設定
  public String getBookName() {
    return this.name;
  }

  public String getAuthor() {
    return this.author;
  }

  public Double getPrice() {
    return this.price;
  }

  // return type / method signature / input parameter
  public void setBookName(String BookName) { // use void for return type , not 'return' keywords
    this.name = BookName;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String toString() {
    return "name : " + this.name + //
        " , author : " + this.author + //
        " , price : " + this.price;
  }

  // public static void main(String[] args) {
  // Book book1 = new Book();
  // book1.getBookName();
  // }
}
// Wrapper class
// Object - need create , add attribute , call Object
// private public
