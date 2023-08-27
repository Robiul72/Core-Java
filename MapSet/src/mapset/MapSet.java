
package mapset;

import java.util.HashMap;
import java.util.Map;

public class MapSet {

    public static void main(String[] args) {
      
        Map<String,Integer> hashMap= new HashMap<>();
        
        hashMap.put("Robiul",100);
        hashMap.put("Faysal",101);
       
        
        System.out.println("Display entries in HashMap");
      
        System.out.println(hashMap+"\n");
        System.out.println( hashMap.isEmpty());
    }
    
}
