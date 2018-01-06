/*
In this assignment we'll make an AI, which guesses the number the player is thinking about. 
The AI assumes that the number is between lowerLimit...upperLimit. 
The start of the game provides these limits to the method as parameters that makes the game happen.
The AI asks the player questions in the format "Is your number greater than X?" and deduce 
the correct answer from the answers the player gives.

The AI keeps track of the search area with the help of the variables lowerLimit and upperLimit. 
The AI always asks if the player's number is greater than the average of these two numbers, 
and based on the answers the search area gets halved each time.
In the end the lowerLimit and upperLimit are the same and the number the user is thinking of has been revealed.

105.1: Is greater than
Implement the method public boolean isGreaterThan(int value), which presents the user with a question:
"Is your number greater than given value? (y/n)"
 The method returns the value true if the user replies "y", otherwise false.

105.2: Average
Implement the method public int average(int firstNumber, int secondNumber), 
which calculates the average of the given values. Notice that Java rounds floating numbers down automatically, 
in our case this is perfectly fine.

105.3: Guessing logic
Write the actual guessing logic in the method play of the class GuessingGame. 
You'll need at least one loop and a query in which you ask the user if their number is greater than
the average of the lowerLimit and upperLimit. 
Change the upperLimit or lowerLimit depending on the user's reply.
Keep doing the loop until lowerLimit and upperLimit are the same! 
You can also test the game with smaller lower- and upperLimit values.
*/
public class Main {
    public static void main(String[] args) {
        // test your program here
        //STUB:GuessingGame game = new GuessingGame();
        //STUB:game.play(1,50);
    }    
}
