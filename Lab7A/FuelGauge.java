
/**
 * class FuelGauge 
 *
 * @author Mert 
 * @version 1409
 */
public class FuelGauge
{
    private int amountOfFuelInLitres;

    public static final int MAX_FUEL_IN_LITRES = 15;
    /**
     * First constructor
     */
    public FuelGauge(int amountOfFuelInLitres){
        setAmountOfFuelInLitres(amountOfFuelInLitres);
    }

    /**
     * No args constructor
     */
    public FuelGauge(){
        amountOfFuelInLitres = 0;   
    }

    /**
     * method setAmountOfFuelInLitres
     * @param newAmountOfFuelInLitres
     */
    public void setAmountOfFuelInLitres(int amountOfFuelInLitres){
        if(amountOfFuelInLitres >= 0 && amountOfFuelInLitres <= MAX_FUEL_IN_LITRES){
            this.amountOfFuelInLitres = amountOfFuelInLitres;
        }else{
            throw new IllegalArgumentException("amount of fuel in litres must be between 0 and 15, inclusive");
        }
    }

    /**
     * method getAmountOfFuelInLitres
     * return amountOfFuelInLitres
     */
    public int getAmountOfFuelInLitres(){
        return amountOfFuelInLitres;   
    }

    /**
     * method useFuel
     * 
     */
    public void useFuel(){

        if(amountOfFuelInLitres > 0){
            amountOfFuelInLitres = amountOfFuelInLitres - 1;
        }else{
            System.out.println("the tank is empty fuel cannot go below 0");
        }
    }

    /**
     * method addFuel
     */
    public void addFuel(){

        if(amountOfFuelInLitres < MAX_FUEL_IN_LITRES){
            amountOfFuelInLitres = amountOfFuelInLitres + 1;
        }else{
            System.out.println("tank is full");   
        }

    }

}
