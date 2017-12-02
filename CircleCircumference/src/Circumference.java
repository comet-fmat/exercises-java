
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //BEGIN SOLUTION
        System.out.println("Type the radius: ");
        int r = Integer.parseInt(reader.nextLine());
        double result = r * 2 * Math.PI;
        //END SOLUTION
        //STUB:// Program your solution here double result=0;
        //Please ask the user for the radius value 
        //and calculate the circumference
        System.out.println("Circumference of the circle: " + result);
    }
}
