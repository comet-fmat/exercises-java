import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    public static void removeLast(ArrayList<String> list) {
        //remove the last element of list
        //BEGIN SOLUTION
        int i = list.size();
        list.remove(i-1);
        //END SOLUTION
    }

    public static void main(String[] args) {
        // Can check your code here
    }
}