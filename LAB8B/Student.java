
/**
 *class Student
 * @author mert
 * @version 1409
 */
public class Student
{
    private InputReader reader;
    private String studentName;
    private int [] studentMarks;
    public static final int TOTAL_EXAM = 10;
    public static final int MIN_SCORE = 0;
    public static final int MAX_SCORE = 100;
    public static final int PASS_MARK = 50;

    /**
     * Constructor for Student objects
     */
    public Student(String studentName){
        setStudentName(studentName);
        studentMarks = new int[TOTAL_EXAM]; 
    }

    /**
     * methot setStudentName
     *
     * @param  newStudentName
     */
    public void setStudentName(String newStudentName)
    {
        if(newStudentName != null && !newStudentName.equalsIgnoreCase("")){
            studentName = newStudentName;
        }else{
            throw new IllegalArgumentException("name cannot be null or empty");
        }
    }

    /**
     * method getStudentName
     *
     * @return    studentName
     */
    public String getStudentName()
    {
        return studentName;
    }

    /**
     * method promptStudentMarks
     *stores all the marks entered by student
     */
    public void promptStudentMarks()
    {

        InputReader reader = new InputReader();
        int index = 0;
        

        while(index < TOTAL_EXAM){
             int mark;
            System.out.println("Enter mark for exam " + (index + 1));
           
            mark = reader.readInt();

            while(!(mark >= MIN_SCORE && mark <= MAX_SCORE)){
                System.out.println("Enter a valid mark for exam " + (index + 1));
                mark = reader.readInt();

            }
            studentMarks[index] = mark;
            index++;

        }

    }

    /**
     * method calcualteAverageMark
     *
     * 
     * @return    averageMark
     */
    public double calculateAverageMark() // (studentmarks[], numberOfExams)
    {
        int index = 0;
        double averageMark = 0;
        while(index < TOTAL_EXAM){
            averageMark += studentMarks[index]; 
            index++;
        }
        averageMark = averageMark / TOTAL_EXAM;
        return averageMark;
    }

    /**
     * method calculateTotalPassedNumber
     *
     * @return  totalPassedExamNumber
     */
    public int calculateTotalPassedExam()
    {
        int totalPassedExamNumber = 0;
        int index = 0;
        while(index < TOTAL_EXAM){
            if(studentMarks[index] >= PASS_MARK){
                totalPassedExamNumber = totalPassedExamNumber + 1;
            }
            index++;
        }
        return totalPassedExamNumber;
    }

    /**
     * method isPassed
     *
     * @return true if mark is greater than or equal to pass mark
     */
    public boolean isPassed()
    {
        int index = 0;
        while(index < TOTAL_EXAM){
            if(studentMarks[index] >= PASS_MARK){
                return true; 
            }
        }
        return false;
    }

    public static void main(String[] args){

        Student student = new Student("Mert");

        student.promptStudentMarks();
        System.out.println("Student name is :" + student.getStudentName());
        System.out.println("Average mark is :" + student.calculateAverageMark());
        System.out.println("Number of passed exams : " + student.calculateTotalPassedExam());
        if(student.calculateTotalPassedExam() == TOTAL_EXAM){
            System.out.println("You passed all exams");
        }

    }
}
