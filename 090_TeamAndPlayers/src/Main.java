/*
90.1: Class Team
Implement a class Team. At this stage team has only a name (String) and the following functionality:

a constructor that sets the team name
getName, that returns the name

90.2: Player
Create a class Player with the instance variables for the player name and the amount of goals. 
A player should have two constructors: one that initializes the name and an another 
that initializes the name and the amount of goals. Implement also the following methods:

getName, returns the player name
goals, returns the amount of goals
toString, returns a string representation that is formed as
"Player: Brian, goals 0"

90.3: Adding players to a team
Add to the class Team the following methods:

addPlayer, adds a player to the team
printPlayers, prints the players in the team
You should store the players to an instance variable of the type ArrayList<Player> within the class Team.

90.4: The team maximum size and current size
Add to the class Team the methods
setMaxSize(int maxSize), sets the maximum number of players that the team can have
size, returns the number of players in the team
By default the maximum number of players should be set to 16,
and that can be changed with the method setMaxSize.
Change the method addPlayer so that it does not add players to the team 
if the team already has the maximum number of players.

90.5: Goals of a team
Add to the class Team the method

goals, returns the total number of goals for all the players in the team
*/
public class Main {
    public static void main(String[] args) {
        // test your code here

         Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
    }
}
