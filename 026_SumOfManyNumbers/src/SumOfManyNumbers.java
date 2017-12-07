
import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //BEGIN SOLUTION
        int sum = 0;
        
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            // do something here
            sum = sum + read;

            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
        //END SOLUTION
        //STUB: 
        //Request a number while is not 0(zero) print current sum value
        // when input is 0(zero) print end sum value
        
    }
}
