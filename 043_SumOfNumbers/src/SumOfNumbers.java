public class SumOfNumbers {

    public static int sum(int number1, int number2, int number3, int number4) {
        // write your code here
         //Make a sum with the parameters of the function and return the value
    	//BEGIN SOLUTION
        int sum = number1 + number2 + number3 + number4;
        return sum;
        //END SOLUTION
        //STUB: return 0;
    }

    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }
}
