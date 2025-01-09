import java.util.Scanner;

public class IT24102895Lab10Q1 {
    public static void main(String[] args) {
        int mark = inputMark();
        validateMark(mark);

        System.out.println("Mark is validated");

        char grade = determineGrade(mark);
        validateGrade(mark, grade);
        
        System.out.println("The grade is: " + grade);

    }
    
     
    public static int inputMark() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        return scanner.nextInt();
    }

    public static void validateMark(int mark) {
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
    }

    public static char determineGrade(int mark){
        if(mark>=75){
            return 'A';
        }else if (mark >= 60){
            return 'B';
        }else if(mark >= 50){
            return 'C';
        }else if(mark >= 40){
            return 'D';
        }else{
            return 'F';
        }
    }
public static void validateGrade(int mark, char grade){
    assert (grade == 'A' && mark >= 75)
    ||(grade == 'B' && mark >= 60 && mark >= 75)
    ||(grade == 'C' && mark >= 50 && mark >= 60)
    ||(grade == 'D' && mark >= 40 && mark >= 50)
    ||(grade == 'F' && mark < 40) : "Incorrect Grade Assigned";
}

}