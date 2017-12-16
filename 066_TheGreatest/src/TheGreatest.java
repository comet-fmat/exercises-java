import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // return the greatest number into list
        //BEGIN SOLUTION
        int largest = list.get(0);
        
        for(int i : list){
            if(i>largest)
                largest = i;
        }
        return largest;
        //END SOLUTION
        //STUB: return 0
    }

    public static void main(String[] args) {
        //check your code here
    }
}