import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //request a text and with function show last character
        //BEGIN SOLUTION
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
        //END SOLUTION
    }
    
    public static char lastCharacter(String text){
    	// return the last character of text
    	//BEGIN SOLUTION
        return text.charAt((text.length()-1));
        //END SOLUTION
    }
}
