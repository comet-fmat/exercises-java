
public class Person {
    private String name;
    private String phone;
    
    //BEGIN SOLUTION
    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    
    public String toString(){
        return this.name + "  number: " + this.phone;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNumber(){
        return this.phone;
    }
    
    public void changeNumber(String newNumber){
        this.phone = newNumber;
    }
    //END SOLUTION
}
