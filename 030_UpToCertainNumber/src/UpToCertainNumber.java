
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num,i = 1;
        // Write your code here
        //BEGIN SOLUTION
        System.out.println("Up to what number? ");
        num = reader.nextInt();
        
        while (i<=num) {
            System.out.println(i);
            i++;
        }
        //END SOLUTION
        //STUB://Request a numbers
        //and count from 1 to that number(one line for each number)
    
        
    }
}
