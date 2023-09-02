package mapset_01;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSet_01 {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Robiul", 26);
        hashMap.put("Faysal", 27);
        hashMap.put("Rabiul", 26);

        System.out.println("Name and Age list : " + hashMap);
        

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
 
        System.out.println("");
        System.out.println("Display enter in ascending order of key ");
        System.out.println("");
        System.out.println(treeMap);

    }

}
