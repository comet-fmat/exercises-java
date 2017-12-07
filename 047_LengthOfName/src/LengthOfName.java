
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Request a name and
        // call your method from here from print result
        //BEGIN SOLUTION
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        System.out.println("Number of characters: " + calculateCharacters(name));
        //END SOLUTION
    }
    
    // do here the method
    public static int calculateCharacters(String text) {
        //return  lenght of text
        //BEGIN SOLUTION
        int num;
        num = text.length();
        return num;
        //END SOLUTION
    }
    
}
