/*
84.1: Multiple constructors
Make a class Counter that holds a number that can be decreased and increased. 
The counter also has an optional check that prevents the counter from going below 0.
The class has to have the following constructors:

public Counter(int startingValue, boolean check)
    creates a new counter with the given value. 
    The check is on if the parameter given to check was true.
public Counter(int startingValue)
    creates a new counter with the given value. 
    The check on the new counter should be off.
public Counter(boolean check) 
    creates a new counter with the starting value 0. 
    The check is on if the parameter given to check was true.
public Counter()
    creates a new counter with the starting value of 0 and with checking off.
and the following methods:

public int value() returns the current value of the counter
public void increase() increases the value of the counter by one
public void decrease() decreases the value of the counter by one, but not below 0 if the check is on

 84.2: Alternative methods
Create also a one parametered versions of the methods increase and decrease:

public void increase(int increaseAmount) 
    increases the value by the amount of the parameter.
    If the value of the parameter is negative, the value will not change.
public void decrease(int decreaseAmount) 
    decreases the value of the counter by the amount given by the parameter, 
    but not below 0 if the check is on. If the value of the parameter is negative, 
    the value of the counter will not change.
*/
//BEGIN SOLUTION
public class Counter {
    private int startingValue;
    private boolean check;
    private int value;
    
    public Counter (int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
        this.value = this.startingValue;
    }
    
    public Counter(int startingValue){
        this.startingValue = startingValue;
        this.check = false;
        this.value = this.startingValue;
    }
    
    public Counter (boolean check) {
        this.check = check;
        this.startingValue = 0;
        this.value = 0;
    }
    
    public Counter(){
        this.startingValue = 0;
        this.check = false;
        this.value = 0;
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(){
        this.value++;
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount>0){
            this.value += increaseAmount;
        }       
    }
    
    public void decrease(){
        if(this.check){
            if(this.value>=1){
                this.value--;
            }
        } else {
            this.value--;
        }   
    }
    
    public void decrease(int decreaseAmount){
        if(decreaseAmount>0){
            if(this.check){
                if(this.value>=decreaseAmount){
                    this.value -= decreaseAmount;
                } else {
                    this.value = 0;
                }
                    
            } else {
                this.value -= decreaseAmount;
            }
        }
    }
    
    
}

//END SOLUTION