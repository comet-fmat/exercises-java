
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        //BEGIN SOLUTION
        int first, last, i = 0;
        System.out.println("First: ");
        first = reader.nextInt();
        
        System.out.println("Last: ");
        last = reader.nextInt();
        
        while (first<=last) {
            if(first<=last){
                System.out.println(first);
                first++;
            } else {
                System.out.println("");
            }
            
        }
        //END SOLUTION
        //STUB:
        //request a first number and a second number
        //and count from first number to a second number
       

    }
}
