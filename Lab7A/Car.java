
/**
 * class Car
 *
 * @author mert
 * @version 1409
 */
public class Car
{
    private String carMake;
    private String carColour;
    private FuelGauge fuelGauge;

    /**
     * First constructor
     */
    public Car(String inputMake, String inputColour, int fuelAmount){
        setCarMake(inputMake);
        setCarColour(inputColour);
        setFuelGauge(new FuelGauge(fuelAmount));
    }

    /**
     *  Second constructor - no args
     */
    public Car(){
        carMake = "unknown";
        carColour = "unknown";
        fuelGauge = new FuelGauge();
    }

    /**
     * method setCarMake
     * @param newCarMake
     */
    public void setCarMake(String newCarMake){
        if(newCarMake != null){
            carMake = newCarMake;
        }else{
            throw new IllegalArgumentException("car make cannot be null");
        }
    }

    /**
     * method setCarColour
     * @param newCarColour
     */
    public void setCarColour(String newCarColour){
        if(newCarColour != null){
            carColour = newCarColour;   
        }else{
            throw new IllegalArgumentException("new colour cannot be null");   
        }
    }

    /**
     * method setFuelGauge
     * @param newFuelGauge
     */
    public void setFuelGauge(FuelGauge newFuelGauge){
        if(newFuelGauge != null){
            fuelGauge=newFuelGauge;
        }else{
            throw new IllegalArgumentException("fuel gauge cannot be null");   
        }
    }

    /**
     * method getCarMake
     * return carMake
     */
    public String getCarMake(){
        return carMake;  
    }

    /**
     * method getCarColour
     * return carColour
     */
    public String getCarColour(){
        return carColour;
    }

    /**
     * method getFuelGauge
     * return fuelGauge
     */
    public FuelGauge getFuelGauge(){
        return fuelGauge;
    }

    /**
     * method drive
     */
    public void drive(){
        fuelGauge.useFuel();
    }

    /**
     * method fillTank
     */
    public void fillTank(){
        fuelGauge.addFuel();
    }
}
