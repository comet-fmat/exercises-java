import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SmartCombining {
    
    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2){
        //method combine the first array in second and second in first
        //without repeat any number
        //BEGIN SOLUTION
        list1.addAll(list2);
        
        HashSet hs = new HashSet();
        
        hs.addAll(list1);
        list1.clear();
        list1.addAll(hs);
        //END SOLUTION
    }
    
    public static void main(String[] args) {
        //check your code here
         
    }

}
