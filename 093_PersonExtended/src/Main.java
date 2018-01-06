/*
93.1: Calculating the age based on the birthday
before Person was extended by adding to it a birthday represented as a MyDate object.
It was noticed that after the addition the instance variable age has no role since
the age could easily be calculated based on the current date and the birthday.
Now implement the method age that calucates and returns the age of the person.
Note: in the previous assignment we added the class MyDate method public int differenceInYears(MyDate compared). 
Copy the method here since it eases this assignment considerably.

93.2: Comparing ages based on birthdate
Add to the class Person the method boolean olderThan(Person compared) w
hich compares the ages of the object for which the method is called and the object given as parameter. 
The method returns true if the object itself is older than the parameter.

93.3: New constructors
Add to the class Person two new constructors:

public Person(String name, MyDate birthday) 
constructor sets the given MyDate-object to be the birthday of the person
public Person(String name) constructor sets the current date 
(i.e., the date when the program is run) to be the birthday of the person
*/
public class Main {
  public static void main(String[] args) {
    // write test code here
  }
}