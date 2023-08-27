package maxmin;

public class MainMaxMinNumber {

    public int mainmax(int n) {

        int max = 0;
        int min = 9999999;
        int number = 0;
        for (int i = 1; i > n; i++) {
            if (max < number) {

                max = number;
            }
            if (max > number) {
                min = number;
            }

        }
        return number;
    }

}
