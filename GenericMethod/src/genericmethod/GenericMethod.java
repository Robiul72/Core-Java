package genericmethod;

import students.StudentInformation;

public class GenericMethod {

    public static void main(String[] args) {

        StudentInformation<String, Integer, String, String> studens =
        new StudentInformation<String, Integer, String, String>("Robiul Islam", 26, "Aleza Begum", "Bodiuzzaman");

       
       
        studens.information();
        System.out.println("");
        studens.information_1();
    }

}
