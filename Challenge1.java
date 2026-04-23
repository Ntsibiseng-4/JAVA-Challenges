//Smart Cost Calculator

import java.util.Scanner;

public class Challenge1 {
    public static void main(String [] args){

        Scanner nal = new Scanner(System.in);
        
        System.out.print("Enter an item: ");
        String item = nal.next();
        System.out.print("Enter a price: ");
        int price = nal.nextInt();
        System.out.print("Enter quality: ");
        int quality = nal.nextInt();

        int subtotal = price * quality;
        double tax = subtotal * 0.15;
        double total = subtotal + tax;
        
        System.out.println("Item: " + item);
        System.out.println("Subtotal: "+ subtotal);
        System.out.println("Tax (15%): "+ tax);
        System.out.println("Total: "+ total);
    }
    
}
