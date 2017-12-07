
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //request a first word and request second word
        //print if the second word is found or not inside the first word
        //BEGIN SOLUTION
        System.out.println("Type the first word: ");
        String word1 = reader.nextLine();
        
        System.out.println("Type the second word: ");
        String word2 = reader.nextLine();
        
        if(word1.indexOf(word2) != -1){
            System.out.println("The word '"+word2+"' is found in the word '"+word1+"'.");
        } else {
            System.out.println("The word '"+word2+"' is not found in the word '"+word1+"'.");
        }
        //END SOLUTION
    }
}
