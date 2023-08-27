package factorial;

public class FactorialMath {

    public int fac(int n) {

        int result = 1;

        for (int i = n; i >= 1; i--) {

            result = result * i;
        }
        return (result);

    }
}
