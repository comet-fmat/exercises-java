import java.util.ArrayList;
import java.util.Scanner;
/*
Grade distribution

This assignment corresponds to three assignment points.

Note1: Your program should use only one Scanner object, 
i.e., it is allowed to call new Scanner only once. 
If you need scanner in multiple places, you can pass it as parameter.
If another object needs a scanner, you can pass it as constructor parameter and save in instance variable.

Note2: Do not save anything in static variables. 
The main method is executed by the tests multiple times so the use of static variables might cause problems.

The input of the program is a set of exam scores of a course. 
Each score is an integer.
When -1 is entered, the program stops asking for further input.
After the scores have been read, the program prints the grade distribution and acceptance percentage of the course
Grade distribution is formed as follows:
    *Each exam score is mapped to a grade using the same formula as in exercise 18. 
     If the score is not within the range 0-60 it is not taken into account.
    
    *The number of grades are printed as stars, e.g. 
    if there are 2 scores that correspond to grade 5, the line 5: ** is printed. 
    If there are no scores that correspond to a particular grade, 
    as is the case with grade 4 in the above example, the printed line is 4.

All the grades besides zeros are accepted, so in the above 7 out of 8 participants were accepted. Acceptance percentage is calculated with the formula 100*accepted/allScores.
*/

public class Main {
    public static void main(String[] args) {
        //BEGIN SOLUTION
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
       
        ArrayList<Integer> grades = new ArrayList<Integer>();
        ArrayList<String> stars = new ArrayList<String>();
          
        int buffer = 0;
        int count_1s = 0;
        int count_2s = 0;
        int count_3s = 0;
        int count_4s = 0;
        int count_5s = 0;
        int count_0s = 0;
        
        double accepted = 0.0;
        int sum = 0;
        
        System.out.println("Type the exam scores, -1 completes:");
        
        
        while(buffer != -1){
            buffer = reader.nextInt();
            
            if(buffer >=0 && buffer<=60){
                grades.add(buffer);
            }
        }
        
        System.out.println("Grade distribution:");
        
        for(int a : grades){
            if(a>0 && a<30)
                count_0s++;
            if(a>=30 && a<35)
                count_1s++;               
            if(a>=35 && a<40)
                count_2s++;
            if(a>=40 && a<45)
                count_3s++;
            if(a>=45 && a<50)
                count_4s++;
            if(a>=50 && a<=60)
                count_5s++;
        }
        
        for(int b : grades){
            if(b>=30){
                sum++;
            }
        }
        
        if(count_1s+count_2s+count_3s+count_4s+count_5s > 0)
            accepted = 100*sum/(grades.size());
        
        System.out.print("5: ");
        for(int i=0; i<count_5s; i++){System.out.print("*");}
        System.out.println("");
        System.out.print("4: ");
        for(int i=0; i<count_4s; i++){System.out.print("*");}
        System.out.println("");
        System.out.print("3: ");
        for(int i=0; i<count_3s; i++){System.out.print("*");}
        System.out.println("");
        System.out.print("2: ");
        for(int i=0; i<count_2s; i++){System.out.print("*");}
        System.out.println("");
        System.out.print("1: ");
        for(int i=0; i<count_1s; i++){System.out.print("*");}
        System.out.println("");
        System.out.print("0: ");
        for(int i=0; i<count_0s; i++){System.out.print("*");}
        
        System.out.println("");
        System.out.println("Acceptance percentage: " + accepted);
        //END SOLUTION
        
    }
}
