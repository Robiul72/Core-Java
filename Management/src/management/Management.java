
package management;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import stu.Student;

public class Management {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       
        Student student = new Student();
        
        Student [] students = {
        
           new Student ("Faysal ", 25),
           new Student ("Rajib ", 20),
        
        };
        
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\f.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(students);
        
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\f.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        
        Student [] newStudents = (Student[]) objectInputStream.readObject();
        
        System.out.println(Arrays.toString(newStudents));
    }
    
}
