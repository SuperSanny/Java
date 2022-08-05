import java.util.*;

/**
 * ArrayExample
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {1, 2, 3},
            {1, 2, 3, 4, 5},
            {1},
            {1, 2, 3, 4}
        };
        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
        }
    }
}