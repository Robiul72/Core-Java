
package hashmap;

import java.util.Iterator;
import java.util.Map;

public class HashMap {

    public static void main(String[] args) {
        
        Map<String, Integer> hasMap = new java.util.HashMap<>();
        
        hasMap.put("Robiul", 26);
        hasMap.put("Rajib", 25);
        hasMap.put("Faysal", 27);
        hasMap.put("Sabit", 30);
        
        System.out.println(hasMap+" ");
        
        hasMap.remove("Robiul");
        System.out.println(hasMap);
    }
    
}
