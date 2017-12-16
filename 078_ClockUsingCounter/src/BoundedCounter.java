/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jumpalottahigh
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        //BEGIN SOLUTION
        this.upperLimit = upperLimit;
        this.value = 0;
        //END SOLUTION
        //STUB:
    }
    
    public void next(){
        //BEGIN SOLUTION
        if(this.value<this.upperLimit){
            this.value++;
        } else {
            this.value = 0;
        }
        //END SOLUTION
        //STUB:
    }
    
    public String toString() {
        //BEGIN SOLUTION
        if(this.value<=9){
            return "0"+value;
        } else {
            return ""+value;
        } 
        //END SOLUTION
        //STUB:
    }
    
    public int getValue() {
        //BEGIN SOLUTION
        return this.value;
        //END SOLUTION
        //STUB:
    }
    
    public void setValue(int newValue){
        //BEGIN SOLUTION
        if (newValue>=0 && newValue<=this.upperLimit){
            this.value = newValue;
        }
        //END SOLUTION
        //STUB:
    }
    
    
}
