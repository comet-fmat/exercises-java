import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Request words when it is a empty word stop requesting 
        //and print the words entered
        //BEGIN SOLUTION
        ArrayList<String> words = new ArrayList<String>();
        String word;
        
        do{
            System.out.println("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
        while(!word.isEmpty());
        
        System.out.println("You typed the following words:");
        
        for(String test : words){
            System.out.println(test);
        }
        //END SOLUTION
    }
}
