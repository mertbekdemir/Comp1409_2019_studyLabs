
/**
 * Write a description of class Cattery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Cattery
{
    // instance variables - replace the example below with your own
    private String catteryName;
    
    private ArrayList<Cat> cats;
    /**
     * Constructor for objects of class Cattery
     */
    public Cattery(String businessName)
    {
       cats = new ArrayList<Cat>();
       if(businessName != null && !businessName.isEmpty()){
           catteryName = businessName;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addCat(Cat newCat)
    {
        if(newCat != null){
        cats.add(newCat);
    }else{
     throw new IllegalArgumentException("cat cannot be null");   
    }
    }
    
    /**
     * method getCat
     */
    public void getCat(int index){
        if(index >= 0 && index < cats.size()){
            Cat c = cats.get(index);
            c.displayDetails();
            // System.out.println("Name :" + cats.get(index).getName());
            // System.out.println("Year of Birth :" + cats.get(index).getYearOfBirth());
            // System.out.println("Weight in Kilos :" + cats.get(index).getWeightInKilos());
        }else{
            System.out.println("index is not valid");
        }
    }
    
    /**
     * method removeCat
     */
    public void removeCat(int index){
        if(index >= 0 && index < cats.size()){
            cats.remove(index);
        }else{
            System.out.println("index is not valid");
        }
    }
    
    
    /**
     * method displayNamesOfAllCats
     */
    public void displayAllCatNames(){
        for(Cat cat: cats){
            String catName = cat.getName();
            System.out.println(catName);
        }
    }
    
    public static void main(String[] args){
        
        Cat cat1 = new Cat("Ellie",2015,5.5);
        Cat cat2 = new Cat("Mertie",2016,10);
        Cat cat3 = new Cat("Edison", 2014,8);
       Cattery list = new Cattery("Merts cats");
       list.addCat(cat1);
       list.addCat(cat2);
       list.addCat(cat3);
       list.getCat(4);
       list.getCat(2);
       list.displayAllCatNames();
       list.removeCat(4);
       list.removeCat(2);
       list.displayAllCatNames();
       
       
        
    }
}
