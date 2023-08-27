
package com.mycompany.student_list;

import java.util.ArrayList;
import java.util.Iterator;
import pak.Student;

public class Student_list {

    public static void main(String[] args) {
       
        ArrayList<Student> cars = new ArrayList<Student>();
        
        cars.add(new Student("Robiul", 101));
        
//        System.out.println(cars);

        Iterator<Student> stu =cars.iterator();    //import korte hobe, and read, iterator use
        
        while(stu.hasNext()){
            System.out.println(stu.next());
        }    
    }
}
