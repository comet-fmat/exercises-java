
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        //BEGIN SOLUTION
        
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        if(a>0)
            System.out.println("The number is positive.");
        else
            System.out.println("The number is not positive.");
        //END SOLUTION
        //STUB:
        //Request a number and decid if is positive or negative 
        //(In this case 0 is positive) 
        //Type your program here:
       
    }
}
