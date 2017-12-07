
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Request a name and spell like this "1. character: A"
        //with all letters 
        //BEGIN SOLUTION
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
            for (int i=0;i<name.length();i++){
                System.out.println((i+1)+". character: "+name.charAt(i));
            }
        //END SOLUTION
    }
}
