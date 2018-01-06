//BEGIN SOLUTION
public class Student {
    
    private String name;
    private String studentNumber;
    
    
    public Student (String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }
    
    public Student() {
        this.name ="";
        this.studentNumber = "";
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getStudentNumber(){
        return this.studentNumber;
    }
    
    public String toString(){
        return this.name + " (" + this.studentNumber + ")";
    }
    //END SOLUTION
}
