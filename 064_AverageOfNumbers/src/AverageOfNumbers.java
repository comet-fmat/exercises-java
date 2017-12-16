
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        //BEGIN SOLUTION
        int sum = 0;
        
        for(int i : list){
            sum = sum + i;
        }
        return sum;
        //END SOLUTION 
        //STUB:  return 0;
    }
    

    public static double average(ArrayList<Integer> list) {
        //Calcule the avarage of numbers into array 
        //remember use method sum
        //BEGIN SOLUTION
        double total = sum(list);
        double average=0.0;
        
        return average = total/list.size();
        //END SOLUTIION
        //STUB: return 0;
    }

    public static void main(String[] args) {
        //check your code here
    }
}