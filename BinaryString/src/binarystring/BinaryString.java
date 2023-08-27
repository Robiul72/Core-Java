package binarystring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryString {
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        String[] gretings = {"hello", "Java", "Good Night"};
        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\hi.dat");
            
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            objectOutputStream.writeObject(numbers);
            objectOutputStream.writeObject(gretings);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryString.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryString.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\hi.dat");
            
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            
            int[] newNumbers = (int[]) objectInputStream.readObject();
            String[] newGretings = (String[]) objectInputStream.readObject();
            
            System.out.println(Arrays.toString(newNumbers));
            System.out.println(Arrays.toString(newGretings));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryString.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryString.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BinaryString.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}
