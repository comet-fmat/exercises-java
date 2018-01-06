/*
Implement the method public static int printElegantly(int[] array), 
which prints the numbers in the array on the same row. 
In the printout all the numbers should be separated with comma and whitespace 
and there should not be a comma trailing the last number.
*/
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        //Example "5, 1, 3, 4, 2"
        //printElegantly(array);
    }
    //BEGIN SOLUTION
    public static void printElegantly(int[] array) {
        // Write code here
        int len = array.length;
        for(int i=0; i<len-1; i++){
            System.out.print(array[i] + ", ");
        }
        
        System.out.print(array[len-1]);
    }
    //END SOLUTION
}
