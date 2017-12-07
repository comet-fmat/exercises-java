
public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) {
        //BEGIN SOLUTION
        int sum;
        
        sum = number1 + number2 + number3 + number4;
        
        return sum;
        //END SOLUTION
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //return avarage value
        //BEGIN SOLUTION
        double average;
        
        average = sum(number1,number2,number3,number4)/4.0;
        
        return average;
        //END SOLUTION
        //STUB return 0;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
