import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        //BEGIN SOLUTION
        int sum = 0;
        
        for(int i : list){
            sum = sum + i;
        }
        return sum;
        //END SOLUTION
        //STUB: return 0;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        //BEGIN SOLUTION
        double total = sum(list);
        double average=0.0;
        
        return average = total/list.size();
        //END SOLUTION
        //STUB: return 0;
    }

    public static double variance(ArrayList<Integer> list) {
        // calcule variance with number in list
        //remember use other methods
        //BEGIN SOLUTION
        double average = average(list);
        double variance_buffer = 0.0;
        double variance_result;
        
        for(int i : list){
            variance_buffer = variance_buffer + Math.pow((i-average), 2);
        }
        
        variance_result = variance_buffer / (list.size()-1);
        
        return variance_result;
        //END SOLUTION
        //STUB: return 0;
    }
    
    public static void main(String[] args) {
        //check your code here
    }

}
