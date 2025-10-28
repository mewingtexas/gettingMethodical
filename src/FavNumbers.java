import java.util.Scanner;
import METHODS.SafeInput;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);

        // prompt for favorite integer
        int favInt = SafeInput.getInt (in, "Enter your favorite integer");

        // prompt for favorite double
        double favDouble = SafeInput.getDouble(in, "Enter your favorite decimal number");

        // display results
        System.out.println("The favorite integer is: " + favInt);
        System.out.println("The favorite decimal number is: " + favDouble);
    }
}
