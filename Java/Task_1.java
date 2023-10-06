//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7};

        
        List<Integer> list = Arrays.asList(myArray);

        Collections.shuffle(list);

        myArray = list.toArray(new Integer[0]);

        
        System.out.println(Arrays.toString(myArray));
    }
}
