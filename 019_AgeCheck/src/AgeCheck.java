
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //BEGIN SOLUTION
        System.out.println("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        
        if (age >=0 && age <= 120)
            System.out.println("OK");
        else
            System.out.println("Impossible!");
        //END SOLUTION
        //STUB: //Ask for age if age is between 0-120 is ok, else is imposible!

    }
}
