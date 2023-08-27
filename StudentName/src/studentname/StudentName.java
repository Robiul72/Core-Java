
package studentname;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentName {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       

        File file = new File("C:\\Users\\user\\Desktop\\name.dat");
        
        FileOutputStream write = new FileOutputStream(file);
        for(int i=1; i<=100; i++){
        write.write(i);
        }
        FileInputStream read = new FileInputStream(file);
        for(int i=1; i<=100; i++){
            System.out.println(read.read());
        }
    }
}
