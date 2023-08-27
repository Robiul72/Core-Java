package math;

public class DoMath {

    public String primeNumber(int n) {
//        int number = n;

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            return "Prime number";
        } 
        else {
           return "Not prime number";
        }
    }
}
