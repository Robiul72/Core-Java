
package stackqueue;

import java.util.Iterator;
import java.util.Stack;
import stu.Student;


public class StackQueue {

    public static void main(String[] args) {
        Stack<Student> list = new Stack<Student>();
        
        list.add(new Student("Robiul", 26, 1001));
        list.add(new Student("Faysal", 27, 1002));
        list.add(new Student("Sabit", 28, 1003));
        
        System.out.println(list);
        
        list.pop();
        
        list.push(new Student("Limon", 29, 1004));
        
        System.out.println("");
        
        Iterator<Student> iterator = list.iterator();
        
        while(iterator.hasNext()){
        
            System.out.println("New Stack : "+iterator.next());
        }
        
    }
    
}
