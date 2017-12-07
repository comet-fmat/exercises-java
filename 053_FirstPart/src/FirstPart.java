
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Request a word and length of the first part
        //and print the substring with thats length
        //BEGIN SOLUTION
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        
        System.out.println("Length of the first part: ");
        int num = reader.nextInt();
        
        System.out.println("Result: "+word.substring(0, num));
    	//END SOLUTION
    }
}
