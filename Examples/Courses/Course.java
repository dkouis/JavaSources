
/**
 * Γράψτε μια περιγραφή της κλάσης Course εδώ.
 * 
 * @author (Το όνομά σας) 
 * @version (Αριθμός έκδοσης ή ημερομηνία εδώ)
 */
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Course {
 
    public String title = null;  //course title
    public int semester = 0; //course semester valid values from 1 to 8, only integers
    public boolean lab = false; //course has a lab also
    public float theoryGrade; //theory grade, valid values from 0 to 10 
    public float labGrade; //lab grade, valid values from 0 to 10 
    public float courseGrade; //final course grade, valid values from 0 to 10, if course has lab 60% theory grade, 40% lab
    float theoryWeight = (float)0.6; //theory 60%
    float labWeight = (float)0.4; //theory 40%
    
    static Scanner userInput = new Scanner(System.in);
      
    public void createCourse(){
        //takes input from console to initialize a course
        
        //title
        System.out.println("> Enter the title of the course: ");
        title = userInput.nextLine();
        
        //semester
        boolean tryAgain = true;
        do {
            try {
                System.out.println("> Enter the semester of the course: 1, 2, 3, 4, 5, 6, 7, 8");
                semester = Integer.parseInt(userInput.nextLine());
                if (semester >= 1 && semester <= 8){
                System.out.println("Valid number of semester !");
                tryAgain = false;
            }
            else if (semester < 1 || semester > 8){
                // exception if semester is out of range
                throw new NumberFormatException("Semester is out of range.");
            }
        }
        catch (NumberFormatException e1) { // Range check
            System.out.println("* The number you entered is not between 1 and 8.  Try again.");
            System.out.println();
        }
        //exception if semester is not integer
       catch (InputMismatchException e2) { // Something other than a number
            System.out.println("* You did not enter an integer.  Try again.");
            System.out.println();
        }
       } while(tryAgain);  
       
       //course has a lab or not
       tryAgain = true;
       String labExists; //temporary variable
       do {
           System.out.println("> Enter if course has a laboratory part: yes, no");
           labExists = userInput.nextLine();
           if (labExists.equals("yes")||labExists.equals("no"))
            {
                tryAgain = false;
            }
            else
            {
                System.out.println("> Invalid answer. Try again !");
            }
        } while(tryAgain); 
       
       //set lab variable
       if (labExists.equals("yes"))
       {
           lab=true;
       }

       //theory grade
       tryAgain = true; 
       do {
            try {
                System.out.println("> Enter the theory grade: 0-10");
                //special method to convert input to float
                theoryGrade = Float.parseFloat(userInput.nextLine());
                if (theoryGrade >= 0 && theoryGrade <= 10){
                System.out.println("Valid grade !");
                tryAgain = false;
            }
            else if (theoryGrade < 0 || theoryGrade > 10){
                throw new NumberFormatException("Theory grade is out of range.");
            }
        }
        catch (NumberFormatException e1) { // Range check
            System.out.println("* The grade you entered is not between 0 and 10.  Try again.");
            System.out.println();
        }
       catch (InputMismatchException e2) { // Something other than a number
            System.out.println("* Invalid value.  Try again.");
            System.out.println();
        }
       } while(tryAgain); 
    
       //lab grade only if lab=true
       if (lab)
       {
	   tryAgain = true; 
           do {
            try {
                System.out.println("> Enter the lab grade: 0-10");
                labGrade = Float.parseFloat(userInput.nextLine());
                if (labGrade >= 0 && labGrade <= 10){
                System.out.println("Valid grade !");
                tryAgain = false;
            }
            else if (labGrade < 0 || labGrade > 10){
                throw new NumberFormatException("Lab grade is out of range.");
            }
         }
         catch (NumberFormatException e1) { // Range check
            System.out.println("* The grade you entered is not between 0 and 10.  Try again.");
            System.out.println();
         }
         catch (InputMismatchException e2) { // Something other than a number
            System.out.println("* Invalid value.  Try again.");
            System.out.println();
         }
         } while(tryAgain);
         //calculate class final grade including lab grade
         courseGrade=theoryWeight*theoryGrade+labWeight*labGrade;
       }
       else
       {
         //calculate class final grade only with theory grade
         courseGrade=theoryGrade;
        }
        System.out.printf("> Course final grade:%.1f \n",courseGrade);
       
    }
    
    public void printCourse(){
        //this is incomplete
        String courseInfo = "---------------------------------"+
			    "\nTitle:............."+title+
			    "\nSemester:.........."+semester+
			    "\nLab:..............."+lab+ 
			    "\nTheory grade:......"+theoryGrade+
			    "\nLab grade:........."+labGrade+
			    "\nCourse grade:......"+courseGrade+
			    "\n--------------------------------";
	System.out.println(courseInfo);				
    }
    public void printCourseFormatted(){
        System.out.printf("---------------------------------%n");
        System.out.printf("Title:.............%S%n",title);
        System.out.printf("---------------------------------%n");
    }
    public void setLabGrade(){
    
    }
    
}