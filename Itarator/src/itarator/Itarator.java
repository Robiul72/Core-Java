
package itarator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Itarator {

    public static void main(String[] args) {
        Collection <String> colection = new ArrayList<String>();
        colection.add("Limon");
        colection.add("Rajib");
        colection.add("Mamun");
        colection.add("Robiul");
        
        System.out.println(colection);
        System.out.println(colection.size()+"");
        colection.removeAll(colection);
        
        Iterator<String> iterator = colection.iterator();
       
        while(iterator.hasNext()){
        System.out.println(iterator.next()+"");
        }
      
    }
    
}
