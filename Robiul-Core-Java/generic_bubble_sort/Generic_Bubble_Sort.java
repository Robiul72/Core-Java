package generic_bubble_sort;

import java.util.Arrays;

public class Generic_Bubble_Sort {

    public static void main(String[] args) {

        int[] array = {6, 1, 3, 4, 2, 5, 10, 11, 9};
        System.out.println("Array " + Arrays.toString(array));
        int temp;
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("New Array list");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
