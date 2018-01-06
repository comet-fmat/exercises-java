/*
Night sky

Let us implement a program that prints the Night sky. The sky has a star density. 
If the density is e.g. 0.1, roughly 10% of the sky is covered with stars.

Stars print out as *-characters

 100.1: Class NightSky and a star line
Create the class NightSky, that has three object variables: 
density (double), width (int), and height (int). The class should have 3 constructors:

public NightSky(double density) 
creates a NightSky object with the given star density. Width gets the value 20 and height the value 10.
public NightSky(int width, int height) 
creates a NightSky object with the given width and height. Density gets the value 0.1.
public NightSky(double density, int width, int height) 
creates a NightSky-object with the given density, width and height
Add to the class NightSky the method printLine, that prints one line of starts. 
The line length is determined by the value of the instance variable width and 
the instance variable density determines the star probability. 

For each printed character you should use a Random object to decide if it prints out as a white space or a star.
The method nextDouble will probably be of use now.

100.2: Printing the night sky
Add the class NightSky the method print, that prints the night sky of the given size. 
Use the method printLine to print each separate line of the night sky.

100.3: Counting the number of stars
Add the class NightSky an instance variable starsInLastPrint (int) 
and the method starsInLastPrint(), that returns the number of stars printed in the previous night sky


*/
public class Main {

    public static void main(String[] args) {
        // Test your code here
         }
}
