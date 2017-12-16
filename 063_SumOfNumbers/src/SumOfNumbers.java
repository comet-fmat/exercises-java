import java.util.ArrayList;

public class SumOfNumbers {
    public static int sum(ArrayList<Integer> list) {
        //Make a sum with numbers into list and return result
        // Write your code here
        //BEGIN SOLUTION
        int sum = 0;
        
        for(int i : list){
            sum = sum + i;
        }
        return sum;
        //END SOLUTION
        //STUB: return 0;
    }

    public static void main(String[] args) {
        //check your code here
        
    }

}