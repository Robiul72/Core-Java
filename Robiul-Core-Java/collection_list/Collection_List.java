
package collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_List {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("Robiul");
        list.add("Moktadir");
        list.add("Aminul");
        list.add("Jabed");
        list.add("Raihan");
        
        System.out.println(list+" ");
        
        list.remove("Robiul");
        System.out.println(list+" ");
        
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(" "+iterator.next());
        }
    }   
}
