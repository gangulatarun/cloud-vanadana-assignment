//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
import java.util.Scanner;

public class RomanToIntegerConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman Numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInteger(romanNumeral);
        
        if (result != -1) {
            System.out.println("Converted to Integer: " + result);
        } else {
            System.out.println("Invalid Roman Numeral.");
        }
    }

    private static int romanToInteger(String s) {
        // Create a mapping of Roman numeral symbols to their integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int result = 0;
        int i = 0;

        for (int j = 0; j < symbols.length; j++) {
            while (s.startsWith(symbols[j], i)) {
                result += values[j];
                i += symbols[j].length();
            }
        }

        // Check if the entire string was processed
        return i == s.length() ? result : -1; // -1 indicates an invalid Roman numeral
    }
}
