import java.util.Scanner;
import METHODS.SafeInput;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // SSN: ###-##-####
        String SSN = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");

        // UC M Number: M##### / m#####
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M-number (M#####)", "^(M|m)\\d{5}$");

        // menu choice: O, S, V, Q (case-insensitive)
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice [O/S/V/Q]", "^[OoSsVvQq]$");

        // display result
        System.out.println("\nSSN entered: " + SSN);
        System.out.println("\nMenu entered: " + menuChoice);
        System.out.println("\nUC M number entered: " + mNumber);
    }
}
