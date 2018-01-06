import java.util.Random;

public class PasswordRandomizer {
    /*
    The constructor PasswordRandomizer creates a new object,
    which uses the given password length.
    The method createPassword returns a new password, 
    which consists of symbols a-z and is of the length 
    given as a parameter to the constructor
    */
    // Define the variables
    //BEGIN SOLUTION
    private int length;
    private Random random = new Random();
    //END SOLUTION
    public PasswordRandomizer(int length) {
        // Initialize the variable
        //BEGIN SOLUTION
        this.length = length;
        //END SOLUTION
    }

    public String createPassword() {
        // write code that returns a randomized password
        //BEGIN SOLUTION
        String buffer = "";
        
        for(int i=0; i<this.length;i++){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            buffer += symbol;    
        }
        
        
        
        return buffer;
        //END SOLUTION
    }
}
