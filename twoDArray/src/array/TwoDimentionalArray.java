
package array;


public class TwoDimentionalArray {
    
   
    public int [][] creatArray (int row, int column){

    int [][] myArray = new int[row][column];
    
    for(int ro=0; ro<myArray.length; ro++){
        for(int col=0; col<myArray[ro].length; col++){
        myArray[ro][col]=(int)(Math.random()*100);
         }
    }
        return myArray;
    }
    
    
    
    public int doSum (int [][] myArray){
    
    int total =0;
    for(int row =0; row<myArray.length; row++){
    for(int col =0; col<myArray[row].length; col++){
        total +=myArray[row][col];
    }
    }
    return total;
    }
}
