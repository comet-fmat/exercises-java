
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Request a number and make sum of powers of 2 until that number
        //BEGIN SOLUTION

        System.out.println("Type a number: ");
        
        int num = reader.nextInt();
        
        int i = 0;
        
        int result = 0;
        
        while (i<=num) {
            result += (int)Math.pow(2, i);
            i++;
        }
        
        System.out.println("The result is " + result);
        //END SOLUTION
    }
}
