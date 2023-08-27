package fileclass_create;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileClass_Create {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\user\\Desktop\\robi.txt");
        Scanner read = new Scanner(file);

//        PrintWriter pw = new PrintWriter(file);
//        pw.println("Hello Java");
//        pw.close(); 

        if (file.exists()) {
            String tenWords = " ";
            int count = 0;

            while (read.hasNext()) {
//                String word = read.next();
                tenWords += read.next() + " ";
                count++;

                if (count == 10) {
                    System.out.println(tenWords);
                    count = 0;  // next 0 hobe
                    tenWords = " "; // next theke start hobe
                }
            }
        }
        else {
            System.out.println("File is Empy");
        }
        read.close();
    }
}
