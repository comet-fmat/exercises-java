import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {
        // method check if a nume
        //BEGIN SOLUTION
        if(list.size()==1){
            return false;
        }
        
        int buffer = 0;
        
        for (int i : list){
            System.out.println(i);
            if(searched == i) {
                buffer++;
                //return true;
            }
        }
        
        if(buffer>=2)
            return true;
        
        return false;
        //END SOLUTION
        //STUB: return 0;
    }

    public static void main(String[] args) {
        //check your code here
    }
}