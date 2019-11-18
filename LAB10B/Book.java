
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private String author;
    private int yearPublished;
    private double bookPriceInCAD;
    

    /**
     * Constructor for objects of class Book
     */
    public Book(String newTitle, String newAuthor, int newYearPublished, double newBookPriceInCAD)
    {
        setTitle(newTitle);
        setAuthor(newAuthor);
        setYearPublished(newYearPublished);
        setBookPriceInCAD(newBookPriceInCAD);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * method getAuthor
     */
    public String getAuthor(){
        return author;
    }
    
    /**
     * method getYearPublished
     */
    public int getYearPublished(){
        return yearPublished;
    }
    
    /**
     * method getBookPriceInCAD
     */
    public double getBookPriceInCAD(){
     return bookPriceInCAD;   
    }
    
    //Setters
    
    /**
     * method setTtitle
     * @param newTitle
     */
    public void setTitle(String newTitle){
        if(newTitle != null && !newTitle.isEmpty()){
            title = newTitle;
        }else{
         throw new IllegalArgumentException("title cannot be null or empty");   
        }
    }
    
    /**
     * method setAuthor
     * @param newAuthor
     */
    public void setAuthor(String newAuthor){
        if(newAuthor != null && !newAuthor.isEmpty()){
            author = newAuthor;
        }else{
         throw new IllegalArgumentException("author cannot be null or empty");   
        }
    }
    
    /**
     * method setYearPublished
     * @param newYearPublished
     */
    public void setYearPublished(int newYearPublished){
         if(newYearPublished >= 0){
            yearPublished = newYearPublished;
        }else{
         throw new IllegalArgumentException("year published cannot be negative");   
        }
    }
    
    /**
     * method setBookPriceInCAD
     * @param newBookPriceInCAD
     */
    public void setBookPriceInCAD(double newBookPriceInCAD){
        if(newBookPriceInCAD >= 0){
            bookPriceInCAD = newBookPriceInCAD;
        }else{
            throw new IllegalArgumentException("ybook price cannot be negative");
        }
    }
    
    /**
     * method displayDetails
     */
    public void displayDetails(){
        System.out.println("title :" + getTitle());
        System.out.println("author :" + getAuthor());
        System.out.println("year published :" + getYearPublished());
        System.out.println("book price in CAD :" + getBookPriceInCAD());
    }
}
