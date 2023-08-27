package arraytest;

public class ArrayTest {

    public static void main(String[] args) {

        String[] studentNames = new String[5];

        studentNames[0] = "Rajib";
        studentNames[1] = "Limon";
        studentNames[2] = "Robiul";
        studentNames[3] = "Faysal";
        studentNames[4] = "Mamun";

        int[] marks = new int[5];

        marks[0] = 10;
        marks[1] = 30;
        marks[2] = 50;
        marks[3] = 60;
        marks[4] = 80;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student name is " + studentNames [i] + " and mark is " + marks[i]);
        }
    }

}
