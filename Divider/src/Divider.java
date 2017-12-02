
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //BEGIN SOLUTION
        System.out.println("Type a numer: ");
        double a = Double.parseDouble(reader.nextLine());
        System.out.println("Type another number: ");
        double b = Double.parseDouble(reader.nextLine());
        double result = a/b;
        //END SOLUTION
        //STUN:double result = 0;// Implement your program here. Remember to ask the input from user.
        // Implement your program here for divide two numbers. 
        //Remember to ask the input from user.
        System.out.println("Division: "+a+"/"+b+"="+result);
    }
}
