
/**
 * Write a description of class Play here.
 *
 * @author Mert
 * @version 1409
 */
import java.util.Random;

public class Play
{
    
    private InputReader reader;
    
    /**
     * Constructor for objects of class Play
     */
    public Play()
    {
        reader = new InputReader();
    }

    
    /**
     * method stringPlay
     */
    public void stringPlay()
    {
        System.out.println("enter string");
        String inputString = reader.readString();
        int index = 0;
        while(index < inputString.length() ){
            
            String firstLetter = inputString.toUpperCase().substring(0, 1);
            String rest = inputString.toLowerCase().substring(1);
            System.out.print(firstLetter + rest + " ");
           
            
            index++;
        }
        
    }
    
    /**
     * method getMultiplicationTable
     */
    public void getMultiplicationTable(){
       System.out.println();
        int number1 = -1;
        int number2 = -1;
        while((number1 > 10 || number1 <=0 || number2 > 10 || number2 <=0 )){
            
            System.out.println("enter a valid first number, between 1 and 10 inclusive");
         number1 = reader.readInt();
        System.out.println("enter a valid second number,between 1 and 10 inclusive");
         number2 = reader.readInt();
            
        }
        
        int rows = number1 + 1;
        int columns = number2 + 1;
        
        int [][] multiplicationTable = new int [rows][columns];
        
        for(int row =0; row < multiplicationTable.length;row++){
            
            for(int column = 0; column <multiplicationTable[row].length; column++){
                System.out.print((multiplicationTable [row] [column] = (row) * (column)) +" " );
                
            }
            System.out.println();
        }
    }
    
    /**
     * method guessTheNumber
     */
     public void guessTheNumber(){

      
      Random rand = new Random();
     
      int randomNumber = rand.nextInt(10) + 1;
      int counter = 0;
     
        System.out.println("guess the number");
      int guessedNumber = reader.readInt();
      counter++;
      System.out.println("number of guesses: " + counter);
     
      while(true){
       if(guessedNumber > randomNumber){
        System.out.println("too high");
        System.out.println("guess the number again");
        guessedNumber = reader.readInt();
       
        counter++;
        System.out.println("number of guesses: " + counter);
       }else if(guessedNumber < randomNumber){
           System.out.println("too low");
           System.out.println("guess the number again");
      guessedNumber = reader.readInt();
     
           counter++;
           System.out.println("number of guesses: " + counter);
       }else{
        System.out.println("bingo");
        break;
       
       }
       }
    }
    
    public static void main(String[] args){
        Play player = new Play();
        player.stringPlay();
        player.getMultiplicationTable();
        player.guessTheNumber();
    }
}
