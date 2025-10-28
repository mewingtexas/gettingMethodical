public class CtoFtableDisplay {
    public static void main(String[] args) {
        // table header
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("------------------------");

        // loop from -100 to 100
        for (int c = -100; c <= 100; c++) {
            double f = CtoF(c); // convert celsius to Fahrenheit
            System.out.printf("%-10d | %-10f\n", c, f); // print row
        }
    }

    public static double CtoF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}

