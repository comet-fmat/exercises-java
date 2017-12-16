import java.util.ArrayList;

public class LengthsOfStrings {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        //Method receive a world list, calcule numbers of caracter for each word
        //aand return length list for each word
        // write code here
        //BEGIN SOLUTION
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        int num = 0;
        
        for(String i : list){
            num = i.length();
            lengthList.add(num);
        }
        
        return lengthList;
        //END SULUTION
        //STUB: return 0;
    }

    public static void main(String[] args) {
        //check your code here
    }
}