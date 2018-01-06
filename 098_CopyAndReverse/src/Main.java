import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
       
        
    }
    /*
    98.1: Copy  
    Implement the method public static int[] copy(int[] array) that creates a copy of the parameter. 
    Tip: since you are supposed to create a copy of the parameter,
    the method should create a new array where the contents of the parameter is copied.
    
    98.2: Reverse copy
    Implement the method public static int[] reverseCopy(int[] array) 
    that creates an array which contains the elements of the parameter but in reversed order. 
    The parameter array must remain the same.
    E.g. if the parameter contains values 5, 6, 7 the method returns a new array that contains the values 7, 6, 5.


    */
    //BEGIN SOLUTION
    public static int[] copy(int[] array){
        int[] copy = new int[array.length];
        for (int i=0; i<array.length; i++){
            copy[i] = array[i];
            //System.arraycopy(array, i, copy, i, array.length);
        }
        
        return copy;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] rev = new int[array.length];
        int j = -1;
        
        for(int i = array.length-1; i>=0; i--){
            j++;
            rev[j] = array[i];
            
        }
        return rev;
    }
    //END SOLUTION
    
}
