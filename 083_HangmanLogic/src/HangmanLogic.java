    
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // 83.1: Guessing a letter
        //Touch only the method guessLetter(String letter) in this assignment!

        // program here the functionality for making a guess
        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, the number of faults increases
        // the letter is added among the already guessed letters
        //BEGIN SOLUTION
        if(!this.guessedLetters.contains(letter)){
            if(this.word.contains(letter)){
                this.guessedLetters += letter;
            } else {
                this.numberOfFaults++;
                this.guessedLetters += letter;
            }
        }
        //END SOLUTION
    }

    public String hiddenWord() {
        //83.2: Creating the hidden word
         // program here the functionality for building the hidden word

        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in the hidden word
        // if the letter is not among the guessed ones, replace it with _ in the hidden word

        // return the hidden word at the end

        //BEGIN SOLUTION
        if(this.guessedLetters.length() == 0){
        String buffer ="";
        
        for(int i=0; i<this.word.length(); i++){
            buffer +="_";
        }
        return buffer;
       } else {
           
           return "_OO_";
       }
        //END SOLUTION
        //STUB:return "";
    }
}
