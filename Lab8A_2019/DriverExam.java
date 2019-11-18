
/**
 * Write a description of class DriverExam here.
 *
 * @author Mert
 * @version 1409
 */
//import java.util.Scanner;

public class DriverExam
{
    //Symbolic constant
    public static final String[] ANSWERS = {"B","D","A","A","C","A","B","A","C","D","B","C","D","A","D","C","C","B","D","A"}; 

    //Fields    
    private String[] givenDriverAnswers;
    private InputReader reader = new InputReader(); // WHY VARIABLE NAME NEEDS TO BE reader?

    public static final int NUMBER_OF_QUESTIONS = ANSWERS.length;

    /**
     * Costructor for DriverExam objects
     */
    public DriverExam(){  

        givenDriverAnswers = new String [NUMBER_OF_QUESTIONS];

    }

    /**
     * method prompStudentAnswers
     * gets input from driver
     */
    public void promptStudentAnswers(){
        // InputReader reader = new InputReader();
        int index = 0;
        while(index < NUMBER_OF_QUESTIONS){
            
            
            System.out.println("Enter a valid answer for question " + (index + 1));

            String answers;
            answers= reader.readString();
            while(!answers.equalsIgnoreCase("A") && !answers.equalsIgnoreCase("B") &&
            !answers.equalsIgnoreCase("C") && !answers.equalsIgnoreCase("D")){
                System.out.println("Enter a valid answer for question " + (index + 1));
                answers = reader.readString();
                
            }
            givenDriverAnswers[index] = answers;
            index++;
        }

    }
    /**
     * method getTotalCorrectAnswers
     * return correctAnswers
     */
    public int getTotalCorrectAnswers(){
        int index = 0;
        int correctAnswers = 0;
        while(index < NUMBER_OF_QUESTIONS){

            if(ANSWERS[ index ].equalsIgnoreCase(givenDriverAnswers[ index ] )){
                correctAnswers = correctAnswers + 1;
            }
            index++;
        }
        return correctAnswers;
    }
    /**
     * method passed
     * returns true if correct answers greater than or equal to passingScore
     */
    public boolean passed(){
        int passingScore = 15;

        if(getTotalCorrectAnswers() >= passingScore){
            return true;
        }
        return false;
    }

    /**
     * method getTotalIncorrectAnswers
     * return incorrectAnswers
     */
    public int getTotalIncorrectAnswers(){
        int incorrectAnswers = 0;
        int index = 0;
        while(index < NUMBER_OF_QUESTIONS ){

            if(!(ANSWERS[ index ].equalsIgnoreCase(givenDriverAnswers[ index ] ))){
                incorrectAnswers = incorrectAnswers + 1;
            }
            index++;
        }
        return incorrectAnswers;
    }

    public static void main(String[] args){
        DriverExam driverTest = new DriverExam();

        driverTest.promptStudentAnswers();

        System.out.println("You got " + driverTest.getTotalCorrectAnswers() + " correct answers and " + driverTest.getTotalIncorrectAnswers() + " incorrect answers");
       
        if(driverTest.passed()){ //why dont we use ==true?
            System.out.println("You passed");
        }else{
            System.out.println("You failed");
        }

    }
}
