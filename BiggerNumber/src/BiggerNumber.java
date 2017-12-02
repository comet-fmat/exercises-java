
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //BEGIN SOLUTION
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        
        int result = Math.max(a, b);
        //END SOLUTION
        //STUB: int result=0; 
        // Implement your program here. Remember to ask the input from user
        //Request two number and decide wich is bigger
        
        System.out.println("The bigger number of the two numbers given was: " + result);
    }
}
