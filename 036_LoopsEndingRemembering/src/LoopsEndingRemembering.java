import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        /*
        Part 1:
        Request a number and exit the program when it is -1
        Part 2:
        Make a sum with all numbers requested (-1 should not be included)
        Part 3:
        Count the total of all the numbers entered (-1 should not be included)
        Part 4:
        Calculate the average of all the numbers entered (-1 should not be included)
        Part 5a:
        Count the total of all  even numbers entered (-1 should not be included)
        Part 5b
        Count the total of all odd numbers entered (-1 should not be included)
        */
        //BEGIN SOLUTION
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        
        int i = 0;
        
        int counter = 0;
        
        int sum = 0;
        
        int even = 0;
        
        int odd = 0;
        
        double average = 0.0;
        
        while (true){
            
            i = reader.nextInt();
            
            if(i == -1){
                break;
            } else {
            
                sum = sum + i;
                counter = counter + 1;
                
                if(i % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
            }
            
        }
        
        //sum++;
        //counter--;
   
        average = (double)sum/counter;
        //END SOLUTION
        //STUB:
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
