import java.util.Scanner;

public class Palindromi {
    
    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        //can use code in exercise 56
        //BEGIN SOLUTION
        String buffer = "";
        
        for(int i=text.length()-1; i>=0;i--){
            buffer = buffer + text.charAt(i);
        }
        
        return buffer;
        //END SOLUTION
        //STUB: return 0;
    }

    public static boolean palindrome(String text) {
        // method check if text is or not palindrome with help of method reverse
        //BEGIN SOLUTION
        String reversed = reverse(text);
   
        if(text.equals(reversed)){
            return true;
        } else {
            return false;
        }
        //END SOLUTION
        //STUB: return 0;
    }

    public static void main(String[] args) {
        //check your code here
    }
}
