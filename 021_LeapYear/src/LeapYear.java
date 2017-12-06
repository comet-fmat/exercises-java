
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //BEGIN SOLUTION
        System.out.println("Type a year: ");
        float year = Float.parseFloat(reader.nextLine());
        
        if (year % 4 == 0) {
            if(year % 100 != 0 ) {
                System.out.println("The year is a leap year.");
            } else {
                if (year % 400 != 0){
                    System.out.println("The year is not a leap year.");
                } else {
                    System.out.println("The year is a leap year.");
                }
            }
        } else {   
            System.out.println("The year is not a leap year.");
        }
        //END SOLUTION
        //STUB:        //Request one year and to decide if it is leap or not

    }
}
