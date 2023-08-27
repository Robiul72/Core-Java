
package binary;

import bina.Bina;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Binary {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Bina bina = new Bina();
        
        Bina [] students =  {
        new Bina ("Robiul", 26),
        new Bina ("Robiul", 26),
        new Bina ("Robiul", 26),
        };
        
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\bina.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(students);
        
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\bina.dat");
        
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        
        Bina[] newStudents=(Bina[]) objectInputStream.readObject();
        
        System.out.println(Arrays.toString(newStudents));
        
    }
    
}
