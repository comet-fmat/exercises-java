
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Request words until you enter a word for the second time
        //BEGIN SOLUTION
        ArrayList<String> words = new ArrayList<String>();
        
        String word;
        
        do{
            System.out.println("Type a word: ");
            word = reader.nextLine();
            
                if(words.contains(word)){
                    break;
                } else {
                    words.add(word);
                }
            
        }
        while(!word.equals(""));
        System.out.println("You gave the word "+word+" twice");
        //END SOLUTION
        
        
    }
}
