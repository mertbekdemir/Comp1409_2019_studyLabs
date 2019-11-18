
/**
 * Write a description of class BookStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class BookStore
{
    // instance variables - replace the example below with your own
    private String businessName;
    private ArrayList<Book> books;

    /**
     * First Constructor for objects of class BookStore
     */
    public BookStore()
    {
        businessName = "Book Store";
        books = new ArrayList<Book>();
    }

    /**
     * Second constructor for objects of class BookStore
     */
    public BookStore(String businessName){
        setBusinessName(businessName);
        books = new ArrayList<Book>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String getBusinessName()
    {
        return businessName;
    }

    /**
     * method getBooks
     */
    public ArrayList<Book> getBooks(){//how do we utilize this?
        return books;
    }

    /**
     * method setBusinessName
     */
    public void setBusinessName(String businessName){
        if(businessName != null && !businessName.isEmpty()){
            this.businessName = businessName;
        }else{
            throw new IllegalArgumentException("business name can't be null or empty");
        }
    }

    /**
     * method addBook
     */
    public void addBook(Book book){
        if(book != null){
            books.add(book);   
        }else{
            System.out.println("book can't be null");   
        }
    }

    /**
     * method displaySelectedBook
     * @param index to select the book
     */
    public void displaySelectedBook(int index){
        if(index >= 0 && index < books.size()){
            Book b1 = books.get(index);
            b1.displayDetails();
        }else{
            System.out.println("index is not valid");
        }
    }

    /**
     * method displayMatchingBook
     * @param bookTitle
     */
    public void displayMatchingBook(String bookTitle){
        if(bookTitle != null){
            for(Book book1 : books){

                if(book1.getTitle().equalsIgnoreCase(bookTitle)){
                    book1.displayDetails();
                }else{
                    System.out.println("no match");
              
            }
            }
        }
    }

    /**
     * method displayAllTheBooks
     */
    public void displayAllTheBooks(){
        for(Book book1 : books){
            book1.displayDetails();
        }
    }

    public static void main(String[] args){
        Book b1 = new Book("art of war", "lao tzu",1980,14.50);
        Book b2 = new Book("brave new world","aldous huxley",1970,21);
        Book b3 = new Book("1984","george orwell", 1985,26);
        BookStore bookList = new BookStore("Mert's bookstore"); // why can't I use books
        bookList.addBook(b1);
        bookList.addBook(b2);
        bookList.addBook(b3);
        bookList.displaySelectedBook(4);
        bookList.displaySelectedBook(2);
        bookList.displayMatchingBook("fake book");
        bookList.displayMatchingBook("brave new world");
        bookList.displayAllTheBooks();
    }
}
