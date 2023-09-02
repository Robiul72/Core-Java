package bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {5, 3, 1, 4, 2};
        System.out.println("Orginal Array " + Arrays.toString(array));

        int n = array.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] < array[j + 1]) {
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