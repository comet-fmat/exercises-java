import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Request a word list until you enter an empty word 
        //and display the list in reverse order
        // create here an ArrayList
        //BEGIN SOLUTION
        ArrayList<String> words = new ArrayList<String>();
        String word;
        
        do{
            System.out.println("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
        while(!word.isEmpty());
        
        Collections.reverse(words);
        
        System.out.println("You typed the following words:");
        
        for(String i : words){
            System.out.println(i);
        }
        //END SOLUTION
    }
}
