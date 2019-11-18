
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat
{
    
    private String name;
    private int yearOfBirth;
    private double weightInKilos;
    

    /**
     * Constructor for objects of class Cat
     */
    public Cat(String newName, int newYearOfBirth, double newWeightInKilos)
    {
        setName(newName);
        setYearOfBirth(newYearOfBirth);
        setWeightInKilos(newWeightInKilos);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * method getYearOfBirth
     */
    public int getYearOfBirth(){
     return yearOfBirth;   
    }
    
    /**
     * method getWeightInKilos
     */
    public double getWeightInKilos(){
   return weightInKilos;    
    }
    
    /**
     * method setName
     */
    public void setName(String newName){
        if(newName != null && !newName.isEmpty()){
            name = newName;
        }else{
            throw new IllegalArgumentException("name cannot be null or empty");
        }
    }
    
    /**
     * method setYearOfBirth
     */
    public void setYearOfBirth(int newYearOfBirth){
     if(newYearOfBirth > 0){
         yearOfBirth = newYearOfBirth;
        }else{
            throw new IllegalArgumentException("year must be positive");
        }
        
    }
    
    /**
     * method setWeightInKilos
     */
    public void setWeightInKilos(double newWeightInKilos){
     if(newWeightInKilos > 0){
         weightInKilos = newWeightInKilos;
        }else{
         throw new IllegalArgumentException("weight in kilos must be positive");   
        }
    }
    
    /**
     * method displayDetails
     */
    public void displayDetails(){
        System.out.println("Name :" + getName());
            System.out.println("Year of Birth :" + getYearOfBirth());
            System.out.println("Weight in Kilos :" + getWeightInKilos());
    }
    
}
