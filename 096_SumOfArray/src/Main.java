/*
Implement the method public static sum(int[] array), 
which returns the sum of the numbers in the array given as parameter.
*/
public class Main {

    public static void main(String[] args) {
        // test method here
        
    }
//BEGIN SOLUTION
    public static int sum(int[] array) {
        // Write code here
        int sum = 0;
        for(int i : array){
            sum +=i;
        }
        
        return sum;
    }
    //END SOLUTION
}
