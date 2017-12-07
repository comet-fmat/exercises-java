import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //request a name and call method firstCharacter() 
        //and print the result
        //BEGIN SOLUTION
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("First character: " + firstCharacter(name));
        //END SOLUTION
    }
    
    public static char firstCharacter(String text){
        //return the first character in  text
    	//BEGIN SOLUTION
        return text.charAt(0);
        //END SOLUTION
    }
}
