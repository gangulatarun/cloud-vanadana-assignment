//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create array
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7};

        // Convert array to list for shuffling
        List<Integer> list = Arrays.asList(myArray);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert list back to array
        myArray = list.toArray(new Integer[0]);

        // Print shuffled array
        System.out.println(Arrays.toString(myArray));
    }
}
