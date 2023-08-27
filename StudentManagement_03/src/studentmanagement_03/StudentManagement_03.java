package studentmanagement_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import student.Student;

public class StudentManagement_03 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Student student = new Student();

        Student[] students = {
            new Student("Robiul ", 25),
            new Student("Faysal ", 26),
            new Student("Limon ", 20),
            new Student("Rajib", 19),};

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\robi.dat");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(students);

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\robi.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student[] newStudents = (Student[]) objectInputStream.readObject();

        System.out.println("Student names and Age list ");
        System.out.println(Arrays.toString(newStudents));

    }

}
