import java.util.Scanner;
import METHODS.SafeInput;

public class devTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // test part a: getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println(" Hello " + name);

        // test part b: getInt
        int favoriteNumber = SafeInput.getInt(in, "Enter your favorite number");
        System.out.println("Your favorite number is: " + favoriteNumber);

        // test part c: getDouble
        double salary = SafeInput.getDouble(in, "Enter your salary");
        System.out.println("Your salary is: " + salary);

        // test part d: getRangedInt
        int age = SafeInput.getRangedInt(in, "Enter your age", 18, 65);
        System.out.println("Your age is: " + age);

        // test part e: getRangedDouble
        double temperature = SafeInput.getRangedDouble(in, "Enter today's temperature", -50.0, 130.0);
        System.out.println("Your today's temperature is: " + temperature);

        // test part f: getYNconfirm
        boolean proceed = SafeInput.getYNconfirm(in, "Do you want to proceed?");
        System.out.println("User chose to " + (proceed ? "continue" : "exit") + ".");

        // test part g: getRegExString
        String zipCode = SafeInput.getRegExString(in, "Enter your ZIP code (#####)", "\\d{5}");
        System.out.println("ZIP code entered: " + zipCode);
    }
}
