package collectionarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionArray {

    public static void main(String[] args) {

        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("Robiul");
        collection1.add("Rajib");
        collection1.add("Limon");
        collection1.add("Mamun");

        System.out.println(collection1);
        System.out.println("\nSize are in collections now = " + collection1.size() + " ");

        System.out.println("");
        System.out.println("Iterator play and Iterator is a classic design pattern");
        
        // iterator use 
        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "");
        }

        System.out.println("Remove all elements ");
        // removeall use
        collection1.removeAll(collection1);
        System.out.println(collection1);
    }

}
