
package collection_of_student;

import java.util.ArrayList;
import java.util.Iterator;
import pak.Students;


public class Collection_Of_Student {

    public static void main(String[] args) {
       
        ArrayList<Students> students = new ArrayList<Students>();
        
       students.add(new Students(100, " Robiul Islam ", " 01911661138 ", " robiulislam366972@gmail.com"));

     
        
        
        System.out.println(students);
        System.out.println("");

        Iterator<Students> stu =students.iterator();  
        while(stu.hasNext()){
            System.out.println(stu.next());
        }
        
    }
    
}
