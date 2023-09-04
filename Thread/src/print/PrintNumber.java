package print;

public class PrintNumber implements Runnable {
    
    private String name;

    public PrintNumber() {
    }

    public PrintNumber(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <=4; i++) {
            System.out.println(i+" = "+name);
            Thread.yield();
            System.out.println(" ");
        }
    }
    
//    private int lastNum;
//
//    public PrintNumber() {
//    }
//    
//
//    public PrintNumber(int n) {
//        this.lastNum = n;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= lastNum; i++) {
//            System.out.println(" "+i);
//        }
//    }

}
