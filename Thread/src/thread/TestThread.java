package thread;

import print.PrintNumber;

public class TestThread {

    public static void main(String[] args) {

        PrintNumber pn1 = new PrintNumber("Robiul");
        PrintNumber pn2 = new PrintNumber("Fatema");
        PrintNumber pn3 = new PrintNumber("Sabit");

//        PrintNumber pn1 = new PrintNumber(20);
//        PrintNumber pn2 = new PrintNumber(25);
//        PrintNumber pn3 = new PrintNumber(30);

        Thread n1 = new Thread(pn1);
        Thread n2 = new Thread(pn2);
        Thread n3 = new Thread(pn3);

        n1.start();
        n2.start();
        n3.start();

    }

}
