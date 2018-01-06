
public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
        //BEGIN SOLUTION
        this.cashInRegister = 1000.0;
        //END SOLUTION
    }

    public double payEconomical(double cashGiven) {
        //BEGIN SOLUTION
        if(cashGiven >= 2.50){
            this.cashInRegister += 2.50;
            this.economicalSold++;
            return cashGiven - 2.50;
        } else {
            return cashGiven;
        }
        //END SOLUTION
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        
    }
    
    public double payGourmet(double cashGiven) {
        //BEGIN SOLUTION
        if(cashGiven >= 4.0){
            this.cashInRegister += 4.0;
            this.gourmetSold++;
            return cashGiven - 4.0;
        } else {
            return cashGiven;
        }
        //END SOLUTION
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
    }
    
    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
    /*
    86.3: Paying with card
    */
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        //BEGIN SOLUTION
        if(card.balance()>=2.50){
            this.economicalSold++;
            card.pay(2.50);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        //BEGIN SOLUTION
        if(card.balance()>=4.0){
            this.gourmetSold++;
            card.pay(4.0);
            return true;
        } else {
            return false;
        }
        //END SOLUTION
    }
    /*
    86.4: Loading money
    To complete the assignment, extend the cash register with a method that 
    can be used to load cash to Lyyra Cards. 
    When a certain amount is loaded to the card, 
    the amount stored in the register increases correspondingly. 
    Remember that the amount to be loaded needs to be positive! 
    */
    public void loadMoneyToCard(LyyraCard card, double sum){
        //BEGIN SOLUTION
        if(sum>0){
            card.loadMoney(sum);
            this.cashInRegister +=sum;
        }
        //END SOLUTION
    }
}