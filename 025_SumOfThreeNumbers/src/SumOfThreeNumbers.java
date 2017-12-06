
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        //BEGIN SOLUTION
        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        
        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        
        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        //END SOLUTION
        //STUB:
        // Write your program here
        // Use only variables sum and read
        // Use only variables sum and read for request 3 numbers and make sum


        System.out.println("Sum: " + sum);
    }
}
