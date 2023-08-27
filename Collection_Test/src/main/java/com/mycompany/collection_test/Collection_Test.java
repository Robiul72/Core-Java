
package com.mycompany.collection_test;

import java.util.ArrayList;

public class Collection_Test {

    public static void main(String[] args) {
      
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("Toyota");
        cars.add("BMW");
     
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(1));
    }
}
