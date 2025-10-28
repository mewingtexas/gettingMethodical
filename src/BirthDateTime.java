import java.util.Scanner;
import METHODS.SafeInput;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // year: 1950-2015
        int year = SafeInput.getRangedInt(in, "Enter the year you were born", 1950, 2015);

        // month: 1-12
        int month = SafeInput.getRangedInt(in, "Enter the month you were born", 1, 12);

        // determine valid day range based on month
        int day = 0;
        switch (month) {
            case 2: // February
                day = SafeInput.getRangedInt(in, "Enter the day of the month you were born", 1, 29);
                break;
                case 4: case 6: case 9: case 11: // apr, jun, sept, nov
                    day = SafeInput.getRangedInt(in, "Enter the day of the month you were born", 1, 30);
                break;
                default: // jan, mar, may, jul, aug, oct, dec
                    day = SafeInput.getRangedInt(in, "Enter the day of the month you were born", 1, 31);
                    break;
        }

        // hour: 1-24
        int hour = SafeInput.getRangedInt(in, "Enter the hour you were born", 1, 24);

        // minute
        int minute = SafeInput.getRangedInt(in, "Enter the minute you were born", 1, 59);

        // display result
        System.out.printf("\nYou were born on %d/%d/%d at %02d:%02d\n", month, day, year, hour, minute);
    }
}
