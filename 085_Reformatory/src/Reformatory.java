public class Reformatory {
    //BEGIN SOLUTION
    private int total = 0;
    //END SOLUTION
    public int weight(Person person) {
        // return the weight of the person
        //BEGIN SOLUTION      
        total++;
        
        return person.getWeight();
        //END SOLUTION
        //STUB:return -1;
    }
    //BEGIN SOLUTION
    public void feed(Person person){
        int buffer = person.getWeight();
        buffer++;
        person.setWeight(buffer);
    }
    
    public int totalWeightsMeasured() {
        return total;
    }
    //END SOLUTION

}
