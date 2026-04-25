//Student fee summary

import java.util.Scanner;

public class Challenege3 {
    public static void main(String [] args){

        Scanner nal = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = nal.next();
        System.out.print("Enter the number of modules: ");
        int modules = nal.nextInt();
        System.out.print("Enter cost per module: ");
        int cost = nal.nextInt();
        System.out.print("Enter registration fee: ");
        int registration = nal.nextInt();

        int total = modules * cost;
        int final_cost = total + registration;

        System.out.println(" ");
        System.out.println("===== STUDENT FEE SUMMARY =====");
        System.out.println("Name: " + name);
        System.out.println("NModule: " + modules);
        System.out.println("Cost per module: " + cost);
        System.out.println(" ");

        System.out.println("Tuition Total: " + total);
        System.out.println("Registration fee: " + registration);

        System.out.println(" ");
        System.out.println("Final Amount: " + final_cost);

    }
}
