
package hashset;

import java.util.Iterator;
import java.util.Set;

public class HashSet {

    public static void main(String[] args) {
      
        Set<Integer> integers = new java.util.HashSet<>();
        integers.add(25);
        integers.add(26);
        integers.add(20);
        integers.add(25);
        
        System.out.println(integers+" ");
        
        Iterator<Integer> iterator = integers.iterator();
        
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}
