//Study Performance

import java.util.Scanner;
public class Challenge2 {
    public static void main(String [] args){

        Scanner nal = new Scanner(System.in);

        System.out.print("Enter test 1 score: ");
        int test1 = nal.nextInt();
        System.out.print("Enter test 2 score: ");
        int test2 = nal.nextInt();
        System.out.print("Enter test 3 score: ");
        int test3 = nal.nextInt();

        int total = test1 + test2 + test3;
        int average = total/3;

        String performance;
        if(average >= 75){
            performance = "Excellent";
        }else if(average ==  50 || average < 75){
            performance = "Good";
        }else{
            performance = "Needs Improvement!!";
        }

        System.out.println("Scores: " + test1 + "," + test2 + "," + test3);
        System.out.println("Average: " + average);
        System.out.println("Performance: " + performance);
    }
    
}
