
import java.util.ArrayList;
import java.util.Scanner;
/*
Note1: Your program should use only one Scanner object, i.e., it is allowed to call new Scanner only once.

Note2: Do not save anything in static variables. The main method is executed by the tests multiple times so the use of static variables might cause problems.

This assignment corresponds to three assignment points.

In this assignment you are supposed to design and implement an observation database for a bird watcher. The database contains birds, each of which have a name and a Latin name, both Strings. Database also tracks how many times each bird has been observed.

The program should implement the following commands:

Add - adds a bird
Observation - adds an observation
Statistics - prints all the birds
Show - prints one bird
Quit - terminates the program
The program should also handle the invalid inputs (see Turing below).
*/
public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
    //BEGIN SOLUTION
         ArrayList<Bird> db = new ArrayList<Bird>();
        
        Scanner reader = new Scanner(System.in);
        
        while (true){
            System.out.println("?");
            String command = reader.nextLine();
            
            if(command.equals("Add")){
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin Name: ");
                String latName = reader.nextLine();
                Bird buffer = new Bird(name, latName);
                db.add(buffer);
                //return;
            }
            
            if (command.equals("Observation")){
                System.out.println("What was observed:?");
                String obs = reader.nextLine();
                
                //if(db.contains(obs))
                    //int i = db.indexOf(obs);
                
                for(Bird i : db){
                    if(i.getName().equals(obs)){
                        i.Observed();
                    } else {
                        System.out.println("Is not a bird!");
                    }
                }
                //return;
            }
            
            if (command.equals("Statistics")){
                for (Bird i : db) {
                    System.out.println(i);
                }
                //return;
            } 
            
            if (command.equals("Show")) {
                System.out.println("What? ");
                String nam = reader.nextLine();
                for(Bird i : db){
                    if(i.getName().equals(nam)){
                        System.out.println(i);
                    }
                }
                //return;
            }
            
            if (command.equals("Quit")){
                break;
            }
        }
        //END SOLUTION
    }

}
