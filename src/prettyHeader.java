import java.util.Scanner;
import METHODS.SafeInput;

public class prettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String msg = SafeInput.getNonZeroLenString(in, "Enter a message for your header");
        SafeInput.prettyHeader(msg);
    }
}
