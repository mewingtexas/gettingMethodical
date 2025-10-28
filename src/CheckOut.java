import java.util.Scanner;
import METHODS.SafeInput;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        double total = 0;
        boolean moreItems = true;

        // loop to collect item prices
        do {
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            total += price;

            moreItems = SafeInput.getYNconfirm(in, "Do you have more items?");
        }  while (moreItems);

        // display total with 2 decimal place
        System.out.printf("\nTotal items: %.2f\n", total);
    }
}
