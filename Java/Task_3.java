//Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean checkPangram(String sentence) {
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            // Check if the character is an alphabet letter
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }

        // Check if the set size is 26, indicating all letters from A to Z are present
        return uniqueChars.size() == 26;
    }
}
