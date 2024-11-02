package DemoClass;
import java.util.Arrays;

public class Library {
    // attribute
    private String address;
    private Book[] books;

    public void setBookList(Book[] books) {
        this.books = books;
    }

    public Book[] getBookList() {
        return this.books;
    }

    public String toString() {
        return Arrays.toString(this.books);
    }

    public static void main(String[] args) throws Exception {
        Book book1 = new Book();
        System.out.println(book1.getBookName()); // String default null
        book1.setBookName("Harry Potter");
        System.out.println("after setter  , BookName : " + book1.getBookName());

        Book book2 = new Book();
        book2.setBookName("Harry Potter");

        // Approach 1
        Book[] bookList = new Book[] {book1, book2};
        // Approach 2
        // Book[] bookList2 = new Book[10];
        // bookList2[1] = book1;
        // bookList2[5] = book2;

        // System.out.println("bookList2 : " + Arrays.toString(bookList2));

        Library library1 = new Library();
        library1.setBookList(bookList);
        System.out.println(Arrays.toString(library1.getBookList()));

        // step 1 : without using Arrays.toString() : [LDemoClass.Book;@6b95977
        // step 2 : using Arrays.toString() : DemoClass.Book@6b95977, DemoClass.Book@7e9e5f8a]
        // step 3 : create a method named 'toString()'' in class Book
        // step 4 : result :[Harry Potternullnull, Harry Potternullnull]
        // step 5 : refactor toString()
        // step 6 : [name : Harry Potter , author : null , price : null, name : Harry Potter , author : null , price : null]

        System.out.println("library1 : " + library1);// library1 : Library@33909752

    }
}
