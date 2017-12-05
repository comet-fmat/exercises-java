
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        //BEGIN SOLUTION
        System.out.println("How old are you? ");
        int a = Integer.parseInt(reader.nextLine());
        
        if (a<18)
            System.out.println("You have not reached the age of majority yet!");
        else
            System.out.println("You have reached the age of majority!");
        //END SOLUTION
        //STUB:
        //Request age and decide if have a majority  or not
    }
}
