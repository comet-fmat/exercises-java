import java.util.ArrayList;

public class NumberOfItems {

    // implement here the method countItems
    //This method receive a list and return the number of items 
    //BEGIN SOLUTION
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }
    //END SOLUTION

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        // You can remove the comment from below when the method is done
        //System.out.println(countItems(list)); 
    }

}