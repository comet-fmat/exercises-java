
public class Main {
    /*
    86.1: The "stupid" Lyyra card
    We will soon program the cash register but let us start by completing the "stupid" version of the Lyyra card.
    The card holds the balance and has only two methods, 
    public void loadMoney(double amount) that is already implemented and
    public boolean pay(double amount) that you should complete according to the instructions into class
    
    86.2: Cash Register and paying with cash
    The skeleton of CashRegister  has the information on how the methods should be implemented.
    */

    public static void main(String[] args) {
        // write test code here
        
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
    }
}

