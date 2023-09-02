package genericmethod01;

import into.Student_Information;

public class GenericMethod01 {

    public static void main(String[] args) {

    Student_Information <Integer, String, Integer> studens = new Student_Information<>(101, "Robiul", 26);
        System.out.println("");
    Student_Information <Integer, String, Integer> studens1 = new Student_Information<>(102, "Faysal", 25);

    System.out.println(studens+" \n"+studens1);
 
    }
}
