
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        //STUB:printArrayAsStars(array);
    }
/*
    Implement the method public static printArrayAsStars(int[] array), 
    which prints a line with stars for each number in the array. The line length is determined by the number.
    */
    //BEGIN SOLUTION
    public static void printArrayAsStars(int[] array) {
        // write code here
        
        for (int num : array){
            for(int i=0; i<num; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //END SOLUTION
    }
}
