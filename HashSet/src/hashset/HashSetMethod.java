
package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethod {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("Robiul");
        set.add("Faysal");
        
        System.out.println(set);
       
        for (String se : set) {
            System.out.println(se.toLowerCase());
        }
       
       
    }
    
}
