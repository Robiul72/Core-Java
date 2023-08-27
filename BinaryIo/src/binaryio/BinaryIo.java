
package binaryio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;
import java.util.Arrays;

public class BinaryIo {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       
         int[] numbers = {10, 20, 30, 40, 50, 60};
        String[] gretings = {"hello", "Java", "Good Night"};
        
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\aaa.dat");
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(numbers);
        objectOutputStream.writeObject(gretings);
        
        
        FileInputStream inputStream = new FileInputStream("C:\\Users\\user\\Desktop\\aaa.dat");
        
        ObjectInputStream object= new ObjectInputStream(inputStream);
        
        int [] newNumbers = (int[]) object.readObject();
        String [] newGretings = (String[]) object.readObject();
        
        System.out.println(Arrays.toString(newNumbers));
        System.out.println(Arrays.toString(newGretings));
        
    }
    
}
