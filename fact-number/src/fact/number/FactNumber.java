
package fact.number;

import java.util.Arrays;


public class FactNumber {


    public static void main(String[] args) {
        
        int [] m = {2,5,6,7,1};
        System.out.println("Array"+Arrays.toString(m));
        
        for(int i=0; i<m.length; i++){
        for(int j=0; j<m.length-1; j++){
            
            if (m[j] < m[j+1]){
            int temp = m[j+1];
            m[j+1]=m[j];
            m[j]=temp;
            }
        }
        }
        System.out.println("New Array "+ Arrays.toString(m));
    }
    
}
