public class Main {

    public static void main(String[] args) {
        /*
        Your friend has programmed the user interface 
        and also a skeleton for the game logic. 
        Now, she asks you to finish the remaining pieces of the game logic.
        The Finnish show 
        word
        (number of) faults
        message:  you lost and guessed (letters) respectively.
        
        The class Main starts the graphical version of the game. 
        The class TestProgram can be used to test the class HangmanLogic.
        */
        HangmanLogic logic = new HangmanLogic("parameter");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
    }
}
