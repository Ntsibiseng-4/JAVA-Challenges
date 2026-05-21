import java.util.Scanner;

public class studyAnalyzer {

    public static int calculateAverage(int hours, int subject){
        int average = hours / subject;
        return average;
    }

    public static String performance(int hours, int subject){
        if(hours >= 3){
            return "Strong";
        }else{
            System.out.println("Weak");
            return "Weak";
        }
    }
    public static void main(String [] args){
    Scanner nal = new Scanner(System.in);

    System.out.print("Enter study hours: ");
    int hours = nal.nextInt();

    System.out.print("Enter subjects: ");
    int subject = nal.nextInt();

    int studyHours = calculateAverage(hours, subject);
    System.out.println("Average per subject: " + studyHours);

    String studyPerformance = performance(studyHours, subject);
    System.out.println("Performance: " + studyPerformance);
    }
}
