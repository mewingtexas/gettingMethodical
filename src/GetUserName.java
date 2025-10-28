import METHODS.SafeInput;

import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        // create a Scanner object to read user input from the console
        Scanner in = new Scanner(System.in);

        // prompt for first and last name using SafeInput method
        String firstName = SafeInput.getNonZeroLenString(in, "Enter your first name: ");
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your last name: ");

        // display the full name
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
