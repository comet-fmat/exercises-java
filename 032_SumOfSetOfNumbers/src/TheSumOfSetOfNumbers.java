
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what? ");
        //BEGIN SOLUTION
        int i = 1;
        int sum = 0;
        int num = reader.nextInt();
        
        while (i <= num){
            sum += i;
            i++;
        }
        //END SOLUTION
        //STUB:
        //Requests a number and make a sum with the numbers 
        //from 1 to that number
        System.out.println("Sum is " + sum);

    }
}
