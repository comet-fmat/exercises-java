//BEGIN SOLUTION
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> entries = new ArrayList<Person>();

    public Phonebook() {
        this.entries.clear();
    }
    
    public void add(String name, String number){
        Person buffer = new Person(name, number);
        this.entries.add(buffer);
    }
    
    public void printAll(){
        for(Person i : this.entries){
            i.toString();
        }
    }
    
    public String searchNumber(String name){
        String number="number not known";
        for(Person person: entries){
            if(person.getName().equals(name)){
                number=person.getNumber();
                break;
            }
        }
        return number;
    }
}
//END SOLUTION
