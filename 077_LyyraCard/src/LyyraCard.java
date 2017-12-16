
public class LyyraCard {
    
    private double balance;
    
    public LyyraCard(double balanceAtStart){
        //BEGIN SOLUTION
        this.balance = balanceAtStart;
        //END SOLUTION
        //STUB:
    }
    
    public String toString(){
        //BEGIN SOLUTION
        return "The card has " +this.balance+ " euros";
        //END SOLUTION
        //STUB: return 0;
    }
    
    public void payEconomical(){
        //BEGIN SOLUTION
        if(this.balance>=2.50)
            this.balance -= 2.50;
        //END SOLUTION
        //STUB:
    }
    
    public void payGourmet(){
        //BEGIN SOLUTION
        if(this.balance>=4.0)
            this.balance -= 4.0;
        //END SOLUTION
        //STUB:
    }
    
    public void loadMoney(double amount){
        //BEGIN SOLUTION
        if(this.balance<150 && amount>0){
            this.balance +=amount;
            if(this.balance>=150){
                this.balance = 150.0;
            }
        }
        //END SOLUTION
        //STUB:
    }
    
}
