import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
   
    
    
    public int age() {
    // calculate the age based on the birthday and the current day
    // you get the current day as follows: 
    // Calendar.getInstance().get(Calendar.DATE);
    // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
    // Calendar.getInstance().get(Calendar.YEAR);
    return 0;
    }
    
    //BEGIN SOLUTION
    public Person(String name, MyDate birthday){
        this.name=name;
        this.birthday=birthday;
    }
    public Person(String name){
        this.name=name;
        int day=Calendar.getInstance().get(Calendar.DATE);
        int month=Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year=Calendar.getInstance().get(Calendar.YEAR);
        this.birthday = new MyDate(day, month, year);

    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return false;
    }
    //END SOLUTION
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
