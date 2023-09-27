import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //variable declarations
        double price = 0;
        System.out.print("Please enter the price of your item here:");
       price = scan.nextDouble();
        if (price >= 100) {
            System.out.println("You have free shipping! Congratulations!");
        }
        else if (price < 100) {
            System.out.println("You do not receive free shipping");
            System.out.println("Your shipping cost is " + price*.02 + ", and your total price is " + price *1.02);
        }

    }
}