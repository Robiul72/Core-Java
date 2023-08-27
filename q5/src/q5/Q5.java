
package q5;

import java.util.Arrays;

public class Q5 {


    public static void main(String[] args) {
        
                int [] myArray =new int [] {2, 6, 5, 8, 1, 10};
        System.out.println("Ascending "+Arrays.toString(myArray));
        int n ;
        for(int i=0; i<myArray.length; i++){
            for(int j=i; j<myArray.length; j++){
                if(myArray[i] < myArray[j]){    // sing change korle descending
                    n=myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j]=n;
            }
            }
        }
        System.out.println("Ascending number ");
        for(int value : myArray){
            
            System.out.println(value);
        }
        
    }
    
}
