/*
In assignment 78 we used objects of the class BoundedCounter to implement a clock 
in the main method. 
In this assignment we will tranform the clock to an object.

*/
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}
