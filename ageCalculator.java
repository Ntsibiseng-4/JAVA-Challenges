//Smart Age ageCalculator

import java.util.Scanner;
import java.time.Year;

public class ageCalculator {

    public static int calculateAge(){
        Scanner nal = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int yearBirth = nal.nextInt();

        int currentyear = Year.now().getValue();

        int age = currentyear - yearBirth;
        return age;
    }

    public static void main(String [] args){
        int age = calculateAge();
        System.out.println("You are " + age + " years old!");
    }

}
